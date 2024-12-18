package com.instagram.igds.components.gradient;

import X.AbstractC13950nL;
import X.AbstractC55922hc;
import X.BOV;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes9.dex */
public final class IGGradientView extends View {
    public static final BOV A00 = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGGradientView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(attributeSet);
    }

    private final void A00(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0y);
            C14360o3.A07(obtainStyledAttributes);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.values()[obtainStyledAttributes.getInt(2, 0)];
            int color = obtainStyledAttributes.getColor(1, 0);
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            if ((color >>> 24) / 255.0f == 0.0f) {
                color |= -16777216;
            }
            setBackground(BOV.A00(orientation, AbstractC13950nL.A06(color, f)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGGradientView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
