package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149176nR {
    public C5SW A00;
    public InterfaceC145146gZ A01;
    public final Activity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

    public final void A00(View view, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
            return;
        }
        UserSession userSession = this.A04;
        C18920wW A01 = AbstractC12220kQ.A01(this.A03, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "reel_viewer_app_attribution_click");
        A00.AAP(MSV.A00(174), str2);
        A00.AAP("app_attribution_id", str);
        A00.Cht();
        C49505LuI c49505LuI = new C49505LuI(this, str, str2, str3, str4);
        Activity activity = this.A02;
        C5SU c5su = new C5SU(activity, new C149686oL(activity.getString(2131952977, str2)));
        c5su.A0B = false;
        c5su.A0G = true;
        c5su.A03(view);
        c5su.A01();
        c5su.A04 = c49505LuI;
        C5SW A002 = c5su.A00();
        this.A00 = A002;
        A002.A07(userSession);
    }

    public final void A01(String str, String str2, String str3, String str4) {
        if (str3 == null && str4 == null) {
            return;
        }
        Activity activity = this.A02;
        PackageManager packageManager = activity.getPackageManager();
        if (!TextUtils.isEmpty(str4)) {
            UserSession userSession = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A03;
            AbstractC54124NwM.A00(interfaceC11380iw, userSession, str, str2, "link");
            android.net.Uri A03 = AbstractC08820cl.A03(str4);
            if (C63357SiE.A03(activity, userSession, str4, interfaceC11380iw.getModuleName())) {
                return;
            }
            C14J A00 = C14J.A04.A00();
            A00.getClass();
            if (A00.A00(userSession, str4) != null) {
                Intent A04 = C14H.A00().A04(activity, A03);
                A04.putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", true);
                C12260kU.A0C(activity, A04);
                return;
            } else {
                if (C12260kU.A0B(activity, new Intent("android.intent.action.VIEW", A03))) {
                    return;
                }
                C12260kU.A0G(activity, A03);
                return;
            }
        }
        str3.getClass();
        boolean A0J = AbstractC14490oL.A0J(packageManager, str3);
        UserSession userSession2 = this.A04;
        InterfaceC11380iw interfaceC11380iw2 = this.A03;
        if (A0J) {
            AbstractC54124NwM.A00(interfaceC11380iw2, userSession2, str, str2, "app");
            packageManager.getClass();
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str3);
            launchIntentForPackage.getClass();
            C12260kU.A00(activity, launchIntentForPackage);
            return;
        }
        AbstractC54124NwM.A00(interfaceC11380iw2, userSession2, str, str2, "store");
        AbstractC14490oL.A07(activity, str3, "app_attribution");
    }

    public C149176nR(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = (Activity) context;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
    }
}
