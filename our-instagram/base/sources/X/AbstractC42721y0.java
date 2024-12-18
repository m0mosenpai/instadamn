package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1y0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42721y0 {
    public static boolean A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(Context context, C005001p c005001p, String str, int i, boolean z) {
        Parcelable parcelable;
        String str2;
        String str3;
        if (i != -1) {
            Intent intent = new Intent("com.facebook.analytics2.action.UPLOAD_JOB_RAN").setPackage(context.getPackageName());
            Bundle bundle = new Bundle();
            bundle.putInt("job_id", i);
            bundle.putString("hack_action", str);
            bundle.putBoolean("will_retry", z);
            int size = c005001p.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                File file = (File) c005001p.A06(i2);
                arrayList.add(c005001p.A05(i2));
                if (file != null) {
                    str3 = file.getAbsolutePath();
                } else {
                    str3 = null;
                }
                arrayList2.add(str3);
            }
            bundle.putStringArrayList("successful_processes", arrayList);
            bundle.putStringArrayList("newest_files_uploaded", arrayList2);
            Intent putExtras = intent.putExtras(bundle);
            Intent intent2 = new Intent("com.facebook.analytics2.action.UPLOAD_JOB_RAN.token");
            intent2.setPackage(context.getPackageName());
            int i3 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    i3 = 1140850688;
                }
                parcelable = PendingIntent.getBroadcast(context, 0, intent2, i3);
            } catch (SecurityException e) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int myUid = Process.myUid();
                String nameForUid = packageManager.getNameForUid(myUid);
                int callingUid = Binder.getCallingUid();
                String nameForUid2 = packageManager.getNameForUid(callingUid);
                Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                while (true) {
                    parcelable = null;
                    if (it.hasNext()) {
                        PackageInfo next = it.next();
                        if (next.applicationInfo.uid == myUid) {
                            str2 = next.packageName;
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                C0K8.A0P("UploadServiceBus", "%s, ctx_pm=%s, uid=%d, uid_pn=%s, calling_uid=%d, calling_uid_pn=%s, pi_pn=%s", e.getMessage(), packageName, Integer.valueOf(myUid), nameForUid, Integer.valueOf(callingUid), nameForUid2, str2);
            }
            Intent putExtra = putExtras.putExtra("uploader_service_broadcast_auth_token", parcelable);
            try {
                if (A00) {
                    C019707r.A00(context).A02(putExtra);
                    return;
                } else {
                    context.sendBroadcast(putExtra);
                    return;
                }
            } catch (RuntimeException e2) {
                if (e2 instanceof SecurityException) {
                    C0K8.A0J("UploadServiceBus", "Analytics2 not allowed in this application.", e2);
                    return;
                }
                Throwable cause = e2.getCause();
                if (cause != null) {
                    while (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    if (cause instanceof DeadObjectException) {
                        C0K8.A0F("UploadServiceBus", "Failed to send broadcast. Handler may have died", e2);
                        return;
                    }
                }
                throw e2;
            }
        }
        throw new IllegalArgumentException("jobId = -1");
    }

    public static void A00(BroadcastReceiver broadcastReceiver, Context context, Handler handler) {
        try {
            C0DJ.A02(broadcastReceiver, context, new IntentFilter("com.facebook.analytics2.action.UPLOAD_JOB_RAN"), handler, null, false);
        } catch (RuntimeException e) {
            C0K8.A0K("UploadServiceBus", "Registering receiver caused exception.", e);
        }
    }
}
