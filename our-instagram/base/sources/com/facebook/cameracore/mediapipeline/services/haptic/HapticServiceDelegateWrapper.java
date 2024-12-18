package com.facebook.cameracore.mediapipeline.services.haptic;

import X.C90Z;
import java.util.List;

/* loaded from: classes4.dex */
public class HapticServiceDelegateWrapper {
    public final C90Z mDelegate;

    public void cancel() {
        this.mDelegate.cancel();
    }

    public void vibrate(List list, List list2) {
        this.mDelegate.FDc(list, list2);
    }

    public void vibrateSingleShot() {
        this.mDelegate.FDd();
    }

    public HapticServiceDelegateWrapper(C90Z c90z) {
        this.mDelegate = c90z;
    }
}
