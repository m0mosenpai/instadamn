package X;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class J2L implements InterfaceC43457JHv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C101274gj A01;
    public final /* synthetic */ C41589Iac A02;
    public final /* synthetic */ ArrayList A03;

    public J2L(C101274gj c101274gj, C41589Iac c41589Iac, ArrayList arrayList, int i) {
        this.A02 = c41589Iac;
        this.A01 = c101274gj;
        this.A00 = i;
        this.A03 = arrayList;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3o() {
        C41589Iac c41589Iac = this.A02;
        C101274gj c101274gj = this.A01;
        int i = this.A00;
        ArrayList arrayList = this.A03;
        C82713mZ A00 = C41589Iac.A00(c101274gj, c41589Iac, i);
        C14360o3.A0B(arrayList, 0);
        A00.A7c = arrayList;
        A00.A14 = Boolean.valueOf(AbstractC37302Gc3.A0Q(c41589Iac.A00).A03(c101274gj.getId()));
        return new C82753md(A00);
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3p() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 BrL() {
        return null;
    }
}
