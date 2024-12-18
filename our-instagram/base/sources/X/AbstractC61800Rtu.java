package X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.TosAcceptedFlag;

/* renamed from: X.Rtu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61800Rtu {
    public static void A00(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.facebook.appmanager", 0);
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            ContentResolver contentResolver = context.getContentResolver();
            ComponentName componentName = new ComponentName(context, (Class<?>) TosAcceptedFlag.class);
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                C1Ro c1Ro = new C1Ro(context, context.getPackageManager());
                if (z && c1Ro.A01(2)) {
                    ContentValues contentValues = new ContentValues();
                    AbstractC58318PtA.A1B(contentValues, "terms_of_service_accepted", 1);
                    try {
                        int update = contentResolver.update(AbstractC58321PtD.A0L(packageName), contentValues, null, null);
                        if (update != 1) {
                            throw new Exception(AnonymousClass001.A0O("Expected 1 row changed, actually ", update));
                        }
                    } catch (IllegalArgumentException e) {
                        throw new Exception("Could not resolve content uri for firstparty settings", e);
                    } catch (Throwable th) {
                        throw new Exception("Unexpected failure.", th);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
