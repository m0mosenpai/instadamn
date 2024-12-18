package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JxJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45089JxJ extends C0T6 {
    public EnumC222729sD A00;
    public EnumC46181KcJ A01;
    public EnumC46169Kc7 A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public C09530e4 A08;
    public final List A09;

    public C45089JxJ(EnumC222729sD enumC222729sD, EnumC46181KcJ enumC46181KcJ, EnumC46169Kc7 enumC46169Kc7, Boolean bool, String str, String str2, String str3, List list, List list2, C09530e4 c09530e4) {
        AbstractC167007dF.A1G(str2, 2, enumC46181KcJ);
        this.A06 = str;
        this.A05 = str2;
        this.A07 = list;
        this.A09 = list2;
        this.A01 = enumC46181KcJ;
        this.A08 = c09530e4;
        this.A00 = enumC222729sD;
        this.A03 = bool;
        this.A04 = str3;
        this.A02 = enumC46169Kc7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45089JxJ) {
                C45089JxJ c45089JxJ = (C45089JxJ) obj;
                if (!C14360o3.A0K(this.A06, c45089JxJ.A06) || !C14360o3.A0K(this.A05, c45089JxJ.A05) || !C14360o3.A0K(this.A07, c45089JxJ.A07) || !C14360o3.A0K(this.A09, c45089JxJ.A09) || this.A01 != c45089JxJ.A01 || !C14360o3.A0K(this.A08, c45089JxJ.A08) || this.A00 != c45089JxJ.A00 || !C14360o3.A0K(this.A03, c45089JxJ.A03) || !C14360o3.A0K(this.A04, c45089JxJ.A04) || this.A02 != c45089JxJ.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        List list = this.A07;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A0q, AbstractC166987dD.A0l(it).A05);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A00);
        A1C.append('_');
        A1C.append(Arrays.hashCode(new Object[]{A0q}));
        return A1C.toString();
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A06))))))) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
