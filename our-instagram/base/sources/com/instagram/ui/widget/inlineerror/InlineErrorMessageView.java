package com.instagram.ui.widget.inlineerror;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC31175DnJ;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C0f9;
import X.C14360o3;
import X.ViewTreeObserverOnPreDrawListenerC35720Fpu;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class InlineErrorMessageView extends LinearLayout {
    public static final TimeInterpolator A09 = new DecelerateInterpolator();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View A05;
    public TextView A06;
    public String A07;
    public boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineErrorMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A02(context, attributeSet);
    }

    private final void A02(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1c);
            C14360o3.A07(obtainStyledAttributes);
            this.A03 = obtainStyledAttributes.getResourceId(0, 0);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            this.A07 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 3);
            Context context2 = getContext();
            this.A02 = obtainStyledAttributes.getColor(4, context2.getColor(AbstractC53242c7.A09(context)));
            this.A01 = obtainStyledAttributes.getColor(2, context2.getColor(AbstractC53242c7.A03(context)));
            obtainStyledAttributes.recycle();
        }
    }

    private final void A00() {
        if (this.A06 == null) {
            View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.inline_error_text_view, (ViewGroup) this, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            this.A06 = (TextView) inflate;
            View childAt = getChildAt(0);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                TextView textView = this.A06;
                C14360o3.A0A(textView);
                ViewGroup.MarginLayoutParams A08 = AbstractC31175DnJ.A08(textView, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                A08.leftMargin = marginLayoutParams.leftMargin;
                A08.rightMargin = marginLayoutParams.rightMargin;
                addView(this.A06);
                return;
            }
            throw AbstractC166987dD.A14("InlineErrorMessageView has no children; it has to wrap at least one view.");
        }
    }

    private final void A01() {
        String str = this.A07;
        if (str != null && !this.A08) {
            A00();
            TextView textView = this.A06;
            C14360o3.A0A(textView);
            textView.setVisibility(0);
            TextView textView2 = this.A06;
            C14360o3.A0A(textView2);
            textView2.setText(str);
            TextView textView3 = this.A06;
            C14360o3.A0A(textView3);
            textView3.setTextColor(this.A02);
        }
    }

    public final void A03() {
        View view;
        TextView textView = this.A06;
        if (textView != null) {
            boolean z = this.A08;
            this.A08 = false;
            textView.setVisibility(8);
            if (z && (view = this.A05) != null) {
                view.setBackgroundDrawable(this.A04);
                Drawable drawable = this.A04;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }
            A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r0.getVisibility() != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L90
            int r3 = r7.length()
            r5 = 1
            int r3 = r3 - r5
            r4 = 0
            r2 = 0
            r1 = 0
        Lb:
            if (r2 > r3) goto L23
            r0 = r3
            if (r1 != 0) goto L11
            r0 = r2
        L11:
            boolean r0 = X.AbstractC167027dH.A19(r7, r0)
            if (r1 != 0) goto L1e
            if (r0 != 0) goto L1b
            r1 = 1
            goto Lb
        L1b:
            int r2 = r2 + 1
            goto Lb
        L1e:
            if (r0 == 0) goto L23
            int r3 = r3 + (-1)
            goto Lb
        L23:
            java.lang.String r0 = X.AbstractC31177DnL.A0g(r7, r3, r2)
            int r0 = r0.length()
            if (r0 == 0) goto L90
            boolean r3 = r6.A08
            android.widget.TextView r0 = r6.A06
            if (r0 == 0) goto L3a
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L3b
        L3a:
            r2 = 0
        L3b:
            r6.A08 = r5
            r6.A00()
            android.widget.TextView r0 = r6.A06
            X.C14360o3.A0A(r0)
            r0.setVisibility(r4)
            android.widget.TextView r0 = r6.A06
            X.C14360o3.A0A(r0)
            r0.setText(r7)
            android.widget.TextView r1 = r6.A06
            X.C14360o3.A0A(r1)
            int r0 = r6.A01
            r1.setTextColor(r0)
            if (r3 != 0) goto L67
            android.view.View r1 = r6.A05
            if (r1 == 0) goto L67
            int r0 = r6.A00
            if (r0 == 0) goto L67
            r1.setBackgroundResource(r0)
        L67:
            if (r2 != 0) goto L90
            android.widget.TextView r1 = r6.A06
            X.C14360o3.A0A(r1)
            r0 = 0
            r1.setAlpha(r0)
            android.widget.TextView r0 = r6.A06
            X.C14360o3.A0A(r0)
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.animation.TimeInterpolator r0 = com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A09
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r0.start()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A04(java.lang.String):void");
    }

    public final void setHint(String str) {
        this.A07 = str;
        A01();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(883834395);
        super.onFinishInflate();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC35720Fpu(this, 3));
        A01();
        C0f9.A0D(-1027431541, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineErrorMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A02(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineErrorMessageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        setOrientation(1);
    }
}
