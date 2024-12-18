package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.facebook.common.gcmcompat.Task;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: X.Sho, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63336Sho {
    public static C63336Sho A01;
    public static final Integer A02 = 4;
    public final Context A00;

    public static Intent A00(ComponentName componentName, C63336Sho c63336Sho, String str) {
        C04750Mt c04750Mt = new C04750Mt();
        ((C08150bd) c04750Mt).A03 = componentName;
        return AbstractC58318PtA.A0E("com.google.android.gms.gcm.ACTION_SCHEDULE").setPackage("com.google.android.gms").putExtra("scheduler_action", str).putExtra("app", c04750Mt.A02(c63336Sho.A00, 0, 0)).putExtra(CacheBehaviorLogger.SOURCE, A02).putExtra("source_version", 12451000);
    }

    @Deprecated
    public static synchronized C63336Sho A01(Context context) {
        C63336Sho c63336Sho;
        synchronized (C63336Sho.class) {
            c63336Sho = A01;
            if (c63336Sho == null) {
                c63336Sho = new C63336Sho(context.getApplicationContext());
                A01 = c63336Sho;
            }
        }
        return c63336Sho;
    }

    public static void A02(C63336Sho c63336Sho, String str) {
        if (str != null) {
            Intent A0E = AbstractC58318PtA.A0E("com.google.android.gms.gcm.ACTION_TASK_READY");
            Context context = c63336Sho.A00;
            A0E.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(A0E, 512);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    if (((PackageItemInfo) it.next().serviceInfo).name.equals(str)) {
                        return;
                    }
                }
                throw AbstractC166987dD.A12("The GcmTaskService class you provided  does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.");
            }
            throw AbstractC166987dD.A12("There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        }
        throw AbstractC166987dD.A15("GcmTaskService must not be null.");
    }

    @Deprecated
    public final void A03(Task task) {
        String str = task.A00;
        A02(this, str);
        Context context = this.A00;
        Intent A00 = A00(new ComponentName(context, str), this, "SCHEDULE_TASK");
        if (A00 != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            task.A00(A0b);
            A00.putExtras(A0b);
            context.sendBroadcast(A00);
        }
    }

    public C63336Sho(Context context) {
        this.A00 = context;
    }
}
