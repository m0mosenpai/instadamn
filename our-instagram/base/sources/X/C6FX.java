package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6FX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FX {
    public final List A00 = new ArrayList();

    public final void A01(Object obj) {
        A03(obj, 0);
    }

    public final void A02(Object obj) {
        A03(obj, 1);
    }

    public final C6FW A00() {
        return new C6FW(this.A00);
    }

    public final void A03(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw new IllegalArgumentException("Arguments must be continuous");
    }
}
