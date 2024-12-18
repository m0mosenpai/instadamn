package X;

import java.lang.ref.SoftReference;

/* renamed from: X.8hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193418hM implements InterfaceC192208fL {
    public final InterfaceC16660sJ A00;
    public final C193428hN A01 = new C193428hN();

    @Override // X.InterfaceC192208fL
    public final C3R9 AXX(final InterfaceC16510rw interfaceC16510rw) {
        Object obj = this.A01.get(AbstractC53012bi.A00(interfaceC16510rw));
        C14360o3.A07(obj);
        C193448hP c193448hP = (C193448hP) obj;
        Object obj2 = c193448hP.reference.get();
        if (obj2 == null) {
            InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.8hR
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return new C192688gA((C3R9) this.A00.invoke(interfaceC16510rw));
                }
            };
            synchronized (c193448hP) {
                obj2 = c193448hP.reference.get();
                if (obj2 == null) {
                    obj2 = interfaceC16820sZ.invoke();
                    c193448hP.reference = new SoftReference(obj2);
                }
            }
        }
        return ((C192688gA) obj2).A00;
    }

    public C193418hM(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
