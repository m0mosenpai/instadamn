package com.instagram.creation.photo.crop;

import X.AbstractC43828JZr;
import X.C14360o3;
import X.C1NC;
import X.C44264JhA;
import X.C44406Jjj;
import X.C48578LeG;
import X.JQ0;
import X.MQV;
import X.U7F;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class LayoutImageView extends AbstractC43828JZr {
    public MQV A00;
    public boolean A01;
    public U7F A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = true;
    }

    public final void A0P(int i, int i2, Bitmap bitmap, int i3) {
        Bitmap A0A = C1NC.A0A(bitmap, i, i2, false);
        C14360o3.A07(A0A);
        setImageRotateBitmapResetBase(new C44264JhA(A0A, i3), null, getLayoutParams());
        A0A.getHeight();
        A0A.getWidth();
        A0Q(A0A, i3);
        A0O();
    }

    public final void A0O() {
        if (this.A01) {
            U7F u7f = new U7F();
            u7f.A00 = 1.0f;
            u7f.A01 = new GestureDetector(getContext(), new C44406Jjj(this, 8));
            u7f.A02 = new C48578LeG(this, 1);
            this.A02 = u7f;
            setOnTouchListener(u7f);
        }
    }

    public final void A0Q(Bitmap bitmap, int i) {
        boolean z;
        int width;
        int height;
        float f;
        float f2;
        if ((i / 90) % 2 != 0) {
            z = true;
            width = bitmap.getHeight();
            height = bitmap.getWidth();
        } else {
            z = false;
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        float f3 = getLayoutParams().width;
        float f4 = getLayoutParams().height;
        float f5 = width;
        float f6 = f5 / f3;
        float f7 = height;
        float f8 = f7 / f4;
        if (f6 < f8) {
            f2 = f6 * f4;
            f = f5;
        } else {
            f = f8 * f3;
            f2 = f7;
        }
        float round = Math.round((f5 - f) / 2.0f);
        float round2 = Math.round((f7 - f2) / 2.0f);
        float f9 = f5 - round;
        float f10 = f7 - round2;
        RectF rectF = new RectF(round, round2, f9, f10);
        if (z) {
            rectF = new RectF(round2, round, f10, f9);
        }
        A0L(rectF, 1.0f, 10.0f);
    }

    public final void setDelegate(MQV mqv) {
        this.A00 = mqv;
    }

    public final void setTouchEnabled(boolean z) {
        this.A01 = z;
    }

    public /* synthetic */ LayoutImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
