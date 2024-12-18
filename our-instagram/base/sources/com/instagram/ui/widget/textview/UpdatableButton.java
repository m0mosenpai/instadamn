package com.instagram.ui.widget.textview;

import X.C05F;
import X.C14360o3;
import X.C1QI;
import X.C1QL;
import X.InterfaceC85983sV;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes2.dex */
public class UpdatableButton extends ImageWithTitleTextView implements InterfaceC85983sV {
    public GradientDrawable A00;
    public Integer A01;
    public final C1QL A02;
    public static final int[] A04 = {R.attr.state_blue};
    public static final int[] A06 = {R.attr.state_grey};
    public static final int[] A05 = {R.attr.state_disabled_blue, R.attr.state_blue};
    public static final int[] A07 = {R.attr.state_transparent};
    public static final int[] A03 = {R.attr.state_black};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableButton(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        this.A01 = C05F.A01;
        this.A02 = C1QI.A0E();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setPrismBackground(int[] r8) {
        /*
            r7 = this;
            X.1QL r3 = r7.A02
            boolean r0 = r3.A00
            if (r0 == 0) goto L71
            android.graphics.drawable.GradientDrawable r0 = r7.A00
            if (r0 != 0) goto L11
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r7.A00 = r0
        L11:
            java.lang.Integer r2 = r7.A01
            java.lang.Integer r0 = X.C05F.A0j
            if (r2 != r0) goto L83
            android.content.Context r5 = r7.getContext()
            X.C14360o3.A07(r5)
            r0 = 0
            android.content.res.ColorStateList r2 = X.C1QI.A0B(r5, r0)
        L23:
            android.graphics.drawable.GradientDrawable r1 = r7.A00
            if (r1 == 0) goto La7
            int r0 = r2.getDefaultColor()
            int r0 = r2.getColorForState(r8, r0)
            r1.setColor(r0)
            android.content.res.Resources r6 = r7.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r6.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r1.setCornerRadius(r0)
            X.1QL r4 = X.C1QL.A04
            r0 = 0
            if (r3 != r4) goto L47
            r0 = 1
        L47:
            r3 = 0
            r1 = 0
            if (r0 == 0) goto L6a
            java.lang.Integer r2 = r7.A01
            java.lang.Integer r0 = X.C05F.A0u
            if (r2 != r0) goto L72
            X.C14360o3.A07(r5)
            X.1QL r0 = X.C1QI.A0E()
            if (r0 != r4) goto L61
            r0 = 2131100457(0x7f060329, float:1.7813296E38)
        L5d:
            android.content.res.ColorStateList r1 = X.C02G.A02(r5, r0)
        L61:
            if (r1 == 0) goto L6a
            r0 = 2131165257(0x7f070049, float:1.7944726E38)
            int r3 = r6.getDimensionPixelSize(r0)
        L6a:
            android.graphics.drawable.GradientDrawable r0 = r7.A00
            if (r0 == 0) goto L9f
            r0.setStroke(r3, r1)
        L71:
            return
        L72:
            java.lang.Integer r0 = X.C05F.A15
            if (r2 != r0) goto L6a
            X.C14360o3.A07(r5)
            X.1QL r0 = X.C1QI.A0E()
            if (r0 != r4) goto L61
            r0 = 2131100455(0x7f060327, float:1.7813292E38)
            goto L5d
        L83:
            java.lang.Integer r1 = X.C05F.A15
            r0 = 0
            if (r2 != r1) goto L89
            r0 = 1
        L89:
            android.content.Context r5 = r7.getContext()
            if (r0 == 0) goto L97
            X.C14360o3.A07(r5)
            android.content.res.ColorStateList r2 = X.C1QI.A0A(r5)
            goto L23
        L97:
            X.C14360o3.A07(r5)
            android.content.res.ColorStateList r2 = X.C1QI.A09(r5)
            goto L23
        L9f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        La7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.textview.UpdatableButton.setPrismBackground(int[]):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        Integer num = this.A01;
        if (num == null) {
            num = C05F.A01;
        }
        switch (num.intValue()) {
            case 0:
                iArr = A04;
                View.mergeDrawableStates(onCreateDrawableState, iArr);
                break;
            case 1:
            default:
                iArr = A06;
                View.mergeDrawableStates(onCreateDrawableState, iArr);
                break;
            case 2:
                iArr = A05;
                View.mergeDrawableStates(onCreateDrawableState, iArr);
                break;
            case 3:
                iArr = A07;
                View.mergeDrawableStates(onCreateDrawableState, iArr);
                break;
            case 4:
                iArr = A03;
                View.mergeDrawableStates(onCreateDrawableState, iArr);
                break;
            case 5:
            case 6:
            case 7:
                C14360o3.A0A(onCreateDrawableState);
                setPrismBackground(onCreateDrawableState);
                break;
        }
        C14360o3.A0A(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public final void setIsBlack(boolean z) {
        Integer num;
        if (z) {
            num = C05F.A0Y;
        } else {
            num = C05F.A01;
        }
        this.A01 = num;
    }

    public final void setIsBlueButton(boolean z) {
        Integer num;
        if (z) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        this.A01 = num;
    }

    public final void setIsDisabled(boolean z) {
        Integer num;
        if (z) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        this.A01 = num;
    }

    public final void setIsTransparent(boolean z) {
        Integer num;
        if (z) {
            num = C05F.A0N;
        } else {
            num = C05F.A01;
        }
        this.A01 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = C05F.A01;
        this.A02 = C1QI.A0E();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        this.A01 = C05F.A01;
        this.A02 = C1QI.A0E();
    }
}
