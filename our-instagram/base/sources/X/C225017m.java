package X;

import java.util.Iterator;

/* renamed from: X.17m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225017m implements InterfaceC224417g {
    public final InterfaceC16660sJ A00;
    public final InterfaceC224417g A01;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new C225417q(this);
    }

    public C225017m(InterfaceC16660sJ interfaceC16660sJ, InterfaceC224417g interfaceC224417g) {
        this.A01 = interfaceC224417g;
        this.A00 = interfaceC16660sJ;
    }
}
