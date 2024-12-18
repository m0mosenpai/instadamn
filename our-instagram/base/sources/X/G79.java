package X;

/* loaded from: classes6.dex */
public final class G79 implements InterfaceC37210GaL {
    public final /* synthetic */ EnumC1579076z A00;
    public final /* synthetic */ EnumC33464Eqz A01;
    public final /* synthetic */ C18920wW A02;
    public final /* synthetic */ String A03;

    public G79(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, C18920wW c18920wW, String str) {
        this.A02 = c18920wW;
        this.A03 = str;
        this.A00 = enumC1579076z;
        this.A01 = enumC33464Eqz;
    }

    @Override // X.InterfaceC37210GaL
    public final void D9X() {
        C75R.A03(this.A02, this.A00, this.A01, "delete_group_option", this.A03);
    }

    @Override // X.InterfaceC37210GaL
    public final void DOi() {
        C75R.A03(this.A02, this.A00, this.A01, AbstractC111324zv.A00(4828), this.A03);
    }

    @Override // X.InterfaceC37210GaL
    public final void Dm8() {
        C18920wW c18920wW = this.A02;
        String str = this.A03;
        EnumC1579076z enumC1579076z = this.A00;
        EnumC33464Eqz enumC33464Eqz = this.A01;
        C14360o3.A0B(c18920wW, 0);
        C75R.A04(c18920wW, enumC1579076z, enumC33464Eqz, "impression", "restricted_accounts_in_group", str);
    }

    @Override // X.InterfaceC37210GaL
    public final void Doc() {
        C75R.A03(this.A02, this.A00, this.A01, "stay_in_group_option", this.A03);
    }

    @Override // X.InterfaceC37210GaL
    public final void onCancel() {
        C75R.A03(this.A02, this.A00, this.A01, "cancel_option", this.A03);
    }
}
