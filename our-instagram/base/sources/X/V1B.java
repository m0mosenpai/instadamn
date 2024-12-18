package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.lifecycleannotations.LifecycleUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V1B extends AbstractC59962oe implements InterfaceC60682pr, AnonymousClass309, InterfaceC60072op, InterfaceC60092or, InterfaceC11480j6, InterfaceC60122ou, InterfaceC60132ov {
    public static final String __redex_internal_original_name = "LocationPageFragment";
    public MTJ A00;
    public ViewOnTouchListenerC60632pm A01;
    public UserSession A02;
    public ImageUrl A03;
    public C38085GpE A04;
    public C66095TzW A05;
    public C65823Tug A06;
    public C68034V7f A07;
    public C3CO A08;
    public AnonymousClass308 A09;
    public ILK A0A;
    public C69593Vrw A0B;
    public WDE A0C;
    public W5E A0D;
    public C67845UzJ A0E;
    public C69139ViU A0F;
    public Venue A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L;
    public C37835Gkp A0M;
    public C57112jm A0N;
    public C132735yw A0O;
    public HHI A0P;
    public V7m A0Q;
    public C71074WnW A0R;
    public boolean A0S;
    public final InterfaceC71925XAj A0W = new C70895Wjo(this, 2);
    public final InterfaceC71926XAk A0X = new C70899Wjs(this);
    public final InterfaceC43406JFw A0Z = new C70901Wju(this, 1);
    public final AbstractC42425IqS A0Y = new C68036V7h(this, 2);
    public final InterfaceC71951XCd A0U = new WjX(this);
    public final InterfaceC41501vz A0T = new C70723Wfo(this, 16);
    public final InterfaceC71918XAc A0V = new Wja(this);

    public static void A03(V1B v1b) {
        C1ON A01;
        v1b.A0K = true;
        v1b.A07.A09(A00(v1b));
        Venue venue = v1b.A0G;
        W5E w5e = v1b.A0D;
        if (venue == null) {
            String A06 = AbstractC13670mt.A06("locations/%s/info/", w5e.A07);
            C25621Ms A0N = AbstractC31173DnH.A0N(w5e.A02);
            A0N.A0B(A06);
            A01 = AbstractC31172DnG.A0S(A0N, C67819Uys.class, C69963Vye.class);
            A01.A00 = new C67951V3q(w5e);
        } else {
            C18C.A0F(C11T.A08());
            UserSession userSession = w5e.A02;
            String str = w5e.A07;
            XDP xdp = w5e.A04;
            C25621Ms A0N2 = AbstractC31173DnH.A0N(userSession);
            A0N2.A0L("locations/%s/story/", str);
            C1ON A0S = AbstractC31172DnG.A0S(A0N2, C67828Uz1.class, C69962Vyd.class);
            A0S.A00 = new C67954V3t(12, xdp, userSession);
            C1GJ.A00(w5e.A00, w5e.A01, A0S);
            v1b.A0D.A01(v1b.A07.A00, true, false);
            w5e = v1b.A0D;
            C18C.A0F(C11T.A08());
            UserSession userSession2 = w5e.A02;
            if (C18U.A06(C06090Tz.A05, userSession2, 36319604959616567L)) {
                C40701ud A012 = AbstractC40691uc.A01(userSession2);
                PandoGraphQLRequest A00 = AbstractC69958VyZ.A00(w5e.A07);
                A012.ATV(new C70434WVm(w5e, 9), new WW0(w5e, 14), A00);
                return;
            }
            A01 = AbstractC69958VyZ.A01(userSession2, w5e.A03, w5e.A07);
        }
        C1GJ.A00(w5e.A00, w5e.A01, A01);
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_location";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static ArrayList A00(V1B v1b) {
        ArrayList arrayList = new ArrayList();
        Venue venue = v1b.A0G;
        if (venue != null && venue.A00() != null && venue.A01() != null) {
            boolean z = v1b.A0K;
            arrayList.size();
            arrayList.add(new C70801WhH(v1b.A03, v1b.A0E, venue, z));
        }
        if (v1b.A0G != null) {
            arrayList.add(v1b.A0O);
        }
        return arrayList;
    }

    public static void A01(ImageUrl imageUrl, V1B v1b, Venue venue, boolean z) {
        LocationPageInformation A01;
        MapEntryPoint mapEntryPoint;
        if (venue.A00() != null && venue.A01() != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_place_thumbnail_override", imageUrl);
            bundle.putBoolean("arg_request_nearby_places", z);
            ArrayList arrayList = new ArrayList();
            Double A00 = venue.A00();
            Double A012 = venue.A01();
            String A0n = AbstractC166997dE.A0n();
            long currentTimeMillis = System.currentTimeMillis();
            EnumC68146VDo enumC68146VDo = EnumC68146VDo.A06;
            C67845UzJ c67845UzJ = v1b.A0E;
            if (c67845UzJ == null) {
                A01 = null;
            } else {
                A01 = c67845UzJ.A01();
            }
            arrayList.add(new MediaMapPin(imageUrl, A01, enumC68146VDo, venue, A00, A012, A0n, currentTimeMillis));
            FragmentActivity requireActivity = v1b.requireActivity();
            UserSession userSession = v1b.A02;
            String str = v1b.A0H;
            if (z) {
                mapEntryPoint = MapEntryPoint.A09;
            } else {
                mapEntryPoint = MapEntryPoint.A0B;
            }
            W6l.A01(bundle, requireActivity, userSession, mapEntryPoint, VEZ.A05, str, venue.A02(), venue.A00.getName(), arrayList, new double[]{venue.A00().doubleValue(), venue.A01().doubleValue()});
            A02(v1b);
        }
    }

    public static void A02(V1B v1b) {
        String str;
        WDE wde = v1b.A0C;
        String str2 = v1b.A0I;
        Venue venue = v1b.A0G;
        if (venue != null) {
            str = venue.A04();
        } else {
            str = null;
        }
        wde.A02(null, null, "location_page", "open_map", null, str2, str, null, null);
    }

    public static void A04(V1B v1b, boolean z) {
        if (!AbstractC37303Gc4.A1a(W5E.A00(v1b.A0D, v1b.A07.A00).A04)) {
            if (v1b.A0D.A02(v1b.A07.A00) || z) {
                v1b.A0D.A01(v1b.A07.A00, false, false);
            }
        }
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        return this.A01;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB A01 = AbstractC69959Vya.A01(this.A0G);
        C68034V7f c68034V7f = this.A07;
        EnumC68206VFy enumC68206VFy = c68034V7f.A00;
        int A05 = c68034V7f.A05();
        C14360o3.A0B(enumC68206VFy, 1);
        A01.A0A("feed_type", enumC68206VFy.toString());
        A01.A04(AbstractC128225qr.A01, Long.valueOf(A05));
        AnonymousClass729.A00(this.A02).A00(A01);
        return A01;
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB A01 = AbstractC69959Vya.A01(this.A0G);
        AnonymousClass729.A00(this.A02).A00(A01);
        return A01;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        this.A06.A03();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r17) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1B.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        return this.A06.A06;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String A04;
        WDE wde = this.A0C;
        wde.A04 = "finish_step";
        wde.A07 = "location_page";
        wde.A06 = this.A0I;
        Venue venue = this.A0G;
        if (venue == null) {
            A04 = null;
        } else {
            A04 = venue.A04();
        }
        wde.A05 = A04;
        wde.A01();
        return this.A09.onBackPressed();
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        C11520jB E6P = E6P();
        E6P.A06(AbstractC69959Vya.A00(c38321qM));
        return E6P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.5yw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC66422zJ v5d;
        int A02 = C0f9.A02(1740573252);
        super.onCreate(bundle);
        this.A0H = AbstractC166997dE.A0n();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A02 = A0S;
        MTJ mtj = new MTJ(A0S, "feed", 31784961);
        this.A00 = mtj;
        mtj.A0Q(getContext(), C55772hI.A00(this.A02), this);
        this.A0I = requireArguments().getString(AbstractC43591JPw.A00(116));
        if (bundle != null) {
            this.A0G = (Venue) bundle.getParcelable("LocationFeedFragment.SAVED_INSTANCE_STATE_VENUE");
        }
        this.A0C = new WDE(this.A02);
        Context context = getContext();
        C14360o3.A0B(context, 0);
        List list = C68871VdT.A01;
        if (list == null) {
            list = AbstractC16960so.A1N(new W4N(EnumC68206VFy.A08, AbstractC166997dE.A0p(context, 2131975699), AbstractC166997dE.A0p(context, 2131963450)), new W4N(EnumC68206VFy.A07, AbstractC166997dE.A0p(context, 2131971543), AbstractC166997dE.A0p(context, 2131963451)));
            C68871VdT.A01 = list;
        }
        this.A0J = list;
        EnumC68206VFy enumC68206VFy = EnumC68206VFy.A08;
        ?? obj = new Object();
        obj.A02 = list;
        obj.A00 = enumC68206VFy;
        this.A0O = obj;
        C18C.A0H(!TextUtils.isEmpty(this.A0I), "Expecting non-empty Venue ID for location page.");
        Context context2 = getContext();
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C14360o3.A0B(context2, 0);
        this.A01 = AbstractC60622pl.A00(context2, null, false);
        this.A0M = new C37835Gkp();
        this.A0R = new C71074WnW(this);
        this.A0N = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0L = C18U.A06(c06090Tz, userSession, 36312810321347849L);
        this.A0S = AbstractC31178DnM.A1X(c06090Tz, this.A02, 36313669314808002L);
        JIG A00 = AbstractC53972Ntj.A00(getActivity(), this.A02, this, this.A0H, -1L, false, true);
        UserSession userSession2 = this.A02;
        List A002 = AbstractC68477VSi.A00(this.A0J);
        C68034V7f A01 = C68034V7f.A01(userSession2, enumC68206VFy, this.A0X, new C1571273r(), this.A0R, A002);
        this.A07 = A01;
        UserSession userSession3 = this.A02;
        AbstractC42425IqS abstractC42425IqS = this.A0Y;
        InterfaceC43406JFw interfaceC43406JFw = this.A0Z;
        C37835Gkp c37835Gkp = this.A0M;
        String str = this.A0H;
        AbstractC25234BEr.A0k(2, userSession3, abstractC42425IqS, interfaceC43406JFw, c37835Gkp);
        C14360o3.A0B(str, 9);
        Context requireContext = requireContext();
        ?? obj2 = new Object();
        if (this.A0L) {
            v5d = new V5N(requireContext(), this, this.A02, new C68820Vcb(this));
        } else {
            v5d = new V5D(new C68821Vcc(this));
        }
        FragmentActivity activity = getActivity();
        C71074WnW c71074WnW = this.A0R;
        C68034V7f c68034V7f = this.A07;
        UserSession userSession4 = this.A02;
        C66392zG A003 = AbstractC38092GpL.A00(requireContext, this, userSession3, obj2, c37835Gkp, abstractC42425IqS, A01, interfaceC43406JFw, A00, this, null, str, false, false);
        A003.A01(v5d);
        A003.A01(new V5H(this.A02, this.A0V));
        A003.A01(new Object());
        C14360o3.A0B(activity, 1);
        AbstractC25233BEq.A0w(2, c71074WnW, c68034V7f, userSession4);
        this.A05 = new C66095TzW(activity, this, A003, userSession4, c68034V7f, null, null, null, null, c71074WnW, true, false);
        C66101Tzc c66101Tzc = new C66101Tzc(this.A02);
        c66101Tzc.A01(this.A0W);
        C66095TzW c66095TzW = this.A05;
        C14360o3.A0B(c66095TzW, 0);
        c66101Tzc.A06 = c66095TzW;
        C68034V7f c68034V7f2 = this.A07;
        C14360o3.A0B(c68034V7f2, 0);
        c66101Tzc.A08 = c68034V7f2;
        c66101Tzc.A0A = A00;
        c66101Tzc.A04 = this;
        c66101Tzc.A02(C38U.A00);
        c66101Tzc.A00(this.A0N);
        this.A06 = new C65823Tug(c66101Tzc);
        Context context3 = getContext();
        UserSession userSession5 = this.A02;
        C68034V7f c68034V7f3 = this.A07;
        HHI hhi = new HHI(this, userSession5, new C128025qW(userSession5, context3, "feed_location"), c68034V7f3, c68034V7f3);
        this.A0P = hhi;
        registerLifecycleListener(hhi);
        this.A09 = new AnonymousClass308(requireActivity(), this, this.mFragmentManager, this.A02, this, this.A06.A0E, null, false);
        Context context4 = getContext();
        C08790ch A004 = AbstractC018607g.A00(this);
        UserSession userSession6 = this.A02;
        HashMap hashMap = new HashMap();
        for (EnumC68206VFy enumC68206VFy2 : AbstractC68477VSi.A00(this.A0J)) {
            hashMap.put(enumC68206VFy2, new C69413Vmx(this.A02, enumC68206VFy2, new C154796xU(getActivity(), AbstractC018607g.A00(this), this.A02), null, this.A0I, AbstractC166997dE.A0n(), null, false));
        }
        this.A0D = new W5E(context4, A004, userSession6, new C70958Wl5(this), new C70961Wl8(this), new WlH(this), new WlI(this), this.A0I, hashMap, false);
        C69139ViU c69139ViU = new C69139ViU(this);
        this.A0F = c69139ViU;
        this.A0Q = new V7m(this, this.A01, this.A06.A0B, this, this.A02, c69139ViU, new C69535Vqz(this), this);
        this.A0A = new ILK(this.A0N, new C41587Iaa(this, this.A02, new C42430IqX(this, 1), null, this.A0H));
        this.A0B = new C69593Vrw(this, AbstractC69959Vya.A01(this.A0G).A00(), this.A02, this.A0U);
        this.A08 = new C3CO(this.A02, new Wk4(this, 1));
        this.A04 = new C38085GpE(this, requireActivity(), this.A02, null, this.A0H);
        C60462pV c60462pV = new C60462pV();
        c60462pV.A0E(this.A08);
        c60462pV.A0E(new C161887My(getContext(), this.A02, new C71112Wo9(this, 1)));
        c60462pV.A0E(this.A09);
        c60462pV.A0E(new C675132q(this, this.A02, this));
        c60462pV.A0E(this.A0M);
        C62882tR c62882tR = new C62882tR(getActivity(), this, this.A02, 23614405);
        c60462pV.A0E(c62882tR);
        c60462pV.A0E(this.A04);
        registerLifecycleListenerSet(c60462pV);
        this.A06.A09(this.A01, c62882tR, this.A0Q);
        A03(this);
        WDE wde = this.A0C;
        wde.A04 = "start_step";
        wde.A07 = "location_page";
        wde.A06 = this.A0I;
        wde.A02 = WDE.A00(this.A02);
        Venue venue = this.A0G;
        if (venue != null) {
            this.A0C.A05 = venue.A04();
        }
        this.A0C.A01();
        this.A0G = this.A0G;
        this.A07.A09(A00(this));
        Venue venue2 = this.A0G;
        if (venue2 != null && this.A0L) {
            boolean A1X = AbstractC31178DnM.A1X(c06090Tz, this.A02, 36319604959616567L);
            UserSession userSession7 = this.A02;
            if (A1X) {
                AbstractC40691uc.A01(userSession7).ATV(new C63994SxR(5), new WW3(5, venue2, this), AbstractC69958VyZ.A00(venue2.A05()));
            } else {
                schedule(AbstractC69958VyZ.A01(userSession7, new C70957Wl4(this), venue2.A05()));
            }
        }
        AbstractC25651Mw.A00(this.A02).A01(this.A0T, C70709WfY.class);
        C0f9.A09(1355219720, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1513503210);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper);
        C0f9.A09(-2116833638, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-528327723);
        super.onDestroy();
        HHI hhi = this.A0P;
        if (hhi != null) {
            unregisterLifecycleListener(hhi);
        }
        AbstractC25651Mw.A00(this.A02).A02(this.A0T, C70709WfY.class);
        unregisterLifecycleListener(this.A04);
        C0f9.A09(1688573729, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(725657258);
        super.onDestroyView();
        this.A06.A01();
        LifecycleUtil.cleanupReferences(this);
        C0f9.A09(1844584992, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-850256391);
        this.A06.A0D.AGc();
        super.onPause();
        this.A01.A09(this.A06.A06);
        C0f9.A09(-470229580, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        String str;
        C69138ViT c69138ViT;
        int A02 = C0f9.A02(426929885);
        super.onResume();
        this.A0Q.A02();
        this.A0Q.DKM();
        this.A06.A0D.EJ1();
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        C71776X4d c71776X4d = C71776X4d.A00;
        AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) userSession.A01(V7X.class, c71776X4d);
        String str2 = this.A0H;
        C14360o3.A0B(str2, 0);
        if (abstractC69735VuV.A00.containsKey(str2)) {
            UserSession userSession2 = this.A02;
            C14360o3.A0B(userSession2, 0);
            AbstractC69735VuV abstractC69735VuV2 = (AbstractC69735VuV) userSession2.A01(V7X.class, c71776X4d);
            String str3 = this.A0H;
            C14360o3.A0B(str3, 0);
            V7Z v7z = (V7Z) ((AbstractC69385VmV) abstractC69735VuV2.A00.remove(str3));
            if (v7z.A04) {
                W5E w5e = this.A0D;
                EnumC68206VFy enumC68206VFy = v7z.A00;
                if (enumC68206VFy != null) {
                    String str4 = ((AbstractC69385VmV) v7z).A00;
                    List A0a = AbstractC001800i.A0a(v7z.A06);
                    if (A0a.isEmpty()) {
                        c69138ViT = null;
                    } else {
                        c69138ViT = ((C69016Vfs) AbstractC58320PtC.A0u(A0a)).A00;
                    }
                    String str5 = v7z.A01;
                    if (str5 != null) {
                        Map map = w5e.A08;
                        Object obj = map.get(enumC68206VFy);
                        obj.getClass();
                        map.put(enumC68206VFy, new C69413Vmx(w5e.A02, enumC68206VFy, ((C69413Vmx) obj).A04.A00(str4), c69138ViT, w5e.A07, str5, null, w5e.A09));
                    } else {
                        str = "feedRequestSessionId";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                str = "tab";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            List list = v7z.A06;
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    C69016Vfs c69016Vfs = (C69016Vfs) list.get(i);
                    if (((Boolean) v7z.A05.get(i)).booleanValue()) {
                        C68034V7f c68034V7f = this.A07;
                        EnumC68206VFy enumC68206VFy2 = v7z.A00;
                        if (enumC68206VFy2 != null) {
                            c68034V7f.A06(enumC68206VFy2);
                        } else {
                            str = "tab";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    C68034V7f c68034V7f2 = this.A07;
                    EnumC68206VFy enumC68206VFy3 = v7z.A00;
                    if (enumC68206VFy3 != null) {
                        c68034V7f2.A07(enumC68206VFy3, c69016Vfs.A01);
                    } else {
                        str = "tab";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
            }
            String str6 = v7z.A02;
            if (str6 != null && str6.length() != 0 && (view = this.mView) != null) {
                view.post(new RunnableC71514WvJ(v7z, this));
            }
        }
        C0f9.A09(2140271856, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("LocationFeedFragment.SAVED_INSTANCE_STATE_VENUE", this.A0G);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A06.A05(view, AbstractC37303Gc4.A1a(W5E.A00(this.A0D, this.A07.A00).A04));
        String str = null;
        this.A06.A04.setItemAnimator(null);
        C65823Tug.A00(this.A06, false, true);
        this.A06.A06(this.A0R);
        V7m v7m = this.A0Q;
        ((V8M) v7m).A01.A06(((V8M) v7m).A02, ((V8M) v7m).A05.getScrollingViewProxy(), ((V8M) v7m).A04.A00);
        C66095TzW.A00(this.A05);
        UserSession userSession = this.A02;
        String str2 = this.A0I;
        Venue venue = this.A0G;
        if (venue != null) {
            str = venue.A04();
        }
        C14360o3.A0B(userSession, 0);
        C19260xA c19260xA = new C19260xA();
        if (str2 == null) {
            str2 = "";
        }
        C19260xA.A00(c19260xA, str2, "page_id");
        if (str == null) {
            str = "";
        }
        C19260xA.A00(c19260xA, str, "location_id");
        C19280xC A04 = C1QE.A01(AbstractC111324zv.A00(4044)).A04("business_profile_start_step");
        A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "location_feed");
        A04.A05(c19260xA, AbstractC111324zv.A00(4247));
        String A00 = WDE.A00(userSession);
        if (A00 != null) {
            A04.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A00);
        }
        AbstractC31173DnH.A1S(A04, userSession);
    }
}
