package com.instagram.debug.quickexperiment.storage;

import X.C18V;
import X.C1AC;
import X.C229419w;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes.dex */
public class QuickExperimentDebugStoreManager {
    public static final HashMap OVERRIDE_STORE_PER_USER = new HashMap();
    public static final String TAG = "QuickExperimentDebugStoreManager";

    public static synchronized QuickExperimentDebugStore getOverrideStore(UserSession userSession) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            String str = userSession.userId;
            HashMap hashMap = OVERRIDE_STORE_PER_USER;
            quickExperimentDebugStore = (QuickExperimentDebugStore) hashMap.get(str);
            if (quickExperimentDebugStore == null) {
                C18V c18v = C18V.A01;
                if (c18v != null) {
                    C229419w c229419w = c18v.A01().A01.A00;
                    C1AC A02 = c18v.A02(userSession);
                    A02.getClass();
                    quickExperimentDebugStore = QuickExperimentDebugStore.create(A02.A01.A00, c229419w);
                    hashMap.put(str, quickExperimentDebugStore);
                } else {
                    throw new IllegalStateException("Failed to getOverrideStore, null QuickExperimentManagerFactory");
                }
            }
        }
        return quickExperimentDebugStore;
    }
}
