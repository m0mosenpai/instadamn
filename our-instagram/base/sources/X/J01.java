package X;

import java.util.Iterator;

/* loaded from: classes7.dex */
public final class J01 implements InterfaceC673231x {
    public final int A00;
    public final Object A01;

    public static Object A00(J01 j01, Object obj) {
        C14360o3.A0B(obj, 0);
        return j01.A01;
    }

    public J01(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC673231x
    public final void ABh(C59072n8 c59072n8) {
        InterfaceC43071ya interfaceC43071ya;
        switch (this.A00) {
            case 0:
                interfaceC43071ya = (AbstractC43007Izx) A00(this, c59072n8);
                c59072n8.A00(interfaceC43071ya);
                return;
            case 1:
                Iterator it = ((C43005Izv) A00(this, c59072n8)).A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673231x) it.next()).ABh(c59072n8);
                }
                return;
            default:
                interfaceC43071ya = (C43006Izw) A00(this, c59072n8);
                c59072n8.A00(interfaceC43071ya);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC673231x
    public final void ABj(C59072n8 c59072n8) {
        InterfaceC43071ya interfaceC43071ya;
        switch (this.A00) {
            case 0:
                interfaceC43071ya = (AbstractC43007Izx) A00(this, c59072n8);
                c59072n8.A00(interfaceC43071ya);
                return;
            case 1:
                Iterator it = ((C43005Izv) A00(this, c59072n8)).A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673231x) it.next()).ABj(c59072n8);
                }
                return;
            default:
                interfaceC43071ya = (C43006Izw) A00(this, c59072n8);
                c59072n8.A00(interfaceC43071ya);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC673231x
    public final void ABm(C59072n8 c59072n8) {
        InterfaceC43071ya interfaceC43071ya;
        switch (this.A00) {
            case 0:
                interfaceC43071ya = (AbstractC43007Izx) A00(this, c59072n8);
                c59072n8.A00(interfaceC43071ya);
                return;
            case 1:
                Iterator it = ((C43005Izv) A00(this, c59072n8)).A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673231x) it.next()).ABm(c59072n8);
                }
                return;
            default:
                interfaceC43071ya = (C43006Izw) A00(this, c59072n8);
                c59072n8.A00(interfaceC43071ya);
                return;
        }
    }
}
