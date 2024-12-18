package com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class CaptureFormatPickerTouchableContainer extends TouchInterceptorLinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureFormatPickerTouchableContainer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
