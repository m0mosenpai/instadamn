package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jxj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45114Jxj extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public C45114Jxj(AbstractC33556EsU abstractC33556EsU, String str, List list, Map map, int i, boolean z) {
        AbstractC25233BEq.A0x(1, str, list, abstractC33556EsU);
        C14360o3.A0B(map, 6);
        this.A05 = str;
        this.A01 = i;
        this.A06 = z;
        this.A02 = list;
        this.A03 = abstractC33556EsU;
        this.A04 = map;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C45114Jxj) {
                    C45114Jxj c45114Jxj = (C45114Jxj) obj;
                    if (c45114Jxj.A00 == 1 && C14360o3.A0K(this.A05, c45114Jxj.A05) && this.A01 == c45114Jxj.A01 && this.A06 == c45114Jxj.A06 && C14360o3.A0K(this.A02, c45114Jxj.A02) && C14360o3.A0K(this.A03, c45114Jxj.A03)) {
                        obj2 = this.A04;
                        obj3 = c45114Jxj.A04;
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
            if (!(obj instanceof C45114Jxj)) {
                return false;
            }
            C45114Jxj c45114Jxj2 = (C45114Jxj) obj;
            if (c45114Jxj2.A00 != 0 || !C14360o3.A0K(this.A05, c45114Jxj2.A05) || this.A01 != c45114Jxj2.A01 || !C14360o3.A0K(this.A04, c45114Jxj2.A04) || !C14360o3.A0K(this.A03, c45114Jxj2.A03) || this.A06 != c45114Jxj2.A06) {
                return false;
            }
            obj2 = this.A02;
            obj3 = c45114Jxj2.A02;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        Object obj;
        int i = this.A00;
        int A0J = (AbstractC166987dD.A0J(this.A05) + this.A01) * 31;
        if (i != 0) {
            A0D = AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A06, A0J)));
            obj = this.A04;
        } else {
            A0D = AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, A0J)));
            obj = this.A02;
        }
        return AbstractC166987dD.A0I(obj, A0D);
    }

    public C45114Jxj(C5QE c5qe, ImageUrl imageUrl, ImageUrl imageUrl2, String str, int i, boolean z) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A01 = i;
        this.A04 = imageUrl;
        this.A03 = imageUrl2;
        this.A06 = z;
        this.A02 = c5qe;
    }

    public C45114Jxj() {
        this((AbstractC33556EsU) C32939EeK.A00, "", (List) C16930sl.A00, (Map) AbstractC06930Yk.A0E(), 0, false);
    }
}
