package X;

/* renamed from: X.BiZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26209BiZ extends C0T6 implements InterfaceC30824Dgz {
    public final String A01;
    public final String A00 = "creator_ai_deletion_progress";
    public final boolean A02 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26209BiZ) {
                C26209BiZ c26209BiZ = (C26209BiZ) obj;
                if (!C14360o3.A0K(this.A01, c26209BiZ.A01) || !C14360o3.A0K(this.A00, c26209BiZ.A00) || this.A02 != c26209BiZ.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public C26209BiZ(String str) {
        this.A01 = str;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A01)));
    }
}
