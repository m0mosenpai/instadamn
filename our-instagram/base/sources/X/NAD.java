package X;

import android.content.Context;
import android.location.Location;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.calendar.CalendarRecyclerView;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* loaded from: classes9.dex */
public final class NAD extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public static void A00(AbstractC115105If abstractC115105If, NAD nad) {
        C14360o3.A0B(abstractC115105If, 0);
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) nad.A02;
        String A03 = AbstractC151876sX.A03(abstractC115105If, ((Context) nad.A01).getString(2131972429));
        C14360o3.A07(A03);
        interfaceC16660sJ.invoke(A03);
    }

    public NAD(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    public static void A01(NAD nad) {
        ((InterfaceC16660sJ) nad.A02).invoke("Publish GraphQL call succeeded, but had response with success=false");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-1479216397);
                C193328hC A0H = AbstractC31171DnF.A0H(((C69490VoD) this.A01).A02);
                A0H.A0A(2131970976);
                A0H.A09(2131970975);
                A0H.A0F(OgH.A00);
                DialogInterfaceOnDismissListenerC55324Ogm.A00(A0H, this.A03, 0);
                AbstractC166987dD.A1W(A0H);
                i = 78517339;
                break;
            case 2:
                A03 = C0f9.A03(2128551298);
                A00(abstractC115105If, this);
                i = 1412101165;
                break;
            case 3:
                A03 = C0f9.A03(-484899298);
                A00(abstractC115105If, this);
                i = 1453680294;
                break;
            case 4:
                A03 = C0f9.A03(1898973692);
                A00(abstractC115105If, this);
                i = -63008730;
                break;
            case 5:
                A03 = C0f9.A03(-867676398);
                A00(abstractC115105If, this);
                i = 807018223;
                break;
            case 6:
                A03 = C0f9.A03(-1568011024);
                A00(abstractC115105If, this);
                i = 2142591970;
                break;
            case 7:
                A03 = C0f9.A03(-1666352871);
                A00(abstractC115105If, this);
                i = 468712488;
                break;
            case 8:
                A03 = C0f9.A03(1570199528);
                super.onFail(abstractC115105If);
                NearbyVenuesService.A02((UserSession) this.A03, null);
                i = -1864371914;
                break;
            case 9:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 304127515);
                C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
                if (c40781ul != null) {
                    str = c40781ul.getErrorMessage();
                } else {
                    str = null;
                }
                boolean A0K = C14360o3.A0K(str, "Media not found or unavailable");
                OHv oHv = (OHv) this.A01;
                int i2 = 2;
                if (A0K) {
                    i2 = 1;
                }
                oHv.A00(i2);
                i = -729981362;
                break;
            case 10:
                A03 = C0f9.A03(1680487495);
                O4G o4g = (O4G) this.A01;
                int i3 = o4g.A00;
                if (i3 < 3) {
                    o4g.A00 = i3 + 1;
                    int pow = ((int) (Math.pow(2.0d, r0 - 1) * 2.0d)) * 1000;
                    C25621Ms A0C = AbstractC31179DnN.A0C((UserSession) this.A03);
                    A0C.A0B("creatives/camera_graphql/");
                    A0C.A9s("query_id", "2253728161315083");
                    C1ON A0J = AbstractC31178DnM.A0J(A0C, C38868H9q.class, C41295IPk.class);
                    A0J.A00 = this;
                    C1GJ.A05(A0J, 278, 3, pow, true, false);
                } else {
                    ((C1P1) this.A02).onFail(abstractC115105If);
                }
                i = -1765318557;
                break;
            case 11:
                A03 = C0f9.A03(1065800253);
                i = 1573047496;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(520821388);
                i = 903401840;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(882539054);
                if (((Fragment) this.A02).isAdded()) {
                    Context context = (Context) this.A01;
                    C9GR.A03(context, context.getString(2131976176), "unmute_story_failure", 0);
                }
                i = 170980769;
                break;
            case 14:
                A03 = C0f9.A03(2138549659);
                InterfaceC11380iw A02 = C150856qj.A02((Context) this.A01);
                if (A02 != null) {
                    C145176gc c145176gc = (C145176gc) this.A03;
                    C105824pt c105824pt = (C105824pt) this.A02;
                    UserSession userSession = c145176gc.A09;
                    if (userSession == null) {
                        AbstractC31171DnF.A0y();
                        throw C00O.createAndThrow();
                    }
                    C18920wW A01 = AbstractC12220kQ.A01(A02, userSession);
                    String str2 = c105824pt.A0X;
                    str2.getClass();
                    String A0g = MSX.A0g(c105824pt);
                    String str3 = c105824pt.A0e;
                    str3.getClass();
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_live_moderator_resign");
                    MSY.A16(A0f, A0g);
                    AbstractC31171DnF.A1A(A0f, RealtimeConstants.SEND_FAIL);
                    MSY.A12(A0f, AbstractC167027dH.A03(str2));
                    AbstractC37300Gc1.A0l(A0f, str3);
                    AbstractC37301Gc2.A15(A0f, A02);
                    MSW.A1T(A0f, "moderator");
                    A0f.AAP("method", "ufi_action_sheet");
                    A0f.Cht();
                }
                i = 1896792312;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        Integer valueOf;
        Date date;
        int i;
        AbstractC907342m A00;
        AbstractC907342m A002;
        AbstractC907342m A003;
        AbstractC907342m A004;
        AbstractC907342m A005;
        AbstractC907342m A006;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-645492255);
                N2Z n2z = (N2Z) obj;
                int A032 = C0f9.A03(1003128250);
                ArchiveReelCalendarFragment archiveReelCalendarFragment = (ArchiveReelCalendarFragment) this.A01;
                archiveReelCalendarFragment.A07 = true;
                ArrayList A1F = AbstractC166987dD.A1F((Collection) this.A02);
                List list = n2z.A06;
                if (list != null) {
                    A1F.addAll(list);
                }
                if (n2z.A05 == null) {
                    valueOf = null;
                } else {
                    Number number = n2z.A04;
                    if (number == null) {
                        number = (Number) this.A03;
                    }
                    valueOf = Integer.valueOf(number.intValue());
                }
                boolean isEmpty = archiveReelCalendarFragment.A06.isEmpty();
                archiveReelCalendarFragment.A06 = AbstractC54858ONj.A00(ReelStore.A03(archiveReelCalendarFragment.getSession()), AbstractC166987dD.A10(archiveReelCalendarFragment.getSession()), C05F.A00, valueOf, A1F);
                Long l = n2z.A03;
                if (l != null) {
                    date = new Date(l.longValue() * 1000);
                } else {
                    date = archiveReelCalendarFragment.A05;
                }
                archiveReelCalendarFragment.A05 = date;
                if (archiveReelCalendarFragment.A04 == null) {
                    archiveReelCalendarFragment.mLoadingSpinner.setVisibility(8);
                    ArchiveReelCalendarFragment.A03(archiveReelCalendarFragment);
                    if (isEmpty) {
                        archiveReelCalendarFragment.mCalendar.A0n(archiveReelCalendarFragment.A00.getItemCount() - 1);
                    }
                }
                String str = n2z.A05;
                if (str != null) {
                    ArchiveReelCalendarFragment.A04(archiveReelCalendarFragment, valueOf, str, A1F);
                } else if (archiveReelCalendarFragment.A04 != null && archiveReelCalendarFragment.A02 != null) {
                    archiveReelCalendarFragment.mLoadingSpinner.setVisibility(8);
                    ArchiveReelCalendarFragment.A03(archiveReelCalendarFragment);
                    CalendarRecyclerView calendarRecyclerView = archiveReelCalendarFragment.mCalendar;
                    C52375NFr c52375NFr = archiveReelCalendarFragment.A00;
                    calendarRecyclerView.A0n(AbstractC37302Gc3.A02(AbstractC37300Gc1.A0Q(c52375NFr.A01(new Date(archiveReelCalendarFragment.A02.longValue())), ((AbstractC51171MjF) c52375NFr).A03)));
                }
                C0f9.A0A(1717072086, A032);
                i = -1127641079;
                break;
            case 1:
                A03 = C0f9.A03(606441935);
                int A0N = AbstractC167017dG.A0N(obj, -772035185);
                super.onSuccess(obj);
                C1Y6.A03((C1Y6) this.A03, new C69490VoD((C69667Vt8) this.A02));
                C0f9.A0A(-1794737362, A0N);
                i = -1708121094;
                break;
            case 2:
                A03 = C0f9.A03(728087032);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A0N2 = AbstractC167017dG.A0N(anonymousClass435, 1186401524);
                AbstractC907342m abstractC907342m = (AbstractC907342m) anonymousClass435.A01;
                if (abstractC907342m != null && (A00 = abstractC907342m.A00(C51518Mp4.class, "xfb_unpublished_content_delete")) != null && A00.A06("success")) {
                    AbstractC166987dD.A1Y(this.A03);
                } else {
                    A01(this);
                }
                C0f9.A0A(-1451088491, A0N2);
                i = -1568680525;
                break;
            case 3:
                A03 = C0f9.A03(-1045485042);
                AnonymousClass435 anonymousClass4352 = (AnonymousClass435) obj;
                int A0N3 = AbstractC167017dG.A0N(anonymousClass4352, -1930310482);
                AbstractC907342m abstractC907342m2 = (AbstractC907342m) anonymousClass4352.A01;
                if (abstractC907342m2 != null && (A002 = abstractC907342m2.A00(C51516Mp2.class, "xfb_unpublished_content_delete")) != null && A002.A06("success")) {
                    AbstractC166987dD.A1Y(this.A03);
                } else {
                    A01(this);
                }
                C0f9.A0A(-2116799486, A0N3);
                i = -1683642851;
                break;
            case 4:
                A03 = C0f9.A03(-1807582644);
                AnonymousClass435 anonymousClass4353 = (AnonymousClass435) obj;
                int A0N4 = AbstractC167017dG.A0N(anonymousClass4353, -1384813888);
                AbstractC907342m abstractC907342m3 = (AbstractC907342m) anonymousClass4353.A01;
                if (abstractC907342m3 != null && (A003 = abstractC907342m3.A00(C51522Mp8.class, "xfb_unpublished_content_publish")) != null && A003.A06("success")) {
                    AbstractC166987dD.A1Y(this.A03);
                } else {
                    A01(this);
                }
                C0f9.A0A(108407410, A0N4);
                i = 797457508;
                break;
            case 5:
                A03 = C0f9.A03(-90743513);
                AnonymousClass435 anonymousClass4354 = (AnonymousClass435) obj;
                int A0N5 = AbstractC167017dG.A0N(anonymousClass4354, -1055863013);
                AbstractC907342m abstractC907342m4 = (AbstractC907342m) anonymousClass4354.A01;
                if (abstractC907342m4 != null && (A004 = abstractC907342m4.A00(C51520Mp6.class, "xfb_unpublished_content_publish")) != null && A004.A06("success")) {
                    AbstractC166987dD.A1Y(this.A03);
                } else {
                    A01(this);
                }
                C0f9.A0A(-1920722892, A0N5);
                i = 594351452;
                break;
            case 6:
                A03 = C0f9.A03(1751276330);
                AnonymousClass435 anonymousClass4355 = (AnonymousClass435) obj;
                int A0N6 = AbstractC167017dG.A0N(anonymousClass4355, 560489027);
                AbstractC907342m abstractC907342m5 = (AbstractC907342m) anonymousClass4355.A01;
                if (abstractC907342m5 != null && (A005 = abstractC907342m5.A00(C51526MpC.class, "xfb_unpublished_content_reschedule")) != null && A005.A06("success")) {
                    AbstractC166987dD.A1Y(this.A03);
                } else {
                    A01(this);
                }
                C0f9.A0A(-992801179, A0N6);
                i = 463368583;
                break;
            case 7:
                A03 = C0f9.A03(-599902675);
                AnonymousClass435 anonymousClass4356 = (AnonymousClass435) obj;
                int A0N7 = AbstractC167017dG.A0N(anonymousClass4356, -1103554965);
                AbstractC907342m abstractC907342m6 = (AbstractC907342m) anonymousClass4356.A01;
                if (abstractC907342m6 != null && (A006 = abstractC907342m6.A00(C51524MpA.class, "xfb_unpublished_content_reschedule")) != null && A006.A06("success")) {
                    AbstractC166987dD.A1Y(this.A03);
                } else {
                    A01(this);
                }
                C0f9.A0A(2083253221, A0N7);
                i = -377586808;
                break;
            case 8:
                A03 = C0f9.A03(1676170757);
                C73450YDt c73450YDt = (C73450YDt) obj;
                int A033 = C0f9.A03(742269217);
                super.onSuccess(c73450YDt);
                Location location = (Location) this.A01;
                LocationSignalPackage locationSignalPackage = (LocationSignalPackage) this.A02;
                synchronized (NearbyVenuesService.class) {
                    NearbyVenuesService.A01 = c73450YDt;
                    NearbyVenuesService.A00 = location;
                    NearbyVenuesService.A02 = locationSignalPackage;
                }
                NearbyVenuesService.A02((UserSession) this.A03, c73450YDt);
                C0f9.A0A(-1110333155, A033);
                i = -794889464;
                break;
            case 9:
                A03 = C0f9.A03(-1622847176);
                C74293Vk c74293Vk = (C74293Vk) obj;
                int A034 = C0f9.A03(-285083507);
                C14360o3.A0B(c74293Vk, 0);
                C38321qM A0x = AbstractC25225BEi.A0x(c74293Vk.A06, 0);
                UserSession userSession = ((OAA) this.A03).A02;
                C1DX A007 = C1DW.A00(userSession);
                C14360o3.A0A(A0x);
                A007.A03(A0x);
                ((OHv) this.A01).A00(!C37855Gl9.A0C(userSession, A0x) ? 1 : 0);
                C0f9.A0A(1587486566, A034);
                i = 884566673;
                break;
            case 10:
                A03 = C0f9.A03(-591271655);
                int A035 = C0f9.A03(1959799821);
                ((C1P1) this.A02).onSuccess(obj);
                C0f9.A0A(1666489802, A035);
                i = -1143408117;
                break;
            case 11:
                A03 = C0f9.A03(-674230405);
                int A036 = C0f9.A03(-1727811527);
                Object obj2 = ((C15370ps) this.A02).A00;
                if (obj2 != null) {
                    C23031Ai A008 = AbstractC23021Ah.A00((UserSession) this.A03);
                    AbstractC31171DnF.A1S(A008, obj2, A008.A6a, C23031Ai.A8c, 344);
                }
                Object obj3 = ((C15370ps) this.A01).A00;
                if (obj3 != null) {
                    C23031Ai A009 = AbstractC23021Ah.A00((UserSession) this.A03);
                    AbstractC31171DnF.A1S(A009, obj3, A009.A89, C23031Ai.A8c, 345);
                }
                C0f9.A0A(-1852360411, A036);
                i = -565388717;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(-1909322193);
                N39 n39 = (N39) obj;
                int A0N8 = AbstractC167017dG.A0N(n39, -1174792593);
                if (n39.A03 && n39.A00 == IGLiveBadgeSettings.A07) {
                    C27961Xa A0010 = AbstractC54912fq.A00();
                    InterfaceC55362gb interfaceC55362gb = (InterfaceC55362gb) this.A01;
                    C4NL c4nl = (C4NL) this.A02;
                    C56049OuO c56049OuO = (C56049OuO) this.A03;
                    Context context = c56049OuO.A04;
                    AbstractC59962oe abstractC59962oe = c56049OuO.A0A;
                    A0010.A07(context, abstractC59962oe, c4nl, interfaceC55362gb);
                    UserSession userSession2 = c56049OuO.A0D;
                    IGLiveBadgeSettings iGLiveBadgeSettings = IGLiveBadgeSettings.A05;
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
                    A0c.A0B("users/set_live_settings/");
                    abstractC59962oe.schedule(AbstractC31178DnM.A0K(A0c, "live_badge_setting", iGLiveBadgeSettings.A00));
                }
                C0f9.A0A(1099732323, A0N8);
                i = 1328972093;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1051838619);
                int A037 = C0f9.A03(-533704597);
                if (((Fragment) this.A02).isAdded()) {
                    MSX.A0v((Context) this.A01, 2131968083);
                    ((C145176gc) this.A03).A18.EJJ();
                }
                C0f9.A0A(1848128340, A037);
                i = -760521717;
                break;
            default:
                A03 = C0f9.A03(481575472);
                int A038 = C0f9.A03(1956684815);
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                Context context2 = (Context) this.A01;
                A0Y.A02 = AbstractC25235BEs.A04(context2);
                AbstractC31172DnG.A1H(context2.getResources(), A0Y, 2131965300);
                A0Y.A01 = 5000;
                AbstractC31178DnM.A1N(c41451vu, A0Y);
                InterfaceC11380iw A02 = C150856qj.A02(context2);
                if (A02 != null) {
                    C145176gc c145176gc = (C145176gc) this.A03;
                    C105824pt c105824pt = (C105824pt) this.A02;
                    UserSession userSession3 = c145176gc.A09;
                    if (userSession3 == null) {
                        AbstractC31171DnF.A0y();
                        throw C00O.createAndThrow();
                    }
                    C54810OKj c54810OKj = new C54810OKj(A02, userSession3);
                    String str2 = c105824pt.A0X;
                    str2.getClass();
                    String A0g = MSX.A0g(c105824pt);
                    String str3 = c105824pt.A0e;
                    str3.getClass();
                    c54810OKj.A00("ufi_action_sheet", str2, A0g, str3);
                }
                C0f9.A0A(1976685139, A038);
                i = -293227270;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
