package X;

import java.util.Iterator;

/* renamed from: X.Gf6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37488Gf6 implements InterfaceC224417g {
    public final InterfaceC16660sJ A00;
    public final InterfaceC224417g A01;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new XN4(this.A01.iterator(), this.A00);
    }

    public C37488Gf6(InterfaceC16660sJ interfaceC16660sJ, InterfaceC224417g interfaceC224417g) {
        this.A01 = interfaceC224417g;
        this.A00 = interfaceC16660sJ;
    }
}
