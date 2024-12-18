package X;

import java.util.List;

/* renamed from: X.8f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192088f9 implements InterfaceC192098fA {
    public InterfaceC192128fD A00;
    public final C8f5 A01;

    @Override // X.InterfaceC192098fA
    public final void A9b(InterfaceC192128fD interfaceC192128fD) {
        InterfaceC192128fD interfaceC192128fD2;
        final Object obj;
        synchronized (this) {
            interfaceC192128fD2 = this.A00;
            this.A00 = interfaceC192128fD;
        }
        if (interfaceC192128fD2 == null) {
            final C8f3 c8f3 = ((C8f4) this.A01).A00;
            synchronized (c8f3) {
                obj = c8f3.A00;
            }
            C1LV.A02("DataSynchronizer_sendInitial");
            try {
                AbstractC192138fE abstractC192138fE = (AbstractC192138fE) obj;
                if (abstractC192138fE != null) {
                    synchronized (this) {
                        InterfaceC192128fD interfaceC192128fD3 = this.A00;
                        if (interfaceC192128fD3 != null) {
                            interfaceC192128fD3.Dgh(abstractC192138fE);
                        }
                    }
                }
                C1LV.A01();
                InterfaceC192058f1 interfaceC192058f1 = c8f3.A02;
                if (interfaceC192058f1.CZZ()) {
                    C8f3.A00(this, c8f3, obj);
                } else {
                    interfaceC192058f1.E4t(new Runnable(this) { // from class: X.8fF
                        public final /* synthetic */ C192088f9 A00;

                        {
                            this.A00 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C8f3.A00(this.A00, c8f3, obj);
                        }
                    }, "DataSynchronizer_setDataObserver");
                }
            } catch (Throwable th) {
                C1LV.A01();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC192098fA
    public final void EFu(InterfaceC192128fD interfaceC192128fD) {
        synchronized (this) {
            if (this.A00 != interfaceC192128fD) {
                return;
            }
            this.A00 = null;
            final C8f3 c8f3 = ((C8f4) this.A01).A00;
            InterfaceC192058f1 interfaceC192058f1 = c8f3.A02;
            if (interfaceC192058f1.CZZ()) {
                List list = c8f3.A01;
                if (list != null) {
                    list.remove(this);
                    return;
                }
                return;
            }
            interfaceC192058f1.E4t(new Runnable(this) { // from class: X.9JN
                public final /* synthetic */ C192088f9 A00;

                {
                    this.A00 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C8f3 c8f32 = c8f3;
                    C192088f9 c192088f9 = this.A00;
                    List list2 = c8f32.A01;
                    if (list2 != null) {
                        list2.remove(c192088f9);
                    }
                }
            }, "DataSynchronizer_removeDataObserver");
        }
    }

    @Override // X.InterfaceC192098fA
    public final void ECn() {
        this.A01.A03(1);
    }

    @Override // X.InterfaceC192098fA
    public final void destroy() {
        this.A01.A02();
    }

    public C192088f9(C8f5 c8f5) {
        this.A01 = c8f5;
    }
}
