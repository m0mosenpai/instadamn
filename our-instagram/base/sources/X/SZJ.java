package X;

/* loaded from: classes10.dex */
public final class SZJ {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public C62996SaK A04;
    public SNS A05;
    public EnumC61215RhF A06;
    public C62696SMk A07;
    public THP A08;
    public THP A09;
    public THP A0A;
    public THH A0B;
    public SO5 A0C;

    public final THP A00() {
        if (this.A07 != null) {
            if (this.A06 != null) {
                int i = this.A00;
                if (i >= 0) {
                    if (this.A03 != null) {
                        return new THP(this);
                    }
                    throw AbstractC166987dD.A14("message == null");
                }
                throw AbstractC31175DnJ.A0U("code < 0: ", i);
            }
            throw AbstractC166987dD.A14("protocol == null");
        }
        throw AbstractC166987dD.A14("request == null");
    }

    public SZJ(THP thp) {
        this.A00 = -1;
        this.A07 = thp.A07;
        this.A06 = thp.A06;
        this.A00 = thp.A00;
        this.A03 = thp.A03;
        this.A04 = thp.A04;
        this.A05 = C63365SiO.A00(thp.A05);
        this.A0B = thp.A0B;
        this.A09 = thp.A09;
        this.A08 = thp.A08;
        this.A0A = thp.A0A;
        this.A02 = thp.A02;
        this.A01 = thp.A01;
        this.A0C = thp.A0C;
    }

    public SZJ() {
        this.A00 = -1;
        this.A05 = new SNS();
    }
}
