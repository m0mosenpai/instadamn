package X;

/* renamed from: X.Rrg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61666Rrg {
    public static final Object A00() {
        AbstractC61593RqH abstractC61593RqH = AbstractC62357S8e.A00;
        if (abstractC61593RqH != null) {
            QJl qJl = (QJl) abstractC61593RqH;
            AbstractC63399SjU abstractC63399SjU = qJl.A01;
            if (abstractC63399SjU != null) {
                String str = qJl.A0B;
                if (str == null) {
                    str = "";
                }
                String str2 = qJl.A0A;
                String str3 = qJl.A03;
                String str4 = qJl.A09;
                AbstractC167027dH.A13(str2, str3, str4);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(abstractC63399SjU.A0C(), "client_redirect_optout_success");
                if (A0f.isSampled()) {
                    A0f.AAP(AbstractC63082Sc5.A00(), str2);
                    AbstractC58321PtD.A1E(C2O5.A0G, A0f);
                    C0Zx c0Zx = new C0Zx();
                    AbstractC63399SjU.A09(c0Zx, abstractC63399SjU, AbstractC63399SjU.A02(abstractC63399SjU));
                    AbstractC58322PtE.A1H(A0f, c0Zx, AbstractC25233BEq.A0p("checkout_url", str3, AbstractC166987dD.A1L("csp_version", "2024-10")));
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A06("commerce_checkout_session_id", str2);
                    QER qer = (QER) abstractC63399SjU;
                    AbstractC63399SjU.A08(c0Zx2, qer);
                    AbstractC63399SjU.A0A(c0Zx2, abstractC63399SjU, qer.A01, str);
                    c0Zx2.A06("iaw_session_id", str);
                    c0Zx2.A05("ad_id", AbstractC25228BEl.A13(str4));
                    A0f.AAQ(c0Zx2, "custom_fields");
                    A0f.Cht();
                }
            }
            qJl.A05 = true;
            return null;
        }
        return null;
    }
}
