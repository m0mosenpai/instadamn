package X;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.Metadata;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Y8r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73336Y8r implements YRD {
    public YNE A00;
    public YM5 A01;
    public C73311Y1r A02;
    public final SparseArray A03;
    public final C62960SZd A04;
    public final YQ7 A05;
    public final C73305Xzw A06;
    public final C72843Xop A07;

    @Override // X.YQ5
    public final void DrK(int i, int i2) {
        C72855XpB A01 = A01(this, null);
        A02(new Y8d(A01, 22), A01, 24);
    }

    @Override // X.YQ5
    public final void Dzv(Y1N y1n) {
        C72855XpB A01 = A01(this, null);
        A02(new C73322Y8b(11, y1n, A01), A01, 25);
    }

    public static C72855XpB A00(C73336Y8r c73336Y8r) {
        return A01(c73336Y8r, c73336Y8r.A06.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C72855XpB A01(X.C73336Y8r r15, X.C72851Xp7 r16) {
        /*
            X.YNE r0 = r15.A00
            r0.getClass()
            r1 = r16
            if (r16 == 0) goto L21
            X.Xzw r0 = r15.A06
            com.google.common.collect.ImmutableMap r0 = r0.A02
            java.lang.Object r2 = r0.get(r1)
            androidx.media3.common.Timeline r2 = (androidx.media3.common.Timeline) r2
            if (r2 == 0) goto L21
            java.lang.Object r1 = r1.A04
            X.Xop r0 = r15.A07
        L19:
            r2.A09(r0, r1)
        L1c:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L21:
            X.YNE r0 = r15.A00
            int r7 = r0.Aub()
            X.YNE r0 = r15.A00
            X.Y8T r0 = (X.Y8T) r0
            androidx.media3.common.Timeline r4 = X.AbstractC72048XLo.A04(r0)
            int r0 = r4.A02()
            if (r7 < r0) goto L37
            androidx.media3.common.Timeline r4 = androidx.media3.common.Timeline.A00
        L37:
            int r0 = r4.A02()
            boolean r1 = X.AbstractC167007dF.A1N(r0)
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.YNE r0 = r15.A00
            X.Y8T r0 = (X.Y8T) r0
            androidx.media3.common.Timeline r0 = X.AbstractC72048XLo.A04(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb6
            X.YNE r0 = r15.A00
            int r0 = r0.Aub()
            if (r7 != r0) goto Lb6
            X.YNE r3 = r15.A00
            X.Y8T r3 = (X.Y8T) r3
            X.Y8T.A02(r3)
            X.Y4C r1 = r3.A0A
            androidx.media3.common.Timeline r2 = r1.A06
            int r0 = r2.A02()
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            if (r0 == 0) goto Lc1
            r0 = 0
            long r11 = androidx.media3.common.util.Util.A04(r0)
        L74:
            X.Xzw r0 = r15.A06
            X.Xp7 r6 = r0.A00
            X.YNE r0 = r15.A00
            X.Y8T r0 = (X.Y8T) r0
            androidx.media3.common.Timeline r5 = X.AbstractC72048XLo.A04(r0)
            X.YNE r0 = r15.A00
            int r8 = r0.Aub()
            X.YNE r3 = r15.A00
            X.Y8T r3 = (X.Y8T) r3
            X.Y8T.A02(r3)
            X.Y4C r1 = r3.A0A
            androidx.media3.common.Timeline r2 = r1.A06
            int r0 = r2.A02()
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            if (r0 == 0) goto Lc1
            r0 = 0
            long r13 = androidx.media3.common.util.Util.A04(r0)
            X.YNE r0 = r15.A00
            X.Y8T r0 = (X.Y8T) r0
            X.Y8T.A02(r0)
            X.Y4C r0 = r0.A0A
            long r0 = r0.A0J
            long r15 = androidx.media3.common.util.Util.A04(r0)
            X.XpB r3 = new X.XpB
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r15)
            return r3
        Lb6:
            r11 = 0
            if (r1 != 0) goto L74
            X.SZd r0 = r15.A04
            r4.A0A(r0, r7)
            goto L1c
        Lc1:
            boolean r0 = r1.A0F
            if (r0 == 0) goto Lc8
            r1.A01()
        Lc8:
            X.Xp7 r0 = r1.A09
            java.lang.Object r1 = r0.A04
            X.Xop r0 = r3.A0Q
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73336Y8r.A01(X.Y8r, X.Xp7):X.XpB");
    }

    public final void A02(YNF ynf, C72855XpB c72855XpB, int i) {
        this.A03.put(i, c72855XpB);
        C73311Y1r c73311Y1r = this.A02;
        c73311Y1r.A02(ynf, i);
        c73311Y1r.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r7 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.YQ5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DtI(androidx.media3.common.Timeline r10, int r11) {
        /*
            r9 = this;
            X.Xzw r5 = r9.A06
            X.YNE r2 = r9.A00
            r2.getClass()
            com.google.common.collect.ImmutableList r8 = r5.A01
            r1 = 0
            X.Xp7 r0 = X.C73305Xzw.A00(r2, r8)
            r5.A00 = r0
            X.Y8T r2 = (X.Y8T) r2
            androidx.media3.common.Timeline r7 = X.AbstractC72048XLo.A04(r2)
            com.google.common.collect.ImmutableMap$Builder r6 = new com.google.common.collect.ImmutableMap$Builder
            r6.<init>()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L61
            X.Xp7 r0 = r5.A00
            boolean r0 = X.AbstractC50102Ry.A00(r0, r1)
            if (r0 != 0) goto L49
            X.Xp7 r0 = r5.A00
            boolean r0 = X.AbstractC50102Ry.A00(r0, r1)
        L2f:
            if (r0 != 0) goto L49
            X.Xp7 r2 = r5.A00
            if (r2 == 0) goto L49
            java.lang.Object r0 = r2.A04
            int r1 = r7.A05(r0)
            r0 = -1
            if (r1 != r0) goto L46
            com.google.common.collect.ImmutableMap r0 = r5.A02
            java.lang.Object r7 = r0.get(r2)
            if (r7 == 0) goto L49
        L46:
            r6.put(r2, r7)
        L49:
            com.google.common.collect.ImmutableMap r0 = r6.buildOrThrow()
            r5.A02 = r0
            X.Xp7 r0 = r5.A00
            X.XpB r2 = A01(r9, r0)
            r0 = 18
            X.Y8d r1 = new X.Y8d
            r1.<init>(r2, r0)
            r0 = 0
            r9.A02(r1, r2, r0)
            return
        L61:
            r4 = 0
        L62:
            int r0 = r8.size()
            if (r4 >= r0) goto L88
            java.lang.Object r3 = r8.get(r4)
            X.Xp7 r3 = (X.C72851Xp7) r3
            r2 = r7
            if (r3 == 0) goto L85
            java.lang.Object r0 = r3.A04
            int r1 = r7.A05(r0)
            r0 = -1
            if (r1 != r0) goto L82
            com.google.common.collect.ImmutableMap r0 = r5.A02
            java.lang.Object r2 = r0.get(r3)
            if (r2 == 0) goto L85
        L82:
            r6.put(r3, r2)
        L85:
            int r4 = r4 + 1
            goto L62
        L88:
            X.Xp7 r0 = r5.A00
            boolean r0 = r8.contains(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73336Y8r.DtI(androidx.media3.common.Timeline, int):void");
    }

    public C73336Y8r(YQ7 yq7) {
        yq7.getClass();
        this.A05 = yq7;
        Looper myLooper = Looper.myLooper();
        this.A02 = new C73311Y1r(myLooper == null ? Looper.getMainLooper() : myLooper, yq7, new YNG() { // from class: X.Y8e
            @Override // X.YNG
            public final void CP7(C72861XpN c72861XpN, Object obj) {
            }
        }, new CopyOnWriteArraySet(), true);
        C72843Xop c72843Xop = new C72843Xop();
        this.A07 = c72843Xop;
        this.A04 = new C62960SZd();
        this.A06 = new C73305Xzw(c72843Xop);
        this.A03 = new SparseArray();
    }

    @Override // X.YQ5
    public final void CyW(Y1L y1l) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(1, y1l, A00), A00, 13);
    }

    @Override // X.YQ5
    public final void D8q(C73290Xzd c73290Xzd) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(6, c73290Xzd, A00), A00, 27);
    }

    @Override // X.YQ5
    public final void DNB(boolean z) {
        C72855XpB A00 = A00(this);
        A02(new Y8d(A00, 24), A00, 3);
    }

    @Override // X.YQ5
    public final void DND(boolean z) {
        C72855XpB A00 = A00(this);
        A02(new Y8d(A00, 20), A00, 7);
    }

    @Override // X.YQ5
    public final void DRx(C62972SZr c62972SZr, int i) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(7, c62972SZr, A00), A00, 1);
    }

    @Override // X.YQ5
    public final void DS4(Y1V y1v) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(9, y1v, A00), A00, 14);
    }

    @Override // X.YQ5
    public final void DTY(Metadata metadata) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(5, metadata, A00), A00, 28);
    }

    @Override // X.YQ5
    public final void DYz(boolean z, int i) {
        C72855XpB A00 = A00(this);
        A02(new Y8d(A00, 19), A00, 5);
    }

    @Override // X.YQ5
    public final void DZ3(Y1o y1o) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(0, y1o, A00), A00, 12);
    }

    @Override // X.YQ5
    public final void DZB(int i) {
        C72855XpB A00 = A00(this);
        A02(new Y8d(A00, 21), A00, 4);
    }

    @Override // X.YQ5
    public final void DZD(int i) {
        C72855XpB A00 = A00(this);
        A02(new Y8d(A00, 23), A00, 6);
    }

    @Override // X.YQ5
    public final void DZF(AbstractC72452Xdw abstractC72452Xdw) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(4, abstractC72452Xdw, A00), A00, 10);
    }

    @Override // X.YQ5
    public final void DZI(AbstractC72452Xdw abstractC72452Xdw) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(8, abstractC72452Xdw, A00), A00, 10);
    }

    @Override // X.YQ5
    public final void DZJ(boolean z, int i) {
        C72855XpB A00 = A00(this);
        A02(new Y8d(A00, 17), A00, -1);
    }

    @Override // X.YQ5
    public final void Dur(Y1M y1m) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(2, y1m, A00), A00, 2);
    }

    @Override // X.YQ5
    public final void onCues(List list) {
        C72855XpB A00 = A00(this);
        A02(new C73322Y8b(3, list, A00), A00, 27);
    }
}
