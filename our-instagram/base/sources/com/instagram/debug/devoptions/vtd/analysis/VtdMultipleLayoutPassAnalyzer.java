package com.instagram.debug.devoptions.vtd.analysis;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.C14360o3;
import android.view.View;
import com.instagram.debug.devoptions.vtd.core.VtdBreadCrumb;
import com.instagram.debug.devoptions.vtd.core.VtdLifecycleEvent;
import com.instagram.debug.devoptions.vtd.output.VtdIssueCategory;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class VtdMultipleLayoutPassAnalyzer implements VtdTreeAnalyzer {
    public static final Companion Companion = new Object();
    public static final long LAYOUT_TIME_SPAN_THRESHOLD_MSEC = 500;
    public final Set loggedViews;
    public final VtdLogger logger;

    public VtdMultipleLayoutPassAnalyzer(VtdLogger vtdLogger) {
        C14360o3.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
        this.loggedViews = AbstractC31171DnF.A0l();
    }

    private final boolean isWithinThreshold(long j, long j2) {
        return AbstractC167007dF.A1O(((j - j2) > 500L ? 1 : ((j - j2) == 500L ? 0 : -1)));
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onAttach(View view, List list) {
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onDetach(View view, List list) {
    }

    private final boolean hasMultipleLayoutPasses(List list) {
        Iterator it = list.iterator();
        VtdBreadCrumb vtdBreadCrumb = null;
        while (it.hasNext()) {
            VtdBreadCrumb vtdBreadCrumb2 = (VtdBreadCrumb) it.next();
            if (vtdBreadCrumb2.lifecycleEvent == VtdLifecycleEvent.LAYOUT) {
                if (vtdBreadCrumb == null) {
                    vtdBreadCrumb = vtdBreadCrumb2;
                } else if (AbstractC167007dF.A1O(((vtdBreadCrumb2.timestamp - vtdBreadCrumb.timestamp) > 500L ? 1 : ((vtdBreadCrumb2.timestamp - vtdBreadCrumb.timestamp) == 500L ? 0 : -1)))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer
    public void onLayout(View view, List list) {
        AbstractC167017dG.A1N(view, list);
        if (!this.loggedViews.contains(view) && hasMultipleLayoutPasses(list)) {
            this.logger.logVTD(VtdIssueCategory.MULTI_LAYOUT.getTag(), view);
            this.loggedViews.add(view);
        }
    }

    /* loaded from: classes8.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
