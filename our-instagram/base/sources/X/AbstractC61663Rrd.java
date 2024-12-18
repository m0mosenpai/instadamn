package X;

/* renamed from: X.Rrd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61663Rrd {
    public static final Object A00(C6FW c6fw) {
        boolean A01 = C6DZ.A01(c6fw.A03(0));
        AbstractC61593RqH abstractC61593RqH = AbstractC62357S8e.A00;
        if (abstractC61593RqH != null) {
            QJl qJl = (QJl) abstractC61593RqH;
            InterfaceC16660sJ interfaceC16660sJ = qJl.A04;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(Boolean.valueOf(A01));
            }
            AbstractC63399SjU abstractC63399SjU = qJl.A01;
            if (abstractC63399SjU != null) {
                String str = qJl.A0B;
                if (str == null) {
                    str = "";
                }
                String str2 = qJl.A0A;
                long j = qJl.A06;
                String str3 = qJl.A03;
                String str4 = qJl.A09;
                String A1B = AnonymousClass001.A1B("{\"should_continue_checkout\":\"", "\"}", A01);
                String str5 = qJl.A02;
                AbstractC25233BEq.A0w(1, str2, str3, str4);
                C14360o3.A0B(A1B, 6);
                InterfaceC02590Ai A00 = AbstractC63399SjU.A00(abstractC63399SjU);
                if (A00.isSampled()) {
                    A00.AAP(AbstractC63082Sc5.A00(), str2);
                    AbstractC58321PtD.A1E(AbstractC63399SjU.A01(abstractC63399SjU), A00);
                    C0Zx c0Zx = new C0Zx();
                    AbstractC63399SjU.A09(c0Zx, abstractC63399SjU, "continue_checkout_callback");
                    AbstractC58322PtE.A1H(A00, c0Zx, AbstractC25232BEp.A1F("csp_version", "2024-10", AbstractC166987dD.A1L("shopify_sdk_payload", A1B), AbstractC63399SjU.A06(str3)));
                    C0Zx c0Zx2 = new C0Zx();
                    AbstractC63399SjU.A0B(c0Zx2, str5, str, j);
                    AbstractC63399SjU.A07(A00, c0Zx2, abstractC63399SjU, str, str4);
                    A00.Cht();
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
