package X;

/* loaded from: classes9.dex */
public final class OJ0 {
    public Integer A00;
    public final EnumC53240Ngd A01;
    public final C54979OTl A02;
    public final String A03;

    public OJ0(EnumC53240Ngd enumC53240Ngd, Integer num, String str, String str2) {
        AbstractC167007dF.A1D(str, 1, enumC53240Ngd);
        this.A01 = enumC53240Ngd;
        this.A03 = str2;
        this.A00 = num;
        this.A02 = new C54979OTl(null, null, 1);
    }

    public final long A00() {
        C54979OTl c54979OTl = this.A02;
        long j = c54979OTl.A00;
        long j2 = c54979OTl.A01;
        boolean z = false;
        if (1 <= j2 && j2 < j) {
            z = true;
        }
        if (!z) {
            return 0L;
        }
        long j3 = j - j2;
        c54979OTl.A01 = 0L;
        return j3;
    }
}
