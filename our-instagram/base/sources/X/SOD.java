package X;

/* loaded from: classes10.dex */
public final class SOD {
    public SP2 A00;
    public C65158TeX A01;
    public SFA A02;
    public boolean A03;
    public final C62756SPn A04;
    public final SUL A05;
    public final TIU A06;
    public final SZ7 A07;
    public final SJC A08;
    public final C63026Saw A09;

    public final void A00() {
        synchronized (this.A07) {
            this.A03 = true;
        }
    }

    public final boolean A01() {
        boolean z;
        synchronized (this.A07) {
            z = true;
            if (this.A00 == null) {
                C65158TeX c65158TeX = this.A09.A04;
                if (c65158TeX != null && c65158TeX.A02 == 0) {
                    SP2 sp2 = c65158TeX.A0E;
                    if (AbstractC63404SjZ.A0D(sp2.A02.A0A, this.A04.A0A)) {
                        this.A00 = sp2;
                    }
                }
                SFA sfa = this.A02;
                if (sfa == null || sfa.A00 >= sfa.A01.size()) {
                    SJC sjc = this.A08;
                    if (sjc.A00 >= sjc.A02.size() && sjc.A03.isEmpty()) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public SOD(C62756SPn c62756SPn, SUL sul, TIU tiu, SZ7 sz7, C63026Saw c63026Saw) {
        this.A09 = c63026Saw;
        this.A07 = sz7;
        this.A04 = c62756SPn;
        this.A06 = tiu;
        this.A05 = sul;
        this.A08 = new SJC(c62756SPn, sul, tiu, sz7.A05);
    }
}
