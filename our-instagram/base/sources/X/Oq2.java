package X;

/* loaded from: classes9.dex */
public final class Oq2 implements InterfaceC58020Po6 {
    public final int A00;
    public final Object A01;

    public Oq2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58020Po6
    public final void onAppBackgrounded() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((OWe) obj).A08 = true;
        } else {
            ((C54786OJd) obj).A00 = true;
        }
    }

    @Override // X.InterfaceC58020Po6
    public final void onAppForegrounded() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((OWe) obj).A08 = false;
        } else {
            ((C54786OJd) obj).A00 = false;
        }
    }
}
