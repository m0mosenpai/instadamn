package X;

import java.util.List;

/* renamed from: X.Ipa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42373Ipa implements InterfaceC43071ya {
    public final List A00;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer num;
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            if (A01 == 2) {
                for (HH1 hh1 : this.A00) {
                    if (hh1.A01 == C05F.A01) {
                        num = C05F.A0N;
                    } else {
                        num = C05F.A0C;
                    }
                    hh1.A00 = num;
                }
                return;
            }
            return;
        }
        for (HH1 hh12 : this.A00) {
            Integer num2 = hh12.A01;
            Integer num3 = C05F.A01;
            if (num2 == num3 || num2 == C05F.A0C) {
                num3 = C05F.A00;
            }
            hh12.A00 = num3;
        }
    }

    public C42373Ipa(List list) {
        this.A00 = list;
    }
}
