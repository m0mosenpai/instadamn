package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes6.dex */
public final class EIO extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClickableCategoryFragment";
    public C25531Mh A00;
    public C66362zD A01;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new GSw(this, 41));
    public String A02 = "";
    public final FPO A05 = new FPO(this);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clickable_profile_category";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.recommeded_business_recylcer_view);
        View A0R = AbstractC166997dE.A0R(view, R.id.clickable_categories_loading_spinner);
        View A0R2 = AbstractC166997dE.A0R(view, R.id.clickable_categories_error_screen);
        recyclerView.setLayoutManager(linearLayoutManager);
        C66362zD c66362zD = this.A01;
        if (c66362zD == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(c66362zD);
        ViewOnClickListenerC31723DwS.A01(AbstractC166997dE.A0S(view, R.id.action_bar_button_back), 23, this);
        AbstractC167007dF.A0N(view, R.id.action_bar_title).setText(2131971607);
        C25531Mh c25531Mh = this.A00;
        if (c25531Mh != null) {
            c25531Mh.A0R("container_module", "clickable_profile_category");
            c25531Mh.A0R("entry_module", "recommended_user_impression");
            c25531Mh.A0R("target_id", this.A02);
            c25531Mh.Cht();
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new JTH(A0R2, this, viewLifecycleOwner, A0R, c07s, (InterfaceC23621Ds) null, 49), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A0g;
        int i;
        int A02 = C0f9.A02(-1643462141);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            AbstractC153636vY.A01(bundle2, "category_name");
            String string = requireArguments().getString("category_id");
            if (string != null) {
                String string2 = requireArguments().getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                if (string2 != null) {
                    AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A04);
                    Context requireContext = requireContext();
                    C08790ch A00 = AbstractC018607g.A00(this);
                    AbstractC166987dD.A1Z(new C50115MAo(A00, A0Z, requireContext, string2, string, null, 3), AbstractC141776au.A00(A0Z));
                    InterfaceC09390do interfaceC09390do = this.A03;
                    this.A00 = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC31176DnK.A0M(this, interfaceC09390do), "clickable_category_impression"), 11);
                    this.A02 = string2;
                    this.A01 = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new C32640EYo(this, AbstractC166987dD.A0r(interfaceC09390do), this.A05));
                    C0f9.A09(-1446671146, A02);
                    return;
                }
                A0g = AbstractC166987dD.A14("User ID required");
                i = 328487499;
            } else {
                A0g = AbstractC166987dD.A14("Category ID required");
                i = 404031070;
            }
        } else {
            A0g = AbstractC166997dE.A0g();
            i = 857177002;
        }
        C0f9.A09(i, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1898947015);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.recommended_business_list, viewGroup, false);
        C0f9.A09(455167722, A02);
        return inflate;
    }
}
