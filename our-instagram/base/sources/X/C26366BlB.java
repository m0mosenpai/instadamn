package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.BlB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26366BlB extends AbstractC51572Yf {
    public final CWI A00;
    public final InterfaceC16660sJ A01;
    public final C0UO A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C28279CdO c28279CdO = (C28279CdO) AbstractC25525BQn.A00(c76223bS, this.A02);
        Drawable drawable = c28279CdO.A01;
        boolean z = c28279CdO.A0A;
        AbstractC77313dH.A00(c76223bS, new D8K(1, drawable, this), new Object[]{drawable});
        return new C26335Bkg(c28279CdO.A07, new C29708D8b(4, c28279CdO, c76223bS, this, z));
    }

    public C26366BlB(CWI cwi, InterfaceC16660sJ interfaceC16660sJ, C0UO c0uo) {
        AbstractC167017dG.A1P(c0uo, interfaceC16660sJ);
        this.A02 = c0uo;
        this.A01 = interfaceC16660sJ;
        this.A00 = cwi;
    }
}
