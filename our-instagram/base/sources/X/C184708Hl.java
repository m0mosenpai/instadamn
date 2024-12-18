package X;

import android.view.View;

/* renamed from: X.8Hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184708Hl {
    public InterfaceC184728Hn A00;
    public C8QQ A01;
    public boolean A02 = true;
    public final View A03;

    public C184708Hl(View view) {
        this.A03 = view;
    }

    public final void A00() {
        C3P9 c3p9 = new C3P9(this.A03);
        c3p9.A06 = this.A02;
        c3p9.A04 = new C3PD() { // from class: X.8Ho
            @Override // X.C3PD, X.C3PE
            public final void DQY(View view) {
                C8QQ c8qq = C184708Hl.this.A01;
                if (c8qq != null) {
                    c8qq.DQR();
                }
            }

            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                InterfaceC184728Hn interfaceC184728Hn = C184708Hl.this.A00;
                if (interfaceC184728Hn != null && interfaceC184728Hn.D3S()) {
                    return true;
                }
                return false;
            }
        };
        c3p9.A00();
    }
}
