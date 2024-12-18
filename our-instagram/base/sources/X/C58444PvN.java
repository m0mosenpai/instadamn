package X;

import java.util.Observable;

/* renamed from: X.PvN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C58444PvN implements InterfaceC65512Tlh {
    public final Observable A00 = new Observable();

    public void A03(Object obj) {
        this.A00.notifyObservers(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Observer, X.TTl, java.lang.Object] */
    @Override // X.InterfaceC65512Tlh
    public void A9a(InterfaceC65392TjP interfaceC65392TjP) {
        Observable observable = this.A00;
        ?? obj = new Object();
        obj.A00 = interfaceC65392TjP;
        observable.addObserver(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Observer, X.TTl, java.lang.Object] */
    @Override // X.InterfaceC65512Tlh
    public final void AOi(InterfaceC65392TjP interfaceC65392TjP) {
        Observable observable = this.A00;
        ?? obj = new Object();
        obj.A00 = interfaceC65392TjP;
        observable.deleteObserver(obj);
    }
}
