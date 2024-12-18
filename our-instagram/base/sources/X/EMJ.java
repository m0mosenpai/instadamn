package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.profile.fragment.UserDetailTabController;

/* loaded from: classes6.dex */
public final class EMJ extends AbstractC59962oe implements InterfaceC152836uD {
    public static final String __redex_internal_original_name = "SavedProfileTabFragment";
    public ENX A00;
    public final String A02 = "saved_collections_list";
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC152836uD
    public final Fragment ACb() {
        return this;
    }

    @Override // X.InterfaceC152836uD, X.InterfaceC152846uE
    public final String Bi9() {
        return "profile_saved";
    }

    @Override // X.InterfaceC152836uD
    public final void DcV(UserDetailTabController userDetailTabController) {
        C14360o3.A0B(userDetailTabController, 0);
        ENX enx = this.A00;
        if (enx != null) {
            AbstractC31174DnI.A0h(enx).ECo(new C37016GSx(new FHO(userDetailTabController), 14));
        }
    }

    @Override // X.InterfaceC152836uD
    public final void Drq(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drv(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drw() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A00 == null) {
            AbstractC10360h2 childFragmentManager = getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                str = bundle2.getString("profile_user_id");
            } else {
                str = null;
            }
            this.A00 = FB5.A00(AbstractC166987dD.A0o(this.A01), str, true, false, false);
            C14240no c14240no = new C14240no(childFragmentManager);
            ENX enx = this.A00;
            if (enx != null) {
                c14240no.A0A(enx, R.id.save_fragment_container);
                c14240no.A00();
                return;
            }
            throw AbstractC25227BEk.A0n();
        }
    }

    @Override // X.InterfaceC152836uD
    public final ViewGroup Br5() {
        ENX enx = this.A00;
        if (enx != null) {
            return enx.getRecyclerView();
        }
        return null;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-853638311);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_saved_profile_tab_fragment, viewGroup, false);
        C0f9.A09(-1422562825, A02);
        return inflate;
    }
}
