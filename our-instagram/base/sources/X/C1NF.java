package X;

import java.io.Serializable;

/* renamed from: X.1NF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NF {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final C1N8 A06;
    public final C1N8 A07;
    public final InterfaceC216113n A08;
    public final boolean A09;

    public C1NF(C1N8 c1n8, C1N8 c1n82, InterfaceC216113n interfaceC216113n, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        InterfaceC216113n c216213o;
        this.A09 = z;
        this.A05 = i;
        if (!(interfaceC216113n instanceof C216213o) && !(interfaceC216113n instanceof C1NG)) {
            if (interfaceC216113n instanceof Serializable) {
                c216213o = new C1NG(interfaceC216113n);
            } else {
                c216213o = new C216213o(interfaceC216113n);
            }
            interfaceC216113n = c216213o;
        }
        this.A08 = interfaceC216113n;
        this.A07 = c1n8;
        this.A04 = i2;
        this.A01 = z2;
        this.A02 = z3;
        this.A00 = i3;
        this.A06 = c1n82;
    }
}
