package X;

/* renamed from: X.RqQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61601RqQ {
    public String A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C61601RqQ) {
            C61601RqQ c61601RqQ = (C61601RqQ) obj;
            if (c61601RqQ.A00.equals(this.A00) && c61601RqQ.A01.equals(this.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
