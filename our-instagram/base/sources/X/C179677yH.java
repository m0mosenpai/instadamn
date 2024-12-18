package X;

import java.util.List;

/* renamed from: X.7yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C179677yH {
    public final /* synthetic */ C178217vv A00;
    public final /* synthetic */ C178247vy A01;

    public /* synthetic */ C179677yH(C178217vv c178217vv, C178247vy c178247vy) {
        this.A01 = c178247vy;
        this.A00 = c178217vv;
    }

    public final void A00(InterfaceC179607yA interfaceC179607yA) {
        C178247vy c178247vy = this.A01;
        C178217vv c178217vv = this.A00;
        c178247vy.A01.put(interfaceC179607yA.BKU(), interfaceC179607yA);
        List list = c178217vv.A00;
        if (!list.contains(interfaceC179607yA)) {
            list.add(interfaceC179607yA);
        }
    }
}
