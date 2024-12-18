package com.facebook.appcomponentmanager;

import X.AbstractC166987dD;
import X.AbstractC210811k;
import X.AbstractC58320PtC;
import X.AbstractC58323PtF;
import X.AbstractC63228Sfg;
import X.AnonymousClass028;
import X.C0K8;
import X.C0L8;
import X.C0Wg;
import X.C62613SIv;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public class AppComponentManagerService extends AnonymousClass028 {
    @Override // X.AnonymousClass028
    public final void onHandleWork(Intent intent) {
        C0Wg c0Wg;
        intent.getAction();
        if ("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS".equals(intent.getAction())) {
            try {
                AbstractC210811k.A03(this);
                sendBroadcast(AbstractC58320PtC.A0B(this, "com.facebook.appcomponentmanager.ENABLING_CMPS_DONE"));
                return;
            } catch (RuntimeException e) {
                th = e;
                C0K8.A0F("AppComponentManagerService", "Exception while enabling components. Aborting.", th);
                synchronized (C0L8.class) {
                    c0Wg = C0L8.A00;
                    if (c0Wg == null) {
                        return;
                    }
                    c0Wg.A00(th);
                    return;
                }
            }
        }
        if ("com.facebook.appcomponentmanager.ACTION_EFNORCE_MANIFEST_CONSISTENCY".equals(intent.getAction())) {
            PackageManager packageManager = getPackageManager();
            HashSet A1H = AbstractC166987dD.A1H();
            A1H.add("activity");
            A1H.add("activity-alias");
            A1H.add("receiver");
            A1H.add("service");
            A1H.add("provider");
            Set unmodifiableSet = Collections.unmodifiableSet(A1H);
            File A11 = AbstractC166987dD.A11(getApplicationInfo().sourceDir);
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);
                C62613SIv A00 = AbstractC63228Sfg.A00(A11, unmodifiableSet);
                int i = packageInfo.versionCode;
                String num = Integer.toString(i);
                String str = A00.A01;
                if (num.equals(str) && packageInfo.versionName.equals(A00.A02) && packageInfo.packageName.equals(A00.A00)) {
                    return;
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("PackageInfo{package=");
                AbstractC58320PtC.A1N(packageInfo.packageName, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "versionCode=", A1C);
                A1C.append(i);
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A1C.append("versionName=");
                A1C.append(packageInfo.versionName);
                A1C.append("} ,");
                A1C.append("Manifest{package=");
                AbstractC58323PtF.A1O(A00.A00, ", ", "versionCode=", str, A1C);
                A1C.append(", ");
                A1C.append("versionName=");
                A1C.append(A00.A02);
                A1C.append(", ");
                A1C.append("activities=");
                A1C.append(A00.A03.size());
                A1C.append(", ");
                A1C.append("receivers=");
                A1C.append(A00.A05.size());
                A1C.append(", ");
                A1C.append("services=");
                A1C.append(A00.A06.size());
                A1C.append(", ");
                A1C.append("providers=");
                A1C.append(A00.A04.size());
                throw AbstractC58320PtC.A0o("}", A1C);
            } catch (Throwable th) {
                th = th;
                synchronized (C0L8.class) {
                    c0Wg = C0L8.A00;
                    if (c0Wg == null) {
                        C0K8.A0F("AppComponentManagerService", "enforceManifestConsistency failed", th);
                        return;
                    }
                    c0Wg.A00(th);
                    return;
                }
            }
        }
        return;
    }
}
