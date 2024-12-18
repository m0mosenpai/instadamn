package com.facebook.common.staggeredgrid;

import X.AbstractC167017dG;
import X.AbstractC70663Fe;
import X.C14360o3;
import X.C3F5;
import X.C3OP;
import X.C51752Mtb;
import X.C70593Ew;
import X.UQ7;
import android.content.Context;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes9.dex */
public final class HorizontalStaggeredLayoutManager extends AbstractC70663Fe {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public RecyclerView A07;
    public final C51752Mtb A09;
    public final Context A0B;
    public final SparseArray A08 = new SparseArray();
    public final LruCache A0C = new LruCache(100);
    public final ConcurrentMap A0A = new ConcurrentHashMap();

    @Override // X.AbstractC70663Fe
    public final C3OP A0g() {
        return new C3OP(-2, -2);
    }

    @Override // X.AbstractC70663Fe
    public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        C14360o3.A0B(c70593Ew, 1);
        int i2 = this.A00;
        int i3 = i2 + i;
        if (i3 < i2) {
            this.A03 = 0;
        }
        this.A00 = i3;
        int i4 = (this.A01 + this.A09.A00) - super.A03;
        if (i3 < 0) {
            i4 = 0;
        } else {
            if (i3 <= i4) {
                i4 = i3;
            }
            if (i4 < i3) {
                this.A03 = 0;
            }
        }
        this.A00 = i4;
        A01(c70593Ew, c3f5);
        return i;
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1X() {
        return true;
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Y() {
        return false;
    }

    private final UQ7 A00(int i) {
        Object obj;
        if (this.A04 == 0) {
            return null;
        }
        SparseArray sparseArray = this.A08;
        if (i < sparseArray.size()) {
            obj = sparseArray.get(i);
        } else {
            LruCache lruCache = this.A0C;
            Integer valueOf = Integer.valueOf(i);
            if (lruCache.get(valueOf) != null) {
                obj = lruCache.get(valueOf);
            } else {
                UQ7 uq7 = (UQ7) sparseArray.get(i % this.A04);
                UQ7 A00 = A00(i - this.A05);
                if (A00 == null) {
                    return null;
                }
                int i2 = A00.A02 + this.A09.A00;
                UQ7 uq72 = new UQ7(i2, uq7.A03, (uq7.A02 - uq7.A01) + i2, uq7.A00, 0);
                lruCache.put(valueOf, uq72);
                return uq72;
            }
        }
        return (UQ7) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
    
        if (r8 > r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        r3 = r5 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        if (r3 < A0U()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        r3 = A0U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
    
        r1 = java.lang.Integer.valueOf(r8);
        r0 = java.lang.Integer.valueOf(r3);
        r12 = r1.intValue();
        r16 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (r12 >= r16) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        r13 = r18.A04(r12);
        X.C14360o3.A07(r13);
        A0o(r13, -1);
        r11 = A00(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        if (r11 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        r1 = r11.A01;
        r10 = r1 - r17.A00;
        r9 = r10 + (r11.A02 - r1);
        r8 = r11.A03;
        r7 = (r11.A00 - r8) + r8;
        r4 = false;
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
    
        if ((r12 % r5) >= r17.A06) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        r4 = true;
        r3 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014b, code lost:
    
        if (r13.getAlpha() == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014d, code lost:
    
        r1 = r17.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0153, code lost:
    
        if (X.MSY.A1Y(r13, r1, r3) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        r1.put(r13, java.lang.Float.valueOf(r3));
        X.MSX.A10(r13);
        X.MSX.A14(X.MSX.A0A(r13, r3).setDuration(80), new X.PS4(r13, r17, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
    
        r1 = r11.A02 - r11.A01;
        r0 = r11.A00 - r11.A03;
        r14 = (X.C3OP) r13.getLayoutParams();
        r11 = r17.A07.A0S(r13);
        r1 = r1 + (r11.left + r11.right);
        r0 = r0 + (r11.top + r11.bottom);
        r11 = X.AbstractC70663Fe.A0A(r17.A03, r17.A04, (Bau() + Baw()) + r1, ((android.view.ViewGroup.LayoutParams) r14).width, A1X());
        r1 = X.AbstractC70663Fe.A0A(r17.A00, r17.A01, (Bax() + Bat()) + r0, ((android.view.ViewGroup.LayoutParams) r14).height, A1Y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c7, code lost:
    
        if (A18(r13, r14, r11, r1) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c9, code lost:
    
        r13.measure(r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cc, code lost:
    
        X.AbstractC70663Fe.A0E(r13, r10, r8, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f6, code lost:
    
        r0 = r18.A07;
        X.C14360o3.A07(r0);
        r1 = X.AbstractC001800i.A0a(r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0207, code lost:
    
        if (r1.hasNext() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0209, code lost:
    
        r18.A0A(((X.C3OO) r1.next()).itemView);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d3, code lost:
    
        r0 = A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
    
        if (r0.A01 > (r17.A00 + r17.A03)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
    
        r0 = r4;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e8, code lost:
    
        if (r0 != r8) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(X.C70593Ew r18, X.C3F5 r19) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager.A01(X.3Ew, X.3F5):void");
    }

    @Override // X.AbstractC70663Fe
    public final void A11(RecyclerView recyclerView) {
        this.A0C.evictAll();
    }

    public HorizontalStaggeredLayoutManager(Context context, C51752Mtb c51752Mtb, int i) {
        this.A0B = context;
        this.A09 = c51752Mtb;
        this.A05 = i;
        this.A06 = i;
    }

    @Override // X.AbstractC70663Fe
    public final void A0y(C70593Ew c70593Ew, C3F5 c3f5, int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i2);
        } else {
            SparseArray sparseArray = this.A08;
            int i4 = this.A05 - 1;
            if (sparseArray.indexOfKey(i4) >= 0) {
                i3 = this.A09.A01 + ((UQ7) sparseArray.get(i4)).A00;
            }
        }
        super.A07.setMeasuredDimension(size, i3);
    }

    @Override // X.AbstractC70663Fe
    public final void A0z(C70593Ew c70593Ew, RecyclerView recyclerView) {
        A11(recyclerView);
        this.A07 = null;
    }

    @Override // X.AbstractC70663Fe
    public final void A1O(int i) {
        super.A1O(i);
        if (i < this.A00) {
            this.A03 = 0;
        }
        this.A00 = i;
    }

    @Override // X.AbstractC70663Fe
    public final void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
        AbstractC167017dG.A1N(c70593Ew, c3f5);
        A01(c70593Ew, c3f5);
    }

    @Override // X.AbstractC70663Fe
    public final void A1U(RecyclerView recyclerView) {
        this.A07 = recyclerView;
    }
}
