package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EDh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32208EDh extends C40781ul implements InterfaceC168867gL {
    public List A00;

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
        return null;
    }

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

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        return false;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        List list = this.A00;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(it.next());
            }
        }
        return A1E;
    }
}
