package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.common.dextricks.Constants;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABDummyContext;
import com.facebook.iabbwpextension.IABBwPContext;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.launcher.ExternalBrowserLauncher;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.SjR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63397SjR {
    public static final C0NO A1O = new Object();
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public Parcelable A06;
    public Parcelable A07;
    public Parcelable A08;
    public RiS A09;
    public IabCommonTrait A0A;
    public C43031yW A0B;
    public IABBwPContext A0C;
    public ZonePolicy A0D;
    public IGAdsIABScreenshotDataDict A0E;
    public C51D A0F;
    public InterfaceC1119153d A0G;
    public BCD A0H;
    public InterfaceC65577TnB A0I;
    public InterfaceC86363t8 A0J;
    public SPM A0K;
    public W4O A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public List A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public int[] A1F;
    public ExternalBrowserLauncher A1G;
    public final Activity A1H;
    public final Context A1I;
    public final ZonedValue A1J;
    public final UserSession A1K;
    public final C58877QEn A1L;
    public final C2Fb A1M;
    public final ACQ A1N;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C63397SjR(Context context, UserSession userSession, C2Fb c2Fb, String str) {
        this(context, userSession, c2Fb, str, false);
        AbstractC167017dG.A1P(context, userSession);
    }

    public static final void A03(C172707mf c172707mf, C63397SjR c63397SjR) {
        View view;
        C58877QEn c58877QEn = c63397SjR.A1L;
        TGD tgd = new TGD(c58877QEn.A00(), null);
        UserSession userSession = c63397SjR.A1K;
        C38321qM A02 = C1DW.A00(userSession).A02(SVS.A00(c58877QEn));
        C42124IlY c42124IlY = new C42124IlY(c63397SjR, 1);
        if (A02 != null && (view = c172707mf.A0C) != null) {
            C71313Hs.A00(userSession).A0A(view, new C79623hD(c42124IlY, userSession, A02, tgd));
            C71313Hs.A00(userSession).A07(view, EnumC71343Hv.A0d, new String[0], 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r0 != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(android.view.MotionEvent r5, X.C63397SjR r6, boolean r7) {
        /*
            r4 = 0
            if (r5 == 0) goto L36
            if (r7 != 0) goto L36
            X.W4O r3 = r6.A0L
            r2 = 1
            if (r3 == 0) goto L19
            float r1 = r5.getRawX()
            float r0 = r5.getRawY()
            boolean r0 = r3.A01(r1, r0)
            r3 = 1
            if (r0 == r2) goto L1a
        L19:
            r3 = 0
        L1a:
            float r2 = r5.getRawY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r6.A03
            float r1 = r1 - r0
            android.content.Context r0 = r6.A1I
            int r0 = X.AbstractC13890nF.A00(r0)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1O(r0)
            if (r3 != 0) goto L36
            if (r0 != 0) goto L36
            r4 = 1
        L36:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63397SjR.A07(android.view.MotionEvent, X.SjR, boolean):boolean");
    }

    public final void A0A() {
        A02(null, this, 0);
    }

    public final void A0E(String str) {
        C14360o3.A0B(str, 0);
        this.A1L.A00.putString("TrackingInfo.ARG_USER_ID", str);
    }

    private final String A00(android.net.Uri uri) {
        String queryParameter;
        if (uri == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("fbclid");
        if (queryParameter2 == null && (queryParameter = uri.getQueryParameter("u")) != null) {
            return A00(AbstractC08820cl.A00(A1O, queryParameter));
        }
        return queryParameter2;
    }

    public static final void A01(Intent intent, Fragment fragment, C63012Sab c63012Sab, C63397SjR c63397SjR, int i) {
        C63217SfN A00;
        IABAdsContext iABAdsContext;
        Activity activity;
        C3DN A002;
        IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension;
        if (c63397SjR.A0Q == null && ((A00 = C63217SfN.A08.A00(intent)) == null || !A00.A03())) {
            IabCommonTrait iabCommonTrait = c63397SjR.A0A;
            if (iabCommonTrait != null && (iabCommonTrait instanceof IABAdsContext)) {
                iABAdsContext = (IABAdsContext) iabCommonTrait;
            } else {
                iABAdsContext = null;
            }
            Integer num = null;
            if (iABAdsContext != null && (iABAdsBwIntegrationExtension = iABAdsContext.A00) != null) {
                num = iABAdsBwIntegrationExtension.A01;
            }
            if (num != C05F.A0N && !c63397SjR.A0w && (((activity = c63397SjR.A1H) == null || (A002 = C3DN.A00.A00(activity)) == null || !((C3DP) A002).A0h) && c63397SjR.A05())) {
                UserSession userSession = c63397SjR.A1K;
                if (C18U.A06(C06090Tz.A05, userSession, 36322508357511438L)) {
                    if (activity == null) {
                        return;
                    }
                    intent.putExtras(c63012Sab.A01());
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", intent);
                    A0b.putBoolean("arg_should_hide_tab_widget", true);
                    AbstractC03240Dh.A00(A0b, userSession);
                    android.net.Uri data = intent.getData();
                    if (data == null) {
                        data = android.net.Uri.EMPTY;
                    }
                    C14360o3.A0A(data);
                    IABViewModeLaunchConfig.FullScreen fullScreen = IABViewModeLaunchConfig.FullScreen.A00;
                    IabCommonTrait iabCommonTrait2 = c63397SjR.A0A;
                    if (iabCommonTrait2 == null) {
                        C16930sl c16930sl = C16930sl.A00;
                        iabCommonTrait2 = new IABDummyContext(ImmutableList.copyOf((Collection) c16930sl), c16930sl);
                    }
                    C172707mf A003 = A1B.A00(data, iabCommonTrait2, fullScreen, intent.getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1L));
                    A003.setArguments(A0b);
                    C14360o3.A0C(activity, MSV.A00(0));
                    C140966Yy c140966Yy = new C140966Yy((FragmentActivity) activity, userSession);
                    c140966Yy.A0D(A003);
                    c140966Yy.A04();
                    return;
                }
            }
        }
        intent.putExtras(c63012Sab.A01());
        intent.setFlags(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        Activity activity2 = c63397SjR.A1H;
        if (activity2 != null) {
            C55772hI.A00(c63397SjR.A1K).A06(activity2);
        } else {
            C55772hI.A00(c63397SjR.A1K).A0C(new TF1(c63397SjR), "button", 0);
        }
        if (fragment != null && fragment.getContext() != null) {
            C12260kU.A06(fragment, intent, i);
        } else {
            if (i != 0) {
                if (activity2 != null) {
                    C12260kU.A08(activity2, intent, i);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            C12260kU.A0C(c63397SjR.A1I, intent);
        }
    }

    public static final void A04(C172707mf c172707mf, C63397SjR c63397SjR, int i) {
        C3DN c3dn;
        float f;
        if (C18U.A06(C06090Tz.A05, c63397SjR.A1K, 36321241342616830L)) {
            Activity activity = c63397SjR.A1H;
            if (activity != null) {
                c3dn = C3DN.A00.A00(activity);
            } else {
                c3dn = null;
            }
            QF6 C9a = c172707mf.C9a();
            if (C9a != null && c3dn != null) {
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) c3dn).A0D;
                if (viewOnTouchListenerC65896Tw0 != null) {
                    f = viewOnTouchListenerC65896Tw0.A0E(i);
                } else {
                    f = 0.0f;
                }
                int round = Math.round(f);
                int A09 = AbstractC13880nE.A09(c63397SjR.A1I) - round;
                SIC sic = C9a.A0G;
                sic.A01 = A09;
                QF6.A00(C9a);
                if (sic.A04 && sic.A03) {
                    C9a.A0G(AnonymousClass001.A0c("(function () { window.__screen_top_override__ = ", "; })()", A09));
                }
                SIC sic2 = C9a.A0G;
                sic2.A00 = round;
                QF6.A00(C9a);
                if (sic2.A04 && sic2.A03) {
                    C9a.A0G(AnonymousClass001.A0c("(function () { window.__outer_height_override__ = ", "; })()", round));
                }
            }
        }
    }

    private final boolean A05() {
        C58877QEn c58877QEn = this.A1L;
        if (c58877QEn.A00.getString("TrackingInfo.ARG_AD_ID") != null && c58877QEn.A00.getString("TrackingInfo.ARG_TRACKING_TOKEN") != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A1K, 36315000754932686L) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A1K, 36315000754801613L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A06() {
        /*
            r9 = this;
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r9.A0D
            r8 = 0
            if (r1 == 0) goto L95
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A0D
            if (r1 != r0) goto L19
            com.instagram.common.session.UserSession r3 = r9.A1K
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315000754801613(0x81044d00020bcd, double:3.0290909338828864E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r7 = 1
            if (r0 != 0) goto L1a
        L19:
            r7 = 0
        L1a:
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r9.A0D
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A0F
            if (r1 != r0) goto L30
            com.instagram.common.session.UserSession r3 = r9.A1K
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315000754932686(0x81044d00040bce, double:3.0290909339657775E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r6 = 1
            if (r0 != 0) goto L31
        L30:
            r6 = 0
        L31:
            java.lang.String r5 = r9.A09()
            if (r5 == 0) goto L6b
            com.instagram.common.session.UserSession r4 = r9.A1K
            X.1Ai r3 = X.AbstractC23021Ah.A00(r4)
            X.0ry r2 = r3.A7E
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 168(0xa8, float:2.35E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r3, r2, r1, r0)
            if (r0 == 0) goto L6b
            X.2Fb r1 = r9.A1M
            X.2Fb r0 = X.C2Fb.A1W
            if (r1 != r0) goto L6b
            if (r6 == 0) goto L6b
            X.TF0 r0 = new X.TF0
            r0.<init>(r9)
            X.0wW r1 = X.AbstractC12220kQ.A01(r0, r4)
            java.lang.String r0 = "mwb_safe_browsing_warning_events"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L6b
            java.lang.String r0 = "message_url_clicked"
            X.AbstractC58321PtD.A1F(r1, r0, r5)
        L6b:
            com.instagram.common.session.UserSession r4 = r9.A1K
            X.1Ai r3 = X.AbstractC23021Ah.A00(r4)
            X.0ry r2 = r3.A7E
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 168(0xa8, float:2.35E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r3, r2, r1, r0)
            if (r0 == 0) goto L95
            X.2Fb r1 = r9.A1M
            X.2Fb r0 = X.C2Fb.A1W
            if (r1 != r0) goto L95
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313566237493374(0x8102ff001d087e, double:3.0281837393608185E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L94
            if (r7 != 0) goto L94
            if (r6 == 0) goto L95
        L94:
            r8 = 1
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63397SjR.A06():boolean");
    }

    public static final boolean A08(C63397SjR c63397SjR) {
        return C18U.A06(C06090Tz.A05, c63397SjR.A1K, 36321241342551293L);
    }

    public final String A09() {
        if (this.A1J != null) {
            ZonePolicy zonePolicy = ZonePolicy.A0F;
            Integer num = C05F.A08;
            Rl2 ELD = AbstractC58320PtC.A0Y().ELD(new C64113SzU(this), zonePolicy, "UNKNOWN");
            C14360o3.A07(ELD);
            Object A00 = AbstractC61814Ru8.A00(ELD);
            C14360o3.A07(A00);
            ZonedValue zonedValue = (ZonedValue) A00;
            C14360o3.A0B(zonedValue, 0);
            return (String) AbstractC58320PtC.A0Y().F9x(zonedValue, num);
        }
        return null;
    }

    public final void A0B(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_AD_ID", str);
    }

    public final void A0C(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_MEDIA_ID", str);
    }

    public final void A0D(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_TRACKING_TOKEN", str);
    }

    public final void A0F(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_REEL_VIEWER_SESSION_ID", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4.A1K, 36320545557979812L) == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(boolean r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L12
            com.instagram.common.session.UserSession r3 = r4.A1K
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36320545557979812(0x810958000822a4, double:3.03259748973991E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L13
        L12:
            r0 = 0
        L13:
            r4.A0n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63397SjR.A0G(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e9, code lost:
    
        if (X.AbstractC31171DnF.A1X(r1.getQueryParameter("u")) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x039a, code lost:
    
        if (X.C18U.A06(r2, r3, 36324698791031199L) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03ad, code lost:
    
        if (X.C18U.A06(r2, r3, 36324698790900125L) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b3, code lost:
    
        if (r0 != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ea, code lost:
    
        if (r7.equals(com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r3 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x056e, code lost:
    
        if (r0 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x09f1, code lost:
    
        if (r1.get("clips_ad_cta_fragment") != null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x09f6, code lost:
    
        r1 = r45.mArguments;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x09f8, code lost:
    
        if (r1 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x09fa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0a01, code lost:
    
        if (r1.get("clips_ad_cta_non_animation_swipe") != null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0a04, code lost:
    
        r10 = r46.A1H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0a06, code lost:
    
        if (r10 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0a08, code lost:
    
        if (r5 == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0a0c, code lost:
    
        if (r46.A10 != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0a0e, code lost:
    
        X.C0b3.A00();
        X.C0b3.A02(r0, X.AbstractC53863Nrr.A00(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0a1c, code lost:
    
        if (X.C2U7.A00 == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0a1e, code lost:
    
        if (r5 == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0a20, code lost:
    
        r1 = com.facebook.R.anim.modal_empty_animation;
        r7.putExtra("BrowserLiteIntent.EXTRA_ANIMATION", new int[]{com.facebook.R.anim.modal_empty_animation, com.facebook.R.anim.modal_empty_animation, com.facebook.R.anim.modal_empty_animation, com.facebook.R.anim.right_out});
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0a2f, code lost:
    
        r0 = X.AbstractC13110lx.A00(r10);
        r12 = com.facebook.R.anim.modal_slide_up_enter;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0a36, code lost:
    
        r0.overridePendingTransition(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0a4b, code lost:
    
        r5 = com.facebook.R.anim.modal_slide_up_enter;
        r1 = com.facebook.R.anim.modal_empty_animation;
        r0 = com.facebook.R.anim.modal_slide_down_exit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0a54, code lost:
    
        if (r12 == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0a56, code lost:
    
        r5 = com.facebook.R.anim.right_in;
        r0 = com.facebook.R.anim.right_out;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0a5c, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_ANIMATION", new int[]{r5, com.facebook.R.anim.modal_empty_animation, com.facebook.R.anim.modal_empty_animation, r0});
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0a66, code lost:
    
        r12 = com.facebook.R.anim.bottom_in;
        r1 = com.facebook.R.anim.noop;
        r7.putExtra("BrowserLiteIntent.EXTRA_ANIMATION", new int[]{com.facebook.R.anim.bottom_in, com.facebook.R.anim.noop, com.facebook.R.anim.noop, com.facebook.R.anim.bottom_out});
        r0 = X.AbstractC13110lx.A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0a3b, code lost:
    
        if (X.C20J.A00 == false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0a3d, code lost:
    
        r5 = X.C06090Tz.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0a48, code lost:
    
        if (X.C18U.A06(r5, r3, 36310426616332362L) == false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0aa1, code lost:
    
        r12 = com.facebook.graphql.calls.GraphQlCallInput.A02;
        r1 = X.AbstractC25227BEk.A0T(r12, "", "sensitive_string_value");
        r14 = r12.A02();
        r14.A0E(r1, "access_token");
        r12 = X.AbstractC25225BEi.A0b();
        X.AbstractC31173DnH.A1M(r14, r12.A00, X.AbstractC111324zv.A00(5139));
        r12 = X.Sg3.A00(new X.C907442n(r12, X.QHN.class, "IABAutofillData", false), r3);
        r12.A00 = new X.C58530Pwy(1, r0, r3);
        X.Sg3.A02(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0ae5, code lost:
    
        X.AbstractC63317ShP.A00(new X.C60902RbH(r3, 1), r3);
        X.AbstractC63317ShP.A03(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0afb, code lost:
    
        if (X.C18U.A06(r5, r3, 2342153435828256826L) != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0afd, code lost:
    
        X.AbstractC63317ShP.A00(new X.C58530Pwy(5, null, r3), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0b08, code lost:
    
        X.C20J.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0add, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0ade, code lost:
    
        r1 = "AutofillGraphQLRequest";
        r0 = "Error creating query autofill request";
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0ae2, code lost:
    
        X.C0w9.A06(r1, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0a7d, code lost:
    
        r12 = X.Sg3.A00(new X.C907442n(X.AbstractC25225BEi.A0b(), X.QHR.class, "IABAutofillMultiData", false), r3);
        r12.A00 = new X.C58530Pwy(0, r0, r3);
        X.Sg3.A02(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0a9b, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0a9c, code lost:
    
        r1 = "AutofillGraphQLRequest";
        r0 = "Error creating query multiple entries autofill request";
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0b0a, code lost:
    
        r14 = X.C06090Tz.A06;
        r15 = X.C18U.A06(r14, r3, 2342153435828846654L);
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENABLED", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0b2a, code lost:
    
        if (X.AbstractC166987dD.A0x(r3).getInt("browser_consecutive_decline_autofill", 0) < X.AbstractC61730Rsl.A00(r46.A0B)) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0b2c, code lost:
    
        r0 = X.EnumC61149RgA.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0b2e, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_CONTACT_OPT_IN_STATUS", r0.A00);
        r12 = X.C17280tP.A4E.A00();
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", X.AbstractC167017dG.A1b(r12, r12.A2c, X.C17280tP.A4G, 188));
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_SHOW_CONSENT", r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0b51, code lost:
    
        if (r46.A0V == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0b53, code lost:
    
        r13.A02(r0.getString(2131964376), "OPEN_BROWSER_SETTINGS", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0b62, code lost:
    
        r1 = X.AbstractC25229BEm.A0h(r3, r11.A00.getString("TrackingInfo.ARG_MEDIA_ID"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0b6e, code lost:
    
        if (r1 != null) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0b78, code lost:
    
        r0 = r1.A0C.BEY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0b7e, code lost:
    
        if (r0 != null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0b86, code lost:
    
        r0 = r1.A0C.BEY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0b8c, code lost:
    
        if (r0 != null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0b8e, code lost:
    
        r5 = X.AbstractC166997dE.A1Z(r0.CW1(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0b96, code lost:
    
        r1 = X.AbstractC166987dD.A0b();
        r1.putString("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY", r12);
        r1.putBoolean("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", r5);
        r7.putExtra("BrowserLiteIntent.InstagramExtras.EXTRA_AUTOFILL_OPTOUT_INFO", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x10d4, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x10fa, code lost:
    
        throw X.AbstractC166997dE.A0g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0ba9, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_SHOULD_SHOW_FBPAY_DISCLOSURE", true);
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_SHOULD_REMOVE_AUTOFILL_DOMAIN_OPT_OUT", X.C18U.A06(r2, r3, 36310426616135752L));
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_CONTACT_AUTOFILL_BLOCK_LIST", X.C18U.A04(r2, r3, 36873376569622536L));
        r5 = X.AbstractC23021Ah.A00(r3);
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_SUPPRESS_NUX_EXPERIMENT_VERSION_ID", X.AbstractC166987dD.A0H(r5.A0P.CES(r5, r18[166(0xa6, float:2.33E-43)])));
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0be5, code lost:
    
        if (X.AbstractC14490oL.A09(r0) == false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0bf2, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_ENABLED", true);
        r7.putStringArrayListExtra("BrowserLiteIntent.EXTRA_IG_FBPAY_BUTTON_AUTOFILL_DATA", X.C20J.A02());
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_AUTOFILL_BLOCK_LIST", X.C18U.A04(r2, r3, 36873376569425927L));
        r7.putExtra("BrowserLiteIntent.EXTRA_AUTOFILL_UPPER_FUNNEL_LOGGING_ENABLED", X.C18U.A06(r14, r3, 36310426617512020L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0c25, code lost:
    
        if (X.C18U.A06(r2, r3, 36313566238279818L) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0c27, code lost:
    
        r13.A02(r0.getResources().getString(2131964373), "ACTION_PRIVACY_POLICY", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0c38, code lost:
    
        r0 = X.C2JG.A01(r3);
        X.C14360o3.A07(r0);
        r12 = r0.A01;
        r5 = r12.A02;
        r0 = (X.C94934Oy) r5.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0c49, code lost:
    
        if (r0 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0c4b, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0c4c, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_CLICK_IDS", r1);
        r7.putExtra("BrowserLiteIntent.EXTRA_CLICK_ID_POOL_FETCH_STATE", r12.A01.get());
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0c65, code lost:
    
        if (X.C18U.A06(r2, r3, 36313566236379247L) == false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x10cd, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0c77, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID", r1);
        r7.putExtra("BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT", X.C2JJ.A00);
        r7.putExtra("BrowserLiteIntent.EXTRA_GET_CLICKID_FROM_IAB_ADS_CONTEXT", X.C18U.A06(r2, r3, 36313566238738577L));
        r0 = (X.C94934Oy) r5.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0c97, code lost:
    
        if (r0 != null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0c99, code lost:
    
        r13.A04(new byte[0], 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0c9e, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_SHOULD_BUFFER_PIXEL_REQUESTS", X.C18U.A06(r2, r3, 36327829822061465L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0cac, code lost:
    
        if (r17 != null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0cbe, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0cc5, code lost:
    
        if (r46.A0t != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0cc7, code lost:
    
        r1 = r26.getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0ccb, code lost:
    
        if (r17 == null) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0ce1, code lost:
    
        r11.A00.putString("TrackingInfo.ARG_CLICK_ID", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0cdd, code lost:
    
        r5 = r46.A00(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0ce8, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_ENABLE_DDV2_IAB_OPEN_EXTERNAL_BROWSER", X.C18U.A06(r2, r3, 36330239298716416L));
        r7.putExtra("BrowserLiteIntent.EXTRA_IG_FBPAY_BUTTON_SUPPORT", X.C18U.A06(r2, r3, 36313501811083300L));
        r7.putExtra("BrowserLiteIntent.EXTRA_IG_META_CHECKOUT_SDK_ENABLED", X.C18U.A06(r2, r3, 36315971417608030L));
        r7.putExtra("BrowserLiteIntent.EXTRA_LE_DESIGN_EXPERIMENT_STYLE", 2);
        r7.putExtra("BrowserLiteIntent.EXTRA_ACTIVITY_THEME_STYLES", new int[]{X.AbstractC53172bz.A00()});
        r7.putExtra("BrowserLiteIntent.EXTRA_SHOULD_DISABLE_SWIPE_TO_CLOSE", true);
        r7.putExtra("BrowserLiteIntent.HANDLE_INTENT_START_TIME", java.lang.System.nanoTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0d35, code lost:
    
        if (r46.A0z == false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0d37, code lost:
    
        if (r10 != null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0d39, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0d47, code lost:
    
        if (X.C18U.A06(r2, r3, 36321241342158072L) != false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0d49, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0d4c, code lost:
    
        if (r46.A0Z == false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0d4f, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_SHOW_PARTIAL_MENU_ITEM", r1);
        r7.putExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME", "THEME_INSTAGRAM_WATCH_AND_BROWSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0d64, code lost:
    
        if (X.C18U.A06(r2, r3, 36313501812328493L) != false) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0d66, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0d70, code lost:
    
        if (X.C18U.A06(r2, r3, 36313501811083300L) == false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0d73, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_IG_FBPAY_BUTTON_SUPPORT", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0d78, code lost:
    
        if (r46.A0s != false) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0d7a, code lost:
    
        r1 = r46.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0d7c, code lost:
    
        if (r1 != null) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0d7e, code lost:
    
        r7.putExtra("BrowserLiteIntent.IABLoggingExtras.IAB_IS_NON_VIEWABLE_SYSTEM_ENABLED", true);
        r7.putExtra("BrowserLiteIntent.IABLoggingExtras.IAB_NV_SOURCE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0f6e, code lost:
    
        X.C0K8.A0E("BrowserLauncher", "isNonViewableSystemEnabled is set to true but iabNVSource is null. This should never happen. Please ensure to supply a valid IABNVSource when using Non Viewable Event System!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0d88, code lost:
    
        r11.A00.putBoolean("TrackingInfo.ARG_FORCE_DISABLE_LINK_HISTORY_OPT_IN_NUX", true);
        r1 = new android.os.Bundle(r11.A00);
        r0 = r7.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0d9c, code lost:
    
        if (r0 != null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0d9e, code lost:
    
        r0.putAll(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0da1, code lost:
    
        r26.putExtras(r13.A01());
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0dac, code lost:
    
        if (r46.A0t != false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0dae, code lost:
    
        r26.putExtra("BrowserLiteIntent.EXTRA_IS_PERSISTENT_IAB", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0dbe, code lost:
    
        if (X.C18U.A06(r2, r3, 36321546285360741L) != false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0dc0, code lost:
    
        r26.putExtra("BrowserLiteIntent.EXTRA_IS_NON_VIEWABLE_SYSTEM_ENABLED", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0dc7, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0dca, code lost:
    
        if (r46.A0k != false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0dcc, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0dcd, code lost:
    
        r46.A05 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0dcf, code lost:
    
        r6 = X.AbstractC166987dD.A0b();
        r6.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", r26);
        X.AbstractC03240Dh.A00(r6, r3);
        r5 = r26.getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0de1, code lost:
    
        if (r5 == null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0de3, code lost:
    
        r5 = android.net.Uri.EMPTY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0de5, code lost:
    
        X.C14360o3.A0A(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0dea, code lost:
    
        if (r46.A0q != false) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0f5f, code lost:
    
        r11 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.Peek.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0e0f, code lost:
    
        r13 = r46.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0e11, code lost:
    
        if (r13 == null) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0e13, code lost:
    
        r1 = X.C16930sl.A00;
        r13 = new com.facebook.iabadscontext.IABDummyContext(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0e1e, code lost:
    
        r5 = X.A1B.A00(r5, r13, r11, r26.getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1));
        r5.setArguments(r6);
        r0 = r46.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0e31, code lost:
    
        if (r0 != null) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0e33, code lost:
    
        r5.A05 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0e35, code lost:
    
        r1 = r46.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0e37, code lost:
    
        if (r1 != null) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0e39, code lost:
    
        r1.A00 = new X.SCZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0e40, code lost:
    
        r1 = X.C3DN.A00.A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0e46, code lost:
    
        if (r1 != null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0e48, code lost:
    
        r1.A0R(new X.C64508TGw(r5, r46, r1));
        r5.A0g = new X.C62569SGu(r5, r46, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0e59, code lost:
    
        if (r46.A1C != false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0e5b, code lost:
    
        ((X.C3DP) r1).A0B = new X.C62447SCa(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0e67, code lost:
    
        if (r46.A0x != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0e6f, code lost:
    
        ((X.C3DP) r1).A0C = new X.C68815VcW(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0e78, code lost:
    
        r13 = new X.C43012J0c(0, r5, r46);
        r1 = new X.C64506TGu(r46, 2);
        r11 = new X.C64507TGv(0, r5, r46);
        r6 = new X.C189448aO(r3);
        r6.A0a = true;
        r6.A1H = true;
        r6.A1A = r46.A0y;
        r6.A13 = r46.A0l;
        r6.A03 = r46.A03;
        r6.A1O = r46.A14;
        r12 = r46.A0c;
        r6.A0q = !r12;
        r6.A0k = r12;
        r6.A1F = r46.A1B;
        r6.A1D = r46.A0t;
        r6.A18 = r46.A0q;
        r6.A1P = r46.A15;
        r6.A1Q = r46.A17;
        r6.A1I = true;
        r6.A11 = true;
        r6.A0U = r13;
        r6.A0t = false;
        r6.A1L = r46.A12;
        r6.A0l = r46.A0d;
        r6.A0T = r46.A0F;
        r6.A0u = false;
        r6.A1R = r46.A18;
        r6.A0s = r46.A0k;
        r6.A01 = r46.A01;
        r6.A0i = r46.A0a;
        r6.A0V = r1;
        r6.A0W = r11;
        r6.A1T = r46.A1F;
        r6.A0n = r46.A0f;
        r6.A0r = r46.A0i;
        r6.A0o = r46.A0g;
        r6.A1M = r46.A13;
        r6.A0Y = r46.A0L;
        r6.A02 = r46.A02;
        r6.A0j = r46.A0b;
        r6.A00 = r46.A00;
        r6.A0m = r46.A0e;
        r6.A07 = r46.A04;
        r6.A15 = r46.A0p;
        r6.A00().A02(r10, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0f23, code lost:
    
        if (r46.A0m != false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0f25, code lost:
    
        A03(r5, r46);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0e0d, code lost:
    
        r11 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.HalfSheet.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0f63, code lost:
    
        X.C14360o3.A07(r7.putExtra("BrowserLiteIntent.EXTRA_TRACKING", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0d72, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0d4e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0f2a, code lost:
    
        if (r46.A0m != false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0f2c, code lost:
    
        X.C3KL.A00(r3).A06("webview");
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0f3f, code lost:
    
        if (X.C18U.A06(r2, r3, 36318183325505537L) != false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0f41, code lost:
    
        X.OSB.A00(r3, r16, "in_app_browser_v2", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0f48, code lost:
    
        if (r20 == false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0f50, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_IS_WEBVIEW_HOT_INSTANCE_EXPERIMENT_TYPE", X.C18U.A04(r2, r3, 36876516190060659L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0f5e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0f79, code lost:
    
        if (r46.A10 != false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0f7b, code lost:
    
        if (r10 != null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0f81, code lost:
    
        r7.putExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME", "THEME_INSTAGRAM_SIDE_PANEL");
        r7.putExtra("BrowserLiteIntent.EXTRA_SHOULD_LOG_IAB_LAUNCH_WHEN_FULLY_VISIBLE", X.C18U.A06(r14, r3, 36317517609768256L));
        r26.putExtras(r13.A01());
        r9 = X.AbstractC166987dD.A0b();
        r9.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", r26);
        X.AbstractC03240Dh.A00(r9, r3);
        r6 = r26.getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0faf, code lost:
    
        if (r6 == null) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0fb1, code lost:
    
        r6 = android.net.Uri.EMPTY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0fb3, code lost:
    
        X.C14360o3.A0A(r6);
        r5 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.FullScreen.A00;
        r4 = r46.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0fba, code lost:
    
        if (r4 == null) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0fbc, code lost:
    
        r1 = X.C16930sl.A00;
        r4 = new com.facebook.iabadscontext.IABDummyContext(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0fc7, code lost:
    
        r5 = X.A1B.A00(r6, r4, r5, r26.getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1));
        r5.setArguments(r9);
        X.C14360o3.A0C(r10, X.AbstractC43591JPw.A00(6));
        r0 = ((androidx.fragment.app.FragmentActivity) r10).getSupportFragmentManager();
        X.C14360o3.A07(r0);
        r4 = new X.C14240no(r0);
        r4.A0C(r5, "fragment_clips_ad_cta_panel", com.facebook.R.id.layout_container_right);
        r4.A0K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x1006, code lost:
    
        if (X.C18U.A06(r2, r3, 36322791825353276L) != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x1008, code lost:
    
        r0 = (X.C128765rk) r3.A01(X.C128765rk.class, new X.MHJ(r3, 12));
        r9 = new X.SIX(r26, r45, r13, r46, r47);
        r1 = X.C6JS.A05.A00(r0.A00).A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x102e, code lost:
    
        if (r1 != null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x1030, code lost:
    
        r5 = X.C41761wQ.A00();
        r1 = X.C42221xC.A09(new com.facebook.msys.mca.MailboxFeature(r1)).A0N(X.AbstractC137146It.A00("safebrowsing_instagram_standalone")).A0L(X.C48429Lbi.A00);
        r0 = new X.THG(r9, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x1052, code lost:
    
        r5.A02(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x1098, code lost:
    
        r4 = X.AbstractC166987dD.A1H();
        r6 = r9.A03;
        r6.A02.putExtra("BrowserLiteIntent.EXTRA_BLACK_HOLE_LIST", r4);
        A01(r9.A01, r9.A02, r6, r9.A04, r9.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x105b, code lost:
    
        if (r46.A06() != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x105d, code lost:
    
        r0 = X.C09Y.A00().A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x1065, code lost:
    
        if (r0 != null) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x1067, code lost:
    
        r5 = X.C41761wQ.A00();
        r10 = new X.SIY(r26, r45, r13, r46, r47);
        r1 = ((X.C47398Kwn) X.AbstractC41851wZ.A00(r0).A01(X.C47398Kwn.class, new X.MHJ(r0, 11))).A00.A00.A0L(X.C48427Lbg.A00);
        r0 = new X.THG(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x10f5, code lost:
    
        throw X.AbstractC166997dE.A0g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x10b2, code lost:
    
        A01(r26, r45, r13, r46, r47);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x10b9, code lost:
    
        r0 = r0.A00;
        r5 = r0.A01;
        r1 = r0.A00;
        r0 = android.util.Base64.decode(r0.A02, 0);
        X.C14360o3.A0A(r0);
        r13.A04(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0c76, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x10d0, code lost:
    
        r1 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x10d7, code lost:
    
        r0 = X.EnumC61149RgA.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0a03, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x09f4, code lost:
    
        if (r45 == null) goto L360;
     */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0cc7  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0f77  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x10b9  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x10d0  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x10d7  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0167 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(androidx.fragment.app.Fragment r45, X.C63397SjR r46, int r47) {
        /*
            Method dump skipped, instructions count: 4432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63397SjR.A02(androidx.fragment.app.Fragment, X.SjR, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SVS, X.QEn] */
    public C63397SjR(Context context, UserSession userSession, C2Fb c2Fb, String str, boolean z) {
        ZonedValue zonedValue;
        boolean z2;
        int A06 = AbstractC167007dF.A06(1, context, userSession);
        C14360o3.A0B(c2Fb, 4);
        this.A1L = new SVS();
        this.A1K = userSession;
        if (str != null) {
            zonedValue = new ZonedValue(ZonePolicy.A0F, str);
        } else {
            zonedValue = null;
        }
        this.A1J = zonedValue;
        this.A1M = c2Fb;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        this.A1H = activity;
        this.A1I = context;
        this.A0T = Collections.emptyList();
        int i = 1;
        this.A0r = true;
        this.A0O = "";
        this.A0c = true;
        this.A03 = 0.5f;
        this.A04 = A06;
        this.A0y = true;
        this.A0Z = true;
        this.A19 = true;
        this.A05 = 4;
        this.A02 = 0.5f;
        this.A0B = new C43031yW(userSession);
        this.A1N = new ACQ();
        if (activity != null) {
            this.A1G = new ExternalBrowserLauncher(activity, userSession);
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                C14360o3.A07(decorView);
                z2 = !AbstractC56402iY.A0B(decorView, window);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            this.A1G = new ExternalBrowserLauncher(context, userSession);
            z2 = false;
        }
        this.A0o = z2;
        UserSession userSession2 = this.A1K;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36321241342420219L)) {
            i = 3;
        } else if (!C18U.A06(c06090Tz, this.A1K, 36321241342223609L)) {
            i = 2;
        }
        this.A04 = i;
    }
}
