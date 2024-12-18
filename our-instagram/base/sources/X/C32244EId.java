package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.user.model.User;

/* renamed from: X.EId, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32244EId extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BirthdayCenterFragment";
    public View A00;
    public C56352iT A01;
    public C31874Dzg A02;
    public C31294DpG A03;
    public RecyclerView A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56352iT A01 = C56342iS.A01(ViewOnClickListenerC35689FpO.A00(this, 32), AbstractC31176DnK.A0C(requireView(), R.id.birthday_center_action_bar));
        this.A01 = A01;
        A01.A0X(new Ft8(this, 3));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 8), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public C32244EId() {
        C37061GUv A01 = C37061GUv.A01(this, 11);
        InterfaceC09390do A00 = C37061GUv.A00(C37061GUv.A01(this, 8), EnumC09460dv.A02, 9);
        this.A06 = AbstractC25225BEi.A0a(C37061GUv.A01(A00, 10), A01, new C57252Pba(19, null, A00), AbstractC25225BEi.A1D(C50937Mf6.class));
    }

    public final void A00(User user) {
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A05;
        C31368DqX.A02(AbstractC25231BEo.A0c(requireActivity, interfaceC09390do), AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "birthday_center", __redex_internal_original_name));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(529015839);
        super.onCreate(bundle);
        this.A02 = new C31874Dzg(this, this);
        this.A03 = new C31294DpG(this, AbstractC166987dD.A0r(this.A05));
        C0f9.A09(-1925787869, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1530951325);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.birthday_center_fragment, viewGroup, false);
        this.A00 = inflate.findViewById(R.id.loading_spinner);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.birthday_center_recycler_view);
        this.A04 = recyclerView;
        if (recyclerView != null) {
            C31874Dzg c31874Dzg = this.A02;
            if (c31874Dzg == null) {
                C14360o3.A0F("birthdayCenterAdapter");
                throw C00O.createAndThrow();
            }
            recyclerView.setAdapter(c31874Dzg);
        }
        RecyclerView recyclerView2 = this.A04;
        if (recyclerView2 != null) {
            AbstractC31177DnL.A17(this, recyclerView2);
        }
        G81.A00((IgdsBanner) AbstractC166997dE.A0R(inflate, R.id.turn_off_notifications_banner), this, 12);
        C0f9.A09(-1548550334, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1761523644);
        super.onDestroyView();
        this.A00 = null;
        this.A04 = null;
        C0f9.A09(-649143032, A02);
    }
}
