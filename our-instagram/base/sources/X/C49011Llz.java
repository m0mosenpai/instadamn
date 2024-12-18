package X;

import android.view.MotionEvent;

/* renamed from: X.Llz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49011Llz implements C7Q6 {
    public final /* synthetic */ InterfaceC164977Zm A00;

    public C49011Llz(InterfaceC164977Zm interfaceC164977Zm) {
        this.A00 = interfaceC164977Zm;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KTK ktk = (KTK) obj;
        boolean A1R = AbstractC167007dF.A1R(0, ktk, obj2);
        C7QY c7qy = ktk.A02;
        C9C9 c9c9 = c7qy.A08;
        String str = c9c9.A01;
        if (str.length() > 0) {
            ((InterfaceC164887Zb) this.A00).Cs7(null, null, null, c7qy.A0L, null, Long.valueOf(c7qy.BT8()), null, str, c9c9.A00, null, null, null, null, null, null, null, null, null, null, null, A1R ? 1 : 0, false);
            return true;
        }
        return false;
    }
}
