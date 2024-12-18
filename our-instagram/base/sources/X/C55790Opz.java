package X;

import java.nio.ByteBuffer;

/* renamed from: X.Opz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55790Opz implements InterfaceC58107PpW {
    public final /* synthetic */ C54845OMq A00;

    @Override // X.InterfaceC58107PpW
    public final void D5h(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        AbstractC195978lm.A02.A03("sup:LiveMediaStreamController", "Video Codec Received");
        this.A00.A0I = byteBuffer;
    }

    public C55790Opz(C54845OMq c54845OMq) {
        this.A00 = c54845OMq;
    }

    @Override // X.InterfaceC58107PpW
    public final void DIL(InterfaceC57803PkV interfaceC57803PkV) {
        C51770Mua c51770Mua;
        if ((interfaceC57803PkV instanceof C51770Mua) && (c51770Mua = (C51770Mua) interfaceC57803PkV) != null) {
            C54845OMq c54845OMq = this.A00;
            AbstractC195978lm.A02.A03("sup:LiveMediaStreamController", AnonymousClass001.A0Q("Video frame data received at ", c51770Mua.A04));
            c54845OMq.A01 = c51770Mua.A01;
            c54845OMq.A02 = c51770Mua.A02;
            c54845OMq.A03 = c51770Mua.A03;
        }
    }

    @Override // X.InterfaceC58107PpW
    public final void Dxc(InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC195978lm.A02.A01("sup:LiveMediaStreamController", "Video user action callback received");
    }
}
