package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EDo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32215EDo extends C40781ul implements InterfaceC168867gL, InterfaceC37096GWf {
    public String A00;
    public List A01 = C16930sl.A00;
    public boolean A02;

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
        return this.A00;
    }

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        return this.A02;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A1E.add(new E9M(AbstractC25226BEj.A15(it)));
        }
        return A1E;
    }
}
