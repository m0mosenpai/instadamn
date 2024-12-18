package com.instagram.creation.capture.quickcapture.gallery.gallerygrid;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public final class BlockableCoordinatorLayout extends CoordinatorLayout {
    public boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockableCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(view2, 1);
        if (this.A00) {
            return super.Do4(view, view2, i, i2);
        }
        return true;
    }

    public final void setShouldScroll(boolean z) {
        this.A00 = z;
    }
}
