package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class CTH {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public /* synthetic */ CTH(Context context, float f, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        boolean A02 = AbstractC13620mo.A02(context);
        this.A0A = z;
        this.A09 = z2;
        this.A0B = z3;
        this.A00 = f;
        this.A08 = i;
        this.A04 = i2;
        this.A06 = i3;
        this.A05 = i4;
        this.A01 = i5;
        int i6 = A02 ? 15 : 1;
        this.A03 = i6;
        this.A07 = A02 ? i6 - 10 : 10;
        this.A02 = A02 ? 1 : 14;
    }
}
