package com.instagram.debug.devoptions.vtd.analysis;

import X.C14360o3;
import android.view.View;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.List;

/* loaded from: classes8.dex */
public final class VtdViewAttachedLogger implements VtdTreeAnalyzer {
    public final VtdLogger logger;

    public VtdViewAttachedLogger(VtdLogger vtdLogger) {
        C14360o3.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onAttach(View view, List list) {
        C14360o3.A0B(view, 0);
        this.logger.logAttached(view);
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onDetach(View view, List list) {
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onLayout(View view, List list) {
    }
}
