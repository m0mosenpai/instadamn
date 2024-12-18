package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.2bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53122bu {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public final ColorStateList A01(int i) {
        int resourceId;
        ColorStateList A02;
        TypedArray typedArray = this.A02;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (A02 = C02G.A02(this.A01, resourceId)) != null) {
            return A02;
        }
        return typedArray.getColorStateList(i);
    }

    public final Drawable A02(int i) {
        int resourceId;
        TypedArray typedArray = this.A02;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return C52112aB.A02().A05(this.A01, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public final Drawable A03(int i) {
        int resourceId;
        Drawable A06;
        TypedArray typedArray = this.A02;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            C52102aA A01 = C52102aA.A01();
            Context context = this.A01;
            synchronized (A01) {
                A06 = A01.A00.A06(context, resourceId, true);
            }
            return A06;
        }
        return null;
    }

    public C53122bu(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static C53122bu A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C53122bu(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
