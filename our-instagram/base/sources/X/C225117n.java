package X;

import java.util.Iterator;

/* renamed from: X.17n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225117n implements InterfaceC224417g {
    public final InterfaceC16660sJ A00;
    public final InterfaceC224417g A01;
    public final boolean A02;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new C225317p(this);
    }

    public C225117n(InterfaceC16660sJ interfaceC16660sJ, InterfaceC224417g interfaceC224417g, boolean z) {
        this.A01 = interfaceC224417g;
        this.A02 = z;
        this.A00 = interfaceC16660sJ;
    }
}
