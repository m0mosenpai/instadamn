package X;

import java.util.List;

/* renamed from: X.Cmt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28761Cmt implements C6Ih, InterfaceC30773DgA {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04 = true;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final C6IO A0C;
    public final Object A0D;
    public final List A0E;
    public final boolean A0F;
    public final int A0G;
    public final int A0H;
    public final long A0I;
    public final Object A0J;

    @Override // X.C6Ih
    public final void EZg(boolean z) {
        this.A05 = true;
    }

    public final int A00() {
        long j;
        boolean z = this.A0F;
        long j2 = this.A03;
        if (!z) {
            j = j2 >> 32;
        } else {
            j = j2 & 4294967295L;
        }
        return (int) j;
    }

    public final void A01(int i, int i2, int i3) {
        long A00;
        this.A00 = i3;
        this.A02 = -this.A0G;
        this.A01 = i3 + this.A06;
        if (this.A0F) {
            A00 = AbstractC113765Bo.A00(i2, i);
        } else {
            A00 = AbstractC113765Bo.A00(i, i2);
        }
        this.A03 = A00;
    }

    @Override // X.C6Ih
    public final Object BbK(int i) {
        return ((C59W) this.A0E.get(i)).BbJ();
    }

    @Override // X.C6Ih
    public final int Bda() {
        return this.A0E.size();
    }

    @Override // X.C6Ih
    public final void E4q(int i, int i2, int i3, int i4) {
        if (this.A0F) {
            i3 = i4;
        }
        A01(i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C28761Cmt(X.C6IO r8, java.lang.Object r9, java.lang.Object r10, java.util.List r11, int r12, int r13, int r14, int r15, int r16, int r17, long r18, boolean r20) {
        /*
            r7 = this;
            r7.<init>()
            r7.A07 = r12
            r7.A0D = r9
            r7.A0E = r11
            r0 = r20
            r7.A0F = r0
            r7.A08 = r14
            r7.A0A = r15
            r0 = r16
            r7.A0G = r0
            r0 = r17
            r7.A06 = r0
            r7.A0J = r10
            r7.A0C = r8
            r0 = r18
            r7.A0I = r0
            r6 = 1
            r7.A04 = r6
            boolean r0 = r11.isEmpty()
            r5 = 0
            if (r0 != 0) goto L5d
            java.lang.Object r1 = r11.get(r5)
            X.59W r1 = (X.C59W) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto L5a
            int r0 = r1.A00
        L37:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r3 = X.AbstractC25226BEj.A05(r11)
            if (r6 > r3) goto L5f
            r2 = 1
        L42:
            java.lang.Object r1 = r11.get(r2)
            X.59W r1 = (X.C59W) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto L57
            int r0 = r1.A00
        L4e:
            java.lang.Integer r4 = X.AbstractC25235BEs.A0j(r4, r0)
            if (r2 == r3) goto L5f
            int r2 = r2 + 1
            goto L42
        L57:
            int r0 = r1.A01
            goto L4e
        L5a:
            int r0 = r1.A01
            goto L37
        L5d:
            r0 = 0
            goto L65
        L5f:
            if (r4 == 0) goto L5d
            int r0 = r4.intValue()
        L65:
            r7.A0H = r0
            int r0 = r0 + r13
            if (r0 >= r5) goto L6b
            r0 = 0
        L6b:
            r7.A09 = r0
            java.util.List r4 = r7.A0E
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Laa
            java.lang.Object r1 = r4.get(r5)
            X.59W r1 = (X.C59W) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto La3
            int r0 = r1.A01
        L81:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = X.AbstractC25226BEj.A05(r4)
            if (r6 > r2) goto La6
        L8b:
            java.lang.Object r1 = r4.get(r6)
            X.59W r1 = (X.C59W) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto La0
            int r0 = r1.A01
        L97:
            java.lang.Integer r3 = X.AbstractC25235BEs.A0j(r3, r0)
            if (r6 == r2) goto La6
            int r6 = r6 + 1
            goto L8b
        La0:
            int r0 = r1.A00
            goto L97
        La3:
            int r0 = r1.A00
            goto L81
        La6:
            int r5 = X.AbstractC25227BEk.A06(r3, r5)
        Laa:
            r0 = -1
            r7.A00 = r0
            boolean r1 = r7.A0F
            int r0 = r7.A0H
            if (r1 == 0) goto Lbe
            long r0 = X.AbstractC119215ad.A00(r5, r0)
        Lb7:
            r7.A0B = r0
            r0 = 0
            r7.A03 = r0
            return
        Lbe:
            long r0 = X.AbstractC119215ad.A00(r0, r5)
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28761Cmt.<init>(X.6IO, java.lang.Object, java.lang.Object, java.util.List, int, int, int, int, int, int, long, boolean):void");
    }

    @Override // X.C6Ih
    public final long AqS() {
        return this.A0I;
    }

    @Override // X.C6Ih
    public final int BL6() {
        return this.A08;
    }

    @Override // X.C6Ih
    public final int BPV() {
        return this.A09;
    }

    @Override // X.C6Ih
    public final int Bz0() {
        return this.A0A;
    }

    @Override // X.C6Ih
    public final boolean Cfe() {
        return this.A0F;
    }

    @Override // X.C6Ih
    public final int getIndex() {
        return this.A07;
    }

    @Override // X.C6Ih
    public final Object getKey() {
        return this.A0D;
    }

    @Override // X.C6Ih
    public final long BYb(int i) {
        return this.A03;
    }
}
