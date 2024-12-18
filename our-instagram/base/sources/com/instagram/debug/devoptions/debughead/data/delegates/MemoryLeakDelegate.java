package com.instagram.debug.devoptions.debughead.data.delegates;

import X.EnumC72364Xc0;
import X.Ytl;
import X.Ytm;
import java.util.Collection;

/* loaded from: classes12.dex */
public interface MemoryLeakDelegate {
    void onHeapAnalysisFailure(Ytl ytl);

    void onHeapAnalysisProgress(EnumC72364Xc0 enumC72364Xc0);

    void onHeapAnalysisSuccess(Ytm ytm);

    void onLeaksDetected(Collection collection);
}
