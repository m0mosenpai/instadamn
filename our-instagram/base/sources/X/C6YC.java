package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6YC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YC implements InterfaceC669530m {
    public InterfaceC669530m A00;
    public InterfaceC669530m A01;
    public final List A02;

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        boolean z;
        C14360o3.A0B(interfaceC670130s, 0);
        C14360o3.A0B(interfaceC669830p, 1);
        C14360o3.A0B(anonymousClass320, 2);
        List list = this.A02;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                InterfaceC669530m interfaceC669530m = (InterfaceC669530m) it.next();
                if (interfaceC669530m.A7S(anonymousClass320, interfaceC669830p, interfaceC670130s)) {
                    this.A01 = interfaceC669530m;
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        InterfaceC669530m interfaceC669530m2 = this.A00;
        if (z && interfaceC669530m2 != null) {
            interfaceC669530m2.A7S(anonymousClass320, interfaceC669830p, interfaceC670130s);
            list.add(interfaceC669530m2);
        }
        return z;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
        C14360o3.A0B(anonymousClass320, 0);
        C14360o3.A0B(enumC37671p4, 2);
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        interfaceC669530m.CoL(anonymousClass320, enumC37671p4, z);
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        C14360o3.A0B(anonymousClass320, 1);
        C14360o3.A0B(enumC37671p4, 3);
        CoL(anonymousClass320, enumC37671p4, z);
    }

    @Override // X.InterfaceC669530m
    public final boolean AFs() {
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        return interfaceC669530m.AFs();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        return interfaceC669530m.BX5();
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        return interfaceC669530m.Bg5();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return new HashSet();
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        return interfaceC669530m.CUl();
    }

    @Override // X.InterfaceC669530m
    public final void Cnx(boolean z) {
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        interfaceC669530m.Cnx(z);
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        interfaceC669530m.Co5();
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
        InterfaceC669530m interfaceC669530m = this.A01;
        if (interfaceC669530m != null) {
            interfaceC669530m.CoN(i);
        }
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        InterfaceC669530m interfaceC669530m = this.A00;
        if (interfaceC669530m != null) {
            interfaceC669530m.D7a(i, i2);
        }
        InterfaceC669530m interfaceC669530m2 = this.A01;
        C14360o3.A0A(interfaceC669530m2);
        return interfaceC669530m2.D7a(i, i2);
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
        InterfaceC669530m interfaceC669530m = this.A01;
        C14360o3.A0A(interfaceC669530m);
        interfaceC669530m.Dtv(i);
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC669530m) it.next()).deactivate();
        }
    }

    public C6YC(List list) {
        this.A02 = list;
    }
}
