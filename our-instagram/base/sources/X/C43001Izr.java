package X;

import java.util.Iterator;

/* renamed from: X.Izr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43001Izr implements C51G {
    public final int A00;
    public final Object A01;

    public C43001Izr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C51G
    public final void EDk(C3HZ c3hz) {
        if (this.A00 != 0) {
            c3hz.A00((C43006Izw) this.A01);
            return;
        }
        Iterator it = ((C43005Izv) this.A01).A01.iterator();
        while (it.hasNext()) {
            c3hz.A00((InterfaceC669630n) it.next());
        }
    }

    @Override // X.C51G
    public final void F9i(C3HZ c3hz) {
        if (this.A00 != 0) {
            c3hz.A01((C43006Izw) this.A01);
            return;
        }
        Iterator it = ((C43005Izv) this.A01).A01.iterator();
        while (it.hasNext()) {
            c3hz.A01((InterfaceC669630n) it.next());
        }
    }
}
