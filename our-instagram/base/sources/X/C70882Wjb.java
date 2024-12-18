package X;

/* renamed from: X.Wjb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70882Wjb implements XDl {
    public final /* synthetic */ EnumC68206VFy A00;
    public final /* synthetic */ C69445VnU A01;
    public final /* synthetic */ V1R A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C70882Wjb(EnumC68206VFy enumC68206VFy, C69445VnU c69445VnU, V1R v1r, boolean z, boolean z2) {
        this.A02 = v1r;
        this.A01 = c69445VnU;
        this.A00 = enumC68206VFy;
        this.A04 = z;
        this.A03 = z2;
    }

    @Override // X.XDl
    public final void D1m() {
        this.A02.getParentFragmentManager().A12();
    }

    @Override // X.XDl
    public final void D6w() {
        V1R v1r = this.A02;
        V1R.A02(this.A00, this.A01, v1r, this.A04, this.A03);
    }

    @Override // X.XDl
    public final void DAj() {
        C65823Tug c65823Tug = this.A02.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        C153156uj c153156uj = c65823Tug.A05;
        if (c153156uj != null) {
            c153156uj.A05 = true;
        }
    }

    @Override // X.XDl
    public final void Dlw() {
        C65823Tug c65823Tug = this.A02.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        C153156uj c153156uj = c65823Tug.A05;
        if (c153156uj != null) {
            c153156uj.A05 = false;
        }
    }
}
