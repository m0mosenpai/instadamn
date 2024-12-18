package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52362ab {
    public int A00;
    public final List A01;
    public final InterfaceC52252aQ A02;
    public final Map A03;

    public C52362ab(InterfaceC52252aQ interfaceC52252aQ, Map map) {
        C14360o3.A0B(map, 2);
        this.A02 = interfaceC52252aQ;
        this.A03 = map;
        this.A01 = new ArrayList();
    }

    public final void A00(InterfaceC16660sJ interfaceC16660sJ) {
        C52382ad c52382ad = new C52382ad(this.A02, "control", this.A03);
        interfaceC16660sJ.invoke(c52382ad);
        this.A01.add(c52382ad.A00());
    }

    public final void A01(InterfaceC16660sJ interfaceC16660sJ) {
        int i = this.A00 + 1;
        this.A00 = i;
        C52382ad c52382ad = new C52382ad(this.A02, AnonymousClass001.A0O("test_", i), this.A03);
        interfaceC16660sJ.invoke(c52382ad);
        this.A01.add(c52382ad.A00());
    }
}
