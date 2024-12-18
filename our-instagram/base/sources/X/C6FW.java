package X;

import java.util.List;

/* renamed from: X.6FW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FW {
    public static final C6FW A01 = new C6FW(new C6FX().A00);
    public final List A00;

    public final Object A00() {
        return A03(2);
    }

    public final Object A01() {
        return A03(0);
    }

    public final Object A02() {
        return A03(1);
    }

    public final Object A03(int i) {
        Object obj = this.A00.get(i);
        obj.getClass();
        return obj;
    }

    public C6FW(List list) {
        this.A00 = list;
    }
}
