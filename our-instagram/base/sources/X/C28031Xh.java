package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.1Xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28031Xh extends C1WE {
    public Context A00;

    @Override // X.C1WE
    public final void A06(C116155Nu c116155Nu, UserSession userSession, String str) {
        String str2;
        String str3 = c116155Nu.A0X;
        boolean equals = "suspicious_login".equals(str3);
        if (C2OG.A01().A0B()) {
            try {
                FragmentActivity A06 = C2OG.A01().A06();
                if (A06 != null) {
                    C34648FOf c34648FOf = new C34648FOf(str, userSession.userId);
                    c34648FOf.A0G = c116155Nu.A11;
                    c34648FOf.A0E = c116155Nu.A0r;
                    Context context = this.A00;
                    C14360o3.A0B(context, 0);
                    C14360o3.A0B(str3, 1);
                    boolean equals2 = "suspicious_login".equals(str3);
                    int i = R.drawable.trusted_notification_icon;
                    if (equals2) {
                        i = R.drawable.login_notification_alert_icon;
                    }
                    c34648FOf.A01 = context.getDrawable(i);
                    c34648FOf.A0I = false;
                    c34648FOf.A03 = c116155Nu.A0B;
                    c34648FOf.A08 = new G8X(A06, c116155Nu, userSession, this, equals);
                    String str4 = c116155Nu.A0l;
                    if (str4 != null && (str2 = c116155Nu.A0n) != null) {
                        c34648FOf.A06 = new SimpleImageUrl(AbstractC31254Doc.A00(context, Double.parseDouble(str4), Double.parseDouble(str2)));
                    }
                    C2OG A01 = C2OG.A01();
                    if (A01.A0B()) {
                        A01.A0A(new C35129FeW(c34648FOf));
                        return;
                    }
                    return;
                }
            } catch (IndexOutOfBoundsException unused) {
                C0w9.A03("LoginPushNotificationHandler", AnonymousClass001.A1D("Did not show in-app notification due to unavailable fragmentActivity. showSuspiciousLogin = ", equals));
                return;
            }
        }
        C0w9.A03("LoginPushNotificationHandler", AnonymousClass001.A1D("Activity is null. showSuspiciousLogin = ", equals));
    }

    @Override // X.C1WE
    public final boolean A09(C116155Nu c116155Nu, UserSession userSession, String str) {
        return true;
    }

    @Override // X.C1WE
    public final String A0C() {
        return "suspicious_login";
    }

    @Override // X.C1WE
    public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
        boolean z;
        String str2 = c116155Nu.A0X;
        if (C0BQ.A00(abstractC12990ll).CPH(c116155Nu.A0j) && (str2.equals("suspicious_login") || str2.equals("two_factor_trusted_notification"))) {
            z = true;
        } else {
            z = false;
        }
        l85.A00(z);
    }
}
