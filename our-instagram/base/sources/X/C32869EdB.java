package X;

import java.util.Arrays;

/* renamed from: X.EdB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32869EdB extends C7AS implements InterfaceC129555tK {
    public final String A00;
    public final String A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32869EdB(com.instagram.common.session.UserSession r26, X.AnonymousClass988 r27, X.C7IH r28, X.C2EY r29, com.instagram.model.direct.messageid.MessageIdentifier r30, java.lang.Long r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.util.List r38, java.util.List r39, java.util.Map r40, int r41, boolean r42) {
        /*
            r25 = this;
            r2 = 0
            r17 = r39
            boolean r20 = X.AbstractC167007dF.A1U(r17)
            r0 = 11
            r14 = r36
            X.C14360o3.A0B(r14, r0)
            r15 = r37
            r12 = r35
            r21 = r42
            r8 = r29
            r19 = r41
            r7 = r28
            r18 = r40
            r5 = r27
            r3 = r26
            r16 = r38
            r1 = r25
            r9 = r30
            r10 = r31
            r11 = r32
            r4 = r2
            r6 = r2
            r13 = r2
            r22 = r20
            r23 = r20
            r24 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r33
            r1.A00 = r0
            r0 = r34
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32869EdB.<init>(com.instagram.common.session.UserSession, X.988, X.7IH, X.2EY, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.Map, int, boolean):void");
    }

    @Override // X.C7AS
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C32869EdB) && super.equals(obj)) {
                C32869EdB c32869EdB = (C32869EdB) obj;
                if (!C14360o3.A0K(this.A00, c32869EdB.A00) || !C14360o3.A0K(this.A01, c32869EdB.A01)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A07, this.A0C, this.A00, this.A01, this.A0G, this.A0D, Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0K), this.A06});
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
