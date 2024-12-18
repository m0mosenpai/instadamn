package X;

import android.view.KeyEvent;

/* renamed from: X.5Dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114315Dv extends C58J implements InterfaceC114285Ds {
    public InterfaceC16660sJ A00;
    public InterfaceC16660sJ A01;

    @Override // X.InterfaceC114285Ds
    public final boolean DOF(KeyEvent keyEvent) {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            return ((Boolean) interfaceC16660sJ.invoke(new C69732VuS(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC114285Ds
    public final boolean Da7(KeyEvent keyEvent) {
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            return ((Boolean) interfaceC16660sJ.invoke(new C69732VuS(keyEvent))).booleanValue();
        }
        return false;
    }
}
