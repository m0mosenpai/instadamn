package X;

/* renamed from: X.9KP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9KP extends AbstractC191288dX {
    public final C191258dU A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9KP(C191258dU c191258dU, String str) {
        super(c191258dU);
        C14360o3.A0B(c191258dU, 2);
        this.A01 = str;
        this.A00 = c191258dU;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9KP) {
                C9KP c9kp = (C9KP) obj;
                if (!C14360o3.A0K(this.A01, c9kp.A01) || !C14360o3.A0K(this.A00, c9kp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
