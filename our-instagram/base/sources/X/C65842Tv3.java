package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tv3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65842Tv3 extends C1I4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C69044Vgl A04;
    public AbstractC65852TvD A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final LinearLayoutManager A0A;
    public final RecyclerView A0B;
    public final ViewPager2 A0C;

    public static void A00(C65842Tv3 c65842Tv3) {
        c65842Tv3.A00 = 0;
        c65842Tv3.A02 = 0;
        C69044Vgl c69044Vgl = c65842Tv3.A04;
        c69044Vgl.A02 = -1;
        c69044Vgl.A00 = 0.0f;
        c69044Vgl.A01 = 0;
        c65842Tv3.A01 = -1;
        c65842Tv3.A03 = -1;
        c65842Tv3.A08 = false;
        c65842Tv3.A09 = false;
        c65842Tv3.A07 = false;
        c65842Tv3.A06 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        r4 = r6.A00;
        r2 = r4.A0T();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        if (r1 >= r2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        if (X.W1Y.A00(r4.A0e(r1)) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013b, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0156, code lost:
    
        throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.lang.Integer.valueOf(r3.A01)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        if (r7[r8 - 1][1] >= r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
    
        if (r6.A00.A0T() <= 1) goto L54;
     */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.W1Y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C65842Tv3 r13) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65842Tv3.A01(X.Tv3):void");
    }

    public static void A02(C65842Tv3 c65842Tv3, int i) {
        if ((c65842Tv3.A00 == 3 && c65842Tv3.A02 == 0) || c65842Tv3.A02 == i) {
            return;
        }
        c65842Tv3.A02 = i;
        AbstractC65852TvD abstractC65852TvD = c65842Tv3.A05;
        if (abstractC65852TvD == null) {
            return;
        }
        abstractC65852TvD.A00(i);
    }

    public static void A03(C65842Tv3 c65842Tv3, boolean z) {
        c65842Tv3.A07 = z;
        int i = 1;
        if (z) {
            i = 4;
        }
        c65842Tv3.A00 = i;
        int i2 = c65842Tv3.A03;
        if (i2 != -1) {
            c65842Tv3.A01 = i2;
            c65842Tv3.A03 = -1;
        } else if (c65842Tv3.A01 == -1) {
            c65842Tv3.A01 = c65842Tv3.A0A.A1a();
        }
        A02(c65842Tv3, 1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Vgl] */
    public C65842Tv3(ViewPager2 viewPager2) {
        this.A0C = viewPager2;
        RecyclerView recyclerView = viewPager2.A04;
        this.A0B = recyclerView;
        this.A0A = (LinearLayoutManager) recyclerView.A0D;
        this.A04 = new Object();
        A00(this);
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        AbstractC65852TvD abstractC65852TvD;
        AbstractC65852TvD abstractC65852TvD2;
        int A03 = C0f9.A03(-79209008);
        int i3 = this.A00;
        if ((i3 != 1 || this.A02 != 1) && i == 1) {
            A03(this, false);
            i2 = -1531420113;
        } else {
            boolean z = true;
            if (i3 != 1 && i3 != 4) {
                z = false;
            }
            if (z && i == 2) {
                if (this.A09) {
                    A02(this, 2);
                    this.A08 = true;
                }
                i2 = -1792880667;
            } else {
                if (z && i == 0) {
                    A01(this);
                    boolean z2 = this.A09;
                    C69044Vgl c69044Vgl = this.A04;
                    if (!z2) {
                        int i4 = c69044Vgl.A02;
                        if (i4 != -1 && (abstractC65852TvD2 = this.A05) != null) {
                            abstractC65852TvD2.A02(i4, 0.0f, 0);
                        }
                    } else if (c69044Vgl.A01 == 0) {
                        int i5 = this.A01;
                        int i6 = c69044Vgl.A02;
                        if (i5 != i6 && (abstractC65852TvD = this.A05) != null) {
                            abstractC65852TvD.A01(i6);
                        }
                    }
                    A02(this, 0);
                    A00(this);
                }
                if (this.A00 == 2 && i == 0 && this.A06) {
                    A01(this);
                    C69044Vgl c69044Vgl2 = this.A04;
                    if (c69044Vgl2.A01 == 0) {
                        int i7 = this.A03;
                        int i8 = c69044Vgl2.A02;
                        if (i7 != i8) {
                            if (i8 == -1) {
                                i8 = 0;
                            }
                            AbstractC65852TvD abstractC65852TvD3 = this.A05;
                            if (abstractC65852TvD3 != null) {
                                abstractC65852TvD3.A01(i8);
                            }
                        }
                        A02(this, 0);
                        A00(this);
                    }
                }
                i2 = -2129678176;
            }
        }
        C0f9.A0A(i2, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r2 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r9.A01 != r1) goto L19;
     */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = -1017266303(0xffffffffc35dbf81, float:-221.74806)
            int r4 = X.C0f9.A03(r0)
            r5 = 1
            r9.A09 = r5
            A01(r9)
            boolean r0 = r9.A08
            r7 = -1
            r3 = 0
            if (r0 == 0) goto L78
            r9.A08 = r3
            if (r12 > 0) goto L2d
            if (r12 != 0) goto L73
            r2 = 0
            if (r11 >= 0) goto L1d
            r2 = 1
        L1d:
            androidx.viewpager2.widget.ViewPager2 r0 = r9.A0C
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A02
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 == r5) goto L2b
            r0 = 0
        L2b:
            if (r2 != r0) goto L73
        L2d:
            X.Vgl r1 = r9.A04
            int r0 = r1.A01
            if (r0 == 0) goto L73
            int r0 = r1.A02
            int r1 = r0 + 1
        L37:
            r9.A03 = r1
            int r0 = r9.A01
            if (r0 == r1) goto L44
        L3d:
            X.TvD r0 = r9.A05
            if (r0 == 0) goto L44
            r0.A01(r1)
        L44:
            X.Vgl r8 = r9.A04
            int r6 = r8.A02
            if (r6 != r7) goto L4b
            r6 = 0
        L4b:
            float r2 = r8.A00
            int r1 = r8.A01
            X.TvD r0 = r9.A05
            if (r0 == 0) goto L56
            r0.A02(r6, r2, r1)
        L56:
            int r1 = r8.A02
            int r0 = r9.A03
            if (r1 == r0) goto L5e
            if (r0 != r7) goto L6c
        L5e:
            int r0 = r8.A01
            if (r0 != 0) goto L6c
            int r0 = r9.A02
            if (r0 == r5) goto L6c
            A02(r9, r3)
            A00(r9)
        L6c:
            r0 = 161333262(0x99dc00e, float:3.7976983E-33)
            X.C0f9.A0A(r0, r4)
            return
        L73:
            X.Vgl r0 = r9.A04
            int r1 = r0.A02
            goto L37
        L78:
            int r0 = r9.A00
            if (r0 != 0) goto L44
            X.Vgl r0 = r9.A04
            int r1 = r0.A02
            if (r1 != r7) goto L3d
            r1 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65842Tv3.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
