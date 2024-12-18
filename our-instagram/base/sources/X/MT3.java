package X;

import com.instagram.preferences.common.datastore.IgDatastoreEditor;

/* loaded from: classes9.dex */
public final class MT3 implements InterfaceC100484fC {
    public final InterfaceC58011Pnv A00;
    public final String A01;

    public MT3(InterfaceC58011Pnv interfaceC58011Pnv, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = interfaceC58011Pnv;
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP BP4(String str, long j) {
        C14360o3.A0B(str, 0);
        return new MT4(A00(this, str), 1, j);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP C2m(String str, String str2) {
        C14360o3.A0B(str, 0);
        return new C50591MVc(str2, A00(this, str), 1);
    }

    public static C31199Dni A00(MT3 mt3, String str) {
        return new C31199Dni(25, new MT1(str), mt3.A00.Ave());
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP AJg(String str) {
        return new M9S(this.A00.Ave(), 20);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC105054oL ARC() {
        return new IgDatastoreEditor(this.A00, C12L.A00);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP Aaz() {
        C53402Njr c53402Njr = new C53402Njr();
        return new C16360rh(new C57180Pa9(this, c53402Njr, null, 2), new M9S(this.A00.Ave(), 22));
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP Ah9(String str, boolean z) {
        return new PVD(A00(this, str), z);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP BIg(String str, int i) {
        return new M9S(A00(this, str), 21);
    }
}
