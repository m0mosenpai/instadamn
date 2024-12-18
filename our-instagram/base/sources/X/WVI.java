package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class WVI implements XGn {
    public final Iterable A00;
    public final AtomicBoolean A01 = AbstractC166997dE.A17();

    @Override // X.XE6
    public final void D6h(W63 w63) {
        C14360o3.A0B(w63, 0);
        if (!this.A01.getAndSet(true)) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((XE6) it.next()).D6h(w63);
            }
        }
    }

    @Override // X.XGn
    public final void DFo(Exception exc, String str, String str2, Map map, int i, long j, boolean z) {
        C14360o3.A0B(str, 1);
        for (XE6 xe6 : this.A00) {
            if (xe6 instanceof XGn) {
                ((XGn) xe6).DFo(exc, str, str2, map, i, j, z);
            }
        }
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
        C14360o3.A0B(via, 0);
        if (!this.A01.getAndSet(true)) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((XE6) it.next()).DFz(via);
            }
        }
    }

    @Override // X.XGn
    public final void D16(long j) {
        for (XE6 xe6 : this.A00) {
            if (xe6 instanceof XGn) {
                ((XGn) xe6).D16(j);
            }
        }
    }

    @Override // X.XE6
    public final void D1z() {
        if (!this.A01.getAndSet(true)) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((XE6) it.next()).D1z();
            }
        }
    }

    @Override // X.XGn
    public final void DHA(String str, Map map) {
        for (XE6 xe6 : this.A00) {
            if (xe6 instanceof XGn) {
                ((XGn) xe6).DHA(str, map);
            }
        }
    }

    @Override // X.XGn
    public final void DHE(String str, Map map, boolean z) {
        for (XE6 xe6 : this.A00) {
            if (xe6 instanceof XGn) {
                ((XGn) xe6).DHE(str, map, z);
            }
        }
    }

    @Override // X.XE6
    public final void Dbk(float f) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((XE6) it.next()).Dbk(f);
        }
    }

    @Override // X.XGn
    public final void DkZ(long j, boolean z) {
        for (XE6 xe6 : this.A00) {
            if (xe6 instanceof XGn) {
                ((XGn) xe6).DkZ(j, z);
            }
        }
    }

    @Override // X.XGn
    public final void Dkd(String str, Map map) {
        for (XE6 xe6 : this.A00) {
            if (xe6 instanceof XGn) {
                ((XGn) xe6).Dkd(str, map);
            }
        }
    }

    @Override // X.XGn
    public final void DvI(C69684VtU c69684VtU) {
        for (XE6 xe6 : this.A00) {
            if (xe6 instanceof XGn) {
                ((XGn) xe6).DvI(c69684VtU);
            }
        }
    }

    @Override // X.XE6
    public final void onStart() {
        this.A01.set(false);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((XE6) it.next()).onStart();
        }
    }

    public WVI(Iterable iterable) {
        this.A00 = iterable;
    }
}
