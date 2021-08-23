package com.github.cdominguess.cidadesapi.service;

public enum RaioDaTerra {
  METERS("m", 6378168),
  KILOMETERS("km", 6378.168f),
  MILES("mi", 3958.747716f);

  private final String unit;
  private final float value;

  RaioDaTerra(final String unit, final float value) {
    this.unit = unit;
    this.value = value;
  }

  public float getValue() {
    return value;
  }

  public String getUnit() {
    return unit;
  }
}
