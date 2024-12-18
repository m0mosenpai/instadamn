package com.instagram.ui.simplevideolayout;

import X.AbstractC43201yn;
import X.C14360o3;
import X.InterfaceC74623Ww;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class SimpleVideoLayout extends AbstractC43201yn implements InterfaceC74623Ww {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleVideoLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, X.InterfaceC74623Ww
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(layoutParams, 2);
        super.attachViewToParent(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, X.InterfaceC74623Ww
    public final void detachViewFromParent(View view) {
        C14360o3.A0B(view, 0);
        super.detachViewFromParent(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ SimpleVideoLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
