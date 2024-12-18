package X;

import android.app.Activity;
import android.content.Intent;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.2hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC55762hH {
    public static final InterfaceC08100bW A00;
    public static final C18240vB A01;
    public static final SecureRandom A02 = new SecureRandom();
    public static final java.util.Set A03 = new HashSet(Arrays.asList("com.facebook.katana", "com.facebook.wakizashi", "com.facebook.orca", "com.whatsapp"));

    static {
        C0o0 A002 = AbstractC14350nz.A00();
        A002.A01 = "FamilyBridgesLogger";
        A01 = new C18240vB(A002);
        A00 = new C1QF("IgSecureUriParser").A00;
    }

    public static void A00(Activity activity, Intent intent, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        android.net.Uri referrer;
        String queryParameter;
        if (intent != null && (referrer = activity.getReferrer()) != null && "android-app".equals(referrer.getScheme()) && A03.contains(referrer.getAuthority())) {
            String authority = referrer.getAuthority();
            String dataString = intent.getDataString();
            String stringExtra = intent.getStringExtra("funlid");
            String A002 = AbstractC111324zv.A00(528);
            String stringExtra2 = intent.getStringExtra(A002);
            String A003 = AbstractC111324zv.A00(870);
            String stringExtra3 = intent.getStringExtra(A003);
            C19280xC A004 = C19280xC.A00(interfaceC11380iw, "opened_from_family_app");
            A004.A0C("source_package", authority);
            String A005 = AbstractC111324zv.A00(957);
            if (stringExtra != null) {
                A004.A0C(A005, stringExtra);
            }
            if (stringExtra2 != null) {
                A004.A0C(A002, stringExtra2);
            }
            if (stringExtra3 != null) {
                A004.A0C(A003, stringExtra3);
            }
            if (dataString != null) {
                A004.A0C("url", dataString);
                android.net.Uri A012 = AbstractC08820cl.A01(A00, dataString);
                if (A012 != null && (queryParameter = A012.getQueryParameter("funlid")) != null) {
                    A004.A0C("funnel_id_from_url", queryParameter);
                }
            }
            AbstractC11060iN.A00(abstractC12990ll).EHW(A004);
        }
    }
}
