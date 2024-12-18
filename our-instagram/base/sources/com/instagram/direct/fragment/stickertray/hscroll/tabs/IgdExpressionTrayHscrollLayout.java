package com.instagram.direct.fragment.stickertray.hscroll.tabs;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC46754KmB;
import X.AbstractC47343Kvs;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.C14360o3;
import X.C44430Jkj;
import X.EnumC46130KbU;
import X.InterfaceC11380iw;
import X.JQ0;
import X.JQ1;
import X.KKE;
import X.ViewOnClickListenerC48066LPr;
import X.ViewOnClickListenerC48072LPx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class IgdExpressionTrayHscrollLayout extends HorizontalScrollView {
    public C44430Jkj A00;
    public EnumC46130KbU A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.LinearLayout, android.view.View, X.Jkj] */
    private final void A00(Context context) {
        ?? linearLayout = new LinearLayout(context, null, 0);
        linearLayout.A00 = -1;
        linearLayout.setOrientation(0);
        this.A00 = linearLayout;
        super.addView((View) linearLayout, 0, new FrameLayout.LayoutParams(-1, -2));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWillNotDraw(false);
    }

    public final void A01(View.OnClickListener onClickListener, InterfaceC11380iw interfaceC11380iw, AbstractC47343Kvs abstractC47343Kvs) {
        C14360o3.A0B(abstractC47343Kvs, 0);
        KKE kke = new KKE(AbstractC166997dE.A0L(this), interfaceC11380iw, abstractC47343Kvs);
        addView(kke);
        kke.setSelected(false);
        kke.setOnClickListener(new ViewOnClickListenerC48066LPr(51, onClickListener, this));
    }

    private final void setTabOnClickListener(View view) {
        view.setOnClickListener(ViewOnClickListenerC48072LPx.A00(this, 28));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        if (view instanceof KKE) {
            AbstractC46754KmB.A00((KKE) view, this.A01);
            this.A00.addView(view);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AbstractC166987dD.A12("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    public final void setSelectedIndex(int i) {
        if (i < this.A00.getChildCount()) {
            View childAt = this.A00.getChildAt(i);
            if (childAt != null && childAt.isSelected()) {
                return;
            }
            this.A00.setSelectedIndex(i);
            Rect A0U = AbstractC166987dD.A0U();
            this.A00.getGlobalVisibleRect(A0U);
            Rect A0U2 = AbstractC166987dD.A0U();
            View childAt2 = this.A00.getChildAt(i);
            if (childAt2 != null) {
                childAt2.getGlobalVisibleRect(A0U2);
            }
            if ((A0U2.left > A0U.left && A0U2.right < A0U.right) || i >= this.A00.getChildCount()) {
                return;
            }
            smoothScrollBy(this.A00.getChildAt(i).getLeft() - getScrollX(), 0);
        }
    }

    public /* synthetic */ IgdExpressionTrayHscrollLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(i, makeMeasureSpec);
        JQ1.A0V(this, this.A01, EnumC46130KbU.A02, makeMeasureSpec);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A00.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.LinearLayout, X.Jkj] */
    public IgdExpressionTrayHscrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = EnumC46130KbU.A02;
        ?? linearLayout = new LinearLayout(context, null, 0);
        linearLayout.A00 = -1;
        linearLayout.setOrientation(0);
        this.A00 = linearLayout;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0Z);
            C14360o3.A07(obtainStyledAttributes);
            this.A01 = EnumC46130KbU.values()[obtainStyledAttributes.getInt(0, 0)];
            obtainStyledAttributes.recycle();
        }
        A00(context);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC167017dG.A1O(view, layoutParams);
        if (view instanceof KKE) {
            AbstractC46754KmB.A00((KKE) view, this.A01);
            this.A00.addView(view, i, layoutParams);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AbstractC166987dD.A12("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    public /* synthetic */ IgdExpressionTrayHscrollLayout(Context context, EnumC46130KbU enumC46130KbU, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? EnumC46130KbU.A02 : enumC46130KbU);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (view instanceof KKE) {
            AbstractC46754KmB.A00((KKE) view, this.A01);
            this.A00.addView(view, i);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AbstractC166987dD.A12("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdExpressionTrayHscrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof KKE) {
            AbstractC46754KmB.A00((KKE) view, this.A01);
            this.A00.addView(view, layoutParams);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AbstractC166987dD.A12("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.LinearLayout, X.Jkj] */
    public IgdExpressionTrayHscrollLayout(Context context, EnumC46130KbU enumC46130KbU) {
        super(context);
        AbstractC167017dG.A1P(context, enumC46130KbU);
        this.A01 = EnumC46130KbU.A02;
        ?? linearLayout = new LinearLayout(context, null, 0);
        linearLayout.A00 = -1;
        linearLayout.setOrientation(0);
        this.A00 = linearLayout;
        this.A01 = enumC46130KbU;
        A00(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdExpressionTrayHscrollLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
