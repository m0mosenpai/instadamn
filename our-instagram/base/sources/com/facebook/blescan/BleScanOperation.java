package com.facebook.blescan;

import X.C0K8;
import X.C62710SMy;
import X.C93R;
import X.SKH;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class BleScanOperation extends C93R {
    public SKH A00;
    public C62710SMy A01;
    public boolean A02;
    public final Context A03;
    public final ScheduledExecutorService A04;

    public static void A00(BleScanOperation bleScanOperation) {
        boolean z;
        bleScanOperation.A02 = false;
        bleScanOperation.A00 = null;
        C62710SMy c62710SMy = bleScanOperation.A01;
        if (c62710SMy != null) {
            synchronized (c62710SMy) {
                z = c62710SMy.A07;
            }
            if (z) {
                try {
                    bleScanOperation.A01.A00();
                } catch (Exception e) {
                    C0K8.A0F("com.facebook.blescan.BleScanOperation", "Exception stopping BLE scanning", e);
                }
            }
            bleScanOperation.A01 = null;
        }
    }

    public BleScanOperation(Context context, C62710SMy c62710SMy, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = scheduledExecutorService;
        this.A03 = context;
        this.A01 = c62710SMy;
    }
}
