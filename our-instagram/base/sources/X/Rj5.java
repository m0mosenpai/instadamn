package X;

/* loaded from: classes10.dex */
public enum Rj5 implements InterfaceC65443TkF {
    EMPTY(0),
    IPV4(1),
    IPV6(2),
    BTC(3),
    UNRECOGNIZED(-1);

    public final int A00;

    @Override // X.InterfaceC65443TkF
    public final int BY9() {
        if (this != UNRECOGNIZED) {
            return this.A00;
        }
        throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
    }

    Rj5(int i) {
        this.A00 = i;
    }
}
