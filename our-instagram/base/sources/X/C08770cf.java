package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.ServiceInfo;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08770cf {
    public static Intent A00;
    public static final C08770cf A01 = new Object();
    public static final List A02 = new ArrayList();

    public final void A02(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i) {
        String str;
        String str2;
        C14360o3.A0B(lightweightQuickPerformanceLogger, 0);
        Intent intent = A00;
        if (intent != null) {
            str = A00(intent);
        } else {
            str = "None";
        }
        lightweightQuickPerformanceLogger.markerAnnotate(i, "first_intent_from_dextr", str);
        List list = A02;
        Intent intent2 = (Intent) AbstractC001800i.A0J(list);
        if (intent2 != null) {
            str2 = A00(intent2);
        } else {
            str2 = "None";
        }
        lightweightQuickPerformanceLogger.markerAnnotate(i, "first_intent_from_peeker", str2);
        lightweightQuickPerformanceLogger.markerAnnotate(i, "peeker_intent_count", list.size());
        lightweightQuickPerformanceLogger.markerAnnotate(i, "component_sequence", C58325PtI.A00());
    }

    public static final String A00(Intent intent) {
        String str;
        String str2;
        String str3;
        if (intent == null) {
            return "empty";
        }
        String action = intent.getAction();
        if (action == null) {
            action = "unknown_action";
        }
        ComponentName component = intent.getComponent();
        if (component == null || (str = component.flattenToShortString()) == null) {
            str = "unknown_component";
        }
        java.util.Set<String> categories = intent.getCategories();
        if (categories != null) {
            str2 = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", categories, null);
        } else {
            str2 = "no_categories";
        }
        android.net.Uri data = intent.getData();
        if (data != null && data.isHierarchical()) {
            android.net.Uri data2 = intent.getData();
            if (data2 == null || (str3 = data2.getQueryParameter("push_category")) == null) {
                str3 = "no_push_cat";
            }
        } else {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(action);
        sb.append(':');
        sb.append(str2);
        sb.append(':');
        sb.append(str3);
        return sb.toString();
    }

    public final void A01(Service service, Intent intent) {
        if (A00 == null) {
            try {
                ServiceInfo serviceInfo = service.getPackageManager().getServiceInfo(new ComponentName(service, service.getClass()), 128);
                C14360o3.A07(serviceInfo);
                if (((ComponentInfo) serviceInfo).enabled && A00 == null) {
                    A00 = intent;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
