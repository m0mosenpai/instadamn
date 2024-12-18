package X;

/* loaded from: classes5.dex */
public final class CVI {
    public final String A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVI) {
                CVI cvi = (CVI) obj;
                if (!C14360o3.A0K(this.A00, cvi.A00) || this.A01 != cvi.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0l("HookKey(globalKey=", this.A00, ", index=", ')', this.A01);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + this.A01;
    }

    public CVI(String str, int i) {
        this.A00 = str;
        this.A01 = i;
    }
}
