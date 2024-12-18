package com.facebook.papaya.fb.instagram.executors.mldwfalco;

import X.AbstractC166987dD;
import X.AbstractC16960so;
import X.C09170dP;
import X.C0K8;
import X.C14360o3;
import X.C53721NpA;
import X.C56147OwB;
import X.MSW;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.executor.IExecutorFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class IgAnalyticsMldwFalcoExecutorFactory extends IExecutorFactory {
    public static final C53721NpA Companion = new Object();

    public IgAnalyticsMldwFalcoExecutorFactory(Context context, Bundle bundle) {
        C14360o3.A0B(bundle, 2);
        C09170dP.A0C("papaya-fb-fa-mldw-falco-ig-executor");
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (bundle.containsKey("enforce_secure_aggregation")) {
            A1I.put("enforce_secure_aggregation", String.valueOf(bundle.getBoolean("enforce_secure_aggregation")));
        }
        if (bundle.containsKey("min_kanon_threshold")) {
            A1I.put("min_kanon_threshold", String.valueOf(bundle.getInt("min_kanon_threshold")));
        }
        Iterator it = AbstractC16960so.A1Q("max_epsilon", "max_delta", "min_sensitivity").iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (bundle.containsKey(A1B)) {
                A1I.put(A1B, String.valueOf(bundle.getFloat(A1B)));
            }
        }
        try {
            C56147OwB.A01.A00(MSW.A0Q(this)).A00();
        } catch (IllegalStateException e) {
            C0K8.A0F("IgAnalyticsMldwFalcoExecutorFactory", "Failed to initialize mldw store due to invalid user session", e);
        }
        initHybrid(A1I);
    }

    private final native void initHybrid(Map map);
}
