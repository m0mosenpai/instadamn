package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.S3a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62229S3a {
    public static void A00(Context context) {
        RNA rna = RN5.A00;
        Object[] objArr = {"ocr"};
        if (objArr[0] != null) {
            RN4 rn4 = new RN4(objArr, 1);
            Intent A04 = AbstractC31171DnF.A04();
            A04.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            A04.setAction("com.google.android.gms.vision.DEPENDENCY");
            A04.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, rn4));
            A04.putExtra("requester_app_package", ((PackageItemInfo) context.getApplicationInfo()).packageName);
            context.sendBroadcast(A04);
            return;
        }
        throw AbstractC58322PtE.A0k(0);
    }
}
