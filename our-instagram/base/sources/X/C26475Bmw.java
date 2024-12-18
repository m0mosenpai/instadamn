package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Iterator;

/* renamed from: X.Bmw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26475Bmw extends AbstractC51572Yf {
    public final int A00;
    public final EnumC77683ds A01;
    public final CharSequence A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16660sJ A04;
    public final C51722Yv A05;
    public final InterfaceC16820sZ A06;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int A00 = AbstractC28406CgC.A00(c76223bS, C88.A07);
        int A01 = AbstractC28406CgC.A01(c76223bS, C05F.A0M);
        int A012 = AbstractC28406CgC.A01(c76223bS, C05F.A0O);
        int A013 = AbstractC28406CgC.A01(c76223bS, C05F.A0P);
        Object A002 = AbstractC77183d4.A00(c76223bS, new C57263Pbl(this, A01, c76223bS, A00, 7), AbstractC25228BEl.A1Y(A00));
        InterfaceC16660sJ A014 = AbstractC85303rL.A01(c76223bS, C30181DRm.A01(this, 30));
        C51722Yv c51722Yv = this.A05;
        Integer num = C05F.A00;
        C9CV A0o = AbstractC25225BEi.A0o(num, A002, 4);
        C75933ay c75933ay = C51722Yv.A02;
        if (c51722Yv == c75933ay) {
            c51722Yv = null;
        }
        C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25230BEn.A0d(AbstractC25233BEq.A0R(AbstractC25225BEi.A0h(c51722Yv, A0o), AbstractC25227BEk.A0Y(0, AbstractC25225BEi.A0A(A012)), 0, AbstractC25225BEi.A0A(A013)), C05F.A0C, 1.0f, 1), num, A014, null);
        CharSequence charSequence = this.A02;
        CVV cvv = (CVV) AbstractC77183d4.A00(c76223bS, C29905DGt.A01(this, 46), new Object[]{charSequence});
        EnumC77683ds enumC77683ds = this.A01;
        C3e8 c3e8 = C3e8.SPACE_BETWEEN;
        C2Z0 A0J = AbstractC25233BEq.A0J(c76223bS);
        Object A06 = A0J.A00.A06(InterfaceC30923Dia.class);
        if (A06 != null) {
            InterfaceC30923Dia interfaceC30923Dia = (InterfaceC30923Dia) A06;
            C14360o3.A0B(charSequence, 0);
            C14360o3.A0B(interfaceC30923Dia, 1);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(charSequence);
            Integer num2 = C28351CfB.A00(interfaceC30923Dia).EKP(C05F.A15).A03;
            Iterator it = new C11L("#[\\p{L}\\p{Mn}\\p{Mc}\\p{Nd}_]{1,30}").A04(charSequence).iterator();
            while (it.hasNext()) {
                C117315Sq c117315Sq = (C117315Sq) it.next();
                int intValue = num2.intValue();
                int i = 1;
                if (intValue != 0) {
                    if (intValue != 1 && intValue != 2 && intValue != 3) {
                        throw B4Z.A00();
                    }
                } else {
                    i = 0;
                }
                A0H.setSpan(new StyleSpan(i), c117315Sq.A01().A00, c117315Sq.A01().A01 + 1, 17);
            }
            Iterator A0b = AbstractC25236BEt.A0b(charSequence);
            while (A0b.hasNext()) {
                C27993CVq c27993CVq = (C27993CVq) A0b.next();
                int i2 = c27993CVq.A01;
                int i3 = c27993CVq.A00 + 1;
                String str = c27993CVq.A02;
                A0H.replace(i2, i3, (CharSequence) str);
                int intValue2 = num2.intValue();
                int i4 = 1;
                if (intValue2 != 0) {
                    if (intValue2 != 1 && intValue2 != 2 && intValue2 != 3) {
                        throw B4Z.A00();
                    }
                } else {
                    i4 = 0;
                }
                A0H.setSpan(new StyleSpan(i4), i2, str.length() + i2, 17);
            }
            SpannableString valueOf = SpannableString.valueOf(A0H);
            Integer num3 = C05F.A0j;
            C88 c88 = C88.A0Z;
            C93E c93e = C93E.TEXT_START;
            long A0B = AbstractC25229BEm.A0B();
            A0J.A00(new C26567BoQ(null, c93e, c88, valueOf, num3, 0, A0B, A0B));
            InterfaceC16660sJ interfaceC16660sJ = this.A04;
            if (interfaceC16660sJ != null) {
                C51322Xf c51322Xf = cvv.A00;
                String str2 = cvv.A01;
                D8K d8k = new D8K(14, cvv, interfaceC16660sJ);
                C26511BnW c26511BnW = new C26511BnW(C9CV.A00(AbstractC25232BEp.A14(AbstractC25234BEr.A0L(null, num, 0, AbstractC25230BEn.A0N()), 0, AbstractC25230BEn.A0L()), C05F.A0D, str2, 4), C87.A0X, null, null, Integer.valueOf(AbstractC28406CgC.A00(A0J, c88)), AbstractC77623dm.A0F(A0J, 2131966603), d8k, 12, true);
                AbstractC107374si.A00(c26511BnW, c51322Xf);
                A0J.A00(c26511BnW);
            }
            C2WH A0K = AbstractC76963ci.A0K(A0J, c76223bS, A0e, enumC77683ds, c3e8);
            Integer num4 = C05F.A01;
            return new C26555BoE(A0K, c75933ay, new C29472Cym(num4, num4, num4), this.A06, null);
        }
        throw AbstractC166997dE.A0g();
    }

    public C26475Bmw(C51722Yv c51722Yv, EnumC77683ds enumC77683ds, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        AbstractC167017dG.A1S(interfaceC16820sZ, interfaceC16820sZ2);
        C14360o3.A0B(c51722Yv, 7);
        this.A00 = i;
        this.A02 = charSequence;
        this.A01 = enumC77683ds;
        this.A03 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A04 = interfaceC16660sJ;
        this.A05 = c51722Yv;
    }
}
