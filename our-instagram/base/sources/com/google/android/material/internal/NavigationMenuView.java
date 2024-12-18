package com.google.android.material.internal;

import X.AbstractC31174DnI;
import X.InterfaceC71870X8d;
import X.WQH;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC71870X8d {
    @Override // X.InterfaceC71870X8d
    public final void COE(WQH wqh) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC31174DnI.A16(context, this, 1, false);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }
}
