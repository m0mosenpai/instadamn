package X;

import java.util.List;

/* loaded from: classes9.dex */
public abstract class OL0 {
    public String A00;
    public boolean A01 = true;
    public final O1H A02;
    public final C53627NnY A03;
    public final C51653Mrk A04;
    public final List A05;

    public OL0(O1H o1h, C53627NnY c53627NnY, C51653Mrk c51653Mrk) {
        this.A03 = c53627NnY;
        this.A02 = o1h;
        this.A04 = c51653Mrk;
        c53627NnY.A03 = new O1M(this);
        this.A05 = AbstractC166987dD.A1E();
    }

    public void A00() {
        this.A03.A00();
    }

    public final void A01(EnumC53100NeD enumC53100NeD, String str) {
        C54753OHi c54753OHi;
        Integer num;
        List list;
        for (C55127Obo c55127Obo : this.A05) {
            switch (AbstractC54325Nzj.A00[enumC53100NeD.ordinal()]) {
                case 1:
                    C55127Obo.A02(c55127Obo, enumC53100NeD.A00());
                    c54753OHi = c55127Obo.A02;
                    if (c54753OHi != null) {
                        num = C05F.A0j;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    C55127Obo.A02(c55127Obo, enumC53100NeD.A00());
                    if (str == null) {
                        c55127Obo.A09 = AbstractC43591JPw.A00(54);
                    }
                    OMg oMg = c55127Obo.A05;
                    if (oMg != null) {
                        oMg.A04("AVATAR_INITIAL_CHECK_FAILED", (short) 3);
                    }
                    c54753OHi = c55127Obo.A02;
                    if (c54753OHi != null) {
                        num = C05F.A1F;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    C55127Obo.A02(c55127Obo, enumC53100NeD.A00());
                    c54753OHi = c55127Obo.A02;
                    if (c54753OHi != null) {
                        num = C05F.A0C;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    C55127Obo.A02(c55127Obo, enumC53100NeD.A00());
                    c54753OHi = c55127Obo.A02;
                    if (c54753OHi != null) {
                        num = C05F.A15;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    C55127Obo.A02(c55127Obo, enumC53100NeD.A00());
                    c54753OHi = c55127Obo.A02;
                    if (c54753OHi != null) {
                        num = C05F.A0u;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    C55127Obo.A02(c55127Obo, enumC53100NeD.A00());
                    c54753OHi = c55127Obo.A02;
                    if (c54753OHi != null) {
                        num = C05F.A1I;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    C51653Mrk c51653Mrk = c55127Obo.A04;
                    if (c51653Mrk != null && (list = c51653Mrk.A0C) != null && AbstractC001800i.A0u(list, str)) {
                        C55127Obo.A02(c55127Obo, enumC53100NeD.A00());
                    }
                    if (str == null) {
                        break;
                    } else {
                        OMg oMg2 = c55127Obo.A05;
                        if (oMg2 != null) {
                            oMg2.A03("inSessionMemoryTrimType", str);
                        }
                        c54753OHi = c55127Obo.A02;
                        if (c54753OHi != null) {
                            num = C05F.A02;
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
            }
            c54753OHi.A00(num, str);
        }
    }
}
