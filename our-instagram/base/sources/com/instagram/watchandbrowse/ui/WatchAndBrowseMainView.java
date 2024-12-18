package com.instagram.watchandbrowse.ui;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C65847Tv8;
import X.J11;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgView;
import com.instagram.ui.gesture.GestureManagerFrameLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class WatchAndBrowseMainView extends IgFrameLayout {
    public IgFrameLayout A00;
    public IgFrameLayout A01;
    public IgView A02;
    public Integer A03;
    public IgFrameLayout A04;
    public GestureManagerFrameLayout A05;
    public final IgSimpleImageView A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchAndBrowseMainView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A00(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        GestureManagerFrameLayout gestureManagerFrameLayout = (GestureManagerFrameLayout) this.A04.requireViewById(R.id.gesture_manager);
        this.A05 = gestureManagerFrameLayout;
        if (gestureManagerFrameLayout != null) {
            gestureManagerFrameLayout.requestDisallowInterceptTouchEvent(true);
            GestureDetector gestureDetector = new GestureDetector(getContext(), simpleOnGestureListener);
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            A1E.add(new J11(gestureDetector));
            new C65847Tv8(gestureManagerFrameLayout, A1E, A1E2);
        }
    }

    public final IgSimpleImageView getDismissButton() {
        return this.A06;
    }

    public final Integer getShadowOverlap() {
        return this.A03;
    }

    public final IgFrameLayout getWatchAndBrowseMediaContainer() {
        return this.A01;
    }

    public final void setGradientVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public final void setShadowViewVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public final void setShadowOverlap(Integer num) {
        this.A03 = num;
    }

    public final void setWatchAndBrowseMediaContainer(IgFrameLayout igFrameLayout) {
        this.A01 = igFrameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchAndBrowseMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_watch_and_browse, this);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(48));
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        this.A04 = igFrameLayout;
        this.A02 = (IgView) igFrameLayout.requireViewById(R.id.browser_shadow);
        this.A00 = (IgFrameLayout) this.A04.requireViewById(R.id.dismiss_button_immersive_gradient);
        this.A06 = (IgSimpleImageView) this.A04.requireViewById(R.id.dismiss_button);
        this.A01 = (IgFrameLayout) this.A04.requireViewById(R.id.watch_and_browse_media_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2T);
            C14360o3.A07(obtainStyledAttributes);
            this.A02.setVisibility(obtainStyledAttributes.getBoolean(0, false) ? 0 : 8);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchAndBrowseMainView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ WatchAndBrowseMainView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
