package X;

import com.google.common.collect.Multisets$ImmutableEntry;

/* renamed from: X.SPq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62759SPq {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (X.AbstractC50102Ry.A00(r5.A01, r2.A06[r4]) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.RS0
            if (r0 == 0) goto L16
            r1 = r6
            X.RS0 r1 = (X.RS0) r1
            X.SjH r2 = r1.A00
            int r0 = r2.A01
            if (r0 != 0) goto L15
            com.google.common.collect.TreeMultiset r1 = r1.A01
            java.lang.Object r0 = r2.A08
            int r0 = r1.AL0(r0)
        L15:
            return r0
        L16:
            boolean r0 = r6 instanceof X.RS1
            if (r0 == 0) goto L49
            r5 = r6
            X.RS1 r5 = (X.RS1) r5
            int r4 = r5.A00
            r3 = -1
            if (r4 == r3) goto L34
            X.Sb7 r2 = r5.A02
            int r0 = r2.A02
            if (r4 >= r0) goto L34
            java.lang.Object r1 = r5.A01
            java.lang.Object[] r0 = r2.A06
            r0 = r0[r4]
            boolean r0 = X.AbstractC50102Ry.A00(r1, r0)
            if (r0 != 0) goto L3e
        L34:
            X.Sb7 r2 = r5.A02
            java.lang.Object r0 = r5.A01
            int r0 = r2.A05(r0)
            r5.A00 = r0
        L3e:
            int r1 = r5.A00
            if (r1 != r3) goto L44
            r0 = 0
            return r0
        L44:
            int[] r0 = r2.A05
            r0 = r0[r1]
            return r0
        L49:
            r0 = r6
            com.google.common.collect.Multisets$ImmutableEntry r0 = (com.google.common.collect.Multisets$ImmutableEntry) r0
            int r0 = r0.count
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62759SPq.A00():int");
    }

    public final Object A01() {
        if (this instanceof RS0) {
            return ((RS0) this).A00.A08;
        }
        if (this instanceof RS1) {
            return ((RS1) this).A01;
        }
        return ((Multisets$ImmutableEntry) this).element;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof AbstractC62759SPq)) {
            return false;
        }
        AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) object;
        if (A00() != abstractC62759SPq.A00() || !AbstractC50102Ry.A00(A01(), abstractC62759SPq.A01())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(A01()) ^ A00();
    }

    public final String toString() {
        String valueOf = String.valueOf(A01());
        int A00 = A00();
        if (A00 != 1) {
            return AnonymousClass001.A0b(valueOf, " x ", A00);
        }
        return valueOf;
    }
}
