package X;

/* renamed from: X.5bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119925bq implements InterfaceC452826l, InterfaceC13000lm {
    public InterfaceC57946Pms A00;

    public final synchronized void A00() {
        this.A00 = null;
    }

    @Override // X.InterfaceC452826l
    public final void D1t(C1OW c1ow) {
    }

    @Override // X.InterfaceC452826l
    public final synchronized void D6x(C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        InterfaceC57946Pms interfaceC57946Pms = this.A00;
        if (interfaceC57946Pms != null) {
            interfaceC57946Pms.DTH(c1ow.A05, true, null);
        }
    }

    @Override // X.InterfaceC452826l
    public final void DB8(C1OW c1ow, String str, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final void DCa(C1OW c1ow) {
    }

    @Override // X.InterfaceC452826l
    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final synchronized void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
        String str;
        C14360o3.A0B(c1ow, 0);
        InterfaceC57946Pms interfaceC57946Pms = this.A00;
        if (interfaceC57946Pms != null) {
            String str2 = c1ow.A05;
            if (c114675Fx != null) {
                str = c114675Fx.A06;
            } else {
                str = null;
            }
            interfaceC57946Pms.DTH(str2, false, str);
        }
    }

    @Override // X.InterfaceC452826l
    public final synchronized void DUt(C19260xA c19260xA, C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        InterfaceC57946Pms interfaceC57946Pms = this.A00;
        if (interfaceC57946Pms != null) {
            interfaceC57946Pms.DTH(c1ow.A05, true, null);
        }
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void Da4(String str, String str2, String str3) {
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
    }

    @Override // X.InterfaceC452826l
    public final void DhF(C1OW c1ow, String str, boolean z) {
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A00 = null;
    }
}
