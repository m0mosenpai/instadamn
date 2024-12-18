package X;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.util.TypedValue;

/* renamed from: X.2U0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2U0 {
    public final SparseIntArray A00 = new SparseIntArray();
    public final TypedValue A01 = new TypedValue();

    public static final void A00(Resources resources, C2U0 c2u0, int i, int i2) {
        SparseIntArray sparseIntArray = c2u0.A00;
        TypedValue typedValue = c2u0.A01;
        resources.getValue(i, typedValue, false);
        sparseIntArray.put(typedValue.data, i2);
    }
}
