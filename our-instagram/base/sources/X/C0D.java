package X;

/* loaded from: classes5.dex */
public final class C0D extends BH1 {
    public final C31200Dnj A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0D) {
                C0D c0d = (C0D) obj;
                if (!C14360o3.A0K(this.A00, c0d.A00) || this.A01 != c0d.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public C0D(C31200Dnj c31200Dnj, int i) {
        super("business_conversion_reminder", "content_type_business_conversion_reminder");
        this.A00 = c31200Dnj;
        this.A01 = i;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + this.A01;
    }
}
