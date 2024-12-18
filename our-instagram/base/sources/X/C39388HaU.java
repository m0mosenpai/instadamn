package X;

import com.instagram.trials.model.TrialMetricsData;

/* renamed from: X.HaU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39388HaU extends AbstractC39674Hj3 {
    public final int A00;
    public final C5QE A01;
    public final C5QE A02;
    public final TrialMetricsData A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39388HaU) {
                C39388HaU c39388HaU = (C39388HaU) obj;
                if (!C14360o3.A0K(this.A01, c39388HaU.A01) || !C14360o3.A0K(this.A02, c39388HaU.A02) || this.A00 != c39388HaU.A00 || !C14360o3.A0K(this.A03, c39388HaU.A03) || !C14360o3.A0K(this.A04, c39388HaU.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)) + this.A00) * 31) + AbstractC167017dG.A0O(this.A04);
    }

    public C39388HaU(C5QE c5qe, C5QE c5qe2, TrialMetricsData trialMetricsData, String str, int i) {
        this.A01 = c5qe;
        this.A02 = c5qe2;
        this.A00 = i;
        this.A03 = trialMetricsData;
        this.A04 = str;
    }
}
