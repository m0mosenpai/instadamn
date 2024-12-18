package X;

import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* loaded from: classes4.dex */
public final class B8W extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8W(float f, boolean z, boolean z2) {
        super(1);
        this.A01 = z;
        this.A02 = z2;
        this.A00 = f;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgLiteCameraProxy igLiteCameraProxy;
        C52000Myq c52000Myq = (C52000Myq) obj;
        C14360o3.A0B(c52000Myq, 0);
        AbstractC52007Mz4 abstractC52007Mz4 = (AbstractC52007Mz4) c52000Myq.A0B.getValue();
        if ((abstractC52007Mz4 instanceof IgLiteCameraProxy) && (igLiteCameraProxy = (IgLiteCameraProxy) abstractC52007Mz4) != null) {
            boolean z = this.A01;
            boolean z2 = this.A02;
            float f = this.A00;
            if (z2) {
                C175007qa c175007qa = B2P.A00(igLiteCameraProxy).A00;
                if (c175007qa != null) {
                    c175007qa.A0B(new C212679ba(igLiteCameraProxy, f, z));
                }
            } else {
                IgLiteCameraProxy.A02(igLiteCameraProxy, f, z);
            }
        }
        return C0eB.A00;
    }
}
