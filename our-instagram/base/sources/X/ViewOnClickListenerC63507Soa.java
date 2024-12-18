package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Soa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63507Soa implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC63507Soa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC63507Soa(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        int A052;
        int i2;
        Context context;
        long j;
        Long A0j;
        int A053;
        int i3;
        C5KS c5ks;
        String A0u;
        IllegalStateException A14;
        int i4;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1711696775);
                ((InterfaceC16820sZ) ((C51760Mtj) this.A01).A02).invoke();
                i = -1778469858;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1277997612);
                ((Activity) this.A01).finish();
                i = 98101081;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-2133882837);
                ((Dialog) this.A01).dismiss();
                i = 99465895;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(216934774);
                Q5b q5b = ((DirectWidgetConfig) this.A01).A02;
                if (q5b != null) {
                    q5b.dismiss();
                    i = -614927503;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "bottomSheet";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A05 = C0f9.A05(1757298587);
                AbstractC51982Zy.A01(1);
                DirectWidgetConfig directWidgetConfig = (DirectWidgetConfig) this.A01;
                Q5b q5b2 = directWidgetConfig.A02;
                if (q5b2 != null) {
                    q5b2.dismiss();
                    directWidgetConfig.recreate();
                    i = 467591830;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "bottomSheet";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A05 = C0f9.A05(2086263312);
                AbstractC51982Zy.A01(2);
                DirectWidgetConfig directWidgetConfig2 = (DirectWidgetConfig) this.A01;
                Q5b q5b3 = directWidgetConfig2.A02;
                if (q5b3 != null) {
                    q5b3.dismiss();
                    directWidgetConfig2.recreate();
                    i = -1413080723;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "bottomSheet";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A05 = C0f9.A05(1866821521);
                AbstractC51982Zy.A01(-1);
                DirectWidgetConfig directWidgetConfig3 = (DirectWidgetConfig) this.A01;
                Q5b q5b4 = directWidgetConfig3.A02;
                if (q5b4 != null) {
                    q5b4.dismiss();
                    directWidgetConfig3.recreate();
                    i = 357645942;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "bottomSheet";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                A05 = C0f9.A05(-650405467);
                Q5b q5b5 = ((DirectWidgetConfig) this.A01).A02;
                if (q5b5 != null) {
                    q5b5.dismiss();
                    i = 1454959398;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "bottomSheet";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                A05 = C0f9.A05(616557242);
                DirectWidgetConfig directWidgetConfig4 = (DirectWidgetConfig) this.A01;
                Q5b q5b6 = directWidgetConfig4.A02;
                str = "bottomSheet";
                if (q5b6 != null) {
                    q5b6.setContentView(R.layout.chat_theme_selection_dialog);
                    Q5b q5b7 = directWidgetConfig4.A02;
                    if (q5b7 != null) {
                        View findViewById = q5b7.findViewById(R.id.light_theme_setting);
                        if (findViewById != null) {
                            A00(findViewById, 4, directWidgetConfig4);
                        }
                        Q5b q5b8 = directWidgetConfig4.A02;
                        if (q5b8 != null) {
                            View findViewById2 = q5b8.findViewById(R.id.dark_theme_setting);
                            if (findViewById2 != null) {
                                A00(findViewById2, 5, directWidgetConfig4);
                            }
                            Q5b q5b9 = directWidgetConfig4.A02;
                            if (q5b9 != null) {
                                View findViewById3 = q5b9.findViewById(R.id.default_theme_setting);
                                if (findViewById3 != null) {
                                    A00(findViewById3, 6, directWidgetConfig4);
                                }
                                Q5b q5b10 = directWidgetConfig4.A02;
                                if (q5b10 != null) {
                                    View findViewById4 = q5b10.findViewById(R.id.exit_settings_button);
                                    if (findViewById4 != null) {
                                        A00(findViewById4, 7, directWidgetConfig4);
                                    }
                                    Q5b q5b11 = directWidgetConfig4.A02;
                                    if (q5b11 != null) {
                                        C0fJ.A00(q5b11);
                                        i = 691440770;
                                        C0f9.A0C(i, A05);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                A05 = C0f9.A05(-226602831);
                REG reg = (REG) this.A01;
                Bundle A0H = AbstractC58322PtE.A0H(reg.A03, "fbpay_all_payment_activity_button_click", AbstractC58442PvL.A08(reg.A00));
                A0H.putParcelable("logger_data", reg.A00);
                C63167SeR.A00(reg.A06, new C62902SWi("transactions_list", A0H));
                i = 1306408549;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(1279749216);
                C63167SeR.A00(((Q8X) this.A01).A06, new C62902SWi("promotion_payment", AbstractC166987dD.A0b()));
                i = 1827286865;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(2102434993);
                ((Rb4) this.A01).A00();
                i = 1141560456;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A052 = C0f9.A05(-1931442337);
                RunnableC64711TQs runnableC64711TQs = (RunnableC64711TQs) this.A01;
                R3M reactApplicationContextIfActiveOrWarn = runnableC64711TQs.A02.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    ((IgReactDelegate.RCTViewEventEmitter) reactApplicationContextIfActiveOrWarn.A03(IgReactDelegate.RCTViewEventEmitter.class)).emit("didTapLeftBarButton", Double.valueOf(runnableC64711TQs.A00));
                }
                i2 = 1136421817;
                C0f9.A0C(i2, A052);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A052 = C0f9.A05(-515573910);
                TRL trl = (TRL) this.A01;
                R3M reactApplicationContextIfActiveOrWarn2 = trl.A03.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn2 != null) {
                    ((IgReactDelegate.RCTViewEventEmitter) reactApplicationContextIfActiveOrWarn2.A03(IgReactDelegate.RCTViewEventEmitter.class)).emit("didTapRightBarButton", Double.valueOf(trl.A00));
                }
                i2 = 264449024;
                C0f9.A0C(i2, A052);
                return;
            case 14:
                A053 = C0f9.A05(-1221058655);
                PCR pcr = (PCR) this.A01;
                NTS nts = pcr.A03().A00;
                C006802i c006802i = nts.A05;
                c006802i.markerStart(658910172);
                UserSession userSession = nts.A06;
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, userSession, 36320713061442377L);
                C55177Odh c55177Odh = nts.A08;
                PFM pfm = new PFM(5, 1L);
                if (A06) {
                    c55177Odh.A04(pfm, nts.A00);
                } else {
                    c55177Odh.A03(pfm);
                }
                c006802i.markerEnd(658910172, (short) 2);
                if (C18U.A06(c06090Tz, userSession, 36320713061835598L)) {
                    GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                    Context context2 = nts.A04;
                    if (AbstractC58318PtA.A05(context2, googleApiAvailability) == 0) {
                        long j2 = nts.A07.A01.getLong("previous_in_app_review_prompt_time", 0L);
                        if (j2 == 0 || AbstractC37300Gc1.A00(j2) >= 10368000000L) {
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext != null) {
                                context2 = applicationContext;
                            }
                            T7Q t7q = new T7Q(new SWG(context2));
                            SWG swg = t7q.A01;
                            C62927SXj c62927SXj = SWG.A02;
                            c62927SXj.A01("requestInAppReview (%s)", swg.A01);
                            final C63185Sek c63185Sek = swg.A00;
                            if (c63185Sek == null) {
                                if (android.util.Log.isLoggable("PlayCore", 6)) {
                                    android.util.Log.e("PlayCore", AnonymousClass001.A0g(c62927SXj.A00, " : ", "Play Store app is either not installed or not the official version"));
                                }
                                Locale locale = Locale.getDefault();
                                Map map = AbstractC54367O0z.A00;
                                if (!map.containsKey(-1)) {
                                    A0u = "";
                                } else {
                                    A0u = AnonymousClass001.A0u(AbstractC166987dD.A1A(-1, map), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", AbstractC166987dD.A1A(-1, AbstractC54367O0z.A01), ")");
                                }
                                Rk3 rk3 = new Rk3(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, A0u)));
                                c5ks = new C5KS();
                                c5ks.A0C(rk3);
                            } else {
                                final C58411Pup c58411Pup = new C58411Pup();
                                RP0 rp0 = new RP0(c58411Pup, c58411Pup, swg);
                                Object obj = c63185Sek.A07;
                                synchronized (obj) {
                                    c63185Sek.A0A.add(c58411Pup);
                                    c5ks = c58411Pup.A00;
                                    c5ks.A03(new YO0() { // from class: X.T6s
                                        @Override // X.YO0
                                        public final void D6a(C5KS c5ks2) {
                                            C63185Sek c63185Sek2 = c63185Sek;
                                            C58411Pup c58411Pup2 = c58411Pup;
                                            synchronized (c63185Sek2.A07) {
                                                c63185Sek2.A0A.remove(c58411Pup2);
                                            }
                                        }
                                    });
                                }
                                synchronized (obj) {
                                    if (c63185Sek.A0B.getAndIncrement() > 0) {
                                        C62927SXj c62927SXj2 = c63185Sek.A06;
                                        if (android.util.Log.isLoggable("PlayCore", 3)) {
                                            AnonymousClass001.A0g(c62927SXj2.A00, " : ", "Already connected to the service.");
                                        }
                                    }
                                }
                                c63185Sek.A01().post(new C60736ROy(((AbstractRunnableC64723TRe) rp0).A00, rp0, c63185Sek));
                            }
                            c5ks.A03(new C64270T6u(2, t7q, nts));
                        }
                    }
                }
                c55177Odh.A06(C56669PDn.A00, nts.A00);
                PCR.A02(pcr);
                i3 = 741546638;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGTERM /* 15 */:
                A053 = C0f9.A05(-896747795);
                Rb0 rb0 = (Rb0) this.A01;
                View view2 = rb0.A00;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                WebView webView = rb0.A02;
                if (webView != null) {
                    webView.setVisibility(8);
                    webView.reload();
                }
                i3 = 253613674;
                C0f9.A0C(i3, A053);
                return;
            case 16:
                A05 = C0f9.A05(-937358057);
                AbstractC25227BEk.A1B((Fragment) this.A01);
                i = 1255345172;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(-1690649893);
                C60890Ray c60890Ray = (C60890Ray) this.A01;
                AbstractC58323PtF.A1L(c60890Ray);
                FragmentActivity fragmentActivity = c60890Ray.A02;
                str = "fragmentActivity";
                if (fragmentActivity != null) {
                    if (fragmentActivity instanceof ChallengeActivity) {
                        fragmentActivity.finish();
                    }
                    i = 1337157178;
                    C0f9.A0C(i, A05);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 18:
                A052 = C0f9.A05(1039944624);
                C60890Ray c60890Ray2 = (C60890Ray) this.A01;
                if (c60890Ray2.A0A) {
                    UserSession session = c60890Ray2.getSession();
                    String str2 = c60890Ray2.A05;
                    String str3 = c60890Ray2.A08;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c60890Ray2, session), "i_dont_have_these_ids");
                    if (A0f.isSampled()) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        A0f.AAP("av_session_id", str2);
                        A0f.AAP("flow", "av_idv");
                        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "select_id_type");
                        if (str3 != null && (A0j = AbstractC166997dE.A0j(str3)) != null) {
                            j = A0j.longValue();
                        } else {
                            j = 0;
                        }
                        A0f.A9K("flow_id", Long.valueOf(j));
                        A0f.AAP("containermodule", "id_verification");
                        A0f.Cht();
                    }
                }
                FragmentActivity fragmentActivity2 = c60890Ray2.A02;
                if (fragmentActivity2 == null) {
                    str = "fragmentActivity";
                } else {
                    C140966Yy c140966Yy = new C140966Yy(fragmentActivity2, c60890Ray2.getSession());
                    AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                    Bundle bundle = c60890Ray2.A01;
                    if (bundle == null) {
                        str = "args";
                    } else {
                        c140966Yy.A0B(bundle, abstractC59962oe);
                        c140966Yy.A04();
                        i2 = 1000109876;
                        C0f9.A0C(i2, A052);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Process.SIGSTOP /* 19 */:
                str = "context";
                A05 = C0f9.A05(750136067);
                C60890Ray c60890Ray3 = (C60890Ray) this.A01;
                TF9 tf9 = c60890Ray3.A04;
                if (tf9 != null) {
                    tf9.A00(EnumC61065Ree.A02, EnumC61067Reg.A01, c60890Ray3.A07);
                    if (c60890Ray3.A0A) {
                        c60890Ray3.getSession();
                    }
                    try {
                        context = c60890Ray3.A00;
                    } catch (IOException unused) {
                        Context context3 = c60890Ray3.A00;
                        if (context3 != null) {
                            C9GR.A03(context3, c60890Ray3.getString(2131974293), AbstractC43591JPw.A00(14), 0);
                        }
                    }
                    if (context == null) {
                        C14360o3.A0F("context");
                        throw C00O.createAndThrow();
                    }
                    C12260kU.A06(c60890Ray3, new R7Y(context, c60890Ray3.getSession(), c60890Ray3.A06, c60890Ray3.A07, c60890Ray3.A05, c60890Ray3.A08).A00(), 0);
                    TF9 tf92 = c60890Ray3.A04;
                    if (tf92 != null) {
                        tf92.A00(EnumC61065Ree.A04, EnumC61067Reg.A04, c60890Ray3.A07);
                        i = 1051131174;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F("idVerificationLogger");
                throw C00O.createAndThrow();
            case 20:
                A05 = C0f9.A05(2089483187);
                Rb2 rb2 = (Rb2) this.A01;
                if (rb2.A0E) {
                    UserSession userSession2 = rb2.A08;
                    if (userSession2 != null) {
                        AbstractC25651Mw.A00(userSession2).E4s(new C36106Fwg(AbstractC62241S3m.A00(rb2.A0C), "idv", false));
                    } else {
                        IllegalStateException A142 = AbstractC166987dD.A14("Required value was null.");
                        C0f9.A0C(922020265, A05);
                        throw A142;
                    }
                }
                FragmentActivity fragmentActivity3 = rb2.A06;
                if (fragmentActivity3 != null && (fragmentActivity3 instanceof ChallengeActivity)) {
                    fragmentActivity3.finish();
                }
                i = 1148239859;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(1788695666);
                Rb2 rb22 = (Rb2) this.A01;
                rb22.A0D = true;
                Rb2.A00(rb22);
                i = 431886851;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(-256084387);
                Rb2 rb23 = (Rb2) this.A01;
                rb23.A0D = false;
                Rb2.A00(rb23);
                i = 890586935;
                C0f9.A0C(i, A05);
                return;
            default:
                A052 = C0f9.A05(-151634824);
                Rb2 rb24 = (Rb2) this.A01;
                TF9 tf93 = rb24.A0A;
                C14360o3.A0A(tf93);
                tf93.A00(EnumC61065Ree.A02, EnumC61067Reg.A02, rb24.A0B);
                if (rb24.A0E && rb24.A08 == null) {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i4 = -796344975;
                } else {
                    android.net.Uri uri = rb24.A01;
                    if (uri != null) {
                        if (uri.getPath() != null) {
                            UserSession userSession3 = rb24.A08;
                            C14360o3.A0A(userSession3);
                            android.net.Uri uri2 = rb24.A01;
                            C14360o3.A0A(uri2);
                            String path = uri2.getPath();
                            C14360o3.A0A(path);
                            new L7n(AuthenticityUploadMedium.IMAGE_PICKER, userSession3, new TH5(rb24), path, rb24.A0B).A00();
                            AbstractC10360h2 abstractC10360h2 = rb24.A07;
                            C14360o3.A0A(abstractC10360h2);
                            AbstractC63248Sg4.A02(abstractC10360h2);
                            i2 = 218135474;
                            C0f9.A0C(i2, A052);
                            return;
                        }
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i4 = 652553323;
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i4 = 1113302531;
                    }
                }
                C0f9.A0C(i4, A052);
                throw A14;
        }
    }
}
