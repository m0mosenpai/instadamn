package X;

import android.view.MotionEvent;

/* renamed from: X.Lls, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49004Lls implements C7Q6 {
    public final Object A00;

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        InterfaceC165837bB interfaceC165837bB;
        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj;
        C14360o3.A0B(interfaceC129525tH, 0);
        Object obj3 = this.A00;
        if ((obj3 instanceof InterfaceC165837bB) && (interfaceC165837bB = (InterfaceC165837bB) obj3) != null) {
            interfaceC165837bB.FCb(interfaceC129525tH.BSy().A01);
            return true;
        }
        return false;
    }

    public C49004Lls(Object obj) {
        this.A00 = obj;
    }
}
