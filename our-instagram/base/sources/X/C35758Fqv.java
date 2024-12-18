package X;

import android.os.Bundle;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import java.util.ArrayList;

/* renamed from: X.Fqv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35758Fqv implements C06Z {
    public final int A00;
    public final Object A01;

    public C35758Fqv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C06Z
    public final void DIA(String str, Bundle bundle) {
        EnumC33332EoR enumC33332EoR;
        Boolean valueOf;
        EO0 eo0;
        InterfaceC37264GbH interfaceC37264GbH;
        switch (this.A00) {
            case 0:
                eo0 = (EO0) this.A01;
                if (eo0.A04 == null || !"native_calling_page_save".equals(str)) {
                    return;
                }
                boolean z = bundle.getBoolean("native_calling_toggle_checked");
                eo0.A04.A07(z);
                C35130FeX c35130FeX = new C35130FeX(eo0.A05);
                c35130FeX.A0P = z;
                eo0.A05 = new BusinessInfo(c35130FeX);
                break;
            case 1:
                if (!str.equals("update_additional_business_addresses_result_key")) {
                    if (!str.equals("update_primary_address_result_key")) {
                        return;
                    }
                    ((EO0) this.A01).FBL((Address) bundle.getParcelable("update_primary_address_result_bundle_address_key"), null);
                    return;
                }
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("update_additional_business_addresses_bundle_addresses_key");
                eo0 = (EO0) this.A01;
                C35130FeX c35130FeX2 = new C35130FeX(eo0.A05);
                c35130FeX2.A0M = parcelableArrayList;
                eo0.A05 = new BusinessInfo(c35130FeX2);
                BusinessInfoSectionView businessInfoSectionView = eo0.A04;
                if (businessInfoSectionView != null) {
                    businessInfoSectionView.A06(parcelableArrayList, EO0.A02(eo0, false));
                    break;
                }
                break;
            case 2:
                ELV elv = (ELV) this.A01;
                if (elv.A03 == null || !"native_calling_page_save".equals(str)) {
                    return;
                }
                boolean z2 = bundle.getBoolean("native_calling_toggle_checked");
                elv.A03.A07(z2);
                C35130FeX c35130FeX3 = new C35130FeX(elv.A06);
                c35130FeX3.A0P = z2;
                elv.A06 = new BusinessInfo(c35130FeX3);
                return;
            case 3:
                C14360o3.A0B(bundle, 1);
                int i = bundle.getInt(AbstractC111324zv.A00(554), 0);
                if (i == -1) {
                    valueOf = false;
                    enumC33332EoR = EnumC33332EoR.A03;
                } else {
                    EnumC33332EoR[] values = EnumC33332EoR.values();
                    if (i >= 0 && i < values.length) {
                        enumC33332EoR = values[i];
                    } else {
                        enumC33332EoR = EnumC33332EoR.A03;
                    }
                    valueOf = Boolean.valueOf(bundle.getBoolean(AbstractC111324zv.A00(553), false));
                }
                boolean booleanValue = valueOf.booleanValue();
                InterfaceC37147GYi interfaceC37147GYi = (InterfaceC37147GYi) this.A01;
                if (booleanValue) {
                    interfaceC37147GYi.Dqa(enumC33332EoR);
                    return;
                } else {
                    interfaceC37147GYi.onError(null);
                    return;
                }
            case 4:
                C159737El.A0b(((FGT) this.A01).A00);
                return;
            default:
                boolean A1R = AbstractC167007dF.A1R(0, str, bundle);
                if (str.hashCode() == -1772093948 && str.equals("conf_code_response_request_code") && bundle.getBoolean("contact_point_confirmed", false) && (interfaceC37264GbH = ((EMT) this.A01).A01) != null) {
                    interfaceC37264GbH.CnE(A1R ? 1 : 0);
                    return;
                }
                return;
        }
        eo0.A09 = true;
    }
}
