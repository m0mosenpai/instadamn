package X;

/* renamed from: X.6Ln, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Ln extends AbstractC119385av {
    public final C137656Ll A00;
    public final C60Y A01;

    public C6Ln(C137656Ll c137656Ll) {
        C60X c60x = null;
        this.A00 = c137656Ll;
        if (!AbstractC137666Lm.A01(c137656Ll)) {
            c60x = C60W.A00();
            c60x.AAG(c137656Ll, C05F.A00);
        }
        this.A01 = c60x;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6Ln) && C14360o3.A0K(this.A00, ((C6Ln) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
