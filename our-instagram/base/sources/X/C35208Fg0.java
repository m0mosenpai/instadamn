package X;

/* renamed from: X.Fg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35208Fg0 {
    public static C35208Fg0 A03;
    public static final C34661FOu A04 = new Object();
    public Integer A00;
    public String A01;
    public String A02;

    public final void A02(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Integer num, Integer num2, String str) {
        C14360o3.A0B(num2, 4);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "instagram_gdpr_consent_flow_actions");
        if (A0f.isSampled()) {
            String str2 = this.A02;
            if (str2 != null) {
                A0f.AAP(AbstractC31187DnW.A00(), str2);
                Integer num3 = this.A00;
                if (num3 != null) {
                    A0f.AAP("user_state", FVT.A01(num3));
                    AbstractC31171DnF.A1C(A0f, AbstractC34222F7u.A00(num));
                    if (num != C05F.A0C) {
                        str = null;
                    }
                    A0f.AAP("click_point", str);
                    A0f.AAP("email", null);
                    A0f.AAP("guid", C35154Few.A00().A04 == C05F.A00 ? AbstractC31174DnI.A0s() : null);
                    AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                    A0f.AAP("stage", AbstractC34221F7t.A00(num2));
                    A0f.AAP("waterfall_id", C35154Few.A01());
                    A0f.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public final synchronized void A03(String str, Integer num) {
        C34661FOu c34661FOu = A04;
        c34661FOu.A00();
        c34661FOu.A00().A01 = str;
        c34661FOu.A00().A00 = num;
        c34661FOu.A00().A02 = AbstractC166997dE.A0n();
    }

    public static final synchronized C35208Fg0 A00() {
        C35208Fg0 A00;
        synchronized (C35208Fg0.class) {
            A00 = A04.A00();
        }
        return A00;
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C35208Fg0 c35208Fg0, Integer num, Integer num2) {
        String str;
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "instagram_gdpr_consent_flow_view");
        if (A0f.isSampled()) {
            String str3 = c35208Fg0.A02;
            if (str3 != null) {
                A0f.AAP(AbstractC31187DnW.A00(), str3);
                A0f.AAP("stage", AbstractC34221F7t.A00(num));
                Integer num3 = c35208Fg0.A00;
                if (num3 != null) {
                    A0f.AAP("user_state", FVT.A01(num3));
                    if (num2 != null) {
                        str = AbstractC34222F7u.A00(num2);
                    } else {
                        str = null;
                    }
                    AbstractC31171DnF.A1C(A0f, str);
                    if (C35154Few.A00().A04 == C05F.A00) {
                        str2 = AbstractC31174DnI.A0s();
                    } else {
                        str2 = null;
                    }
                    A0f.AAP("guid", str2);
                    AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                    A0f.AAP("waterfall_id", C35154Few.A01());
                    A0f.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
