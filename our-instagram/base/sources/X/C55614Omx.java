package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;

/* renamed from: X.Omx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55614Omx implements InterfaceC150446pt {
    public final /* synthetic */ NU5 A00;

    @Override // X.InterfaceC150446pt
    public final void DYf(String str, int i) {
        PickerConfiguration pickerConfiguration;
        C51887MwV A00;
        C14360o3.A0B(str, 0);
        NU5 nu5 = this.A00;
        C51887MwV A002 = NU5.A00(nu5);
        PickerConfiguration pickerConfiguration2 = NU5.A00(nu5).A03;
        if (pickerConfiguration2 != null) {
            pickerConfiguration = new PickerConfiguration(i, pickerConfiguration2.mItems);
        } else {
            pickerConfiguration = null;
        }
        A00 = C51887MwV.A00(null, pickerConfiguration, null, null, null, null, A002, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -65537, false, false, false, false, false, false, false, false, false, false, false, false, false);
        NU5.A0A(nu5, A00);
    }

    @Override // X.InterfaceC150446pt
    public final void DYg(InterfaceC25157BBb interfaceC25157BBb, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, str, interfaceC25157BBb);
        NU5 nu5 = this.A00;
        nu5.A02 = interfaceC25157BBb;
        NU5.A0A(nu5, C51887MwV.A00(null, null, null, null, null, null, NU5.A00(nu5), null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -131073, false, false, false, A1R, false, false, false, false, false, false, false, false, false));
    }

    public C55614Omx(NU5 nu5) {
        this.A00 = nu5;
    }

    @Override // X.InterfaceC150446pt
    public final void DYe() {
        C51887MwV A00;
        NU5 nu5 = this.A00;
        A00 = C51887MwV.A00(null, null, null, null, null, null, NU5.A00(nu5), null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -131073, false, false, false, false, false, false, false, false, false, false, false, false, false);
        NU5.A0A(nu5, A00);
    }

    @Override // X.InterfaceC150446pt
    public final void DYd(PickerConfiguration pickerConfiguration, String str) {
        C51887MwV A00;
        AbstractC167017dG.A1N(str, pickerConfiguration);
        NU5 nu5 = this.A00;
        A00 = C51887MwV.A00(null, pickerConfiguration, null, null, null, null, NU5.A00(nu5), null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -65537, false, false, false, false, false, false, false, false, false, false, false, false, false);
        NU5.A0A(nu5, A00);
    }
}
