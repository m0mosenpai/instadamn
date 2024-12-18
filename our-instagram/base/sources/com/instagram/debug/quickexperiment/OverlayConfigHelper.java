package com.instagram.debug.quickexperiment;

import X.AbstractC111324zv;
import X.AbstractC20080yf;
import X.AbstractC20120yj;
import X.AbstractC58319PtB;
import X.C0K8;
import X.C0UI;
import X.C14360o3;
import X.XkT;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class OverlayConfigHelper {
    public static final OverlayConfigHelper INSTANCE = new Object();
    public static final String TAG = "OverlayConfigHelper";

    public static final boolean isOverlayConfig(AbstractC20080yf abstractC20080yf) {
        C14360o3.A0B(abstractC20080yf, 0);
        long j = abstractC20080yf.mobileConfigSpecifier;
        try {
            if (Arrays.binarySearch(XkT.A00, AbstractC20120yj.A00(j)) >= 0) {
                return true;
            }
            return false;
        } catch (C0UI e) {
            C0K8.A0M(TAG, AbstractC111324zv.A00(3618), e, AbstractC58319PtB.A1Y(j));
            return false;
        }
    }
}
