package X;

import java.util.List;

/* renamed from: X.6Li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137626Li {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public CUK A06;
    public C5C8 A07;
    public C126995od A08;
    public C127055oj A09;
    public C118125Vw A0A;
    public C5DD A0B;
    public InterfaceC1128957x A0C;
    public List A0D;
    public boolean A0E;
    public AnonymousClass583 A0F;

    public static final C126995od A01(C137626Li c137626Li, AnonymousClass583 anonymousClass583) {
        C126995od c126995od = c137626Li.A08;
        if (c126995od == null || anonymousClass583 != c137626Li.A0F || c126995od.BCg()) {
            c137626Li.A0F = anonymousClass583;
            C5C8 c5c8 = c137626Li.A07;
            C118125Vw A00 = AbstractC122525gn.A00(c137626Li.A0A, anonymousClass583);
            InterfaceC1128957x interfaceC1128957x = c137626Li.A0C;
            C14360o3.A0A(interfaceC1128957x);
            C5DD c5dd = c137626Li.A0B;
            List list = c137626Li.A0D;
            if (list == null) {
                list = C16930sl.A00;
            }
            c126995od = new C126995od(c5c8, A00, c5dd, interfaceC1128957x, list);
        }
        c137626Li.A08 = c126995od;
        return c126995od;
    }

    public final int A02(AnonymousClass583 anonymousClass583, int i) {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int A00 = AbstractC122805hG.A00(A00(this, anonymousClass583, C5AU.A04(0, i, 0, Integer.MAX_VALUE)).A00);
        this.A01 = i;
        this.A00 = A00;
        return A00;
    }

    public final void A03(InterfaceC1128957x interfaceC1128957x) {
        long j;
        InterfaceC1128957x interfaceC1128957x2 = this.A0C;
        if (interfaceC1128957x != null) {
            long j2 = AbstractC122515gm.A00;
            float Awk = interfaceC1128957x.Awk();
            float B7e = interfaceC1128957x.B7e();
            j = (Float.floatToRawIntBits(B7e) & 4294967295L) | (Float.floatToRawIntBits(Awk) << 32);
        } else {
            j = AbstractC122515gm.A00;
        }
        if (interfaceC1128957x2 == null) {
            this.A0C = interfaceC1128957x;
            this.A05 = j;
        } else {
            if (interfaceC1128957x != null && this.A05 == j) {
                return;
            }
            this.A0C = interfaceC1128957x;
            this.A05 = j;
            this.A08 = null;
            this.A09 = null;
            this.A00 = -1;
            this.A01 = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r2 == 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C127035oh A00(X.C137626Li r4, X.AnonymousClass583 r5, long r6) {
        /*
            X.5od r3 = A01(r4, r5)
            boolean r2 = r4.A0E
            int r1 = r4.A04
            float r0 = r3.BPq()
            long r5 = X.AbstractC122795hF.A00(r0, r1, r6, r2)
            boolean r0 = r4.A0E
            int r2 = r4.A04
            int r1 = r4.A02
            r4 = 1
            if (r0 != 0) goto L23
            r0 = 2
            if (r2 != r0) goto L23
        L1c:
            r7 = 1
        L1d:
            X.5oh r2 = new X.5oh
            r2.<init>(r3, r4, r5, r7)
            return r2
        L23:
            if (r1 >= r4) goto L26
            r1 = 1
        L26:
            r4 = r1
            r0 = 2
            r7 = 0
            if (r2 != r0) goto L1d
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137626Li.A00(X.6Li, X.583, long):X.5oh");
    }
}
