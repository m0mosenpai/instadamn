package X;

import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Efq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32984Efq extends EMQ implements InterfaceC60072op, GY6 {
    public static final String __redex_internal_original_name = "RegEmailVerifyFragment";
    public RegFlowExtras A00;
    public C35161Ff3 A01;

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        EnumC33445EqI enumC33445EqI = EnumC33445EqI.A07;
        if (enumC33445EqI != this.A00.A01()) {
            return EnumC33445EqI.A03;
        }
        return enumC33445EqI;
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        AbstractC35090Fd1.A00(this, (C07270a1) this.A02, this.A00, str);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A02, "sign_up_email_code_confirmation");
        return false;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A1U;
    }

    @Override // X.EMQ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer A02;
        int A022 = C0f9.A02(-1006103799);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        C18C.A07(bundle2, "Arguments in RegEmailVerifyFragment cannot be null.");
        this.A02 = C023409i.A0A.A02(bundle2);
        RegFlowExtras regFlowExtras = (RegFlowExtras) bundle2.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A00 = regFlowExtras;
        this.A06 = regFlowExtras.A08;
        C35161Ff3 A00 = C35161Ff3.A00(bundle2);
        this.A01 = A00;
        AbstractC18680vv abstractC18680vv = this.A02;
        EnumC33445EqI B75 = B75();
        RegFlowExtras regFlowExtras2 = this.A00;
        if (regFlowExtras2 == null) {
            A02 = null;
        } else {
            A02 = regFlowExtras2.A02();
        }
        AbstractC167017dG.A1N(abstractC18680vv, "sign_up_email_code_confirmation");
        C35203Ffv.A00(abstractC18680vv, A00, B75, A02, "sign_up_email_code_confirmation", null);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC31180DnO.A0f(c06090Tz).contains(__redex_internal_original_name)) {
            if (C1AD.A06(c06090Tz, 2324147236411677036L)) {
                FBE.A00().A00(requireContext(), this.A02, null);
            }
            if (C1AD.A06(c06090Tz, 2324147236411742573L)) {
                FBE.A00().A01(requireContext(), this.A02, null);
            }
        }
        C0f9.A09(1920481764, A022);
    }
}
