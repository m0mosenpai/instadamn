package X;

/* renamed from: X.SLm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62674SLm {
    public final int A00;
    public final Exception A01;
    public final Integer A02;

    public C62674SLm(Exception exc, Integer num, int i) {
        this.A00 = i;
        this.A01 = exc;
        this.A02 = num;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("resultCode ");
        A1C.append(this.A00);
        Integer num = this.A02;
        if (num != null) {
            A1C.append(" | errorCode ");
            A1C.append(num);
        }
        Exception exc = this.A01;
        if (exc != null) {
            A1C.append(" | exception ");
            AbstractC58318PtA.A1V(A1C, exc);
        }
        return A1C.toString();
    }
}
