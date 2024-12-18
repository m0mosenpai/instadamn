package X;

/* renamed from: X.7gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169207gt extends AbstractC166097bd {
    public final int A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C169207gt(java.lang.Boolean r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r2 = this;
            r0 = 5
            X.C14360o3.A0B(r5, r0)
            r1 = 95
            int r0 = r4.intValue()
            if (r0 == 0) goto L28
            r0 = 692(0x2b4, float:9.7E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
        L12:
            java.lang.String r0 = X.AnonymousClass001.A0j(r7, r0, r8, r1, r1)
            r2.<init>(r0)
            r2.A06 = r7
            r2.A03 = r4
            r2.A05 = r8
            r2.A00 = r9
            r2.A04 = r5
            r2.A02 = r6
            r2.A01 = r3
            return
        L28:
            java.lang.String r0 = "HEAD_LOADING"
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169207gt.<init>(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169207gt) {
                C169207gt c169207gt = (C169207gt) obj;
                if (!C14360o3.A0K(this.A06, c169207gt.A06) || this.A03 != c169207gt.A03 || !C14360o3.A0K(this.A05, c169207gt.A05) || this.A00 != c169207gt.A00 || this.A04 != c169207gt.A04 || this.A02 != c169207gt.A02 || !C14360o3.A0K(this.A01, c169207gt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        String str2;
        int hashCode2 = this.A06.hashCode() * 31;
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            str = AbstractC111324zv.A00(692);
        } else {
            str = "HEAD_LOADING";
        }
        int hashCode3 = (hashCode2 + str.hashCode() + intValue) * 31;
        String str3 = this.A05;
        int i = 0;
        if (str3 == null) {
            hashCode = 0;
        } else {
            hashCode = str3.hashCode();
        }
        int A00 = (((((hashCode3 + hashCode) * 31) + this.A00) * 31) + AbstractC225899y8.A00(this.A04)) * 31;
        int intValue2 = this.A02.intValue();
        switch (intValue2) {
            case 0:
                str2 = "LOAD_MORE_COMMENTS";
                break;
            case 1:
                str2 = "HIDE_COMMENTS";
                break;
            default:
                str2 = "SHOW_COMMENTS";
                break;
        }
        int hashCode4 = (A00 + str2.hashCode() + intValue2) * 31;
        Boolean bool = this.A01;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }
}
