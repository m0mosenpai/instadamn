package androidx.recyclerview.widget;

import X.AbstractC110824yu;
import X.AbstractC70663Fe;
import X.AbstractC70763Fo;
import X.AnonymousClass001;
import X.C0f9;
import X.C110814yt;
import X.C206149Aw;
import X.C3F5;
import X.C3FM;
import X.C3OO;
import X.C3OP;
import X.C4iv;
import X.C70593Ew;
import X.C70723Fk;
import X.C70743Fm;
import X.C70753Fn;
import X.C72203Lt;
import X.InterfaceC70673Ff;
import X.InterfaceC70683Fg;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes2.dex */
public class LinearLayoutManager extends AbstractC70663Fe implements InterfaceC70673Ff, InterfaceC70683Fg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C72203Lt A04;
    public SavedState A05;
    public AbstractC70763Fo A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public final C70743Fm A0D;
    public final C70753Fn A0E;

    /* loaded from: classes2.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C206149Aw(3);
        public int A00;
        public int A01;
        public boolean A02;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A02 ? 1 : 0);
        }
    }

    public static int A00(LinearLayoutManager linearLayoutManager, C3F5 c3f5) {
        if (linearLayoutManager.A0T() == 0) {
            return 0;
        }
        linearLayoutManager.A1n();
        AbstractC70763Fo abstractC70763Fo = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0A;
        boolean z2 = !z;
        return C4iv.A00(linearLayoutManager.A1m(z2), linearLayoutManager.A1l(z2), abstractC70763Fo, linearLayoutManager, c3f5, z);
    }

    public static int A01(LinearLayoutManager linearLayoutManager, C3F5 c3f5) {
        if (linearLayoutManager.A0T() == 0) {
            return 0;
        }
        linearLayoutManager.A1n();
        AbstractC70763Fo abstractC70763Fo = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0A;
        boolean z2 = !z;
        return C4iv.A02(linearLayoutManager.A1m(z2), linearLayoutManager.A1l(z2), abstractC70763Fo, linearLayoutManager, c3f5, z, linearLayoutManager.A09);
    }

    public static int A02(LinearLayoutManager linearLayoutManager, C3F5 c3f5) {
        if (linearLayoutManager.A0T() == 0) {
            return 0;
        }
        linearLayoutManager.A1n();
        AbstractC70763Fo abstractC70763Fo = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0A;
        boolean z2 = !z;
        return C4iv.A01(linearLayoutManager.A1m(z2), linearLayoutManager.A1l(z2), abstractC70763Fo, linearLayoutManager, c3f5, z);
    }

    @Override // X.AbstractC70663Fe
    public boolean A14() {
        return true;
    }

    @Override // X.AbstractC70663Fe
    public void A1S(C3F5 c3f5) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A0D.A00();
    }

    public final int A1e(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 33) {
                        return this.A01 == 1 ? -1 : Integer.MIN_VALUE;
                    }
                    if (i != 66) {
                        if (i == 130 && this.A01 == 1) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.A01 != 0) {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.A01 != 0) {
                    return Integer.MIN_VALUE;
                }
            } else if (this.A01 != 1 && A1u()) {
                return -1;
            }
            return 1;
        }
        if (this.A01 != 1 && A1u()) {
            return 1;
        }
        return -1;
    }

    public final View A1l(boolean z) {
        int A0T;
        int i;
        if (this.A09) {
            A0T = 0;
            i = A0T();
        } else {
            A0T = A0T() - 1;
            i = -1;
        }
        return A1j(A0T, i, z, true);
    }

    public final View A1m(boolean z) {
        int i;
        int A0T;
        if (this.A09) {
            i = A0T() - 1;
            A0T = -1;
        } else {
            i = 0;
            A0T = A0T();
        }
        return A1j(i, A0T, z, true);
    }

    public void A1q(C70743Fm c70743Fm, C70593Ew c70593Ew, C3F5 c3f5, int i) {
    }

    public void A1t(boolean z) {
        A1D(null);
        if (this.A0B != z) {
            this.A0B = z;
            A0i();
        }
    }

    private void A03(int i, int i2) {
        this.A04.A00 = this.A06.A03() - i2;
        C72203Lt c72203Lt = this.A04;
        int i3 = 1;
        if (this.A09) {
            i3 = -1;
        }
        c72203Lt.A03 = i3;
        c72203Lt.A01 = i;
        c72203Lt.A05 = 1;
        c72203Lt.A07 = i2;
        c72203Lt.A08 = Integer.MIN_VALUE;
    }

    private void A04(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A06();
        C72203Lt c72203Lt = this.A04;
        c72203Lt.A01 = i;
        int i3 = -1;
        if (this.A09) {
            i3 = 1;
        }
        c72203Lt.A03 = i3;
        c72203Lt.A05 = -1;
        c72203Lt.A07 = i2;
        c72203Lt.A08 = Integer.MIN_VALUE;
    }

    private void A05(C72203Lt c72203Lt, C70593Ew c70593Ew) {
        int i;
        int i2;
        if (c72203Lt.A0B && !c72203Lt.A0A) {
            int i3 = c72203Lt.A08;
            int i4 = c72203Lt.A06;
            if (c72203Lt.A05 == -1) {
                int A0T = A0T();
                if (i3 >= 0) {
                    int A02 = (this.A06.A02() - i3) + i4;
                    if (this.A09) {
                        i = 0;
                        i2 = 0;
                        while (i2 < A0T) {
                            View A0e = A0e(i2);
                            if (this.A06.A0D(A0e) >= A02 && this.A06.A0A(A0e) >= A02) {
                                i2++;
                            }
                        }
                        return;
                    }
                    i = A0T - 1;
                    i2 = i;
                    while (i2 >= 0) {
                        View A0e2 = A0e(i2);
                        if (this.A06.A0D(A0e2) >= A02 && this.A06.A0A(A0e2) >= A02) {
                            i2--;
                        }
                    }
                    return;
                }
                return;
            }
            if (i3 >= 0) {
                int i5 = i3 - i4;
                int A0T2 = A0T();
                if (this.A09) {
                    i = A0T2 - 1;
                    i2 = i;
                    while (i2 >= 0) {
                        View A0e3 = A0e(i2);
                        if (this.A06.A08(A0e3) <= i5 && this.A06.A09(A0e3) <= i5) {
                            i2--;
                        }
                    }
                    return;
                }
                i = 0;
                i2 = 0;
                while (i2 < A0T2) {
                    View A0e4 = A0e(i2);
                    if (this.A06.A08(A0e4) <= i5 && this.A06.A09(A0e4) <= i5) {
                        i2++;
                    }
                }
                return;
            }
            return;
            A08(c70593Ew, i, i2);
        }
    }

    public static void A06(LinearLayoutManager linearLayoutManager) {
        boolean z;
        if (linearLayoutManager.A01 != 1 && linearLayoutManager.A1u()) {
            z = !linearLayoutManager.A08;
        } else {
            z = linearLayoutManager.A08;
        }
        linearLayoutManager.A09 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.A02() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(androidx.recyclerview.widget.LinearLayoutManager r6, X.C3F5 r7, int r8, int r9, boolean r10) {
        /*
            X.3Lt r2 = r6.A04
            X.3Fo r1 = r6.A06
            int r0 = r1.A05()
            if (r0 != 0) goto L11
            int r1 = r1.A02()
            r0 = 1
            if (r1 == 0) goto L12
        L11:
            r0 = 0
        L12:
            r2.A0A = r0
            r2.A05 = r8
            int[] r1 = r6.A0C
            r4 = 0
            r1[r4] = r4
            r5 = 1
            r1[r5] = r4
            r6.A1s(r7, r1)
            r0 = r1[r4]
            int r3 = java.lang.Math.max(r4, r0)
            r0 = r1[r5]
            int r0 = java.lang.Math.max(r4, r0)
            if (r8 != r5) goto L30
            r4 = 1
        L30:
            X.3Lt r2 = r6.A04
            r1 = r3
            if (r4 == 0) goto L36
            r1 = r0
        L36:
            r2.A02 = r1
            if (r4 != 0) goto L3b
            r3 = r0
        L3b:
            r2.A06 = r3
            if (r4 == 0) goto L8d
            X.3Fo r0 = r6.A06
            int r0 = r0.A04()
            int r1 = r1 + r0
            r2.A02 = r1
            boolean r0 = r6.A09
            if (r0 == 0) goto L86
            r0 = 0
        L4d:
            android.view.View r4 = r6.A0e(r0)
            X.3Lt r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 == 0) goto L58
            r5 = -1
        L58:
            r3.A03 = r5
            int r2 = X.AbstractC70663Fe.A0C(r4)
            X.3Lt r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.3Fo r0 = r6.A06
            int r0 = r0.A08(r4)
            r1.A07 = r0
            X.3Fo r0 = r6.A06
            int r1 = r0.A08(r4)
            X.3Fo r0 = r6.A06
            int r0 = r0.A03()
            int r1 = r1 - r0
        L7a:
            X.3Lt r0 = r6.A04
            r0.A00 = r9
            if (r10 == 0) goto L83
            int r9 = r9 - r1
            r0.A00 = r9
        L83:
            r0.A08 = r1
            return
        L86:
            int r0 = r6.A0T()
            int r0 = r0 + (-1)
            goto L4d
        L8d:
            boolean r0 = r6.A09
            if (r0 == 0) goto Ld3
            int r0 = r6.A0T()
            int r0 = r0 + (-1)
        L97:
            android.view.View r4 = r6.A0e(r0)
            X.3Lt r2 = r6.A04
            int r1 = r2.A02
            X.3Fo r0 = r6.A06
            int r0 = r0.A06()
            int r1 = r1 + r0
            r2.A02 = r1
            X.3Lt r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 != 0) goto Laf
            r5 = -1
        Laf:
            r3.A03 = r5
            int r2 = X.AbstractC70663Fe.A0C(r4)
            X.3Lt r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.3Fo r0 = r6.A06
            int r0 = r0.A0D(r4)
            r1.A07 = r0
            X.3Fo r0 = r6.A06
            int r0 = r0.A0D(r4)
            int r1 = -r0
            X.3Fo r0 = r6.A06
            int r0 = r0.A06()
            int r1 = r1 + r0
            goto L7a
        Ld3:
            r0 = 0
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A07(androidx.recyclerview.widget.LinearLayoutManager, X.3F5, int, int, boolean):void");
    }

    private void A08(C70593Ew c70593Ew, int i, int i2) {
        if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    A0x(c70593Ew, i);
                    i--;
                }
            } else {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        A0x(c70593Ew, i2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.AbstractC70663Fe
    public final boolean A15() {
        if (super.A01 != 1073741824 && super.A04 != 1073741824) {
            int A0T = A0T();
            for (int i = 0; i < A0T; i++) {
                ViewGroup.LayoutParams layoutParams = A0e(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC70663Fe
    public final void A1D(String str) {
        if (this.A05 == null) {
            super.A1D(str);
        }
    }

    @Override // X.AbstractC70663Fe
    public boolean A1J() {
        if (this.A05 == null && this.A07 == this.A0B) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC70663Fe
    public int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (this.A01 == 1) {
            return 0;
        }
        return A1g(c70593Ew, c3f5, i);
    }

    @Override // X.AbstractC70663Fe
    public int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (this.A01 == 0) {
            return 0;
        }
        return A1g(c70593Ew, c3f5, i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    @Override // X.AbstractC70663Fe
    public Parcelable A1M() {
        int i;
        int i2;
        int A0T;
        SavedState savedState = this.A05;
        if (savedState != null) {
            ?? obj = new Object();
            obj.A01 = savedState.A01;
            obj.A00 = savedState.A00;
            obj.A02 = savedState.A02;
            return obj;
        }
        ?? obj2 = new Object();
        if (A0T() > 0) {
            A1n();
            boolean z = this.A07;
            boolean z2 = this.A09;
            boolean z3 = z ^ z2;
            obj2.A02 = z3;
            if (z3) {
                if (z2) {
                    A0T = 0;
                } else {
                    A0T = A0T() - 1;
                }
                View A0e = A0e(A0T);
                obj2.A00 = this.A06.A03() - this.A06.A08(A0e);
                i = AbstractC70663Fe.A0C(A0e);
            } else {
                if (z2) {
                    i2 = A0T() - 1;
                } else {
                    i2 = 0;
                }
                View A0e2 = A0e(i2);
                obj2.A01 = AbstractC70663Fe.A0C(A0e2);
                obj2.A00 = this.A06.A0D(A0e2) - this.A06.A06();
                return obj2;
            }
        } else {
            i = -1;
        }
        obj2.A01 = i;
        return obj2;
    }

    @Override // X.AbstractC70663Fe
    public void A1O(int i) {
        this.A02 = i;
        this.A03 = Integer.MIN_VALUE;
        SavedState savedState = this.A05;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0i();
    }

    @Override // X.AbstractC70663Fe
    public void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A05 = savedState;
            if (this.A02 != -1) {
                savedState.A01 = -1;
            }
            A0i();
        }
    }

    @Override // X.AbstractC70663Fe
    public boolean A1X() {
        if (this.A01 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC70663Fe
    public boolean A1Y() {
        if (this.A01 == 1) {
            return true;
        }
        return false;
    }

    public final int A1f(C72203Lt c72203Lt, C70593Ew c70593Ew, C3F5 c3f5, boolean z) {
        int i;
        int i2 = c72203Lt.A00;
        int i3 = c72203Lt.A08;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c72203Lt.A08 = i3 + i2;
            }
            A05(c72203Lt, c70593Ew);
        }
        int i4 = c72203Lt.A00 + c72203Lt.A02;
        C70753Fn c70753Fn = this.A0E;
        while (true) {
            if ((!c72203Lt.A0A && i4 <= 0) || (i = c72203Lt.A01) < 0 || i >= c3f5.A00()) {
                break;
            }
            c70753Fn.A00 = 0;
            c70753Fn.A01 = false;
            c70753Fn.A03 = false;
            c70753Fn.A02 = false;
            A1r(c70753Fn, c72203Lt, c70593Ew, c3f5);
            if (!c70753Fn.A01) {
                int i5 = c72203Lt.A07;
                int i6 = c70753Fn.A00;
                c72203Lt.A07 = i5 + (c72203Lt.A05 * i6);
                if (!c70753Fn.A03 || c72203Lt.A09 != null || !c3f5.A08) {
                    c72203Lt.A00 -= i6;
                    i4 -= i6;
                }
                int i7 = c72203Lt.A08;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c72203Lt.A08 = i8;
                    int i9 = c72203Lt.A00;
                    if (i9 < 0) {
                        c72203Lt.A08 = i8 + i9;
                    }
                    A05(c72203Lt, c70593Ew);
                }
                if (z && c70753Fn.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c72203Lt.A00;
    }

    @Deprecated
    public int A1h(C3F5 c3f5) {
        if (c3f5.A06 != -1) {
            return this.A06.A07();
        }
        return 0;
    }

    public final void A1n() {
        if (this.A04 == null) {
            this.A04 = new C72203Lt();
        }
    }

    public final void A1o(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AnonymousClass001.A0O("invalid orientation:", i));
        }
        A1D(null);
        if (i != this.A01 || this.A06 == null) {
            AbstractC70763Fo A00 = AbstractC70763Fo.A00(this, i);
            this.A06 = A00;
            this.A0D.A02 = A00;
            this.A01 = i;
            A0i();
        }
    }

    public void A1p(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        SavedState savedState = this.A05;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0i();
    }

    public final boolean A1u() {
        if (super.A07.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.3Fn, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0D = new C70743Fm();
        this.A0E = new Object();
        this.A00 = 2;
        this.A0C = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3FM.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        boolean z2 = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1o(i3);
        A1D(null);
        if (z != this.A08) {
            this.A08 = z;
            A0i();
        }
        A1t(z2);
    }

    @Override // X.AbstractC70663Fe
    public final View A0d(int i) {
        int A0T = A0T();
        if (A0T == 0) {
            return null;
        }
        int A0C = i - AbstractC70663Fe.A0C(A0e(0));
        if (A0C >= 0 && A0C < A0T) {
            View A0e = A0e(A0C);
            if (AbstractC70663Fe.A0C(A0e) == i) {
                return A0e;
            }
        }
        return super.A0d(i);
    }

    @Override // X.AbstractC70663Fe
    public final void A1C(AccessibilityEvent accessibilityEvent) {
        super.A1C(accessibilityEvent);
        if (A0T() > 0) {
            accessibilityEvent.setFromIndex(A1a());
            accessibilityEvent.setToIndex(A1b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r6.A09 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        r0 = A0T() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r6.A09 != false) goto L22;
     */
    @Override // X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View A1E(android.view.View r7, X.C70593Ew r8, X.C3F5 r9, int r10) {
        /*
            r6 = this;
            A06(r6)
            int r0 = r6.A0T()
            r5 = 0
            if (r0 == 0) goto L7c
            int r4 = r6.A1e(r10)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r3) goto L7c
            r6.A1n()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.3Fo r0 = r6.A06
            int r0 = r0.A07()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r2 = 0
            A07(r6, r9, r4, r0, r2)
            X.3Lt r1 = r6.A04
            r1.A08 = r3
            r1.A0B = r2
            r0 = 1
            r6.A1f(r1, r8, r9, r0)
            r1 = -1
            boolean r0 = r6.A09
            if (r4 != r1) goto L60
            if (r0 == 0) goto L57
            int r0 = r6.A0T()
            int r0 = r0 + (-1)
            android.view.View r2 = r6.A1i(r0, r1)
        L40:
            boolean r0 = r6.A09
            if (r0 == 0) goto L6e
        L44:
            int r0 = r6.A0T()
            int r0 = r0 + (-1)
        L4a:
            android.view.View r1 = r6.A0e(r0)
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L7b
            if (r2 == 0) goto L7c
            return r1
        L57:
            int r0 = r6.A0T()
            android.view.View r2 = r6.A1i(r2, r0)
            goto L40
        L60:
            if (r0 == 0) goto L70
            int r0 = r6.A0T()
            android.view.View r2 = r6.A1i(r2, r0)
        L6a:
            boolean r0 = r6.A09
            if (r0 == 0) goto L44
        L6e:
            r0 = 0
            goto L4a
        L70:
            int r0 = r6.A0T()
            int r0 = r0 + (-1)
            android.view.View r2 = r6.A1i(r0, r1)
            goto L6a
        L7b:
            return r2
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1E(android.view.View, X.3Ew, X.3F5, int):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x03e6, code lost:
    
        if (r12 >= r1) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (r1.A02() != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        if (r0 <= 0) goto L113;
     */
    @Override // X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A1R(X.C70593Ew r20, X.C3F5 r21) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1R(X.3Ew, X.3F5):void");
    }

    @Override // X.AbstractC70663Fe
    public void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C110814yt c110814yt = new C110814yt(recyclerView.getContext());
        ((AbstractC110824yu) c110814yt).A00 = i;
        A10(c110814yt);
    }

    public int A1a() {
        int A0C;
        int A03 = C0f9.A03(-1788126990);
        View A1j = A1j(0, A0T(), false, true);
        if (A1j == null) {
            A0C = -1;
        } else {
            A0C = AbstractC70663Fe.A0C(A1j);
        }
        C0f9.A0A(1291391454, A03);
        return A0C;
    }

    public int A1b() {
        int A03 = C0f9.A03(-1893337041);
        int i = -1;
        View A1j = A1j(A0T() - 1, -1, false, true);
        if (A1j != null) {
            i = AbstractC70663Fe.A0C(A1j);
        }
        C0f9.A0A(-203774900, A03);
        return i;
    }

    public final int A1c() {
        View A1j = A1j(0, A0T(), true, false);
        if (A1j == null) {
            return -1;
        }
        return AbstractC70663Fe.A0C(A1j);
    }

    public final int A1d() {
        View A1j = A1j(A0T() - 1, -1, true, false);
        if (A1j == null) {
            return -1;
        }
        return AbstractC70663Fe.A0C(A1j);
    }

    public final int A1g(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (A0T() != 0 && i != 0) {
            A1n();
            this.A04.A0B = true;
            int i2 = -1;
            if (i > 0) {
                i2 = 1;
            }
            int abs = Math.abs(i);
            A07(this, c3f5, i2, abs, true);
            C72203Lt c72203Lt = this.A04;
            int A1f = c72203Lt.A08 + A1f(c72203Lt, c70593Ew, c3f5, false);
            if (A1f >= 0) {
                if (abs > A1f) {
                    i = i2 * A1f;
                }
                this.A06.A0E(-i);
                this.A04.A04 = i;
                return i;
            }
        }
        return 0;
    }

    public final View A1i(int i, int i2) {
        C70723Fk c70723Fk;
        A1n();
        if (i2 <= i && i2 >= i) {
            return A0e(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A0D(A0e(i)) < this.A06.A06()) {
            i3 = 16644;
            i4 = 16388;
        }
        if (this.A01 == 0) {
            c70723Fk = super.A08;
        } else {
            c70723Fk = super.A09;
        }
        return c70723Fk.A00(i, i2, i3, i4);
    }

    public final View A1j(int i, int i2, boolean z, boolean z2) {
        C70723Fk c70723Fk;
        A1n();
        int i3 = 320;
        int i4 = 320;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        if (this.A01 == 0) {
            c70723Fk = super.A08;
        } else {
            c70723Fk = super.A09;
        }
        return c70723Fk.A00(i, i2, i4, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r3 >= r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r2 <= r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View A1k(X.C70593Ew r15, X.C3F5 r16, boolean r17, boolean r18) {
        /*
            r14 = this;
            r14.A1n()
            int r1 = r14.A0T()
            r8 = -1
            r0 = 1
            if (r18 == 0) goto L6f
            int r9 = r14.A0T()
            int r9 = r9 - r0
            r13 = -1
        L11:
            int r7 = r16.A00()
            X.3Fo r0 = r14.A06
            int r6 = r0.A06()
            X.3Fo r0 = r14.A06
            int r5 = r0.A03()
            r12 = 0
            r11 = r12
            r10 = r12
        L24:
            if (r9 == r8) goto L73
            android.view.View r4 = r14.A0e(r9)
            int r1 = X.AbstractC70663Fe.A0C(r4)
            X.3Fo r0 = r14.A06
            int r3 = r0.A0D(r4)
            X.3Fo r0 = r14.A06
            int r2 = r0.A08(r4)
            if (r1 < 0) goto L4f
            if (r1 >= r7) goto L4f
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            X.3OP r0 = (X.C3OP) r0
            X.3OO r0 = r0.mViewHolder
            boolean r0 = r0.isRemoved()
            if (r0 == 0) goto L51
            if (r10 != 0) goto L4f
            r10 = r4
        L4f:
            int r9 = r9 + r13
            goto L24
        L51:
            if (r2 > r6) goto L56
            r1 = 1
            if (r3 < r6) goto L57
        L56:
            r1 = 0
        L57:
            if (r3 < r5) goto L5c
            r0 = 1
            if (r2 > r5) goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r1 != 0) goto L62
            if (r0 != 0) goto L62
            return r4
        L62:
            if (r17 == 0) goto L68
            if (r0 == 0) goto L6b
        L66:
            r11 = r4
            goto L4f
        L68:
            if (r1 == 0) goto L6b
            goto L66
        L6b:
            if (r12 != 0) goto L4f
            r12 = r4
            goto L4f
        L6f:
            r8 = r1
            r9 = 0
            r13 = 1
            goto L11
        L73:
            if (r12 != 0) goto L79
            r12 = r10
            if (r11 == 0) goto L79
            return r11
        L79:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1k(X.3Ew, X.3F5, boolean, boolean):android.view.View");
    }

    public void A1r(C70753Fn c70753Fn, C72203Lt c72203Lt, C70593Ew c70593Ew, C3F5 c3f5) {
        int Bax;
        int A0C;
        int i;
        int i2;
        View A00 = c72203Lt.A00(c70593Ew);
        if (A00 == null) {
            c70753Fn.A01 = true;
            return;
        }
        C3OP c3op = (C3OP) A00.getLayoutParams();
        List list = c72203Lt.A09;
        boolean z = this.A09;
        int i3 = c72203Lt.A05;
        boolean z2 = false;
        if (list == null) {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                A0o(A00, -1);
            } else {
                A0o(A00, 0);
            }
        } else {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                AbstractC70663Fe.A0G(A00, this, -1, true);
            } else {
                AbstractC70663Fe.A0G(A00, this, 0, true);
            }
        }
        A0q(A00, 0, 0);
        c70753Fn.A00 = this.A06.A0B(A00);
        if (this.A01 == 1) {
            if (A1u()) {
                i2 = super.A03 - Baw();
                i = i2 - this.A06.A0C(A00);
            } else {
                i = Bau();
                i2 = this.A06.A0C(A00) + i;
            }
            int i4 = c72203Lt.A05;
            int i5 = c72203Lt.A07;
            int i6 = c70753Fn.A00;
            A0C = i5 + i6;
            Bax = i5;
            if (i4 == -1) {
                Bax = i5 - i6;
                A0C = i5;
            }
        } else {
            Bax = Bax();
            A0C = this.A06.A0C(A00) + Bax;
            int i7 = c72203Lt.A05;
            i = c72203Lt.A07;
            int i8 = c70753Fn.A00;
            i2 = i + i8;
            if (i7 == -1) {
                i2 = i;
                i -= i8;
            }
        }
        AbstractC70663Fe.A0F(A00, i, Bax, i2, A0C);
        C3OO c3oo = c3op.mViewHolder;
        if (c3oo.isRemoved() || c3oo.isUpdated()) {
            c70753Fn.A03 = true;
        }
        c70753Fn.A02 = A00.hasFocusable();
    }

    public void A1s(C3F5 c3f5, int[] iArr) {
        int A1h = A1h(c3f5);
        int i = 0;
        if (this.A04.A05 != -1) {
            i = A1h;
            A1h = 0;
        }
        iArr[0] = A1h;
        iArr[1] = i;
    }

    @Override // X.InterfaceC70673Ff
    public PointF AIz(int i) {
        if (A0T() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < AbstractC70663Fe.A0C(A0e(0))) {
            z = true;
        }
        if (z != this.A09) {
            i2 = -1;
        }
        float f = i2;
        if (this.A01 == 0) {
            return new PointF(f, 0.0f);
        }
        return new PointF(0.0f, f);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.3Fn, java.lang.Object] */
    public LinearLayoutManager(Context context, int i, boolean z) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0D = new C70743Fm();
        this.A0E = new Object();
        this.A00 = 2;
        this.A0C = new int[2];
        A1o(i);
        A1D(null);
        if (z != this.A08) {
            this.A08 = z;
            A0i();
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }
}
