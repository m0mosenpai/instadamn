package X;

import java.util.List;

/* loaded from: classes7.dex */
public abstract class Hx7 {
    public static final C38641Gyi A00(C38321qM c38321qM) {
        String str;
        String BKx;
        String str2;
        String str3;
        List list = null;
        if (!c38321qM.CdW()) {
            return null;
        }
        InterfaceC39541sb A0F = AbstractC37300Gc1.A0F(c38321qM);
        if (A0F != null) {
            str = A0F.AZE();
        } else {
            str = null;
        }
        if (str != null) {
            String id = c38321qM.getId();
            if (id != null) {
                InterfaceC39541sb A0F2 = AbstractC37300Gc1.A0F(c38321qM);
                if (A0F2 != null && (BKx = A0F2.BKx()) != null) {
                    InterfaceC39541sb A0F3 = AbstractC37300Gc1.A0F(c38321qM);
                    if (A0F3 != null) {
                        str2 = A0F3.CAR();
                    } else {
                        str2 = null;
                    }
                    String BNP = c38321qM.A0C.BNP();
                    C84923qg A1W = c38321qM.A1W();
                    if (A1W != null) {
                        str3 = A1W.A0e;
                    } else {
                        str3 = null;
                    }
                    String BNT = c38321qM.A0C.BNT();
                    List A3Y = c38321qM.A3Y();
                    InterfaceC39541sb A0F4 = AbstractC37300Gc1.A0F(c38321qM);
                    if (A0F4 != null) {
                        list = A0F4.getCookies();
                    }
                    return new C38641Gyi(str, id, BKx, str2, BNP, str3, BNT, A3Y, list);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
