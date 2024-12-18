package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.03I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03I {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public static boolean A00(C03I c03i, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        ViewParent viewParent;
        int i6;
        int i7;
        if (c03i.A02) {
            if (i5 != 0) {
                if (i5 == 1) {
                    viewParent = c03i.A00;
                }
            } else {
                viewParent = c03i.A01;
            }
            if (viewParent != null) {
                if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
                    if (iArr != null) {
                        iArr[0] = 0;
                        iArr[1] = 0;
                    }
                } else {
                    if (iArr != null) {
                        c03i.A04.getLocationInWindow(iArr);
                        i6 = iArr[0];
                        i7 = iArr[1];
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    if (iArr2 == null) {
                        iArr2 = c03i.A03;
                        if (iArr2 == null) {
                            iArr2 = new int[2];
                            c03i.A03 = iArr2;
                        }
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                    View view = c03i.A04;
                    if (viewParent instanceof InterfaceC12520kw) {
                        ((InterfaceC12520kw) viewParent).DVG(view, iArr2, i, i2, i3, i4, i5);
                    } else {
                        iArr2[0] = iArr2[0] + i3;
                        iArr2[1] = iArr2[1] + i4;
                        if (viewParent instanceof InterfaceC17990uc) {
                            ((InterfaceC17990uc) viewParent).DVF(view, i, i2, i3, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                viewParent.onNestedScroll(view, i, i2, i3, i4);
                            } catch (AbstractMethodError e) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("ViewParent ");
                                sb.append(viewParent);
                                sb.append(" does not implement interface method onNestedScroll");
                                android.util.Log.e("ViewParentCompat", sb.toString(), e);
                            }
                        }
                    }
                    if (iArr != null) {
                        view.getLocationInWindow(iArr);
                        iArr[0] = iArr[0] - i6;
                        iArr[1] = iArr[1] - i7;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A06(int i, int i2, int i3, int i4, int[] iArr) {
        return A00(this, iArr, null, i, i2, i3, i4, 0);
    }

    public final boolean A07(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ViewParent viewParent;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (this.A02) {
            if (i3 != 0) {
                if (i3 == 1) {
                    viewParent = this.A00;
                }
            } else {
                viewParent = this.A01;
            }
            if (viewParent != null) {
                if (i == 0 && i2 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                } else {
                    if (iArr2 != null) {
                        this.A04.getLocationInWindow(iArr2);
                        i4 = iArr2[0];
                        i5 = iArr2[1];
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    if (iArr == null && (iArr3 = this.A03) == null) {
                        iArr3 = new int[2];
                        this.A03 = iArr3;
                    }
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    View view = this.A04;
                    if (viewParent instanceof InterfaceC17990uc) {
                        ((InterfaceC17990uc) viewParent).DVE(view, iArr3, i, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            viewParent.onNestedPreScroll(view, i, i2, iArr3);
                        } catch (AbstractMethodError e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ViewParent ");
                            sb.append(viewParent);
                            sb.append(" does not implement interface method onNestedPreScroll");
                            android.util.Log.e("ViewParentCompat", sb.toString(), e);
                        }
                    }
                    if (iArr2 != null) {
                        view.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i4;
                        iArr2[1] = iArr2[1] - i5;
                    }
                    if (iArr3[0] != 0 || iArr3[1] != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void A01(int i) {
        ViewParent viewParent;
        if (i != 0) {
            if (i == 1) {
                viewParent = this.A00;
            } else {
                return;
            }
        } else {
            viewParent = this.A01;
        }
        if (viewParent != null) {
            View view = this.A04;
            if (viewParent instanceof InterfaceC17990uc) {
                ((InterfaceC17990uc) viewParent).Dow(view, i);
            } else if (i == 0) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    android.util.Log.e("ViewParentCompat", sb.toString(), e);
                }
            }
            if (i != 0) {
                this.A00 = null;
            } else {
                this.A01 = null;
            }
        }
    }

    public final void A02(boolean z) {
        if (this.A02) {
            this.A04.stopNestedScroll();
        }
        this.A02 = z;
    }

    public final boolean A03(float f, float f2) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return viewParent.onNestedPreFling(this.A04, f, f2);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            android.util.Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    public final boolean A04(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return viewParent.onNestedFling(this.A04, f, f2, z);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            android.util.Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(int r8, int r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L6d
            r0 = 1
            if (r9 != r0) goto La
            android.view.ViewParent r0 = r7.A00
        L7:
            r1 = 1
            if (r0 != 0) goto Lb
        La:
            r1 = 0
        Lb:
            r3 = 1
            if (r1 != 0) goto L37
            boolean r0 = r7.A02
            if (r0 == 0) goto L92
            android.view.View r6 = r7.A04
            android.view.ViewParent r4 = r6.getParent()
            r5 = r6
        L19:
            if (r4 == 0) goto L92
            boolean r0 = r4 instanceof X.InterfaceC17990uc
            if (r0 == 0) goto L3e
            r0 = r4
            X.0uc r0 = (X.InterfaceC17990uc) r0
            boolean r0 = r0.Do4(r5, r6, r8, r9)
        L26:
            if (r0 == 0) goto L61
            if (r9 == 0) goto L3b
            if (r9 != r3) goto L2e
            r7.A00 = r4
        L2e:
            boolean r0 = r4 instanceof X.InterfaceC17990uc
            if (r0 == 0) goto L38
            X.0uc r4 = (X.InterfaceC17990uc) r4
            r4.DVH(r5, r6, r8, r9)
        L37:
            return r3
        L38:
            if (r9 != 0) goto L37
            goto L70
        L3b:
            r7.A01 = r4
            goto L2e
        L3e:
            if (r9 != 0) goto L61
            boolean r0 = r4.onStartNestedScroll(r5, r6, r8)     // Catch: java.lang.AbstractMethodError -> L45
            goto L26
        L45:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ViewParent "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " does not implement interface method onStartNestedScroll"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
        L61:
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L68
            r5 = r4
            android.view.View r5 = (android.view.View) r5
        L68:
            android.view.ViewParent r4 = r4.getParent()
            goto L19
        L6d:
            android.view.ViewParent r0 = r7.A01
            goto L7
        L70:
            r4.onNestedScrollAccepted(r5, r6, r8)     // Catch: java.lang.AbstractMethodError -> L74
            goto L91
        L74:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ViewParent "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
            return r3
        L91:
            return r3
        L92:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03I.A05(int, int):boolean");
    }

    public C03I(View view) {
        this.A04 = view;
    }
}
