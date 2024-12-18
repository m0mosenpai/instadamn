package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.List;

/* renamed from: X.H5k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38770H5k extends C0T6 implements JJZ {
    public final ClipsACRMidCardSubType A00;
    public final C37771pE A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C38770H5k(ClipsACRMidCardSubType clipsACRMidCardSubType, C37771pE c37771pE, String str, String str2, String str3, List list) {
        C14360o3.A0B(list, 3);
        this.A02 = str;
        this.A00 = clipsACRMidCardSubType;
        this.A05 = list;
        this.A01 = c37771pE;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.JJZ
    public final C38770H5k F0u(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38770H5k) {
                C38770H5k c38770H5k = (C38770H5k) obj;
                if (!C14360o3.A0K(this.A02, c38770H5k.A02) || this.A00 != c38770H5k.A00 || !C14360o3.A0K(this.A05, c38770H5k.A05) || !C14360o3.A0K(this.A01, c38770H5k.A01) || !C14360o3.A0K(this.A03, c38770H5k.A03) || !C14360o3.A0K(this.A04, c38770H5k.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A05, ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    @Override // X.JJZ
    public final JJZ EAM(C1DY c1dy) {
        return this;
    }
}
