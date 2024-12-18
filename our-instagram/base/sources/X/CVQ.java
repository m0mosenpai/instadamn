package X;

/* loaded from: classes5.dex */
public final class CVQ {
    public final int A00;
    public final String A01;

    public CVQ(String str, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVQ) {
                CVQ cvq = (CVQ) obj;
                if (!C14360o3.A0K(this.A01, cvq.A01) || this.A00 != cvq.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0l("EmuFlashRequest(prompt=", this.A01, ", flashSessionId=", ')', this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }
}
