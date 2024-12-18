package X;

/* renamed from: X.9b3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212349b3 extends AbstractC178657wd implements BEN {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public InterfaceC179447xu A06;
    public final InterfaceC175477rN A07;

    @Override // X.AbstractC178227vw
    public final void A09() {
        ((InterfaceC178737wl) ((AbstractC178657wd) this).A00.Aq0(InterfaceC178737wl.A00)).AAS(this.A07);
    }

    public final C179407xq A0C() {
        C179407xq A01;
        InterfaceC179447xu interfaceC179447xu = this.A06;
        if (interfaceC179447xu != null) {
            if (interfaceC179447xu instanceof C177107u6) {
                C14360o3.A0C(interfaceC179447xu, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.inputoutput.GlSurfaceTextureInput");
                A01 = ((C177107u6) interfaceC179447xu).FBE(this.A02, this.A01, this.A05, this.A03, this.A04, this.A00, 0, true);
            } else if (interfaceC179447xu instanceof AZ9) {
                C14360o3.A0C(interfaceC179447xu, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.inputoutput.GlBlankInput");
                A01 = ((AZ9) interfaceC179447xu).A01(this.A02, this.A01, 0);
            } else {
                throw AbstractC166987dD.A18("Input type not supported! For now, only GlSurfaceInput, GLBitmapinput, or GlBlankInput are supported");
            }
            C14360o3.A07(A01);
            return A01;
        }
        C14360o3.A0F("input");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return BEN.A00;
    }

    public C212349b3(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A01 = 720;
        this.A02 = 1280;
        this.A05 = 1080;
        this.A03 = 1920;
        this.A07 = new C23408AZh(this);
    }
}
