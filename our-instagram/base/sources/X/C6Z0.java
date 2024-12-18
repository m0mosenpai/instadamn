package X;

import java.util.UUID;

/* renamed from: X.6Z0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Z0 {
    public String A00;
    public String A01;
    public final InterfaceC16820sZ A02;

    public final void A01() {
        String str = this.A01;
        if (str != null && str.length() != 0) {
            this.A02.invoke();
            this.A01 = null;
        }
    }

    public final void A02() {
        String str = this.A01;
        if (str != null && str.length() != 0) {
            A01();
        }
        this.A01 = UUID.randomUUID().toString();
    }

    public C6Z0(InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
    }

    public final void A00() {
        A01();
        this.A00 = null;
    }
}
