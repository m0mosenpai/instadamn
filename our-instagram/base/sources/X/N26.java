package X;

/* loaded from: classes9.dex */
public final class N26 extends AbstractC53436NkP {
    public final String A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof AbstractC53436NkP) && this.A00.equals(((N26) ((AbstractC53436NkP) obj)).A00));
    }

    public final int hashCode() {
        return (this.A00.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IntegrityTokenRequest{nonce=");
        A1C.append(str);
        A1C.append(", cloudProjectNumber=");
        return JQ0.A0l(null, A1C);
    }

    public /* synthetic */ N26(String str) {
        this.A00 = str;
    }
}
