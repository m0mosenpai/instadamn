package X;

/* renamed from: X.XNm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72092XNm extends AbstractC42051wv {
    public RunnableC72099XNt A00;
    public final int A01 = 1;
    public final AbstractC150996r0 A02;
    public final C6DA A03;

    public C72092XNm(AbstractC150996r0 abstractC150996r0, C6DA c6da) {
        this.A03 = c6da;
        this.A02 = abstractC150996r0;
    }

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        RunnableC72099XNt runnableC72099XNt;
        boolean z;
        synchronized (this) {
            runnableC72099XNt = this.A00;
            if (runnableC72099XNt == null) {
                runnableC72099XNt = new RunnableC72099XNt(this);
                this.A00 = runnableC72099XNt;
            }
            long j = runnableC72099XNt.A00 + 1;
            runnableC72099XNt.A00 = j;
            z = true;
            if (!runnableC72099XNt.A01 && j == this.A01) {
                runnableC72099XNt.A01 = true;
            } else {
                z = false;
            }
        }
        C6DA c6da = this.A03;
        c6da.EpF(new XMV(interfaceC42071wx, runnableC72099XNt, this));
        if (z) {
            c6da.A03(runnableC72099XNt);
        }
    }

    public final void A03(RunnableC72099XNt runnableC72099XNt) {
        synchronized (this) {
            RunnableC72099XNt runnableC72099XNt2 = this.A00;
            if (runnableC72099XNt2 != null && runnableC72099XNt2 == runnableC72099XNt) {
                this.A00 = null;
            }
            long j = runnableC72099XNt.A00 - 1;
            runnableC72099XNt.A00 = j;
            if (j == 0) {
                InterfaceC42061ww interfaceC42061ww = this.A03;
                if (interfaceC42061ww instanceof InterfaceC41801wU) {
                    ((InterfaceC41801wU) interfaceC42061ww).dispose();
                } else if (interfaceC42061ww instanceof C6D9) {
                    C1EM.A00((InterfaceC41801wU) runnableC72099XNt.get(), null, ((C6D9) interfaceC42061ww).A03);
                }
            }
        }
    }

    public final void A04(RunnableC72099XNt runnableC72099XNt) {
        synchronized (this) {
            if (runnableC72099XNt.A00 == 0 && runnableC72099XNt == this.A00) {
                this.A00 = null;
                InterfaceC41801wU interfaceC41801wU = (InterfaceC41801wU) runnableC72099XNt.get();
                C6KP.A01(runnableC72099XNt);
                InterfaceC42061ww interfaceC42061ww = this.A03;
                if (interfaceC42061ww instanceof InterfaceC41801wU) {
                    ((InterfaceC41801wU) interfaceC42061ww).dispose();
                } else if (interfaceC42061ww instanceof C6D9) {
                    if (interfaceC41801wU == null) {
                        runnableC72099XNt.A02 = true;
                    } else {
                        C1EM.A00(interfaceC41801wU, null, ((C6D9) interfaceC42061ww).A03);
                    }
                }
            }
        }
    }
}
