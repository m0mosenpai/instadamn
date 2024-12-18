package X;

/* renamed from: X.0Gr, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Gr implements Comparable {
    public final int A00;
    public final InterfaceC03430Gv A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.A00;
        int i2 = ((C0Gr) obj).A00;
        if (i == i2) {
            return 0;
        }
        if (i <= i2) {
            return -1;
        }
        return 1;
    }

    public C0Gr(InterfaceC03430Gv interfaceC03430Gv, int i) {
        this.A01 = interfaceC03430Gv;
        this.A00 = i;
    }
}
