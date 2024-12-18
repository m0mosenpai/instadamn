package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EDj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32210EDj extends C40781ul implements InterfaceC168867gL {
    public C36439G5o A00;
    public C36440G5p A01;

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
        C36440G5p c36440G5p = this.A01;
        if (c36440G5p != null) {
            return c36440G5p.A02;
        }
        return false;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        C36440G5p c36440G5p = this.A01;
        if (c36440G5p != null) {
            return c36440G5p.A00;
        }
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        C36439G5o c36439G5o = this.A00;
        if (c36439G5o != null) {
            A1E.add(c36439G5o);
        }
        C36440G5p c36440G5p = this.A01;
        if (c36440G5p != null) {
            A1E.add(c36440G5p);
        }
        return A1E;
    }
}
