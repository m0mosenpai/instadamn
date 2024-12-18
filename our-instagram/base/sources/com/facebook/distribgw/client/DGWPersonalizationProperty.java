package com.facebook.distribgw.client;

/* loaded from: classes.dex */
public class DGWPersonalizationProperty {
    public final int DEFAULT;
    public final int HIGH;
    public final int LOW;
    public final int MID;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("HIGH:");
        sb.append(this.HIGH);
        sb.append(",MID:");
        sb.append(this.MID);
        sb.append(",LOW:");
        sb.append(this.LOW);
        sb.append(",DEFAULT:");
        sb.append(this.DEFAULT);
        sb.append("}");
        return sb.toString();
    }

    public DGWPersonalizationProperty(int i, int i2, int i3, int i4) {
        this.HIGH = i;
        this.MID = i2;
        this.LOW = i3;
        this.DEFAULT = i4;
    }
}
