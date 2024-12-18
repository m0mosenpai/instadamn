package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fe7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35105Fe7 {
    public static final String A00 = AnonymousClass001.A0R(S8X.A01, "profile/");

    public static void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str) {
        String formatStrLocaleSafe;
        String A0R;
        if (l != null) {
            if (!TextUtils.isEmpty(null)) {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/profile.php?id=%s&v=info&ref=%s", l, null);
            } else {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/profile.php?id=%s&v=info", l);
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(A00);
            A1C.append(l);
            if (TextUtils.isEmpty(null)) {
                A0R = "";
            } else {
                A0R = AnonymousClass001.A0R("?ref=", null);
            }
            AbstractC35190Ffi.A02(context, interfaceC11380iw, userSession, str, formatStrLocaleSafe, AbstractC166997dE.A0x(A0R, A1C), null, null, true);
        }
    }

    public static void A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        String A0R;
        String A0R2;
        String replace = str.replace("https://www.facebook.com/profile.php?id=", A00);
        if (TextUtils.isEmpty(str2)) {
            A0R = "";
        } else {
            A0R = AnonymousClass001.A0R("?ref=", str2);
        }
        String A0R3 = AnonymousClass001.A0R(replace, A0R);
        if (C18U.A06(C06090Tz.A05, userSession, 36320090292232240L)) {
            Uri.Builder A04 = AbstractC31175DnJ.A04(A0R3);
            A04.appendQueryParameter("scroll_to_posts", "true");
            A0R3 = A04.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            A0R2 = "";
        } else {
            A0R2 = AnonymousClass001.A0R("&ref=", str2);
        }
        AbstractC35190Ffi.A01(context, interfaceC11380iw, userSession, "ig_direct", AnonymousClass001.A0R(str, A0R2), A0R3);
    }
}
