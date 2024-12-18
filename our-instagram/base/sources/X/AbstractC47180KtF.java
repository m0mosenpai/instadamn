package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KtF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47180KtF {
    public static boolean A00;

    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, Integer num, boolean z, boolean z2) {
        EnumC39589Hdz enumC39589Hdz;
        EnumC39589Hdz enumC39589Hdz2;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, abstractC59962oe);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        Context requireContext = abstractC59962oe.requireContext();
        if (!z) {
            InterfaceC19630xq interfaceC19630xq = A002.A01;
            int i = interfaceC19630xq.getInt("hidden_word_upsell_toast_shown_count", 0);
            if (!AbstractC166997dE.A0Y(userSession).A2F() && !A00 && i < 3 && C18U.A06(C06090Tz.A05, userSession, 36314060157028747L)) {
                A00 = A1R;
                AbstractC167007dF.A18(interfaceC19630xq, "hidden_word_upsell_toast_shown_count", interfaceC19630xq.getInt("hidden_word_upsell_toast_shown_count", 0) + 1);
                String A0p = AbstractC166997dE.A0p(requireContext, 2131963516);
                C36516G8o c36516G8o = new C36516G8o(2, requireContext, abstractC59962oe, userSession);
                C146106i8 A0X = AbstractC31173DnH.A0X(A0p);
                AbstractC31175DnJ.A0l(requireContext, A0X, 2131973188);
                A0X.A06();
                A0X.A0A(c36516G8o);
                A0X.A0L = true;
                AbstractC25233BEq.A1F(A0X);
                return;
            }
        }
        C006802i.A0p.markerEnd(190449529, (short) 4);
        InterfaceC37071o5 A003 = C37091o7.A00();
        Integer num2 = C05F.A00;
        if (num == num2) {
            enumC39589Hdz = EnumC39589Hdz.A0M;
        } else if (num == C05F.A01) {
            enumC39589Hdz = EnumC39589Hdz.A0G;
        } else if (num == C05F.A0C) {
            if (z2) {
                enumC39589Hdz = EnumC39589Hdz.A04;
            } else {
                enumC39589Hdz = EnumC39589Hdz.A0N;
            }
        } else {
            enumC39589Hdz = EnumC39589Hdz.A0T;
        }
        if (!A003.EjT(userSession, enumC39589Hdz)) {
            return;
        }
        InterfaceC37071o5 A004 = C37091o7.A00();
        Context requireContext2 = abstractC59962oe.requireContext();
        C19270xB A0D = AbstractC31171DnF.A0D("direct_message");
        if (num == num2) {
            enumC39589Hdz2 = EnumC39589Hdz.A0M;
        } else if (num == C05F.A01) {
            enumC39589Hdz2 = EnumC39589Hdz.A0G;
        } else if (num == C05F.A0C) {
            if (z2) {
                enumC39589Hdz2 = EnumC39589Hdz.A04;
            } else {
                enumC39589Hdz2 = EnumC39589Hdz.A0N;
            }
        } else {
            enumC39589Hdz2 = EnumC39589Hdz.A0T;
        }
        A004.Coi(requireContext2, A0D, userSession, enumC39589Hdz2);
    }
}
