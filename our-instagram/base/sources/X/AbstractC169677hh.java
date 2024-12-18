package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169677hh {
    public static final void A01(C3F1 c3f1, C2Z1 c2z1, C2Z8 c2z8, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C169657hf A00 = A00(c2z8);
        A00.setContentDescription(null);
        A00.A0S = z;
        A00.setClipToPadding(z2);
        c2z8.setClipToPadding(z2);
        A00.setPaddingRelative(i, i2, i3, 0);
        A00.setClipChildren(z3);
        c2z8.setClipChildren(z3);
        A00.setNestedScrollingEnabled(z4);
        c2z8.setNestedScrollingEnabled(z4);
        A00.setScrollBarStyle(0);
        A00.setHorizontalFadingEdgeEnabled(z5);
        A00.setVerticalFadingEdgeEnabled(z6);
        A00.A03 = z7;
        A00.A04 = z8;
        A00.A05 = z9;
        A00.A02 = z10;
        A00.setFadingEdgeLength(C2Z3.A00(c2z1.BoZ(), Double.doubleToRawLongBits(i4)));
        A00.setId(i5);
        A00.setOverScrollMode(i6);
        c2z8.setColorSchemeColors(i7);
        c2z8.setItemAnimator(c3f1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r10 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C7LD r4, X.AbstractC61802rh r5, X.InterfaceC168047ez r6, X.C169987iD r7, X.C2Z8 r8, java.util.List r9, X.InterfaceC16820sZ r10, boolean r11) {
        /*
            r0 = 0
            X.7hf r2 = A00(r8)
            r8.A01 = r0
            r8.setContentDescription(r0)
            if (r11 == 0) goto Lf
            r0 = 1
            if (r10 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            r8.setEnabled(r0)
            if (r10 == 0) goto L1c
            X.AUY r0 = new X.AUY
            r0.<init>(r10)
            r8.A0E = r0
        L1c:
            if (r9 == 0) goto L31
            int r3 = r9.size()
            r1 = 0
        L23:
            if (r1 >= r3) goto L31
            java.lang.Object r0 = r9.get(r1)
            X.1I4 r0 = (X.C1I4) r0
            r2.A14(r0)
            int r1 = r1 + 1
            goto L23
        L31:
            if (r6 == 0) goto L35
            r2.A00 = r6
        L35:
            if (r4 == 0) goto L3a
            r2.A12(r4)
        L3a:
            X.2ri r0 = r2.A0E
            if (r0 != 0) goto L43
            if (r5 == 0) goto L43
            r5.A07(r2)
        L43:
            if (r7 == 0) goto L54
            r7.A01 = r8
            X.A4l r0 = r7.A02
            if (r0 == 0) goto L52
            androidx.recyclerview.widget.RecyclerView r1 = r8.A04
            X.0sJ r0 = r0.A00
            r0.invoke(r1)
        L52:
            r7.A00 = r5
        L54:
            boolean r0 = r8.A02
            if (r0 == 0) goto L5e
            r2.requestLayout()
            r0 = 0
            r8.A02 = r0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC169677hh.A02(X.7LD, X.2rh, X.7ez, X.7iD, X.2Z8, java.util.List, X.0sZ, boolean):void");
    }

    public static final C169657hf A00(C2Z8 c2z8) {
        C169657hf c169657hf;
        RecyclerView recyclerView = c2z8.A04;
        if ((recyclerView instanceof C169657hf) && (c169657hf = (C169657hf) recyclerView) != null) {
            return c169657hf;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
    }

    public static final void A03(AbstractC61802rh abstractC61802rh, C2Z8 c2z8) {
        A00(c2z8).setId(-1);
        if (abstractC61802rh != null) {
            abstractC61802rh.A07(null);
        }
        c2z8.A04.setItemAnimator(c2z8.A00);
        c2z8.A00 = null;
    }
}
