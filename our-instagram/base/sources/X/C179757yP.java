package X;

import java.util.List;

/* renamed from: X.7yP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C179757yP {
    public final /* synthetic */ C178217vv A00;
    public final /* synthetic */ C178247vy A01;

    public /* synthetic */ C179757yP(C178217vv c178217vv, C178247vy c178247vy) {
        this.A01 = c178247vy;
        this.A00 = c178217vv;
    }

    public final void A00(InterfaceC178627wa interfaceC178627wa) {
        C178247vy c178247vy = this.A01;
        C178217vv c178217vv = this.A00;
        c178247vy.A01.put(interfaceC178627wa.BKY(), interfaceC178627wa);
        List list = c178217vv.A00;
        if (!list.contains(interfaceC178627wa)) {
            list.add(interfaceC178627wa);
        }
    }
}
