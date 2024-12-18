package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.AYj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23385AYj implements InterfaceC178207vu, InterfaceC25218BDs {
    public final Context A03;
    public final C178027vb A04;
    public final Map A01 = AbstractC166987dD.A1G();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final C1814082s A05 = new C1814082s();
    public int A00 = 0;

    public final void A01(InterfaceC178067vf interfaceC178067vf, C178087vh c178087vh) {
        this.A02.put(interfaceC178067vf, interfaceC178067vf);
        Map map = this.A01;
        synchronized (map) {
            Map map2 = (Map) map.get(c178087vh);
            if (map2 == null) {
                map2 = AbstractC166987dD.A1G();
                map.put(c178087vh, map2);
            }
            map2.put(0, interfaceC178067vf);
        }
    }

    @Override // X.InterfaceC178207vu
    public final InterfaceC178067vf Aq0(C178087vh c178087vh) {
        InterfaceC178067vf interfaceC178067vf;
        synchronized (this) {
            A00();
            interfaceC178067vf = null;
            Map map = this.A01;
            synchronized (map) {
                try {
                    Map map2 = (Map) map.get(c178087vh);
                    if (map2 != null) {
                        interfaceC178067vf = (InterfaceC178067vf) AbstractC166997dE.A0m(map2, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (interfaceC178067vf == null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Requested component is null for index: ");
                A1C.append(0);
                throw AbstractC166987dD.A14(AbstractC167017dG.A0n(c178087vh, " and componentClass: ", A1C));
            }
        }
        return interfaceC178067vf;
    }

    @Override // X.InterfaceC25218BDs
    public final synchronized void EKd() {
        InterfaceC178407wE interfaceC178407wE;
        A00();
        ACs("LiteCameraController must be initialized before invoking resume()");
        if (this.A00 == 1) {
            C178307w4 c178307w4 = InterfaceC178407wE.A00;
            if (CRZ(c178307w4)) {
                interfaceC178407wE = (InterfaceC178407wE) Aq1(c178307w4);
                if (interfaceC178407wE != null) {
                    interfaceC178407wE.Cia(AbstractC166987dD.A0M(this), "connect_controllers_started", "ComponentManager", null);
                }
            } else {
                interfaceC178407wE = null;
            }
            this.A00 = 2;
            ConcurrentHashMap concurrentHashMap = this.A02;
            Iterator A0k = AbstractC167007dF.A0k(concurrentHashMap);
            while (A0k.hasNext()) {
                ((InterfaceC178067vf) A0k.next()).E50();
            }
            Iterator A0k2 = AbstractC167007dF.A0k(concurrentHashMap);
            while (A0k2.hasNext()) {
                ((InterfaceC178067vf) A0k2.next()).connect();
            }
            if (interfaceC178407wE != null) {
                interfaceC178407wE.Cia(AbstractC166987dD.A0M(this), "connect_controllers_finished", "ComponentManager", null);
            }
        }
    }

    @Override // X.InterfaceC25218BDs
    public final synchronized void destroy() {
        if (this.A00 != 0) {
            pause();
            Iterator A0k = AbstractC167007dF.A0k(this.A02);
            while (A0k.hasNext()) {
                ((InterfaceC178067vf) A0k.next()).release();
            }
            this.A00 = 0;
        }
    }

    @Override // X.InterfaceC25218BDs
    public final synchronized void pause() {
        ACs("LiteCameraController must be initialized before invoking pause()");
        if (this.A00 == 2) {
            this.A00 = 1;
            Iterator A0k = AbstractC167007dF.A0k(this.A02);
            while (A0k.hasNext()) {
                ((InterfaceC178067vf) A0k.next()).disconnect();
            }
        }
    }

    public final void A00() {
        InterfaceC178407wE interfaceC178407wE;
        if (this.A00 == 0) {
            C178307w4 c178307w4 = InterfaceC178407wE.A00;
            if (CRZ(c178307w4)) {
                interfaceC178407wE = (InterfaceC178407wE) Aq1(c178307w4);
                if (interfaceC178407wE != null) {
                    interfaceC178407wE.Cia(AbstractC166987dD.A0M(this), "init_controllers_started", "ComponentManager", null);
                }
            } else {
                interfaceC178407wE = null;
            }
            this.A00 = 1;
            List list = this.A05.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC178277w1 abstractC178277w1 = (AbstractC178277w1) ((InterfaceC178287w2) list.get(i));
                if (!abstractC178277w1.A01) {
                    abstractC178277w1.A01 = true;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.A02;
            Iterator A0k = AbstractC167007dF.A0k(concurrentHashMap);
            while (A0k.hasNext()) {
                ((InterfaceC178077vg) A0k.next()).CNZ();
            }
            Iterator A0k2 = AbstractC167007dF.A0k(concurrentHashMap);
            while (A0k2.hasNext()) {
                ((InterfaceC178077vg) A0k2.next()).CNu();
            }
            if (interfaceC178407wE != null) {
                interfaceC178407wE.Cia(AbstractC166987dD.A0M(this), "init_controllers_finished", "ComponentManager", null);
            }
        }
    }

    public final void A02(InterfaceC178287w2 interfaceC178287w2) {
        C1814082s c1814082s = this.A05;
        if (!c1814082s.A00.contains(interfaceC178287w2)) {
            c1814082s.A01(interfaceC178287w2);
            AbstractC178277w1 abstractC178277w1 = (AbstractC178277w1) interfaceC178287w2;
            if (!abstractC178277w1.A01) {
                abstractC178277w1.A01 = true;
            }
        }
    }

    @Override // X.InterfaceC25218BDs
    public final void ACs(String str) {
        if (this.A00 != 0) {
        } else {
            throw AbstractC166987dD.A14(str);
        }
    }

    @Override // X.InterfaceC178207vu
    public final InterfaceC178287w2 Aq1(C178307w4 c178307w4) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC178287w2 interfaceC178287w2 = (InterfaceC178287w2) list.get(i);
            if (interfaceC178287w2.BKX() == c178307w4) {
                return interfaceC178287w2;
            }
        }
        throw AbstractC166987dD.A12(AbstractC167017dG.A0n(c178307w4, "Requested core component is null for key ", AbstractC166987dD.A1C()));
    }

    @Override // X.InterfaceC178207vu
    public final Object AqF(C177257uL c177257uL) {
        throw AbstractC166987dD.A14("ConnectConfigurationKey not supported!");
    }

    @Override // X.InterfaceC178207vu
    public final Object AqG(C178037vc c178037vc) {
        return this.A04.A00.get(c178037vc);
    }

    @Override // X.InterfaceC178207vu
    public final boolean CRY(C178087vh c178087vh) {
        boolean containsKey;
        Map map = this.A01;
        synchronized (map) {
            containsKey = map.containsKey(c178087vh);
        }
        return containsKey;
    }

    @Override // X.InterfaceC178207vu
    public final boolean CRZ(C178307w4 c178307w4) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((InterfaceC178287w2) list.get(i)).BKX() == c178307w4) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC25218BDs
    public final void ERx(C177257uL c177257uL, Object obj) {
        throw AbstractC166987dD.A14("ConnectConfigurationKey not supported!");
    }

    @Override // X.InterfaceC178207vu
    public final Context getContext() {
        return this.A03;
    }

    public C23385AYj(Context context, C178027vb c178027vb) {
        this.A03 = context.getApplicationContext();
        this.A04 = c178027vb;
    }
}
