package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EDi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32209EDi extends C40781ul implements InterfaceC168867gL {
    public C32215EDo A00;
    public List A01 = C16930sl.A00;

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final Integer BmK() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List Bri() {
        return null;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
        C32215EDo c32215EDo = this.A00;
        if (c32215EDo != null) {
            return c32215EDo.A00;
        }
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        C32215EDo c32215EDo = this.A00;
        if (c32215EDo != null) {
            return c32215EDo.A02;
        }
        return false;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A1E.add(it.next());
        }
        C32215EDo c32215EDo = this.A00;
        if (c32215EDo != null) {
            A1E.add(c32215EDo);
        }
        return A1E;
    }
}
