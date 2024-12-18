package X;

import java.io.Closeable;

/* loaded from: classes10.dex */
public final class THP implements Closeable {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final C62996SaK A04;
    public final C63365SiO A05;
    public final EnumC61215RhF A06;
    public final C62696SMk A07;
    public final THP A08;
    public final THP A09;
    public final THP A0A;
    public final THH A0B;
    public final SO5 A0C;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        THH thh = this.A0B;
        if (thh != null) {
            thh.close();
            return;
        }
        throw AbstractC166987dD.A14("response is not eligible for a body and must not be closed");
    }

    public THP(SZJ szj) {
        this.A07 = szj.A07;
        this.A06 = szj.A06;
        this.A00 = szj.A00;
        this.A03 = szj.A03;
        this.A04 = szj.A04;
        this.A05 = new C63365SiO(szj.A05);
        this.A0B = szj.A0B;
        this.A09 = szj.A09;
        this.A08 = szj.A08;
        this.A0A = szj.A0A;
        this.A02 = szj.A02;
        this.A01 = szj.A01;
        this.A0C = szj.A0C;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Response{protocol=");
        A1C.append(this.A06);
        A1C.append(", code=");
        A1C.append(this.A00);
        A1C.append(", message=");
        A1C.append(this.A03);
        A1C.append(", url=");
        return AbstractC58320PtC.A11(this.A07.A03, A1C);
    }
}
