package X;

import java.util.List;

/* renamed from: X.6Ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137036Ig implements C6Ih, InterfaceC137046Ii {
    public int A00 = Integer.MIN_VALUE;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C6IO A0A;
    public final Object A0B;
    public final List A0C;
    public final boolean A0D;
    public final int[] A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final InterfaceC118245Wl A0J;
    public final InterfaceC118225Wj A0K;
    public final AnonymousClass583 A0L;
    public final Object A0M;
    public final boolean A0N;

    @Override // X.C6Ih
    public final void EZg(boolean z) {
        this.A03 = true;
    }

    public final void A00(int i, int i2, int i3) {
        int i4;
        this.A02 = i;
        boolean z = this.A0D;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A00 = i5;
        List list = this.A0C;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            C59W c59w = (C59W) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0E;
            if (z) {
                InterfaceC118245Wl interfaceC118245Wl = this.A0J;
                if (interfaceC118245Wl != null) {
                    iArr[i7] = interfaceC118245Wl.AB8(this.A0L, c59w.A01, i2);
                    iArr[i7 + 1] = i;
                    i4 = c59w.A00;
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                InterfaceC118225Wj interfaceC118225Wj = this.A0K;
                if (interfaceC118225Wj != null) {
                    iArr[i8] = interfaceC118225Wj.AB4(c59w.A00, i3);
                    i4 = c59w.A01;
                } else {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
            }
            i += i4;
        }
        this.A04 = -this.A0F;
        this.A01 = this.A00 + this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (((int) r0) > r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r8.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        if (((int) r0) >= r9) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C5AW r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137036Ig.A01(X.5AW, boolean):void");
    }

    @Override // X.C6Ih
    public final long AqS() {
        return this.A0H;
    }

    @Override // X.C6Ih
    public final int BL6() {
        return 0;
    }

    @Override // X.C6Ih
    public final int BPV() {
        return this.A08;
    }

    @Override // X.C6Ih
    public final long BYb(int i) {
        int[] iArr = this.A0E;
        int i2 = i * 2;
        return AbstractC113765Bo.A00(iArr[i2], iArr[i2 + 1]);
    }

    @Override // X.C6Ih
    public final Object BbK(int i) {
        return ((C59W) this.A0C.get(i)).BbJ();
    }

    @Override // X.C6Ih
    public final int Bda() {
        return this.A0C.size();
    }

    @Override // X.C6Ih
    public final int Bz0() {
        return 1;
    }

    @Override // X.C6Ih
    public final boolean Cfe() {
        return this.A0D;
    }

    @Override // X.C6Ih
    public final int getIndex() {
        return this.A07;
    }

    @Override // X.C6Ih
    public final Object getKey() {
        return this.A0B;
    }

    public C137036Ig(C6IO c6io, InterfaceC118245Wl interfaceC118245Wl, InterfaceC118225Wj interfaceC118225Wj, AnonymousClass583 anonymousClass583, Object obj, Object obj2, List list, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        int i5;
        int i6;
        this.A07 = i;
        this.A0C = list;
        this.A0D = z;
        this.A0J = interfaceC118245Wl;
        this.A0K = interfaceC118225Wj;
        this.A0L = anonymousClass583;
        this.A0N = z2;
        this.A0F = i2;
        this.A05 = i3;
        this.A0G = i4;
        this.A0I = j;
        this.A0B = obj;
        this.A0M = obj2;
        this.A0A = c6io;
        this.A0H = j2;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C59W c59w = (C59W) list.get(i9);
            boolean z3 = this.A0D;
            if (z3) {
                i5 = c59w.A00;
            } else {
                i5 = c59w.A01;
            }
            i7 += i5;
            if (!z3) {
                i6 = c59w.A00;
            } else {
                i6 = c59w.A01;
            }
            i8 = Math.max(i8, i6);
        }
        this.A09 = i7;
        int i10 = i7 + this.A0G;
        this.A08 = i10 < 0 ? 0 : i10;
        this.A06 = i8;
        this.A0E = new int[this.A0C.size() * 2];
    }

    @Override // X.C6Ih
    public final void E4q(int i, int i2, int i3, int i4) {
        A00(i, i3, i4);
    }
}
