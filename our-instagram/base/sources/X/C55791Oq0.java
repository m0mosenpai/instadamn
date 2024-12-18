package X;

import java.nio.ByteBuffer;

/* renamed from: X.Oq0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55791Oq0 implements InterfaceC58107PpW {
    public final /* synthetic */ C54845OMq A00;
    public final /* synthetic */ InterfaceC58107PpW A01;

    @Override // X.InterfaceC58107PpW
    public final void D5h(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        this.A01.D5h(byteBuffer);
        AbstractC195978lm.A02.A03("sup:LiveMediaStreamController", "Audio Codec Received");
        this.A00.A0H = byteBuffer;
    }

    public C55791Oq0(C54845OMq c54845OMq, InterfaceC58107PpW interfaceC58107PpW) {
        this.A01 = interfaceC58107PpW;
        this.A00 = c54845OMq;
    }

    @Override // X.InterfaceC58107PpW
    public final void DIL(InterfaceC57803PkV interfaceC57803PkV) {
        C51769MuZ c51769MuZ;
        this.A01.DIL(interfaceC57803PkV);
        C195988ln c195988ln = AbstractC195978lm.A02;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Audio frame data received at ");
        Long l = null;
        if ((interfaceC57803PkV instanceof C51769MuZ) && (c51769MuZ = (C51769MuZ) interfaceC57803PkV) != null) {
            l = Long.valueOf(c51769MuZ.A00);
        }
        c195988ln.A03("sup:LiveMediaStreamController", AbstractC166997dE.A0v(l, A1C));
    }

    @Override // X.InterfaceC58107PpW
    public final void Dxc(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01.Dxc(interfaceC16660sJ);
        AbstractC195978lm.A02.A01("sup:LiveMediaStreamController", "Audio user action callback received");
    }
}
