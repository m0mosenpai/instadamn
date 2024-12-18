package X;

/* renamed from: X.GzH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38676GzH extends C0T6 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C38676GzH(Object obj, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = obj;
        this.A02 = str3;
        this.A05 = z;
        this.A06 = z2;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A00 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C38676GzH) {
                C38676GzH c38676GzH = (C38676GzH) obj;
                if (c38676GzH.A00 != 1 || !C14360o3.A0K(this.A04, c38676GzH.A04) || !C14360o3.A0K(this.A03, c38676GzH.A03) || !C14360o3.A0K(this.A01, c38676GzH.A01) || !C14360o3.A0K(this.A02, c38676GzH.A02) || this.A05 != c38676GzH.A05 || this.A06 != c38676GzH.A06) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (1 - this.A00 != 0) {
            return super.hashCode();
        }
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A05, ((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31));
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IntentBasedInsertionResult(isIntentBasedPushupMet=");
        A1C.append(this.A05);
        A1C.append(", isTimeBasedInsertionConfigChangeMet=");
        A1C.append(this.A06);
        A1C.append(", timeBasedInsertionGapInSeconds=");
        A1C.append(this.A01);
        A1C.append(", pushUpMinGap=");
        A1C.append(this.A02);
        A1C.append(", pushUpReason=");
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(1450));
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38676GzH(java.lang.Double r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, boolean r16, boolean r17) {
        /*
            r10 = this;
            r4 = r14
            r5 = r13
            r6 = r12
            r3 = r11
            r8 = r16
            r7 = 0
            r2 = r10
            r10.A00 = r7
            r0 = r15 & 1
            r9 = 0
            if (r0 == 0) goto L10
            r8 = 0
        L10:
            r0 = r15 & 2
            if (r0 != 0) goto L16
            r9 = r17
        L16:
            r0 = r15 & 4
            r1 = 0
            if (r0 == 0) goto L1c
            r3 = r1
        L1c:
            r0 = r15 & 8
            if (r0 == 0) goto L21
            r6 = r1
        L21:
            r0 = r15 & 16
            if (r0 == 0) goto L26
            r5 = r1
        L26:
            r0 = r15 & 32
            if (r0 == 0) goto L2b
            r4 = r1
        L2b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38676GzH.<init>(java.lang.Double, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }
}
