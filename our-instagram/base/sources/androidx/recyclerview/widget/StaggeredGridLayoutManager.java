package androidx.recyclerview.widget;

import X.AbstractC110824yu;
import X.AbstractC70663Fe;
import X.AbstractC70763Fo;
import X.AnonymousClass807;
import X.C110814yt;
import X.C2UU;
import X.C3F5;
import X.C3FM;
import X.C3OP;
import X.C4iv;
import X.C69624VsR;
import X.C70593Ew;
import X.C9GM;
import X.InterfaceC70673Ff;
import X.L88;
import X.Py5;
import X.RunnableC49809LzG;
import X.SQC;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends AbstractC70663Fe implements InterfaceC70673Ff {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public AbstractC70763Fo A07;
    public AbstractC70763Fo A08;
    public SQC A09;
    public SavedState A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int[] A0G;
    public C9GM[] A0H;
    public BitSet A0I;
    public boolean A0J;
    public final Rect A0K;
    public final L88 A0L;
    public final Runnable A0M;
    public final C69624VsR A0N;

    /* loaded from: classes10.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = Py5.A00(64);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public List A04;
        public boolean A05;
        public boolean A06;
        public boolean A07;
        public int[] A08;
        public int[] A09;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A02);
            if (this.A02 > 0) {
                parcel.writeIntArray(this.A09);
            }
            parcel.writeInt(this.A01);
            if (this.A01 > 0) {
                parcel.writeIntArray(this.A08);
            }
            parcel.writeInt(this.A07 ? 1 : 0);
            parcel.writeInt(this.A05 ? 1 : 0);
            parcel.writeInt(this.A06 ? 1 : 0);
            parcel.writeList(this.A04);
        }
    }

    public static int A04(C3F5 c3f5, StaggeredGridLayoutManager staggeredGridLayoutManager) {
        if (staggeredGridLayoutManager.A0T() == 0) {
            return 0;
        }
        AbstractC70763Fo abstractC70763Fo = staggeredGridLayoutManager.A07;
        boolean z = staggeredGridLayoutManager.A0F;
        boolean z2 = !z;
        return C4iv.A02(staggeredGridLayoutManager.A1f(z2), staggeredGridLayoutManager.A1e(z2), abstractC70763Fo, staggeredGridLayoutManager, c3f5, z, staggeredGridLayoutManager.A0E);
    }

    @Override // X.AbstractC70663Fe
    public final void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
        A08(c70593Ew, c3f5, true);
    }

    @Override // X.AbstractC70663Fe
    public final void A1S(C3F5 c3f5) {
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A0A = null;
        this.A0N.A00();
    }

    @Override // X.AbstractC70663Fe
    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        A0K(this, i, i2, 1);
    }

    @Override // X.AbstractC70663Fe
    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        A0K(this, i, i2, 2);
    }

    public final void A1g(int i) {
        A1D(null);
        if (i != this.A06) {
            this.A09.A01();
            A0i();
            this.A06 = i;
            this.A0I = new BitSet(i);
            C9GM[] c9gmArr = new C9GM[i];
            this.A0H = c9gmArr;
            for (int i2 = 0; i2 < i; i2++) {
                c9gmArr[i2] = new C9GM(this, i2);
            }
            A0i();
        }
    }

    public final void A1h(C3F5 c3f5, int i) {
        int A1a;
        int i2;
        if (i > 0) {
            A1a = A1b();
            i2 = 1;
        } else {
            A1a = A1a();
            i2 = -1;
        }
        L88 l88 = this.A0L;
        l88.A07 = true;
        A0I(c3f5, A1a);
        A06(i2);
        l88.A01 = A1a + l88.A03;
        l88.A00 = Math.abs(i);
    }

    private int A00(int i) {
        int A02 = this.A0H[0].A02(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A022 = this.A0H[i2].A02(i);
            if (A022 > A02) {
                A02 = A022;
            }
        }
        return A02;
    }

    private int A01(int i) {
        int A03 = this.A0H[0].A03(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A032 = this.A0H[i2].A03(i);
            if (A032 < A03) {
                A03 = A032;
            }
        }
        return A03;
    }

    public static int A02(int i, int i2, int i3) {
        int mode;
        if ((i2 == 0 && i3 == 0) || ((mode = View.MeasureSpec.getMode(i)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r2 >= r27.A00()) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028e A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d4  */
    /* JADX WARN: Type inference failed for: r14v12, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A03(X.L88 r25, X.C70593Ew r26, X.C3F5 r27) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A03(X.L88, X.3Ew, X.3F5):int");
    }

    private void A05() {
        boolean z;
        if (this.A02 != 1 && A1j()) {
            z = !this.A0D;
        } else {
            z = this.A0D;
        }
        this.A0E = z;
    }

    private void A06(int i) {
        L88 l88 = this.A0L;
        l88.A04 = i;
        boolean z = this.A0E;
        int i2 = 1;
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        if (z != z2) {
            i2 = -1;
        }
        l88.A03 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r0 == (-1)) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(X.L88 r8, X.C70593Ew r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A07(X.L88, X.3Ew):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x037b, code lost:
    
        if (r1 > 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03a7, code lost:
    
        if (A1i() == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01e6, code lost:
    
        if (r11.A0E != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01e8, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01e9, code lost:
    
        r8.A03 = r3;
        r0 = r8.A06.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01ef, code lost:
    
        if (r3 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01f1, code lost:
    
        r0 = r0.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01fb, code lost:
    
        r0 = r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x020a, code lost:
    
        if (r2 != r11.A0E) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(X.C70593Ew r12, X.C3F5 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A08(X.3Ew, X.3F5, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I(X.C3F5 r8, int r9) {
        /*
            r7 = this;
            X.L88 r4 = r7.A0L
            r3 = 0
            r4.A00 = r3
            r4.A01 = r9
            X.4yu r0 = r7.A06
            if (r0 == 0) goto L10
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L11
        L10:
            r0 = 0
        L11:
            r6 = 1
            if (r0 == 0) goto L64
            int r5 = r8.A06
            r0 = -1
            if (r5 == r0) goto L64
            boolean r2 = r7.A0E
            r1 = 0
            if (r5 >= r9) goto L1f
            r1 = 1
        L1f:
            X.3Fo r0 = r7.A07
            int r5 = r0.A07()
            if (r2 == r1) goto L65
            r2 = r5
            r5 = 0
        L29:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L32
            boolean r1 = r0.A0O
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            X.3Fo r1 = r7.A07
            if (r0 == 0) goto L59
            int r0 = r1.A06()
            int r0 = r0 - r2
            r4.A05 = r0
            int r0 = r1.A03()
            int r0 = r0 + r5
            r4.A02 = r0
        L45:
            r4.A08 = r3
            r4.A07 = r6
            int r0 = r1.A05()
            if (r0 != 0) goto L56
            int r0 = r1.A02()
            if (r0 != 0) goto L56
            r3 = 1
        L56:
            r4.A06 = r3
            return
        L59:
            int r0 = r1.A02()
            int r0 = r0 + r5
            r4.A02 = r0
            int r0 = -r2
            r4.A05 = r0
            goto L45
        L64:
            r5 = 0
        L65:
            r2 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0I(X.3F5, int):void");
    }

    private void A0J(C9GM c9gm, int i, int i2) {
        int i3 = c9gm.A02;
        if (i == -1) {
            int i4 = c9gm.A01;
            if (i4 == Integer.MIN_VALUE) {
                c9gm.A08();
                i4 = c9gm.A01;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = c9gm.A00;
            if (i5 == Integer.MIN_VALUE) {
                c9gm.A07();
                i5 = c9gm.A00;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A0I.set(c9gm.A04, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0K(androidx.recyclerview.widget.StaggeredGridLayoutManager r7, int r8, int r9, int r10) {
        /*
            boolean r0 = r7.A0E
            if (r0 == 0) goto L47
            int r6 = r7.A1b()
        L8:
            r5 = 8
            if (r10 != r5) goto L43
            int r4 = r9 + 1
            if (r8 < r9) goto L45
            int r4 = r8 + 1
            r3 = r9
        L13:
            X.SQC r2 = r7.A09
            r2.A04(r3)
            r1 = 1
            if (r10 == r1) goto L3f
            r0 = 2
            if (r10 == r0) goto L3b
            if (r10 != r5) goto L26
            r2.A06(r8, r1)
            r2.A05(r9, r1)
        L26:
            if (r4 <= r6) goto L35
            boolean r0 = r7.A0E
            if (r0 == 0) goto L36
            int r0 = r7.A1a()
        L30:
            if (r3 > r0) goto L35
            r7.A0i()
        L35:
            return
        L36:
            int r0 = r7.A1b()
            goto L30
        L3b:
            r2.A06(r8, r9)
            goto L26
        L3f:
            r2.A05(r8, r9)
            goto L26
        L43:
            int r4 = r8 + r9
        L45:
            r3 = r8
            goto L13
        L47:
            int r6 = r7.A1a()
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0K(androidx.recyclerview.widget.StaggeredGridLayoutManager, int, int, int):void");
    }

    private boolean A0L(int i) {
        if (this.A02 == 0) {
            boolean z = false;
            if (i == -1) {
                z = true;
            }
            if (z != this.A0E) {
                return true;
            }
            return false;
        }
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        boolean z3 = false;
        if (z2 == this.A0E) {
            z3 = true;
        }
        if (z3 == A1j()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC70663Fe
    public final void A1D(String str) {
        if (this.A0A == null) {
            super.A1D(str);
        }
    }

    @Override // X.AbstractC70663Fe
    public final C3OP A1F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C3OP((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C3OP(layoutParams);
    }

    @Override // X.AbstractC70663Fe
    public final void A1I(RecyclerView recyclerView) {
        this.A09.A01();
        A0i();
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1J() {
        if (this.A0A != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
    @Override // X.AbstractC70663Fe
    public final Parcelable A1M() {
        ?? obj;
        int A1a;
        View A1f;
        int A0C;
        int A03;
        int A06;
        int[] iArr;
        SavedState savedState = this.A0A;
        if (savedState != null) {
            obj = new Object();
            obj.A02 = savedState.A02;
            obj.A00 = savedState.A00;
            obj.A03 = savedState.A03;
            obj.A09 = savedState.A09;
            obj.A01 = savedState.A01;
            obj.A08 = savedState.A08;
            obj.A07 = savedState.A07;
            obj.A05 = savedState.A05;
            obj.A06 = savedState.A06;
            obj.A04 = savedState.A04;
        } else {
            obj = new Object();
            obj.A07 = this.A0D;
            obj.A05 = this.A0B;
            obj.A06 = this.A0C;
            SQC sqc = this.A09;
            if (sqc != null && (iArr = sqc.A01) != null) {
                obj.A08 = iArr;
                obj.A01 = iArr.length;
                obj.A04 = sqc.A00;
            } else {
                obj.A01 = 0;
            }
            if (A0T() > 0) {
                if (this.A0B) {
                    A1a = A1b();
                } else {
                    A1a = A1a();
                }
                obj.A00 = A1a;
                if (this.A0E) {
                    A1f = A1e(true);
                } else {
                    A1f = A1f(true);
                }
                if (A1f == null) {
                    A0C = -1;
                } else {
                    A0C = AbstractC70663Fe.A0C(A1f);
                }
                obj.A03 = A0C;
                int i = this.A06;
                obj.A02 = i;
                obj.A09 = new int[i];
                for (int i2 = 0; i2 < this.A06; i2++) {
                    boolean z = this.A0B;
                    C9GM c9gm = this.A0H[i2];
                    if (z) {
                        A03 = c9gm.A02(Integer.MIN_VALUE);
                        if (A03 != Integer.MIN_VALUE) {
                            A06 = this.A07.A03();
                            A03 -= A06;
                            obj.A09[i2] = A03;
                        } else {
                            obj.A09[i2] = A03;
                        }
                    } else {
                        A03 = c9gm.A03(Integer.MIN_VALUE);
                        if (A03 == Integer.MIN_VALUE) {
                            obj.A09[i2] = A03;
                        } else {
                            A06 = this.A07.A06();
                            A03 -= A06;
                            obj.A09[i2] = A03;
                        }
                    }
                }
            } else {
                obj.A00 = -1;
                obj.A03 = -1;
                obj.A02 = 0;
                return obj;
            }
        }
        return obj;
    }

    @Override // X.AbstractC70663Fe
    public final C3OP A1N(Context context, AttributeSet attributeSet) {
        return new C3OP(context, attributeSet);
    }

    @Override // X.AbstractC70663Fe
    public final void A1O(int i) {
        SavedState savedState = this.A0A;
        if (savedState != null && savedState.A00 != i) {
            savedState.A09 = null;
            savedState.A02 = 0;
            savedState.A00 = -1;
            savedState.A03 = -1;
        }
        this.A03 = i;
        this.A04 = Integer.MIN_VALUE;
        A0i();
    }

    @Override // X.AbstractC70663Fe
    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A0A = savedState;
            if (this.A03 != -1) {
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A00 = -1;
                savedState.A03 = -1;
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A01 = 0;
                savedState.A08 = null;
                savedState.A04 = null;
            }
            A0i();
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1Q(C2UU c2uu, C2UU c2uu2) {
        this.A09.A01();
        for (int i = 0; i < this.A06; i++) {
            this.A0H[i].A09();
        }
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1X() {
        if (this.A02 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Y() {
        if (this.A02 == 1) {
            return true;
        }
        return false;
    }

    public final View A1e(boolean z) {
        AbstractC70763Fo abstractC70763Fo = this.A07;
        int A06 = abstractC70763Fo.A06();
        int A03 = abstractC70763Fo.A03();
        View view = null;
        for (int A0T = A0T() - 1; A0T >= 0; A0T--) {
            View A0e = A0e(A0T);
            int A0D = abstractC70763Fo.A0D(A0e);
            int A08 = abstractC70763Fo.A08(A0e);
            if (A08 > A06 && A0D < A03) {
                if (A08 > A03 && z) {
                    if (view == null) {
                        view = A0e;
                    }
                } else {
                    return A0e;
                }
            }
        }
        return view;
    }

    public final View A1f(boolean z) {
        AbstractC70763Fo abstractC70763Fo = this.A07;
        int A06 = abstractC70763Fo.A06();
        int A03 = abstractC70763Fo.A03();
        int A0T = A0T();
        View view = null;
        for (int i = 0; i < A0T; i++) {
            View A0e = A0e(i);
            int A0D = abstractC70763Fo.A0D(A0e);
            if (abstractC70763Fo.A08(A0e) > A06 && A0D < A03) {
                if (A0D < A06 && z) {
                    if (view == null) {
                        view = A0e;
                    }
                } else {
                    return A0e;
                }
            }
        }
        return view;
    }

    public final boolean A1j() {
        if (super.A07.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.SQC, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A06 = -1;
        this.A0D = false;
        this.A0E = false;
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A09 = new Object();
        this.A01 = 2;
        this.A0K = new Rect();
        this.A0N = new C69624VsR(this);
        this.A0J = false;
        this.A0F = true;
        this.A0M = new RunnableC49809LzG(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3FM.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        int i4 = obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        A1D(null);
        if (i3 != this.A02) {
            this.A02 = i3;
            AbstractC70763Fo abstractC70763Fo = this.A07;
            this.A07 = this.A08;
            this.A08 = abstractC70763Fo;
            A0i();
        }
        A1g(i4);
        A1D(null);
        SavedState savedState = this.A0A;
        if (savedState != null && savedState.A07 != z) {
            savedState.A07 = z;
        }
        this.A0D = z;
        A0i();
        this.A0L = new L88();
        this.A07 = AbstractC70763Fo.A00(this, this.A02);
        this.A08 = AbstractC70763Fo.A00(this, 1 - this.A02);
    }

    @Override // X.AbstractC70663Fe
    public final void A1A(int i) {
        super.A1A(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C9GM c9gm = this.A0H[i2];
            int i3 = c9gm.A01;
            if (i3 != Integer.MIN_VALUE) {
                c9gm.A01 = i3 + i;
            }
            int i4 = c9gm.A00;
            if (i4 != Integer.MIN_VALUE) {
                c9gm.A00 = i4 + i;
            }
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1B(int i) {
        super.A1B(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C9GM c9gm = this.A0H[i2];
            int i3 = c9gm.A01;
            if (i3 != Integer.MIN_VALUE) {
                c9gm.A01 = i3 + i;
            }
            int i4 = c9gm.A00;
            if (i4 != Integer.MIN_VALUE) {
                c9gm.A00 = i4 + i;
            }
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1C(AccessibilityEvent accessibilityEvent) {
        super.A1C(accessibilityEvent);
        if (A0T() > 0) {
            View A1f = A1f(false);
            View A1e = A1e(false);
            if (A1f != null && A1e != null) {
                int A0C = AbstractC70663Fe.A0C(A1f);
                int A0C2 = AbstractC70663Fe.A0C(A1e);
                if (A0C < A0C2) {
                    accessibilityEvent.setFromIndex(A0C);
                    accessibilityEvent.setToIndex(A0C2);
                } else {
                    accessibilityEvent.setFromIndex(A0C2);
                    accessibilityEvent.setToIndex(A0C);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0087, code lost:
    
        if (r11.A02 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00a2, code lost:
    
        if (r11.A02 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0092, code lost:
    
        if (A1j() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x009d, code lost:
    
        if (A1j() != false) goto L24;
     */
    @Override // X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A1E(android.view.View r12, X.C70593Ew r13, X.C3F5 r14, int r15) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1E(android.view.View, X.3Ew, X.3F5, int):android.view.View");
    }

    @Override // X.AbstractC70663Fe
    public final void A1G(Rect rect, int i, int i2) {
        int A09;
        int A092;
        int Bau = Bau() + Baw();
        int Bax = Bax() + Bat();
        if (this.A02 == 1) {
            A092 = AbstractC70663Fe.A09(i2, rect.height() + Bax, super.A07.getMinimumHeight());
            A09 = AbstractC70663Fe.A09(i, (this.A05 * this.A06) + Bau, super.A07.getMinimumWidth());
        } else {
            A09 = AbstractC70663Fe.A09(i, rect.width() + Bau, super.A07.getMinimumWidth());
            A092 = AbstractC70663Fe.A09(i2, (this.A05 * this.A06) + Bax, super.A07.getMinimumHeight());
        }
        super.A07.setMeasuredDimension(A09, A092);
    }

    @Override // X.AbstractC70663Fe
    public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        return A1c(c70593Ew, c3f5, i);
    }

    @Override // X.AbstractC70663Fe
    public final int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        return A1c(c70593Ew, c3f5, i);
    }

    @Override // X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C110814yt c110814yt = new C110814yt(recyclerView.getContext());
        ((AbstractC110824yu) c110814yt).A00 = i;
        A10(c110814yt);
    }

    public final int A1a() {
        if (A0T() == 0) {
            return 0;
        }
        return AbstractC70663Fe.A0C(A0e(0));
    }

    public final int A1b() {
        int A0T = A0T();
        if (A0T == 0) {
            return 0;
        }
        return AbstractC70663Fe.A0C(A0e(A0T - 1));
    }

    public final int A1c(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (A0T() == 0 || i == 0) {
            return 0;
        }
        A1h(c3f5, i);
        L88 l88 = this.A0L;
        int A03 = A03(l88, c70593Ew, c3f5);
        if (l88.A00 >= A03) {
            i = A03;
            if (i < 0) {
                i = -A03;
            }
        }
        this.A07.A0E(-i);
        this.A0B = this.A0E;
        l88.A00 = 0;
        A07(l88, c70593Ew);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (A1j() == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A1d() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1d():android.view.View");
    }

    public final boolean A1i() {
        int A1a;
        int A1b;
        int i;
        if (A0T() != 0 && this.A01 != 0 && super.A0B) {
            if (this.A0E) {
                A1a = A1b();
                A1b = A1a();
            } else {
                A1a = A1a();
                A1b = A1b();
            }
            if (A1a == 0 && A1d() != null) {
                this.A09.A01();
            } else if (this.A0J) {
                int i2 = 1;
                if (this.A0E) {
                    i2 = -1;
                }
                SQC sqc = this.A09;
                int i3 = A1b + 1;
                List list = sqc.A00;
                if (list != null) {
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sqc.A00.get(i4);
                        int i5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                        if (i5 >= i3) {
                            break;
                        }
                        if (i5 >= A1a && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A00 == i2 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A02)) {
                            int i6 = -i2;
                            List list2 = sqc.A00;
                            if (list2 != null) {
                                int size2 = list2.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) sqc.A00.get(i7);
                                    int i8 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A01;
                                    if (i8 >= i5) {
                                        break;
                                    }
                                    if (i8 >= A1a && (i6 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A00 == i6 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A02)) {
                                        i = i8 + 1;
                                        break;
                                    }
                                }
                            }
                            i = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                            sqc.A03(i);
                        }
                    }
                }
                this.A0J = false;
                sqc.A03(i3);
            }
            super.A0F = true;
            A0i();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r1 != r4.A0E) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r4.A0E != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r3 = 1;
     */
    @Override // X.InterfaceC70673Ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF AIz(int r5) {
        /*
            r4 = this;
            int r0 = r4.A0T()
            r3 = -1
            if (r0 != 0) goto L1c
            boolean r0 = r4.A0E
            if (r0 == 0) goto Lc
        Lb:
            r3 = 1
        Lc:
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            int r0 = r4.A02
            r1 = 0
            if (r0 != 0) goto L29
            float r0 = (float) r3
            r2.x = r0
            r2.y = r1
            return r2
        L1c:
            int r0 = r4.A1a()
            r1 = 0
            if (r5 >= r0) goto L24
            r1 = 1
        L24:
            boolean r0 = r4.A0E
            if (r1 == r0) goto Lb
            goto Lc
        L29:
            r2.x = r1
            float r0 = (float) r3
            r2.y = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.AIz(int):android.graphics.PointF");
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Z(C3OP c3op) {
        return c3op instanceof AnonymousClass807;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.SQC, java.lang.Object] */
    public StaggeredGridLayoutManager(int i, int i2) {
        this.A06 = -1;
        this.A0D = false;
        this.A0E = false;
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A09 = new Object();
        this.A01 = 2;
        this.A0K = new Rect();
        this.A0N = new C69624VsR(this);
        this.A0J = false;
        this.A0F = true;
        this.A0M = new RunnableC49809LzG(this);
        this.A02 = i2;
        A1g(i);
        this.A0L = new L88();
        this.A07 = AbstractC70763Fo.A00(this, this.A02);
        this.A08 = AbstractC70763Fo.A00(this, 1 - this.A02);
    }
}
