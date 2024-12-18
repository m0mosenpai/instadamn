package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import java.util.List;

/* loaded from: classes6.dex */
public final class EJ9 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UhlAccountSelectionFragment";
    public C07270a1 A00;
    public String A01;
    public List A02;
    public boolean A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "UniversalHackLock";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(455602489);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = C023409i.A0A.A02(bundle2);
            this.A02 = bundle2.getParcelableArrayList("UHL_ACCOUNT_SELECTION_ACCOUNTS");
            this.A01 = AbstractC31172DnG.A13(bundle2, "ARG_UHL_ACCOUNT_SELECTION_GET_HELP_LINK");
            this.A03 = bundle2.getBoolean("ARG_UHL_ACCOUNT_SELECTION_SHOW_AS_MODAL");
        }
        C0f9.A09(-1120831615, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-118435830);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.uhl_multiple_account_selection);
        ((AbsListView) A0A.requireViewById(R.id.uhl_multiple_account_list)).setAdapter((ListAdapter) new C31766DxN(getContext(), this, this, this.A02));
        ViewOnClickListenerC35677FpC.A00(A0A.requireViewById(R.id.uhl_multiple_account_get_help), 37, this);
        C0f9.A09(-1899986450, A02);
        return A0A;
    }
}
