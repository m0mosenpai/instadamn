package X;

/* renamed from: X.9Qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210019Qo extends AbstractC179687yI implements InterfaceC179747yO {
    public final InterfaceC178407wE A00;
    public volatile C175007qa A01;
    public volatile Integer A02;

    @Override // X.InterfaceC179747yO
    public final String C06() {
        return "";
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A01 = ((C178647wc) ((InterfaceC178667we) ((AbstractC179687yI) this).A00.Aq0(InterfaceC178667we.A00))).A02;
    }

    @Override // X.InterfaceC179607yA
    public final C175767rq BKU() {
        return InterfaceC179747yO.A00;
    }

    @Override // X.InterfaceC179747yO
    public final boolean Cbe() {
        C175007qa c175007qa = this.A01;
        if (c175007qa != null && c175007qa.A0N.Cbe()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC179747yO
    public final void EoA(AGu aGu, C23106AGs c23106AGs, C22912A8i c22912A8i) {
        AbstractC225239wm.A00(this.A00, "BasicVideoCaptureCoordinator", AbstractC166987dD.A0M(this));
        C175007qa c175007qa = this.A01;
        if (c175007qa != null) {
            Boolean bool = aGu.A00;
            if (bool != null) {
                c175007qa.A0N.ARf(bool.booleanValue());
            }
            c175007qa.A0E(new C23466Aad(this, c22912A8i, new boolean[]{false}), c23106AGs);
        }
    }

    @Override // X.InterfaceC179747yO
    public final void Eoo(Integer num) {
        Integer num2;
        InterfaceC178407wE interfaceC178407wE = this.A00;
        long A0M = AbstractC166987dD.A0M(this);
        C14360o3.A0B(interfaceC178407wE, 0);
        interfaceC178407wE.ClB("recording_stop_requested", "BasicVideoCaptureCoordinator", "", null, A0M);
        interfaceC178407wE.DEZ(19, "recording_stop_requested");
        if (num.intValue() != 0) {
            num2 = C05F.A01;
        } else {
            num2 = C05F.A00;
        }
        this.A02 = num2;
        C175007qa c175007qa = this.A01;
        if (c175007qa != null) {
            c175007qa.A06();
        }
    }

    public C210019Qo(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A02 = C05F.A0C;
        this.A00 = (InterfaceC178407wE) interfaceC178207vu.Aq1(InterfaceC178407wE.A00);
    }
}
