package X;

/* loaded from: classes8.dex */
public final class L9V {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L9V) {
                L9V l9v = (L9V) obj;
                if (!C14360o3.A0K(this.A00, l9v.A00) || !C14360o3.A0K(this.A01, l9v.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("GenerateRecoveryCodeAndVirtualDeviceIdResponse(recoveryCode=", this.A00, ", virtualDeviceId=", this.A01, ')');
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public L9V(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
