package X;

import java.util.List;

/* renamed from: X.SMx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62709SMx {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C62696SMk A04;
    public final SO5 A05;
    public final C63026Saw A06;
    public final int A07;
    public final List A08;
    public final TIU A09;

    public final THP A00(C62696SMk c62696SMk, SO5 so5, C63026Saw c63026Saw) {
        int i = this.A07;
        List list = this.A08;
        if (i < list.size()) {
            this.A00++;
            SO5 so52 = this.A05;
            if (so52 != null && !so52.A04.AJU().A02(c62696SMk.A03)) {
                StringBuilder A11 = AbstractC166997dE.A11("network interceptor ");
                A11.append(list.get(i - 1));
                throw AbstractC58320PtC.A0o(" must retain the same host and port", A11);
            }
            if (so52 != null && this.A00 > 1) {
                StringBuilder A112 = AbstractC166997dE.A11("network interceptor ");
                A112.append(list.get(i - 1));
                throw AbstractC58320PtC.A0o(" must call proceed() exactly once", A112);
            }
            int i2 = i + 1;
            C62709SMx c62709SMx = new C62709SMx(list, this.A09, c62696SMk, so5, c63026Saw, i2, this.A01, this.A02, this.A03);
            InterfaceC65461TkX interfaceC65461TkX = (InterfaceC65461TkX) list.get(i);
            THP COo = interfaceC65461TkX.COo(c62709SMx);
            if (so5 != null && i2 < list.size() && c62709SMx.A00 != 1) {
                StringBuilder A113 = AbstractC166997dE.A11("network interceptor ");
                A113.append(interfaceC65461TkX);
                throw AbstractC58320PtC.A0o(" must call proceed() exactly once", A113);
            }
            if (COo.A0B != null) {
                return COo;
            }
            StringBuilder A114 = AbstractC166997dE.A11("interceptor ");
            A114.append(interfaceC65461TkX);
            throw AbstractC58320PtC.A0o(" returned a response with no body", A114);
        }
        throw AbstractC58318PtA.A0V();
    }

    public C62709SMx(List list, TIU tiu, C62696SMk c62696SMk, SO5 so5, C63026Saw c63026Saw, int i, int i2, int i3, int i4) {
        this.A08 = list;
        this.A06 = c63026Saw;
        this.A05 = so5;
        this.A07 = i;
        this.A04 = c62696SMk;
        this.A09 = tiu;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
