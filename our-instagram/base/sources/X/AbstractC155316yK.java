package X;

import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: X.6yK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC155316yK extends C2UU {
    public final C65422xe mDiffer;
    public final InterfaceC155346yN mListener;

    public void onCurrentListChanged(List list, List list2) {
    }

    public List getCurrentList() {
        return this.mDiffer.A02;
    }

    public Object getItem(int i) {
        return this.mDiffer.A02.get(i);
    }

    public void submitList(List list) {
        this.mDiffer.A01(list, null);
    }

    public AbstractC155316yK(AbstractC65412xd abstractC65412xd) {
        InterfaceC155346yN interfaceC155346yN = new InterfaceC155346yN() { // from class: X.6yM
            @Override // X.InterfaceC155346yN
            public final void D8w(List list, List list2) {
                AbstractC155316yK.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = interfaceC155346yN;
        C65442xg c65442xg = new C65442xg(this);
        synchronized (AbstractC65462xi.A01) {
            if (AbstractC65462xi.A00 == null) {
                AbstractC65462xi.A00 = Executors.newFixedThreadPool(2);
            }
        }
        C65422xe c65422xe = new C65422xe(new C65472xj(abstractC65412xd, null, AbstractC65462xi.A00), c65442xg);
        this.mDiffer = c65422xe;
        c65422xe.A06.add(interfaceC155346yN);
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(25441074);
        int size = this.mDiffer.A02.size();
        C0f9.A0A(-1760296223, A03);
        return size;
    }

    public AbstractC155316yK(C65472xj c65472xj) {
        InterfaceC155346yN interfaceC155346yN = new InterfaceC155346yN() { // from class: X.6yM
            @Override // X.InterfaceC155346yN
            public final void D8w(List list, List list2) {
                AbstractC155316yK.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = interfaceC155346yN;
        C65422xe c65422xe = new C65422xe(c65472xj, new C65442xg(this));
        this.mDiffer = c65422xe;
        c65422xe.A06.add(interfaceC155346yN);
    }

    public void submitList(List list, Runnable runnable) {
        this.mDiffer.A01(list, runnable);
    }
}
