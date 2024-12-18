package com.instagram.igds.components.segmentedtabs;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC44429Jkg;
import X.AbstractC47051Kr8;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.C14360o3;
import X.C43748JWj;
import X.C44435Jko;
import X.C44436Jks;
import X.EnumC46131KbV;
import X.JQ0;
import X.JQ1;
import X.ViewOnClickListenerC48074LPz;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Deprecated(message = "Please use IgSegmentedTabLayout instead, it now supports ViewPager2")
/* loaded from: classes8.dex */
public final class IgSegmentedTabLayout2 extends AbstractC44429Jkg {
    public int A00;
    public int A01;
    public int A02;
    public ViewPager2 A03;
    public C44436Jks A04;
    public EnumC46131KbV A05;
    public boolean A06;

    public final void setViewPager(ViewPager2 viewPager2) {
        C14360o3.A0B(viewPager2, 0);
        this.A03 = viewPager2;
        viewPager2.A05(new C43748JWj(this, 7));
    }

    private final void setTabOnClickListener(View view) {
        view.setOnClickListener(ViewOnClickListenerC48074LPz.A00(this, 66));
        int childCount = getChildCount();
        int i = this.A00;
        if (childCount == i + 1) {
            this.A04.A02(i, this.A06);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        if (view instanceof C44435Jko) {
            AbstractC47051Kr8.A00(this.A05, (C44435Jko) view);
            C44436Jks c44436Jks = this.A04;
            c44436Jks.addView(view);
            setTabOnClickListener(view);
            c44436Jks.A01();
            return;
        }
        throw AbstractC166987dD.A12("TabContainer supports children only of TabView type.");
    }

    public final int getContainerChildCount() {
        return this.A04.getChildCount();
    }

    public final int getSelectedIndex() {
        ViewPager2 viewPager2 = this.A03;
        if (viewPager2 != null) {
            return viewPager2.A00;
        }
        return this.A04.A01;
    }

    public /* synthetic */ IgSegmentedTabLayout2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(i, makeMeasureSpec);
        JQ1.A0V(this, this.A05, EnumC46131KbV.A02, makeMeasureSpec);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A04.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A05 = EnumC46131KbV.A02;
        this.A04 = new C44436Jks(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1G);
            C14360o3.A07(obtainStyledAttributes);
            this.A05 = EnumC46131KbV.values()[obtainStyledAttributes.getInt(0, 0)];
            obtainStyledAttributes.recycle();
        }
        C44436Jks c44436Jks = new C44436Jks(context);
        this.A04 = c44436Jks;
        super.addView(c44436Jks, 0, new FrameLayout.LayoutParams(-1, -2));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWillNotDraw(false);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC167017dG.A1O(view, layoutParams);
        if (view instanceof C44435Jko) {
            AbstractC47051Kr8.A00(this.A05, (C44435Jko) view);
            C44436Jks c44436Jks = this.A04;
            c44436Jks.addView(view, i, layoutParams);
            setTabOnClickListener(view);
            c44436Jks.A01();
            return;
        }
        throw AbstractC166987dD.A12("TabContainer supports children only of TabView type.");
    }

    public /* synthetic */ IgSegmentedTabLayout2(Context context, EnumC46131KbV enumC46131KbV, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? EnumC46131KbV.A02 : enumC46131KbV);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (view instanceof C44435Jko) {
            AbstractC47051Kr8.A00(this.A05, (C44435Jko) view);
            C44436Jks c44436Jks = this.A04;
            c44436Jks.addView(view, i);
            setTabOnClickListener(view);
            c44436Jks.A01();
            return;
        }
        throw AbstractC166987dD.A12("TabContainer supports children only of TabView type.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C44435Jko) {
            AbstractC47051Kr8.A00(this.A05, (C44435Jko) view);
            C44436Jks c44436Jks = this.A04;
            c44436Jks.addView(view, layoutParams);
            setTabOnClickListener(view);
            c44436Jks.A01();
            return;
        }
        throw AbstractC166987dD.A12("TabContainer supports children only of TabView type.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context, EnumC46131KbV enumC46131KbV) {
        super(context, null, 0);
        AbstractC167017dG.A1P(context, enumC46131KbV);
        this.A05 = EnumC46131KbV.A02;
        this.A04 = new C44436Jks(context);
        this.A05 = enumC46131KbV;
        C44436Jks c44436Jks = new C44436Jks(context);
        this.A04 = c44436Jks;
        super.addView(c44436Jks, 0, new FrameLayout.LayoutParams(-1, -2));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
