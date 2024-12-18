package X;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.7yD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ComponentCallbacks2C179637yD extends AbstractC178657wd implements ComponentCallbacks2, InterfaceC179647yE {
    public static final int[] A04 = {80, 15};
    public InterfaceC178407wE A00;
    public final C179657yF A01;
    public final InterfaceC178337w7 A02;
    public final LinkedList A03;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    private final void A00() {
        LinkedList linkedList = this.A03;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            C14360o3.A07(it);
            if (it.hasNext()) {
                C14360o3.A07(it.next());
                throw new NullPointerException("onLowMemory");
            }
        }
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A00 = (InterfaceC178407wE) ((AbstractC178657wd) this).A00.Aq1(InterfaceC178407wE.A00);
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC179647yE.A00;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        int[] iArr = A04;
        int i2 = 0;
        while (i != iArr[i2]) {
            i2++;
            if (i2 >= 2) {
                return;
            }
        }
        A00();
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.BYr().onEvent(15, null, true);
        }
    }

    public ComponentCallbacks2C179637yD(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A03 = new LinkedList();
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178657wd) this).A00;
        Object systemService = interfaceC178207vu2.getContext().getSystemService("activity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.A02 = (InterfaceC178337w7) interfaceC178207vu2.Aq1(InterfaceC178337w7.A00);
        this.A01 = new C179657yF((ActivityManager) systemService);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        A00();
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.BYr().onEvent(15, null, true);
        }
    }
}
