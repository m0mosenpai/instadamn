package X;

/* renamed from: X.T3j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64200T3j implements InterfaceC65392TjP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64200T3j(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65392TjP
    public final void Dx0(Object obj) {
        switch (this.A00) {
            case 0:
                C62739SOf c62739SOf = (C62739SOf) this.A01;
                C14360o3.A0C(c62739SOf, "null cannot be cast to non-null type com.fbpay.util.observable.FBPayObservableMediator.MediatorEntry<kotlin.Any?, T of com.fbpay.util.observable.FBPayObservableMediator>");
                ((C58444PvN) this.A02).A03(c62739SOf.A01.invoke(obj));
                return;
            case 1:
                InterfaceC65392TjP interfaceC65392TjP = (InterfaceC65392TjP) this.A01;
                if (interfaceC65392TjP == null) {
                    return;
                }
                interfaceC65392TjP.Dx0(((InterfaceC16660sJ) this.A02).invoke(obj));
                return;
            default:
                return;
        }
    }
}
