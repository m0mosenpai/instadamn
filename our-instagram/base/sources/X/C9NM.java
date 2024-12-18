package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;

/* renamed from: X.9NM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NM extends AbstractC179807yU implements C9PE {
    public InterfaceC178817wt A00;
    public FilterModel A01;
    public InterfaceC199408rh A02;
    public final C199438rk A03;

    @Override // X.AbstractC178227vw
    public final void A09() {
        C178087vh c178087vh = InterfaceC178817wt.A01;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179807yU) this).A00;
        this.A00 = (InterfaceC178817wt) interfaceC178207vu.Aq0(c178087vh);
        this.A02 = (InterfaceC199408rh) interfaceC178207vu.Aq0(InterfaceC199408rh.A00);
        this.A00.BQq().EWA(this.A03, 1011);
    }

    @Override // X.InterfaceC179817yV
    public final C179837yX BKZ() {
        return C9PE.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8rk, java.lang.Object] */
    public C9NM(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A03 = new Object();
    }
}
