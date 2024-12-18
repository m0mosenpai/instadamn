package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.Fgc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35243Fgc {
    public static final C35243Fgc A00 = new Object();
    public static final HashSet A01 = AbstractC16830sb.A05("com.facebook.wakizashi", "com.facebook.katana", "com.facebook.orca", "com.oculus.twilight", "com.instagram.android", "com.instagram.barcelona", "com.facebook.lite");

    public static final void A02(Context context, UserSession userSession, String str, String str2, String str3, String str4, long j, boolean z) {
        String str5;
        if (z && C63208SfC.A00(context).A03()) {
            C1TT A002 = new C1Ro(context, context.getPackageManager()).A00();
            if (A002.A06 && A002.A05 && C18U.A06(C06090Tz.A05, userSession, 36325025208808092L) && AbstractC34211F7j.A00(context)) {
                str5 = "preload";
                A03(userSession, str2, str3, str4, str5, j);
            }
        }
        if (str == null || str.length() == 0) {
            return;
        }
        C12260kU.A00(context, AbstractC31177DnL.A07(str));
        if (!z) {
            return;
        }
        str5 = "app_store";
        A03(userSession, str2, str3, str4, str5, j);
    }

    public static final void A03(UserSession userSession, String str, String str2, String str3, String str4, long j) {
        Long A0n = AbstractC25233BEq.A0n(AbstractC25227BEk.A0B(str).getQueryParameter("account_id"));
        C31514Dsy.A03(userSession, A0n, A0n, "inter_app", "", str2, "IG_ANDROID", str4, str3, null, j, false, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        if (X.C18U.A06(r10, r25, 36323698063519226L) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r23, androidx.fragment.app.FragmentActivity r24, com.instagram.common.session.UserSession r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35243Fgc.A00(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        String str6;
        StringBuilder A1C;
        StringBuilder A1C2;
        String str7 = str5;
        C14360o3.A0B(userSession, 6);
        if (str5 == null || str7.length() == 0) {
            str7 = "fb://feed";
        }
        Uri.Builder A04 = AbstractC31175DnJ.A04("https://www.facebook.com/inter_app/redirect/");
        String str8 = "xav:switcher";
        C1AD.A05(18873568062341920L);
        C06090Tz c06090Tz = C06090Tz.A04;
        C14360o3.A08(c06090Tz);
        String A042 = C1AD.A04(c06090Tz, 18873568062341920L);
        if (AbstractC167007dF.A1O(A042.length())) {
            str6 = AnonymousClass001.A0D(A042, ':');
        } else {
            str6 = "";
        }
        C06090Tz c06090Tz2 = C06090Tz.A05;
        String A043 = C1AD.A04(c06090Tz2, 18873572357309217L);
        if (AbstractC167007dF.A1O(A043.length())) {
            if (str6.length() > 0) {
                A1C2 = AbstractC166997dE.A11(str6);
                A1C2.append('@');
            } else {
                A1C2 = AbstractC166987dD.A1C();
                A1C2.append(':');
            }
            str6 = AbstractC166997dE.A0x(A043, A1C2);
        }
        String A044 = C18U.A04(c06090Tz2, userSession, 36887975161758498L);
        if (A044.length() > 0) {
            if (str6.length() > 0) {
                A1C = AbstractC166997dE.A11(str6);
                A1C.append('@');
            } else {
                A1C = AbstractC166987dD.A1C();
                A1C.append(':');
            }
            str6 = AbstractC166997dE.A0x(A044, A1C);
        }
        if (str6.length() > 0) {
            str8 = AnonymousClass001.A0T("xav:switcher", str6, ':');
        }
        A04.appendQueryParameter("ref", str8);
        A04.appendQueryParameter("account_id", str);
        A04.appendQueryParameter("destination_url", str7);
        A00(context, fragmentActivity, userSession, AbstractC166987dD.A19(A04.build()), AbstractC166987dD.A19(AbstractC31175DnJ.A04("https://play.google.com/store/apps/details?id=com.facebook.katana").build()), str2, str3, str4);
    }
}
