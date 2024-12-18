package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.JxO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45094JxO extends C0T6 {
    public final int A00 = 0;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C45094JxO(C5QE c5qe, C5QE c5qe2, ImageUrl imageUrl, long j, boolean z) {
        this.A01 = j;
        this.A03 = imageUrl;
        this.A04 = c5qe;
        this.A05 = z;
        this.A02 = c5qe2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C45094JxO) {
                    C45094JxO c45094JxO = (C45094JxO) obj;
                    if (c45094JxO.A00 == 1 && C14360o3.A0K(this.A02, c45094JxO.A02) && C14360o3.A0K(this.A03, c45094JxO.A03) && this.A05 == c45094JxO.A05 && this.A01 == c45094JxO.A01) {
                        obj2 = this.A04;
                        obj3 = c45094JxO.A04;
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
            if (!(obj instanceof C45094JxO)) {
                return false;
            }
            C45094JxO c45094JxO2 = (C45094JxO) obj;
            if (c45094JxO2.A00 != 0 || this.A01 != c45094JxO2.A01 || !C14360o3.A0K(this.A03, c45094JxO2.A03) || !C14360o3.A0K(this.A04, c45094JxO2.A04) || this.A05 != c45094JxO2.A05) {
                return false;
            }
            obj2 = this.A02;
            obj3 = c45094JxO2.A02;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return AbstractC25236BEt.A01(this.A01, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC167017dG.A0M(this.A02) * 31))) + AbstractC166997dE.A0I(this.A04);
        }
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A05, (((AbstractC25235BEs.A03(this.A01) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31));
    }

    public C45094JxO(C45110Jxf c45110Jxf, C5QE c5qe, List list, long j, boolean z) {
        this.A02 = c5qe;
        this.A03 = list;
        this.A05 = z;
        this.A01 = j;
        this.A04 = c45110Jxf;
    }
}
