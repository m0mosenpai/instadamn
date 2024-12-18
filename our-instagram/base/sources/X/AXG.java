package X;

import com.facebook.cameracore.util.Reference;

/* loaded from: classes4.dex */
public final class AXG implements InterfaceC179337xj {
    public final /* synthetic */ Reference A00;
    public final /* synthetic */ AXC A01;

    public AXG(Reference reference, AXC axc) {
        this.A01 = axc;
        this.A00 = reference;
    }

    @Override // X.InterfaceC179337xj
    public final void DeY(AXC axc, Object obj) {
        this.A00.release();
    }
}
