package X;

/* renamed from: X.L9e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47796L9e {
    public final QRP A00;
    public final QRR A01;
    public final QRS A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47796L9e) {
                C47796L9e c47796L9e = (C47796L9e) obj;
                if (!C14360o3.A0K(this.A00, c47796L9e.A00) || !C14360o3.A0K(this.A02, c47796L9e.A02) || !C14360o3.A0K(this.A01, c47796L9e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05(((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31, AbstractC167017dG.A0M(this.A01));
    }

    public C47796L9e(QRP qrp, QRR qrr, QRS qrs) {
        this.A00 = qrp;
        this.A02 = qrs;
        this.A01 = qrr;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FetchBackupGraphQLResponse(backup=");
        A1C.append(this.A00);
        A1C.append(", userPreferences=");
        A1C.append(this.A02);
        A1C.append(", user=");
        A1C.append(this.A01);
        A1C.append(", onboardingSoftNuxTimestamp=");
        A1C.append((Object) null);
        A1C.append(", onboardingHardNuxTimestamp=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
