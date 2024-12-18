package com.instagram.user.follow;

import X.AbstractC167017dG;
import X.AbstractC55922hc;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.instagram.ui.widget.textview.UpdatableButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class InviteButton extends UpdatableButton {
    public static final Typeface A00;
    public static final Typeface A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0p, i, 0);
        C14360o3.A07(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setIsBlueButton(true);
    }

    static {
        Typeface create = Typeface.create("sans-serif", 0);
        C14360o3.A07(create);
        A01 = create;
        Typeface create2 = Typeface.create("sans-serif-medium", 0);
        C14360o3.A07(create2);
        A00 = create2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        Typeface typeface;
        super.setEnabled(z);
        if (z) {
            typeface = A00;
        } else {
            typeface = A01;
        }
        setTypeface(typeface);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InviteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    public /* synthetic */ InviteButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InviteButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
