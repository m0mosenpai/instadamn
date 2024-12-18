package X;

import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* renamed from: X.AZi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23409AZi implements InterfaceC175477rN {
    public final /* synthetic */ IgLiteCameraProxy A00;

    public C23409AZi(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }

    @Override // X.InterfaceC175477rN
    public final void DX9(int i, int i2, int i3, int i4, boolean z) {
        AGA aga;
        float f;
        float f2;
        IgLiteCameraProxy igLiteCameraProxy = this.A00;
        float f3 = i / i2;
        C176877tj c176877tj = new C176877tj(i, i2);
        if (!c176877tj.equals(igLiteCameraProxy.A03)) {
            igLiteCameraProxy.A03 = c176877tj;
            IgLiteCameraProxy.A01(igLiteCameraProxy);
        }
        OXE oxe = OXE.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("onOutputSizeChanged width=");
        A1C.append(i);
        A1C.append(" height=");
        A1C.append(i2);
        A1C.append(" ratio=");
        A1C.append(f3);
        oxe.A00("IgLiteCameraProxy", A1C.toString());
        if (f3 >= 0.85d) {
            aga = igLiteCameraProxy.A0B;
            f = (i / 16) * 16;
            f2 = (i2 / 16) * 16;
        } else {
            aga = igLiteCameraProxy.A0B;
            f = 368.0f;
            f2 = 640.0f;
        }
        float f4 = f / f2;
        if (!Float.isNaN(f4) && aga.A00 != f4) {
            AGA.A00(aga, f4, aga.A01);
            aga.A00 = f4;
        }
    }
}
