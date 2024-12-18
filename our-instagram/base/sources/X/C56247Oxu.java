package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.NonprofitSelectorSurfaceEnum;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oxu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56247Oxu implements MSD, InterfaceC62612t0, MOQ, InterfaceC50496MQz, InterfaceC37188GZz, InterfaceC37294Gbv {
    public static final String __redex_internal_original_name = "FundraiserStickerSearchController";
    public View A00;
    public C51162Mj5 A02;
    public C31543DtT A03;
    public String A04;
    public ViewOnFocusChangeListenerC44078Je3 A06;
    public final Activity A08;
    public final Context A09;
    public final ViewStub A0A;
    public final C07X A0B;
    public final InterfaceC11380iw A0C;
    public final UserSession A0D;
    public final InterfaceC186118Nf A0E;
    public final Boolean A0F;
    public final String A0G;
    public final NonprofitSelectorSurfaceEnum A0K;
    public final C65974TxR A0L;
    public final InterfaceC169497hP A0M;
    public final java.util.Set A0J = AbstractC166987dD.A1H();
    public final List A0I = AbstractC166987dD.A1E();
    public final List A0H = AbstractC166987dD.A1E();
    public RecyclerView A01 = null;
    public String A05 = "";
    public Boolean A07 = false;

    public C56247Oxu(Activity activity, ViewStub viewStub, C07X c07x, NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC186118Nf interfaceC186118Nf, Boolean bool, String str) {
        Context context = viewStub.getContext();
        this.A09 = context;
        this.A0B = c07x;
        this.A0D = userSession;
        this.A0A = viewStub;
        this.A0E = interfaceC186118Nf;
        this.A0K = nonprofitSelectorSurfaceEnum;
        this.A0G = str;
        this.A0C = interfaceC11380iw;
        context.getColor(R.color.fundraiser_search_background_tint_color);
        this.A0F = bool;
        this.A08 = activity;
        C169487hO c169487hO = new C169487hO();
        this.A0M = c169487hO;
        this.A0L = AbstractC65980TxZ.A01(userSession, null, null, this, c169487hO, C05F.A0C, false);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.InterfaceC50496MQz
    public final void CxO() {
    }

    @Override // X.InterfaceC50496MQz
    public final void CxP() {
    }

    @Override // X.InterfaceC50496MQz
    public final void CxR(String str) {
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

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.MSD
    public final void E2K() {
        if (this.A00 == null) {
            View inflate = this.A0A.inflate();
            this.A00 = inflate;
            this.A0J.add(inflate);
            this.A01 = AbstractC31172DnG.A0G(this.A00, R.id.fundraiser_recipient_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.A00.getContext());
            this.A01.setLayoutManager(linearLayoutManager);
            C07X c07x = this.A0B;
            UserSession userSession = this.A0D;
            C31543DtT c31543DtT = new C31543DtT(c07x, userSession, this);
            this.A03 = c31543DtT;
            C51162Mj5 c51162Mj5 = new C51162Mj5(this.A08, this.A0C, userSession, this, this, c31543DtT, this.A0F, this.A0G);
            this.A02 = c51162Mj5;
            this.A01.setAdapter(c51162Mj5);
            this.A01.A14(new C153156uj(linearLayoutManager, this, C153146ui.A0G));
            View view = this.A00;
            view.getClass();
            this.A06 = new ViewOnFocusChangeListenerC44078Je3(view.requireViewById(R.id.search_bar_container), userSession, this, this);
        }
        A01(this);
        this.A0I.clear();
        this.A0H.clear();
        this.A0M.clear();
        this.A05 = "";
        C31543DtT c31543DtT2 = this.A03;
        c31543DtT2.getClass();
        c31543DtT2.A02 = true;
        this.A0L.A06(this.A05);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fundraiser_sticker_search";
    }

    private void A00() {
        if (!this.A07.booleanValue()) {
            UserSession userSession = this.A0D;
            C51162Mj5 c51162Mj5 = this.A02;
            c51162Mj5.getClass();
            List list = c51162Mj5.A02;
            String str = this.A0G;
            C18920wW A01 = AbstractC12220kQ.A01(this.A0C, userSession);
            StringBuilder A1C = AbstractC166987dD.A1C();
            HashMap A1G = AbstractC166987dD.A1G();
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A1C.append(AbstractC166987dD.A1B(it));
                    A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                A1C.deleteCharAt(A1C.length() - 1);
                A1G.put("standalone_fundraiser_ids", A1C.toString());
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_cg_view_nonprofit_selector_nullstate");
            A0f.AAP("source_name", str);
            A0f.A9M("attributes", A1G);
            A0f.Cht();
            this.A07 = AbstractC166997dE.A0b();
        }
    }

    public static void A01(C56247Oxu c56247Oxu) {
        C51162Mj5 c51162Mj5 = c56247Oxu.A02;
        c51162Mj5.getClass();
        c51162Mj5.A01 = false;
        c51162Mj5.A05.clear();
        c51162Mj5.A06.clear();
        c51162Mj5.A04.clear();
        c51162Mj5.A03.clear();
        c51162Mj5.A01();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C31543DtT c31543DtT = this.A03;
        c31543DtT.getClass();
        if (c31543DtT.CLJ()) {
            Chd();
        }
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C222015v c222015v;
        C25621Ms A0M;
        C31543DtT c31543DtT = this.A03;
        c31543DtT.getClass();
        c31543DtT.A01 = false;
        String str3 = this.A0M.BjP(str).A03;
        boolean isEmpty = TextUtils.isEmpty(str);
        UserSession userSession = this.A0D;
        if (isEmpty) {
            NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum = this.A0K;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(nonprofitSelectorSurfaceEnum, 1);
            c222015v = null;
            A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("fundraiser/story_charities_nullstate/");
            A0M.A9s("surface", nonprofitSelectorSurfaceEnum.toString());
        } else {
            C14360o3.A0B(userSession, 0);
            c222015v = null;
            A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("fundraiser/story_charities_search/");
            A0M.A9s("query", str);
        }
        A0M.A0P(c222015v, HBE.class, C41335IRg.class, false);
        if (str3 != null) {
            A0M.A9s("max_id", str3);
        }
        return A0M.A0N();
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0J;
    }

    @Override // X.MOQ
    public final Integer Acu() {
        return C05F.A01;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        C51162Mj5 c51162Mj5 = this.A02;
        if (c51162Mj5 != null && c51162Mj5.A00() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        C31543DtT c31543DtT = this.A03;
        c31543DtT.getClass();
        c31543DtT.A02 = true;
        this.A0L.A03(this.A05);
    }

    @Override // X.InterfaceC50496MQz
    public final void CxQ(String str) {
        List list;
        if (!str.equals(this.A05)) {
            this.A05 = str;
            C9JQ BjP = this.A0M.BjP(str);
            if (BjP.A01 == C05F.A0C && (list = BjP.A06) != null) {
                C31543DtT c31543DtT = this.A03;
                c31543DtT.getClass();
                c31543DtT.A02 = false;
                this.A03.A00 = BjP.A03;
                boolean isEmpty = TextUtils.isEmpty(this.A05);
                C51162Mj5 c51162Mj5 = this.A02;
                c51162Mj5.getClass();
                if (isEmpty) {
                    String str2 = this.A04;
                    c51162Mj5.A01 = false;
                    List list2 = c51162Mj5.A05;
                    list2.clear();
                    list2.addAll(list);
                    c51162Mj5.A00 = str2;
                    C51162Mj5 c51162Mj52 = this.A02;
                    List list3 = this.A0H;
                    c51162Mj52.A01 = false;
                    List list4 = c51162Mj52.A03;
                    list4.clear();
                    list4.addAll(list3);
                    C51162Mj5 c51162Mj53 = this.A02;
                    List list5 = this.A0I;
                    c51162Mj53.A01 = false;
                    List list6 = c51162Mj53.A04;
                    list6.clear();
                    list6.addAll(list5);
                } else {
                    c51162Mj5.A01 = true;
                    List list7 = c51162Mj5.A06;
                    list7.clear();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC43594JPz.A1Q(it.next(), list7);
                    }
                }
                this.A02.A01();
                A00();
                return;
            }
            A01(this);
            C31543DtT c31543DtT2 = this.A03;
            c31543DtT2.getClass();
            c31543DtT2.A00 = null;
            this.A03.A02 = true;
            this.A0L.A06(this.A05);
        }
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        AbstractC55215Oed.A01(this, this.A0D, MSW.A0y("Fundraiser sticker search recipient fetch failed."), null);
        C31543DtT c31543DtT = this.A03;
        c31543DtT.getClass();
        c31543DtT.A01 = true;
        C9GR.A0F(this.A09, "fundraiser_sticker_search_error", 2131962997);
        C51162Mj5 c51162Mj5 = this.A02;
        c51162Mj5.getClass();
        c51162Mj5.notifyDataSetChanged();
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        if (str.equals(this.A05)) {
            C31543DtT c31543DtT = this.A03;
            c31543DtT.getClass();
            c31543DtT.A02 = false;
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        HBE hbe = (HBE) interfaceC40821up;
        this.A04 = hbe.A01;
        if (str.equals(this.A05)) {
            if (hbe.A05.isEmpty() && hbe.A07) {
                AbstractC55215Oed.A01(this, this.A0D, MSW.A0y("Fundraiser sticker search recipient fetch succeeded, but returned empty list of recipients."), null);
                C31543DtT c31543DtT = this.A03;
                c31543DtT.getClass();
                c31543DtT.A01 = true;
                C9GR.A0F(this.A09, "fundraiser_sticker_search_error", 2131962997);
                C51162Mj5 c51162Mj5 = this.A02;
                c51162Mj5.getClass();
                c51162Mj5.notifyDataSetChanged();
                return;
            }
            C31543DtT c31543DtT2 = this.A03;
            c31543DtT2.getClass();
            c31543DtT2.A00 = hbe.A00;
            this.A02.getClass();
            boolean isEmpty = TextUtils.isEmpty(str);
            int A00 = this.A02.A00();
            if (!isEmpty) {
                C51162Mj5 c51162Mj52 = this.A02;
                List list = hbe.A05;
                if (A00 == 0) {
                    c51162Mj52.A01 = true;
                    List list2 = c51162Mj52.A06;
                    list2.clear();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC43594JPz.A1Q(it.next(), list2);
                    }
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AbstractC43594JPz.A1Q(it2.next(), c51162Mj52.A06);
                    }
                }
            } else if (A00 == 0) {
                List list3 = this.A0I;
                list3.clear();
                List list4 = this.A0H;
                list4.clear();
                List list5 = hbe.A03;
                if (list5 != null) {
                    list3.addAll(list5);
                }
                List list6 = hbe.A02;
                if (list6 != null) {
                    list4.addAll(list6);
                }
                C51162Mj5 c51162Mj53 = this.A02;
                c51162Mj53.A01 = false;
                List list7 = c51162Mj53.A03;
                list7.clear();
                list7.addAll(list4);
                C51162Mj5 c51162Mj54 = this.A02;
                c51162Mj54.A01 = false;
                List list8 = c51162Mj54.A04;
                list8.clear();
                list8.addAll(list3);
                C51162Mj5 c51162Mj55 = this.A02;
                List list9 = hbe.A05;
                String str2 = this.A04;
                c51162Mj55.A01 = false;
                List list10 = c51162Mj55.A05;
                list10.clear();
                list10.addAll(list9);
                c51162Mj55.A00 = str2;
            } else {
                C51162Mj5 c51162Mj56 = this.A02;
                c51162Mj56.A05.addAll(hbe.A05);
            }
            this.A02.A01();
            A00();
        }
    }

    @Override // X.InterfaceC50496MQz
    public final /* synthetic */ boolean EiJ() {
        return true;
    }

    @Override // X.MSD
    public final void close() {
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A06;
        if (viewOnFocusChangeListenerC44078Je3 != null) {
            viewOnFocusChangeListenerC44078Je3.A01();
            viewOnFocusChangeListenerC44078Je3.A02();
        }
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
