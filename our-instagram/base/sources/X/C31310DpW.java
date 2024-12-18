package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DpW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31310DpW {
    public final C18920wW A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(C31310DpW c31310DpW, C2EC c2ec, String str) {
        EnumC72433Xdd enumC72433Xdd;
        long j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31310DpW.A00, "mci_recipient_unsend_nux");
        if (A0f.isSampled()) {
            String A09 = C4GQ.A09(c2ec);
            AbstractC31171DnF.A1C(A0f, str);
            String C7I = c2ec.C7I();
            C7I.getClass();
            AbstractC31171DnF.A1F(A0f, C7I);
            if (c2ec.CVQ()) {
                enumC72433Xdd = EnumC72433Xdd.A05;
            } else {
                enumC72433Xdd = EnumC72433Xdd.A06;
            }
            A0f.A8R(enumC72433Xdd, "thread_type");
            if (A09 != null) {
                j = Long.parseLong(A09);
            } else {
                j = -1;
            }
            A0f.A9K(AbstractC43591JPw.A00(52), Long.valueOf(j));
            boolean CX1 = c2ec.CX1();
            if (CX1 != -2147483648) {
                AbstractC166997dE.A1N(A0f, "responsible_user_type", CX1 ? 1 : 0);
            } else {
                A0f.AAP("responsible_user_type", null);
            }
            A0f.Cht();
        }
    }

    public C31310DpW(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
