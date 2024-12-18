package X;

import java.lang.ref.WeakReference;

/* renamed from: X.BLj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25392BLj implements C39H {
    public InterfaceC16660sJ A00;

    @Override // X.C39H
    public final void DWK(EnumC85043qs enumC85043qs, C38321qM c38321qM, Integer num, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167027dH.A0a(0, weakReference, c38321qM, enumC85043qs, interfaceC16820sZ);
        C14360o3.A0B(interfaceC16660sJ, 5);
        if (num != null && num != C05F.A00) {
            interfaceC16820sZ.invoke();
            return;
        }
        C26082BgB c26082BgB = new C26082BgB(enumC85043qs, c38321qM, num, weakReference, interfaceC16660sJ);
        InterfaceC16660sJ interfaceC16660sJ2 = this.A00;
        if (interfaceC16660sJ2 == null) {
            return;
        }
        interfaceC16660sJ2.invoke(c26082BgB);
    }

    @Override // X.C39H
    public final void EXO(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }
}
