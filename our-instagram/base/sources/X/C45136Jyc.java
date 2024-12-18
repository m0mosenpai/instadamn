package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;

/* renamed from: X.Jyc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45136Jyc extends C0T6 implements JJK {
    public final H2A A00;
    public final ACRType A01;
    public final SmartReelType A02;
    public final ReelType A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final InterfaceC43521JKh A09;
    public final C38321qM A0A;

    @Override // X.JJK
    public final C45136Jyc EqX(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45136Jyc) {
                C45136Jyc c45136Jyc = (C45136Jyc) obj;
                if (!C14360o3.A0K(this.A00, c45136Jyc.A00) || this.A01 != c45136Jyc.A01 || !C14360o3.A0K(this.A04, c45136Jyc.A04) || !C14360o3.A0K(this.A05, c45136Jyc.A05) || !C14360o3.A0K(this.A0A, c45136Jyc.A0A) || !C14360o3.A0K(this.A06, c45136Jyc.A06) || !C14360o3.A0K(this.A07, c45136Jyc.A07) || !C14360o3.A0K(this.A08, c45136Jyc.A08) || this.A02 != c45136Jyc.A02 || this.A03 != c45136Jyc.A03 || !C14360o3.A0K(this.A09, c45136Jyc.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JJK
    public final JJK E8f(C1DY c1dy) {
        return this;
    }

    public final int hashCode() {
        return ((((((((((AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0K(this.A05, ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31)) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A09);
    }

    public C45136Jyc(H2A h2a, ACRType aCRType, SmartReelType smartReelType, InterfaceC43521JKh interfaceC43521JKh, C38321qM c38321qM, ReelType reelType, String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1S(str2, c38321qM);
        this.A00 = h2a;
        this.A01 = aCRType;
        this.A04 = str;
        this.A05 = str2;
        this.A0A = c38321qM;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = smartReelType;
        this.A03 = reelType;
        this.A09 = interfaceC43521JKh;
    }
}
