package com.facebook.react.uimanager;

import X.AbstractC166997dE;
import X.C14360o3;
import X.InterfaceC65358Tim;
import X.R3M;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public abstract class ViewGroupManager extends BaseViewManager implements InterfaceC65358Tim {
    public static WeakHashMap mZIndexHash = new WeakHashMap();

    @Override // X.InterfaceC65358Tim
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* synthetic */ void removeAllViews(View view) {
        C14360o3.A0B(view, 1);
        int childCount = getChildCount(view);
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(view, childCount);
            } else {
                return;
            }
        }
    }

    public void removeView(ViewGroup viewGroup, View view) {
        for (int i = 0; i < getChildCount(viewGroup); i++) {
            if (getChildAt(viewGroup, i) == view) {
                removeViewAt(viewGroup, i);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
    }

    public void updateExtraData(ViewGroup viewGroup, Object obj) {
    }

    public static Integer getViewZIndex(View view) {
        return (Integer) mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i) {
        AbstractC166997dE.A1U(view, mZIndexHash, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    public ViewGroupManager(R3M r3m) {
        super(r3m);
    }

    public void addViews(ViewGroup viewGroup, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView(viewGroup, (View) list.get(i), i);
        }
    }

    public ViewGroupManager() {
        super(null);
    }

    @Override // 
    public void addView(ViewGroup viewGroup, View view, int i) {
        viewGroup.addView(view, i);
    }

    @Override // 
    public View getChildAt(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i);
    }

    @Override // 
    public int getChildCount(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    @Override // 
    public void removeViewAt(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
    }
}
