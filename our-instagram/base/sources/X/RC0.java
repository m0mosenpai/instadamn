package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class RC0 extends RC7 implements Serializable {
    public final String A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RC0(X.AbstractC910944l r13, X.AbstractC63037SbC r14, X.C45A r15, java.lang.String r16) {
        /*
            r12 = this;
            r6 = r14
            X.45H r0 = r14.A08()
            r3 = 0
            X.RBL r5 = r14.A0F()
            r11 = 0
            if (r0 != 0) goto L1f
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)
        L11:
            r1 = r12
            r2 = r13
            r8 = r15
            r4 = r3
            r7 = r3
            r10 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            r12.A00 = r0
            return
        L1f:
            X.45I r2 = r0.A01
            X.45I r0 = X.C45I.ALWAYS
            if (r2 == r0) goto L33
            X.45I r1 = X.C45I.USE_DEFAULTS
            if (r2 == r1) goto L2a
            r11 = 1
        L2a:
            X.45I r0 = X.C45I.NON_NULL
            if (r2 == r0) goto L33
            if (r2 == r1) goto L33
            java.lang.Object r9 = X.RC7.A0H
            goto L11
        L33:
            r9 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RC0.<init>(X.44l, X.SbC, X.45A, java.lang.String):void");
    }

    @Override // X.RC7
    public final void A04(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Object A0S = abstractC913345m.A0S(this.A00);
        if (A0S == null) {
            if (((RC7) this).A01 != null) {
                anonymousClass182.A0l(this.A04);
                ((RC7) this).A01.A0A(anonymousClass182, abstractC913345m, null);
                return;
            }
            return;
        }
        JsonSerializer A00 = RC7.A00(abstractC913345m, this, A0S);
        Object obj2 = this.A09;
        if (obj2 != null && RC7.A01(A00, abstractC913345m, obj2, A0S)) {
            return;
        }
        if (A0S == obj && A07(anonymousClass182, A00, abstractC913345m)) {
            return;
        }
        anonymousClass182.A0l(this.A04);
        AbstractC58322PtE.A1K(anonymousClass182, A00, abstractC913345m, this.A03, A0S);
    }

    public RC0() {
    }
}
