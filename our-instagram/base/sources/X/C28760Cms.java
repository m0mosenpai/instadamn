package X;

import java.util.List;

/* renamed from: X.Cms, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28760Cms implements C6Ih, InterfaceC58206PrC {
    public int A00;
    public int A01 = Integer.MIN_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final long A0C;
    public final C6IO A0D;
    public final Object A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final long A0M;
    public final AnonymousClass583 A0N;
    public final Object A0O;

    @Override // X.C6Ih
    public final void E4q(int i, int i2, int i3, int i4) {
        A00(i, i2, i3, i4, -1, -1);
    }

    @Override // X.C6Ih
    public final void EZg(boolean z) {
        this.A06 = true;
    }

    public final void A00(int i, int i2, int i3, int i4, int i5, int i6) {
        long A00;
        boolean z = this.A0G;
        if (!z) {
            i4 = i3;
        }
        this.A01 = i4;
        if (z) {
            if (this.A0N == AnonymousClass583.Rtl) {
                i2 = (i3 - i2) - this.A0J;
            }
            A00 = AbstractC113765Bo.A00(i2, i);
        } else {
            A00 = AbstractC113765Bo.A00(i, i2);
        }
        this.A05 = A00;
        this.A04 = i5;
        this.A00 = i6;
        this.A03 = -this.A0I;
        this.A02 = i4 + this.A07;
    }

    @Override // X.C6Ih
    public final Object BbK(int i) {
        return ((C59W) this.A0F.get(i)).BbJ();
    }

    @Override // X.C6Ih
    public final int Bda() {
        return this.A0F.size();
    }

    public C28760Cms(C6IO c6io, AnonymousClass583 anonymousClass583, Object obj, Object obj2, List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, boolean z, boolean z2) {
        long A00;
        int i8;
        this.A08 = i;
        this.A0E = obj;
        this.A0G = z;
        this.A0J = i2;
        this.A0H = z2;
        this.A0N = anonymousClass583;
        this.A0I = i4;
        this.A07 = i5;
        this.A0F = list;
        this.A0C = j;
        this.A0O = obj2;
        this.A0D = c6io;
        this.A0M = j2;
        this.A0K = i6;
        this.A0L = i7;
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C59W c59w = (C59W) list.get(i10);
            if (this.A0G) {
                i8 = c59w.A00;
            } else {
                i8 = c59w.A01;
            }
            i9 = Math.max(i9, i8);
        }
        this.A09 = i9;
        int i11 = i9 + i3;
        this.A0A = AbstractC25230BEn.A06(i11, i11);
        boolean z3 = this.A0G;
        int i12 = this.A0J;
        if (z3) {
            A00 = AbstractC119215ad.A00(i12, i9);
        } else {
            A00 = AbstractC119215ad.A00(i9, i12);
        }
        this.A0B = A00;
        this.A05 = 0L;
        this.A04 = -1;
        this.A00 = -1;
    }

    @Override // X.C6Ih
    public final long AqS() {
        return this.A0M;
    }

    @Override // X.C6Ih
    public final int BL6() {
        return this.A0K;
    }

    @Override // X.C6Ih
    public final int BPV() {
        return this.A0A;
    }

    @Override // X.C6Ih
    public final int Bz0() {
        return this.A0L;
    }

    @Override // X.C6Ih
    public final boolean Cfe() {
        return this.A0G;
    }

    @Override // X.C6Ih
    public final int getIndex() {
        return this.A08;
    }

    @Override // X.C6Ih
    public final Object getKey() {
        return this.A0E;
    }

    @Override // X.C6Ih
    public final long BYb(int i) {
        return this.A05;
    }
}
