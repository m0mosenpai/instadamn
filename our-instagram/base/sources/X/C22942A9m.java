package X;

import android.content.Context;

/* renamed from: X.A9m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22942A9m {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public C210649Te A04;
    public final /* synthetic */ C22995ABu A05;

    public C22942A9m(C22995ABu c22995ABu, float f, float f2, int i, int i2, int i3) {
        this.A05 = c22995ABu;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = i2;
        Context context = c22995ABu.A04;
        int i4 = c22995ABu.A02;
        boolean z = c22995ABu.A0A;
        C210649Te c210649Te = new C210649Te(context);
        c210649Te.A00 = i4;
        c210649Te.A01 = z;
        if (i3 != 0) {
            AbstractC166997dE.A18(context, c210649Te, i3);
            AbstractC56952jT.A01(c210649Te);
        }
        this.A04 = c210649Te;
        ViewOnClickListenerC23248ASj.A00(c210649Te, 6, c22995ABu, this);
    }
}
