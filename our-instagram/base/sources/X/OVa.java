package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class OVa {
    public final /* synthetic */ InterfaceC24901Jp A00;
    public final /* synthetic */ boolean A01;

    public final void A00(Object obj, List list) {
        InterfaceC24901Jp interfaceC24901Jp = this.A00;
        Object obj2 = null;
        Object obj3 = obj;
        if (this.A01) {
            obj3 = null;
            obj2 = obj;
        }
        interfaceC24901Jp.resumeWith(new OJ9(obj3, obj2, list, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    public OVa() {
    }

    public OVa(InterfaceC24901Jp interfaceC24901Jp, boolean z) {
        this.A00 = interfaceC24901Jp;
        this.A01 = z;
    }
}
