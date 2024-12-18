package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class N5Z extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "NearbyVenuesFragment";
    public long A00;
    public Dialog A01;
    public Location A02;
    public Handler A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ViewStub A09;
    public ActionButton A0A;
    public UserSession A0B;
    public IgTextView A0C;
    public OK7 A0D;
    public C52201N8q A0E;
    public LocationSignalPackage A0F;
    public C3FQ A0G;
    public C4I7 A0H;
    public C65974TxR A0I;
    public SearchEditText A0J;
    public Integer A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public InterfaceC41501vz A0X;
    public C3I9 A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public volatile C60930Rbk A0n;
    public final GYX A0m = new PIM(this, 0);
    public final GYX A0l = new PIM(this, 1);
    public final GYX A0k = new PIM(this, 2);
    public final InterfaceC169497hP A0e = new C169487hO();
    public final Handler A0c = new MXV(this);
    public final InterfaceC127465pP A0g = new C56448P4j(this, 1);
    public final InterfaceC57959Pn5 A0i = new C56451P4n(this);
    public final InterfaceC60152ox A0f = new C56177Owk(this, 2);
    public final InterfaceC65454TkQ A0d = new C56400P2n(this);
    public final InterfaceC37294Gbv A0j = new C56711PFd(this, 0);
    public final MQC A0h = new C56449P4k(this);

    public static N5Z A00(Location location, String str, String str2, long j, boolean z, boolean z2) {
        N5Z n5z = new N5Z();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("INTENT_EXTRA_ANALYTICS_SURFACE", str);
        if (location != null) {
            A0b.putParcelable("INTENT_EXTRA_PHOTO_LOCATION", location);
        }
        A0b.putLong("INTENT_EXTRA_TIMESTAMP", j);
        A0b.putBoolean("INTENT_EXTRA_BACK_ON_SELECT", z);
        A0b.putBoolean("INTENT_EXTRA_ALLOW_CUSTOM_LOCATION", false);
        A0b.putBoolean("INTENT_EXTRA_IS_BOTTOM_SHEET_VARIANT", z2);
        if (str2 != null) {
            A0b.putString("INTENT_EXTRA_CLIPS_SESSION_ID_TO_UPDATE_PUBLISH_SCREEN", str2);
        }
        n5z.setArguments(A0b);
        return n5z;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(468);
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static VDJ A01(N5Z n5z) {
        int intValue = n5z.A0K.intValue();
        if (intValue != 1) {
            if (intValue != 3) {
                if (intValue != 0) {
                    if (intValue != 4) {
                        return VDJ.A0W;
                    }
                    return VDJ.A03;
                }
                return VDJ.A0T;
            }
            return VDJ.A06;
        }
        return VDJ.A0O;
    }

    private void A02() {
        int A02 = MSY.A02(this.A06);
        SearchEditText searchEditText = this.A0J;
        if (searchEditText != null) {
            searchEditText.post(new Runnable() { // from class: X.PME
                @Override // java.lang.Runnable
                public final void run() {
                    N5Z n5z = N5Z.this;
                    SearchEditText searchEditText2 = n5z.A0J;
                    if (searchEditText2 != null && n5z.A0O) {
                        searchEditText2.requestFocus();
                        AbstractC13880nE.A0R(n5z.A0J);
                    }
                }
            });
            this.A0J.setVisibility(0);
            if (this.A0C != null) {
                if (this.A0N && !TextUtils.isEmpty(this.A0J.getSearchString())) {
                    this.A0C.setVisibility(0);
                } else {
                    this.A0C.setVisibility(A02);
                }
            }
        }
    }

    public static void A03(View view, N5Z n5z, int i) {
        C0fQ.A00(new ViewOnClickListenerC55462OkH(n5z, i), view);
    }

    public static void A06(N5Z n5z) {
        Handler handler = n5z.A0c;
        handler.sendEmptyMessageDelayed(1, 15000L);
        handler.sendEmptyMessageDelayed(0, 3000L);
        ActionButton actionButton = n5z.A0A;
        if (actionButton != null) {
            actionButton.setDisplayedChild(1);
        }
        n5z.A0R = true;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            UserSession userSession = n5z.A0B;
            Activity rootActivity = n5z.getRootActivity();
            rootActivity.getClass();
            c1vw.requestLocationUpdates(userSession, rootActivity, n5z.A0g, n5z.A0h, __redex_internal_original_name, false, A01(n5z));
        }
    }

    public static void A07(N5Z n5z) {
        Location lastLocation;
        if (n5z.A02 == null) {
            if (n5z.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION") != null) {
                lastLocation = (Location) n5z.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION");
            } else {
                C1VW c1vw = C1VW.A00;
                c1vw.getClass();
                lastLocation = c1vw.getLastLocation(n5z.A0B, __redex_internal_original_name);
            }
            n5z.A02 = lastLocation;
        }
    }

    public static void A08(N5Z n5z) {
        if (n5z.A02 != null) {
            n5z.A02();
            C52201N8q c52201N8q = n5z.A0E;
            c52201N8q.A03.clear();
            c52201N8q.A04.clear();
            C73450YDt A00 = NearbyVenuesService.A00(n5z.A02);
            if (A00 == null) {
                n5z.A0E.notifyDataSetChanged();
                ActionButton actionButton = n5z.A0A;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(1);
                }
                NearbyVenuesService.A01(n5z.requireContext(), n5z.A02, n5z.A0B, n5z.A0F, Long.valueOf(n5z.A00));
                return;
            }
            n5z.A0D.A01("", A00.Bk6(), A00.getItems());
            if (!A00.getItems().isEmpty()) {
                n5z.A0E.A02(false);
            }
            C52201N8q c52201N8q2 = n5z.A0E;
            c52201N8q2.A01(A00.getItems());
            c52201N8q2.notifyDataSetChanged();
        }
    }

    public static void A09(N5Z n5z) {
        if (n5z.A0R && !AbstractC23451Ch.A07(n5z.requireContext(), AbstractC43591JPw.A00(5))) {
            n5z.A0c.sendEmptyMessage(1);
            n5z.A0a = true;
        } else {
            A06(n5z);
        }
    }

    public static void A0A(N5Z n5z) {
        ActionButton actionButton = n5z.A0A;
        if (actionButton != null) {
            actionButton.setDisplayedChild(0);
        }
        Handler handler = n5z.A0c;
        handler.removeMessages(1);
        handler.removeMessages(0);
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.removeLocationUpdates(n5z.A0B, n5z.A0g);
            c1vw.cancelSignalPackageRequest(n5z.A0B, n5z.A0i);
        }
        n5z.A0a = false;
    }

    public static void A0B(N5Z n5z, List list, boolean z) {
        C52201N8q c52201N8q = n5z.A0E;
        c52201N8q.A03.clear();
        c52201N8q.A04.clear();
        c52201N8q.A01(list);
        if (!list.isEmpty()) {
            n5z.A0E.A02(false);
        }
        if (AbstractC31172DnG.A19(n5z.A0E.A03).isEmpty() && z) {
            C52201N8q c52201N8q2 = n5z.A0E;
            c52201N8q2.A04.add(EnumC33327EoM.A02);
            C52201N8q.A00(c52201N8q2);
        }
        n5z.A0E.notifyDataSetChanged();
    }

    public final void A0D(String str) {
        String str2;
        C73450YDt A00;
        this.A0M = str;
        A0C(this, TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(this.A0M)) {
            A08(this);
            return;
        }
        String str3 = this.A0M;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (TextUtils.isEmpty(str3) && (A00 = NearbyVenuesService.A00(this.A02)) != null) {
            A1E.addAll(A00.getItems());
        }
        C9JQ BjP = this.A0I.A06.BjP(str3);
        List list = BjP.A06;
        if (list != null) {
            A1E.addAll(list);
        }
        Integer num = BjP.A01;
        Integer num2 = C05F.A0C;
        if (num != num2 && !TextUtils.isEmpty(this.A0M)) {
            this.A0I.A06(str3);
        }
        if (A1E.isEmpty()) {
            return;
        }
        OK7 ok7 = this.A0D;
        if (num == num2) {
            str2 = BjP.A04;
        } else {
            str2 = null;
        }
        ok7.A01(str3, str2, A1E);
        A0B(this, A1E, AbstractC167007dF.A1X(num, num2));
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A0B;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        C3FQ c3fq = this.A0G;
        if (c3fq == null) {
            return false;
        }
        return c3fq.CQ6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A0S) {
            AbstractC25651Mw.A00(this.A0B).E4s(new Object());
            return false;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static void A04(N5Z n5z) {
        Context context = n5z.getContext();
        if (context != null) {
            if (new C1CM(context).A05()) {
                n5z.A0E.A02(true);
                return;
            }
            if (A0C(n5z, true)) {
                n5z.A02();
                return;
            }
            if (!C1VW.isLocationEnabled(context)) {
                Handler handler = n5z.A03;
                if (handler == null) {
                    return;
                }
                handler.removeMessages(2);
                n5z.A03.sendEmptyMessage(2);
                return;
            }
            A09(n5z);
        }
    }

    public static void A05(N5Z n5z) {
        A0A(n5z);
        n5z.A02();
        if (n5z.A02 != null) {
            A0C(n5z, false);
            n5z.A0E.A02(false);
            ActionButton actionButton = n5z.A0A;
            if (actionButton != null) {
                actionButton.setDisplayedChild(1);
            }
            Context context = n5z.getContext();
            if (context != null) {
                NearbyVenuesService.A01(context, n5z.A02, n5z.A0B, n5z.A0F, Long.valueOf(n5z.A00));
            }
        }
    }

    public static boolean A0C(N5Z n5z, boolean z) {
        boolean z2;
        Context context = n5z.getContext();
        if (z && context != null && (!C1VW.isLocationEnabled(context) || !AbstractC23451Ch.A07(context, AbstractC43591JPw.A00(5)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        C52201N8q c52201N8q = n5z.A0E;
        if (z2 != c52201N8q.A01 && c52201N8q.A02 != null) {
            c52201N8q.A01 = z2;
            if (z2) {
                c52201N8q.A00 = false;
            }
            C52201N8q.A00(c52201N8q);
        }
        return z2;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [X.0JO, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        boolean A07;
        String str;
        int A02 = C0f9.A02(-1803419564);
        super.onCreate(bundle);
        this.A0B = AbstractC31176DnK.A0S(this);
        setModuleNameV2(AbstractC111324zv.A00(468));
        this.A0V = requireArguments().getBoolean("showTitleBar", true);
        this.A0Z = requireArguments().getBoolean("hideActionBar", false);
        this.A0O = requireArguments().getBoolean("auto_focus_search_field", true);
        this.A0U = requireArguments().getBoolean("show_place_icons", false);
        this.A0T = requireArguments().getBoolean("showCollapsedLocationBar", false);
        if (bundle != null) {
            this.A0M = bundle.getString("currentSearch");
            this.A0R = bundle.getBoolean("locationPermissionRequested");
            this.A02 = (Location) bundle.getParcelable("currentLocation");
            this.A0a = bundle.getBoolean("locationUpdatesRequested", false);
        }
        this.A0H = new C4I7(this, this.A0B);
        String string = requireArguments().getString("INTENT_EXTRA_ANALYTICS_SURFACE");
        string.getClass();
        if (string.equals("STORY")) {
            num = C05F.A00;
        } else if (string.equals("POST")) {
            num = C05F.A01;
        } else if (string.equals("POST_SKITTLES")) {
            num = C05F.A0C;
        } else if (string.equals("EDIT_POST")) {
            num = C05F.A0N;
        } else if (string.equals("CLIPS")) {
            num = C05F.A0Y;
        } else if (string.equals("EVENT")) {
            num = C05F.A0j;
        } else if (string.equals("NOTES")) {
            num = C05F.A0u;
        } else if (string.equals("LOCATION_SHARING")) {
            num = C05F.A15;
        } else {
            throw AbstractC166987dD.A12(string);
        }
        this.A0K = num;
        this.A0b = requireArguments().getBoolean("INTENT_EXTRA_SHOW_REMOVE_LOCATION");
        this.A0N = requireArguments().getBoolean("INTENT_EXTRA_ALLOW_CUSTOM_LOCATION", false);
        if (requireArguments().getBoolean("INTENT_EXTRA_IS_BOTTOM_SHEET_VARIANT", false)) {
            this.A0Z = true;
        }
        this.A0L = requireArguments().getString("INTENT_EXTRA_CLIPS_SESSION_ID_TO_UPDATE_PUBLISH_SCREEN");
        UserSession userSession = this.A0B;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36318015823550256L)) {
            C4IB c4ib = C4IB.A04;
            List A1J = AbstractC166987dD.A1J(C4I9.UNKNOWN);
            A07 = AbstractC167007dF.A1X(FA6.A00(this.A0B).A00(requireActivity(), c4ib, A01(this).name(), A1J), C4IC.A06);
        } else {
            A07 = AbstractC23451Ch.A07(requireContext(), AbstractC43591JPw.A00(5));
            UserSession userSession2 = this.A0B;
            if (A07) {
                str = "app_status_grant";
            } else {
                str = "app_status_deny";
            }
            C4I7 c4i7 = this.A0H;
            Long A00 = C4I8.A00(userSession2);
            List A1J2 = AbstractC166987dD.A1J(C4I9.UNKNOWN);
            c4i7.A00(new C9CH(C4IA.A08, C4IB.A04), A00, str, A01(this).name(), null, A1J2);
        }
        UserSession userSession3 = this.A0B;
        Integer num2 = this.A0K;
        AbstractC167007dF.A1D(userSession3, 0, num2);
        C52452NIw c52452NIw = new C52452NIw(new Object(), this, userSession3, num2, AbstractC25229BEm.A1a(num2, C05F.A15));
        c52452NIw.A00 = Boolean.valueOf(A07);
        this.A0D = c52452NIw;
        c52452NIw.A03();
        this.A00 = requireArguments().getLong("INTENT_EXTRA_TIMESTAMP");
        this.A0S = requireArguments().getBoolean("INTENT_EXTRA_TRANSPARENT_MODAL_MODE", false);
        this.A0P = requireArguments().getBoolean("INTENT_EXTRA_BACK_ON_SELECT", false);
        this.A0X = C56035Ou7.A00(this, 33);
        AbstractC25651Mw.A00(this.A0B).A01(this.A0X, C56017Oto.class);
        HandlerThread A0A = MSY.A0A("GPSLocationLibraryThread");
        A0A.start();
        Looper looper = A0A.getLooper();
        looper.getClass();
        HandlerC50753MbJ handlerC50753MbJ = new HandlerC50753MbJ(looper, this);
        this.A03 = handlerC50753MbJ;
        handlerC50753MbJ.sendEmptyMessage(1);
        this.A03.sendEmptyMessage(1);
        C0f9.A09(-1600087873, A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0335  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5Z.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(247733685);
        super.onDestroy();
        AbstractC25651Mw.A00(this.A0B).A02(this.A0X, C56017Oto.class);
        C65974TxR c65974TxR = this.A0I;
        if (c65974TxR != null) {
            c65974TxR.onDestroy();
        }
        A0A(this);
        if (this.A0n != null) {
            unregisterLifecycleListener(this.A0n);
        }
        Handler handler = this.A03;
        if (handler != null) {
            ((HandlerThread) handler.getLooper().getThread()).quit();
        }
        C0f9.A09(1323687091, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-783611411);
        super.onDestroyView();
        this.A0I.onDestroyView();
        if (this.A0J != null) {
            this.A0J.removeTextChangedListener(C106904rr.A00(this.A0B));
        }
        this.A0G = null;
        this.A0A = null;
        this.A0J = null;
        this.A09 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0C = null;
        C0f9.A09(770666638, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1485329869);
        super.onPause();
        Dialog dialog = this.A01;
        if (dialog != null && dialog.isShowing()) {
            this.A01.dismiss();
        }
        A0A(this);
        View view = this.mView;
        if (view != null) {
            AbstractC13880nE.A0O(view);
        }
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(3);
        ActionButton actionButton = this.A0A;
        if (actionButton != null) {
            actionButton.setOnClickListener(null);
        }
        this.A0c.removeCallbacksAndMessages(null);
        C0f9.A09(-475167020, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1173944237);
        super.onResume();
        Location location = (Location) requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION");
        this.A02 = location;
        if (location == null) {
            if (this.A0V && !this.A0T) {
                View view = this.A06;
                if (view == null) {
                    ViewStub viewStub = this.A09;
                    viewStub.getClass();
                    view = viewStub.inflate();
                    this.A06 = view;
                }
                A03(view, this, 14);
                int A022 = MSY.A02(this.A0J);
                IgTextView igTextView = this.A0C;
                if (igTextView != null) {
                    igTextView.setVisibility(A022);
                }
                AbstractC166997dE.A0T(this.A06, R.id.placeholder_text).getCompoundDrawablesRelative()[0].mutate().setColorFilter(AbstractC31174DnI.A09(requireContext(), R.color.grey_5));
                this.A06.setVisibility(0);
            }
            A04(this);
        } else {
            A02();
            SearchEditText searchEditText = this.A0J;
            if (searchEditText != null) {
                String A0g = AbstractC167007dF.A0g(searchEditText);
                String str = this.A0M;
                if (!A0g.equals(str) && str != null) {
                    this.A0J.setText(str);
                    this.A0J.setSelection(this.A0M.length());
                }
            }
        }
        ActionButton actionButton = this.A0A;
        if (actionButton != null) {
            A03(actionButton, this, 19);
        }
        if ((getActivity() instanceof C2d4) && !AbstractC56402iY.A09()) {
            this.A0c.post(new Runnable() { // from class: X.PMD
                @Override // java.lang.Runnable
                public final void run() {
                    N5Z n5z = N5Z.this;
                    AbstractC56402iY.A02(n5z.requireActivity(), AbstractC31173DnH.A03(n5z.requireContext(), n5z.requireContext(), R.attr.statusBarBackgroundColor));
                }
            });
        }
        if (this.A0a) {
            A09(this);
        } else {
            SearchEditText searchEditText2 = this.A0J;
            if (searchEditText2 != null) {
                A0D(searchEditText2.getSearchString());
            }
        }
        C0f9.A09(-394353951, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("currentSearch", this.A0M);
        bundle.putBoolean("locationPermissionRequested", this.A0R);
        bundle.putParcelable("currentLocation", this.A02);
        bundle.putBoolean("locationUpdatesRequested", this.A0a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(32510075);
        super.onStart();
        this.A0Y.Dnr(getRootActivity());
        this.A0Y.A9e(this.A0f);
        C0f9.A09(1951015446, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1959372310);
        super.onStop();
        this.A0Y.EFx(this.A0f);
        this.A0Y.onStop();
        C0f9.A09(97831324, A02);
    }
}
