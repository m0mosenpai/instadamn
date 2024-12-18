package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63672uo implements InterfaceC63682up {
    public java.util.Set A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C63662un A04;
    public final Fragment A05;
    public final C1GL A06;
    public final C63652um A07;
    public final C63382uL A08;
    public final C63702ur A09;
    public final Integer A0A;

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(interfaceC75123Zc, 1);
        C63382uL c63382uL = this.A08;
        if (c63382uL != null) {
            c63382uL.A9W(interfaceC73233Pz, interfaceC75123Zc);
        }
    }

    @Override // X.InterfaceC63682up
    public final void Clx(C47K c47k) {
        C63652um c63652um = this.A07;
        if (c63652um != null) {
            HashSet hashSet = c63652um.A03;
            String str = c47k.A0F;
            if (str == null) {
                str = "";
            }
            if (hashSet.add(str)) {
                C18920wW c18920wW = c63652um.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(1022));
                if (A00.isSampled()) {
                    String str2 = c47k.A0F;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A00.AAP("netego_id", str2);
                    C1XV c1xv = c47k.A05;
                    if (c1xv == null) {
                        c1xv = C1XV.A0v;
                    }
                    A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c1xv.toString());
                    A00.AAP("tracking_token", c47k.A0G);
                    String str3 = c63652um.A02.userId;
                    C14360o3.A0B(str3, 0);
                    A00.A9K(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC003100w.A0k(10, str3));
                    A00.Cht();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.53S, java.lang.Object, X.FtG] */
    @Override // X.InterfaceC63682up
    public final void Dqn(C1XV c1xv, C47R c47r, Integer num, String str, String str2, String str3, List list) {
        String str4;
        EnumC33444EqG enumC33444EqG = EnumC33444EqG.A0M;
        if (c1xv == C1XV.A0v) {
            enumC33444EqG = EnumC33444EqG.A0A;
        } else if (c1xv == C1XV.A0r) {
            enumC33444EqG = EnumC33444EqG.A09;
        }
        int ordinal = c47r.ordinal();
        if (ordinal != 2) {
            if (ordinal != 6) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 3) {
                            C0w9.A03("SuggestedUsersDelegateImpl", "Unhandled Suggested Upsell button click `SuggestedItemType`. Please fix ASAP because  otherwise tap behavior for your upsell will be nonfunctional. ");
                            return;
                        } else {
                            CJA.A00(this.A01, EnumC33510Erj.FEED_SUGGESTED_USERS, this.A03, true, false);
                            return;
                        }
                    }
                    C08730cb c08730cb = C17060sy.A01;
                    UserSession userSession = this.A03;
                    if (AbstractC68564VVr.A00(c08730cb.A01(userSession)) == 0) {
                        C140966Yy c140966Yy = new C140966Yy(this.A01, userSession);
                        c140966Yy.A0D(AbstractC31364DqT.A03().A01.A04("profile"));
                        c140966Yy.A0A = AbstractC111324zv.A00(1603);
                        String str5 = userSession.userId;
                        ?? obj = new Object();
                        obj.A00 = str5;
                        c140966Yy.A07 = obj;
                        c140966Yy.A04();
                        return;
                    }
                    C1V4 c1v4 = C1V4.A00;
                    if (c1v4 != null) {
                        c1v4.A07(this.A01, userSession);
                        return;
                    } else {
                        C14360o3.A0F("instance");
                        throw C00O.createAndThrow();
                    }
                }
                A00(c1xv, str, str2);
                return;
            }
            if (list != null) {
                str4 = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, C37075GVk.A00);
            } else {
                str4 = "";
            }
            if (AbstractC35067Fce.A02()) {
                C140966Yy c140966Yy2 = new C140966Yy(this.A01, this.A03);
                c140966Yy2.A08();
                c140966Yy2.A0D(AbstractC35067Fce.A00().A00().A00(null, "feed_unit", str, str2, c1xv.toString(), str4, "feed_su_with_dp_upsell_card"));
                c140966Yy2.A04();
            }
            if (str3 == null || num == null) {
                return;
            }
            int intValue = num.intValue();
            C63662un c63662un = this.A04;
            if (c63662un == null) {
                return;
            }
            c63662un.A00(str3, intValue);
            return;
        }
        UserSession userSession2 = this.A03;
        new C35233FgQ(this.A05, this.A02, userSession2, null, null).A07(enumC33444EqG);
    }

    @Override // X.InterfaceC63692uq
    public final void Dqo(Activity activity, View view, UserSession userSession, C47P c47p, Integer num, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, int i3) {
        C14360o3.A0B(userSession, 0);
        String A00 = AbstractC125245lV.A00(this.A0A);
        String id = c47p.getId();
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String moduleName = interfaceC11380iw.getModuleName();
        C14360o3.A0B(id, 2);
        C14360o3.A0B(moduleName, 3);
        String str6 = "";
        String algorithm = c47p.getAlgorithm();
        String CEI = c47p.CEI();
        if (CEI != null) {
            str6 = CEI;
        }
        C63702ur.A03(this.A09, algorithm, moduleName, null, str2, str6, str, str3, str4, c47p.ByJ(), id, A00, i2, i);
        if (list != null && str5 != null && str5.equals("middle_state") && view != null && activity != null) {
            FragmentActivity fragmentActivity = this.A01;
            Window window = fragmentActivity.getWindow();
            if (window != null && window.getDecorView() != null) {
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A03.token);
                bundle.putInt(AbstractC43591JPw.A00(531), i3);
                bundle.putParcelableArrayList(AbstractC43591JPw.A00(529), new ArrayList<>(list));
                bundle.putInt(AbstractC43591JPw.A00(532), i);
                bundle.putString(AbstractC43591JPw.A00(528), str2);
                bundle.putString(AbstractC43591JPw.A00(527), interfaceC11380iw.getModuleName());
                Intent putExtra = new Intent(fragmentActivity, (Class<?>) TransparentModalActivity.class).putExtra("fragment_name", AbstractC111324zv.A00(2724)).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle);
                putExtra.setFlags(268435456);
                C12260kU.A00.A07().A08(activity, fragmentActivity, putExtra, view);
            }
        } else {
            A01(c47p, str, str2, str3);
        }
        if (num != null) {
            int intValue = num.intValue();
            C63662un c63662un = this.A04;
            if (c63662un != null) {
                c63662un.A00(str3, intValue);
            }
        }
    }

    @Override // X.InterfaceC63692uq
    public final void Dqq(C1XV c1xv, C47P c47p, String str, String str2, String str3, String str4, int i, int i2) {
        C1ON A01;
        String A00 = AbstractC125245lV.A00(this.A0A);
        String id = c47p.getId();
        String moduleName = this.A02.getModuleName();
        C14360o3.A0B(id, 2);
        C14360o3.A0B(moduleName, 3);
        String str5 = "";
        String CEI = c47p.CEI();
        if (CEI != null) {
            str5 = CEI;
        }
        String algorithm = c47p.getAlgorithm();
        String ByJ = c47p.ByJ();
        C18920wW c18920wW = this.A09.A01;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "recommended_user_dismissed");
        A002.AAP("target_id", id);
        A002.A8p("position", Integer.valueOf(i2));
        A002.AAP("view_module", A00);
        A002.AAP("algorithm", algorithm);
        A002.A8p("view_state_item_type", Integer.valueOf(i));
        A002.AAP("container_module", moduleName);
        A002.AAP("follow_impression_id", str5);
        A002.AAP("ranking_algorithm", str4);
        A002.AAP("social_context", ByJ);
        A002.AAP("insertion_context", str);
        A002.AAP("display_format", str2);
        A002.AAP("netego_unit_id", str3);
        A002.AAP("topic_name", null);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A002.AAQ(c0Zx, "search_context");
        A002.A8R(null, "text_app_aysf_vertical_type");
        A002.Cht();
        String id2 = c47p.CDj().getId();
        String algorithm2 = c47p.getAlgorithm();
        C1XV c1xv2 = C1XV.A0o;
        UserSession userSession = this.A03;
        if (c1xv == c1xv2) {
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0B("discover/dismiss_close_friend_suggestion/");
            c25621Ms.A9s("target_id", id2);
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            A01 = c25621Ms.A0N();
        } else {
            A01 = FY5.A01(userSession, id2, c47p.CEI(), algorithm2);
        }
        C1GJ.A03(A01);
    }

    @Override // X.InterfaceC63682up
    public final void Dqx(C123545iT c123545iT, User user, int i) {
        C1GL c1gl = this.A06;
        C1ON A00 = AbstractC31484DsT.A00(this.A03, C05F.A01, user.getId(), null, false);
        A00.A00 = new C32481ESh(c123545iT, this, user, i);
        c1gl.schedule(A00);
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(view, 1);
        C63382uL c63382uL = this.A08;
        if (c63382uL != null) {
            c63382uL.EDV(view, interfaceC73233Pz);
        }
    }

    public final void A01(C47P c47p, String str, String str2, String str3) {
        FragmentActivity fragmentActivity = this.A01;
        if (C06P.A01(fragmentActivity.getSupportFragmentManager())) {
            UserSession userSession = this.A03;
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A08();
            C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
            C31368DqX A01 = AbstractC31402Dr6.A01(userSession, c47p.getId(), AbstractC111324zv.A00(5433), this.A02.getModuleName());
            A01.A03 = new UserDetailEntryInfo(null, null, null, null, str, str2, str3, null, null, null, null, null);
            c140966Yy.A0B(null, c28431Ze.A02(userSession, A01.A03()));
            c140966Yy.A0B = "suggested_users";
            c140966Yy.A04();
        }
    }

    @Override // X.InterfaceC63682up
    public final InterfaceC11380iw Abd() {
        return this.A02;
    }

    @Override // X.InterfaceC63682up
    public final void Cly(C47K c47k) {
        C63652um c63652um = this.A07;
        if (c63652um != null) {
            HashSet hashSet = c63652um.A04;
            String str = c47k.A0F;
            if (str == null) {
                str = "";
            }
            if (hashSet.add(str)) {
                UserSession userSession = c63652um.A02;
                C1XV c1xv = c47k.A05;
                if (c1xv == null) {
                    c1xv = C1XV.A0v;
                }
                String obj = c1xv.toString();
                String str2 = c47k.A0F;
                if (str2 == null) {
                    str2 = "";
                }
                AbstractC40751I4f.A00(c63652um.A00, c63652um.A01, userSession, null, obj, str2, AbstractC111324zv.A00(2220), c47k.A0G);
            }
        }
    }

    @Override // X.InterfaceC63682up
    public final void Clz(C47K c47k) {
        C63652um c63652um = this.A07;
        if (c63652um != null) {
            HashSet hashSet = c63652um.A05;
            String str = c47k.A0F;
            if (str == null) {
                str = "";
            }
            if (hashSet.add(str)) {
                C18920wW c18920wW = c63652um.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_netego_secondary_click");
                if (A00.isSampled()) {
                    C1XV c1xv = c47k.A05;
                    if (c1xv == null) {
                        c1xv = C1XV.A0v;
                    }
                    A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c1xv.toString());
                    A00.AAP("action", "cta_secondary_click");
                    A00.AAP("container_module", c63652um.A00.getModuleName());
                    A00.A9K("ig_userid", Long.valueOf(Long.parseLong(c63652um.A02.userId)));
                    String str2 = c47k.A0F;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A00.AAP("netego_id", str2);
                    A00.AAP("tracking_token", c47k.A0G);
                    A00.Cht();
                }
            }
        }
    }

    @Override // X.InterfaceC63692uq
    public final void Dqs(C47P c47p, Long l, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        java.util.Set set = this.A00;
        if (set == null) {
            set = new HashSet();
            this.A00 = set;
        }
        if (set.add(c47p.getId())) {
            String A00 = AbstractC125245lV.A00(this.A0A);
            String id = c47p.getId();
            String moduleName = this.A02.getModuleName();
            C14360o3.A0B(id, 2);
            C14360o3.A0B(moduleName, 3);
            String str5 = "";
            String CEI = c47p.CEI();
            if (CEI != null) {
                str5 = CEI;
            }
            String algorithm = c47p.getAlgorithm();
            String ByJ = c47p.ByJ();
            C63702ur.A01(this.A09, Integer.valueOf(i3), l, algorithm, moduleName, null, "profile", str5, str, str3, str4, ByJ, id, A00, i2, i);
        }
    }

    @Override // X.InterfaceC63682up
    public final void Dqv(C1XV c1xv, Integer num, String str, String str2, String str3, String str4, int i) {
        if (c1xv == C1XV.A0o) {
            C140966Yy c140966Yy = new C140966Yy(this.A01, this.A03);
            c140966Yy.A08();
            c140966Yy.A0D(new C33149Ejs());
            c140966Yy.A04();
        } else {
            String A00 = AbstractC125245lV.A00(this.A0A);
            String moduleName = this.A02.getModuleName();
            C14360o3.A0B("", 2);
            C14360o3.A0B(moduleName, 3);
            C63702ur c63702ur = this.A09;
            C18920wW c18920wW = c63702ur.A01;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(1210));
            A002.AAP("view_module", A00);
            A002.A8p("view_state_item_type", Integer.valueOf(i));
            A002.AAP("ranking_algorithm", str);
            A002.AAP("netego_unit_id", str2);
            A002.AAP("module", c63702ur.A02);
            A002.A8R(null, "text_app_aysf_vertical_type");
            A002.Cht();
            A00(c1xv, str3, str4);
        }
        if (num != null) {
            int intValue = num.intValue();
            C63662un c63662un = this.A04;
            if (c63662un != null) {
                c63662un.A00(str2, intValue);
            }
        }
    }

    @Override // X.InterfaceC63682up
    public final void Dqw() {
        java.util.Set set = this.A00;
        if (set != null) {
            set.clear();
        }
    }

    public C63672uo(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63652um c63652um, C63382uL c63382uL, C63662un c63662un, Integer num) {
        this.A03 = userSession;
        this.A05 = fragment;
        this.A02 = interfaceC11380iw;
        this.A01 = fragmentActivity;
        this.A08 = c63382uL;
        this.A0A = num;
        this.A09 = new C63702ur(interfaceC11380iw, userSession);
        this.A06 = new C61972ry(fragment.requireContext(), AbstractC018607g.A00(fragment), null);
        this.A07 = c63652um;
        this.A04 = c63662un;
    }

    private final void A00(C1XV c1xv, String str, String str2) {
        if (AbstractC35067Fce.A02()) {
            C140966Yy c140966Yy = new C140966Yy(this.A01, this.A03);
            c140966Yy.A08();
            c140966Yy.A0B(null, AbstractC35067Fce.A00().A00().A00(null, "feed_unit", str, str2, c1xv.toString(), null, null));
            c140966Yy.A04();
        }
    }

    @Override // X.InterfaceC63692uq
    public final void Dqr(C47P c47p, String str, String str2, String str3, String str4, int i, int i2) {
        EnumC33402EpZ enumC33402EpZ;
        User CDj = c47p.CDj();
        String str5 = null;
        if (CDj != null) {
            FollowStatus B7L = CDj.B7L();
            enumC33402EpZ = AbstractC123565iV.A02(B7L);
            str5 = AbstractC38851rI.A06(B7L);
        } else {
            enumC33402EpZ = null;
        }
        String A00 = AbstractC125245lV.A00(this.A0A);
        String id = c47p.getId();
        String moduleName = this.A02.getModuleName();
        String str6 = null;
        C14360o3.A0B(id, 2);
        C14360o3.A0B(moduleName, 3);
        String str7 = "";
        String CEI = c47p.CEI();
        if (CEI != null) {
            str7 = CEI;
        }
        String algorithm = c47p.getAlgorithm();
        String ByJ = c47p.ByJ();
        if (enumC33402EpZ != null) {
            str6 = enumC33402EpZ.A00;
        }
        C63702ur.A06(this.A09, algorithm, moduleName, null, str2, str5, str7, str, str3, str4, str6, ByJ, id, A00, i2, i);
    }
}
