package X;

/* renamed from: X.4ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100204ei implements InterfaceC100084eW, InterfaceC10270gj {
    public C0TY A00;
    public C0TY A01;
    public C0TY A02;
    public final C0TX A03;

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "memory_red";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        if (sn2 instanceof QDM) {
            QDM qdm = (QDM) sn2;
            C0TY c0ty = this.A01;
            if (c0ty != null) {
                qdm.A06 = c0ty.name();
            }
            C0TY c0ty2 = this.A02;
            if (c0ty2 != null) {
                qdm.A0C = c0ty2.name();
            }
            C0TY c0ty3 = this.A00;
            if (c0ty3 != null) {
                qdm.A04 = c0ty3.name();
            }
        }
    }

    public C100204ei(C0TX c0tx) {
        this.A03 = c0tx;
        c0tx.A93(this);
    }

    @Override // X.InterfaceC18130ux
    public final void Cvs(C0TY c0ty) {
        this.A00 = c0ty;
    }

    @Override // X.InterfaceC18490vb
    public final void DO4(C0TY c0ty) {
        this.A01 = c0ty;
    }

    @Override // X.InterfaceC18530vf
    public final void Drh(C0TY c0ty) {
        this.A02 = c0ty;
    }
}
