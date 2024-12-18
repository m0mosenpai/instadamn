package com.instagram.debug.devoptions.vtd;

import X.AbstractC25229BEm;
import X.C03E;
import X.C0eB;
import X.InterfaceC16660sJ;
import android.view.View;

/* loaded from: classes8.dex */
public final /* synthetic */ class VisualTreeDoctor$recyclerViewAdapterDataObserver$1 extends C03E implements InterfaceC16660sJ {
    public VisualTreeDoctor$recyclerViewAdapterDataObserver$1(Object obj) {
        super(1, obj, VisualTreeDoctor.class, "attachToView", "attachToView(Landroid/view/View;)V", 0);
    }

    public final void invoke(View view) {
        ((VisualTreeDoctor) AbstractC25229BEm.A0o(view, this)).attachToView(view);
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C0eB.A00;
    }
}
