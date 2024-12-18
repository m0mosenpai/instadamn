package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.List;

/* renamed from: X.HHm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39062HHm extends C5QE {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39062HHm) {
                C39062HHm c39062HHm = (C39062HHm) obj;
                if (!"".equals("") || !"".equals("") || !C14360o3.A0K(this.A00, c39062HHm.A00) || !C14360o3.A0K(this.A01, c39062HHm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5QE
    public final CharSequence A02(Resources resources) {
        List list = this.A01;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        AbstractC001800i.A0q(A01, this.A00, "", "", list, new C30185DRq(resources, 25));
        return A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C39062HHm(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CompoundString(prefix=");
        A1C.append("");
        A1C.append(", postfix=");
        A1C.append("");
        A1C.append(", separator=");
        A1C.append(this.A00);
        A1C.append(", strings=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
