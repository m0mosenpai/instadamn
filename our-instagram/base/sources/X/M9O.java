package X;

import java.util.Iterator;

/* loaded from: classes8.dex */
public final class M9O implements InterfaceC224417g {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC224417g A02;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new C50042M7f(this);
    }

    public M9O(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC224417g interfaceC224417g) {
        this.A02 = interfaceC224417g;
        this.A01 = interfaceC16660sJ;
        this.A00 = interfaceC16660sJ2;
    }
}
