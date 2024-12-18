package com.instagram.debug.devoptions.vtd;

import X.AbstractC167027dH;
import X.AbstractC65392xb;
import X.C3OO;
import X.InterfaceC16660sJ;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;

/* loaded from: classes8.dex */
public final class VtdRecyclerViewAdapterDataObserver extends AbstractC65392xb {
    public final InterfaceC16660sJ attachToView;
    public final InterfaceC16660sJ detachFromView;
    public final Set recyclers;

    @Override // X.AbstractC65392xb
    public void onItemRangeInserted(int i, int i2) {
        View view;
        for (RecyclerView recyclerView : this.recyclers) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                C3OO A0V = recyclerView.A0V(i4);
                if (A0V != null && (view = A0V.itemView) != null) {
                    this.attachToView.invoke(view);
                }
            }
        }
    }

    @Override // X.AbstractC65392xb
    public void onItemRangeRemoved(int i, int i2) {
        View view;
        for (RecyclerView recyclerView : this.recyclers) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                C3OO A0V = recyclerView.A0V(i4);
                if (A0V != null && (view = A0V.itemView) != null) {
                    this.detachFromView.invoke(view);
                }
            }
        }
    }

    public VtdRecyclerViewAdapterDataObserver(Set set, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        AbstractC167027dH.A13(set, interfaceC16660sJ, interfaceC16660sJ2);
        this.recyclers = set;
        this.attachToView = interfaceC16660sJ;
        this.detachFromView = interfaceC16660sJ2;
    }
}
