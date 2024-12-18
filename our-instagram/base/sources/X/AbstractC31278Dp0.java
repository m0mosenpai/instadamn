package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31278Dp0 {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1h1, X.1OW] */
    public static final void A01(C32071E6x c32071E6x, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        JTa A08 = AbstractC31277Doz.A08(userSession, C32771h1.class);
        int i = c32071E6x.A00;
        String str2 = c32071E6x.A01;
        ?? c1ow = new C1OW(A08);
        c1ow.A02 = str;
        c1ow.A00 = i;
        c1ow.A01 = str2;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1fZ, X.1OW] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1fZ, X.1OW] */
    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        C14360o3.A0B(str, 1);
        JTa A08 = AbstractC31277Doz.A08(userSession, C31891fZ.class);
        boolean z = false;
        if (i <= 0) {
            if (i != 0) {
                z = true;
            }
            C26141Ov A01 = C26141Ov.A01(userSession);
            ?? c1ow = new C1OW(A08);
            c1ow.A01 = str;
            c1ow.A02 = z;
            A01.A0B(c1ow);
            AbstractC34136F4m.A00(userSession).A04(interfaceC11380iw, AbstractC31171DnF.A0N(str), false, z);
            return;
        }
        C26141Ov A012 = C26141Ov.A01(userSession);
        ?? c1ow2 = new C1OW(A08);
        c1ow2.A01 = str;
        c1ow2.A02 = true;
        c1ow2.A00 = Integer.valueOf(i);
        A012.A0B(c1ow2);
        AbstractC34136F4m.A00(userSession).A02(interfaceC11380iw, AbstractC31171DnF.A0N(str), false, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1fr, X.1OW] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1fr, X.1OW] */
    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        JTa A08 = AbstractC31277Doz.A08(userSession, C32071fr.class);
        boolean z = false;
        if (i <= 0) {
            if (i != 0) {
                z = true;
            }
            C26141Ov A01 = C26141Ov.A01(userSession);
            ?? c1ow = new C1OW(A08);
            c1ow.A01 = str;
            c1ow.A02 = z;
            A01.A0B(c1ow);
            AbstractC34136F4m.A00(userSession).A06(interfaceC11380iw, AbstractC31171DnF.A0N(str), false, z);
            return;
        }
        C26141Ov A012 = C26141Ov.A01(userSession);
        ?? c1ow2 = new C1OW(A08);
        c1ow2.A01 = str;
        c1ow2.A02 = true;
        c1ow2.A00 = Integer.valueOf(i);
        A012.A0B(c1ow2);
        AbstractC34136F4m.A00(userSession).A03(interfaceC11380iw, AbstractC31171DnF.A0N(str), false, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1fr, X.1OW] */
    public static final void A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        C26141Ov A01 = C26141Ov.A01(userSession);
        ?? c1ow = new C1OW(AbstractC31277Doz.A08(userSession, C32071fr.class));
        c1ow.A01 = str;
        c1ow.A02 = z;
        A01.A0B(c1ow);
        AbstractC34136F4m.A00(userSession).A06(interfaceC11380iw, AbstractC31171DnF.A0N(str), false, z);
    }

    public static final void A08(UserSession userSession, C81613kW c81613kW, String str, int i, boolean z, boolean z2) {
        Integer num;
        AbstractC167017dG.A1O(userSession, str);
        Integer num2 = null;
        JTa A07 = AbstractC31277Doz.A07(userSession, C34651k3.class);
        if (z) {
            num = Integer.valueOf(C6X6.A00(userSession, c81613kW));
            if (z2) {
                num2 = 86400;
            }
        } else {
            num = null;
        }
        AbstractC31173DnH.A1U(userSession, new C34651k3(userSession, A07, num, num2, str, i, z));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1fD, X.1OW] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.3jU, X.KVZ] */
    public static final void A09(UserSession userSession, C83403nh c83403nh, DirectThreadKey directThreadKey) {
        String A0g;
        C47573Kzj c47573Kzj;
        String str;
        C14360o3.A0B(directThreadKey, 1);
        boolean z = c83403nh.A2P;
        L1W A0M = c83403nh.A0M();
        if (c83403nh.A1S()) {
            A0g = null;
        } else {
            A0g = c83403nh.A0g();
        }
        JTa A04 = AbstractC31277Doz.A04(userSession, A0M, C31701fD.class, null, A0g, z);
        C101584hT c101584hT = c83403nh.A0e;
        if (c101584hT != null) {
            c47573Kzj = c101584hT.A02;
        } else {
            c47573Kzj = null;
        }
        String str2 = "";
        if (c47573Kzj == null) {
            str = "";
        } else {
            str = c47573Kzj.A01;
            str2 = c47573Kzj.A00;
        }
        String str3 = directThreadKey.A00;
        String A0h = c83403nh.A0h();
        C14360o3.A0A(A0h);
        String A0g2 = c83403nh.A0g();
        C14360o3.A0B(A0h, 2);
        ?? abstractC81003jU = new AbstractC81003jU(str3, A0h, A0g2);
        boolean z2 = c83403nh.A2P;
        EnumC159397Cz A00 = AbstractC1586079v.A00(c83403nh);
        ?? c1ow = new C1OW(A04);
        c1ow.A06 = z2;
        c1ow.A01 = abstractC81003jU;
        c1ow.A00 = A00;
        c1ow.A03 = str;
        c1ow.A02 = str2;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1lZ, X.1OW] */
    public static final void A0A(UserSession userSession, C83693oE c83693oE, String str, boolean z) {
        String str2;
        JTa A08 = AbstractC31277Doz.A08(userSession, C35531lZ.class);
        String str3 = c83693oE.A00;
        int A06 = AbstractC167007dF.A06(1, A08, str3);
        ?? c1ow = new C1OW(A08);
        c1ow.A01 = str3;
        c1ow.A00 = z ? 1 : 0;
        AbstractC31173DnH.A1U(userSession, c1ow);
        C06090Tz A00 = C06090Tz.A00(new C06090Tz());
        A00.A02 = true;
        boolean A062 = C18U.A06(A00, userSession, 36320867680003027L);
        StringBuilder A11 = AbstractC166997dE.A11(str);
        A11.append(" isLockedChatONFromMC: ");
        A11.append(A062);
        A11.append(" src: ");
        A11.append(A00.A00.A00.getSource());
        String obj = A11.toString();
        C14360o3.A0B(obj, A06);
        InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
        boolean isSampled = A09.isSampled();
        if (z) {
            if (isSampled) {
                str2 = "toggle_thread_lock_on";
            } else {
                return;
            }
        } else if (!isSampled) {
            return;
        } else {
            str2 = "toggle_thread_lock_off";
        }
        AbstractC31181DnP.A0i(A09, str2, obj, str3);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1h9, X.1OW] */
    public static final void A0B(UserSession userSession, C83693oE c83693oE, String str, boolean z) {
        C14360o3.A0B(str, 3);
        JTa A08 = AbstractC31277Doz.A08(userSession, C32851h9.class);
        String str2 = c83693oE.A00;
        String str3 = userSession.userId;
        ?? c1ow = new C1OW(A08);
        c1ow.A00 = str2;
        c1ow.A03 = z;
        c1ow.A02 = str3;
        c1ow.A01 = str;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1fT, X.1OW] */
    public static final void A0C(UserSession userSession, DirectThreadKey directThreadKey, boolean z) {
        C14360o3.A0B(directThreadKey, 1);
        ?? c1ow = new C1OW(AbstractC31277Doz.A08(userSession, C31851fT.class));
        c1ow.A00 = directThreadKey;
        c1ow.A01 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1jx, X.1OW] */
    public static final void A0D(UserSession userSession, DirectThreadKey directThreadKey, boolean z) {
        C14360o3.A0B(userSession, 0);
        ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession, C34591jx.class, 1));
        c1ow.A00 = directThreadKey;
        c1ow.A01 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1hH, X.1OW] */
    public static final void A0E(UserSession userSession, C3o9 c3o9, String str, boolean z) {
        AbstractC167017dG.A1O(userSession, str);
        if (JRE.A02(c3o9) != null) {
            JTa A04 = AbstractC31277Doz.A04(userSession, LCT.A00(userSession, JRE.A01(c3o9)), C32931hH.class, null, null, z);
            String A15 = AbstractC31172DnG.A15(c3o9);
            if (A15 != null) {
                ?? c1ow = new C1OW(A04);
                c1ow.A02 = A15;
                c1ow.A01 = str;
                c1ow.A00 = null;
                AbstractC31173DnH.A1U(userSession, c1ow);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        if (JRE.A04(c3o9) == null) {
            return;
        }
        K3Z A00 = AbstractC46876KoJ.A00(userSession);
        long A03 = AbstractC31179DnN.A03(c3o9);
        long parseLong = Long.parseLong(str);
        InterfaceExecutorC135866Co ASj = A00.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        if (ASj.ELJ(new C48182LUg(1, A03, parseLong, 5, mailboxFutureImpl, A00))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public static final void A0F(UserSession userSession, Integer num, String str, int i, int i2) {
        AbstractC167017dG.A1O(userSession, str);
        AbstractC31173DnH.A1U(userSession, new C34651k3(userSession, AbstractC31277Doz.A08(userSession, C34651k3.class), Integer.valueOf(i2), num, str, i, AbstractC167007dF.A1O(i2)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1ki, X.1OW] */
    public static final void A0G(UserSession userSession, String str, int i, boolean z) {
        EnumC72424XdU enumC72424XdU;
        JTa A08 = AbstractC31277Doz.A08(userSession, C35031ki.class);
        C14360o3.A0B(A08, 1);
        ?? c1ow = new C1OW(A08);
        c1ow.A01 = str;
        c1ow.A00 = userSession;
        c1ow.A02 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
        C34496FIi c34496FIi = (C34496FIi) userSession.A01(C34496FIi.class, new C37058GUs(userSession, 41));
        C83693oE A0N = AbstractC31171DnF.A0N(str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34496FIi.A00, "direct_thread_pin_button");
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A1A(A0f, false);
            AbstractC31171DnF.A1C(A0f, "click");
            AbstractC31171DnF.A1G(A0f, "long_press");
            AbstractC31171DnF.A1H(A0f, AbstractC92784Dr.A02(A0N));
            A0f.A9K(AbstractC111324zv.A00(50), AbstractC92784Dr.A01(A0N));
            A0f.A7v("is_pin_thread", AbstractC31172DnG.A0s(z));
            EnumC72424XdU[] values = EnumC72424XdU.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC72424XdU = values[i2];
                    if (((int) enumC72424XdU.A00) == i) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    enumC72424XdU = null;
                    break;
                }
            }
            A0f.A8R(enumC72424XdU, "thread_subtype");
            A0f.Cht();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1OW, X.1jB] */
    public static final void A0I(UserSession userSession, String str, boolean z) {
        ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession, C34111jB.class, 1));
        c1ow.A00 = str;
        c1ow.A01 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1fl, X.1OW] */
    public static final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        JTa A08 = AbstractC31277Doz.A08(userSession, C32011fl.class);
        C14360o3.A0B(A08, 1);
        ?? c1ow = new C1OW(A08);
        c1ow.A00 = str;
        c1ow.A01 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) AbstractC34136F4m.A00(userSession).A00, "direct_thread_mute_reactions_button");
        if (A0f.isSampled()) {
            A0f.A7v("to_mute", Boolean.valueOf(z));
            AbstractC31171DnF.A1F(A0f, str);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.Cht();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3kf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.1f3, X.1OW] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.3jU, java.lang.Object, X.3jT] */
    public static final void A00(C9CG c9cg, UserSession userSession, String str, String str2, String str3, String str4, long j, boolean z) {
        C81703kf c81703kf;
        AbstractC167017dG.A1R(str2, str3);
        C26141Ov A01 = C26141Ov.A01(userSession);
        if (str4 == null) {
            c81703kf = null;
        } else {
            ?? obj = new Object();
            obj.A01 = str4;
            obj.A00 = j;
            c81703kf = obj;
        }
        JTa A07 = AbstractC31277Doz.A07(userSession, C31601f3.class);
        String str5 = A07.A03;
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        ?? obj2 = new Object();
        obj2.A04 = str;
        obj2.A02 = str2;
        obj2.A03 = null;
        obj2.A01 = str5;
        obj2.A00 = micros;
        obj2.A02 = c81703kf;
        obj2.A01 = c9cg;
        String A0R = AnonymousClass001.A0R("mark_thread_seen-", str);
        synchronized (A01) {
            boolean z2 = true;
            if (A0R == null) {
                z2 = false;
            }
            C18C.A0E(z2);
            C26141Ov.A03(null, A01, null, A0R);
        }
        ?? c1ow = new C1OW(A07);
        c1ow.A03 = true;
        c1ow.A00 = obj2;
        c1ow.A02 = str3;
        c1ow.A08.add(AnonymousClass001.A0R("mark_thread_seen-", obj2.A04));
        c1ow.A01 = str4;
        c1ow.A03 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1fZ, X.1OW] */
    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        ?? c1ow = new C1OW(AbstractC31277Doz.A08(userSession, C31891fZ.class));
        c1ow.A01 = str;
        c1ow.A02 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
        AbstractC34136F4m.A00(userSession).A04(interfaceC11380iw, AbstractC31171DnF.A0N(str), Boolean.valueOf(A1Y), z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1ff, X.1OW] */
    public static final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z, boolean z2) {
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        ?? c1ow = new C1OW(AbstractC31277Doz.A08(userSession, C31951ff.class));
        c1ow.A00 = str;
        c1ow.A01 = z;
        AbstractC31173DnH.A1U(userSession, c1ow);
        C35165FfF A00 = AbstractC34136F4m.A00(userSession);
        C83693oE A0N = AbstractC31171DnF.A0N(str);
        if (z2) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) A00.A00, "direct_thread_mute_mentions_and_replies_button");
            if (A0f.isSampled()) {
                A0f.A7v("to_mute", Boolean.valueOf(z));
                AbstractC31171DnF.A1F(A0f, AbstractC1345466e.A06(A0N));
                AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                A0f.Cht();
                return;
            }
            return;
        }
        A00.A05(interfaceC11380iw, A0N, Boolean.valueOf(A1Y), z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1h6, X.1OW] */
    public static final void A0H(UserSession userSession, String str, String str2) {
        ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession, C32821h6.class, AbstractC167017dG.A1a(userSession, str) ? 1 : 0));
        c1ow.A00 = str;
        c1ow.A01 = str2;
        AbstractC31173DnH.A1U(userSession, c1ow);
    }
}
