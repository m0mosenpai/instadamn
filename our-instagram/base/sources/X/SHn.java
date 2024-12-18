package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class SHn {
    public boolean A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final InterfaceC65284ThH A03;

    public SHn(Context context, InterfaceC65284ThH interfaceC65284ThH, String str) {
        boolean z;
        ApplicationInfo A0C;
        Bundle bundle;
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.A01 = createDeviceProtectedStorageContext;
        SharedPreferences A0F = AbstractC58318PtA.A0F(createDeviceProtectedStorageContext, AnonymousClass001.A0R("com.google.firebase.common.prefs:", str));
        this.A02 = A0F;
        this.A03 = interfaceC65284ThH;
        if (A0F.contains("firebase_data_collection_default_enabled")) {
            z = A0F.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = this.A01;
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager != null && (A0C = AbstractC58320PtC.A0C(context2, packageManager)) != null && (bundle = ((PackageItemInfo) A0C).metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z = ((PackageItemInfo) A0C).metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A00 = z;
    }
}
