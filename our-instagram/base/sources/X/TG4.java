package X;

/* loaded from: classes10.dex */
public final class TG4 implements InterfaceC25601Mq {
    public final /* synthetic */ C89103yC A00;

    public TG4(C89103yC c89103yC) {
        this.A00 = c89103yC;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        C3JY c3jy = (C3JY) obj;
        if (c3jy != null) {
            C89103yC c89103yC = this.A00;
            int i = c3jy.A02;
            InterfaceC26481Qd A00 = c3jy.A00();
            if (A00 != null) {
                c89103yC.A01(A00.AjT(), i);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return C0eB.A00;
    }
}
