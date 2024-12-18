package X;

import java.util.List;

/* renamed from: X.7wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C178637wb {
    public final /* synthetic */ C178217vv A00;
    public final /* synthetic */ C178247vy A01;

    public /* synthetic */ C178637wb(C178217vv c178217vv, C178247vy c178247vy) {
        this.A01 = c178247vy;
        this.A00 = c178217vv;
    }

    public final void A00(InterfaceC178067vf interfaceC178067vf) {
        C178247vy c178247vy = this.A01;
        C178217vv c178217vv = this.A00;
        c178247vy.A01.put(interfaceC178067vf.BKV(), interfaceC178067vf);
        List list = c178217vv.A00;
        if (!list.contains(interfaceC178067vf)) {
            list.add(interfaceC178067vf);
        }
    }
}
