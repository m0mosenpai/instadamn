package X;

import java.util.List;

/* renamed from: X.U5r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66247U5r extends AbstractC66542zW {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C66247U5r(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        List list;
        if (this.A00 != 0) {
            list = (List) this.A02;
        } else {
            list = ((AbstractC65828Tul) this.A01).A03;
        }
        return list.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        Object obj;
        if (this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A02;
        }
        return ((List) obj).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f A[ORIG_RETURN, RETURN] */
    @Override // X.AbstractC66542zW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(int r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L21;
                case 1: goto L5b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = X.AbstractC001800i.A0O(r0, r7)
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r8)
            if (r1 == 0) goto L59
            if (r0 == 0) goto L59
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L59
        L1f:
            r5 = 1
        L20:
            return r5
        L21:
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r0.get(r7)
            X.U48 r3 = (X.U48) r3
            java.lang.Object r0 = r6.A01
            X.Tul r0 = (X.AbstractC65828Tul) r0
            java.util.List r0 = r0.A03
            java.lang.Object r2 = r0.get(r8)
            X.U48 r2 = (X.U48) r2
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.4kg r0 = X.AbstractC103044kf.A00()
            r5 = 0
            if (r0 != 0) goto L20
            X.4kP r1 = r3.A01
            X.4kP r0 = r2.A01
            boolean r0 = X.C02O.A00(r1, r0)
            if (r0 == 0) goto L20
            X.6Fu r0 = r3.A00
            long r3 = r0.A00
            X.6Fu r0 = r2.A00
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            goto L1f
        L59:
            r5 = 0
            return r5
        L5b:
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r0.get(r7)
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r8)
            boolean r5 = X.C14360o3.A0K(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66247U5r.A04(int, int):boolean");
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        switch (this.A00) {
            case 0:
                if (((U48) ((List) this.A02).get(i)).A01.A04 == ((U48) ((AbstractC65828Tul) this.A01).A03.get(i2)).A01.A04) {
                    return true;
                }
                return false;
            case 1:
                return C14360o3.A0K(((List) this.A01).get(i), ((List) this.A02).get(i2));
            default:
                Object A0O = AbstractC001800i.A0O((List) this.A01, i);
                Object A0O2 = AbstractC001800i.A0O((List) this.A02, i2);
                if (A0O != null && A0O2 != null && A0O.equals(A0O2)) {
                    return true;
                }
                return false;
        }
    }
}
