package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LKC {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16610sE A05;

    public LKC(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16660sJ interfaceC16660sJ5, InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        AbstractC25234BEr.A1R(interfaceC16660sJ2, interfaceC16610sE, interfaceC16660sJ3, interfaceC16660sJ4, interfaceC16660sJ5);
        this.A00 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        this.A05 = interfaceC16610sE;
        this.A01 = interfaceC16660sJ3;
        this.A03 = interfaceC16660sJ4;
        this.A04 = interfaceC16660sJ5;
    }

    public static final void A01(UserSession userSession, LKC lkc, C43718JVd c43718JVd, String str, String str2) {
        lkc.A05.invoke(userSession, String.valueOf(c43718JVd.A01.A03), new C30226DTf(lkc, c43718JVd.A02, c43718JVd, str2, str, 0));
    }

    public final void A03(UserSession userSession, C43718JVd c43718JVd, String str) {
        C14360o3.A0B(str, 1);
        JQO jqo = c43718JVd.A01;
        JQX.A00(String.valueOf(jqo.A03)).DW4(c43718JVd.A00, -1, str);
        if (jqo.A0Q) {
            A01(userSession, this, c43718JVd, str, AbstractC111324zv.A00(286));
            A02(userSession, c43718JVd, str);
        }
    }

    public final void A04(UserSession userSession, C43718JVd c43718JVd, String str) {
        C14360o3.A0B(str, 1);
        JQO jqo = c43718JVd.A01;
        JQX.A00(String.valueOf(jqo.A03)).DW7(c43718JVd.A00, -1, str);
        if (jqo.A0Q) {
            A01(userSession, this, c43718JVd, str, AbstractC111324zv.A00(1495));
            A02(userSession, c43718JVd, str);
        } else {
            A00(userSession, this, c43718JVd, str, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[LOOP:0: B:22:0x00b7->B:24:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.instagram.common.session.UserSession r20, X.C43718JVd r21, java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKC.A05(com.instagram.common.session.UserSession, X.JVd, java.lang.String, int):void");
    }

    public static final void A00(UserSession userSession, LKC lkc, C43718JVd c43718JVd, String str, int i) {
        C43719JVe c43719JVe = c43718JVd.A02;
        C60L c60l = (C60L) lkc.A04.invoke(userSession);
        JQO jqo = c43718JVd.A01;
        c60l.A00(jqo.A0F, c43719JVe.A04, jqo.A0G, jqo.A06.A01, str, i);
    }

    private final void A02(UserSession userSession, C43718JVd c43718JVd, String str) {
        C43719JVe c43719JVe = c43718JVd.A02;
        C132515ya c132515ya = (C132515ya) this.A03.invoke(userSession);
        String str2 = c43719JVe.A05;
        String str3 = c43719JVe.A04;
        C14360o3.A0K(String.valueOf(c43718JVd.A01.A03), userSession.userId);
        c132515ya.A06(null, str2, str, str3, false, true);
    }
}
