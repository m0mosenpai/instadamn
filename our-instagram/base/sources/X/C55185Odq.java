package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Odq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55185Odq {
    public static final C55185Odq A00 = new Object();

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, Throwable th, int i) {
        String str4;
        String str5;
        boolean A1b = AbstractC43593JPy.A1b(str2);
        String str6 = "";
        if (th == null) {
            str4 = "";
        } else {
            str4 = th.getLocalizedMessage();
            StackTraceElement[] stackTrace = th.getStackTrace();
            C14360o3.A07(stackTrace);
            if (stackTrace.length != 0) {
                str6 = th.getStackTrace()[A1b ? 1 : 0].getClassName();
                StringBuilder A1C = AbstractC166987dD.A1C();
                C0s6 A002 = AbstractC13190m5.A00(th.getStackTrace());
                while (A002.hasNext()) {
                    A1C.append(A002.next().toString());
                    A1C.append("\n");
                }
                str5 = A1C.toString();
                AbstractC167007dF.A1I(str6, 7, str5);
                C19280xC A003 = A00(interfaceC11380iw, userSession, Integer.valueOf(i), str, str2, str3);
                A003.A0C("event", AnonymousClass001.A0R("fb_ig_client_failure_", str3));
                A003.A0C("exception_message", str4);
                A003.A0C("exception_class", str6);
                A003.A0C("exception_stack", str5);
                AbstractC31173DnH.A1S(A003, userSession);
            }
        }
        str5 = "";
        AbstractC167007dF.A1I(str6, 7, str5);
        C19280xC A0032 = A00(interfaceC11380iw, userSession, Integer.valueOf(i), str, str2, str3);
        A0032.A0C("event", AnonymousClass001.A0R("fb_ig_client_failure_", str3));
        A0032.A0C("exception_message", str4);
        A0032.A0C("exception_class", str6);
        A0032.A0C("exception_stack", str5);
        AbstractC31173DnH.A1S(A0032, userSession);
    }

    public static final void A02(UserSession userSession, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, int i) {
        C14360o3.A0B(str2, 3);
        C19280xC A002 = A00(interfaceC11380iw, userSession, Integer.valueOf(i), str, str2, str3);
        A002.A0C("event", AnonymousClass001.A0R("fb_ig_client_request_", str3));
        AbstractC31173DnH.A1S(A002, userSession);
    }

    public static final void A03(UserSession userSession, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, int i) {
        C14360o3.A0B(str2, 3);
        C19280xC A002 = A00(interfaceC11380iw, userSession, Integer.valueOf(i), str, str2, str3);
        A002.A0C("event", AnonymousClass001.A0R("fb_ig_client_success_", str3));
        AbstractC31173DnH.A1S(A002, userSession);
    }

    public static final C19280xC A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        C19280xC A002 = C19280xC.A00(interfaceC11380iw, "ig_fb_xposting_waterfall");
        if (str3.equalsIgnoreCase("share_later")) {
            str4 = "TIMELINE";
        } else {
            str4 = "FB_STORY";
        }
        A002.A0C("share_to_surface", str4);
        if (AbstractC166987dD.A10(userSession).CQw()) {
            str5 = "BUSINESS";
        } else {
            str5 = "PERSONAL";
        }
        A002.A0C("ig_account_type", str5);
        if (C180377zR.A06(userSession)) {
            str6 = "PAGE";
        } else {
            str6 = "USER";
        }
        A002.A0C("share_to_entity_type", str6);
        A002.A0C("waterfall_id", str);
        A002.A0C("ig_actor_id", userSession.userId);
        A002.A0B("client_event_time", AbstractC31173DnH.A0g());
        if (num != null) {
            A002.A08(num, "media_type");
        }
        if (str2 != null) {
            A002.A0C("media_id", str2);
        }
        return A002;
    }
}
