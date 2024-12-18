package X;

import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.GyT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38626GyT extends C0T6 {
    public final int A00;
    public final IntentAwareAdPivotState A01;
    public final C64052vQ A02;
    public final HBC A03;
    public final C64072vS A04;
    public final C64082vT A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38626GyT) {
                C38626GyT c38626GyT = (C38626GyT) obj;
                if (!C14360o3.A0K(this.A03, c38626GyT.A03) || !C14360o3.A0K(this.A01, c38626GyT.A01) || this.A00 != c38626GyT.A00 || !C14360o3.A0K(this.A04, c38626GyT.A04) || !C14360o3.A0K(this.A05, c38626GyT.A05) || !C14360o3.A0K(this.A02, c38626GyT.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03)) + this.A00) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C38626GyT(IntentAwareAdPivotState intentAwareAdPivotState, C64052vQ c64052vQ, HBC hbc, C64072vS c64072vS, C64082vT c64082vT, int i) {
        this.A03 = hbc;
        this.A01 = intentAwareAdPivotState;
        this.A00 = i;
        this.A04 = c64072vS;
        this.A05 = c64082vT;
        this.A02 = c64052vQ;
    }
}
