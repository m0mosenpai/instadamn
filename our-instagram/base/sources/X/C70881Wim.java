package X;

/* renamed from: X.Wim, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70881Wim implements MQV {
    public final /* synthetic */ InterfaceC71977XDk A00;
    public final /* synthetic */ C66487UJp A01;

    @Override // X.MQV
    public final void DmZ() {
    }

    public C70881Wim(InterfaceC71977XDk interfaceC71977XDk, C66487UJp c66487UJp) {
        this.A01 = c66487UJp;
        this.A00 = interfaceC71977XDk;
    }

    @Override // X.MQV
    public final void DJD() {
        C66487UJp c66487UJp = this.A01;
        if (c66487UJp.A02) {
            this.A00.DDb();
            c66487UJp.A02 = false;
        }
    }

    @Override // X.MQV
    public final void DQT() {
        InterfaceC71977XDk interfaceC71977XDk = this.A00;
        if (interfaceC71977XDk.CSk()) {
            C66487UJp c66487UJp = this.A01;
            if (!c66487UJp.A02) {
                c66487UJp.A02 = true;
                interfaceC71977XDk.Dnz(c66487UJp);
            }
        }
    }
}
