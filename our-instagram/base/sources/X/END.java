package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class END extends AbstractC59962oe implements InterfaceC37297Gby {
    public static final String __redex_internal_original_name = "FeaturedAccountsFragment";
    public User A00;
    public List A01;
    public ListView A02;
    public UserSession A03;
    public EPW A04;

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC37297Gby
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.InterfaceC37297Gby
    public final void DTn(View view, User user, boolean z) {
    }

    @Override // X.GYZ
    public final void Des(User user) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "featured_accounts_fragment";
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C0fA.A00(this.A04, 693817763);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1878044113);
        super.onCreate(bundle);
        C18C.A07(this.mArguments, "Fragment arguments cannot be null in FeaturedAccountsFragment!");
        Object value = AbstractC60492pY.A02(this).getValue();
        C18C.A07(value, "Usersession cannot be null in FeaturedAccountsFragment!");
        this.A03 = (UserSession) value;
        EPW epw = new EPW(requireContext(), this, this.A03, this, new C31538DtO(requireArguments(), this.A03, null));
        this.A04 = epw;
        List list = this.A01;
        if (list != null) {
            List list2 = epw.A01;
            list2.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(it.next());
            }
            epw.A06();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                epw.A08(epw.A00, it2.next());
            }
            epw.A07();
        }
        C0f9.A09(-2105813686, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1646026666);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.featured_accounts_bottom_sheet_layout);
        if (this.A00 != null) {
            Resources A0N = AbstractC166997dE.A0N(this);
            String username = this.A00.getUsername();
            AbstractC166997dE.A0T(A0A, R.id.featured_accounts_title_textview).setText(AbstractC166997dE.A0r(A0N, username, 2131962362));
            AbstractC31180DnO.A14(A0N, AbstractC166997dE.A0T(A0A, R.id.featured_accounts_subtitle_textview), username, 2131962361);
        }
        ListView listView = (ListView) A0A.requireViewById(R.id.list_view);
        this.A02 = listView;
        listView.setAdapter((ListAdapter) this.A04);
        C0f9.A09(83528204, A02);
        return A0A;
    }

    @Override // X.InterfaceC37297Gby
    public final void onUserRowClick(User user) {
        if (getActivity() != null) {
            AbstractC31176DnK.A12(requireContext(), C3DN.A00);
            C31368DqX A01 = AbstractC31402Dr6.A01(this.A03, user.getId(), "featured_account_bottom_sheet_row", "featured_accounts_fragment");
            C31368DqX.A01(AbstractC31173DnH.A0P(requireActivity(), this.A03), this.A03, AbstractC31364DqT.A02(), A01);
        }
    }
}
