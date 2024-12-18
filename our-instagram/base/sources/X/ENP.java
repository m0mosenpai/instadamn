package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
public final class ENP extends C38K implements InterfaceC37297Gby, InterfaceC60122ou, GZD, InterfaceC37175GZm, C38O {
    public static final String __redex_internal_original_name = "NewsfeedFollowRollupFragment";
    public UserSession A00;
    public IgdsInlineSearchBox A01;
    public C32415EPq A02;
    public C32198ECt A03;
    public C38E A04;
    public C161887My A05;
    public String A06;
    public String A07 = "";
    public final C61372qz A08 = new C61372qz();
    public final C1I7 A09 = new JXT(this, 3);

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC37297Gby
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        List singletonList = Collections.singletonList(reel);
        C38E c38e = this.A04;
        c38e.A0C = this.A06;
        C31559Dtj.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 8);
        c38e.A0A(reel, C3G2.A03, gradientSpinnerAvatarView, singletonList, singletonList, singletonList);
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

    @Override // X.InterfaceC37175GZm
    public final void DI0() {
    }

    @Override // X.InterfaceC37297Gby
    public final void DTn(View view, User user, boolean z) {
    }

    @Override // X.GYZ
    public final void Des(User user) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "follower_rollup";
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        c193328hC.A0m(this, this.A00);
        return c193328hC;
    }

    @Override // X.InterfaceC37175GZm
    public final void DI4() {
        C32415EPq c32415EPq = this.A02;
        c32415EPq.A00 = -1;
        C32415EPq.A01(c32415EPq);
    }

    @Override // X.InterfaceC37175GZm
    public final void Dqy() {
        if (AbstractC167007dF.A1W(C37001nx.A02)) {
            C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity(), this.A00);
            AbstractC35067Fce.A01();
            AbstractC31176DnK.A1A(AbstractC166987dD.A0b(), new EK6(), A0r);
        }
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        List list;
        int i;
        if (!this.A07.equals(str)) {
            this.A07 = str;
            boolean isEmpty = str.isEmpty();
            C32415EPq c32415EPq = this.A02;
            if (isEmpty) {
                c32415EPq.A02 = false;
                C32198ECt c32198ECt = this.A03;
                if (c32198ECt != null) {
                    Collection collection = c32198ECt.A02;
                    Integer num = c32198ECt.A01;
                    C47K c47k = c32198ECt.A00;
                    List list2 = c32415EPq.A08;
                    list2.clear();
                    if (collection == null) {
                        collection = C16930sl.A00;
                    }
                    list2.addAll(collection);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    C32415EPq.A00(c47k, c32415EPq, i);
                }
            } else {
                c32415EPq.A02 = true;
                HashSet A1H = AbstractC166987dD.A1H();
                C32198ECt c32198ECt2 = this.A03;
                if (c32198ECt2 != null && (list = c32198ECt2.A02) != null) {
                    AbstractC169147gn.A00(null, str, list, A1H);
                }
                C32415EPq c32415EPq2 = this.A02;
                List list3 = c32415EPq2.A08;
                list3.clear();
                list3.addAll(A1H);
                C32415EPq.A00(null, c32415EPq2, -1);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C56352iT A03 = C56352iT.A0t.A03(activity);
                int size = this.A02.A08.size();
                String string = getString(2131962781);
                if (size > 0) {
                    string = AbstractC167017dG.A0k(AbstractC166997dE.A0N(this), size, R.plurals.follow_count);
                }
                A03.setTitle(string);
            }
        }
    }

    @Override // X.InterfaceC37297Gby
    public final void onUserRowClick(User user) {
        C31368DqX A01 = AbstractC31402Dr6.A01(this.A00, user.getId(), "feed_follow_rollup_user_row", "follower_rollup");
        C31368DqX.A01(AbstractC25225BEi.A0r(requireActivity(), this.A00), this.A00, AbstractC31364DqT.A02(), A01);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131968501);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1687260396);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A02 = new C32415EPq(requireContext(), this, this.A00, this, new Ef1(requireActivity(), this, this.A00, this), this, this, new C31538DtO(requireArguments(), this.A00, null));
        C161887My c161887My = new C161887My(requireContext(), this.A00, this.A02);
        this.A05 = c161887My;
        c161887My.A00();
        A0U(this.A02);
        C25621Ms A0N = AbstractC31173DnH.A0N(this.A00);
        A0N.A0B("friendships/recent_followers/");
        A0N.A0S(C32198ECt.class, FW4.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            A0N.A0H("media_id", bundle2.getString("media_id"));
        }
        C1ON A0N2 = A0N.A0N();
        A0N2.A00 = new C32539EUp(this, 18);
        schedule(A0N2);
        this.A04 = new C38E(this, this.A00, new C38C(this));
        this.A06 = AbstractC166997dE.A0n();
        C0f9.A09(-842299536, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(400806243);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_listview_with_progress_and_search);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0A.requireViewById(R.id.search_box);
        this.A01 = igdsInlineSearchBox;
        igdsInlineSearchBox.setVisibility(8);
        C0f9.A09(632063742, A02);
        return A0A;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1416541273);
        this.A05.A01();
        super.onDestroy();
        C0f9.A09(-994888451, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View currentFocus;
        int A02 = C0f9.A02(860314234);
        C61372qz c61372qz = this.A08;
        C1I7 c1i7 = this.A09;
        C14360o3.A0B(c1i7, 0);
        c61372qz.A02.remove(c1i7);
        FragmentActivity activity = getActivity();
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
            AbstractC13880nE.A0O(currentFocus);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A01;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        this.A01 = null;
        super.onDestroyView();
        C0f9.A09(1393992900, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        C3G2 c3g2;
        int A02 = C0f9.A02(-1574355309);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a() && ((c3g2 = A05.A0G) == C3G2.A03 || c3g2 == C3G2.A05 || c3g2 == C3G2.A04)) {
            A05.A0Y(this);
        }
        C0f9.A09(1692850222, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ListView A0W = A0W();
        if (A0W != null) {
            A0W.setImportantForAccessibility(1);
        }
        this.A08.A03(this.A09);
        if (!this.A07.isEmpty()) {
            IgdsInlineSearchBox igdsInlineSearchBox = this.A01;
            igdsInlineSearchBox.getClass();
            igdsInlineSearchBox.A0E.setText(this.A07);
        }
        getScrollingViewProxy().AAJ(new Eg5(this, 0));
    }
}
