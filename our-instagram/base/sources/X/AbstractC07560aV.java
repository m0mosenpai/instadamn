package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

/* renamed from: X.0aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07560aV extends AbstractC04710Mn {
    @Override // X.AbstractC04710Mn
    public final Object A03(String str) {
        return this;
    }

    public abstract void A05(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh);

    public boolean A06(String str) {
        return true;
    }

    @Override // X.AbstractC04710Mn, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        ActivityInfo activityInfo;
        IntentFilter intentFilter;
        int A01 = C0f9.A01(-619043177);
        try {
            super.onReceive(context, intent);
        } catch (SecurityException e) {
            AbstractC08070bT.A00.A00(intent, A04(context), null, "deny");
            i = 17134509;
            if (e instanceof C08710cZ) {
                C0f9.A0E(-1462407272, A01, intent);
                throw e;
            }
        }
        if (intent.getComponent() != null) {
            String action = intent.getAction();
            action.getClass();
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent(action);
            try {
                packageManager.getClass();
                for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent2, 64)) {
                    if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && ((PackageItemInfo) activityInfo).packageName.equals(context.getPackageName()) && ((PackageItemInfo) resolveInfo.activityInfo).name.equals(intent.getComponent().getClassName()) && (intentFilter = resolveInfo.filter) != null) {
                        int countActions = intentFilter.countActions();
                        for (int i2 = 0; i2 < countActions; i2++) {
                            String action2 = intentFilter.getAction(i2);
                            if (action2 == null || action2.compareTo(action) != 0) {
                            }
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
            AbstractC08070bT.A00.A00(intent, A04(context), null, "deny");
            i = 2038865751;
            C0f9.A0E(i, A01, intent);
        }
        if (!A06(intent.getAction())) {
            AbstractC08070bT.A00.A00(intent, A04(context), null, "deny");
            i = 1464439651;
        } else {
            A05(context, intent, this);
            AbstractC08070bT.A00.A00(intent, A04(context), null, "allow");
            i = -2099207629;
        }
        C0f9.A0E(i, A01, intent);
    }
}
