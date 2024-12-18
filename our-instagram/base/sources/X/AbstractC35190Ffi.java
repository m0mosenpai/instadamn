package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Ffi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35190Ffi {
    public static final String A00 = AbstractC13670mt.A06("https://mtouch.%s", PreferenceManager.getDefaultSharedPreferences(AbstractC12290kX.A00).getString("com.instagram.common.api.facebook.FacebookURLBuilder.KEY_FACEBOOK_ENDPOINT", IGPixelRequestBuffer.URL_PREFIX));

    public static void A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        A02(context, interfaceC11380iw, userSession, str, str2, str3, null, null, false);
    }

    public static void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        C18240vB c18240vB = AbstractC55762hH.A01;
        StringBuilder sb = new StringBuilder(16);
        int i = 0;
        do {
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(AbstractC55762hH.A02.nextInt(62)));
            i++;
        } while (i < 16);
        String obj = sb.toString();
        String A002 = A00(context.getPackageManager());
        String str7 = "msite";
        if (A002 != null) {
            boolean equals = A002.equals("com.facebook.lite");
            if (equals) {
                str3 = null;
            }
            PackageManager packageManager = context.getPackageManager();
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(A002);
            if (launchIntentForPackage != null) {
                if (!TextUtils.isEmpty(str3)) {
                    Intent A07 = AbstractC31177DnL.A07(str3);
                    if (!packageManager.queryIntentActivities(A07, 65600).isEmpty()) {
                        launchIntentForPackage = A07;
                    }
                }
                launchIntentForPackage.putExtra("funlid", obj).putExtra("source_surface", str).putExtra(AbstractC111324zv.A00(870), "fb_homepage").putExtra(AbstractC58317Pt9.A00(676), "android-app://com.instagram.android");
                C12260kU.A0A(context, launchIntentForPackage);
            } else {
                C0w9.A03("FamilyBridgesUtil", "Falling back to msite in openFacebookApp().");
                if (!TextUtils.isEmpty(str2)) {
                    if (str2 == null || str2.isEmpty()) {
                        str2 = A00;
                    }
                    C12260kU.A0E(context, new Intent("android.intent.action.VIEW", AbstractC31174DnI.A0B(AbstractC31175DnJ.A04(str2), "funlid", obj)));
                }
            }
            str7 = equals ? "android_fblite" : "android_fb4a";
        } else {
            if (str2 == null || str2.isEmpty()) {
                if (AbstractC14490oL.A0F(context)) {
                    AbstractC14490oL.A07(context, "com.facebook.katana", str);
                    str7 = "app_store";
                } else {
                    z = true;
                    str2 = A00;
                }
            }
            android.net.Uri A0B = AbstractC31174DnI.A0B(AbstractC31175DnJ.A04(str2), "funlid", obj);
            if (z) {
                C63397SjR c63397SjR = new C63397SjR(context, userSession, C2Fb.A1m, A0B.toString());
                if (interfaceC11380iw != null) {
                    str6 = interfaceC11380iw.getModuleName();
                } else {
                    str6 = null;
                }
                c63397SjR.A0S = str6;
                c63397SjR.A0A();
            } else {
                C12260kU.A0E(context, new Intent("android.intent.action.VIEW", A0B));
            }
        }
        AbstractC55762hH.A01.ATO(new C32673EZx(context, interfaceC11380iw, userSession, str, str7, obj, str4, str5));
    }

    public static String A00(PackageManager packageManager) {
        Iterator it = AbstractC23851Es.A02().iterator();
        while (it.hasNext()) {
            String str = ((EnumC23861Et) it.next()).A01;
            if ("com.facebook.katana".equals(str) || "com.facebook.wakizashi".equals(str) || "com.facebook.lite".equals(str)) {
                if (AbstractC14490oL.A0J(packageManager, str)) {
                    return str;
                }
            }
        }
        return null;
    }
}
