package X;

import java.util.BitSet;

/* loaded from: classes10.dex */
public final class SQ0 {
    public int A00;
    public int A01;
    public AbstractC62497SDz A02;
    public Object A03;
    public final C16L A04;
    public final AnonymousClass469 A05;
    public final C64520THn A06;
    public final BitSet A07;
    public final Object[] A08;

    public final void A01(TI5 ti5, Object obj, String str) {
        this.A02 = new C60584R9u(ti5, this.A02, obj, str);
    }

    public final void A02(RBV rbv, Object obj) {
        this.A02 = new C60583R9t(rbv, this.A02, obj);
    }

    public final boolean A04(String str) {
        C64520THn c64520THn = this.A06;
        if (c64520THn != null && str.equals(c64520THn.A04.A02)) {
            this.A03 = c64520THn.A03.A0D(this.A04, this.A05);
            return true;
        }
        return false;
    }

    public SQ0(C16L c16l, AnonymousClass469 anonymousClass469, C64520THn c64520THn, int i) {
        BitSet bitSet;
        this.A04 = c16l;
        this.A05 = anonymousClass469;
        this.A00 = i;
        this.A06 = c64520THn;
        this.A08 = new Object[i];
        if (i < 32) {
            bitSet = null;
        } else {
            bitSet = new BitSet();
        }
        this.A07 = bitSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.RBV r4) {
        /*
            r3 = this;
            java.lang.Object r1 = r4.A0B()
            if (r1 == 0) goto L10
            X.469 r0 = r3.A05
            r0.A0g(r1)
        Lb:
            X.00O r2 = X.C00O.createAndThrow()
        Lf:
            throw r2
        L10:
            X.TIH r0 = r4.A00
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L1d
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            X.469 r2 = r3.A05
            if (r0 == 0) goto L34
            X.45y r0 = r4.A06
            java.lang.String r1 = r0.A02
            int r0 = r4.A02()
            java.lang.Object[] r1 = X.AbstractC25228BEl.A1Z(r1, r0)
            java.lang.String r0 = "Missing required creator property '%s' (index %d)"
        L30:
            r2.A0W(r4, r0, r1)
            goto Lb
        L34:
            X.45i r0 = X.EnumC912945i.A0A
            boolean r0 = r2.A0j(r0)
            if (r0 == 0) goto L4b
            X.45y r0 = r4.A06
            java.lang.String r1 = r0.A02
            int r0 = r4.A02()
            java.lang.Object[] r1 = X.AbstractC25228BEl.A1Z(r1, r0)
            java.lang.String r0 = "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled"
            goto L30
        L4b:
            X.4jN r0 = r4.A07     // Catch: X.AbstractC102324j7 -> L5c
            java.lang.Object r0 = r0.AXq(r2)     // Catch: X.AbstractC102324j7 -> L5c
            if (r0 != 0) goto L6f
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r4.A03()     // Catch: X.AbstractC102324j7 -> L5c
            java.lang.Object r0 = r0.AXq(r2)     // Catch: X.AbstractC102324j7 -> L5c
            return r0
        L5c:
            r2 = move-exception
            X.RBL r0 = r4.BSA()
            if (r0 == 0) goto Lf
            java.lang.Class r1 = r0.A09()
            X.45y r0 = r4.A06
            java.lang.String r0 = r0.A02
            r2.A08(r1, r0)
            throw r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQ0.A00(X.RBV):java.lang.Object");
    }

    public final boolean A03(RBV rbv, Object obj) {
        int A02 = rbv.A02();
        this.A08[A02] = obj;
        BitSet bitSet = this.A07;
        if (bitSet == null) {
            int i = this.A01;
            int i2 = (1 << A02) | i;
            if (i == i2) {
                return false;
            }
            this.A01 = i2;
            int i3 = this.A00 - 1;
            this.A00 = i3;
            if (i3 > 0) {
                return false;
            }
            if (this.A06 != null && this.A03 == null) {
                return false;
            }
            return true;
        }
        if (bitSet.get(A02)) {
            return false;
        }
        bitSet.set(A02);
        this.A00--;
        return false;
    }
}
