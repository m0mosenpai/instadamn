package com.facebookpay.widget.button;

import X.AbstractC55922hc;
import X.AbstractC68347VNh;
import X.AbstractC69838VwO;
import X.AbstractC70177WFc;
import X.C05F;
import X.C14360o3;
import X.C2FP;
import X.MSZ;
import X.VEX;
import X.W5t;
import X.WF7;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class FBPayButton extends Button {
    public VEX A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void setButtonStyle(VEX vex) {
        C14360o3.A0B(vex, 0);
        this.A00 = vex;
        AbstractC68347VNh.A00(this, vex.A04);
        VEX vex2 = this.A00;
        C14360o3.A0B(vex2, 1);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2FP.A0A().A01(vex2.A04), AbstractC55922hc.A0d);
        C14360o3.A07(obtainStyledAttributes);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        C2FP.A0A();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            W5t A0A = C2FP.A0A();
            int i = vex2.A00;
            drawable.setTint(A0A.A02(context, i));
            stateListDrawable.addState(iArr, drawable);
            int[] iArr2 = {R.attr.state_pressed};
            C2FP.A0A();
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                W5t A0A2 = C2FP.A0A();
                int i2 = vex2.A03;
                drawable2.setTint(A0A2.A02(context, i2));
                stateListDrawable.addState(iArr2, drawable2);
                int[] iArr3 = {-16842919};
                C2FP.A0A();
                Drawable drawable3 = obtainStyledAttributes.getDrawable(1);
                if (drawable3 != null) {
                    drawable3.setTint(C2FP.A0A().A02(context, i));
                    stateListDrawable.addState(iArr3, drawable3);
                    int[] iArr4 = {R.attr.state_focused};
                    C2FP.A0A();
                    Drawable drawable4 = obtainStyledAttributes.getDrawable(1);
                    if (drawable4 != null) {
                        drawable4.setTint(C2FP.A0A().A02(context, i2));
                        stateListDrawable.addState(iArr4, drawable4);
                        int[] iArr5 = {-16842908};
                        C2FP.A0A();
                        Drawable drawable5 = obtainStyledAttributes.getDrawable(1);
                        if (drawable5 != null) {
                            drawable5.setTint(C2FP.A0A().A02(context, i));
                            stateListDrawable.addState(iArr5, drawable5);
                            setBackground(stateListDrawable);
                            obtainStyledAttributes.recycle();
                            WF7.A02(this, this.A00.A05);
                            VEX vex3 = this.A00;
                            int i3 = vex3.A02;
                            int i4 = vex3.A01;
                            int[][] iArr6 = {new int[]{R.attr.state_enabled}, new int[]{-16842910}};
                            W5t A0A3 = C2FP.A0A();
                            C14360o3.A07(context);
                            setTextColor(new ColorStateList(iArr6, new int[]{A0A3.A02(context, i3), C2FP.A0A().A02(context, i4)}));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet, int i, VEX vex) {
        super(context, attributeSet, i);
        MSZ.A1O(context, vex);
        this.A00 = vex;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        AbstractC69838VwO.A01(this, C05F.A01, null);
        AbstractC70177WFc.A04(this, this.A00.A04, false);
        setButtonStyle(this.A00);
        setFocusable(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, VEX.A08);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ FBPayButton(Context context, AttributeSet attributeSet, int i, VEX vex, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i, (i2 & 8) != 0 ? VEX.A08 : vex);
    }
}
