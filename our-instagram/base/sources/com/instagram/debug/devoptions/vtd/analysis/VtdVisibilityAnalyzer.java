package com.instagram.debug.devoptions.vtd.analysis;

import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.C14360o3;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.ViewStubCompat;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class VtdVisibilityAnalyzer implements VtdTreeAnalyzer {
    public final Set loggedViews;
    public final VtdLogger logger;
    public final Map viewVisibilityMap;

    public VtdVisibilityAnalyzer(VtdLogger vtdLogger) {
        C14360o3.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
        this.viewVisibilityMap = AbstractC166987dD.A1I();
        this.loggedViews = AbstractC31171DnF.A0l();
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onAttach(View view, List list) {
        C14360o3.A0B(view, 0);
        if (isAnalyzable(view)) {
            AbstractC37301Gc2.A1T(view, this.viewVisibilityMap, view.getVisibility());
            checkVisibility(view);
        }
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onDetach(View view, List list) {
        C14360o3.A0B(view, 0);
        if (isAnalyzable(view)) {
            this.viewVisibilityMap.remove(view);
        }
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onLayout(View view, List list) {
        C14360o3.A0B(view, 0);
        if (isAnalyzable(view)) {
            Number A0Q = AbstractC37300Gc1.A0Q(view, this.viewVisibilityMap);
            int visibility = view.getVisibility();
            if (A0Q == null || visibility != A0Q.intValue()) {
                AbstractC37301Gc2.A1T(view, this.viewVisibilityMap, view.getVisibility());
                checkVisibility(view);
            }
        }
    }

    private final boolean isAnalyzable(View view) {
        if (!(view instanceof ViewStub) && !(view instanceof ViewStubCompat)) {
            return true;
        }
        return false;
    }

    private final void checkVisibility(View view) {
        if (view.getVisibility() != 0 && !this.loggedViews.contains(view)) {
            this.loggedViews.add(view);
            this.logger.logHidden(view);
        }
    }
}
