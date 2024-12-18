package X;

import java.util.ArrayList;

/* renamed from: X.4EB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EB implements InterfaceC63562ud {
    @Override // X.InterfaceC63562ud
    public final InterfaceC82423m6 DSw(InterfaceC82423m6 interfaceC82423m6, InterfaceC16820sZ interfaceC16820sZ) {
        Object invoke = interfaceC16820sZ.invoke();
        if (interfaceC82423m6 == null) {
            return (InterfaceC82423m6) invoke;
        }
        InterfaceC82423m6 interfaceC82423m62 = (InterfaceC82423m6) invoke;
        if (interfaceC82423m62 == null) {
            return interfaceC82423m6;
        }
        InterfaceC82433m7 interfaceC82433m7 = (InterfaceC82433m7) interfaceC82423m6;
        if (!(interfaceC82423m62 instanceof InterfaceC82433m7)) {
            return interfaceC82433m7;
        }
        ArrayList arrayList = new ArrayList();
        interfaceC82433m7.AUC(arrayList);
        ((InterfaceC82433m7) interfaceC82423m62).AUC(arrayList);
        return new C42722IvH(arrayList);
    }
}
