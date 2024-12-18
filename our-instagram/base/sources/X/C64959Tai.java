package X;

import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;

/* renamed from: X.Tai, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64959Tai extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64959Tai(Object obj, Object obj2, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = i;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            super/*X.1CN*/.CmD(this.A04, (C09530e4) this.A02, this.A01);
        } else {
            Wap A0H = AbstractC43592JPx.A0H();
            AddressTypeaheadController addressTypeaheadController = (AddressTypeaheadController) this.A03;
            A0H.A0P(addressTypeaheadController.A07, "address_suggestion", AbstractC167007dF.A0A(this.A04), this.A01);
            addressTypeaheadController.A09.invoke(this.A02);
        }
        return C0eB.A00;
    }
}
