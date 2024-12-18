package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;

/* renamed from: X.H4o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38748H4o extends C0T6 implements JJG {
    public final ProfileGridItemTypeEnum A00;
    public final C38321qM A01;
    public final C37771pE A02;

    @Override // X.JJG
    public final C38748H4o Eye(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38748H4o) {
                C38748H4o c38748H4o = (C38748H4o) obj;
                if (!C14360o3.A0K(this.A02, c38748H4o.A02) || this.A00 != c38748H4o.A00 || !C14360o3.A0K(this.A01, c38748H4o.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38748H4o(ProfileGridItemTypeEnum profileGridItemTypeEnum, C38321qM c38321qM, C37771pE c37771pE) {
        this.A02 = c37771pE;
        this.A00 = profileGridItemTypeEnum;
        this.A01 = c38321qM;
    }
}
