package X;

/* loaded from: classes12.dex */
public final class XMY extends AbstractC42041wu implements InterfaceC42101x0 {
    public C133045zT A00;
    public boolean A01;
    public final AbstractC42041wu A02;
    public volatile boolean A03;

    public final void A03() {
        C133045zT c133045zT;
        while (true) {
            synchronized (this) {
                c133045zT = this.A00;
                if (c133045zT == null) {
                    this.A01 = false;
                    return;
                }
                this.A00 = null;
            }
            c133045zT.A00(this);
        }
    }

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        this.A02.EpF(interfaceC42071wx);
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    if (this.A01) {
                        C133045zT c133045zT = this.A00;
                        if (c133045zT == null) {
                            c133045zT = new C133045zT();
                            this.A00 = c133045zT;
                        }
                        c133045zT.A01(obj);
                    } else {
                        this.A01 = true;
                        this.A02.DVo(obj);
                        A03();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        boolean z = true;
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    if (this.A01) {
                        C133045zT c133045zT = this.A00;
                        if (c133045zT == null) {
                            c133045zT = new C133045zT();
                            this.A00 = c133045zT;
                        }
                        c133045zT.A01(new C133055zU(interfaceC41801wU));
                        return;
                    }
                    this.A01 = true;
                    z = false;
                }
                if (!z) {
                    this.A02.Dpc(interfaceC41801wU);
                    A03();
                    return;
                }
            }
        }
        interfaceC41801wU.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    this.A03 = true;
                    if (this.A01) {
                        C133045zT c133045zT = this.A00;
                        if (c133045zT == null) {
                            c133045zT = new C133045zT();
                            this.A00 = c133045zT;
                        }
                        c133045zT.A01(EnumC42671xv.A01);
                    } else {
                        this.A01 = true;
                        this.A02.onComplete();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (!this.A03) {
            synchronized (this) {
                boolean z = true;
                if (!this.A03) {
                    this.A03 = true;
                    if (this.A01) {
                        C133045zT c133045zT = this.A00;
                        if (c133045zT == null) {
                            c133045zT = new C133045zT();
                            this.A00 = c133045zT;
                        }
                        c133045zT.A02[0] = new C42741y2(th);
                        return;
                    }
                    this.A01 = true;
                    z = false;
                }
                if (!z) {
                    this.A02.onError(th);
                    return;
                }
            }
        }
        AbstractC142886co.A02(th);
    }

    @Override // X.InterfaceC42101x0, X.InterfaceC42111x1
    public final boolean test(Object obj) {
        return EnumC42671xv.A01(this.A02, obj);
    }

    public XMY(AbstractC42041wu abstractC42041wu) {
        this.A02 = abstractC42041wu;
    }
}
