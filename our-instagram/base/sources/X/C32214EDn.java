package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.EDn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32214EDn extends C40781ul implements InterfaceC168867gL {
    public C38657Gyy A00;
    public Integer A01;
    public String A02;
    public String A03;
    public List A04;
    public List A05;
    public boolean A06;

    @Override // X.InterfaceC168867gL
    public final boolean CLI() {
        return false;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        return AbstractC166987dD.A1F(this.A05);
    }

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("filtered", Boolean.valueOf(this.A06));
        A1G.put("inform_module", this.A00);
        return A1G;
    }

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        return this.A02;
    }

    @Override // X.InterfaceC168867gL
    public final Integer BmK() {
        return this.A01;
    }

    @Override // X.InterfaceC168867gL
    public final String Bo9() {
        return this.A03;
    }

    @Override // X.InterfaceC168867gL
    public final List Bri() {
        return this.A04;
    }
}
