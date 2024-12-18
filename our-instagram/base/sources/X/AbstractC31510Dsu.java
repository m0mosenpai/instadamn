package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import com.instagram.util.share.ShareUtil$ChosenComponentReceiver;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.Dsu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31510Dsu {
    public static void A02(Activity activity, Bundle bundle, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, User user, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        HashMap A0o = AbstractC31180DnO.A0o(str3);
        A0o.put(TraceFieldType.BroadcastId, str4);
        A0o.put("reel_id", str4);
        A0Y(user, "item_id", str4, A0o);
        A0o.put("share_surface", str5);
        A0N(activity, null, bundle, interfaceC11380iw, abstractC12990ll, str, str2, A0o, z, z2);
    }

    public static void A03(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, InterfaceC60442pS interfaceC60442pS, User user, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        HashMap A0o = AbstractC31180DnO.A0o(str3);
        A0o.put("reel_id", str4);
        A0Y(user, "item_id", str5, A0o);
        A0o.put("share_surface", str6);
        A0N(activity, null, bundle, interfaceC60442pS, abstractC12990ll, str, str2, A0o, z, z2);
    }

    public static void A06(Activity activity, View view, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33425Epw enumC33425Epw, Runnable runnable, String str) {
        C33121EjQ c33121EjQ = new C33121EjQ(abstractC10360h2, activity, view, interfaceC11380iw, userSession, enumC33425Epw, runnable, str, 1);
        C1ON A00 = AbstractC34303FAx.A00(EnumC33510Erj.SCHOOLS_INVITE_CLASSMATE, userSession, enumC33425Epw.A01);
        A00.A00 = c33121EjQ;
        C1GJ.A00(activity, abstractC018607g, A00);
    }

    public static void A0K(final Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, final UserSession userSession, final InterfaceC60442pS interfaceC60442pS, final String str, String str2, final String str3, final String str4, String str5, final String str6) {
        final boolean booleanValue = AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36314837549779812L).booleanValue();
        Integer num = C05F.A0Y;
        A0D(activity, abstractC10360h2, abstractC018607g, new C2n2() { // from class: X.Fsr
            @Override // X.C2n2
            public final Object apply(Object obj) {
                Activity activity2 = activity;
                final UserSession userSession2 = userSession;
                final InterfaceC60442pS interfaceC60442pS2 = interfaceC60442pS;
                final String str7 = str;
                String str8 = str3;
                String str9 = str4;
                final boolean z = booleanValue;
                final String str10 = str6;
                final String str11 = (String) obj;
                if (str11 != null) {
                    String string = activity2.getResources().getString(2131971185);
                    Locale locale = Locale.ROOT;
                    new LLI(activity2, interfaceC60442pS2, userSession2, new MPL() { // from class: X.GHs
                        @Override // X.MPL
                        public final void Di0() {
                            boolean z2 = z;
                            UserSession userSession3 = userSession2;
                            InterfaceC60442pS interfaceC60442pS3 = interfaceC60442pS2;
                            String str12 = str7;
                            String str13 = str10;
                            String str14 = str11;
                            if (z2) {
                                AbstractC73317Y7a.A0J(interfaceC60442pS3, userSession3, str12, str13, "download_qr_code", str14);
                            }
                        }
                    }, str11, str7, string, str8.toUpperCase(locale), str9.toUpperCase(locale), false).A05();
                    return null;
                }
                return null;
            }
        }, userSession, interfaceC60442pS, AbstractC31172DnG.A0s(booleanValue), num, null, str, str2, str5, str6, "system_share_sheet", null, true);
    }

    public static void A0M(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33425Epw enumC33425Epw, String str) {
        String str2 = enumC33425Epw.A04;
        String str3 = enumC33425Epw.A03;
        boolean z = enumC33425Epw.A06;
        boolean z2 = enumC33425Epw.A07;
        if (str3 == null) {
            str3 = "";
        }
        A0N(activity, null, AbstractC31180DnO.A03(str), interfaceC11380iw, userSession, str2, str3, AbstractC31180DnO.A0o(str), z2, z);
    }

    public static void A0O(Context context, android.net.Uri uri, Bundle bundle, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Long l, String str, String str2, String str3) {
        HashMap A0o = AbstractC31180DnO.A0o(str);
        AbstractC31181DnP.A0w(userSession, c38321qM, str2, A0o);
        if (l != null && str3 != null) {
            A0o.put("carousel_index", l.toString());
            A0o.put("carousel_media_id", str3);
        }
        A0N(context, uri, bundle, interfaceC11380iw, userSession, null, "share_to_system_sheet", A0o, true, false);
    }

    public static void A0Q(Context context, Bundle bundle, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, HashMap hashMap) {
        A0N(context, null, bundle, interfaceC11380iw, abstractC12990ll, null, str, hashMap, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0T(Fragment fragment, EnumC33510Erj enumC33510Erj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33425Epw enumC33425Epw, Runnable runnable) {
        C33117EjL c33117EjL = new C33117EjL(fragment, fragment.mFragmentManager, enumC33510Erj, interfaceC11380iw, userSession, runnable);
        C1ON A00 = AbstractC34303FAx.A00(enumC33510Erj, userSession, enumC33425Epw.A01);
        A00.A00 = c33117EjL;
        ((C1GL) fragment).schedule(A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0U(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Runnable runnable, String str) {
        C33118EjM c33118EjM = new C33118EjM(fragment, fragment.mFragmentManager, interfaceC11380iw, userSession, user, runnable, str);
        if (userSession != null) {
            C1ON A00 = FB1.A00(userSession, C05F.A0Y, user.getUsername(), interfaceC11380iw.getModuleName());
            if (A00 != null) {
                A00.A00 = c33118EjM;
                ((C1GL) fragment).schedule(A00);
                return;
            }
        }
        AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, user.getId(), str, "system_share_sheet", AbstractC31178DnM.A0g(user));
        A0S(AbstractC166987dD.A0b(), fragment, interfaceC11380iw, userSession, user, runnable, AbstractC31178DnM.A0e(user), str);
    }

    public static void A0V(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, String str) {
        if (fragment.isVisible()) {
            FragmentActivity activity = fragment.getActivity();
            activity.getClass();
            A0P(activity, null, fragment, userSession, c38321qM, interfaceC60442pS, c75113Zb, null, str);
        }
    }

    public static Intent A00(Context context, Intent intent, AbstractC12990ll abstractC12990ll, String str, HashMap hashMap) {
        Intent intent2 = new Intent(context, (Class<?>) ShareUtil$ChosenComponentReceiver.class);
        intent2.putExtra("log_event_name", "share_to_system_sheet_success");
        if (Build.VERSION.SDK_INT >= 33) {
            intent2.putExtra("log_event_extras", hashMap);
        } else if (hashMap != null) {
            intent2.putExtra("log_event_extras", AbstractC31175DnJ.A0d(hashMap));
        }
        intent2.putExtra("log_event_module_name", str);
        AbstractC31175DnJ.A0o(intent2, abstractC12990ll);
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0B(intent2, context.getClassLoader());
        c04750Mt.A08();
        return Intent.createChooser(intent, null, c04750Mt.A02(context, 0, 1342177280).getIntentSender());
    }

    public static void A04(final Activity activity, final View view, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Long l, String str, String str2, String str3, final String str4, final boolean z) {
        A0A(activity, abstractC10360h2, abstractC018607g, new C2n2() { // from class: X.Fsm
            @Override // X.C2n2
            public final Object apply(Object obj) {
                Activity activity2 = activity;
                boolean z2 = z;
                View view2 = view;
                String str5 = str4;
                activity2.getClass();
                AbstractC13900nG.A01(activity2, (String) obj, null);
                AbstractC34301FAv.A00(activity2, view2, str5, z2);
                return null;
            }
        }, interfaceC11380iw, userSession, user, AbstractC166997dE.A0b(), l, str, "copy_link", str2, str3, z);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    public static void A05(Activity activity, View view, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Runnable runnable, String str, String str2, String str3, String str4, String str5) {
        Integer num;
        boolean z;
        char c = 65535;
        switch (str4.hashCode()) {
            case -1436108013:
                if (str4.equals("messenger")) {
                    c = 0;
                    break;
                }
                break;
            case -916346253:
                if (str4.equals("twitter")) {
                    c = 1;
                    break;
                }
                break;
            case -266143003:
                if (str4.equals("user_sms")) {
                    c = 2;
                    break;
                }
                break;
            case 284397090:
                if (str4.equals("snapchat")) {
                    c = 3;
                    break;
                }
                break;
            case 389639919:
                if (str4.equals("system_share_sheet")) {
                    c = 4;
                    break;
                }
                break;
            case 497130182:
                if (str4.equals("facebook")) {
                    c = 5;
                    break;
                }
                break;
            case 1505434244:
                if (str4.equals("copy_link")) {
                    c = 6;
                    break;
                }
                break;
            case 1539093419:
                if (str4.equals("barcelona")) {
                    c = 7;
                    break;
                }
                break;
            case 1934780818:
                if (str4.equals("whatsapp")) {
                    c = '\b';
                    break;
                }
                break;
        }
        String str6 = "";
        String str7 = null;
        switch (c) {
            case 0:
                num = C05F.A0C;
                str7 = "com.facebook.orca";
                str6 = "share_to_messenger";
                z = true;
                C32526EUc c32526EUc = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A01 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A01.A00 = c32526EUc;
                C1GJ.A00(activity, abstractC018607g, A01);
                return;
            case 1:
                num = C05F.A0u;
                str7 = "com.twitter.android";
                str6 = "share_to_twitter";
                z = false;
                C32526EUc c32526EUc2 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A012 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A012.A00 = c32526EUc2;
                C1GJ.A00(activity, abstractC018607g, A012);
                return;
            case 2:
                num = C05F.A1I;
                z = false;
                C32526EUc c32526EUc22 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A0122 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A0122.A00 = c32526EUc22;
                C1GJ.A00(activity, abstractC018607g, A0122);
                return;
            case 3:
                num = C05F.A15;
                str7 = "com.snapchat.android";
                str6 = "share_to_snapchat";
                z = false;
                C32526EUc c32526EUc222 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A01222 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A01222.A00 = c32526EUc222;
                C1GJ.A00(activity, abstractC018607g, A01222);
                return;
            case 4:
                num = C05F.A0Y;
                str6 = "share_to_system_sheet";
                z = false;
                C32526EUc c32526EUc2222 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A012222 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A012222.A00 = c32526EUc2222;
                C1GJ.A00(activity, abstractC018607g, A012222);
                return;
            case 5:
                num = C05F.A01;
                str7 = "com.facebook.katana";
                str6 = "share_to_facebook";
                z = true;
                C32526EUc c32526EUc22222 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A0122222 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A0122222.A00 = c32526EUc22222;
                C1GJ.A00(activity, abstractC018607g, A0122222);
                return;
            case 6:
                num = C05F.A00;
                z = false;
                C32526EUc c32526EUc222222 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A01222222 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A01222222.A00 = c32526EUc222222;
                C1GJ.A00(activity, abstractC018607g, A01222222);
                return;
            case 7:
                num = C05F.A07;
                str7 = "com.instagram.barcelona";
                str6 = "share_to_barcelona";
                z = true;
                C32526EUc c32526EUc2222222 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A012222222 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A012222222.A00 = c32526EUc2222222;
                C1GJ.A00(activity, abstractC018607g, A012222222);
                return;
            case '\b':
                num = C05F.A02;
                str7 = "com.whatsapp";
                str6 = "share_to_whatsapp";
                z = true;
                C32526EUc c32526EUc22222222 = new C32526EUc(activity, view, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str4, str5, str7, str6, str, str3, str2, z);
                C1ON A0122222222 = AbstractC35242Fgb.A01(userSession, num, user.getUsername(), str, interfaceC11380iw.getModuleName());
                A0122222222.A00 = c32526EUc22222222;
                C1GJ.A00(activity, abstractC018607g, A0122222222);
                return;
            default:
                throw AbstractC166987dD.A14("Unsupported share option for live video sharing via app.");
        }
    }

    public static void A07(Activity activity, View view, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, Runnable runnable, String str, boolean z) {
        User user = c41181vS.A0i;
        C38321qM c38321qM = c41181vS.A0b;
        if (user != null && c38321qM != null) {
            C33130EjZ c33130EjZ = new C33130EjZ(activity, view, abstractC10360h2, userSession, interfaceC60442pS, c41181vS, runnable, str, z);
            if (!z) {
                AbstractC63248Sg4.A02(abstractC10360h2);
            }
            C1ON A02 = AbstractC35242Fgb.A02(userSession, C05F.A0Y, user.getUsername(), c38321qM.getId(), interfaceC60442pS.getModuleName());
            A02.A00 = c33130EjZ;
            C1GJ.A00(activity, abstractC018607g, A02);
        }
    }

    public static void A08(Activity activity, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo, EnumC33425Epw enumC33425Epw, String str, String str2) {
        String Ar1 = channelChallengeShareInfo.Ar1();
        if (Ar1 != null) {
            String C7I = channelChallengeShareInfo.C7I();
            String str3 = channelChallengeShareInfo.F7i().A00;
            Integer num = enumC33425Epw.A02;
            String moduleName = interfaceC11380iw.getModuleName();
            AbstractC167027dH.A13(str3, num, moduleName);
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, C7I, "thread_igid");
            C0CA.A00(A0T, str3, "messaging_off_platform_share_type");
            C0CA.A00(A0T, FXG.A00(num), "share_to_app");
            C0CA.A00(A0T, moduleName, "containermodule");
            C0CA.A00(A0T, Ar1, "shared_content_id");
            C2JM A0b = AbstractC25225BEi.A0b();
            AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "DirectThreadContentShareUrl", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), QjH.class, false, null, 0, null, "xdt_get_igd_thread_content_to_share_url", AbstractC166987dD.A1E()), new C32506ETg(activity, view, interfaceC11380iw, userSession, channelChallengeShareInfo, enumC33425Epw, Ar1, str, str2));
        }
    }

    public static void A09(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, C2n2 c2n2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Hashtag hashtag, Boolean bool, Integer num, String str) {
        AbstractC73317Y7a.A0D(interfaceC11380iw, userSession, hashtag.getId(), "hashtag_page_overflow_menu", str);
        C33121EjQ c33121EjQ = new C33121EjQ(abstractC10360h2, activity, bool, interfaceC11380iw, hashtag, c2n2, userSession, str, 0);
        String name = hashtag.getName();
        String moduleName = interfaceC11380iw.getModuleName();
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "third_party_sharing/%s/get_hashtag_to_share_url/", new Object[]{android.net.Uri.encode(name)});
        A0M.A0C = "create_hashtag_share_url";
        A0M.A9s("share_to_app", FXG.A00(num));
        A0M.A9s("containermodule", moduleName);
        A0M.A0I("exposed_to_experiment", AbstractC35242Fgb.A04(userSession));
        A0M.A0H("qe_universe_name", AbstractC35242Fgb.A03(userSession));
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C32175EBw.class, FX3.class);
        A0e.A00 = c33121EjQ;
        C1GJ.A00(activity, abstractC018607g, A0e);
    }

    public static void A0A(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, C2n2 c2n2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Boolean bool, Long l, String str, String str2, String str3, String str4, boolean z) {
        C1ON c1on;
        AbstractC73317Y7a.A08(interfaceC11380iw, userSession, null, null, l, user.getId(), null, str, str2, str3, str4, null, false);
        C33126EjV c33126EjV = new C33126EjV(activity, abstractC10360h2, c2n2, interfaceC11380iw, userSession, user, bool, str, str2, z);
        if (userSession != null) {
            c1on = FB1.A00(userSession, C05F.A00, user.getUsername(), interfaceC11380iw.getModuleName());
        } else {
            c1on = null;
        }
        activity.getClass();
        if (c1on != null) {
            c1on.A00 = c33126EjV;
            C1GJ.A00(activity, abstractC018607g, c1on);
        } else {
            Throwable A0g = AbstractC31178DnM.A0g(user);
            AbstractC13900nG.A01(activity, AbstractC31178DnM.A0e(user), null);
            C9GR.A07(activity, 2131965226);
            AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, user.getId(), str, str2, A0g);
        }
    }

    public static void A0B(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, C2n2 c2n2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Boolean bool, Long l, Runnable runnable, String str, String str2, String str3) {
        AbstractC73317Y7a.A09(interfaceC11380iw, userSession, l, str, str2, str3);
        C33123EjS c33123EjS = new C33123EjS(activity, abstractC10360h2, c2n2, interfaceC11380iw, userSession, bool, runnable, str, str2, str3);
        C1ON A00 = AbstractC34304FAy.A00(userSession, C05F.A00, str, interfaceC11380iw.getModuleName());
        A00.A00 = c33123EjS;
        C1GJ.A00(activity, abstractC018607g, A00);
    }

    public static void A0C(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, final C2n2 c2n2, final UserSession userSession, final C38321qM c38321qM, final InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, final Boolean bool, Integer num, final Runnable runnable, final String str, final String str2, boolean z) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36329371715584303L) && !C18U.A06(c06090Tz, userSession, 2342171264237518221L)) {
            C33105Ej9 c33105Ej9 = new C33105Ej9(activity, abstractC10360h2, abstractC10360h2, c2n2, userSession, c38321qM, interfaceC60442pS, bool, runnable, str2, str);
            if (!z) {
                AbstractC63248Sg4.A02(abstractC10360h2);
            }
            C1ON A00 = AbstractC35242Fgb.A00(userSession, c38321qM, c75113Zb, num, interfaceC60442pS.getModuleName());
            A00.A00 = c33105Ej9;
            C1GJ.A00(activity, abstractC018607g, A00);
            return;
        }
        AbstractC34343FCl.A00(new C2n2() { // from class: X.Fsq
            @Override // X.C2n2
            public final Object apply(Object obj) {
                String str3 = str2;
                C38321qM c38321qM2 = c38321qM;
                String str4 = str;
                InterfaceC60442pS interfaceC60442pS2 = interfaceC60442pS;
                UserSession userSession2 = userSession;
                Boolean bool2 = bool;
                Runnable runnable2 = runnable;
                C2n2 c2n22 = c2n2;
                String str5 = (String) obj;
                if (str5 != null) {
                    c2n22.apply(str5);
                    if (bool2.booleanValue()) {
                        String id = c38321qM2.getId();
                        id.getClass();
                        AbstractC73317Y7a.A0I(interfaceC60442pS2, userSession2, null, id, str4, str3, str5, AbstractC25226BEj.A1G(c38321qM2), null, null, null);
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        return null;
                    }
                    return null;
                }
                return null;
            }
        }, AbstractC40691uc.A01(userSession), (C70805WhL) userSession.A01(C70805WhL.class, C37047GUd.A00), c38321qM.A2u());
    }

    public static void A0D(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, C2n2 c2n2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Boolean bool, Integer num, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        EU6 eu6 = new EU6(activity, abstractC10360h2, c2n2, userSession, interfaceC60442pS, bool, runnable, str2, str4, str5, str3, str, str6);
        if (z) {
            AbstractC63248Sg4.A02(abstractC10360h2);
        }
        String moduleName = interfaceC60442pS.getModuleName();
        AbstractC167017dG.A1Q(str, num);
        C14360o3.A0B(moduleName, 4);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "third_party_sharing/%s/get_story_highlights_to_share_url/", new Object[]{str});
        A0M.A0C = "create_highlight_permalink_share_url";
        FXG.A01(A0M, userSession, num, moduleName);
        AbstractC31179DnN.A1H(A0M, userSession);
        if (str2 != null) {
            A0M.A9s("media_id", str2);
        }
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C32176EBx.class, FX4.class);
        A0e.A00 = eu6;
        C1GJ.A00(activity, abstractC018607g, A0e);
    }

    public static void A0E(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Runnable runnable, String str, String str2) {
        EjP ejP = new EjP(activity, abstractC10360h2, interfaceC11380iw, userSession, user, runnable, str2, str);
        C1ON A00 = FB1.A00(userSession, C05F.A1I, user.getUsername(), interfaceC11380iw.getModuleName());
        if (A00 != null) {
            A00.A00 = ejP;
            C1GJ.A00(activity, abstractC018607g, A00);
        } else {
            AbstractC35101FdC.A02(activity, str2, AbstractC31178DnM.A0e(user));
            AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, user.getId(), str, "user_sms", AbstractC31178DnM.A0g(user));
            runnable.run();
        }
    }

    public static void A0F(final Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, final UserSession userSession, final C38321qM c38321qM, final InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, EnumC33425Epw enumC33425Epw, final Runnable runnable, final String str, final String str2, final String str3) {
        final String str4 = enumC33425Epw.A04;
        final String str5 = enumC33425Epw.A03;
        if (str4 != null && str5 != null) {
            final String str6 = enumC33425Epw.A05;
            final boolean z = enumC33425Epw.A06;
            Integer num = enumC33425Epw.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36329371715584303L) && !C18U.A06(c06090Tz, userSession, 2342171264237518221L)) {
                C33104Ej8 c33104Ej8 = new C33104Ej8(activity, activity, abstractC10360h2, userSession, c38321qM, interfaceC60442pS, runnable, str3, str4, str6, str5, str, str2, z);
                AbstractC63248Sg4.A02(abstractC10360h2);
                c38321qM.getClass();
                C1ON A00 = AbstractC35242Fgb.A00(userSession, c38321qM, c75113Zb, num, interfaceC60442pS.getModuleName());
                A00.A00 = c33104Ej8;
                C1GJ.A00(activity, abstractC018607g, A00);
                return;
            }
            C14360o3.A0B(userSession, 1);
            C40701ud A01 = AbstractC40691uc.A01(userSession);
            C70805WhL c70805WhL = (C70805WhL) userSession.A01(C70805WhL.class, C37047GUd.A00);
            c38321qM.getClass();
            AbstractC34343FCl.A00(new C2n2() { // from class: X.Fst
                @Override // X.C2n2
                public final Object apply(Object obj) {
                    String A012;
                    String str7 = str3;
                    C38321qM c38321qM2 = c38321qM;
                    UserSession userSession2 = userSession;
                    String str8 = str4;
                    String str9 = str6;
                    String str10 = str5;
                    boolean z2 = z;
                    Activity activity2 = activity;
                    String str11 = str;
                    InterfaceC60442pS interfaceC60442pS2 = interfaceC60442pS;
                    Runnable runnable2 = runnable;
                    String str12 = str2;
                    String str13 = (String) obj;
                    if (str13 != null) {
                        if (str7 != null) {
                            A012 = AnonymousClass001.A0g(str7, "\n", str13);
                        } else {
                            A012 = AbstractC31510Dsu.A01(userSession2, c38321qM2, str13);
                        }
                        AbstractC31510Dsu.A0R(activity2, userSession2, c38321qM2, interfaceC60442pS2, runnable2, str8, str9, str10, str13, A012, str11, str12, z2);
                        return null;
                    }
                    return null;
                }
            }, A01, c70805WhL, c38321qM.A2u());
        }
    }

    public static void A0G(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, Runnable runnable, String str) {
        User user = c41181vS.A0i;
        C38321qM c38321qM = c41181vS.A0b;
        if (user != null && c38321qM != null) {
            C33121EjQ c33121EjQ = new C33121EjQ(abstractC10360h2, activity, userSession, runnable, user, c41181vS, interfaceC60442pS, str, 2);
            C1ON A02 = AbstractC35242Fgb.A02(userSession, C05F.A0Y, user.getUsername(), c38321qM.getId(), interfaceC60442pS.getModuleName());
            A02.A00 = c33121EjQ;
            C1GJ.A00(activity, abstractC018607g, A02);
        }
    }

    public static void A0H(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, Runnable runnable, String str, String str2) {
        String str3 = c41181vS.A0k;
        String str4 = c41181vS.A0j;
        String id = c41181vS.A0i.getId();
        A0D(activity, abstractC10360h2, abstractC018607g, new C35870Fsk(activity, str2, 1), userSession, interfaceC60442pS, true, C05F.A1I, runnable, str3, str4, id, str, "user_sms", null, true);
    }

    public static void A0I(Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, Runnable runnable, String str, String str2) {
        C38321qM c38321qM = c41181vS.A0b;
        User user = c41181vS.A0i;
        if (user != null && c38321qM != null) {
            C33131Eja c33131Eja = new C33131Eja(activity, activity, abstractC10360h2, userSession, interfaceC60442pS, c41181vS, runnable, str2, str);
            AbstractC63248Sg4.A02(abstractC10360h2);
            C1ON A02 = AbstractC35242Fgb.A02(userSession, C05F.A1I, user.getUsername(), c38321qM.getId(), interfaceC60442pS.getModuleName());
            A02.A00 = c33131Eja;
            C1GJ.A00(activity, abstractC018607g, A02);
        }
    }

    public static void A0J(final Activity activity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, final UserSession userSession, final InterfaceC60442pS interfaceC60442pS, final User user, Runnable runnable, final String str, final String str2, final String str3) {
        String id = user.getId();
        A0D(activity, abstractC10360h2, abstractC018607g, new C2n2() { // from class: X.Fsp
            @Override // X.C2n2
            public final Object apply(Object obj) {
                Activity activity2 = activity;
                String str4 = str;
                String str5 = str2;
                User user2 = user;
                String str6 = str3;
                InterfaceC60442pS interfaceC60442pS2 = interfaceC60442pS;
                UserSession userSession2 = userSession;
                String str7 = (String) obj;
                if (str7 != null) {
                    AbstractC31510Dsu.A03(activity2, AbstractC31180DnO.A03(str7), userSession2, interfaceC60442pS2, user2, null, "share_to_system_sheet", str7, str4, str5, str6, true, false);
                    return null;
                }
                return null;
            }
        }, userSession, interfaceC60442pS, true, C05F.A0Y, runnable, str, str2, id, str3, "system_share_sheet", null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (X.MSV.A00(549).equals(r17) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0L(android.app.Activity r11, X.InterfaceC11380iw r12, com.instagram.common.session.UserSession r13, com.instagram.user.model.User r14, java.lang.Runnable r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r2 = r16
            android.os.Bundle r4 = X.AbstractC31180DnO.A03(r2)
            java.lang.String r0 = "profile_action_sheet"
            r1 = r17
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            r0 = 549(0x225, float:7.7E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L1e
        L1d:
            r1 = 1
        L1e:
            r3 = 0
            r10 = 0
            java.util.HashMap r9 = X.AbstractC166987dD.A1G()
            java.lang.String r0 = "url"
            A0Y(r14, r0, r2, r9)
            if (r1 == 0) goto L32
            java.lang.String r1 = "option"
            java.lang.String r0 = "PROFILE"
            r9.put(r1, r0)
        L32:
            r2 = r11
            r5 = r12
            r6 = r13
            r8 = r18
            r7 = r19
            r11 = r20
            A0N(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31510Dsu.A0L(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User, java.lang.Runnable, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static void A0N(Context context, android.net.Uri uri, Bundle bundle, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, HashMap hashMap, boolean z, boolean z2) {
        boolean A0E;
        String str3;
        String str4;
        boolean z3;
        String A0h;
        String str5;
        Intent intent = new Intent("android.intent.action.SEND");
        if (str != null) {
            intent.setPackage(str);
        }
        if (uri != null) {
            intent.setType("image/jpeg");
            intent.putExtra(MSV.A00(19), uri);
            intent.setFlags(1);
            if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36327335901477382L)) {
                intent.setDataAndType(uri, context.getContentResolver().getType(uri));
                intent.setClipData(ClipData.newRawUri("", uri));
            }
        } else {
            intent.setType("text/plain");
        }
        if (!bundle.isEmpty()) {
            intent.putExtras(bundle);
        }
        if (z) {
            if (interfaceC11380iw != null) {
                str5 = interfaceC11380iw.getModuleName();
            } else {
                str5 = null;
            }
            intent = A00(context, intent, abstractC12990ll, str5, hashMap);
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, abstractC12990ll, 36328040275393590L)) {
            intent.setFlags(603979776);
        }
        if (z2) {
            if (str != null && (str.equals("com.whatsapp") || str.equals(AbstractC111324zv.A00(374)))) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && C18U.A06(c06090Tz, abstractC12990ll, 36326661590890523L)) {
                intent.putExtra("source_surface", 13);
            } else if (str != null && ((str.equals("com.instagram.barcelona") || str.equals("com.instagram.barcelona.debug")) && hashMap != null && (A0h = AbstractC31171DnF.A0h("share_surface", hashMap)) != null)) {
                intent.putExtra("source_surface", A0h);
            }
            if (context instanceof Activity) {
                C0b3 c0b3 = C12260kU.A00;
                C41451vu.A01.E4s(new C3KK(intent));
                A0E = C12260kU.A00.A06().A0F((Activity) context, intent, 1337);
            } else {
                A0E = C12260kU.A0F(context, intent);
            }
        } else {
            A0E = C12260kU.A0E(context, intent);
        }
        if (A0E) {
            str2.getClass();
            C19280xC A01 = C19280xC.A01(str2, null);
            if (uri == null) {
                str4 = "link";
            } else {
                str4 = "photo";
            }
            A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
            AbstractC31173DnH.A1S(A01, abstractC12990ll);
            return;
        }
        if (str != null) {
            str3 = AnonymousClass001.A0R("Can't find intent handler for ", str);
        } else {
            str3 = "Can't find intent handler for content";
        }
        C0w9.A03(str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0P(Context context, android.net.Uri uri, Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, Runnable runnable, String str) {
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        C33103Ej7 c33103Ej7 = new C33103Ej7(context, context, uri, abstractC10360h2, userSession, c38321qM, interfaceC60442pS, c75113Zb, runnable, str);
        if (abstractC10360h2 != null) {
            AbstractC63248Sg4.A02(abstractC10360h2);
        }
        C1ON A00 = AbstractC35242Fgb.A00(userSession, c38321qM, c75113Zb, C05F.A0Y, interfaceC60442pS.getModuleName());
        A00.A00 = c33103Ej7;
        if (!fragment.isVisible()) {
            C1GJ.A06(A00, A00.A04.runnableId, 2, false, false);
        } else {
            ((C1GL) fragment).schedule(A00);
        }
    }

    public static void A0W(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, AbstractC111324zv.A00(65));
        A00.A0C("media_id", str);
        A00.A0C("share_location", str2);
        A00.A0C("share_option", str3);
        if (str4 != null) {
            A00.A0C("media_owner_id", str4);
        }
        if (str5 != null) {
            A00.A0C("url", str5);
        }
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public static void A0X(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (str5 != null) {
            str6 = str5.substring(str5.indexOf("igshid=") + 7);
            if (str6.contains("&")) {
                str6 = str6.substring(0, str6.indexOf(38));
            }
        } else {
            str6 = null;
        }
        C19280xC A00 = C19280xC.A00(interfaceC60442pS, AbstractC111324zv.A00(65));
        A00.A0C("media_id", str);
        A00.A0C("share_location", str2);
        A00.A0C("share_option", str3);
        A00.A0C("share_id", str6);
        if (str4 != null) {
            A00.A0C("media_owner_id", str4);
        }
        if (str5 != null) {
            A00.A0C("url", str5);
        }
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public static String A01(UserSession userSession, C38321qM c38321qM, String str) {
        C84923qg A1V;
        if (C2TN.A02(userSession, c38321qM) && (A1V = c38321qM.A1V()) != null) {
            String str2 = A1V.A0e;
            if (!TextUtils.isEmpty(str2)) {
                return AnonymousClass001.A0g(str2, "\n", str);
            }
            return str;
        }
        return str;
    }

    public static void A0R(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        Bundle A03 = AbstractC31180DnO.A03(str5);
        HashMap A0o = AbstractC31180DnO.A0o(str4);
        AbstractC31181DnP.A0w(userSession, c38321qM, str6, A0o);
        A0N(context, null, A03, interfaceC60442pS, userSession, str, str3, A0o, false, z);
        String id = c38321qM.getId();
        id.getClass();
        String A1G = AbstractC25226BEj.A1G(c38321qM);
        AbstractC167017dG.A1N(userSession, interfaceC60442pS);
        C14360o3.A0B(str2, 4);
        AbstractC73317Y7a.A0I(interfaceC60442pS, userSession, null, id, str6, str2, str4, null, A1G, str7, null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void A0S(Bundle bundle, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Runnable runnable, String str, String str2) {
        FragmentActivity activity = fragment.getActivity();
        boolean equals = "profile_action_sheet".equals(str2);
        HashMap A1G = AbstractC166987dD.A1G();
        A0Y(user, "url", str, A1G);
        if (equals) {
            A1G.put("option", "PROFILE");
        }
        A0Q(activity, bundle, interfaceC11380iw, userSession, "share_to_system_sheet", A1G);
        AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, user.getId(), str2, "system_share_sheet", str);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void A0Y(User user, Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        abstractMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
        abstractMap.put(AbstractC31186DnV.A00(), user.getUsername());
    }
}
