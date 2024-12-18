package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0aL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07460aL extends AbstractC19330xH {
    public InterfaceC11360iu A00;
    public final Object A01 = new Object();
    public final List A03 = new ArrayList();
    public final List A02 = new ArrayList();

    @Override // X.InterfaceC11360iu
    public final String Bd9() {
        return null;
    }

    @Override // X.InterfaceC11360iu
    public final String BdA() {
        return null;
    }

    @Override // X.InterfaceC11360iu
    public final boolean CU0(C19280xC c19280xC) {
        return true;
    }

    @Override // X.InterfaceC11360iu
    public final void EHW(C19280xC c19280xC) {
        C14360o3.A0B(c19280xC, 0);
        List list = this.A02;
        InterfaceC11360iu interfaceC11360iu = this.A00;
        if (interfaceC11360iu == null) {
            synchronized (this.A01) {
                interfaceC11360iu = this.A00;
                if (interfaceC11360iu == null) {
                    list.add(c19280xC);
                    interfaceC11360iu = null;
                }
            }
            if (interfaceC11360iu == null) {
                return;
            }
        }
        interfaceC11360iu.EHW(c19280xC);
    }

    @Override // X.InterfaceC11360iu
    public final void EIu(C19280xC c19280xC) {
        C14360o3.A0B(c19280xC, 0);
        List list = this.A03;
        InterfaceC11360iu interfaceC11360iu = this.A00;
        if (interfaceC11360iu == null) {
            synchronized (this.A01) {
                interfaceC11360iu = this.A00;
                if (interfaceC11360iu == null) {
                    list.add(c19280xC);
                    interfaceC11360iu = null;
                }
            }
            if (interfaceC11360iu == null) {
                return;
            }
        }
        interfaceC11360iu.EIu(c19280xC);
    }
}
