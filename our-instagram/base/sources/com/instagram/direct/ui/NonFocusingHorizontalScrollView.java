package com.instagram.direct.ui;

import X.C14360o3;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class NonFocusingHorizontalScrollView extends HorizontalScrollView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonFocusingHorizontalScrollView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    @Override // android.view.View
    public final ArrayList getFocusables(int i) {
        return new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonFocusingHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonFocusingHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
