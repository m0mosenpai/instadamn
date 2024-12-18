package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.GAb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36552GAb implements InterfaceC37138GXz {
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ G9Q A01;
    public final /* synthetic */ EKF A02;
    public final /* synthetic */ EnumC31713DwI A03;

    public C36552GAb(AutoCompleteTextView autoCompleteTextView, G9Q g9q, EKF ekf, EnumC31713DwI enumC31713DwI) {
        this.A02 = ekf;
        this.A00 = autoCompleteTextView;
        this.A03 = enumC31713DwI;
        this.A01 = g9q;
    }

    @Override // X.InterfaceC37138GXz
    public final void CuM(InterfaceC37225Gaa interfaceC37225Gaa) {
        AbstractC31171DnF.A14(this.A00);
        FP3 fp3 = FP3.A00;
        EKF ekf = this.A02;
        fp3.A00(ekf, ekf.A05, this.A01, interfaceC37225Gaa, new C36553GAc(this, 1), this.A03);
    }
}
