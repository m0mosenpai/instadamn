package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EM4 extends AbstractC59962oe implements InterfaceC37224GaZ, InterfaceViewOnFocusChangeListenerC37281Gbi, GZS, InterfaceC60112ot, InterfaceC37294Gbv {
    public static final String __redex_internal_original_name = "DirectVisualMessageCreateGroupFragment";
    public EnumC33498ErX A00;
    public UserSession A01;
    public G05 A02;
    public C32400EPb A03;
    public C35151Fet A04;
    public IgdsButton A05;
    public C65974TxR A06;
    public String A08;
    public long A09;
    public EditText A0A;
    public DirectShareTarget A0B;
    public String A0C;
    public String A0D;
    public final ArrayList A0E = AbstractC166987dD.A1E();
    public final C169487hO A0F = new C169487hO();
    public String A07 = "";

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return true;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void Cyr(View view) {
    }

    @Override // X.InterfaceC37224GaZ
    public final void DAR(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdK(DirectShareTarget directShareTarget) {
        return false;
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdO(View view) {
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdP() {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void DjA() {
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean EiQ(DirectShareTarget directShareTarget) {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_story_create_group";
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
    }

    public static long A00(EM4 em4, Object obj) {
        int indexOf = em4.A03.A01.indexOf(obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1L;
    }

    public static void A01(EM4 em4) {
        String A0g = AbstractC167007dF.A0g(em4.A0A);
        if (AbstractC34195F6t.A00(em4.requireContext(), A0g, true, true)) {
            AbstractC31176DnK.A0J(em4).ARS(false);
            IgdsButton igdsButton = em4.A05;
            if (igdsButton != null) {
                igdsButton.setEnabled(false);
            }
            ArrayList arrayList = em4.A0E;
            if (arrayList.size() >= 2) {
                AbstractC31557Dth.A01(em4, true);
                UserSession userSession = em4.A01;
                String A00 = AbstractC68470VSb.A00();
                String trim = A0g.trim();
                ArrayList A02 = AbstractC35052FcP.A02(arrayList);
                C14360o3.A0B(userSession, 0);
                EE9.A00(DirectThreadApi.A0C(userSession, A00, trim, A02), em4.A01, em4, 7);
            }
        }
    }

    private void A03(List list) {
        AbstractC31557Dth.A00(this.mView, false);
        C32400EPb c32400EPb = this.A03;
        List list2 = c32400EPb.A01;
        list2.clear();
        list2.addAll(list);
        c32400EPb.A0C();
        this.A04.A02.DyP(list);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        String str3;
        UserSession userSession = this.A01;
        String str4 = this.A07;
        if (TextUtils.isEmpty(str)) {
            str3 = "raven";
        } else {
            str3 = "default_no_interop";
        }
        return AbstractC34779FUd.A00(userSession, str4, str3, null, null, 0, 0, 0, 0, false);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Cci(DirectShareTarget directShareTarget) {
        return this.A0E.contains(directShareTarget);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Ceu(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = this.A0B;
        if (directShareTarget2 != null && directShareTarget2.equals(directShareTarget)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdF(DirectShareTarget directShareTarget) {
        EnumC33491ErQ enumC33491ErQ;
        int i = 0;
        if (this.A03.A01.indexOf(directShareTarget) >= 0) {
            i = 6;
        }
        UserSession userSession = this.A01;
        String A00 = AbstractC34051F1e.A00(i);
        String A08 = directShareTarget.A08();
        long A002 = A00(this, directShareTarget);
        long A003 = A00(this, directShareTarget);
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A0C;
        if (!TextUtils.isEmpty(str.trim())) {
            enumC33491ErQ = EnumC33491ErQ.CREATE_GROUP_QUERY_STATE;
        } else {
            enumC33491ErQ = EnumC33491ErQ.CREATE_GROUP_NULL_STATE;
        }
        C162337Ov.A0C(enumC33491ErQ, this, userSession, directShareTarget, A00, A08, "recipient_bar", str, str2, null, str3, null, null, null, "DIRECT_RESHARE_SHEET", A002, A003);
        ArrayList arrayList = this.A0E;
        arrayList.add(directShareTarget);
        this.A04.A01(arrayList, true);
        A02(this);
    }

    @Override // X.InterfaceC37224GaZ
    public final void DdG(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        int i4;
        long j;
        EnumC33491ErQ enumC33491ErQ;
        int indexOf = this.A03.A01.indexOf(directShareTarget);
        if (indexOf >= 0) {
            i4 = 6;
            j = indexOf;
        } else {
            i4 = 0;
            j = -1;
        }
        G05 g05 = this.A02;
        if (g05 != null) {
            UserSession userSession = this.A01;
            long j2 = this.A09;
            String str = this.A0C;
            if (!TextUtils.isEmpty(this.A07.trim())) {
                enumC33491ErQ = EnumC33491ErQ.CREATE_GROUP_QUERY_STATE;
            } else {
                enumC33491ErQ = EnumC33491ErQ.CREATE_GROUP_NULL_STATE;
            }
            g05.A0A(enumC33491ErQ, this, userSession, directShareTarget, str, this.A0D, null, this.A07, null, i4, j, j, j2, false);
        }
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdH(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        ArrayList arrayList = this.A0E;
        if (!arrayList.contains(directShareTarget)) {
            Context requireContext = requireContext();
            UserSession userSession = this.A01;
            if (arrayList.size() + 1 < 250) {
                DdF(directShareTarget);
                return true;
            }
            C162337Ov.A0M(this, userSession);
            C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
            UserSession userSession2 = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A1W = AbstractC31178DnM.A1W(c06090Tz, userSession2);
            int i4 = 2131959851;
            if (A1W) {
                i4 = 2131959850;
            }
            A0I.A0A(i4);
            Resources resources = requireContext.getResources();
            boolean A1W2 = AbstractC31178DnM.A1W(c06090Tz, this.A01);
            int i5 = R.plurals.direct_group_max_size;
            if (A1W2) {
                i5 = R.plurals.direct_chat_max_size;
            }
            A0I.A0r(AbstractC31175DnJ.A0W(resources, 249, i5, 249));
            AbstractC31176DnK.A1W(A0I);
            return false;
        }
        DdL(directShareTarget);
        return true;
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdL(DirectShareTarget directShareTarget) {
        int i = 0;
        if (this.A03.A01.indexOf(directShareTarget) >= 0) {
            i = 6;
        }
        C162337Ov.A0H(this, this.A01, directShareTarget, AbstractC34051F1e.A00(i), directShareTarget.A08(), "recipient_bar", null, this.A0C, null, null, null, "DIRECT_RESHARE_SHEET", A00(this, directShareTarget), A00(this, directShareTarget));
        ArrayList arrayList = this.A0E;
        arrayList.remove(directShareTarget);
        this.A04.A01(arrayList, false);
        A02(this);
        DjT("", false);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        AbstractC31557Dth.A00(this.mView, false);
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C32214EDn c32214EDn = (C32214EDn) interfaceC40821up;
        if (this.A07.equals(str)) {
            A03(AbstractC31677Dvi.A02(AbstractC166987dD.A1F(c32214EDn.A05)));
        }
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(C106904rr.A00(this.A01));
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        this.A07 = str;
        C9JQ BjP = this.A0F.BjP(str);
        int intValue = BjP.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    A03(AbstractC31677Dvi.A02(BjP.A06));
                    return;
                }
                return;
            }
            A03(AbstractC31677Dvi.A02(BjP.A06));
        } else {
            AbstractC31557Dth.A01(this, true);
        }
        this.A06.A06(this.A07);
    }

    public static void A02(EM4 em4) {
        FragmentActivity activity = em4.getActivity();
        if (activity != null) {
            boolean z = false;
            if (em4.A0E.size() >= 2) {
                z = true;
            }
            C56352iT.A0t.A03(activity).ARS(z);
            IgdsButton igdsButton = em4.A05;
            if (igdsButton != null) {
                igdsButton.setEnabled(z);
            }
        }
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DjT(String str, boolean z) {
        String A01 = AbstractC13670mt.A01(str.toLowerCase());
        A01.getClass();
        searchTextChanged(A01);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131959970);
        boolean z = true;
        interfaceC56362iU.EkT(new ViewOnClickListenerC35680FpF(this, 41), true);
        if (!AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36324320833777768L)) {
            ActionButton Eha = interfaceC56362iU.Eha(new ViewOnClickListenerC35680FpF(this, 42), R.drawable.instagram_check_pano_outline_24);
            if (this.A0E.size() < 2) {
                z = false;
            }
            Eha.setEnabled(z);
            AbstractC31172DnG.A1E(AbstractC166997dE.A0N(this), Eha, 2131959973);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        int A02 = C0f9.A02(-265355883);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A01 = A0S;
        Integer num = C05F.A0C;
        C169487hO c169487hO = this.A0F;
        C14360o3.A0B(c169487hO, 0);
        this.A06 = AbstractC65980TxZ.A01(A0S, this, null, this, c169487hO, num, false);
        this.A03 = new C32400EPb(requireContext(), this, this.A01, this);
        this.A08 = AbstractC166997dE.A0n();
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        synchronized (userSession.A01(G02.class, new MHI(userSession, 38))) {
        }
        C32400EPb c32400EPb = this.A03;
        c32400EPb.A01.clear();
        c32400EPb.A0C();
        AbstractC31557Dth.A00(this.mView, true);
        this.A06.A06(this.A07);
        C35151Fet c35151Fet = this.A04;
        if (c35151Fet != null) {
            c35151Fet.A02.EK2();
        }
        String string = requireArguments.getString("DirectVisualMessageCreateGroupFragment.DIRECT_MODULE");
        if (string != null) {
            this.A02 = FV2.A00(AbstractC31171DnF.A0D(string), this.A01);
        }
        this.A09 = requireArguments.getLong("DirectVisualMessageCreateGroupFragment.MEDIA_TYPE_LOGGING_VALUE", -1L);
        this.A0D = requireArguments.getString("DirectVisualMessageCreateGroupFragment.SEND_TYPE_LOGGING_VALUE", null);
        this.A0C = requireArguments.getString("DirectVisualMessageCreateGroupFragment.REQUEST_ID_LOGGING_VALUE", null);
        this.A00 = (EnumC33498ErX) requireArguments.getSerializable("bundle_extra_serializable_group_creation_entry_point");
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36324320833777768L)) {
                AbstractC31180DnO.A1A(this);
            }
        }
        if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36324320833712231L) && (parcelableArrayList = requireArguments.getParcelableArrayList("bundle_extra_parcelable_new_group_selected_recipients")) != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                this.A0E.add(new DirectShareTarget(AbstractC31172DnG.A0p(it)));
            }
        }
        C0f9.A09(-1499525894, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1853287512);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_expiring_media_create_group_fragment_layout);
        C0f9.A09(143649107, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1474046112);
        super.onDestroy();
        G05 g05 = this.A02;
        if (g05 != null) {
            g05.A09();
        }
        C0f9.A09(1677794411, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((AbsListView) view.requireViewById(android.R.id.list)).setAdapter((ListAdapter) this.A03);
        ViewGroup viewGroup = (ViewGroup) AbstractC167017dG.A0U(view, R.id.user_search_bar_stub);
        AbstractC13880nE.A0d(view, C3HB.A00(requireContext()));
        requireContext();
        this.A04 = new C35151Fet(viewGroup, this.A01, this);
        this.A0A = AbstractC31173DnH.A0H(view, R.id.group_name);
        A02(this);
        C006802i.A0p.markerEnd(145766898, (short) 2);
        ArrayList arrayList = this.A0E;
        boolean z = true;
        if (!arrayList.isEmpty()) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36324320833712231L)) {
                this.A04.A01(arrayList, true);
            }
        }
        ViewStub A07 = AbstractC31171DnF.A07(view, R.id.send_to_group_button);
        if (A07 != null) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36324320833777768L)) {
                IgdsButton igdsButton = (IgdsButton) A07.inflate();
                this.A05 = igdsButton;
                igdsButton.setVisibility(0);
                IgdsButton igdsButton2 = this.A05;
                if (arrayList.size() < 2) {
                    z = false;
                }
                igdsButton2.setEnabled(z);
                C0fQ.A00(new ViewOnClickListenerC35680FpF(this, 40), this.A05);
            }
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        int A02 = C0f9.A02(1962186496);
        super.onViewStateRestored(bundle);
        InterfaceC37232Gah interfaceC37232Gah = this.A04.A02;
        if (interfaceC37232Gah != null) {
            interfaceC37232Gah.E0x();
        }
        C0f9.A09(1304872437, A02);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdN(DirectShareTarget directShareTarget) {
        this.A0B = directShareTarget;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
