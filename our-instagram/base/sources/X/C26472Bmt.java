package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Bmt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26472Bmt extends AbstractC51572Yf {
    public final Drawable A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16660sJ A03;
    public final long A05;
    public final C51722Yv A06;
    public final boolean A04 = true;
    public final int A00 = 200;

    public C26472Bmt(Drawable drawable, C51722Yv c51722Yv, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, long j) {
        this.A01 = drawable;
        this.A05 = j;
        this.A02 = interfaceC16820sZ;
        this.A06 = c51722Yv;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        long j = this.A05;
        C75933ay c75933ay = C51722Yv.A02;
        C26365BlA c26365BlA = new C26365BlA(c75933ay.A00(this.A06), C29905DGt.A01(this, 8), j);
        if (this.A02 != null) {
            return new C26555BoE(c26365BlA, c75933ay, new C29472Cym(C05F.A01, C05F.A00, C05F.A0C), C29905DGt.A01(this, 7), null);
        }
        return c26365BlA;
    }
}
