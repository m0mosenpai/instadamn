package X;

import java.util.List;

/* renamed from: X.GzL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38680GzL extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C38680GzL(String str, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = list;
        this.A04 = z;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        C38680GzL c38680GzL;
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C38680GzL) {
                    c38680GzL = (C38680GzL) obj;
                    if (c38680GzL.A00 == 1 && this.A01 == c38680GzL.A01) {
                        obj2 = this.A02;
                        obj3 = c38680GzL.A02;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C38680GzL)) {
                return false;
            }
            c38680GzL = (C38680GzL) obj;
            if (c38680GzL.A00 != 0 || !C14360o3.A0K(this.A02, c38680GzL.A02)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c38680GzL.A01;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3) || this.A04 != c38680GzL.A04 || this.A03 != c38680GzL.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int hashCode;
        String str;
        if (this.A00 != 0) {
            int A0H = AbstractC166987dD.A0H(this.A01);
            switch (A0H) {
                case 1:
                    str = "LABEL";
                    break;
                case 2:
                    str = "LABEL_EMPHASIZED";
                    break;
                default:
                    str = "INFO_EMPHASIZED";
                    break;
            }
            A0J = AbstractC25226BEj.A02(str, A0H) * 31;
            hashCode = this.A02.hashCode();
        } else {
            A0J = AbstractC166987dD.A0J(this.A02);
            hashCode = this.A01.hashCode();
        }
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A04, (A0J + hashCode) * 31));
    }

    public C38680GzL(Integer num, String str, boolean z, boolean z2) {
        this.A01 = num;
        this.A02 = str;
        this.A04 = z;
        this.A03 = z2;
    }

    public C38680GzL() {
        this("", (List) C16930sl.A00, false, false);
    }
}
