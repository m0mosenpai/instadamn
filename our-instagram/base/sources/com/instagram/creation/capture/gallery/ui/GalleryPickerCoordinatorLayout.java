package com.instagram.creation.capture.gallery.ui;

import X.AbstractC167017dG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes8.dex */
public final class GalleryPickerCoordinatorLayout extends CoordinatorLayout {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryPickerCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        AbstractC167017dG.A1N(view, view2);
        this.A02 = view;
        this.A03 = view2;
        this.A00 = i;
        this.A01 = i2;
        return super.Do4(view, view2, i, i2);
    }
}
