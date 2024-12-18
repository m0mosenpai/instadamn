package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;

/* renamed from: X.Mut, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51789Mut extends C0T6 implements InterfaceC58233Prd {
    public final C124545kG A00;
    public final C51788Mus A01;
    public final LimitedInteractionsVersions A02;
    public final Boolean A03;
    public final Long A04;
    public final Long A05;

    public C51789Mut(C124545kG c124545kG, C51788Mus c51788Mus, LimitedInteractionsVersions limitedInteractionsVersions, Boolean bool, Long l, Long l2) {
        AbstractC25229BEm.A1I(c51788Mus, 3, limitedInteractionsVersions);
        this.A03 = bool;
        this.A00 = c124545kG;
        this.A01 = c51788Mus;
        this.A04 = l;
        this.A05 = l2;
        this.A02 = limitedInteractionsVersions;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51789Mut) {
                C51789Mut c51789Mut = (C51789Mut) obj;
                if (!C14360o3.A0K(this.A03, c51789Mut.A03) || !C14360o3.A0K(this.A00, c51789Mut.A00) || !C14360o3.A0K(this.A01, c51789Mut.A01) || !C14360o3.A0K(this.A04, c51789Mut.A04) || !C14360o3.A0K(this.A05, c51789Mut.A05) || this.A02 != c51789Mut.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (((AbstractC166997dE.A0J(this.A01, ((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A05)) * 31);
    }
}
