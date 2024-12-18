package X;

import com.instagram.api.schemas.IntegrityInterstitialType;

/* renamed from: X.JzF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45174JzF extends C0T6 implements InterfaceC50396MMy {
    public final long A00;
    public final IntegrityInterstitialType A01;
    public final C2Fb A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C45174JzF(IntegrityInterstitialType integrityInterstitialType, C2Fb c2Fb, String str, String str2, String str3, long j) {
        AbstractC25233BEq.A0w(2, str, c2Fb, str2);
        this.A01 = integrityInterstitialType;
        this.A05 = str;
        this.A02 = c2Fb;
        this.A04 = str2;
        this.A00 = j;
        this.A03 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45174JzF) {
                C45174JzF c45174JzF = (C45174JzF) obj;
                if (this.A01 != c45174JzF.A01 || !C14360o3.A0K(this.A05, c45174JzF.A05) || this.A02 != c45174JzF.A02 || !C14360o3.A0K(this.A04, c45174JzF.A04) || this.A00 != c45174JzF.A00 || !C14360o3.A0K(this.A03, c45174JzF.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0G(this.A01))))) + AbstractC167017dG.A0O(this.A03);
    }
}
