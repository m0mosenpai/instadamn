package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import go.Seq;
import instagram.features.stories.fragment.ReelResharesViewerFragment;
import java.util.List;

/* renamed from: X.HGg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39030HGg extends C1P1 {
    public final int A00;
    public final Object A01;

    public C39030HGg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C1ON c1on, Object obj, int i) {
        c1on.A00 = new C39030HGg(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int i2;
        String str;
        String str2;
        List list;
        String str3;
        int A032;
        int i3;
        RefreshableListView refreshableListView;
        int i4;
        C53093Ne6 c53093Ne6;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(729751111);
                synchronized (C41575IaO.A03) {
                    try {
                        C41575IaO.A02 = false;
                        C41575IaO.A01 = null;
                    } finally {
                    }
                }
                C42349IpB c42349IpB = (C42349IpB) this.A01;
                C1ON c1on = c42349IpB.A00;
                if (c1on != null) {
                    c1on.A00 = null;
                }
                c42349IpB.A00 = null;
                i = 2069344129;
                C0f9.A0A(i, A03);
                return;
            case 1:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            default:
                super.onFail(abstractC115105If);
                return;
            case 2:
                A03 = C0f9.A03(1590441320);
                C14360o3.A0B(abstractC115105If, 0);
                C40791um c40791um = (C40791um) abstractC115105If.A00();
                if (c40791um != null) {
                    i2 = c40791um.mStatusCode;
                } else {
                    i2 = 0;
                }
                IGR igr = (IGR) this.A01;
                C42947Iyz c42947Iyz = igr.A02;
                long elapsedRealtime = SystemClock.elapsedRealtime() - igr.A01;
                C42952Iz4 c42952Iz4 = c42947Iyz.A00;
                c42952Iz4.A0C.CiD(i2, c42952Iz4.A06, elapsedRealtime);
                c42952Iz4.A06 = false;
                EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
                java.util.Set set = c42952Iz4.A04;
                if (set != null) {
                    c42952Iz4.A0D.FCF(enumC74603Ws, set);
                    c42952Iz4.A04 = null;
                }
                i = -1677951365;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -889196233);
                H8D h8d = (H8D) this.A01;
                C25671My A00 = AbstractC25651Mw.A00(h8d.A00);
                C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
                if (c40781ul != null) {
                    str = c40781ul.getErrorMessage();
                } else {
                    str = null;
                }
                A00.E4s(new C42258Ini(null, null, str, h8d.A01.getId(), true));
                i = -1870705925;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A03 = C0f9.A03(-518870598);
                C14360o3.A0B(abstractC115105If, 0);
                H8D h8d2 = (H8D) this.A01;
                C25671My A002 = AbstractC25651Mw.A00(h8d2.A00);
                C40781ul c40781ul2 = (C40781ul) abstractC115105If.A00();
                if (c40781ul2 != null) {
                    str2 = c40781ul2.getErrorMessage();
                } else {
                    str2 = null;
                }
                A002.E4s(new C42258Ini(null, null, str2, h8d2.A01.getId(), false));
                i = 1738211923;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(1363314596);
                C38286GsV c38286GsV = (C38286GsV) this.A01;
                c38286GsV.A0G.A04.A03(null, C05F.A0C, c38286GsV.A0I);
                c38286GsV.A0F.Dfp();
                i = -992689147;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1845228332);
                super.onFail(abstractC115105If);
                HYH.A02(EnumC27382C6l.A02, (HYH) this.A01);
                i = 1951846595;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1501755278);
                super.onFail(abstractC115105If);
                HYH hyh = (HYH) this.A01;
                C51755Mte c51755Mte = (C51755Mte) ((C51761Mtk) hyh.A01.getValue()).A00;
                if (c51755Mte == null || (list = (List) c51755Mte.A00) == null || list.isEmpty()) {
                    HYH.A02(EnumC27382C6l.A02, hyh);
                }
                HYH.A02(EnumC27382C6l.A05, hyh);
                i = -1910924962;
                C0f9.A0A(i, A03);
                return;
            case 14:
                A03 = C0f9.A03(-2036191933);
                HD4 hd4 = ((C41188ILb) this.A01).A00;
                RefreshableListView refreshableListView2 = hd4.A0D;
                if (refreshableListView2 != null) {
                    refreshableListView2.setIsLoading(false);
                }
                EmptyStateView emptyStateView = hd4.A0C;
                if (emptyStateView != null) {
                    emptyStateView.A0J();
                }
                i = 549939450;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-4421526);
                C27277C2c c27277C2c = (C27277C2c) ((C28693Clf) this.A01).A01;
                c27277C2c.setItems(C27277C2c.A00(c27277C2c));
                C9GR.A0D(c27277C2c.getContext(), "add_donate_action_failed");
                i = 1057781702;
                C0f9.A0A(i, A03);
                return;
            case 16:
                A03 = C0f9.A03(1370177172);
                i = 912894228;
                C0f9.A0A(i, A03);
                return;
            case 17:
                A03 = C0f9.A03(-1532704877);
                C14360o3.A0B(abstractC115105If, 0);
                IM9 im9 = (IM9) this.A01;
                im9.A00 = C05F.A01;
                HCR hcr = im9.A02;
                InterfaceC70513Em interfaceC70513Em = hcr.A01;
                if (interfaceC70513Em == null) {
                    str3 = "pullToRefresh";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                interfaceC70513Em.setIsLoading(false);
                ((C42881Ixv) hcr.A08.getValue()).FAs();
                i = 1055286001;
                C0f9.A0A(i, A03);
                return;
            case 18:
                A03 = C0f9.A03(-203714715);
                ((JHO) this.A01).DFf();
                i = -385260374;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGSTOP /* 19 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -717395720);
                super.onFail(abstractC115105If);
                i = -882461915;
                C0f9.A0A(i, A03);
                return;
            case 20:
                A032 = C0f9.A03(206522362);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                J1K j1k = (J1K) this.A01;
                j1k.A00 = C05F.A01;
                ID4 id4 = j1k.A04;
                Throwable A01 = abstractC115105If.A01();
                HCN hcn = id4.A00;
                InterfaceC43455JHt interfaceC43455JHt = hcn.A05;
                if (interfaceC43455JHt == null) {
                    str3 = "emptyStateController";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                interfaceC43455JHt.FAs();
                HEU heu = hcn.A02;
                if (heu != null) {
                    heu.A00();
                    C9GR.A01(hcn.getContext(), "brand_selection_failed", 2131970016, 0);
                    C41762Ied c41762Ied = hcn.A03;
                    if (c41762Ied != null) {
                        c41762Ied.A09(HCN.A0D, A01);
                        i3 = -610488113;
                        C0f9.A0A(i3, A032);
                        return;
                    }
                    str3 = "logger";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                str3 = "adapter";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 21:
                A03 = C0f9.A03(1411481523);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                IMJ imj = (IMJ) this.A01;
                imj.A00 = C05F.A01;
                ID5 id5 = imj.A02;
                Throwable A012 = abstractC115105If.A01();
                HD9 hd9 = id5.A00;
                HD9.A01(hd9, EnumC153216up.A04);
                C9GR.A01(hd9.getContext(), "catalog_network_error", 2131970016, 0);
                C41762Ied c41762Ied2 = hd9.A03;
                if (c41762Ied2 != null) {
                    c41762Ied2.A09(HD9.A0N, A012);
                    if (hd9.A0B && (refreshableListView = hd9.A06) != null) {
                        refreshableListView.setIsLoading(false);
                    }
                    i = 364896331;
                    C0f9.A0A(i, A03);
                    return;
                }
                str3 = "logger";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 24:
                A03 = C0f9.A03(1734125563);
                i = -1273470853;
                C0f9.A0A(i, A03);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 1690259239);
                Throwable A013 = abstractC115105If.A01();
                if (A013 != null) {
                    C41210ILz c41210ILz = (C41210ILz) this.A01;
                    Context context = c41210ILz.A00;
                    C146106i8 A0X = AbstractC31173DnH.A0X(AbstractC166997dE.A0p(context, 2131965151));
                    A0X.A06();
                    A0X.A05();
                    A0X.A0H = "auto_enroll_limited_interactions_retry";
                    AbstractC31175DnJ.A0l(context, A0X, 2131972568);
                    A0X.A0L = true;
                    A0X.A0A(new C42690Iul(c41210ILz, 3));
                    AbstractC31178DnM.A1S(A0X);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41210ILz.A01.A00, "limits_feature_api_call");
                    if (A0f.isSampled()) {
                        if ((A013 instanceof C53093Ne6) && (c53093Ne6 = (C53093Ne6) A013) != null) {
                            i4 = c53093Ne6.A00;
                        } else {
                            i4 = -1;
                        }
                        A0f.AAP("surface_type", "mass_harassment_auto_enroll_qp");
                        A0f.A9K(TraceFieldType.ErrorCode, AbstractC31171DnF.A0V(i4));
                        A0f.AAP("error_info", A013.getMessage());
                        A0f.Cht();
                    }
                }
                i3 = -94011660;
                C0f9.A0A(i3, A032);
                return;
            case 39:
                A03 = C0f9.A03(159584440);
                i = -15277141;
                C0f9.A0A(i, A03);
                return;
            case 40:
                int A033 = C0f9.A03(1951066520);
                HDE hde = (HDE) this.A01;
                C31543DtT c31543DtT = hde.A05;
                str3 = "paginationHelper";
                if (c31543DtT != null) {
                    c31543DtT.A01 = true;
                    if (c31543DtT.CLJ()) {
                        HEE hee = hde.A06;
                        if (hee != null) {
                            C0fA.A00(hee, -950132723);
                        }
                        str3 = "adapter";
                    }
                    C9GR.A03(hde.getActivity(), AbstractC25227BEk.A0v(hde, 2131972429), "fetchData_request_error", 1);
                    C0f9.A0A(1229952623, A033);
                    return;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case Seq.NULL_REFNUM /* 41 */:
                A03 = C0f9.A03(1318719187);
                ReelResharesViewerFragment reelResharesViewerFragment = (ReelResharesViewerFragment) this.A01;
                C31543DtT c31543DtT2 = reelResharesViewerFragment.A00;
                if (c31543DtT2 == null) {
                    str3 = "listPaginationHelper";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                c31543DtT2.A01 = true;
                ReelResharesViewerFragment.A02(reelResharesViewerFragment);
                i = -1529584659;
                C0f9.A0A(i, A03);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(1046730201);
                HDD hdd = (HDD) this.A01;
                C31543DtT c31543DtT3 = hdd.A05;
                str3 = "paginationHelper";
                if (c31543DtT3 != null) {
                    c31543DtT3.A01 = true;
                    if (c31543DtT3.CLJ()) {
                        HEF hef = hdd.A06;
                        if (hef != null) {
                            C0fA.A00(hef, 116243555);
                        }
                        str3 = "adapter";
                    }
                    C9GR.A03(hdd.requireActivity(), AbstractC25227BEk.A0v(hdd, 2131972429), "fetchData_request_error", 1);
                    i = -1773855623;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 43:
                A03 = C0f9.A03(1461639161);
                HDB hdb = (HDB) this.A01;
                C31543DtT c31543DtT4 = hdb.A06;
                c31543DtT4.A01 = true;
                if (c31543DtT4.CLJ()) {
                    C0fA.A00(hdb.A00, -1379224368);
                }
                C9GR.A03(hdb.getActivity(), hdb.getString(2131972429), "createPollVotersListTask_request_error", 1);
                i = 1490224664;
                C0f9.A0A(i, A03);
                return;
            case 44:
                A03 = C0f9.A03(1187288168);
                HDB hdb2 = (HDB) this.A01;
                C31543DtT c31543DtT5 = hdb2.A06;
                c31543DtT5.A01 = true;
                if (c31543DtT5.CLJ()) {
                    C0fA.A00(hdb2.A00, 449905031);
                }
                C9GR.A03(hdb2.getActivity(), hdb2.getString(2131972429), "fetchData_request_error", 1);
                i = 1600603352;
                C0f9.A0A(i, A03);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 8:
                A03 = C0f9.A03(-1646812541);
                AdBakeOffFragment adBakeOffFragment = (AdBakeOffFragment) this.A01;
                adBakeOffFragment.requireActivity().runOnUiThread(new J37(adBakeOffFragment));
                i = -178487997;
                break;
            case 9:
                A03 = C0f9.A03(-1692103774);
                GenericSurveyFragment genericSurveyFragment = (GenericSurveyFragment) this.A01;
                genericSurveyFragment.requireActivity().runOnUiThread(new J38(genericSurveyFragment));
                i = 1079386635;
                break;
            default:
                super.onFailInBackground(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(-1981799509);
                ((IGR) this.A01).A02.A00.A03 = C05F.A00;
                i = 2139725894;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(-17071130);
                ((C38286GsV) this.A01).A0F.Dfz();
                i = -402261609;
                C0f9.A0A(i, A03);
                return;
            case 34:
                A03 = C0f9.A03(-1029038603);
                IgdsMediaButton igdsMediaButton = ((C37897Gls) this.A01).A03;
                if (igdsMediaButton != null) {
                    igdsMediaButton.setEnabled(true);
                }
                i = 928490623;
                C0f9.A0A(i, A03);
                return;
            case 35:
                A03 = C0f9.A03(-1021486281);
                IgdsMediaButton igdsMediaButton2 = ((C37897Gls) this.A01).A03;
                if (igdsMediaButton2 != null) {
                    igdsMediaButton2.setEnabled(true);
                }
                i = -999036823;
                C0f9.A0A(i, A03);
                return;
            case 40:
                A03 = C0f9.A03(-943845533);
                HDE hde = (HDE) this.A01;
                C31543DtT c31543DtT = hde.A05;
                if (c31543DtT != null) {
                    c31543DtT.A02 = false;
                    AbstractC31177DnL.A18(hde, C56352iT.A0t, false);
                    HEE hee = hde.A06;
                    if (hee != null) {
                        if (hee.A03.isEmpty()) {
                            HDE.A03(hde);
                        }
                        i = -630029094;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    str = "adapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "paginationHelper";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(-1833765841);
                HDD hdd = (HDD) this.A01;
                C31543DtT c31543DtT2 = hdd.A05;
                if (c31543DtT2 != null) {
                    c31543DtT2.A02 = false;
                    AbstractC31178DnM.A10(hdd, false);
                    HEF hef = hdd.A06;
                    if (hef != null) {
                        if (hef.A03.isEmpty()) {
                            HDD.A03(hdd);
                        }
                        i = 478475984;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    str = "adapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "paginationHelper";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 43:
                A03 = C0f9.A03(-692141401);
                HDB hdb = (HDB) this.A01;
                hdb.A06.A02 = false;
                AbstractC31175DnJ.A0j(hdb.getActivity(), false);
                if (hdb.A0d()) {
                    HDB.A01(hdb);
                }
                i = 960710907;
                C0f9.A0A(i, A03);
                return;
            case 44:
                A03 = C0f9.A03(370621677);
                HDB hdb2 = (HDB) this.A01;
                hdb2.A06.A02 = false;
                AbstractC31175DnJ.A0j(hdb2.getActivity(), false);
                if (hdb2.A0d()) {
                    HDB.A01(hdb2);
                }
                i = -1807957590;
                C0f9.A0A(i, A03);
                return;
            default:
                super.onFinish();
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
            case 2:
                A03 = C0f9.A03(1548258461);
                ((IGR) this.A01).A01 = SystemClock.elapsedRealtime();
                i = -1416638244;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(-932468190);
                H8D h8d = (H8D) this.A01;
                C25671My A00 = AbstractC25651Mw.A00(h8d.A00);
                C38321qM c38321qM = h8d.A01;
                String A2u = c38321qM.A2u();
                ExtendedImageUrl extendedImageUrl = c38321qM.A0E;
                if (extendedImageUrl != null) {
                    str2 = extendedImageUrl.A0A;
                } else {
                    str2 = null;
                }
                A00.E4s(new C42254Ine(A2u, true, str2));
                i = 983762943;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A03 = C0f9.A03(-449304362);
                H8D h8d2 = (H8D) this.A01;
                C25671My A002 = AbstractC25651Mw.A00(h8d2.A00);
                C38321qM c38321qM2 = h8d2.A01;
                String A2u2 = c38321qM2.A2u();
                ExtendedImageUrl extendedImageUrl2 = c38321qM2.A0E;
                if (extendedImageUrl2 != null) {
                    str = extendedImageUrl2.A0A;
                } else {
                    str = null;
                }
                A002.E4s(new C42254Ine(A2u2, false, str));
                i = 1191089818;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(1621026796);
                C38286GsV c38286GsV = (C38286GsV) this.A01;
                C37445GeP c37445GeP = c38286GsV.A0G;
                c37445GeP.A08(null, false);
                C61712rY c61712rY = c37445GeP.A04;
                String str3 = c38286GsV.A0I;
                Integer num = C05F.A0C;
                c61712rY.A07(num, str3, AbstractC111324zv.A00(599), str3);
                String str4 = c38286GsV.A04;
                if (str4 == null) {
                    str4 = "";
                }
                c61712rY.A07(num, str3, "AD_ID", str4);
                c61712rY.A07(num, str3, "MULTI_ADS_TYPE", String.valueOf(c38286GsV.A01));
                c61712rY.A01(null, num, C05F.A03, str3);
                c38286GsV.A0F.DgF();
                i = -417223255;
                C0f9.A0A(i, A03);
                return;
            case 17:
                A03 = C0f9.A03(-601502580);
                super.onStart();
                ((IM9) this.A01).A00 = C05F.A00;
                i = 1216305727;
                C0f9.A0A(i, A03);
                return;
            case 20:
                A03 = C0f9.A03(-1719401331);
                super.onStart();
                J1K j1k = (J1K) this.A01;
                j1k.A00 = C05F.A00;
                C41762Ied c41762Ied = j1k.A04.A00.A03;
                if (c41762Ied != null) {
                    c41762Ied.A08(HCN.A0D);
                    i = 1102056647;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F("logger");
                throw C00O.createAndThrow();
            case 21:
                A03 = C0f9.A03(-2146597189);
                super.onStart();
                C41762Ied c41762Ied2 = ((IMJ) this.A01).A02.A00.A03;
                if (c41762Ied2 != null) {
                    c41762Ied2.A08(HD9.A0N);
                    i = -1994754623;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F("logger");
                throw C00O.createAndThrow();
            case 24:
                A03 = C0f9.A03(-1587295749);
                i = 1160703343;
                C0f9.A0A(i, A03);
                return;
            case 40:
                A03 = C0f9.A03(1741315157);
                HDE.A02((HDE) this.A01);
                i = -2070178829;
                C0f9.A0A(i, A03);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(780303035);
                HDD.A02((HDD) this.A01);
                i = 982821638;
                C0f9.A0A(i, A03);
                return;
            case 43:
                A03 = C0f9.A03(345852703);
                ((HDB) this.A01).A0c();
                i = 247723684;
                C0f9.A0A(i, A03);
                return;
            case 44:
                A03 = C0f9.A03(1833878511);
                ((HDB) this.A01).A0c();
                i = 2138152164;
                C0f9.A0A(i, A03);
                return;
            default:
                super.onStart();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0563, code lost:
    
        if (r1 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0963, code lost:
    
        if (r0.booleanValue() == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0da2, code lost:
    
        if (r1 == com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum.A04) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0f4a, code lost:
    
        if (r0 != null) goto L519;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x115b  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x1175  */
    /* JADX WARN: Type inference failed for: r0v317, types: [X.6xs, java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r7v5, types: [X.1ux, X.Gem] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 5616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39030HGg.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r11.A0S == false) goto L21;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39030HGg.onSuccessInBackground(java.lang.Object):void");
    }
}
