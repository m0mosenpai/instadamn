package X;

import android.os.Bundle;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.El3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33215El3 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacOtherMethodsFragment";
    public Bundle A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public static final void A00(C33215El3 c33215El3) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Bundle bundle = c33215El3.A00;
        if (bundle != null) {
            boolean z = bundle.getBoolean("is_two_factor_enabled");
            Bundle bundle2 = c33215El3.A00;
            if (bundle2 != null) {
                boolean z2 = bundle2.getBoolean("is_totp_two_factor_enabled");
                C34965Fap c34965Fap = new C34965Fap(2131975969);
                c34965Fap.A01 = 1;
                c34965Fap.A05 = new C34626FNj(AbstractC166997dE.A0N(c33215El3).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), 0, AbstractC31177DnL.A02(c33215El3, R.dimen.abc_dialog_padding_material), AbstractC167017dG.A0E(c33215El3.requireContext()), AbstractC31177DnL.A02(c33215El3, R.dimen.abc_dialog_padding_material), AbstractC31177DnL.A02(c33215El3, R.dimen.abc_dialog_padding_material));
                c34965Fap.A03 = R.style.TwoFacRowBodyText;
                A1E.add(c34965Fap);
                Bundle bundle3 = c33215El3.A00;
                if (bundle3 != null) {
                    C36731GHa c36731GHa = new C36731GHa(new C35745Fqd(c33215El3, 34), G9G.A00, 2131975972, bundle3.getBoolean("is_trusted_notifications_enabled"));
                    int dimensionPixelSize = AbstractC166997dE.A0N(c33215El3).getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                    c36731GHa.A05 = dimensionPixelSize;
                    c36731GHa.A00 = dimensionPixelSize;
                    c36731GHa.A02 = 2131975971;
                    int A02 = AbstractC31177DnL.A02(c33215El3, R.dimen.account_discovery_bottom_gap);
                    c36731GHa.A05 = A02;
                    c36731GHa.A00 = A02;
                    A1E.add(c36731GHa);
                    Bundle bundle4 = c33215El3.A00;
                    if (bundle4 != null) {
                        ArrayList<String> stringArrayList = bundle4.getStringArrayList("backup_codes");
                        if ((z || z2) && stringArrayList != null) {
                            A1E.add(new C35200Ffs(new ViewOnClickListenerC31591DuJ(51, c33215El3, stringArrayList), (String) null, 2131975968, 2131975967));
                        }
                        c33215El3.setItems(A1E);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("twoFacResponseBundle");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131975973);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2132450867);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        C0f9.A09(875197608, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(970375830);
        super.onStart();
        A00(this);
        C0f9.A09(791932301, A02);
    }
}
