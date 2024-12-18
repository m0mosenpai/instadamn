package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FQ1 {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        FQ1 fq1;
        if (this == obj) {
            return true;
        }
        String str = this.A01;
        String str2 = null;
        if ((obj instanceof FQ1) && (fq1 = (FQ1) obj) != null) {
            str2 = fq1.A01;
        }
        return C14360o3.A0K(str, str2);
    }

    public FQ1(String str, String str2, List list, List list2) {
        AbstractC25234BEr.A1P(str, list, str2);
        this.A01 = str;
        this.A02 = list;
        this.A03 = list2;
        this.A00 = str2;
    }
}
