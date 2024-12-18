package X;

/* renamed from: X.AYh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23383AYh implements C3RU {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23383AYh() {
        /*
            r6 = this;
            r2 = 0
            r4 = 0
            r1 = 127(0x7f, float:1.78E-43)
            r0 = r6
            r3 = r2
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23383AYh.<init>():void");
    }

    public /* synthetic */ C23383AYh(int i, String str, String str2, long j) {
        String str3;
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str3 = "DEFAULT_USE_CASE_ID";
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = "1.0";
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str5 = "Default Purpose";
        } else {
            str5 = null;
        }
        str = (i & 8) != 0 ? "Default Model Name" : str;
        j = (i & 16) != 0 ? 1L : j;
        str2 = (i & 32) != 0 ? "Default Model Asset" : str2;
        Integer num = (i & 64) != 0 ? C05F.A00 : null;
        AbstractC167027dH.A0a(1, str3, str4, str5, str);
        AbstractC167017dG.A1U(str2, num);
        this.A04 = str3;
        this.A06 = str4;
        this.A05 = str5;
        this.A03 = str;
        this.A00 = j;
        this.A02 = str2;
        this.A01 = num;
    }

    @Override // X.C3RU
    public final int Bjk() {
        return 873412642;
    }

    @Override // X.C3RU
    public final String BUO() {
        return this.A02;
    }

    @Override // X.C3RU
    public final String BUR() {
        return this.A03;
    }

    @Override // X.C3RU
    public final long BUS() {
        return this.A00;
    }

    @Override // X.C3RU
    public final Integer BfO() {
        return this.A01;
    }

    @Override // X.C3RU
    public final long BtZ() {
        return 4320L;
    }

    @Override // X.C3RU
    public final boolean Bvt() {
        return false;
    }

    @Override // X.C3RU
    public final String CDV() {
        return this.A04;
    }

    @Override // X.C3RU
    public final String CDX() {
        return this.A05;
    }

    @Override // X.C3RU
    public final String CDY() {
        return this.A06;
    }

    @Override // X.C3RU
    public final boolean CDg() {
        return false;
    }

    @Override // X.C3RU
    public final boolean CUb() {
        return false;
    }

    @Override // X.C3RU
    public final boolean Car() {
        return true;
    }

    @Override // X.C3RU
    public final boolean CbO() {
        return AbstractC167007dF.A1X(this.A01, C05F.A00);
    }

    @Override // X.C3RU
    public final boolean Ceh() {
        return false;
    }

    @Override // X.C3RU
    public final String CDW() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A03);
        A1C.append('_');
        A1C.append(this.A00);
        A1C.append('_');
        return AbstractC166997dE.A0x(this.A02, A1C);
    }
}
