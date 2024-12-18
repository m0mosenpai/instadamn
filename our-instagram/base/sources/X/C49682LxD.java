package X;

/* renamed from: X.LxD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49682LxD implements C4AF {
    public final int A00;
    public final Object A01;

    public C49682LxD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C4AF
    public final /* synthetic */ void DzR() {
    }

    @Override // X.C4AF
    public final void DzS(boolean z) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C69650Vsr c69650Vsr = (C69650Vsr) this.A01;
                c69650Vsr.A08.remove(this);
                c69650Vsr.A00();
                return;
            default:
                YQT yqt = (YQT) this.A01;
                if (yqt != null) {
                    yqt.CjX(AnonymousClass001.A1D("audio prefetch canceled; foundAndRemoved = ", z));
                    return;
                }
                return;
        }
    }

    @Override // X.C4AF
    public final void DzT(boolean z) {
        switch (this.A00) {
            case 0:
                C43931Jbg c43931Jbg = (C43931Jbg) this.A01;
                if (!equals(c43931Jbg.A02)) {
                    return;
                }
                c43931Jbg.A00 = null;
                InterfaceC50476MQe interfaceC50476MQe = c43931Jbg.A01;
                if (z) {
                    if (interfaceC50476MQe != null) {
                        interfaceC50476MQe.DS0();
                    }
                } else if (interfaceC50476MQe != null) {
                    interfaceC50476MQe.DRV();
                }
                c43931Jbg.A02 = null;
                return;
            case 1:
                C69650Vsr c69650Vsr = (C69650Vsr) this.A01;
                c69650Vsr.A08.remove(this);
                c69650Vsr.A00();
                return;
            default:
                YQT yqt = (YQT) this.A01;
                if (z) {
                    if (yqt != null) {
                        yqt.CjZ();
                        return;
                    }
                    return;
                } else {
                    if (yqt == null) {
                        return;
                    }
                    yqt.CjX("audio prefetch failure");
                    return;
                }
        }
    }
}
