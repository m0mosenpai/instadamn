package X;

import com.instagram.api.schemas.ClipsRSAMidCardSubType;
import java.util.List;

/* renamed from: X.BhU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26143BhU extends C0T6 implements JJY {
    public final ClipsRSAMidCardSubType A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    @Override // X.JJY
    public final C26143BhU Ez0(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26143BhU) {
                C26143BhU c26143BhU = (C26143BhU) obj;
                if (!C14360o3.A0K(this.A01, c26143BhU.A01) || !C14360o3.A0K(this.A03, c26143BhU.A03) || this.A04 != c26143BhU.A04 || this.A00 != c26143BhU.A00 || !C14360o3.A0K(this.A02, c26143BhU.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A01))) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public C26143BhU(ClipsRSAMidCardSubType clipsRSAMidCardSubType, String str, String str2, List list, boolean z) {
        AbstractC167017dG.A1P(str, list);
        C14360o3.A0B(str2, 5);
        this.A01 = str;
        this.A03 = list;
        this.A04 = z;
        this.A00 = clipsRSAMidCardSubType;
        this.A02 = str2;
    }

    @Override // X.JJY
    public final JJY E9k(C1DY c1dy) {
        return this;
    }
}
