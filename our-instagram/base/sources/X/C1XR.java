package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1XR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XR extends C1XS {
    public final InterfaceC09390do A00;

    public C1XR(final Context context) {
        Object obj = new Object();
        HashMap hashMap = C1WZ.A09;
        hashMap.put("gdpr_consent", obj);
        hashMap.put("underage_appeal", obj);
        C27741Wc.A01().A05(new C1WJ(context) { // from class: X.1XW
            public final Context A00;

            @Override // X.C1WJ
            public final void AB1(C116155Nu c116155Nu, UserSession userSession, String str) {
            }

            @Override // X.C1WJ
            public final boolean ACT(C116155Nu c116155Nu, C116155Nu c116155Nu2) {
                return false;
            }

            @Override // X.C1WJ
            public final C47690L3x AEk(UserSession userSession, String str, String str2, List list, boolean z) {
                C14360o3.A0B(str2, 2);
                C14360o3.A0B(list, 3);
                Context context2 = this.A00;
                XN9 A05 = AbstractC55212OeW.A05(context2, userSession, "gdpr", str2, list);
                A05.A05 = 1;
                A05.A05(context2.getColor(R.color.gdpr_notif_led_color), DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 1000);
                long[] jArr = MTN.A04;
                Notification notification = A05.A0A;
                notification.vibrate = jArr;
                A05.A0E(true);
                notification.when = 0L;
                C116155Nu c116155Nu = (C116155Nu) list.get(list.size() - 1);
                String str3 = c116155Nu.A0X;
                if ("gdpr_consent".equals(str3)) {
                    A05.A06(AbstractC55212OeW.A01(context2, null, c116155Nu, null, null), context2.getString(2131971171), 0);
                } else if ("underage_appeal".equals(str3)) {
                    String str4 = c116155Nu.A0g;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String queryParameter = AbstractC08820cl.A03(str4).getQueryParameter("redirect");
                    if (queryParameter != null) {
                        if (userSession != null) {
                            SXK sxk = new SXK(queryParameter);
                            sxk.A0C = true;
                            sxk.A0B = false;
                            Intent A00 = C35133Fea.A00(context2, userSession, new SimpleWebViewConfig(sxk));
                            C04750Mt c04750Mt = new C04750Mt();
                            c04750Mt.A0B(A00, context2.getClassLoader());
                            PendingIntent A01 = c04750Mt.A01(context2, 0, 134217728);
                            if (A01 != null) {
                                A05.A0C = A01;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                Notification A03 = A05.A03();
                C14360o3.A07(A03);
                A03.flags |= 32;
                C1Z6.A00(userSession).A03(A03, context2, list);
                return new C47690L3x(A03, c116155Nu, AbstractC55212OeW.A06(list, 10));
            }

            @Override // X.C1WJ
            public final String Amb() {
                return "gdpr";
            }

            @Override // X.C1WJ
            public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
            }

            {
                Context applicationContext = context.getApplicationContext();
                C14360o3.A07(applicationContext);
                this.A00 = applicationContext;
            }
        }, AbstractC19750y3.A01("insta_gdpr_notifications"), "gdpr");
        this.A00 = AbstractC09440dt.A01(C1XX.A00);
    }
}
