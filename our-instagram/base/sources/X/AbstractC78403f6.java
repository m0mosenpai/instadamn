package X;

import android.view.View;

/* renamed from: X.3f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78403f6 {
    public static final long A00(int i, int i2) {
        AbstractC78423f8 abstractC78423f8;
        int i3;
        AbstractC78423f8 abstractC78423f82;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode == 1073741824) {
                abstractC78423f8 = C78413f7.A00;
            } else {
                throw new IllegalStateException("Unknown width spec mode.");
            }
        } else {
            abstractC78423f8 = C78433f9.A00;
        }
        int i4 = abstractC78423f8.A01.A01;
        int mode2 = View.MeasureSpec.getMode(i);
        int i5 = 0;
        int A03 = C17s.A03(View.MeasureSpec.getSize(i), 0, i4);
        int i6 = Integer.MAX_VALUE;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i3 = A03;
                } else {
                    throw new IllegalStateException("Unknown width spec mode.");
                }
            } else {
                A03 = 0;
                i3 = Integer.MAX_VALUE;
            }
        } else {
            i3 = A03;
            A03 = 0;
        }
        int mode3 = View.MeasureSpec.getMode(i2);
        if (mode3 != Integer.MIN_VALUE && mode3 != 0) {
            if (mode3 == 1073741824) {
                abstractC78423f82 = C78413f7.A00;
            } else {
                throw new IllegalStateException("Unknown width spec mode.");
            }
        } else {
            abstractC78423f82 = C78433f9.A00;
        }
        int i7 = abstractC78423f82.A01.A01;
        int mode4 = View.MeasureSpec.getMode(i2);
        int A032 = C17s.A03(View.MeasureSpec.getSize(i2), 0, i7);
        if (mode4 != Integer.MIN_VALUE) {
            if (mode4 != 0) {
                if (mode4 == 1073741824) {
                    i6 = A032;
                    i5 = A032;
                } else {
                    throw new IllegalStateException("Unknown height spec mode.");
                }
            }
        } else {
            i6 = A032;
        }
        return C78443fA.A00.A00(A03, i3, i5, i6);
    }
}
