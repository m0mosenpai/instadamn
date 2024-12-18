package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public abstract class AM9 {
    public static int A00(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw AbstractC166987dD.A12("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    public static int A01(Rect rect, Rect rect2, int i) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw AbstractC166987dD.A12("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }

    public static boolean A02(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i6 = rect.top;
                        int i7 = rect2.top;
                        if (i6 < i7 || rect.bottom <= i7) {
                            i4 = rect.bottom;
                            i5 = rect2.bottom;
                        } else {
                            return false;
                        }
                    } else {
                        throw AbstractC166987dD.A12("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    int i8 = rect.left;
                    int i9 = rect2.left;
                    if (i8 < i9 || rect.right <= i9) {
                        i4 = rect.right;
                        i5 = rect2.right;
                    } else {
                        return false;
                    }
                }
                if (i4 < i5) {
                    return true;
                }
                return false;
            }
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if (i10 > i11 || rect.top >= i11) {
                i2 = rect.top;
                i3 = rect2.top;
            } else {
                return false;
            }
        } else {
            int i12 = rect.right;
            int i13 = rect2.right;
            if (i12 > i13 || rect.left >= i13) {
                i2 = rect.left;
                i3 = rect2.left;
            } else {
                return false;
            }
        }
        if (i2 > i3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(android.graphics.Rect r3, android.graphics.Rect r4, int r5) {
        /*
            r0 = 17
            r2 = 1
            if (r5 == r0) goto L23
            r0 = 33
            if (r5 == r0) goto L18
            r0 = 66
            if (r5 == r0) goto L23
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L18
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L18:
            int r1 = r4.right
            int r0 = r3.left
            if (r1 < r0) goto L30
            int r1 = r4.left
            int r0 = r3.right
            goto L2d
        L23:
            int r1 = r4.bottom
            int r0 = r3.top
            if (r1 < r0) goto L30
            int r1 = r4.top
            int r0 = r3.bottom
        L2d:
            if (r1 > r0) goto L30
            return r2
        L30:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AM9.A03(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r1 <= r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r2 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r8 == 17) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r8 == 66) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        r2 = A00(r5, r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r8 == 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r8 != 130) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        r1 = r7.bottom;
        r0 = r5.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r2 >= java.lang.Math.max(1, r1 - r0)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        throw X.AbstractC166987dD.A12("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r1 = r5.top;
        r0 = r7.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r1 >= r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04(android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8) {
        /*
            boolean r1 = A03(r5, r6, r8)
            boolean r0 = A03(r5, r7, r8)
            r4 = 0
            if (r0 != 0) goto L47
            if (r1 == 0) goto L47
            r0 = 17
            r2 = 1
            if (r8 == r0) goto L57
            r0 = 33
            if (r8 == r0) goto L52
            r0 = 66
            if (r8 == r0) goto L4d
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L68
            int r1 = r5.bottom
            int r0 = r7.top
        L22:
            if (r1 > r0) goto L5e
        L24:
            r3 = 1
            if (r2 == 0) goto L67
            r0 = 17
            if (r8 == r0) goto L67
            r0 = 66
            if (r8 == r0) goto L67
            int r2 = A00(r5, r6, r8)
            r0 = 33
            if (r8 == r0) goto L48
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L60
            int r1 = r7.bottom
            int r0 = r5.bottom
        L3f:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            if (r2 >= r0) goto L47
            r4 = 1
        L47:
            return r4
        L48:
            int r1 = r5.top
            int r0 = r7.top
            goto L3f
        L4d:
            int r1 = r5.right
            int r0 = r7.left
            goto L22
        L52:
            int r1 = r5.top
            int r0 = r7.bottom
            goto L5b
        L57:
            int r1 = r5.left
            int r0 = r7.right
        L5b:
            if (r1 < r0) goto L5e
            goto L24
        L5e:
            r2 = 0
            goto L24
        L60:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L67:
            return r3
        L68:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AM9.A04(android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, int):boolean");
    }
}
