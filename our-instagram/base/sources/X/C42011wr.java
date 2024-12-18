package X;

import java.io.Serializable;

/* renamed from: X.1wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42011wr implements Serializable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WifiMinLowWaterMarkMs=");
        sb.append(this.A07);
        sb.append(",WifiMaxLowWaterMarkMs=");
        sb.append(this.A06);
        sb.append(",WifiLowWaterMarkMultiplier=");
        sb.append(this.A01);
        sb.append(",WifiHighWaterMarkDeltaMs=");
        sb.append(this.A05);
        sb.append(",CellMinLowWaterMarkMs=");
        sb.append(this.A04);
        sb.append(",CellMaxLowWaterMarkMs=");
        sb.append(this.A03);
        sb.append(",CellLowWaterMarkMultiplier=");
        sb.append(this.A00);
        sb.append(",CellHighWaterMarkDeltaMs=");
        sb.append(this.A02);
        sb.append(",WaterMarkLowMultipler=");
        sb.append(0.0f);
        sb.append(",WaterMarkHighMultipler=");
        sb.append(0.0f);
        return sb.toString();
    }

    public C42011wr(float f, float f2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A07 = i;
        this.A06 = i2;
        this.A01 = f;
        this.A05 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A00 = f2;
        this.A02 = i6;
    }
}
