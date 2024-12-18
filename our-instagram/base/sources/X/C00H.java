package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.00H, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C00H {
    public InterfaceC16820sZ A00;
    public boolean A01;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public void A00() {
    }

    public abstract void A01();

    public void A02(AnonymousClass002 anonymousClass002) {
    }

    public void A03(AnonymousClass002 anonymousClass002) {
    }

    public final void A04(boolean z) {
        this.A01 = z;
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    public C00H(boolean z) {
        this.A01 = z;
    }
}
