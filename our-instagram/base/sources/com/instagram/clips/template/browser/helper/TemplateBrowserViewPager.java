package com.instagram.clips.template.browser.helper;

import X.C0f9;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class TemplateBrowserViewPager extends ViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateBrowserViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0f9.A0C(-1237493160, C0f9.A05(-1816970226));
        return false;
    }

    public /* synthetic */ TemplateBrowserViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
