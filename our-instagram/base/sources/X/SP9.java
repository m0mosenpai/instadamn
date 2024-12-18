package X;

/* loaded from: classes10.dex */
public final class SP9 {
    public final int A00;
    public final SXw A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SP9)) {
            return false;
        }
        SP9 sp9 = (SP9) obj;
        if (this.A01 != sp9.A01 || this.A00 != sp9.A00 || !this.A03.equals(sp9.A03) || !this.A02.equals(sp9.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(this.A01, Integer.valueOf(this.A00), this.A03, this.A02);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.A01, Integer.valueOf(this.A00), this.A03, this.A02);
    }

    public SP9(SXw status, String keyId, String keyType, int keyPrefix) {
        this.A01 = status;
        this.A00 = keyPrefix;
        this.A03 = keyId;
        this.A02 = keyType;
    }
}
