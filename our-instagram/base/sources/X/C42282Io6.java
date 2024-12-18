package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Io6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42282Io6 implements InterfaceC12870lZ {
    public final /* synthetic */ C59952od A00;

    public C42282Io6(C59952od c59952od) {
        this.A00 = c59952od;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        Long l;
        int A03 = C0f9.A03(-1159546937);
        C59952od c59952od = this.A00;
        C120985dq A00 = C37624GhJ.A00(c59952od);
        if (A00 != null) {
            if (A00.CdW() && A00.A06().A0t) {
                l = AbstractC25228BEl.A13(AbstractC25226BEj.A1E(A00));
            } else {
                l = null;
            }
            C37540Gfw c37540Gfw = c59952od.A09;
            if (c37540Gfw != null) {
                C37522Gfe c37522Gfe = c37540Gfw.A19;
                UserSession A01 = C59952od.A01(c59952od);
                C38321qM c38321qM = A00.A02;
                C37540Gfw c37540Gfw2 = c59952od.A09;
                if (c37540Gfw2 != null) {
                    C37604Ggz c37604Ggz = c37540Gfw2.A1D;
                    String str = c37540Gfw2.A1E.A00;
                    int A012 = c59952od.A0O().A01();
                    C37540Gfw c37540Gfw3 = c59952od.A09;
                    if (c37540Gfw3 != null) {
                        AbstractC37670Gi3.A0i(A01, c38321qM, c37522Gfe, c37604Ggz, l, "app_background", str, null, A012, c37540Gfw3.A0u.BmI(A00));
                    }
                }
            }
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        C218914p.A06(this);
        C0f9.A0A(234187215, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-108398545, C0f9.A03(1476105372));
    }
}
