package X;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AZ8 implements InterfaceC179087xK {
    public C81H A00 = null;
    public InterfaceC180227zC A01;
    public final C180337zN A02;
    public final C178747wm A03;

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        InterfaceC180227zC interfaceC180227zC2 = this.A01;
        if (interfaceC180227zC2 != null && interfaceC180227zC2 != interfaceC180227zC) {
            this.A03.A00(EnumC200658u8.A0U);
        }
        this.A01 = interfaceC180227zC;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C81H c81h = this.A00;
        if (c81h != null) {
            c81h.A02();
            this.A00 = null;
        }
        this.A01 = null;
    }

    public AZ8(C178747wm c178747wm) {
        this.A03 = c178747wm;
        HashMap A1G = AbstractC166987dD.A1G();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1G.put("aPosition", new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        A1E.add("aPosition");
        A1G.put("aTexCoord", new C180327zM(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1E.add("aTexCoord");
        this.A02 = new C180337zN(A1E, A1G);
    }
}
