package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132565yf {
    public final Context A00;
    public final C132465yV A01;
    public final C132575yg A02;

    public C132565yf(C132465yV c132465yV) {
        C132575yg c132575yg = new C132575yg(AbstractC12290kX.A00);
        Context applicationContext = AbstractC12290kX.A00.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A02 = c132575yg;
        this.A00 = applicationContext;
        this.A01 = c132465yV;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, X.50B] */
    public static final C116155Nu A00(UserSession userSession, ImageUrl imageUrl, C132565yf c132565yf, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, long j) {
        String str9;
        String A0R;
        String str10;
        String str11 = str3;
        String str12 = str;
        if (str == null) {
            if (str2 == null) {
                C0w9.A04("notification_senderName_null", "No group notification should be rendered", 1);
                str12 = "";
            } else {
                str12 = c132565yf.A00.getString(2131964158, str2);
                C14360o3.A07(str12);
            }
        }
        if (str3 == null) {
            C0w9.A04("armadillo_notification_message_null", "No group notification should be rendered", 1);
            str11 = "";
        }
        String A01 = c132565yf.A02.A01(l, null, String.valueOf(j), i2, true, false);
        if (i2 != 2) {
            if (i2 != 13) {
                str9 = "direct_v2_message";
            } else {
                str9 = "direct_v2_edit_message";
            }
            A0R = str4;
        } else {
            str9 = "direct_v2_delete_item";
            A0R = AnonymousClass001.A0R(str4, "_unsend");
        }
        if (i == 18) {
            str10 = "direct_v2_pending";
        } else {
            str10 = "direct_v2_text";
        }
        C116155Nu c116155Nu = new C116155Nu(new Object(), imageUrl, false, false, true, str12, str11, A01, str9, A0R, str10, userSession.userId, str4, null, str7, str8);
        c116155Nu.A0u = str6;
        if (i2 == 13) {
            c116155Nu.A1N = true;
        }
        c116155Nu.A1A = str5;
        c116155Nu.A19 = str2;
        c116155Nu.A0b = str;
        C47280Kur c47280Kur = new C47280Kur();
        c47280Kur.A00 = true;
        c116155Nu.A09 = new C48285LYj(c47280Kur);
        c116155Nu.A0c = String.valueOf(1);
        return c116155Nu;
    }
}
