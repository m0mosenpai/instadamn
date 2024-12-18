package X;

/* renamed from: X.Cs6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29079Cs6 implements C2JL {
    public boolean A00;
    public final /* synthetic */ InterfaceC24901Jp A01;

    @Override // X.C2JL
    public final synchronized void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        if (!this.A00) {
            this.A00 = true;
            InterfaceC24901Jp interfaceC24901Jp = this.A01;
            C194848jk c194848jk = new C194848jk(new C27328C4j(th));
            if (interfaceC24901Jp != null) {
                AbstractC25231BEo.A1G(c194848jk, interfaceC24901Jp);
            }
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                if (obj != null) {
                    InterfaceC24901Jp interfaceC24901Jp = this.A01;
                    C3NX A0z = AbstractC25225BEi.A0z(obj);
                    if (interfaceC24901Jp != null) {
                        AbstractC25231BEo.A1G(A0z, interfaceC24901Jp);
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    public C29079Cs6(InterfaceC24901Jp interfaceC24901Jp) {
        this.A01 = interfaceC24901Jp;
    }

    public C29079Cs6() {
    }
}
