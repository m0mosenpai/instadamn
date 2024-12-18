package com.instagram.debug.devoptions.vtd.analysis;

import X.AbstractC31171DnF;
import X.C14360o3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.debug.devoptions.vtd.output.VtdIssueCategory;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class VtdLinearLayoutAnalyzer implements VtdTreeAnalyzer {
    public final Set loggedViews;
    public final VtdLogger logger;

    public VtdLinearLayoutAnalyzer(VtdLogger vtdLogger) {
        C14360o3.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
        this.loggedViews = AbstractC31171DnF.A0l();
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onAttach(View view, List list) {
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onDetach(View view, List list) {
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onLayout(View view, List list) {
        C14360o3.A0B(view, 0);
        if (view instanceof LinearLayout) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof LinearLayout.LayoutParams) && ((LinearLayout.LayoutParams) layoutParams).weight > 0.0f && !this.loggedViews.contains(view)) {
                this.loggedViews.add(view);
                this.logger.logVTD(VtdIssueCategory.LINEAR_LAYOUT.getTag(), view);
            }
        }
    }
}
