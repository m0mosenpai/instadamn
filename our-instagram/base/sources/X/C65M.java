package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.65M, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C65M {
    public static final int[] A00 = {R.attr.colorPrimary};
    public static final int[] A01 = {R.attr.colorPrimaryVariant};

    public static void A01(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0e, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                A03(context, "Theme.MaterialComponents", A01);
            }
        }
        A03(context, "Theme.AppCompat", A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r6.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.content.Context r7, android.util.AttributeSet r8, int[] r9, int[] r10, int r11, int r12) {
        /*
            int[] r0 = X.C65N.A0e
            android.content.res.TypedArray r6 = r7.obtainStyledAttributes(r8, r0, r11, r12)
            r0 = 2
            r5 = 0
            boolean r0 = r6.getBoolean(r0, r5)
            if (r0 != 0) goto L12
            r6.recycle()
        L11:
            return
        L12:
            int r4 = r10.length
            if (r4 != 0) goto L2a
            r1 = -1
            int r0 = r6.getResourceId(r5, r1)
            if (r0 == r1) goto L1d
        L1c:
            r5 = 1
        L1d:
            r6.recycle()
            if (r5 != 0) goto L11
            java.lang.String r1 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L2a:
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r9, r11, r12)
            r2 = 0
        L2f:
            r0 = r10[r2]
            r1 = -1
            int r0 = r3.getResourceId(r0, r1)
            if (r0 != r1) goto L3c
            r3.recycle()
            goto L1d
        L3c:
            int r2 = r2 + 1
            if (r2 < r4) goto L2f
            r3.recycle()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65M.A02(android.content.Context, android.util.AttributeSet, int[], int[], int, int):void");
    }

    public static TypedArray A00(Context context, AttributeSet attributeSet, int[] iArr, int[] iArr2, int i, int i2) {
        A01(context, attributeSet, i, i2);
        A02(context, attributeSet, iArr, iArr2, i, i2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void A03(Context context, String str, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalArgumentException(AnonymousClass001.A0g("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
        obtainStyledAttributes.recycle();
    }
}
