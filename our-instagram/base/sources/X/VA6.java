package X;

/* loaded from: classes11.dex */
public final class VA6 extends Tx3 {
    public final C68089V9y A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final int A06;

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }

    public final Tx0 A04() {
        C65954Twz c65954Twz = new C65954Twz();
        c65954Twz.A09 = "server";
        c65954Twz.A05 = "server_results";
        int i = this.A06;
        c65954Twz.A00 = i;
        c65954Twz.A01 = i;
        return new Tx0(c65954Twz);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VA6(C68089V9y c68089V9y, Integer num, String str, String str2, String str3, String str4, int i) {
        super(str);
        AbstractC167027dH.A13(str, str2, str3);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = i;
        this.A00 = c68089V9y;
        this.A01 = num;
        this.A02 = str4;
    }
}
