package X;

/* loaded from: classes12.dex */
public final class XML implements InterfaceC42071wx, InterfaceC41801wU {
    public InterfaceC41801wU A00;
    public C133045zT A01;
    public boolean A02;
    public final InterfaceC42071wx A03;
    public volatile boolean A04;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A04) {
            if (obj == null) {
                this.A00.dispose();
                onError(AbstractC166987dD.A15(AbstractC111324zv.A00(5016)));
                return;
            }
            synchronized (this) {
                if (!this.A04) {
                    if (this.A02) {
                        C133045zT c133045zT = this.A01;
                        if (c133045zT == null) {
                            c133045zT = new C133045zT();
                            this.A01 = c133045zT;
                        }
                        c133045zT.A01(obj);
                    } else {
                        this.A02 = true;
                        InterfaceC42071wx interfaceC42071wx = this.A03;
                        interfaceC42071wx.DVo(obj);
                        while (true) {
                            synchronized (this) {
                                C133045zT c133045zT2 = this.A01;
                                if (c133045zT2 == null) {
                                    this.A02 = false;
                                    return;
                                }
                                this.A01 = null;
                                Object[] objArr = c133045zT2.A02;
                                while (true) {
                                    int i = 0;
                                    if (objArr == null) {
                                        break;
                                    }
                                    do {
                                        Object[] objArr2 = objArr[i];
                                        if (objArr2 == null) {
                                            break;
                                        } else if (EnumC42671xv.A01(interfaceC42071wx, objArr2)) {
                                            return;
                                        } else {
                                            i++;
                                        }
                                        objArr = objArr[4];
                                    } while (i < 4);
                                    objArr = objArr[4];
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A00, interfaceC41801wU)) {
            this.A00 = interfaceC41801wU;
            this.A03.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A04) {
            synchronized (this) {
                if (!this.A04) {
                    if (this.A02) {
                        C133045zT c133045zT = this.A01;
                        if (c133045zT == null) {
                            c133045zT = new C133045zT();
                            this.A01 = c133045zT;
                        }
                        c133045zT.A01(EnumC42671xv.A01);
                    } else {
                        this.A04 = true;
                        this.A02 = true;
                        this.A03.onComplete();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (!this.A04) {
            synchronized (this) {
                boolean z = true;
                if (!this.A04) {
                    if (this.A02) {
                        this.A04 = true;
                        C133045zT c133045zT = this.A01;
                        if (c133045zT == null) {
                            c133045zT = new C133045zT();
                            this.A01 = c133045zT;
                        }
                        c133045zT.A02[0] = new C42741y2(th);
                        return;
                    }
                    this.A04 = true;
                    this.A02 = true;
                    z = false;
                }
                if (!z) {
                    this.A03.onError(th);
                    return;
                }
            }
        }
        AbstractC142886co.A02(th);
    }

    public XML(InterfaceC42071wx interfaceC42071wx) {
        this.A03 = interfaceC42071wx;
    }
}
