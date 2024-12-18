package X;

/* renamed from: X.SxK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63988SxK implements InterfaceC65204Tfn {
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[ ");
        A1C.append(AbstractC31173DnH.A0q(this));
        A1C.append(" dontSuspendDuringScroll: ");
        A1C.append(this.A00);
        A1C.append(" ignoreNativeAllocs: ");
        A1C.append(this.A02);
        A1C.append(" ignoreBackgroundGcs: ");
        A1C.append(this.A01);
        return AbstractC166997dE.A0x(" ]", A1C);
    }
}
