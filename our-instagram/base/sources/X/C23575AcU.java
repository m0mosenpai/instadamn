package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.AcU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23575AcU implements C83L {
    public final int A00;
    public final Object A01;

    public C23575AcU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C83L
    public final void DD2(CameraAREffect cameraAREffect, boolean z, boolean z2) {
        switch (this.A00) {
            case 0:
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                String str = cameraAREffect.A0K;
                C14360o3.A07(str);
                AbstractC129685tX.A00(new A55(str), interfaceC24741Ir);
                return;
            case 1:
                InterfaceC24741Ir interfaceC24741Ir2 = (InterfaceC24741Ir) this.A01;
                String str2 = cameraAREffect.A0K;
                C14360o3.A07(str2);
                AbstractC129685tX.A00(new A55(str2), interfaceC24741Ir2);
                interfaceC24741Ir2.AID(null);
                return;
            case 2:
                ((Ah1) this.A01).A09.A00();
                C006802i.A0p.markerEnd(181540910, (short) 2);
                return;
            default:
                C9NA c9na = (C9NA) this.A01;
                C9N2 c9n2 = C9NA.A0X;
                AAY aay = c9na.A0K;
                if (aay != null) {
                    aay.A05.A0G.remove(this);
                    return;
                }
                return;
        }
    }
}
