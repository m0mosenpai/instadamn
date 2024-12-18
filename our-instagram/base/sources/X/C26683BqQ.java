package X;

/* renamed from: X.BqQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26683BqQ extends AbstractC27461CAe {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26683BqQ) {
                C26683BqQ c26683BqQ = (C26683BqQ) obj;
                if (!C14360o3.A0K(this.A00, c26683BqQ.A00) || this.A01 != c26683BqQ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C26683BqQ(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
