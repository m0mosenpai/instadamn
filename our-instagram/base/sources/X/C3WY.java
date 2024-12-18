package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.3WY, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3WY {
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);
    public static final Object A00 = new Object();

    public static Typeface A02(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return A03(context, new TypedValue(), null, i, 0, false, false);
    }

    public static float A00(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC61632Rqw.A00(resources, i);
        }
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(AnonymousClass001.A11(AbstractC43591JPw.A00(693), Integer.toHexString(i), " type #0x", Integer.toHexString(i2), AbstractC43591JPw.A00(504)));
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        C110694yh c110694yh;
        Resources.Theme theme2;
        C99764dw c99764dw = new C99764dw(theme, resources);
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(c99764dw);
            if (sparseArray != null && sparseArray.size() > 0 && (c110694yh = (C110694yh) sparseArray.get(i)) != null) {
                if (c110694yh.A02.equals(c99764dw.A01.getConfiguration()) && (((theme2 = c99764dw.A00) == null && c110694yh.A00 == 0) || (theme2 != null && c110694yh.A00 == theme2.hashCode()))) {
                    colorStateList = c110694yh.A01;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList = null;
        }
        if (colorStateList == null) {
            ThreadLocal threadLocal = A01;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z = true;
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                z = false;
            }
            ColorStateList colorStateList2 = null;
            if (!z) {
                try {
                    colorStateList2 = AbstractC110684yg.A01(theme, resources, resources.getXml(i));
                } catch (Exception e) {
                    android.util.Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList2 != null) {
                synchronized (obj) {
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c99764dw);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(c99764dw, sparseArray2);
                    }
                    sparseArray2.append(i, new C110694yh(colorStateList2, c99764dw.A01.getConfiguration(), theme));
                }
                return colorStateList2;
            }
            return resources.getColorStateList(i, theme);
        }
        return colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d8, code lost:
    
        if (r33 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0318, code lost:
    
        if (r7 != null) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0347  */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.Q6F, java.lang.Object, X.96j] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.lang.Runnable, X.Wpp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface A03(android.content.Context r31, android.util.TypedValue r32, X.C3WX r33, int r34, int r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3WY.A03(android.content.Context, android.util.TypedValue, X.3WX, int, int, boolean, boolean):android.graphics.Typeface");
    }
}
