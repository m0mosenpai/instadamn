package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes6.dex */
public final class ELS extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60112ot {
    public static final String __redex_internal_original_name = "FeedFavoritesHomeFragment";
    public LinearLayout A00;
    public EVR A01;
    public EVX A02;
    public IgdsButton A03;
    public C31349DqE A04;
    public boolean A05;
    public boolean A06;
    public View.OnClickListener A07;
    public LinearLayoutManager A08;
    public final C34720FRh A09 = new C34720FRh();
    public final InterfaceC09390do A0A = AbstractC09440dt.A01(J7V.A00);
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35679FpE.A00(this, 14), AbstractC31174DnI.A0K(), interfaceC56362iU);
        interfaceC56362iU.Efu(2131962227);
        ViewOnClickListenerC35679FpE A00 = ViewOnClickListenerC35679FpE.A00(this, 15);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.plus_24;
        A0B.A05 = 2131962463;
        AbstractC31176DnK.A1B(A00, A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "favorites_management";
    }

    public static final void A00(ELS els) {
        IgdsButton igdsButton = els.A03;
        if (igdsButton != null) {
            igdsButton.setVisibility(AbstractC167007dF.A05(els.A05 ? 1 : 0));
        }
        IgdsButton igdsButton2 = els.A03;
        if (igdsButton2 != null) {
            igdsButton2.setEnabled(AbstractC166987dD.A1b(els.A09.A01));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        if (this.A05) {
            C193328hC A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131960940);
            A0O.A09(2131960941);
            DialogInterfaceOnClickListenerC35452Fk9.A01(A0O, this, 29, 2131960921);
            A0O.A06();
            AbstractC166987dD.A1W(A0O);
        } else {
            AbstractC25231BEo.A16(this);
        }
        C127085om A00 = AbstractC127075ol.A00(AbstractC166987dD.A0r(this.A0B));
        String A0u = AbstractC31176DnK.A0u(this.A0A);
        if (this.A05) {
            str = "onboarding";
        } else {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(A00.A00, "favorites_management"), "instagram_feed_favorites_exit");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1D(A0f, "favorites_management");
            A0f.AAP("management_session_id", A0u);
            A0f.AAP(AbstractC111324zv.A00(384), str);
            A0f.Cht();
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        int A02 = C0f9.A02(927424886);
        super.onCreate(bundle);
        this.A07 = ViewOnClickListenerC35653Fon.A00;
        Bundle bundle2 = this.mArguments;
        String str4 = "";
        if (bundle2 == null) {
            str = "";
            str2 = "";
        } else {
            if (!bundle2.containsKey("event_source")) {
                str2 = "";
            } else {
                str2 = bundle2.getString("event_source", "");
            }
            if (!bundle2.containsKey("entry_module")) {
                str3 = "";
            } else {
                str3 = bundle2.getString("entry_module", "");
            }
            if (bundle2.containsKey("ranking_session_id")) {
                str4 = bundle2.getString("ranking_session_id", "");
            }
            str = str4;
            str4 = str3;
        }
        C127085om A00 = AbstractC127075ol.A00(AbstractC166987dD.A0r(this.A0B));
        String A0u = AbstractC31176DnK.A0u(this.A0A);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(A00.A00, str4), "instagram_feed_favorites_impression");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1D(A0f, str4);
            A0f.AAP("ranking_session_id", str);
            A0f.AAP("event_source", str2);
            A0f.AAP("management_session_id", A0u);
            A0f.Cht();
        }
        C0f9.A09(-430371178, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1419270621);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_feed_favorites_home, viewGroup, false);
        this.A08 = new LinearLayoutManager(getContext());
        Context requireContext = requireContext();
        LinearLayoutManager linearLayoutManager = this.A08;
        if (linearLayoutManager == null) {
            str = "layoutManager";
        } else {
            InterfaceC09390do interfaceC09390do = this.A0B;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C08790ch A00 = AbstractC018607g.A00(this);
            C34408FEy c34408FEy = new C34408FEy(this);
            C34720FRh c34720FRh = this.A09;
            InterfaceC09390do interfaceC09390do2 = this.A0A;
            this.A01 = new EVR(requireContext, inflate, A00, linearLayoutManager, c34720FRh, c34408FEy, this, A0r, AbstractC31176DnK.A0u(interfaceC09390do2));
            this.A02 = new EVX(requireContext(), inflate, AbstractC018607g.A00(this), c34720FRh, new C34409FEz(this), this, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31176DnK.A0u(interfaceC09390do2));
            EVR evr = this.A01;
            str = "listController";
            if (evr != null) {
                registerLifecycleListener(evr);
                EVX evx = this.A02;
                if (evx == null) {
                    str = "searchController";
                } else {
                    registerLifecycleListener(evx);
                    C14360o3.A0A(inflate);
                    this.A00 = AbstractC31172DnG.A0B(inflate, R.id.header);
                    TextView A0Q = AbstractC25230BEn.A0Q(inflate, R.id.feed_favorites_home_subtitle_text);
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    String A0v = AbstractC25227BEk.A0v(this, 2131963664);
                    A1C.append(getString(2131962464));
                    A1C.append(" ");
                    int length = A1C.length();
                    SpannableString spannableString = new SpannableString(AbstractC166997dE.A0x(A0v, A1C));
                    AbstractC31178DnM.A0u(spannableString, new AnonymousClass772(AbstractC31174DnI.A0q(requireContext(), AbstractC31173DnH.A04(this))), A0v, length);
                    A0Q.setText(spannableString);
                    A0Q.setContentDescription(spannableString);
                    AbstractC25227BEk.A11(A0Q);
                    A0Q.setHighlightColor(requireContext().getColor(R.color.fds_transparent));
                    ViewOnClickListenerC35679FpE.A01(A0Q, 17, this);
                    EVR evr2 = this.A01;
                    if (evr2 != null) {
                        evr2.A03(true);
                        C0f9.A09(-587500341, A02);
                        return inflate;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1806860546);
        super.onDestroyView();
        EVR evr = this.A01;
        if (evr == null) {
            str = "listController";
        } else {
            unregisterLifecycleListener(evr);
            EVX evx = this.A02;
            if (evx == null) {
                str = "searchController";
            } else {
                unregisterLifecycleListener(evx);
                C0f9.A09(589922485, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
