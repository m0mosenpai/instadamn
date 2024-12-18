package X;

import X.AAX;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC61526Rp1;
import X.BDU;
import X.C0f9;
import X.C14360o3;
import X.C22930A9a;
import X.C51707Msc;
import X.C57312k6;
import X.C60961Rcj;
import X.C63305ShB;
import X.C63946SwL;
import X.C63947SwM;
import X.EnumC61217RhH;
import X.InterfaceC11380iw;
import X.InterfaceC65292ThP;
import X.InterfaceC65455TkR;
import X.InterfaceC65456TkS;
import X.InterfaceC65552TmV;
import X.InterfaceC65575Tn9;
import X.QDp;
import X.S86;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.ipc.IABExpandableFooterCallback;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.extensions.bloks.IgBloksIABExtension$fetchPreExitHandlerAction$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172707mf extends BrowserLiteFragment implements InterfaceC11380iw, InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "IgBrowserLiteFragment";
    public InterfaceC52932ba A00;
    public A9F A01;
    public C9U5 A02;
    public C22930A9a A03;
    public AAX A04;
    public C51D A05;
    public boolean A06;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final SYM A0B = new SYM();
    public final InterfaceC41501vz A0A = new C36126Fx0(this);
    public final ACQ A09 = new ACQ();
    public final String A07 = "; IABMV/1";

    @Override // com.facebook.browser.lite.BrowserLiteFragment
    public final void A0W(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy, boolean z) {
        Integer num;
        C14360o3.A0B(zonePolicy, 2);
        C14360o3.A0B(this.A0Q.A00, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, r4, 36313566239131799L)) {
            super.A0W(bundle, iABEvent, zonePolicy, z);
            return;
        }
        if (bundle != null && !bundle.getBoolean(MSV.A00(77), true)) {
            return;
        }
        C58877QEn c58877QEn = new C58877QEn(bundle);
        String string = c58877QEn.A00.getString(AbstractC58317Pt9.A00(205));
        String string2 = c58877QEn.A00.getString(AbstractC58317Pt9.A00(207));
        InterfaceC09390do interfaceC09390do = this.A08;
        C38321qM A02 = C1DW.A00((UserSession) interfaceC09390do.getValue()).A02(string);
        String A022 = A02(c58877QEn);
        String string3 = c58877QEn.A00.getString(AbstractC58317Pt9.A00(204));
        if (string3 == null && A02 != null) {
            string3 = AbstractC41071vF.A07((UserSession) interfaceC09390do.getValue(), A02);
        }
        String string4 = c58877QEn.A00.getString(AbstractC58317Pt9.A00(629));
        double d = iABEvent.A01;
        SYM sym = this.A0B;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        String A0S = A0S();
        C14360o3.A07(A0S);
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
        C14360o3.A0B(abstractC12990ll, 0);
        boolean A06 = C18U.A06(c06090Tz, abstractC12990ll, 36316826115838644L);
        boolean A00 = AbstractC62280S4z.A00((UserSession) interfaceC09390do.getValue());
        C55170OdY A002 = OPL.A00((UserSession) interfaceC09390do.getValue());
        if (!A002.A03.contains(MSV.A00(187))) {
            num = C05F.A00;
        } else {
            Boolean A04 = A002.A04();
            if (A04 != null) {
                if (A04.booleanValue()) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
            } else {
                num = C05F.A01;
            }
        }
        sym.A01(iABEvent, this, userSession, num, A0S, A022, string, string3, string2, c58877QEn.A00.getString(AbstractC58317Pt9.A00(630)), c58877QEn.A00.getString(AbstractC58317Pt9.A00(631)), c58877QEn.A00.getString(AbstractC111324zv.A00(696)), c58877QEn.A00.getString(AbstractC58317Pt9.A00(73)), string4, d, A06, A00);
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment
    public final void A0a(QF6 qf6) {
        C14360o3.A0B(qf6, 0);
        super.A0a(qf6);
        C9U5 c9u5 = this.A02;
        if (c9u5 != null) {
            IabCommonTrait iabCommonTrait = c9u5.A02;
            ACQ acq = this.A09;
            acq.A02("iab_context", iabCommonTrait.toString());
            C9U5 c9u52 = this.A02;
            if (c9u52 != null) {
                acq.A02("init_launch_view_mode_config", c9u52.A03.toString());
                String str = C1QM.A00.A02.A00;
                if (str != null) {
                    acq.A02(AbstractC111324zv.A00(236), str);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment, X.InterfaceC172717mh
    public final void AIO(int i, String str) {
        EnumC27385C6o backPressDestination;
        C51D c51d = this.A05;
        if (c51d != null && (backPressDestination = c51d.backPressDestination()) != null) {
            if (backPressDestination != EnumC27385C6o.A02) {
                super.AIO(1, str);
                C3DN A00 = C3DN.A00.A00(getActivity());
                if (A00 != null && A00.A0a(backPressDestination, C05F.A00)) {
                    return;
                }
            }
            AIE(1, str);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "in_app_browser_v2";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    private final Bundle A00() {
        Intent intent = super.A07;
        if (intent == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC58317Pt9.A00(324), intent.getStringExtra("offerid"));
        boolean z = false;
        bundle.putBoolean(AbstractC58317Pt9.A00(851), intent.getBooleanExtra("IN_WATCH_AND_MORE_OVERLAY", false));
        if (AbstractC14490oL.A0G(super.A06) || AbstractC14490oL.A0J(super.A06.getPackageManager(), AbstractC111324zv.A00(374))) {
            z = true;
        }
        bundle.putBoolean(AbstractC58317Pt9.A00(303), z);
        return bundle;
    }

    public static final C38321qM A01(C172707mf c172707mf, C58877QEn c58877QEn) {
        return C1DW.A00((UserSession) c172707mf.A08.getValue()).A02(c58877QEn.A00.getString(AbstractC58317Pt9.A00(205)));
    }

    private final String A02(C58877QEn c58877QEn) {
        String string = c58877QEn.A00.getString(AbstractC58317Pt9.A00(206));
        if (string == null) {
            C38321qM A01 = A01(this, c58877QEn);
            if (A01 != null) {
                return A01.CAR();
            }
            return null;
        }
        return string;
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment
    public final void A0X(View view, C223619u4 c223619u4, boolean z, boolean z2) {
        View view2;
        String str;
        View view3;
        String str2;
        Intent intent = super.A07;
        if (intent != null) {
            if (intent.getBooleanExtra(AbstractC58317Pt9.A00(521), false)) {
                C58877QEn c58877QEn = new C58877QEn(super.A09);
                String A02 = A02(c58877QEn);
                C38321qM A01 = A01(this, c58877QEn);
                FragmentActivity activity = getActivity();
                if (activity != null && (view3 = this.A0C) != null && (str2 = this.A0m) != null) {
                    String A0T = A0T();
                    String A0S = A0S();
                    C14360o3.A07(A0S);
                    final C63947SwM c63947SwM = new C63947SwM(A00(), view3, activity, this, (UserSession) this.A08.getValue(), A01, str2, A0S, A0T, A02, c58877QEn.A00());
                    this.A0S = c63947SwM;
                    final C64953TaY c64953TaY = new C64953TaY(c63947SwM);
                    C63305ShB A00 = C63305ShB.A00();
                    C63305ShB.A02(new C58869QDo(c63947SwM.A09, A00, new IABExpandableFooterCallback.Stub() { // from class: com.instagram.inappbrowser.extensions.IgIABFooterExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1
                        {
                            C0f9.A0A(-1262145246, C0f9.A03(14547766));
                        }

                        @Override // com.facebook.browser.lite.ipc.IABExpandableFooterCallback
                        public final void D1C(String str3, String str4, double d, String str5) {
                            Object obj;
                            int A03 = C0f9.A03(-1626806273);
                            AbstractC167017dG.A1N(str3, str4);
                            C14360o3.A0B(str5, 3);
                            C63947SwM c63947SwM2 = C63947SwM.this;
                            c63947SwM2.A03 = str3;
                            c63947SwM2.A04 = str5;
                            InterfaceC65456TkS interfaceC65456TkS = (InterfaceC65456TkS) S86.A00.get(str4);
                            if (interfaceC65456TkS != null) {
                                obj = interfaceC65456TkS.B3Y();
                            } else {
                                obj = null;
                            }
                            if (obj instanceof InterfaceC65552TmV) {
                                c63947SwM2.A01 = (InterfaceC65552TmV) obj;
                            }
                            c64953TaY.invoke();
                            C0f9.A0A(959763288, A03);
                        }
                    }, c63947SwM.A0H, c63947SwM.A0G, c63947SwM.A0F, c63947SwM.A0J), A00, false);
                }
            } else if (intent.getBooleanExtra(AbstractC58317Pt9.A00(520), false)) {
                C58877QEn c58877QEn2 = new C58877QEn(super.A09);
                String A022 = A02(c58877QEn2);
                C38321qM A012 = A01(this, c58877QEn2);
                FragmentActivity activity2 = getActivity();
                final C63946SwL c63946SwL = null;
                if (activity2 != null && (view2 = this.A0C) != null && (str = this.A0m) != null) {
                    String A0T2 = A0T();
                    String A0S2 = A0S();
                    C14360o3.A07(A0S2);
                    c63946SwL = new C63946SwL(A00(), view2, activity2, this, (UserSession) this.A08.getValue(), A012, str, A0S2, A0T2, A022, c58877QEn2.A00());
                    this.A0S = c63946SwL;
                    C63305ShB A002 = C63305ShB.A00();
                    C63305ShB.A02(new C58869QDo(c63946SwL.A07, A002, new IABExpandableFooterCallback.Stub() { // from class: com.instagram.inappbrowser.expandablefooter.IGExpandableFooterManager$fetchFromGraphQL$1
                        {
                            C0f9.A0A(-917089241, C0f9.A03(-1384374754));
                        }

                        @Override // com.facebook.browser.lite.ipc.IABExpandableFooterCallback
                        public final void D1C(String str3, String str4, double d, String str5) {
                            int A03 = C0f9.A03(71184434);
                            AbstractC167017dG.A1N(str3, str4);
                            C14360o3.A0B(str5, 3);
                            C63946SwL c63946SwL2 = C63946SwL.this;
                            EnumC61217RhH enumC61217RhH = (EnumC61217RhH) EnumHelper.A00(str4, EnumC61217RhH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            C14360o3.A07(enumC61217RhH);
                            InterfaceC65455TkR interfaceC65455TkR = (InterfaceC65455TkR) c63946SwL2.A0J.get(enumC61217RhH);
                            if (interfaceC65455TkR != null) {
                                UserSession userSession = c63946SwL2.A0B;
                                String str6 = c63946SwL2.A0F;
                                String str7 = c63946SwL2.A02;
                                FragmentActivity fragmentActivity = c63946SwL2.A09;
                                InterfaceC11380iw interfaceC11380iw = c63946SwL2.A0A;
                                String str8 = c63946SwL2.A0H;
                                String str9 = c63946SwL2.A0E;
                                String str10 = c63946SwL2.A0I;
                                InterfaceC65575Tn9 BIX = interfaceC65455TkR.BIX(new C51707Msc(c63946SwL2.A07, fragmentActivity, interfaceC11380iw, userSession, c63946SwL2.A0C, enumC61217RhH, c63946SwL2.A0D, str6, str7, str8, str9, str10, str3, str5));
                                c63946SwL2.A01 = BIX;
                                BIX.EGj(c63946SwL2.A08);
                            }
                            C0f9.A0A(-939454660, A03);
                        }
                    }, c63946SwL.A0G, c63946SwL.A0F, c63946SwL.A0E, c63946SwL.A0I), A002, false);
                }
                this.A0S = c63946SwL;
            }
            super.A0X(view, c223619u4, z, z2);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.doNotDismissOnDraggingDown();
        }
        return false;
    }

    @Override // X.C51E
    public final boolean doNotDragWhenDismissLocked() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.doNotDragWhenDismissLocked();
        }
        return false;
    }

    @Override // X.C51E
    public final boolean doNotFlingWhenDismissLocked() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.doNotFlingWhenDismissLocked();
        }
        return false;
    }

    @Override // X.C51E
    public final int dragLockBouncePx() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.dragLockBouncePx();
        }
        return 0;
    }

    @Override // X.C51E
    public final double getDragUpReleaseRatio() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.getDragUpReleaseRatio();
        }
        return 0.5d;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        int i;
        C51D c51d = this.A05;
        if (c51d != null) {
            i = c51d.getExtraDragSpace();
        } else {
            i = 0;
        }
        C51D c51d2 = this.A05;
        int i2 = 0;
        if (c51d2 != null && c51d2.includeFragmentDragSpace()) {
            View view = super.A0A;
            if (view != null) {
                i2 = view.getHeight();
            }
            return i + i2;
        }
        return i;
    }

    @Override // X.C51E
    public final double getSwipeDownDistanceAdjustment() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.getSwipeDownDistanceAdjustment();
        }
        return 0.5d;
    }

    @Override // X.C51E
    public final float getSwipeDownFlingVelocity() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.getSwipeDownFlingVelocity();
        }
        return 3500.0f;
    }

    @Override // X.C51E
    public final double getSwipeUpDistanceAdjustment() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.getSwipeUpDistanceAdjustment();
        }
        return 0.0d;
    }

    @Override // X.C51E
    public final float getSwipeUpFlingVelocity() {
        C51D c51d = this.A05;
        if (c51d != null) {
            return c51d.getSwipeUpFlingVelocity();
        }
        return 3500.0f;
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (X.C14360o3.A0K(r1, true) != false) goto L20;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r5 = this;
            int r1 = r5.A02
            r0 = 1
            if (r1 == r0) goto L6
            r0 = 0
        L6:
            r4 = 0
            if (r0 != 0) goto L47
            r3 = 1
            boolean r0 = r5.DJx(r3)
            if (r0 != 0) goto L3e
            X.51D r0 = r5.A05
            if (r0 == 0) goto L41
            X.C6o r2 = r0.backPressDestination()
            if (r2 == 0) goto L41
            X.C6o r0 = X.EnumC27385C6o.A02
            if (r2 == r0) goto L41
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            X.3DN r1 = r1.A00(r0)
            if (r1 == 0) goto L3f
            java.lang.Integer r0 = X.C05F.A03
            boolean r0 = r1.A0a(r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L41
        L3e:
            return r3
        L3f:
            r1 = 0
            goto L34
        L41:
            r1 = 2
            java.lang.String r0 = r5.A0m
            r5.AIE(r1, r0)
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172707mf.onBackPressed():boolean");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment
    public final boolean A0d() {
        long j;
        Object obj;
        if (super.A0d()) {
            return true;
        }
        Bundle bundle = new Bundle();
        C22898A7s c22898A7s = this.A0Z;
        long j2 = c22898A7s.A01;
        if (j2 != -1) {
            j = (SystemClock.elapsedRealtime() - j2) - c22898A7s.A00;
        } else {
            j = 0;
        }
        bundle.putLong("dwell_time", j);
        C9U5 c9u5 = this.A02;
        if (c9u5 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        bundle.putString("final_url", (String) c9u5.A01.A02());
        try {
            AAX aax = this.A04;
            if (aax != null) {
                try {
                    Iterator it = aax.A0A.iterator();
                    while (it.hasNext()) {
                        ((BDU) it.next()).ATZ(aax.A01, bundle, aax.A02, aax.A06, aax.A08);
                    }
                } catch (Exception unused) {
                }
                Iterator it2 = aax.A0A.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((BDU) obj).EiD()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BDU bdu = (BDU) obj;
                aax.A00 = bdu;
                if (bdu != null) {
                    try {
                        bdu.E61();
                        return true;
                    } catch (Exception unused2) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused3) {
            return false;
        }
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(-744423896);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean(AbstractC58317Pt9.A00(681));
        } else {
            z = false;
        }
        this.A06 = z;
        AbstractC25651Mw.A00((AbstractC12990ll) this.A08.getValue()).A01(this.A0A, Ad2.class);
        if (!(getContext() instanceof BBM)) {
            this.A0L = new C63934Sw9(this);
        }
        C0f9.A09(-1475541678, A02);
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity activity;
        int A02 = C0f9.A02(1544252383);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        String A022 = A02(new C58877QEn(super.A09));
        InterfaceC09390do interfaceC09390do = this.A08;
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
        C14360o3.A0B(abstractC12990ll, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, abstractC12990ll, 36313566239656095L)) {
            String A0S = A0S();
            C14360o3.A07(A0S);
            final C22930A9a c22930A9a = new C22930A9a(A00(), A0S, A0T(), A022);
            final C57251PbZ c57251PbZ = new C57251PbZ(41, c22930A9a, this);
            C63305ShB A00 = C63305ShB.A00();
            C63305ShB.A02(new C58865QDk(c22930A9a.A00, A00, new IABExtensionEventHandlerCallback.Stub() { // from class: com.instagram.inappbrowser.extensions.IgIABPixelHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1
                {
                    C0f9.A0A(-1486272472, C0f9.A03(-393048975));
                }

                @Override // com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback
                public final void D1F(List list) {
                    int A0N = AbstractC167017dG.A0N(list, 1881566943);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        IABExtensionEventHandlerPayload iABExtensionEventHandlerPayload = (IABExtensionEventHandlerPayload) it.next();
                        boolean A0K = C14360o3.A0K(iABExtensionEventHandlerPayload.A00, "BLOKS");
                        AbstractC61526Rp1 abstractC61526Rp1 = null;
                        Map map = S86.A00;
                        if (A0K) {
                            InterfaceC65456TkS interfaceC65456TkS = (InterfaceC65456TkS) map.get("BLOKS_CONTENT_ITEM");
                            if (interfaceC65456TkS != null) {
                                abstractC61526Rp1 = interfaceC65456TkS.B3Y();
                            }
                            if (abstractC61526Rp1 instanceof C60961Rcj) {
                                String str = iABExtensionEventHandlerPayload.A01;
                                C14360o3.A06(str);
                                ((C60961Rcj) abstractC61526Rp1).A03 = str;
                            }
                        } else {
                            InterfaceC65456TkS interfaceC65456TkS2 = (InterfaceC65456TkS) map.get(iABExtensionEventHandlerPayload.A01);
                            if (interfaceC65456TkS2 != null) {
                                abstractC61526Rp1 = interfaceC65456TkS2.B3Y();
                            }
                        }
                        if (abstractC61526Rp1 instanceof InterfaceC65292ThP) {
                            C22930A9a.this.A04.add(abstractC61526Rp1);
                        }
                    }
                    c57251PbZ.invoke();
                    C0f9.A0A(838270982, A0N);
                }
            }, c22930A9a.A02, c22930A9a.A01, c22930A9a.A03), A00, false);
            this.A03 = c22930A9a;
        }
        AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) interfaceC09390do.getValue();
        C14360o3.A0B(abstractC12990ll2, 0);
        if ((C18U.A06(c06090Tz, abstractC12990ll2, 36313566239459484L) || C18U.A06(c06090Tz, (AbstractC12990ll) interfaceC09390do.getValue(), 36330728924988411L)) && (activity = getActivity()) != null) {
            Context context = super.A06;
            C14360o3.A06(context);
            String A0S2 = A0S();
            C14360o3.A07(A0S2);
            final AAX aax = new AAX(context, A00(), activity, C07Y.A00(getViewLifecycleOwner()), this, (UserSession) interfaceC09390do.getValue(), A0S2, A0T(), A022);
            final C25068B7p c25068B7p = C25068B7p.A00;
            C14360o3.A0B(c25068B7p, 0);
            C63305ShB A002 = C63305ShB.A00();
            C63305ShB.A02(new C58866QDl(aax.A02, A002, new IABExtensionEventHandlerCallback.Stub() { // from class: com.instagram.inappbrowser.extensions.IgIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1
                {
                    C0f9.A0A(1723743301, C0f9.A03(2014022200));
                }

                @Override // com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback
                public final void D1F(List list) {
                    String str;
                    int A03 = C0f9.A03(1342416523);
                    C14360o3.A0B(list, 0);
                    AAX aax2 = AAX.this;
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (true) {
                        AbstractC61526Rp1 abstractC61526Rp1 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        IABExtensionEventHandlerPayload iABExtensionEventHandlerPayload = (IABExtensionEventHandlerPayload) it.next();
                        boolean A0K = C14360o3.A0K(iABExtensionEventHandlerPayload.A00, "BLOKS");
                        Map map = S86.A00;
                        if (A0K) {
                            str = "BLOKS_CONTENT_ITEM";
                        } else {
                            str = iABExtensionEventHandlerPayload.A01;
                        }
                        InterfaceC65456TkS interfaceC65456TkS = (InterfaceC65456TkS) map.get(str);
                        if (interfaceC65456TkS != null) {
                            abstractC61526Rp1 = interfaceC65456TkS.B3Y();
                        }
                        if (abstractC61526Rp1 instanceof C60961Rcj) {
                            C60961Rcj c60961Rcj = (C60961Rcj) abstractC61526Rp1;
                            String str2 = iABExtensionEventHandlerPayload.A01;
                            C14360o3.A06(str2);
                            c60961Rcj.A03 = str2;
                            UserSession userSession = aax2.A06;
                            FragmentActivity fragmentActivity = aax2.A03;
                            InterfaceC11380iw interfaceC11380iw = aax2.A05;
                            String str3 = aax2.A08;
                            String str4 = aax2.A07;
                            String str5 = aax2.A09;
                            Bundle bundle2 = aax2.A02;
                            C57312k6 c57312k6 = aax2.A04;
                            C63305ShB A003 = C63305ShB.A00();
                            C63305ShB.A02(new QDp(bundle2, A003, new IgBloksIABExtension$fetchPreExitHandlerAction$1(fragmentActivity, c57312k6, interfaceC11380iw, userSession, c60961Rcj), str3, c60961Rcj.A03, str4, str5, AbstractC166987dD.A1J("CORE_HANDLER")), A003, false);
                        }
                        A0q.add(abstractC61526Rp1);
                    }
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : A0q) {
                        if ((obj instanceof BDU) && obj != null) {
                            A1E.add(obj);
                        }
                    }
                    List list2 = aax2.A0A;
                    list2.clear();
                    list2.addAll(A1E);
                    c25068B7p.invoke();
                    C0f9.A0A(1465387483, A03);
                }
            }, aax.A08, aax.A07, aax.A09), A002, false);
            this.A04 = aax;
        }
        View view = this.A0C;
        C0f9.A09(-2024765321, A02);
        return view;
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1149653351);
        super.onDestroy();
        C6QM.A00(this);
        C0f9.A09(-1006034562, A02);
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1496731826);
        InterfaceViewOnTouchListenerC65624Tpk interfaceViewOnTouchListenerC65624Tpk = this.A0S;
        if (interfaceViewOnTouchListenerC65624Tpk != null && (interfaceViewOnTouchListenerC65624Tpk instanceof C63946SwL)) {
            C63946SwL c63946SwL = (C63946SwL) interfaceViewOnTouchListenerC65624Tpk;
            InterfaceC65575Tn9 interfaceC65575Tn9 = c63946SwL.A01;
            if (interfaceC65575Tn9 != null) {
                interfaceC65575Tn9.onDestroyView();
            }
            c63946SwL.A01 = null;
        }
        AbstractC25651Mw.A00((AbstractC12990ll) this.A08.getValue()).A02(this.A0A, Ad2.class);
        super.onDestroyView();
        C0f9.A09(-1201199586, A02);
    }

    @Override // com.facebook.browser.lite.BrowserLiteFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(-1562967825);
        super.onResume();
        if (this.A06) {
            C1UC activity = getActivity();
            if ((activity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) activity) != null) {
                interfaceC53712dA.EfL(8);
            }
        }
        C0f9.A09(-930681964, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(-1968348790);
        super.onStop();
        if (this.A06) {
            C1UC activity = getActivity();
            if ((activity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) activity) != null) {
                interfaceC53712dA.EfL(0);
            }
        }
        C0f9.A09(1273957168, A02);
    }
}
