package X;

/* renamed from: X.AaW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23459AaW implements InterfaceC196578mn {
    public C196748n4 A00;
    public C196748n4 A01;
    public C196748n4 A02;
    public C196748n4 A03;
    public boolean A04;
    public final /* synthetic */ InterfaceC196578mn A05;
    public final /* synthetic */ C175407rG A06;

    @Override // X.InterfaceC196578mn
    public final /* synthetic */ void Dbk(float f) {
    }

    public C23459AaW(InterfaceC196578mn interfaceC196578mn, C175407rG c175407rG) {
        this.A06 = c175407rG;
        this.A05 = interfaceC196578mn;
    }

    @Override // X.InterfaceC196578mn
    public final void D2R() {
        if (!this.A04) {
            this.A04 = true;
            this.A05.D2R();
        }
    }

    @Override // X.InterfaceC196578mn
    public final void DEF(Exception exc) {
        this.A05.DEF(exc);
    }

    @Override // X.InterfaceC196578mn
    public final void DYZ(C196748n4 c196748n4) {
        C196748n4 c196748n42;
        if (AbstractC166987dD.A0H(c196748n4.A03(C196748n4.A0K)) == this.A06.A00) {
            this.A02 = c196748n4;
        } else {
            this.A00 = c196748n4;
        }
        C196748n4 c196748n43 = this.A02;
        if (c196748n43 != null && (c196748n42 = this.A00) != null) {
            InterfaceC196578mn interfaceC196578mn = this.A05;
            C196738n3 c196738n3 = new C196738n3(c196748n43);
            c196738n3.A01(C196748n4.A0Q, c196748n42);
            interfaceC196578mn.DYZ(new C196748n4(c196738n3));
        }
    }

    @Override // X.InterfaceC196578mn
    public final void Dtw(C196748n4 c196748n4) {
        C196748n4 c196748n42;
        if (AbstractC166987dD.A0H(c196748n4.A03(C196748n4.A0K)) == this.A06.A00) {
            this.A03 = c196748n4;
        } else {
            this.A01 = c196748n4;
        }
        C196748n4 c196748n43 = this.A03;
        if (c196748n43 != null && (c196748n42 = this.A01) != null) {
            InterfaceC196578mn interfaceC196578mn = this.A05;
            C196738n3 c196738n3 = new C196738n3(c196748n43);
            c196738n3.A01(C196748n4.A0Q, c196748n42);
            interfaceC196578mn.Dtw(new C196748n4(c196738n3));
        }
    }
}
