package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.AaT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23456AaT implements InterfaceC73604YNj {
    public final /* synthetic */ C175507rQ A00;

    public C23456AaT(C175507rQ c175507rQ) {
        this.A00 = c175507rQ;
    }

    @Override // X.InterfaceC73604YNj
    public final void CxA(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null && surfaceTexture.getTimestamp() == 0) {
            InterfaceC176367st interfaceC176367st = this.A00.A01;
            interfaceC176367st.getClass();
            interfaceC176367st.update();
        } else {
            InterfaceC1809280u interfaceC1809280u = this.A00.A06;
            if (interfaceC1809280u == null) {
                return;
            }
            interfaceC1809280u.DIE();
        }
    }
}
