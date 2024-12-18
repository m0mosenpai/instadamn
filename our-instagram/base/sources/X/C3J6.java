package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3J6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J6 implements C3J5 {
    public SEE A00;

    @Override // X.C3J5
    public final void E69(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll) {
        String str;
        UserSession userSession;
        String str2 = c116155Nu.A10;
        C19U A01 = C11830jh.A04.A01(abstractC12990ll).A01(C19T.A1K);
        String str3 = null;
        if (A01 != null) {
            str = A01.A01;
        } else {
            str = null;
        }
        if (abstractC12990ll instanceof UserSession) {
            userSession = (UserSession) abstractC12990ll;
        } else {
            userSession = null;
        }
        if (str2 != null && str != null && userSession != null && C2FP.A05().A01) {
            ArrayList A02 = AKP.A01().A02(C58883QEt.class);
            C58883QEt c58883QEt = (C58883QEt) AbstractC001800i.A0J(A02);
            if (c58883QEt != null) {
                str3 = c58883QEt.A0Y.A00.A09.A05;
            }
            String A00 = new C49352Or(userSession.userId).A00();
            SEE see = new SEE(AbstractC12220kQ.A02(abstractC12990ll));
            this.A00 = see;
            String str4 = c116155Nu.A12;
            C2O0.A00 = see.A01;
            C2OZ.A00(C2O5.A05);
            C18920wW c18920wW = (C18920wW) see.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "client_add_autofilltemptorealproof_init");
            if (A002.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                if (str4 != null) {
                    c0Zx.A06(AbstractC111324zv.A00(4963), str4);
                }
                if (str3 != null) {
                    c0Zx.A06("iab_session_id", str3);
                }
                c0Zx.A06(AbstractC111324zv.A00(925), str);
                A002.AAQ(c0Zx, AbstractC43591JPw.A00(360));
                A002.AAP(AbstractC31189DnY.A03(21, 10, 42), C2O0.A00);
                A002.AAP("product_type", AbstractC49212Oa.A00);
                A002.AAP("platform", "android");
                A002.A9K(AbstractC43591JPw.A00(290), Long.valueOf(System.currentTimeMillis()));
                A002.Cht();
            }
            AbstractC23641Du.A05(AnonymousClass191.A00, new C64950TaT(this, A02, A00, str, str2, null, 0), AnonymousClass194.A02(C12L.A00.A04));
        }
    }

    @Override // X.C3J5
    public final boolean CTo(AbstractC12990ll abstractC12990ll) {
        return C18U.A06(C06090Tz.A05, abstractC12990ll, 36310426619543654L);
    }
}
