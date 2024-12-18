package X;

import android.R;

/* renamed from: X.65K, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C65K {
    public static final int[] A00 = {R.attr.theme, com.facebook.R.attr.theme};
    public static final int[] A01 = {com.facebook.R.attr.materialThemeOverlay};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0 != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((X.C52182aJ) r6).A00 != r2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context A00(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
        /*
            int[] r0 = X.C65K.A01
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r7, r0, r8, r9)
            r5 = 0
            int r2 = r0.getResourceId(r5, r5)
            r0.recycle()
            boolean r0 = r6 instanceof X.C52182aJ
            r4 = 1
            if (r0 == 0) goto L1b
            r0 = r6
            X.2aJ r0 = (X.C52182aJ) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 == r2) goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r2 == 0) goto L43
            if (r0 != 0) goto L43
            X.2aJ r3 = new X.2aJ
            r3.<init>(r6, r2)
            int[] r0 = X.C65K.A00
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r0)
            int r1 = r2.getResourceId(r5, r5)
            int r0 = r2.getResourceId(r4, r5)
            r2.recycle()
            if (r1 != 0) goto L3b
            r1 = r0
            if (r0 == 0) goto L42
        L3b:
            android.content.res.Resources$Theme r0 = r3.getTheme()
            r0.applyStyle(r1, r4)
        L42:
            return r3
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65K.A00(android.content.Context, android.util.AttributeSet, int, int):android.content.Context");
    }
}
