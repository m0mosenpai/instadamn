package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.3VA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VA implements C3VB {
    public final Context A00;
    public final C3UW A01;

    public C3VA(Context context, Boolean bool) {
        this.A00 = context;
        C3UW c3uw = C3UW.A02;
        this.A01 = c3uw;
        if (bool != null) {
            c3uw.A00 = bool.booleanValue();
        }
    }

    public static final String A00(Intent intent) {
        int i;
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("auth_bundle");
            if (bundleExtra == null) {
                i = 1669;
            } else {
                PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("auth_pending_intent");
                if (pendingIntent == null) {
                    i = 1670;
                } else {
                    return pendingIntent.getCreatorPackage();
                }
            }
            C0K8.A0C("FbnsSecurityContextHelper", AbstractC111324zv.A00(i));
        }
        return null;
    }

    @Deprecated
    public final void A02(Intent intent) {
        PendingIntent pendingIntent;
        try {
            C04750Mt c04750Mt = new C04750Mt();
            c04750Mt.A0D = true;
            pendingIntent = c04750Mt.A01(this.A00, 0, 134217728);
        } catch (SecurityException | RuntimeException unused) {
            pendingIntent = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("auth_pending_intent", pendingIntent);
        intent.putExtra("auth_bundle", bundle);
    }

    public final Integer A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return C05F.A15;
        }
        Context context = this.A00;
        if (!str.equals(context.getPackageName())) {
            C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
            if (!c74123Uq.A08.contains(str) && !c74123Uq.A05.equals(str) && !c74123Uq.A04.equals(str)) {
                return C05F.A1I;
            }
            C3UX A01 = this.A01.A01(context, str, 64);
            C3V3.A00(context, A01);
            switch (A01.A02.intValue()) {
                case 1:
                    return C05F.A02;
                case 2:
                    return C05F.A03;
                case 3:
                    return C05F.A1F;
                case 4:
                case 5:
                default:
                    return C05F.A0u;
                case 6:
                    return C05F.A04;
                case 7:
                    break;
            }
        }
        return C05F.A05;
    }
}
