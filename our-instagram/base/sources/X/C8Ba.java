package X;

import android.graphics.Bitmap;

/* renamed from: X.8Ba, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Ba extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bitmap.Config A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;
    public final InterfaceC16620sF A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8Ba) {
                C8Ba c8Ba = (C8Ba) obj;
                if (this.A02 != c8Ba.A02 || this.A01 != c8Ba.A01 || !C14360o3.A0K(this.A05, c8Ba.A05) || !C14360o3.A0K(this.A07, c8Ba.A07) || !C14360o3.A0K(this.A04, c8Ba.A04) || this.A03 != c8Ba.A03 || this.A00 != c8Ba.A00 || !C14360o3.A0K(this.A06, c8Ba.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((this.A02 * 31) + this.A01) * 31) + this.A05.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A06.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitmapGeneratorParams(targetWidth=");
        sb.append(this.A02);
        sb.append(MSV.A00(642));
        sb.append(this.A01);
        sb.append(", calculateThumbnailCount=");
        sb.append(this.A05);
        sb.append(", calculateFrameTimeMs=");
        sb.append(this.A07);
        sb.append(", _segmentBitmapId=");
        sb.append(this.A04);
        sb.append(", bitmapConfig=");
        sb.append(this.A03);
        sb.append(", maxBytesPerBitmap=");
        sb.append(this.A00);
        sb.append(", generateSize=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }

    public C8Ba(Bitmap.Config config, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A05 = interfaceC16660sJ;
        this.A07 = interfaceC16620sF;
        this.A04 = interfaceC16660sJ2;
        this.A03 = config;
        this.A00 = i3;
        this.A06 = interfaceC16660sJ3;
    }
}
