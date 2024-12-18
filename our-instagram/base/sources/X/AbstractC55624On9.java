package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.On9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55624On9 implements CallerContextable {
    public static final String __redex_internal_original_name = "FacebookAutoShareDialogHelper";
    public static final CallerContext A00 = CallerContext.A01(__redex_internal_original_name);

    public static final void A00(Context context, UserSession userSession, C195918ld c195918ld, InterfaceC57990Pna interfaceC57990Pna, String str) {
        CharSequence string;
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1R(c195918ld, str);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131962032);
        C131995xZ A002 = C196068lw.A00(userSession).A00(A00);
        String str2 = A002.A04;
        String A003 = AbstractC200008t4.A00(context, userSession, A002);
        int length = str2.length();
        if (length == 0) {
            A01(EnumC201098ur.SUPPRESS, userSession, str, "empty_name");
        }
        if (A003 == null || A003.length() == 0) {
            A01(EnumC201098ur.SUPPRESS, userSession, str, "empty_audience");
        }
        if (length > 0 && A003 != null && A003.length() != 0) {
            Resources resources = context.getResources();
            int i = 2131962030;
            if (AnonymousClass252.A00(userSession).A01) {
                i = 2131962031;
            }
            string = AbstractC07900bA.A00(resources, new Object[]{str2, A003}, i);
        } else {
            string = context.getResources().getString(2131962029);
        }
        C14360o3.A0A(string);
        A0I.A0r(string);
        A0I.A0s(true);
        A0I.A0t(true);
        A0I.A0J(new Og6(interfaceC57990Pna, userSession, c195918ld, str, 1), 2131972763);
        A0I.A0I(new DialogInterfaceOnClickListenerC55287Og2(userSession, interfaceC57990Pna, str, 0), 2131968687);
        A0I.A0C(new DialogInterfaceOnCancelListenerC55250OfO(userSession, interfaceC57990Pna, str, 1));
        AbstractC166987dD.A1W(A0I);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        AbstractC50522MSa.A1T(A0x, "direct_sharesheet_auto_share_to_fb_dialog_display_count", 0);
        long A07 = AbstractC43593JPy.A07();
        InterfaceC19610xo ARD = A0x.ARD();
        ARD.E7G("last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec", A07);
        ARD.apply();
        A01(EnumC201098ur.VIEW, userSession, str, null);
        C197838ou.A01(C82G.A0j, C82H.A0l, userSession);
    }

    public static final void A01(EnumC201098ur enumC201098ur, UserSession userSession, String str, String str2) {
        C82G c82g = C82G.A0j;
        C82H c82h = C82H.A0l;
        C82I A0H = MSW.A0H();
        AbstractC50523MSb.A18(A0H, AbstractC31172DnG.A01(AbstractC166987dD.A0x(userSession), "direct_sharesheet_auto_share_to_fb_dialog_display_count"));
        AbstractC50523MSb.A19(A0H, "waterfall_id", str, str2);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }
}
