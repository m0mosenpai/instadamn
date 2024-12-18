package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.List;

/* renamed from: X.Mup, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51785Mup extends C0T6 implements JJN {
    public final ClipsACRMidCardSubType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public C51785Mup(ClipsACRMidCardSubType clipsACRMidCardSubType, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        AbstractC25234BEr.A0k(2, str, list, list2, str4);
        C14360o3.A0B(str5, 8);
        this.A00 = clipsACRMidCardSubType;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A06 = list;
        this.A07 = list2;
        this.A04 = str4;
        this.A05 = str5;
    }

    @Override // X.JJN
    public final C51785Mup EtV(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51785Mup) {
                C51785Mup c51785Mup = (C51785Mup) obj;
                if (this.A00 != c51785Mup.A00 || !C14360o3.A0K(this.A01, c51785Mup.A01) || !C14360o3.A0K(this.A02, c51785Mup.A02) || !C14360o3.A0K(this.A03, c51785Mup.A03) || !C14360o3.A0K(this.A06, c51785Mup.A06) || !C14360o3.A0K(this.A07, c51785Mup.A07) || !C14360o3.A0K(this.A04, c51785Mup.A04) || !C14360o3.A0K(this.A05, c51785Mup.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A06, (((AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31))));
    }

    @Override // X.JJN
    public final JJN E92(C1DY c1dy) {
        return this;
    }
}
