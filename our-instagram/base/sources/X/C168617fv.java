package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168617fv {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.7g0, java.lang.Object] */
    public final C168607fu A00(Context context, InterfaceC168087f3 interfaceC168087f3, InterfaceC11380iw interfaceC11380iw, C61972ry c61972ry, UserSession userSession, C169267gz c169267gz, C38321qM c38321qM, InterfaceC168627fw interfaceC168627fw, Runnable runnable, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        C169127gl c169127gl;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(interfaceC11380iw, 7);
        if ("comment_composer_page".equals(str)) {
            str2 = "coefficient_rank_recipient_user_suggestion";
        } else {
            str2 = "autocomplete_user_list";
        }
        C169127gl c169127gl2 = null;
        C169127gl A00 = AbstractC169097gi.A00(null, userSession, c61972ry, new AlY(userSession, str), str2, list, z);
        if (c38321qM != null && new C57382kD(userSession).A02(c38321qM)) {
            String A2u = c38321qM.A1g(userSession).A2u();
            if (A2u != null) {
                c169127gl = new C169127gl(c61972ry, new AlR(userSession, str2, A2u, list), new C169337h7(c61972ry, new C42820Iww(userSession, c38321qM)), true, false);
                c169127gl2 = new C169127gl(c61972ry, new C24033AlS(userSession, str2, A2u, list), new C169337h7(c61972ry, new C24037AlX(userSession, str)), z, true);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            c169127gl = null;
        }
        if (str.equals("comment_composer_page")) {
            C18U.A06(C06090Tz.A05, userSession, 36331205666292947L);
        }
        return new C168607fu(context, interfaceC168087f3, interfaceC11380iw, userSession, c169267gz, c38321qM, AbstractC168637fx.A00(userSession, c61972ry, str), A00, c169127gl, c169127gl2, new C168677g1(userSession, new Object()), interfaceC168627fw, runnable, str, z2, z3, z4);
    }

    public final C168607fu A01(Context context, InterfaceC11380iw interfaceC11380iw, C61972ry c61972ry, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        C14360o3.A0B(userSession, 1);
        return A00(context, null, interfaceC11380iw, c61972ry, userSession, null, c38321qM, null, null, str, null, false, z, false, false);
    }
}
