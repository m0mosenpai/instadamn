package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.KDa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45511KDa extends AbstractC60672pq implements InterfaceC60072op, InterfaceC62612t0, InterfaceC60122ou, InterfaceC60152ox {
    public static final String __redex_internal_original_name = "RecsFromFriendsSenderFragment";
    public InterfaceC56362iU A00;
    public IgEditText A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public IgView A04;
    public IgdsButton A05;
    public L9S A06;
    public C44522JmS A07;
    public GFV A08;
    public SearchEditText A09;
    public User A0A;
    public Integer A0B;
    public String A0C;
    public boolean A0E;
    public boolean A0F;
    public boolean A0H;
    public C3I9 A0I;
    public C153156uj A0J;
    public boolean A0G = true;
    public boolean A0D = true;
    public final HashSet A0K = AbstractC166987dD.A1H();
    public final InterfaceC09390do A0L = AbstractC60492pY.A02(this);

    public final void A02(User user, boolean z) {
        if (z) {
            this.A0F = true;
            SearchEditText searchEditText = this.A09;
            if (searchEditText != null) {
                searchEditText.setText((CharSequence) null);
            }
            this.A0F = false;
            SearchEditText searchEditText2 = this.A09;
            if (searchEditText2 != null) {
                searchEditText2.clearFocus();
            }
            SearchEditText searchEditText3 = this.A09;
            if (searchEditText3 != null) {
                searchEditText3.A04();
            }
        }
        if (user != null) {
            this.A0B = null;
        }
        C44522JmS c44522JmS = this.A07;
        if (c44522JmS == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        if (user != null) {
            ArrayList arrayList = c44522JmS.A05;
            arrayList.remove(user);
            arrayList.add(0, user);
        }
        if (c44522JmS.A01.isCancelled()) {
            c44522JmS.A01 = new AnonymousClass197(null);
        }
        c44522JmS.A01.AGH(null);
        c44522JmS.A06.Egh(new C45296K2y(c44522JmS.A00, c44522JmS.A05, c44522JmS.A02, false));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131971600);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC48073LPy(this, 34), AbstractC31176DnK.A0I(), interfaceC56362iU);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "recs_from_friends_sender";
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31174DnI.A15(AbstractC31173DnH.A06(recyclerView, 0), recyclerView);
        C153156uj c153156uj = new C153156uj(recyclerView.A0D, this, C153146ui.A0A, false, false);
        this.A0J = c153156uj;
        recyclerView.A14(c153156uj);
        C44220JgP.A00(recyclerView, this, 14);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SearchEditText searchEditText = (SearchEditText) AbstractC166997dE.A0S(view, R.id.action_bar_search_hints_text_layout).requireViewById(R.id.action_bar_search_edit_text);
        this.A09 = searchEditText;
        if (searchEditText != null) {
            GFV gfv = this.A08;
            if (gfv == null) {
                str = "searchBarController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            gfv.A00(searchEditText, true);
            searchEditText.setOnFocusChangeListener(new LQ3(this, 7));
        }
        AbstractC167007dF.A0N(view, R.id.send_button_caption).setText(AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), AbstractC43593JPy.A0z(this.A0A), 2131973284));
        this.A01 = (IgEditText) view.requireViewById(R.id.sender_message_edit_text);
        this.A04 = (IgView) view.requireViewById(R.id.divider_top);
        this.A05 = AbstractC31173DnH.A0W(view, R.id.send_button);
        this.A03 = AbstractC31172DnG.A0X(view, R.id.send_button_caption);
        this.A02 = (IgLinearLayout) view.requireViewById(R.id.footer_container);
        View A0S = AbstractC166997dE.A0S(view, R.id.listview_progressbar);
        L9S l9s = this.A06;
        if (l9s == null) {
            str = "recsFromFriendsLogger";
        } else {
            String str2 = this.A0C;
            if (str2 == null) {
                str = "targetUserId";
            } else {
                l9s.A01(AbstractC166997dE.A0j(str2), "sender_view", "recs_from_friends_sender");
                if (this.A0G) {
                    A0S.setVisibility(0);
                    IgdsButton igdsButton = this.A05;
                    if (igdsButton != null) {
                        igdsButton.setEnabled(false);
                    }
                }
                IgdsButton igdsButton2 = this.A05;
                if (igdsButton2 != null) {
                    ViewOnClickListenerC48073LPy.A00(igdsButton2, 35, this);
                }
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, c07s, A0S, this, null, 21), C07Y.A00(viewLifecycleOwner));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(C45511KDa c45511KDa, List list, boolean z, boolean z2) {
        Integer num;
        c45511KDa.A0E = z;
        c45511KDa.A0D = false;
        EQD eqd = (EQD) c45511KDa.getAdapter();
        C14360o3.A0B(list, 0);
        ArrayList arrayList = eqd.A01;
        if (z2) {
            arrayList.addAll(list);
            EQD.A00(eqd);
        } else {
            arrayList.clear();
            arrayList.addAll(list);
            EQD.A00(eqd);
            if (!c45511KDa.A0H && (num = c45511KDa.A0B) != null) {
                c45511KDa.getRecyclerView().A0n(num.intValue());
                c45511KDa.A0B = null;
            }
        }
        ((C2US) c45511KDa.getAdapter()).notifyDataSetChangedSmart();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        String str;
        if (!this.A0D) {
            String str2 = null;
            if (this.A0H) {
                GFV gfv = this.A08;
                if (gfv == null) {
                    str = "searchBarController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str2 = gfv.A01;
            }
            C44522JmS c44522JmS = this.A07;
            if (c44522JmS == null) {
                str = "viewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            c44522JmS.A00(str2);
            this.A0D = true;
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        int i2;
        SearchEditText searchEditText = this.A09;
        if (searchEditText != null && !searchEditText.hasFocus()) {
            IgTextView igTextView = this.A03;
            if (igTextView != null) {
                i2 = igTextView.getHeight();
            } else {
                i2 = 0;
            }
            int A03 = AbstractC167017dG.A03(requireContext());
            int i3 = 0;
            if (i > 0) {
                i3 = (i + A03) - i2;
            }
            IgLinearLayout igLinearLayout = this.A02;
            if (igLinearLayout != null) {
                igLinearLayout.setPadding(0, 0, 0, i3);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0L);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0H) {
            A02(null, true);
            return true;
        }
        AbstractC31177DnL.A13(this);
        return true;
    }

    public static final String A00(HashSet hashSet) {
        String A19 = AbstractC166987dD.A19(hashSet);
        String A0d = AbstractC002300n.A0d(A19, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "::", false);
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (int i = 0; i < A0d.length(); i++) {
            char charAt = A0d.charAt(i);
            if (charAt != '[' && charAt != ']') {
                A1C.append(charAt);
            }
        }
        return AbstractC166987dD.A19(A1C);
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1153503134);
        super.onCreate(bundle);
        this.A0C = AbstractC153636vY.A01(requireArguments(), "target_user_id");
        InterfaceC09390do interfaceC09390do = this.A0L;
        C18A A0h = AbstractC31176DnK.A0h(interfaceC09390do);
        String str = this.A0C;
        if (str != null) {
            this.A0A = A0h.A02(str);
            this.A06 = new L9S(this, AbstractC166987dD.A0r(interfaceC09390do));
            setAdapter(new EQD(requireContext(), this, new PIB(this, 1), new C49673Lx4(this), "recs_from_friends_sender", false, false, false));
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            String str2 = this.A0C;
            if (str2 != null) {
                this.A07 = new C44522JmS(A0r, str2);
                this.A08 = new GFV(new GFT(this, 2), 2131972993);
                C3I8 A01 = C3I7.A01(this, false, false);
                this.A0I = A01;
                A01.A9e(this);
                C0f9.A09(1463521485, A02);
                return;
            }
        }
        C14360o3.A0F("targetUserId");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(564188239);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.recs_from_friends_sender_fragment, false);
        C0f9.A09(-1852252536, A02);
        return A0R;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-819624072);
        super.onDestroyView();
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
        this.A03 = null;
        this.A02 = null;
        this.A09 = null;
        C3I9 c3i9 = this.A0I;
        if (c3i9 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            c3i9.EFx(this);
            RecyclerView recyclerView = getRecyclerView();
            C153156uj c153156uj = this.A0J;
            if (c153156uj == null) {
                str = "autoLoadMoreHelper";
            } else {
                recyclerView.A15(c153156uj);
                C0f9.A09(1660122385, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(217052100);
        super.onStart();
        C3I9 c3i9 = this.A0I;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(requireActivity());
        C0f9.A09(460901083, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-742708641);
        super.onStop();
        C3I9 c3i9 = this.A0I;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(670189573, A02);
    }
}
