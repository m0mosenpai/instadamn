package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class W2a {
    public int A00;
    public W4P A01;
    public Integer A02;
    public List A03;

    public static final W4H A00(String str) {
        if (str != null && str.length() != 0) {
            return new W4H(C05F.A0C, Float.parseFloat(str));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public W2a(C69390Vma c69390Vma, List list) {
        ?? r3;
        Integer num;
        this.A01 = W4P.A05;
        Integer num2 = C05F.A00;
        this.A02 = num2;
        this.A00 = -1;
        if (c69390Vma != null) {
            String str = c69390Vma.A02;
            if (str != null && str.length() != 0) {
                this.A00 = AbstractC70134W6i.A00(str);
            }
            EnumC68176VEu enumC68176VEu = c69390Vma.A01;
            if (enumC68176VEu != null) {
                int ordinal = enumC68176VEu.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        num = ordinal == 3 ? C05F.A0C : num;
                    } else {
                        this.A02 = num2;
                    }
                } else {
                    num = C05F.A01;
                }
                this.A02 = num;
            }
            W4H A00 = A00(c69390Vma.A06);
            A00 = A00 == null ? this.A01.A03 : A00;
            W4H A002 = A00(c69390Vma.A03);
            A002 = A002 == null ? this.A01.A00 : A002;
            W4H A003 = A00(c69390Vma.A05);
            A003 = A003 == null ? this.A01.A02 : A003;
            W4H A004 = A00(c69390Vma.A04);
            this.A01 = new W4P(A004 == null ? this.A01.A01 : A004, A00, A003, A002);
        }
        if (list != null) {
            r3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC65702TsY.A1T(AbstractC166987dD.A19(it.next()), r3, EnumC72371Xc7.A01);
            }
        } else {
            r3 = C16930sl.A00;
        }
        this.A03 = r3;
    }
}
