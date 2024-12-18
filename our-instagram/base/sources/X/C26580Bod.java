package X;

/* renamed from: X.Bod, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26580Bod extends AbstractC51572Yf {
    public static final CZE A07 = new Object();
    public final CharSequence A00;
    public final CharSequence A01;
    public final C51722Yv A02;
    public final C29465Cyf A03;
    public final String A04;
    public final String A05;
    public final InterfaceC16820sZ A06;

    public static final C2WF A03(InterfaceC30923Dia interfaceC30923Dia, C2Z1 c2z1, C51722Yv c51722Yv, InterfaceC31000Djz interfaceC31000Djz, Integer num) {
        C3e8 c3e8;
        if (interfaceC31000Djz == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    c3e8 = C3e8.FLEX_END;
                } else {
                    throw B4Z.A00();
                }
            } else {
                c3e8 = C3e8.CENTER;
            }
        } else {
            c3e8 = C3e8.FLEX_START;
        }
        C51722Yv A0a = AbstractC25233BEq.A0a(c51722Yv, C05F.A0C, 0.0f);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        A0L.A00((AbstractC50812Vc) interfaceC31000Djz.CHd(interfaceC30923Dia));
        return AbstractC76963ci.A07(A0L, c2z1, A0a, null, c3e8);
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C26471Bms c26471Bms;
        AbstractC50812Vc A0W;
        C51722Yv c51722Yv;
        double d;
        InterfaceC30923Dia A00 = AbstractC28337CeP.A00(c76223bS);
        CWO cwo = (CWO) AbstractC28337CeP.A02(c76223bS, this.A03);
        CharSequence charSequence = this.A00;
        C26471Bms c26471Bms2 = null;
        if (charSequence != null) {
            if (this.A01 != null) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(5.0d);
            C3F c3f = new C3F(doubleToRawLongBits2, doubleToRawLongBits2);
            InterfaceC31156Dn0 interfaceC31156Dn0 = cwo.A06;
            C75933ay c75933ay = C51722Yv.A02;
            c26471Bms2 = new C26471Bms(C9CU.A00(null, C05F.A0A, 0, doubleToRawLongBits), C93E.TEXT_START, C93G.TOP, interfaceC31156Dn0, c3f, charSequence, 0);
        }
        CharSequence charSequence2 = this.A01;
        if (charSequence2 != null) {
            long doubleToRawLongBits3 = Double.doubleToRawLongBits(5.0d);
            c26471Bms = new C26471Bms(null, C93E.TEXT_START, C93G.TOP, cwo.A07, new C3F(doubleToRawLongBits3, doubleToRawLongBits3), charSequence2, 0);
        } else {
            c26471Bms = null;
        }
        InterfaceC31000Djz interfaceC31000Djz = cwo.A03;
        Integer num = cwo.A0F;
        C75933ay c75933ay2 = C51722Yv.A02;
        long A0L = AbstractC25230BEn.A0L();
        C2WF A03 = A03(A00, c76223bS, C9CU.A00(null, C05F.A09, 0, A0L), interfaceC31000Djz, num);
        C2WF A032 = A03(A00, c76223bS, AbstractC25232BEp.A14(null, 0, A0L), cwo.A02, cwo.A0A);
        C27882CQt c27882CQt = cwo.A01;
        C2WF c2wf = null;
        if (c27882CQt != null) {
            c2wf = AbstractC25227BEk.A0V(new C26323BkU(c27882CQt.A00, c27882CQt.A01), AbstractC25233BEq.A0J(c76223bS), c76223bS, AbstractC25233BEq.A0Q(null, cwo.A00));
        }
        if (A03 == null && A032 == null) {
            C51722Yv A002 = CZE.A00(this.A02, this.A05);
            EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
            C3e8 c3e8 = C3e8.CENTER;
            C2Z0 A0I = AbstractC25233BEq.A0I(c26471Bms2, c26471Bms, c76223bS.A05);
            A0I.A00(c2wf);
            A0W = AbstractC76963ci.A07(A0I, c76223bS, A002, enumC77683ds, c3e8);
        } else {
            C51722Yv A003 = CZE.A00(this.A02, this.A05);
            C2XE c2xe = c76223bS.A05;
            C2Z0 A11 = AbstractC25232BEp.A11(A03, c2xe);
            C51722Yv A0a = AbstractC25233BEq.A0a(null, C05F.A01, 1.0f);
            EnumC77683ds enumC77683ds2 = EnumC77683ds.FLEX_START;
            C3e8 c3e82 = C3e8.CENTER;
            C2Z0 A0I2 = AbstractC25233BEq.A0I(c26471Bms2, c26471Bms, c2xe);
            A0I2.A00(c2wf);
            A11.A00(AbstractC76963ci.A07(A0I2, c76223bS, A0a, enumC77683ds2, c3e82));
            A0W = AbstractC25227BEk.A0W(A032, A11, c76223bS, A003);
        }
        AbstractC50812Vc abstractC50812Vc = A0W;
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        if (interfaceC16820sZ != null) {
            InterfaceC31155Dmz interfaceC31155Dmz = cwo.A04;
            String str = this.A04;
            if (str != null) {
                c51722Yv = C9CV.A00(null, C05F.A15, new DHI(str, 18), 0);
            } else {
                c51722Yv = C51722Yv.A02;
            }
            return new C26555BoE(abstractC50812Vc, c51722Yv, interfaceC31155Dmz, interfaceC16820sZ, null);
        }
        return A0W;
    }

    public C26580Bod(C51722Yv c51722Yv, C29465Cyf c29465Cyf, CharSequence charSequence, CharSequence charSequence2, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
        this.A03 = c29465Cyf;
        this.A06 = interfaceC16820sZ;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = c51722Yv;
    }
}
