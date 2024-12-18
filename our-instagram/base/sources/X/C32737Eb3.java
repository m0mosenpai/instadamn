package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.Eb3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32737Eb3 extends C32324ELs {
    public static final String __redex_internal_original_name = "DirectRecipientPickerGlobalFragment";

    @Override // X.C32324ELs, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_TARGET_LIST");
        String string = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY");
        if (parcelableArrayList != null && string != null) {
            this.A0A.A0R(parcelableArrayList);
            EVU evu = this.A0A;
            InterfaceC169517hR A02 = EVU.A02(evu);
            C35151Fet c35151Fet = evu.A0B;
            if (c35151Fet != null && A02 != null) {
                A02.Eby(string);
                c35151Fet.A02.EdJ(string);
            }
        }
    }
}
