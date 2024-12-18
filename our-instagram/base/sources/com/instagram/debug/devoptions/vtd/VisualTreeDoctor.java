package com.instagram.debug.devoptions.vtd;

import X.AbstractC166987dD;
import X.AbstractC16960so;
import X.AbstractC31171DnF;
import X.AbstractC43592JPx;
import X.C14360o3;
import X.C2UU;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.debug.devoptions.vtd.analysis.VtdLinearLayoutAnalyzer;
import com.instagram.debug.devoptions.vtd.analysis.VtdMultipleLayoutPassAnalyzer;
import com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer;
import com.instagram.debug.devoptions.vtd.analysis.VtdViewAttachedLogger;
import com.instagram.debug.devoptions.vtd.analysis.VtdVisibilityAnalyzer;
import com.instagram.debug.devoptions.vtd.core.VtdBreadCrumb;
import com.instagram.debug.devoptions.vtd.core.VtdLifecycleEvent;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class VisualTreeDoctor {
    public final List analyzers;
    public final Set attachedRecyclers;
    public final Map breadCrumbs;
    public final VisualTreeDoctor$hierarchyChangeListener$1 hierarchyChangeListener;
    public final View.OnLayoutChangeListener layoutChangeListener;
    public final VtdLogger logger;
    public final VtdRecyclerViewAdapterDataObserver recyclerViewAdapterDataObserver;
    public final ViewGroup rootView;
    public final Set signedUpViews;

    /* JADX WARN: Type inference failed for: r0v7, types: [com.instagram.debug.devoptions.vtd.VisualTreeDoctor$hierarchyChangeListener$1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.instagram.debug.devoptions.vtd.output.VtdLogger] */
    public VisualTreeDoctor(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.rootView = viewGroup;
        this.signedUpViews = AbstractC31171DnF.A0l();
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        this.attachedRecyclers = A0l;
        this.recyclerViewAdapterDataObserver = new VtdRecyclerViewAdapterDataObserver(A0l, new VisualTreeDoctor$recyclerViewAdapterDataObserver$1(this), new VisualTreeDoctor$recyclerViewAdapterDataObserver$2(this));
        ?? obj = new Object();
        this.logger = obj;
        this.analyzers = AbstractC16960so.A1Q(new VtdVisibilityAnalyzer(obj), new VtdViewAttachedLogger(obj), new VtdLinearLayoutAnalyzer(obj), new VtdMultipleLayoutPassAnalyzer(obj));
        this.breadCrumbs = AbstractC166987dD.A1I();
        this.hierarchyChangeListener = new ViewGroup.OnHierarchyChangeListener() { // from class: com.instagram.debug.devoptions.vtd.VisualTreeDoctor$hierarchyChangeListener$1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (view2 != null) {
                    VisualTreeDoctor.this.attachToView(view2);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                if (view2 != null) {
                    VisualTreeDoctor.this.detachFromView(view2);
                }
            }
        };
        this.layoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.instagram.debug.devoptions.vtd.VisualTreeDoctor$layoutChangeListener$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                List A12 = AbstractC43592JPx.A12(view, VisualTreeDoctor.this.breadCrumbs);
                if (A12 != null) {
                    VisualTreeDoctor visualTreeDoctor = VisualTreeDoctor.this;
                    A12.add(new VtdBreadCrumb(Calendar.getInstance().getTimeInMillis(), VtdLifecycleEvent.LAYOUT));
                    for (VtdTreeAnalyzer vtdTreeAnalyzer : visualTreeDoctor.analyzers) {
                        C14360o3.A0A(view);
                        vtdTreeAnalyzer.onLayout(view, A12);
                    }
                }
            }
        };
        attachToView(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachToView(View view) {
        if (!this.signedUpViews.contains(view)) {
            view.addOnLayoutChangeListener(this.layoutChangeListener);
            this.signedUpViews.add(view);
            ArrayList A1N = AbstractC16960so.A1N(new VtdBreadCrumb(Calendar.getInstance().getTimeInMillis(), VtdLifecycleEvent.ATTACH));
            this.breadCrumbs.put(view, A1N);
            Iterator it = this.analyzers.iterator();
            while (it.hasNext()) {
                ((VtdTreeAnalyzer) it.next()).onAttach(view, A1N);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setOnHierarchyChangeListener(this.hierarchyChangeListener);
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C14360o3.A0A(childAt);
                    attachToView(childAt);
                }
            }
            if (view instanceof RecyclerView) {
                C2UU c2uu = ((RecyclerView) view).A0A;
                if (c2uu != null) {
                    c2uu.registerAdapterDataObserver(this.recyclerViewAdapterDataObserver);
                }
                this.attachedRecyclers.add(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachFromView(View view) {
        if (this.signedUpViews.contains(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setOnHierarchyChangeListener(null);
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C14360o3.A0A(childAt);
                    detachFromView(childAt);
                }
            }
            if (view instanceof RecyclerView) {
                try {
                    C2UU c2uu = ((RecyclerView) view).A0A;
                    if (c2uu != null) {
                        c2uu.unregisterAdapterDataObserver(this.recyclerViewAdapterDataObserver);
                    }
                } catch (Exception unused) {
                }
                this.attachedRecyclers.remove(view);
            }
            view.removeOnLayoutChangeListener(this.layoutChangeListener);
            this.signedUpViews.remove(view);
            List list = (List) this.breadCrumbs.remove(view);
            if (list != null) {
                list.add(new VtdBreadCrumb(Calendar.getInstance().getTimeInMillis(), VtdLifecycleEvent.DETACH));
                Iterator it = this.analyzers.iterator();
                while (it.hasNext()) {
                    ((VtdTreeAnalyzer) it.next()).onDetach(view, list);
                }
            }
        }
    }
}
