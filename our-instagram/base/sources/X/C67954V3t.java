package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.instagram.archive.fragment.ArchiveReelMapFragment;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.discovery.mediamap.fragment.LocationListFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V3t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67954V3t extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C67954V3t(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        String str2;
        String str3;
        List list;
        String A0q;
        VI9 vi9;
        ImmutableList immutableList;
        InterfaceC65563Tmj interfaceC65563Tmj;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1566846075);
                Fragment fragment = (Fragment) this.A01;
                if (!fragment.isResumed()) {
                    i = -2104790927;
                } else {
                    C9GR.A0A(fragment.getContext(), "ArchiveReelMap_error");
                    i = -1443785217;
                }
                C0f9.A0A(i, A03);
                return;
            case 1:
            case Process.SIGSTOP /* 19 */:
            default:
                super.onFail(abstractC115105If);
                return;
            case 2:
                A03 = C0f9.A03(709454382);
                C14360o3.A0B(abstractC115105If, 0);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    C69589Vrs c69589Vrs = (C69589Vrs) this.A02;
                    C50679MYx c50679MYx = (C50679MYx) this.A01;
                    C70075W1s c70075W1s = (C70075W1s) c69589Vrs.A03.getValue();
                    String message = A01.getMessage();
                    C14360o3.A0B(c50679MYx, 0);
                    C70075W1s.A00(c70075W1s, "client_update_cached_info_failure", "client_update_cached_info", c50679MYx.A00, c50679MYx.A01, message);
                }
                i = -456013176;
                C0f9.A0A(i, A03);
                return;
            case 3:
                int A0N = AbstractC167017dG.A0N(abstractC115105If, 1258958086);
                V16 v16 = (V16) this.A02;
                InterfaceC70513Em interfaceC70513Em = v16.A0J;
                if (interfaceC70513Em != null) {
                    if (!(interfaceC70513Em instanceof C71094Wnq)) {
                        C67920V2k c67920V2k = v16.A0B;
                        if (c67920V2k == null) {
                            str2 = "promoteAdToolsAdapter";
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        c67920V2k.A00(v16.A0e);
                    }
                    Throwable A012 = abstractC115105If.A01();
                    if (A012 == null || (str = A012.getMessage()) == null) {
                        str = "Unknown error";
                    }
                    W6I w6i = v16.A07;
                    if (w6i != null) {
                        w6i.A07("promotion_list", "paused", ((C70654Wea) this.A01).BZZ(), str);
                        AbstractC65702TsY.A17(v16);
                        C0f9.A0A(214287944, A0N);
                        return;
                    }
                    str2 = "adsManagerLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "pullToRefresh";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 4:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1812029787);
                V15 v15 = (V15) this.A02;
                InterfaceC70513Em interfaceC70513Em2 = v15.A05;
                if (interfaceC70513Em2 != null) {
                    if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                        SpinnerImageView spinnerImageView = v15.A06;
                        if (spinnerImageView == null) {
                            str2 = "loadingSpinner";
                        } else {
                            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                            C67920V2k c67920V2k2 = v15.A02;
                            if (c67920V2k2 == null) {
                                str2 = "pastPromotionsAdapter";
                            } else {
                                c67920V2k2.A00(v15.A0H);
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    Throwable A013 = abstractC115105If.A01();
                    if (A013 == null || (str3 = A013.getMessage()) == null) {
                        str3 = "Unknown error";
                    }
                    W6I w6i2 = v15.A01;
                    if (w6i2 != null) {
                        w6i2.A07("past_promotion_list", AppStateModule.APP_STATE_ACTIVE, ((C70654Wea) this.A01).BZZ(), str3);
                        AbstractC65702TsY.A17(v15);
                        i = 2004399830;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    str2 = "adsManagerLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "pullToRefresh";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 5:
                A03 = C0f9.A03(557924369);
                ((XCM) this.A02).DGg();
                i = 385940102;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(-1984049779);
                C218109ki c218109ki = (C218109ki) this.A01;
                C88Y c88y = c218109ki.A0B;
                c88y.A00.A05();
                c88y.A0J(c218109ki.A07.getString(2131974056));
                c218109ki.A0D.E4u(new Object());
                i = -36133813;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A03 = C0f9.A03(-691817963);
                Iterator it = ((Wi2) this.A01).A09.iterator();
                while (it.hasNext()) {
                    ((LocationListFragment) it.next()).A07(null);
                }
                i = 466720397;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(-217263588);
                W69.A00((W69) this.A01, (MediaMapQuery) this.A02);
                i = -1287496686;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(1390356015);
                V1W v1w = ((C68849Vd5) this.A02).A00;
                V1W.A02(v1w);
                C67917V2h c67917V2h = v1w.A02;
                if (c67917V2h == null) {
                    str2 = "adapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                ArrayList arrayList = new ArrayList(0);
                c67917V2h.A07 = false;
                c67917V2h.A06 = true;
                c67917V2h.A03.clear();
                c67917V2h.A03.addAll(arrayList);
                C67917V2h.A00(c67917V2h);
                Context requireContext = v1w.requireContext();
                C9GR.A09(requireContext, requireContext.getString(2131962536));
                i = 558677449;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(-1509006011);
                i = 626820802;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(757210392);
                C69651Vss c69651Vss = (C69651Vss) this.A02;
                c69651Vss.A02 = false;
                c69651Vss.A00 = null;
                V01 v01 = (V01) this.A01;
                if (v01.isAdded()) {
                    RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = v01.A02;
                    refreshableRecyclerViewLayout.getClass();
                    if (refreshableRecyclerViewLayout.A0D) {
                        v01.A02.A0A();
                        v01.A06.A09 = false;
                    }
                    JnY jnY = v01.A06;
                    jnY.A05 = C05F.A0C;
                    jnY.A07.clear();
                    jnY.notifyDataSetChanged();
                    if (v01.getContext() != null && v01.isResumed()) {
                        C9GR.A08(v01.getContext(), 2131972429, 1);
                    }
                }
                i = 1400616449;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(458636466);
                XDP xdp = (XDP) this.A01;
                if (xdp != null) {
                    xdp.Ddz();
                }
                i = -2045672616;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(307076943);
                Integer num = C05F.A15;
                C71136WoX c71136WoX = (C71136WoX) this.A01;
                AbstractC69975Vyq.A00(c71136WoX.A01, ((C69427VnC) this.A02).A07, num);
                if ((abstractC115105If instanceof C115115Ig) && (list = ((C40781ul) ((C115115Ig) abstractC115105If).A00).mErrorStrings) != null && !list.isEmpty()) {
                    C9GR.A03(c71136WoX.A00, (CharSequence) AbstractC166987dD.A16(((C40781ul) abstractC115105If.A00()).mErrorStrings), "save_user_error", 1);
                }
                i = -954017447;
                C0f9.A0A(i, A03);
                return;
            case 14:
                A03 = C0f9.A03(-2101722327);
                AbstractC69975Vyq.A00(((C71137WoY) this.A01).A01, ((C69427VnC) this.A02).A07, C05F.A1I);
                i = -804907146;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(1848800517);
                V1V v1v = (V1V) this.A02;
                C9GR.A09(v1v.getContext(), "Error loading QPs");
                v1v.A04.remove(this.A01);
                RefreshableListView refreshableListView = v1v.A03;
                if (refreshableListView != null) {
                    refreshableListView.setIsLoading(!r3.isEmpty());
                }
                i = -780707291;
                C0f9.A0A(i, A03);
                return;
            case 16:
                A03 = C0f9.A03(-1798285580);
                C9GR.A03((Context) this.A01, "Error loading a QP", "qp_debug", 0);
                i = 471439804;
                C0f9.A0A(i, A03);
                return;
            case 17:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1043150333);
                Throwable A014 = abstractC115105If.A01();
                if (!(A014 instanceof VI9) || (vi9 = (VI9) A014) == null || (immutableList = vi9.A00) == null || (interfaceC65563Tmj = (InterfaceC65563Tmj) AbstractC001800i.A0J(immutableList)) == null || (A0q = interfaceC65563Tmj.getDescription()) == null) {
                    A0q = AbstractC166997dE.A0q(((Context) this.A01).getResources(), 2131972429);
                }
                C0w9.A03(C67888V0v.__redex_internal_original_name, A0q);
                i = 1002401260;
                C0f9.A0A(i, A03);
                return;
            case 18:
                A03 = C0f9.A03(720219767);
                WD6 wd6 = (WD6) this.A02;
                C9GR.A0B(wd6.A01, "something_went_wrong");
                LimitedCommentsFragment limitedCommentsFragment = wd6.A04;
                if (limitedCommentsFragment.isAdded()) {
                    C9GR.A0B(limitedCommentsFragment.getContext(), "something_went_wrong");
                    C70083W2b c70083W2b = limitedCommentsFragment.A03.A06;
                    java.util.Set set = c70083W2b.A02;
                    ImmutableSet A032 = ImmutableSet.A03(set);
                    C14360o3.A07(A032);
                    c70083W2b.A00.addAll(A032);
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ((C84923qg) it2.next()).A0P = false;
                    }
                    set.clear();
                    limitedCommentsFragment.A03.A01(limitedCommentsFragment.A01);
                }
                i = 156063780;
                C0f9.A0A(i, A03);
                return;
            case 20:
                A03 = C0f9.A03(-67112419);
                C9GR.A0B(((C38K) this.A01).getRootActivity(), "something_went_wrong");
                i = 255904203;
                C0f9.A0A(i, A03);
                return;
            case 21:
                A03 = C0f9.A03(-73886399);
                if (abstractC115105If.A01() == null) {
                    new Exception("Config fetch failed with an unknown HTTP error");
                }
                C69072VhN c69072VhN = (C69072VhN) this.A02;
                c69072VhN.A00.APm(new C72207XYb(null, (XXq) c69072VhN.A02, false));
                i = 1659538659;
                C0f9.A0A(i, A03);
                return;
            case 22:
                A03 = C0f9.A03(-2146499496);
                Throwable A015 = abstractC115105If.A01();
                if (A015 == null) {
                    A015 = new Exception("CS HTTP request failed with an unknown error");
                }
                C69073VhO c69073VhO = (C69073VhO) this.A02;
                c69073VhO.A00.APm(new C72209XYd(c69073VhO.A01, null, A015.getMessage(), 0, false));
                i = 224422390;
                C0f9.A0A(i, A03);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        int A032;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                A032 = C0f9.A03(1261326873);
                ArchiveReelMapFragment archiveReelMapFragment = (ArchiveReelMapFragment) this.A01;
                if (!archiveReelMapFragment.isResumed()) {
                    i2 = -1327563072;
                } else {
                    C55014OWb c55014OWb = archiveReelMapFragment.mLoadingPillController;
                    if (c55014OWb != null) {
                        c55014OWb.A01();
                    }
                    i2 = -214557230;
                }
                C0f9.A0A(i2, A032);
                return;
            case 1:
                A032 = C0f9.A03(10248038);
                ((C66053Tyq) this.A02).A05 = false;
                i2 = 1108655064;
                C0f9.A0A(i2, A032);
                return;
            case 2:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            default:
                super.onFinish();
                return;
            case 3:
                A03 = C0f9.A03(392167763);
                V16 v16 = (V16) this.A02;
                C3FR c3fr = v16.A0H;
                if (c3fr != null) {
                    c3fr.EWc(false);
                    InterfaceC70513Em interfaceC70513Em = v16.A0J;
                    if (interfaceC70513Em != null) {
                        interfaceC70513Em.setIsLoading(false);
                        SpinnerImageView spinnerImageView = v16.A0K;
                        if (spinnerImageView == null) {
                            str = "loadingSpinner";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                        i = -952426608;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    str = "pullToRefresh";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "recyclerViewProxy";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A03 = C0f9.A03(415164790);
                V15 v15 = (V15) this.A02;
                C3FR c3fr2 = v15.A04;
                if (c3fr2 != null) {
                    c3fr2.EWc(false);
                    InterfaceC70513Em interfaceC70513Em2 = v15.A05;
                    if (interfaceC70513Em2 != null) {
                        interfaceC70513Em2.setIsLoading(false);
                        i = -1320883713;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    str = "pullToRefresh";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "recyclerViewProxy";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A03 = C0f9.A03(1156355477);
                i = -977820184;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A032 = C0f9.A03(1462411892);
                Wi2 wi2 = (Wi2) this.A01;
                wi2.A01 = false;
                Iterator it = wi2.A09.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                i2 = 207446496;
                C0f9.A0A(i2, A032);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(38441120);
                C71136WoX c71136WoX = (C71136WoX) this.A01;
                c71136WoX.A03.A06("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", c71136WoX.A02);
                i = -180936490;
                C0f9.A0A(i, A03);
                return;
            case 14:
                A03 = C0f9.A03(39120559);
                C71137WoY c71137WoY = (C71137WoY) this.A01;
                c71137WoY.A03.A06("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", c71137WoY.A02);
                i = 1128980705;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(182291674);
                AbstractC35261Fgv.A02(((Fragment) this.A01).getActivity());
                i = 1992654091;
                C0f9.A0A(i, A03);
                return;
            case 20:
                A03 = C0f9.A03(1807047697);
                AbstractC35261Fgv.A02(((Fragment) this.A01).getActivity());
                i = -887703044;
                C0f9.A0A(i, A03);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-948133257);
                C55014OWb c55014OWb = ((ArchiveReelMapFragment) this.A01).mLoadingPillController;
                if (c55014OWb != null) {
                    c55014OWb.A02();
                }
                i = 487477388;
                C0f9.A0A(i, A03);
                return;
            case 1:
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                super.onStart();
                return;
            case 3:
                A03 = C0f9.A03(2036570707);
                V16 v16 = (V16) this.A02;
                C3FR c3fr = v16.A0H;
                if (c3fr == null) {
                    str = "recyclerViewProxy";
                } else {
                    c3fr.EWc(true);
                    InterfaceC70513Em interfaceC70513Em = v16.A0J;
                    str2 = "pullToRefresh";
                    if (interfaceC70513Em != null) {
                        interfaceC70513Em.setIsLoading(true);
                        InterfaceC70513Em interfaceC70513Em2 = v16.A0J;
                        if (interfaceC70513Em2 != null) {
                            if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                                C67920V2k c67920V2k = v16.A0B;
                                if (c67920V2k == null) {
                                    str = "promoteAdToolsAdapter";
                                } else {
                                    c67920V2k.A00(new ArrayList());
                                    SpinnerImageView spinnerImageView = v16.A0K;
                                    if (spinnerImageView == null) {
                                        str = "loadingSpinner";
                                    } else {
                                        spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                    }
                                }
                            }
                            i = -1421661845;
                            C0f9.A0A(i, A03);
                            return;
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A03 = C0f9.A03(-1210977727);
                V15 v15 = (V15) this.A02;
                C3FR c3fr2 = v15.A04;
                if (c3fr2 == null) {
                    str2 = "recyclerViewProxy";
                } else {
                    c3fr2.EWc(true);
                    InterfaceC70513Em interfaceC70513Em3 = v15.A05;
                    str = "pullToRefresh";
                    if (interfaceC70513Em3 != null) {
                        interfaceC70513Em3.setIsLoading(true);
                        InterfaceC70513Em interfaceC70513Em4 = v15.A05;
                        if (interfaceC70513Em4 != null) {
                            if (!(interfaceC70513Em4 instanceof C71094Wnq)) {
                                C67920V2k c67920V2k2 = v15.A02;
                                if (c67920V2k2 == null) {
                                    str2 = "pastPromotionsAdapter";
                                } else {
                                    c67920V2k2.A00(new ArrayList());
                                    SpinnerImageView spinnerImageView2 = v15.A06;
                                    if (spinnerImageView2 == null) {
                                        str2 = "loadingSpinner";
                                    } else {
                                        spinnerImageView2.setLoadingStatus(C3T1.LOADING);
                                    }
                                }
                            }
                            i = 1451588404;
                            C0f9.A0A(i, A03);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 7:
                A03 = C0f9.A03(-144779455);
                Wi2 wi2 = (Wi2) this.A01;
                wi2.A01 = true;
                Iterator it = wi2.A09.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                i = -84489988;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(655022701);
                W69 w69 = (W69) this.A01;
                java.util.Set set = w69.A05;
                MediaMapQuery mediaMapQuery = (MediaMapQuery) this.A02;
                set.add(mediaMapQuery);
                Iterator it2 = w69.A06.iterator();
                while (it2.hasNext()) {
                    ((XDN) it2.next()).Do7(w69, mediaMapQuery);
                }
                i = -299794723;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(1311640335);
                ((C69651Vss) this.A02).A02 = true;
                V01 v01 = (V01) this.A01;
                if (v01.isAdded()) {
                    JnY jnY = v01.A06;
                    jnY.A05 = C05F.A00;
                    jnY.A07.clear();
                    jnY.notifyDataSetChanged();
                }
                i = -963149426;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-691633101);
                C56352iT.A0t.A03(((C71136WoX) this.A01).A00).setIsLoading(true);
                i = -116075534;
                C0f9.A0A(i, A03);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x06eb, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0766, code lost:
    
        if (r3.A07.isEmpty() != false) goto L225;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v107, types: [int, java.lang.String] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67954V3t.onSuccess(java.lang.Object):void");
    }
}
