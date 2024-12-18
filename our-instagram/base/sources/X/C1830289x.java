package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.89x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1830289x implements InterfaceC1830389y {
    public float A00;
    public float A02;
    public float A03;
    public final List A04 = new ArrayList();
    public float A01 = 1.0f;

    private final void A00() {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((InterfaceC1830389y) it.next()).DvK(this.A01, this.A00, this.A02, this.A03);
        }
    }

    public final void A01(InterfaceC1830389y interfaceC1830389y) {
        List list = this.A04;
        if (!list.contains(interfaceC1830389y)) {
            list.add(interfaceC1830389y);
            A00();
        }
    }

    @Override // X.InterfaceC1830389y
    public final void DvK(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = f3;
        this.A03 = f4;
        A00();
    }
}
