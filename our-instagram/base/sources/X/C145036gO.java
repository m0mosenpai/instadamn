package X;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.6gO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145036gO {
    public Boolean A01;
    public final boolean A04;
    public Dialog A00 = null;
    public boolean A02 = false;
    public boolean A03 = false;

    public static void A00(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, UserSession userSession, XDl xDl, C145036gO c145036gO, C69294Vl2 c69294Vl2, AnonymousClass309 anonymousClass309, String str, String str2, String str3, String str4, String str5, String str6) {
        long j;
        Long A0k;
        Dialog dialog = c145036gO.A00;
        if (dialog != null && dialog.isShowing()) {
            return;
        }
        C193328hC c193328hC = new C193328hC(activity);
        c193328hC.A05 = str;
        c193328hC.A0t(false);
        c193328hC.A0r(str2);
        if (uri != null && !TextUtils.isEmpty(str3)) {
            c193328hC.A0Z(new DialogInterfaceOnClickListenerC70209WHq(activity, uri, interfaceC11380iw, userSession, c145036gO, c69294Vl2, anonymousClass309, str5), EnumC193348hE.A03, str3, false);
        }
        if (str4 != null) {
            c193328hC.A0X(new DialogInterfaceOnClickListenerC70210WHr(interfaceC11380iw, userSession, xDl, c145036gO, c69294Vl2, anonymousClass309, str6, str5), EnumC193348hE.A03, str4, true);
        }
        c193328hC.A0D(new WHd(xDl, c145036gO));
        c193328hC.A0C(new WHG(xDl, c145036gO));
        c193328hC.A0g(new WI8(interfaceC11380iw, userSession, xDl, c145036gO, c69294Vl2, anonymousClass309, str5));
        Dialog A02 = c193328hC.A02();
        c145036gO.A00 = A02;
        C0fJ.A00(A02);
        c145036gO.A02 = true;
        c145036gO.A03 = false;
        xDl.Dlw();
        if (c69294Vl2 != null) {
            C18920wW c18920wW = c69294Vl2.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_content_advisory_shown");
            A00.AAP("category_id", c69294Vl2.A03);
            Hashtag hashtag = c69294Vl2.A02;
            String id = hashtag.getId();
            if (id != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            A00.A9K("hashtag_id", Long.valueOf(j));
            String name = hashtag.getName();
            if (name == null) {
                name = "";
            }
            A00.AAP("hashtag_name", name);
            A00.AAP("hashtag_follow_status", AbstractC1120253r.A02(hashtag));
            A00.AAP("hashtag_feed_type", c69294Vl2.A04);
            A00.A9K("tab_index", Long.valueOf(c69294Vl2.A00));
            A00.Cht();
            return;
        }
        C19260xA A002 = anonymousClass309.E6P().A00();
        C19280xC A003 = C19280xC.A00(interfaceC11380iw, "instagram_content_advisory_shown");
        A003.A0C("category_id", str5);
        A003.A04(A002);
        if (userSession != null) {
            AbstractC11060iN.A00(userSession).EHW(A003);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C145036gO c145036gO, C69294Vl2 c69294Vl2, AnonymousClass309 anonymousClass309, String str, String str2) {
        long j;
        Long A0k;
        if (c145036gO.A04) {
            if (c69294Vl2 != null) {
                C18920wW c18920wW = c69294Vl2.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_content_advisory_action");
                A00.AAP("category_id", c69294Vl2.A03);
                A00.AAP("action", str2);
                Hashtag hashtag = c69294Vl2.A02;
                String id = hashtag.getId();
                if (id != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                A00.A9K("hashtag_id", Long.valueOf(j));
                String name = hashtag.getName();
                if (name == null) {
                    name = "";
                }
                A00.AAP("hashtag_name", name);
                A00.AAP("hashtag_follow_status", AbstractC1120253r.A02(hashtag));
                A00.AAP("hashtag_feed_type", c69294Vl2.A04);
                A00.A9K("tab_index", Long.valueOf(c69294Vl2.A00));
                A00.Cht();
                return;
            }
            C19260xA A002 = anonymousClass309.E6P().A00();
            C19280xC A003 = C19280xC.A00(interfaceC11380iw, "instagram_content_advisory_action");
            A003.A0C("action", str2);
            A003.A0C("category_id", str);
            A003.A04(A002);
            if (userSession != null) {
                AbstractC11060iN.A00(userSession).EHW(A003);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C145036gO(boolean z) {
        this.A04 = z;
    }
}
