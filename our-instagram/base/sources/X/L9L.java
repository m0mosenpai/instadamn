package X;

/* loaded from: classes8.dex */
public final class L9L {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof L9L) && this.A00 == ((L9L) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC25230BEn.A0C(num, AbstractC46543Kii.A00(num));
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("EncryptedBackupUserPreferences(onboardingDecision=", AbstractC46543Kii.A00(this.A00));
    }

    public L9L(Integer num) {
        this.A00 = num;
    }
}
