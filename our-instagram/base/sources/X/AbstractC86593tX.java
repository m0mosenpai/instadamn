package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.debug.devoptions.feed.FeedCreationOptions;
import com.instagram.debug.devoptions.section.activityfeed.ActivityFeedOptions;
import com.instagram.debug.devoptions.section.aiagents.AiAgentsOptions;
import com.instagram.debug.devoptions.section.alternatetopicnudge.AlternateTopicNudgeOptions;
import com.instagram.debug.devoptions.section.birthdaynotes.BirthdayNotesOptions;
import com.instagram.debug.devoptions.section.burnerinstamadillo.BurnerInstamadilloOptions;
import com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions;
import com.instagram.debug.devoptions.section.creator.agents.CreatorAgentsDeveloperOptions;
import com.instagram.debug.devoptions.section.directinboxreplyreminder.DirectInboxReplyReminderOptions;
import com.instagram.debug.devoptions.section.disappearingmessages.DisappearingMessagesOptions;
import com.instagram.debug.devoptions.section.facebookpay.FacebookPayOptions;
import com.instagram.debug.devoptions.section.identitycapture.IdentityCaptureOptions;
import com.instagram.debug.devoptions.section.igdprivacy.IGDPrivacyOptions;
import com.instagram.debug.devoptions.section.igsignals.IgSignalsOptions;
import com.instagram.debug.devoptions.section.localinjection.LocalMediaInjectionOptions;
import com.instagram.debug.devoptions.section.mcf.McfOptions;
import com.instagram.debug.devoptions.section.modernarchitecture.ModernArchitectureOptions;
import com.instagram.debug.devoptions.section.msys.ArmadilloMsysOptions;
import com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions;
import com.instagram.debug.devoptions.section.notesprompts.NotesPromptsOptions;
import com.instagram.debug.devoptions.section.ohai.OhaiOptions;
import com.instagram.debug.devoptions.section.prodash.ProDashOptions;
import com.instagram.debug.devoptions.section.quickpromotion.QuickPromotionOptions;
import com.instagram.debug.devoptions.section.reactnative.ReactNativeOptions;
import com.instagram.debug.devoptions.section.realtime.RealtimeOptions;
import com.instagram.debug.devoptions.section.screentime.ScreenTimeOptions;
import com.instagram.debug.devoptions.section.search.SearchOptions;
import com.instagram.debug.devoptions.section.securityalerts.SecurityAlertsOptions;
import com.instagram.debug.devoptions.section.showreel.ShowreelOptions;
import com.instagram.debug.devoptions.section.slate.SlateOptions;
import com.instagram.debug.devoptions.section.storyorganicdebug.StoryOrganicDebugOptions;
import com.instagram.debug.devoptions.section.survey.SurveyOptions;
import com.instagram.debug.devoptions.section.takeabreak.TakeABreakOptions;
import com.instagram.debug.devoptions.section.videodebug.VideoDebugOptions;
import com.instagram.debug.devoptions.section.xdms.XDMSOptions;
import com.instagram.debug.devoptions.section.xme.XMEOptions;
import com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions;
import com.instagram.debug.devoptions.section.zone.PolicyZonePreferencesSection;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.nido.impl.NidoFeatureProviderImpl;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;
import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3tX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86593tX {
    public static Bundle A02(EnumC39652Hih enumC39652Hih, C8JW c8jw, AudioPageMetadata audioPageMetadata, String str) {
        C14360o3.A0B(audioPageMetadata, 0);
        C14360o3.A0B(str, 2);
        Bundle bundle = new Bundle();
        bundle.putParcelable(AbstractC111324zv.A00(3935), audioPageMetadata);
        bundle.putString(AbstractC111324zv.A00(347), str);
        if (c8jw != null) {
            bundle.putSerializable(AbstractC43591JPw.A00(33), c8jw);
        }
        if (enumC39652Hih != null) {
            bundle.putSerializable(AbstractC111324zv.A00(1932), enumC39652Hih);
        }
        return bundle;
    }

    public static SpannableStringBuilder A03(Context context, String str, String str2, String str3, String str4) {
        C14360o3.A0B(context, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && str.length() != 0) {
            spannableStringBuilder.append((CharSequence) str);
            if ((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0)) {
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) "   ");
            spannableStringBuilder.setSpan(AbstractC47128KsN.A00(context), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        if (str4 != null) {
            spannableStringBuilder.append((CharSequence) context.getString(2131952976, str4));
            return spannableStringBuilder;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static EIS A09(UserSession userSession) {
        Integer num;
        ArrayList A1M;
        C14360o3.A0B(userSession, 1);
        boolean A01 = OOI.A01(userSession);
        boolean A00 = OOI.A00(userSession);
        if (A01) {
            if (A00) {
                num = C05F.A0u;
            } else {
                num = C05F.A0j;
            }
        } else if (A00) {
            num = C05F.A0Y;
        } else {
            num = C05F.A01;
        }
        String A002 = AbstractC111324zv.A00(4116);
        switch (num.intValue()) {
            case 1:
                A1M = AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131956255, 2131956268, Integer.valueOf(R.drawable.instagram_users_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131956270, 2131956269, Integer.valueOf(R.drawable.instagram_circle_star_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131956256, 2131956271, Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), null));
                break;
            case 2:
                Integer valueOf = Integer.valueOf(R.drawable.instagram_users_pano_outline_24);
                A1M = AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131956255, 2131956244, valueOf, null), new HowItWorksNuxFragment$Row(2131955363, 2131956245, valueOf, null), new HowItWorksNuxFragment$Row(2131956261, 2131956246, valueOf, null));
                break;
            case 3:
                A1M = AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131956255, 2131956258, Integer.valueOf(R.drawable.instagram_users_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131956270, 2131956259, Integer.valueOf(R.drawable.instagram_circle_star_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131956256, 2131956260, Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), null));
                break;
            case 4:
                A1M = AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131956255, 2131955365, Integer.valueOf(R.drawable.instagram_users_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131955363, 2131955366, Integer.valueOf(R.drawable.instagram_circle_star_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131955364, 2131955367, Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), null));
                break;
            case 5:
                A1M = AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131956255, 2131969863, Integer.valueOf(R.drawable.instagram_users_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131969861, 2131969864, Integer.valueOf(R.drawable.instagram_circle_star_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131969862, 2131969865, Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), null));
                break;
            default:
                A1M = AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131956255, 2131969855, Integer.valueOf(R.drawable.instagram_users_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131969853, 2131969856, Integer.valueOf(R.drawable.instagram_circle_star_pano_outline_24), null), new HowItWorksNuxFragment$Row(2131969854, 2131969857, Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), null));
                break;
        }
        return FWN.A01(userSession, A002, A1M);
    }

    public static HD4 A0A(SourceModelInfoParams sourceModelInfoParams, String str, boolean z) {
        IJ2 ij2 = new IJ2(null, sourceModelInfoParams, str, null, z);
        HD4 hd4 = new HD4();
        hd4.setArguments(AbstractC40761I4p.A00(ij2));
        return hd4;
    }

    public static INH A0C(C22P c22p) {
        C14360o3.A0B(c22p, 1);
        INH inh = new INH(c22p);
        if (LD7.A01(c22p)) {
            inh.A01(C1811381p.A00);
        }
        return inh;
    }

    public static Integer A0G(UserSession userSession, boolean z) {
        Boolean bool;
        boolean z2;
        Boolean BBc = C17060sy.A01.A01(userSession).A03.BBc();
        if (BBc != null) {
            if (!BBc.booleanValue() || z) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                boolean z3 = !C23031Ai.A07(A00, "explore_topic_picker_last_shown_time_ms", 1L);
                boolean z4 = A00.A01.getBoolean("has_dismissed_explore_topic_picker", false);
                boolean z5 = false;
                if (r1.getInt("explore_topic_picker_impressions", 0) >= C18U.A01(C06090Tz.A05, userSession, 36608467280664304L)) {
                    z5 = true;
                }
                if (!z4 && ((!z5 || NidoFeatureProviderImpl.A00) && (!z3 || NidoFeatureProviderImpl.A00))) {
                    z2 = true;
                    bool = Boolean.valueOf(z2);
                }
            }
            z2 = false;
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        if (bool == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            return C05F.A00;
        }
        if (!C18U.A06(C06090Tz.A05, userSession, 36326992303438052L)) {
            return null;
        }
        return C05F.A01;
    }

    public static LinkedHashMap A0J(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        HashMap hashMap = new HashMap();
        C6AI A00 = C6AH.A00(userSession);
        hashMap.put("act_connection_state", MUZ.A00(A00.A00));
        hashMap.put("act_last_connection_ms", String.valueOf(A00.A05));
        hashMap.put("act_last_disconnection_ms", String.valueOf(A00.A06));
        HashMap hashMap2 = new HashMap();
        String mqttChannelState = RealtimeClientManager.getInstance(userSession).getMqttChannelState();
        if (mqttChannelState != null) {
            Iterator it = new C11L("(\\w*)=(\\w*)").A04(mqttChannelState).iterator();
            while (it.hasNext()) {
                C117315Sq c117315Sq = (C117315Sq) it.next();
                if (c117315Sq.A00().size() >= 3) {
                    String str2 = (String) AbstractC001800i.A0O(c117315Sq.A00(), 1);
                    Object A0O = AbstractC001800i.A0O(c117315Sq.A00(), 2);
                    if (A0O == null) {
                        A0O = "null";
                    }
                    if (str2 != null) {
                        switch (str2.hashCode()) {
                            case -1657132123:
                                if (!str2.equals("mLastDisconnectMs")) {
                                    break;
                                } else {
                                    str = "mqtt_channel_last_disconnect_ms";
                                    break;
                                }
                            case -89907162:
                                if (!str2.equals("mConnectionState")) {
                                    break;
                                } else {
                                    str = "mqtt_channel_connection_state";
                                    break;
                                }
                            case 1317967267:
                                if (!str2.equals("mDisconnectionReason")) {
                                    break;
                                } else {
                                    str = "mqtt_channel_disconnection_reason";
                                    break;
                                }
                            case 1647364455:
                                if (!str2.equals("mLastConnectionMs")) {
                                    break;
                                } else {
                                    str = "mqtt_channel_last_connection_ms";
                                    break;
                                }
                        }
                        hashMap2.put(str, A0O);
                    }
                }
            }
        }
        return AbstractC06930Yk.A04(hashMap, hashMap2);
    }

    public static void A0L(Activity activity, C22P c22p, UserSession userSession, MusicAttributionConfig musicAttributionConfig, PendingRecipient pendingRecipient, String str, String str2, List list, boolean z) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c22p, 7);
        if (list.size() < 1) {
            C0w9.A01(EnumC12410kj.A06, "ClipsPluginImpl", "Attempt to launch gallery with no prefill from platform sharing");
            return;
        }
        C915947r c915947r = MediaUploadMetadata.A0C;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = ((Medium) it.next()).A0G.A03;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        C6XJ.A02(activity, C77453dV.A00(c22p, userSession, musicAttributionConfig, pendingRecipient, str, str2, c915947r.A01(arrayList), new ArrayList(list), true, z), userSession, TransparentModalActivity.class, "clips_camera").A0A(activity, 9587);
    }

    public static void A0N(Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C47Z c47z) {
        InterfaceC58191Pqx interfaceC58191Pqx;
        C49499LuC c49499LuC;
        C14360o3.A0B(c47z, 2);
        AbstractC23021Ah.A00(userSession).A0f(System.currentTimeMillis());
        if (interfaceC60442pS != null && C18U.A06(C06090Tz.A05, userSession, 36314837546765137L)) {
            C65972yZ c65972yZ = C77453dV.A03;
            if (c65972yZ == null) {
                c65972yZ = new C65972yZ(context, fragment, userSession, interfaceC60442pS, C05F.A00);
                C77453dV.A03 = c65972yZ;
            }
            c65972yZ.A01(c47z);
            C65972yZ c65972yZ2 = C77453dV.A03;
            if (c65972yZ2 == null) {
                c65972yZ2 = new C65972yZ(context, fragment, userSession, interfaceC60442pS, C05F.A00);
                C77453dV.A03 = c65972yZ2;
            }
            c47z.A0W(c65972yZ2);
            return;
        }
        C54971OTd c54971OTd = C77453dV.A02;
        C47Z c47z2 = null;
        if (c54971OTd != null) {
            interfaceC58191Pqx = c54971OTd.A02;
        } else {
            interfaceC58191Pqx = null;
        }
        if ((interfaceC58191Pqx instanceof C49499LuC) && (c49499LuC = (C49499LuC) interfaceC58191Pqx) != null) {
            c47z2 = c49499LuC.A04;
        }
        if (!C14360o3.A0K(c47z2, c47z)) {
            C49499LuC c49499LuC2 = new C49499LuC(context, fragment, userSession, interfaceC60442pS, c47z);
            if (C18U.A06(C06090Tz.A05, userSession, 36326365238474580L)) {
                c47z.A0X(c49499LuC2);
            }
            c47z.A0W(c49499LuC2);
            C77453dV.A02 = new C54971OTd(c49499LuC2, context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen));
        }
        C54971OTd c54971OTd2 = C77453dV.A02;
        if (c54971OTd2 == null) {
            return;
        }
        C41451vu.A01.E4s(new C3KH(c54971OTd2));
    }

    public static void A0Q(Context context, C116155Nu c116155Nu, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c116155Nu, 2);
        if (userSession != null && OZB.A00(context, userSession)) {
            if (C14360o3.A0K(userSession.userId, AbstractC19750y3.A01(MSV.A00(1619)).getString(MSV.A00(1475), null))) {
                C48525LdN c48525LdN = (C48525LdN) userSession.A01(C48525LdN.class, new C50171MDy(9, context, userSession));
                HandlerC25861Nt handlerC25861Nt = c48525LdN.A00;
                if (handlerC25861Nt == null) {
                    C14360o3.A0F("handler");
                    throw C00O.createAndThrow();
                }
                handlerC25861Nt.A01(33735910, new M4O(c116155Nu, c48525LdN));
            }
        }
    }

    public static void A0R(Context context, C07270a1 c07270a1, UserSession userSession, User user) {
        user.getId();
        try {
            CookieSyncManager.createInstance(context);
            CookieManager.getInstance().removeAllCookie();
        } catch (Exception e) {
            C0K8.A0F("MainAppLogoutDelegate", "Error clearing cookies", e);
        }
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_account_switch_cookies_cleared");
        if (A00.isSampled()) {
            A00.Cht();
        }
        C91Y A002 = C91Y.A0A.A00();
        if (A002 != null) {
            A002.A04(user.getId());
        }
        JZK A003 = JZK.A0A.A00();
        if (A003 != null) {
            A003.A04(user.getId());
        }
        AbstractC31525Dt9.A02(context, null, c07270a1, user, null, true);
        C25821No A004 = C25821No.A00();
        C27819COi c27819COi = new C27819COi(A004);
        synchronized (A004.A0O) {
            A004.A01.AHX(c27819COi);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r8.A02 == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v99, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.CC9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0S(android.content.Context r15, com.instagram.common.session.UserSession r16, X.C17130t8 r17) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86593tX.A0S(android.content.Context, com.instagram.common.session.UserSession, X.0t8):void");
    }

    public static void A0T(Context context, FoaUserSession foaUserSession, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(foaUserSession, 1);
        C14360o3.A0B(str, 2);
        new C63397SjR(context, AbstractC28057CYl.A00(foaUserSession), C2Fb.A1W, str, false).A0A();
    }

    public static void A0U(Fragment fragment, FragmentActivity fragmentActivity, C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num) {
        C37855Gl9 c37855Gl9 = C37855Gl9.A00;
        C14360o3.A0B(c22p, 7);
        c37855Gl9.A0I(fragment, fragmentActivity, c22p, interfaceC11380iw, userSession, c38321qM, num, null);
    }

    public static void A0X(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(clipsViewerConfig, 2);
        C77453dV.A07(fragmentActivity, clipsViewerConfig, userSession, false, false);
    }

    public static void A0Y(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(clipsViewerConfig, 2);
        C77453dV.A07(fragmentActivity, clipsViewerConfig, userSession, true, false);
    }

    public static void A0Z(FragmentActivity fragmentActivity, UserSession userSession) {
        if (C35226FgJ.A02(fragmentActivity)) {
            new C140966Yy(fragmentActivity, userSession).A0G(SupportLinksFragment.A06, 1);
        } else {
            C35226FgJ.A00(fragmentActivity);
        }
    }

    public static void A0c(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        C38321qM A02 = C1DW.A00(userSession).A02(str);
        if (A02 != null && !A02.CFR().A07()) {
            C1ON A04 = AbstractC37797GkC.A04(userSession, A02.A38(), null, null);
            A04.A00 = new C39013HFp(fragmentActivity, userSession, str);
            C1GJ.A06(A04, 1368380687, 2, true, false);
            return;
        }
        AbstractC40916IAo.A00(fragmentActivity, userSession, str);
    }

    public static void A0d(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        SecurityAlertRepository.A04.A00(userSession).A01(str);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        AbstractC47885LDf.A00();
        c140966Yy.A0D(new EJ3());
        c140966Yy.A08();
        c140966Yy.A04();
    }

    public static boolean A0k(int i) {
        if (i == 13326 || i == 13327 || i == 13616 || i == 13617 || i == 13635 || i == 13636 || i == 15727 || i == 15728 || i == 16877 || i == 16878) {
            return true;
        }
        switch (i) {
            case 13317:
            case 13320:
            case 13323:
            case 13329:
            case 13399:
            case 13408:
            case 13533:
            case 13546:
            case 13648:
            case 13666:
            case 13697:
            case 13708:
            case 13745:
            case 13775:
            case 13780:
            case 13797:
            case 13894:
            case 13907:
            case 13922:
            case 13944:
            case 13955:
            case 13982:
            case 14041:
            case 14045:
            case 14054:
            case 14093:
            case 15753:
            case 15768:
            case 15770:
            case 15778:
            case 15856:
            case 15892:
            case 15894:
            case 15969:
            case 15981:
            case 16053:
            case 16068:
            case 16079:
            case 16095:
            case 16111:
            case 16122:
            case 16160:
            case 16166:
            case 16218:
            case 16260:
            case 16278:
            case 16355:
            case 16383:
            case 16390:
            case 16411:
            case 16444:
            case 16451:
            case 16467:
            case 16584:
            case 16586:
            case 16641:
            case 16675:
            case 16682:
            case 16688:
            case 16801:
            case 16910:
            case 16919:
            case 16927:
            case 16995:
            case 17025:
            case 17088:
            case 17096:
            case 17106:
            case 17134:
                return true;
            default:
                switch (i) {
                    case 13334:
                    case 13335:
                    case 13336:
                        return true;
                    default:
                        switch (i) {
                            case 13375:
                            case 13376:
                            case 13377:
                            case 13378:
                            case 13379:
                            case 13380:
                                return true;
                            default:
                                switch (i) {
                                    case 13387:
                                    case 13388:
                                    case 13389:
                                    case 13390:
                                    case 13391:
                                    case 13392:
                                    case 13393:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 16534:
                                            case 16535:
                                            case 16536:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }

    public static boolean A0l(int i) {
        switch (i) {
            case 13313:
            case 13337:
            case 13383:
            case 13394:
            case 13538:
            case 13565:
            case 13566:
            case 13615:
            case 13627:
            case 13638:
            case 13656:
            case 13688:
            case 13712:
            case 13713:
            case 13748:
            case 13762:
            case 13768:
            case 13774:
            case 13914:
            case 13981:
            case 14001:
            case 15833:
            case 15909:
            case 16123:
            case 16310:
            case 16375:
            case 16409:
            case 16485:
            case 16493:
            case 16515:
            case 16529:
            case 16792:
            case 16807:
            case 16906:
            case 16913:
            case 16932:
            case 16952:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0m(int i) {
        return i == 13326 || i == 13336 || i == 16927;
    }

    public static boolean A0n(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public static boolean A0o(Context context, Intent intent) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        Intent intent2 = new Intent(context, (Class<?>) MediaCaptureActivity.class);
        if (intent2.getComponent() != null) {
            return C14360o3.A0K(intent2.getComponent(), intent.getComponent());
        }
        return false;
    }

    public static boolean A0q(UserSession userSession, C38321qM c38321qM) {
        MediaGenAIDetectionMethod A1J;
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A05, userSession, 36324411028025500L)) {
            return false;
        }
        if (c38321qM != null && (A1J = c38321qM.A1J()) != null && A1J != MediaGenAIDetectionMethod.A0B && A1J != MediaGenAIDetectionMethod.A0C) {
            return false;
        }
        return true;
    }

    public static boolean A0r(C105914q2 c105914q2, Integer num, String str, String str2) {
        C14360o3.A0B(str2, 1);
        String A03 = C20150ym.A03(AbstractC20070ye.A00(18861898636722274L));
        C14360o3.A0B(A03, 1);
        return AbstractC105924q3.A00(c105914q2, num, A03, str2, str, false);
    }

    public static boolean A0s(FoaUserSession foaUserSession) {
        C14360o3.A0B(foaUserSession, 0);
        if (!C28481ChZ.A04(foaUserSession)) {
            if (AbstractC54472f1.A04(18312632448923910L, true) || AbstractC54472f1.A04(18312632448989447L, true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int A01(Context context, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        C7IF c7if = C7IF.A00;
        int[] iArr = {context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_purple)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_blue))};
        int[] A00 = c7if.A00(context, directThreadThemeInfo, z);
        int length = A00.length;
        if (length != 0) {
            if (length != 1) {
                return AbstractC13950nL.A02(0.5f, A00[0], A00[1]);
            }
            return A00[0];
        }
        return AbstractC13950nL.A02(0.5f, iArr[0], iArr[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC65469Tkm A04(X.C102884kP r16, int r17) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86593tX.A04(X.4kP, int):X.Tkm");
    }

    public static W5s A05(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean A0E = C1LE.A0E(userSession);
        C06090Tz c06090Tz = C06090Tz.A06;
        int A00 = (int) C18U.A00(c06090Tz, userSession, 37160443592310897L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36316018662313854L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 2342159027876138880L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 2342159027876073343L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 36330329492964156L);
        String string = AbstractC23021Ah.A00(userSession).A01.getString(MSV.A00(407), "");
        C14360o3.A07(string);
        boolean A065 = C1RQ.A00().A06(EnumC27091Ti.A0H);
        C06090Tz c06090Tz2 = C06090Tz.A05;
        boolean A066 = C18U.A06(c06090Tz2, userSession, 36316168985841687L);
        boolean A067 = C18U.A06(c06090Tz2, userSession, 36319342966611136L);
        boolean A068 = C18U.A06(c06090Tz2, userSession, 36316168986038298L);
        boolean A069 = C18U.A06(c06090Tz2, userSession, 36316168986234909L);
        boolean A0610 = C18U.A06(c06090Tz2, userSession, 36316168988266549L);
        boolean A0611 = C18U.A06(c06090Tz2, userSession, 36316168988397623L);
        boolean A0612 = C18U.A06(c06090Tz2, userSession, 36316168988332086L);
        boolean A0613 = C18U.A06(c06090Tz2, userSession, 36316168988463160L);
        boolean A0614 = C18U.A06(c06090Tz2, userSession, 36316168986365983L);
        boolean A0615 = C18U.A06(c06090Tz2, userSession, 36316168986693667L);
        boolean A0616 = C18U.A06(c06090Tz2, userSession, 36316168990822486L);
        boolean A0617 = C18U.A06(c06090Tz2, userSession, 36316168990888023L);
        boolean A0618 = C18U.A06(c06090Tz2, userSession, 36316168990756949L);
        boolean A0619 = C18U.A06(c06090Tz2, userSession, 36316168990363727L);
        String A04 = C18U.A04(c06090Tz2, userSession, 36879118940045550L);
        boolean A0620 = C18U.A06(c06090Tz2, userSession, 36316168986824740L);
        boolean A0621 = C18U.A06(c06090Tz2, userSession, 36316168987021351L);
        boolean A0622 = C18U.A06(c06090Tz2, userSession, 36316168990625875L);
        boolean A0623 = C18U.A06(c06090Tz2, userSession, 36316654317408856L);
        boolean A0624 = C18U.A06(c06090Tz2, userSession, 36316654317867613L);
        boolean A0625 = C18U.A06(c06090Tz2, userSession, 36316654317802076L);
        int A01 = (int) C18U.A01(c06090Tz2, userSession, 36598129294445686L);
        int A012 = (int) C18U.A01(c06090Tz2, userSession, 36598129294642295L);
        boolean A0626 = C18U.A06(c06090Tz2, userSession, 36316654317998686L);
        int A013 = (int) C18U.A01(c06090Tz2, userSession, 36598129294773368L);
        int A014 = (int) C18U.A01(c06090Tz2, userSession, 36598129294838905L);
        boolean A0627 = C18U.A06(c06090Tz2, userSession, 36316168987283499L);
        boolean A0628 = C18U.A06(c06090Tz2, userSession, 36316168987545646L);
        boolean A0629 = C18U.A06(c06090Tz2, userSession, 36316168989904968L);
        boolean A0630 = C18U.A06(c06090Tz2, userSession, 36316168989970505L);
        boolean A0631 = C18U.A06(c06090Tz2, userSession, 36316168987676720L);
        boolean A0632 = C18U.A06(c06090Tz2, userSession, 36316168988790843L);
        long A015 = C18U.A01(c06090Tz2, userSession, 36597643965434738L);
        boolean A0633 = C18U.A06(c06090Tz2, userSession, 36316168988069940L);
        long A016 = C18U.A01(c06090Tz2, userSession, 36597643964844912L);
        long A017 = C18U.A01(c06090Tz2, userSession, 36597643964910449L);
        boolean A0634 = C18U.A06(c06090Tz2, userSession, 36316168987938866L);
        boolean A0635 = C18U.A06(c06090Tz2, userSession, 36316168989446209L);
        boolean z6 = false;
        if (C18U.A06(c06090Tz, userSession, 36320000096608143L)) {
            z6 = true;
        }
        boolean A0636 = C18U.A06(c06090Tz2, userSession, 36316168989773894L);
        boolean A0637 = C18U.A06(c06090Tz2, userSession, 36316168989708357L);
        boolean A0638 = C18U.A06(c06090Tz2, userSession, 36316168989511746L);
        boolean A0639 = C18U.A06(c06090Tz2, userSession, 36316168990298190L);
        boolean A0640 = C18U.A06(c06090Tz2, userSession, 36316168990560338L);
        boolean A0641 = C18U.A06(c06090Tz2, userSession, 36316168990494801L);
        return new W5s(string, A04, A00, 1000, A01, A012, A013, A014, A015, A016, A017, C18U.A01(c06090Tz2, userSession, 36598129294904442L), A0635, z, z2, z3, A0E, A062, A06, A063, A064, A065, C18U.A06(c06090Tz, userSession, 36321838342612836L), true, A067, true, A066, A068, A069, A0610, A0612, A0611, A0613, true, true, true, A0614, A0628, A0629, A0630, A0615, A0616, A0618, A0617, A0619, A0621, A0622, A0623, A0624, A0625, A0626, A0620, true, A0640, A0627, A0631, true, A0632, A0633, A0634, false, true, !z4, true, z6, true, A0641, A0636, A0637, A0638, true, A0639, C18U.A06(c06090Tz2, userSession, 36327297246181860L), C18U.A06(c06090Tz2, userSession, 36316654318260831L), C18U.A06(c06090Tz2, userSession, 36329891406365245L), z5);
    }

    public static C7IM A06(Context context, AnonymousClass988 anonymousClass988) {
        return C7ID.A00.A00(context, null, null, anonymousClass988, AbstractC125795mU.A00(), C05F.A00);
    }

    public static C7IM A07(Context context, AnonymousClass988 anonymousClass988, boolean z) {
        Integer num;
        C7ID c7id = C7ID.A00;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(anonymousClass988, 2);
        if (z) {
            num = C05F.A0N;
        } else {
            num = C05F.A00;
        }
        return c7id.A00(context, null, null, anonymousClass988, AbstractC125795mU.A00(), num);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.Dk2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, X.Dk2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, X.DhN] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, X.DhN] */
    public static CWA A0B(String str) {
        if (!str.equals(AbstractC111324zv.A00(3640))) {
            if (str.equals("NOOP")) {
                return new CWA(new C28274CdJ("", "", "", "", "", "", ""), new Object(), new Object(), "", false, false);
            }
            throw new IllegalArgumentException(String.format("No implementation bound to key: %s", str));
        }
        return new CWA(new C28274CdJ("https://transparency.meta.com/policies/other-policies/meta-AI-disclosures", AbstractC111324zv.A00(2466), AbstractC111324zv.A00(2468), "https://www.facebook.com/privacy/center", MSV.A00(98), AbstractC111324zv.A00(438), AbstractC111324zv.A00(218)), new Object(), new Object(), "Instagram", true, true);
    }

    public static C52778NXk A0D() {
        EnumC53140Net enumC53140Net = EnumC53140Net.A03;
        C52778NXk c52778NXk = new C52778NXk();
        Bundle bundle = new Bundle();
        bundle.putSerializable(MSV.A00(360), enumC53140Net);
        c52778NXk.setArguments(bundle);
        return c52778NXk;
    }

    public static C52778NXk A0E() {
        EnumC53140Net enumC53140Net = EnumC53140Net.A02;
        C52778NXk c52778NXk = new C52778NXk();
        Bundle bundle = new Bundle();
        bundle.putSerializable(MSV.A00(360), enumC53140Net);
        c52778NXk.setArguments(bundle);
        return c52778NXk;
    }

    public static void A0M(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 36312007162463098L)) {
            C6PP.A01(context, C6PP.A00(context), spannableStringBuilder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0O(android.content.Context r16, X.WTT r17, X.AnonymousClass637 r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86593tX.A0O(android.content.Context, X.WTT, X.637, int, boolean):void");
    }

    public static void A0P(Context context, EnumC124565kK enumC124565kK, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C8EZ c8ez, String str, String str2) {
        C124575kL c124575kL = C124575kL.A00;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c8ez, 3);
        c124575kL.A03(enumC124565kK, mediaGenAIDetectionMethod, userSession, null, str, "ig_open_gen_ai_self_disclosure_bottom_sheet", str2);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0d = context.getString(2131964734);
        c189448aO.A0a = false;
        C189478aR A00 = c189448aO.A00();
        Bundle bundle = new Bundle();
        bundle.putString(MSV.A00(179), str);
        if (mediaGenAIDetectionMethod != null) {
            bundle.putString(MSV.A00(954), mediaGenAIDetectionMethod.toString());
        }
        bundle.putString(MSV.A00(952), enumC124565kK.toString());
        if (str2 != null) {
            bundle.putString(MSV.A00(957), str2);
        }
        C52112N4k c52112N4k = new C52112N4k();
        c52112N4k.A01 = c8ez;
        c52112N4k.setArguments(bundle);
        A00.A03(context, c52112N4k);
    }

    public static void A0V(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, String str, String str2, String str3, List list, boolean z) {
        C6XJ A02;
        Integer num;
        List list2 = list;
        if (list2.isEmpty()) {
            C0w9.A01(EnumC12410kj.A06, "ClipsPluginImpl", "Attempt to launch gallery with no prefill from platform sharing");
            return;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320734536409959L)) {
            if (str2 != null) {
                num = AbstractC003100w.A0j(str2, 10);
            } else {
                num = null;
            }
            List list3 = C16930sl.A00;
            if (num != null) {
                C17u A1S = AbstractC16960so.A1S(list2);
                int intValue = num.intValue();
                if (A1S.A01(intValue)) {
                    List subList = list2.subList(0, intValue);
                    list3 = list2.subList(intValue, list2.size());
                    list2 = subList;
                }
            }
            if (!z) {
                INH A0C = A0C(c22p);
                A0C.A0h = list2;
                A0C.A0i = list3;
                A0C.A0Y = str3;
                A02 = C6XJ.A02(fragmentActivity, A0C.A00(), userSession, ModalActivity.class, AbstractC111324zv.A00(188));
                A02.A07();
                A02.A0C(fragmentActivity);
            }
        } else if (list2.size() == 1 && C18U.A06(c06090Tz, userSession, 36323891336982188L)) {
            AnonymousClass229.A01(userSession).A0J.A08("deep_link_from_external_app");
            C19K A022 = AnonymousClass194.A02(C12L.A00.CPG(962517606, 3));
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCR(userSession, list2, fragmentActivity, c22p, (Object) null, (InterfaceC23621Ds) null, 27), A022);
            return;
        }
        A02 = C6XJ.A02(fragmentActivity, C77453dV.A00(c22p, userSession, null, null, null, null, str, list2, false, false), userSession, TransparentModalActivity.class, "clips_camera");
        A02.A0C(fragmentActivity);
    }

    public static void A0W(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, boolean z) {
        C35226FgJ c35226FgJ = C35226FgJ.A00;
        if (C35226FgJ.A02(fragmentActivity)) {
            new C140966Yy(fragmentActivity, userSession).A0G(SupportLinksFragment.A06, 1);
            int i = 2131964966;
            if (z) {
                i = 2131964995;
            }
            String string = fragmentActivity.getString(i);
            C14360o3.A07(string);
            C9GR.A09(fragmentActivity, string);
            return;
        }
        c35226FgJ.A03(fragmentActivity, xIGIGBoostCallToAction, userSession);
    }

    public static void A0a(FragmentActivity fragmentActivity, UserSession userSession, EnumC53251Ngp enumC53251Ngp) {
        C35226FgJ c35226FgJ = C35226FgJ.A00;
        C14360o3.A0B(enumC53251Ngp, 0);
        if (enumC53251Ngp == EnumC53251Ngp.A06) {
            User A01 = C17060sy.A01.A01(userSession);
            if (A01.A03.Bxx() == null) {
                ActionButtonPartnerType actionButtonPartnerType = ActionButtonPartnerType.A06;
                String A00 = AbstractC111324zv.A00(1639);
                A01.A03.EeW(new C111184zg(new C111184zg(actionButtonPartnerType, "0", null, null, null, null, A00, "").A00, "0", null, null, SMBPartnerType.A07.toString(), null, A00, ""));
                AnonymousClass189.A00(userSession).A03(A01);
            }
            fragmentActivity.finish();
            return;
        }
        c35226FgJ.A03(fragmentActivity, XIGIGBoostCallToAction.A0L, userSession);
    }

    public static void A0b(FragmentActivity fragmentActivity, UserSession userSession, Integer num) {
        C34987FbJ.A00.A00(fragmentActivity, userSession, num);
    }

    public static void A0e(EnumC124565kK enumC124565kK, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, Boolean bool, String str, String str2, String str3) {
        C124575kL.A00.A03(enumC124565kK, mediaGenAIDetectionMethod, userSession, bool, str, str2, str3);
    }

    public static void A0f(C9BS c9bs, C3W4 c3w4, C75113Zb c75113Zb) {
        C86603tY c86603tY = C86603tY.A00;
        C14360o3.A0B(c9bs, 1);
        if (!c9bs.A02 && !c9bs.A01) {
            c3w4.A01().A01();
            c75113Zb.A0S(c3w4.A01());
        } else {
            c86603tY.A00(c9bs, c3w4, c75113Zb);
        }
    }

    public static void A0g(InterfaceC43435JGz interfaceC43435JGz, int i) {
        AbstractC41751IeQ.A04(new J71(interfaceC43435JGz), new J73(interfaceC43435JGz), i);
    }

    public static void A0h(UserSession userSession, Context context, FragmentActivity fragmentActivity) {
        C37855Gl9 c37855Gl9 = C37855Gl9.A00;
        C14360o3.A0B(userSession, 0);
        if (c37855Gl9.A0K(userSession)) {
            if (C37855Gl9.A0A(userSession)) {
                C37855Gl9.A03(context, fragmentActivity, userSession);
                return;
            }
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0a = false;
            c189448aO.A0g = context.getString(2131968948);
            c189448aO.A0v = true;
            c189448aO.A0h = context.getString(2131972159);
            c189448aO.A0L = new ViewOnClickListenerC41954Iil(userSession, context, fragmentActivity);
            c189448aO.A1N = true;
            String string = context.getString(2131961983);
            C14360o3.A07(string);
            C33259Elt c33259Elt = new C33259Elt(context, userSession, string, context.getColor(AbstractC53242c7.A06(context)));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            AnonymousClass773.A02(spannableStringBuilder, c33259Elt, string);
            c189448aO.A0b = spannableStringBuilder;
            C189478aR A00 = c189448aO.A00();
            C57312k6 A002 = C07Y.A00(fragmentActivity);
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57159PZd(context, A00, abstractC59962oe, null, 18), A002);
        }
    }

    public static void A0i(JSONObject jSONObject) {
        C23324AVj c23324AVj = CAE.A00;
        if (c23324AVj != null) {
            c23324AVj.A08.A06.A00(jSONObject);
        }
    }

    public static boolean A0j() {
        Boolean bool;
        try {
            bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, C023409i.A0A.A08(C28137Cak.A00), 36327481929906792L));
        } catch (IllegalStateException unused) {
            bool = false;
        }
        C14360o3.A0A(bool);
        if (!bool.booleanValue() && !C1AD.A06(C06090Tz.A05, 18311026131285057L)) {
            return false;
        }
        return true;
    }

    public static int[] A0t() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
    }

    public static int A00(int i) {
        switch (i) {
            case 0:
                return FeedCreationOptions.INSTANCE.getTitleRes();
            case 1:
                return ActivityFeedOptions.INSTANCE.getTitleRes();
            case 2:
                return AiAgentsOptions.INSTANCE.getTitleRes();
            case 3:
                return AlternateTopicNudgeOptions.INSTANCE.getTitleRes();
            case 4:
                return BirthdayNotesOptions.INSTANCE.getTitleRes();
            case 5:
                return BurnerInstamadilloOptions.INSTANCE.getTitleRes();
            case 6:
                return CreationGenAIOptions.INSTANCE.getTitleRes();
            case 7:
                return CreatorAgentsDeveloperOptions.INSTANCE.getTitleRes();
            case 8:
                return DirectInboxReplyReminderOptions.INSTANCE.getTitleRes();
            case 9:
                return DisappearingMessagesOptions.INSTANCE.getTitleRes();
            case 10:
                return FacebookPayOptions.INSTANCE.getTitleRes();
            case 11:
                return IdentityCaptureOptions.INSTANCE.getTitleRes();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return IGDPrivacyOptions.INSTANCE.getTitleRes();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return IgSignalsOptions.INSTANCE.getTitleRes();
            case 14:
                return LocalMediaInjectionOptions.INSTANCE.getTitleRes();
            case Process.SIGTERM /* 15 */:
                return McfOptions.INSTANCE.getTitleRes();
            case 16:
                return ModernArchitectureOptions.INSTANCE.getTitleRes();
            case 17:
                return ArmadilloMsysOptions.INSTANCE.getTitleRes();
            case 18:
                return NewUserNuxOptions.INSTANCE.getTitleRes();
            case Process.SIGSTOP /* 19 */:
                return NotesPromptsOptions.INSTANCE.getTitleRes();
            case 20:
                return OhaiOptions.INSTANCE.getTitleRes();
            case 21:
                return ProDashOptions.INSTANCE.getTitleRes();
            case 22:
                return QuickPromotionOptions.INSTANCE.getTitleRes();
            case 23:
                return ReactNativeOptions.INSTANCE.getTitleRes();
            case 24:
                return RealtimeOptions.INSTANCE.getTitleRes();
            case 25:
                return ScreenTimeOptions.INSTANCE.getTitleRes();
            case 26:
                return SearchOptions.INSTANCE.getTitleRes();
            case 27:
                return SecurityAlertsOptions.INSTANCE.getTitleRes();
            case 28:
                return ShowreelOptions.INSTANCE.getTitleRes();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return SlateOptions.INSTANCE.getTitleRes();
            case 30:
                return StoryOrganicDebugOptions.INSTANCE.getTitleRes();
            case 31:
                return SurveyOptions.INSTANCE.getTitleRes();
            case 32:
                return TakeABreakOptions.INSTANCE.getTitleRes();
            case 33:
                return VideoDebugOptions.INSTANCE.getTitleRes();
            case 34:
                return XDMSOptions.INSTANCE.getTitleRes();
            case 35:
                return XMEOptions.INSTANCE.getTitleRes();
            case 36:
                return ZeroRatingOptions.INSTANCE.getTitleRes();
            case 37:
                return PolicyZonePreferencesSection.INSTANCE.getTitleRes();
            case 38:
                return C48644LfQ.A00.getTitleRes();
            case 39:
                return C48645LfR.A00.getTitleRes();
            case 40:
                return G1I.A00.getTitleRes();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static C38321qM A08(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C5R5 A01 = C77453dV.A01(AbstractC116865Qp.A00(interfaceC11380iw), userSession, interfaceC11380iw.getModuleName());
        if (A01 instanceof C5R4) {
            return ((C5R4) A01).B6c(userSession);
        }
        return null;
    }

    public static CharSequence A0F(Context context, UserSession userSession, int i) {
        String string = context.getString(i);
        C14360o3.A07(string);
        if (C18U.A06(C06090Tz.A05, userSession, 36312007162463098L)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            C6PP.A01(context, C6PP.A00(context), spannableStringBuilder);
            return spannableStringBuilder;
        }
        return string;
    }

    public static ArrayList A0I(UserSession userSession, Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() / 1000;
        ArrayList A00 = AbstractC41670Ic2.A00(userSession, num);
        ArrayList arrayList = new ArrayList();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).longValue() >= timeInMillis) {
                arrayList.add(next);
            }
        }
        return new ArrayList(arrayList);
    }

    public static List A0K(int i, UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        switch (i) {
            case 0:
                return FeedCreationOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 1:
                return ActivityFeedOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 2:
                return AiAgentsOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 3:
                return AlternateTopicNudgeOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 4:
                return BirthdayNotesOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 5:
                return BurnerInstamadilloOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 6:
                return CreationGenAIOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 7:
                return CreatorAgentsDeveloperOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 8:
                return DirectInboxReplyReminderOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 9:
                return DisappearingMessagesOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 10:
                return FacebookPayOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 11:
                return IdentityCaptureOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return IGDPrivacyOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return IgSignalsOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 14:
                return LocalMediaInjectionOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case Process.SIGTERM /* 15 */:
                return McfOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 16:
                return ModernArchitectureOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 17:
                return ArmadilloMsysOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 18:
                return NewUserNuxOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case Process.SIGSTOP /* 19 */:
                return NotesPromptsOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 20:
                return OhaiOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 21:
                return ProDashOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 22:
                return QuickPromotionOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 23:
                return ReactNativeOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 24:
                return RealtimeOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 25:
                return ScreenTimeOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 26:
                return SearchOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 27:
                return SecurityAlertsOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 28:
                return ShowreelOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return SlateOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 30:
                return StoryOrganicDebugOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 31:
                return SurveyOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 32:
                return TakeABreakOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 33:
                return VideoDebugOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 34:
                return XDMSOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 35:
                return XMEOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 36:
                return ZeroRatingOptions.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 37:
                return PolicyZonePreferencesSection.INSTANCE.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 38:
                return C48644LfQ.A00.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 39:
                return C48645LfR.A00.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            case 40:
                return G1I.A00.getItems(userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static boolean A0p(UserSession userSession, C38321qM c38321qM) {
        if (C55220Oej.A06(userSession, c38321qM) && C2TN.A02(userSession, c38321qM) && C55220Oej.A08(C17060sy.A01.A01(userSession)) && c38321qM.A1x() == EnumC76383bi.A06 && AbstractC54310NzU.A00(userSession).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x1537, code lost:
    
        if (r27.equals(r0) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2207:0x26be, code lost:
    
        if (r0.requestFocus() != false) goto L2090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2509:0x2b2d, code lost:
    
        if (r26.A00.get(0) == null) goto L3701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3122:0x36e8, code lost:
    
        if (r0 == false) goto L4329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3895:0x4461, code lost:
    
        if (X.C35160Ff2.A02.A00().A01() == X.C05F.A0C) goto L3701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x23ce, code lost:
    
        if (r0 != false) goto L3701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0792, code lost:
    
        if (X.AbstractC70200WGp.A06(X.C6BQ.A09(r25)) != null) goto L3701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:977:0x1139, code lost:
    
        if (r5 == (-1)) goto L911;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x2642  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1376:0x235b  */
    /* JADX WARN: Removed duplicated region for block: B:1530:0x533c  */
    /* JADX WARN: Removed duplicated region for block: B:1703:0x5adf  */
    /* JADX WARN: Removed duplicated region for block: B:1705:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2051:0x57e3  */
    /* JADX WARN: Removed duplicated region for block: B:2270:0x3ccc  */
    /* JADX WARN: Removed duplicated region for block: B:2287:0x474c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x22b2  */
    /* JADX WARN: Removed duplicated region for block: B:2858:0x355a  */
    /* JADX WARN: Removed duplicated region for block: B:3126:0x4932  */
    /* JADX WARN: Removed duplicated region for block: B:3991:0x4718  */
    /* JADX WARN: Removed duplicated region for block: B:4458:0x4e31  */
    /* JADX WARN: Removed duplicated region for block: B:4814:0x54c4  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x3e2e  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x23a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x243f  */
    /* JADX WARN: Type inference failed for: r0v1005, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v1160, types: [X.JiS, android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r0v1253, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v146, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v278, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v314, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v441, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v680, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v718, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v930, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v939, types: [java.lang.Object, X.1vN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A0H(final X.C6FQ r25, X.C6FW r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 28132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86593tX.A0H(X.6FQ, X.6FW, java.lang.String):java.lang.Object");
    }
}
