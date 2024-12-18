package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;

/* renamed from: X.9w4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224799w4 {
    public static final C2040490t A00(Bundle bundle) {
        Object parcelable;
        Integer num;
        if (bundle.containsKey("trackerPatchSize") && bundle.containsKey("trackerScales") && bundle.containsKey("useSimilarityTracker") && bundle.containsKey("setScaleByARClass") && bundle.containsKey("executionMode") && bundle.containsKey("deviceConfig") && bundle.containsKey("startPlaneTrackingOnLoad") && bundle.containsKey("deviceType")) {
            int i = bundle.getInt("trackerPatchSize");
            int i2 = bundle.getInt("trackerScales");
            boolean z = bundle.getBoolean("useSimilarityTracker");
            boolean z2 = bundle.getBoolean("setScaleByARClass");
            int i3 = bundle.getInt("executionMode");
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = bundle.getParcelable("deviceConfig", DeviceConfig.class);
            } else {
                parcelable = bundle.getParcelable("deviceConfig");
            }
            DeviceConfig deviceConfig = (DeviceConfig) parcelable;
            boolean z3 = bundle.getBoolean("startPlaneTrackingOnLoad");
            String string = bundle.getString("deviceType");
            if (deviceConfig != null && string != null) {
                if (i3 != 0 && i3 == 1) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                C2040490t c2040490t = new C2040490t(deviceConfig, num, string, i, i2, z, z2);
                c2040490t.A01 = z3;
                return c2040490t;
            }
            return null;
        }
        return null;
    }
}
