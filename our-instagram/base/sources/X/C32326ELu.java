package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ELu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32326ELu extends AbstractC59962oe implements InterfaceC37289Gbq, InterfaceC60112ot {
    public static final String __redex_internal_original_name = "DirectNewGroupCreationFragment";
    public Context A00;
    public EditText A01;
    public EnumC33498ErX A02;
    public ActionButton A03;
    public UserSession A04;
    public C8EQ A05;
    public EVU A06;
    public G05 A07;
    public IgdsButton A08;
    public String A09;
    public String A0A;
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public String A0F;
    public List A0B = AbstractC166987dD.A1E();
    public final TextWatcher A0G = new C35469Fl4(this, 10);

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ C25805BbM BJO() {
        return null;
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void Cyq() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void DdP() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void DjA() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void DjC(View view, boolean z) {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void E2Q() {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2S(String str, String str2) {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void E2T() {
    }

    @Override // X.InterfaceC37289Gbq
    public final /* synthetic */ void E2Y() {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2p(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2z(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37289Gbq
    public final void E30(DirectShareTarget directShareTarget) {
    }

    public static void A00(C32326ELu c32326ELu) {
        View view;
        boolean z = false;
        if (c32326ELu.A0B.size() >= 2) {
            z = true;
        }
        if (c32326ELu.A0C) {
            view = c32326ELu.A03;
        } else {
            AbstractC31176DnK.A0J(c32326ELu).ARS(z);
            view = c32326ELu.A08;
        }
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return !this.A0C;
    }

    @Override // X.InterfaceC37289Gbq
    public final void DdR() {
        List A0N = this.A06.A0N();
        this.A0B = A0N;
        C8EQ c8eq = this.A05;
        if (c8eq != null) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0N);
            C14360o3.A0B(copyOf, 0);
            c8eq.A02.Egh(copyOf);
        }
        A00(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A0E.equals("reshare_sheet")) {
            return "direct_reshare_sheet";
        }
        return MSV.A00(1129);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A06.A0N() != null && EVU.A00(this.A06) > 1) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A04, 36318887700077308L) && !this.A0D) {
                C193328hC A0O = AbstractC31175DnJ.A0O(this);
                A0O.A0A(2131960261);
                A0O.A09(2131960260);
                DialogInterfaceOnClickListenerC35452Fk9.A01(A0O, this, 54, 2131960259);
                A0O.A0s(true);
                A0O.A0t(true);
                A0O.A06();
                AbstractC166987dD.A1W(A0O);
                return true;
            }
        }
        return this.A06.A0T();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131959970);
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (AbstractC31178DnM.A1W(c06090Tz, userSession)) {
            interfaceC56362iU.Efu(2131959971);
        }
        boolean z = true;
        interfaceC56362iU.EkS(true);
        if (!AbstractC31178DnM.A1X(c06090Tz, this.A04, 36324320833777768L)) {
            ActionButton Eha = interfaceC56362iU.Eha(ViewOnClickListenerC35691FpR.A00(this, 4), R.drawable.instagram_check_pano_outline_24);
            if (this.A0B.size() < 2) {
                z = false;
            }
            Eha.setEnabled(z);
            AbstractC31172DnG.A1E(AbstractC166997dE.A0N(this), Eha, 2131959973);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        int A02 = C0f9.A02(1703544252);
        super.onCreate(bundle);
        this.A00 = requireContext();
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A0E = requireArguments.getString("DirectVisualMessageCreateGroupFragment.DIRECT_MODULE", "reshare_sheet");
        this.A02 = (EnumC33498ErX) requireArguments.getSerializable("bundle_extra_serializable_group_creation_entry_point");
        this.A0A = requireArguments.getString("bundle_query_share_sheet_session_id");
        this.A09 = AbstractC166997dE.A0n();
        this.A07 = FV2.A00(AbstractC31171DnF.A0D(getModuleName()), this.A04);
        this.A0C = requireArguments.getBoolean("share_sheet_group_creation_bottom_sheet_mode", false);
        this.A0F = requireArguments.getString("DirectVisualMessageCreateGroupFragment.MEDIA_ID", null);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A04, 36324320833777768L)) {
                AbstractC31180DnO.A1A(this);
            }
        }
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (AbstractC31178DnM.A1X(c06090Tz, userSession, 36324320833712231L) && (parcelableArrayList = requireArguments.getParcelableArrayList("bundle_extra_parcelable_new_group_selected_recipients")) != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                this.A0B.add(new DirectShareTarget(AbstractC31172DnG.A0p(it)));
            }
        }
        UserSession userSession2 = this.A04;
        this.A06 = new EVU(null, userSession2, this, C31600DuS.A00(userSession2, false), this.A0F, true, false, false, false, false, false, false, false, false);
        if (AbstractC31178DnM.A1X(c06090Tz, this.A04, 36324320834826359L)) {
            this.A06.A0G = C05F.A0C;
        }
        C0f9.A09(-134351729, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1650954467);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_story_create_group_fragment_layout);
        C0f9.A09(789612174, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(936423132);
        super.onDestroy();
        this.A07.A09();
        C0f9.A09(-413372043, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1832052049);
        super.onDestroyView();
        this.A08 = null;
        C0f9.A09(793307504, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C35151Fet c35151Fet;
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (AbstractC31178DnM.A1X(c06090Tz, userSession, 36324320833712231L)) {
            this.A06.A0R(this.A0B);
        }
        this.A01 = AbstractC31173DnH.A0H(view, R.id.group_name);
        if (AbstractC31178DnM.A1W(c06090Tz, this.A04)) {
            this.A01.setHint(2131960538);
        }
        if (this.A05 != null) {
            this.A01.addTextChangedListener(this.A0G);
        }
        if (this.A0C) {
            view.requireViewById(R.id.fake_action_bar).setVisibility(0);
            AbstractC166997dE.A0T(view, R.id.fake_action_bar_title).setText(2131959970);
            if (AbstractC31178DnM.A1W(c06090Tz, this.A04)) {
                AbstractC166997dE.A0T(view, R.id.fake_action_bar_title).setText(2131959971);
            }
            ActionButton actionButton = (ActionButton) view.requireViewById(R.id.fake_action_bar_action_button);
            this.A03 = actionButton;
            actionButton.setButtonResource(R.drawable.instagram_check_pano_outline_24);
            AbstractC31172DnG.A1E(AbstractC166997dE.A0N(this), this.A03, 2131959973);
            ViewOnClickListenerC35691FpR.A01(this.A03, 5, this);
            this.A03.setEnabled(false);
            ActionButton actionButton2 = this.A03;
            Context context = this.A00;
            actionButton2.setColorFilter(AbstractC31174DnI.A09(context, AbstractC53242c7.A0C(context)));
            ViewOnClickListenerC35691FpR.A01(view.requireViewById(R.id.fake_action_bar_back_button), 6, this);
        } else {
            AbstractC31176DnK.A1D(view, R.id.fake_action_bar);
            AbstractC13880nE.A0d(view, C3HB.A00(this.A00));
        }
        if (AbstractC31178DnM.A1X(c06090Tz, this.A04, 36318522627856619L) && (c35151Fet = this.A06.A0B) != null) {
            c35151Fet.A02.EJ5();
            c35151Fet.A02.El3();
        }
        ViewStub A07 = AbstractC31171DnF.A07(view, R.id.send_to_group_button);
        if (A07 != null && AbstractC31178DnM.A1X(c06090Tz, this.A04, 36324320833777768L)) {
            IgdsButton igdsButton = (IgdsButton) A07.inflate();
            this.A08 = igdsButton;
            boolean z = false;
            igdsButton.setVisibility(0);
            IgdsButton igdsButton2 = this.A08;
            if (this.A0B.size() >= 2) {
                z = true;
            }
            igdsButton2.setEnabled(z);
            ViewOnClickListenerC35691FpR.A01(this.A08, 3, this);
        }
    }
}
