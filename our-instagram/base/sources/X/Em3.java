package X;

import android.text.Editable;
import android.text.TextUtils;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* loaded from: classes6.dex */
public final class Em3 extends WKa {
    public final /* synthetic */ EnumC33365Eoy A00;
    public final /* synthetic */ InterfaceC37212GaN A01;
    public final /* synthetic */ EditPhoneNumberView A02;

    public Em3(EnumC33365Eoy enumC33365Eoy, InterfaceC37212GaN interfaceC37212GaN, EditPhoneNumberView editPhoneNumberView) {
        this.A02 = editPhoneNumberView;
        this.A00 = enumC33365Eoy;
        this.A01 = interfaceC37212GaN;
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EnumC33365Eoy enumC33365Eoy = this.A00;
        if (enumC33365Eoy == EnumC33365Eoy.A04 || enumC33365Eoy == EnumC33365Eoy.A07) {
            this.A02.A02.setVisibility(AbstractC31175DnJ.A01(TextUtils.isEmpty(editable.toString()) ? 1 : 0));
        }
        InterfaceC37212GaN interfaceC37212GaN = this.A01;
        interfaceC37212GaN.Dx4();
        interfaceC37212GaN.DyV();
    }
}
