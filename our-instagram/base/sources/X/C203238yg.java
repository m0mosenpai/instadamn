package X;

/* renamed from: X.8yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203238yg extends C0T6 {
    public long A00;
    public long A01;
    public C196948nP A02;
    public C196948nP A03;
    public C203248yh A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    public C203238yg(C196948nP c196948nP, C196948nP c196948nP2, C203248yh c203248yh, String str, String str2, String str3, String str4, long j, long j2, boolean z) {
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = c196948nP;
        this.A03 = c196948nP2;
        this.A04 = c203248yh;
        this.A06 = str4;
        this.A09 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C203238yg) {
                C203238yg c203238yg = (C203238yg) obj;
                if (!C14360o3.A0K(this.A07, c203238yg.A07) || !C14360o3.A0K(this.A08, c203238yg.A08) || !C14360o3.A0K(this.A05, c203238yg.A05) || this.A00 != c203238yg.A00 || this.A01 != c203238yg.A01 || !C14360o3.A0K(this.A02, c203238yg.A02) || !C14360o3.A0K(this.A03, c203238yg.A03) || !C14360o3.A0K(this.A04, c203238yg.A04) || !C14360o3.A0K(this.A06, c203238yg.A06) || this.A09 != c203238yg.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final C196948nP A00() {
        C196948nP c196948nP;
        C17280tP A00 = C17280tP.A4E.A00();
        C196948nP[] c196948nPArr = new C196948nP[2];
        if (((Boolean) A00.A32.CES(A00, C17280tP.A4G[220])).booleanValue()) {
            c196948nPArr[0] = this.A03;
            c196948nP = this.A02;
        } else {
            c196948nPArr[0] = this.A02;
            c196948nP = this.A03;
        }
        c196948nPArr[1] = c196948nP;
        C14360o3.A0B(c196948nPArr, 0);
        for (C196948nP c196948nP2 : AbstractC009903n.A0I(c196948nPArr)) {
            if (c196948nP2.A03()) {
                return c196948nP2;
            }
        }
        AbstractC12120kG.A06("StoryDraftModel", "Couldn't resolve any mediaInfo", null);
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = ((((hashCode * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode()) * 31;
        long j = this.A00;
        int i2 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A01;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C196948nP c196948nP = this.A02;
        if (c196948nP == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c196948nP.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        C196948nP c196948nP2 = this.A03;
        if (c196948nP2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c196948nP2.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        C203248yh c203248yh = this.A04;
        if (c203248yh == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c203248yh.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        String str2 = this.A06;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i7 = (i6 + i) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C203238yg() {
        /*
            r13 = this;
            r1 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r5 = r0.toString()
            X.C14360o3.A07(r5)
            java.lang.String r6 = ""
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 1
            r0 = r13
            r2 = r1
            r3 = r1
            r4 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203238yg.<init>():void");
    }
}
