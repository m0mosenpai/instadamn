package X;

import java.util.HashMap;

/* renamed from: X.GyP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38622GyP extends C0T6 {
    public final HashMap A00;
    public final boolean A01;
    public final C38321qM A02;
    public final Boolean A03;
    public final Boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38622GyP) {
                C38622GyP c38622GyP = (C38622GyP) obj;
                if (!C14360o3.A0K(this.A00, c38622GyP.A00) || this.A01 != c38622GyP.A01 || !C14360o3.A0K(this.A03, c38622GyP.A03) || !C14360o3.A0K(this.A04, c38622GyP.A04) || !C14360o3.A0K(this.A02, c38622GyP.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C38622GyP(C38321qM c38321qM, Boolean bool, Boolean bool2, HashMap hashMap, boolean z) {
        this.A00 = hashMap;
        this.A01 = z;
        this.A03 = bool;
        this.A04 = bool2;
        this.A02 = c38321qM;
    }
}
