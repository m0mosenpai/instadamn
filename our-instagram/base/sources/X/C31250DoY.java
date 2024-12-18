package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.AudioType;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import go.Seq;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.DoY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31250DoY implements InterfaceC58311Pt3 {
    public static final InterfaceC37135GXw A0Y = new InterfaceC37135GXw() { // from class: X.DqB
        @Override // X.InterfaceC37135GXw
        public final void DeJ() {
        }
    };
    public RectF A00;
    public InterfaceC41501vz A01;
    public InterfaceC41501vz A02;
    public AbstractC149546o6 A03;
    public boolean A04;
    public final FragmentActivity A05;
    public final AbstractC10360h2 A06;
    public final AbstractC59962oe A07;
    public final InterfaceC11380iw A08;
    public final C18920wW A09;
    public final UserSession A0A;
    public final InterfaceC60442pS A0B;
    public final InterfaceC37135GXw A0D;
    public final InterfaceC60602pj A0G;
    public final InterfaceC69973Cg A0H;
    public final C31340Dq5 A0I;
    public final InterfaceC63862v7 A0J;
    public final C63822v3 A0K;
    public final C31342Dq7 A0L;
    public final GZI A0M;
    public final C92654Da A0N;
    public final C31338Dq3 A0O;
    public final C31339Dq4 A0P;
    public final C38E A0Q;
    public final BJ5 A0R;
    public final C31341Dq6 A0S;
    public final C31343Dq8 A0T;
    public final C34698FQj A0U;
    public final String A0V;
    public final HashMap A0X = AbstractC166987dD.A1G();
    public final HashMap A0W = AbstractC166987dD.A1G();
    public final Map A0E = AbstractC166987dD.A1G();
    public final java.util.Set A0F = AbstractC166987dD.A1H();
    public final C60322pF A0C = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r2.equals("pending_tagged_posts") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0T(X.C5HW r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.String r2 = r5.A06()
            if (r2 == 0) goto L23
            java.lang.String r0 = "profile_tagged_posts"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L18
            java.lang.String r0 = "pending_tagged_posts"
            boolean r1 = r2.equals(r0)
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            r1 = 1
            if (r0 != 0) goto L3c
            int r0 = r2.hashCode()
            switch(r0) {
                case -2058699197: goto L33;
                case -1610081298: goto L30;
                case -1577211727: goto L2d;
                case -1511625256: goto L2a;
                case -1120828100: goto L27;
                case 862879669: goto L24;
                default: goto L23;
            }
        L23:
            return r3
        L24:
            java.lang.String r0 = "your_shopping_items"
            goto L35
        L27:
            java.lang.String r0 = "product_display_page"
            goto L35
        L2a:
            java.lang.String r0 = "live_camera"
            goto L35
        L2d:
            java.lang.String r0 = "shopping_bag"
            goto L35
        L30:
            java.lang.String r0 = "product_collection"
            goto L35
        L33:
            java.lang.String r0 = "featured_product_media"
        L35:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3c
            return r3
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31250DoY.A0T(X.5HW):boolean");
    }

    @Override // X.InterfaceC58311Pt3
    public final void D4J(Reel reel, C3Ow c3Ow) {
        this.A00 = AbstractC13880nE.A0G(c3Ow.Aek());
        List singletonList = Collections.singletonList(reel);
        C38E c38e = this.A0Q;
        c38e.A0C = this.A0V;
        c38e.A05 = new C31559Dtj(this.A05, c3Ow.Aek(), new GF3(this, 7));
        c38e.A06(reel, C3G2.A03, c3Ow, singletonList, singletonList, singletonList);
    }

    @Override // X.InterfaceC58311Pt3
    public final synchronized void D6B(C51693MsO c51693MsO, C5HW c5hw, int i) {
        boolean z;
        String A07;
        if (c5hw.A00 == 1508) {
            Ddu(null, c51693MsO, c5hw, i);
        } else {
            C31342Dq7 c31342Dq7 = this.A0L;
            if (!F9P.A00(c31342Dq7.A02) || ((A07 = c5hw.A07()) != null && !c31342Dq7.A05(c51693MsO, c5hw, A07))) {
                String str = c5hw.A04.A0b;
                if (str == null) {
                    str = c5hw.A09("target_comment_id");
                }
                A05(c5hw.A00);
                String A072 = c5hw.A07();
                String A09 = c5hw.A09("target_note_id");
                if (str == null && !A03(c5hw, "permalink_enabled").equals("True")) {
                    if (c5hw.A00 == 768) {
                        if (!C18U.A06(C06090Tz.A05, this.A0A, 36322521242544432L)) {
                        }
                    }
                    z = false;
                    A0Q(A072, str, A09, true, true, z, false);
                    A0C(this, c51693MsO, c5hw);
                }
                z = true;
                A0Q(A072, str, A09, true, true, z, false);
                A0C(this, c51693MsO, c5hw);
            }
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final synchronized void D6G(C51693MsO c51693MsO, C5HW c5hw, int i) {
        A05(c5hw.A00);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(1553), c5hw.A04.A0b);
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A05, this.A0A);
        AbstractC31412DrH.A00();
        AbstractC31176DnK.A1A(A0b, new C32355ENc(), A0P);
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DAO(C51693MsO c51693MsO, C5HW c5hw, int i, boolean z) {
        UserSession userSession = this.A0A;
        String str = c5hw.A04.A0p;
        InterfaceC11380iw interfaceC11380iw = this.A08;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_share_from_mention_view_story");
        AbstractC31171DnF.A1F(A0f, str);
        A0f.Cht();
        C36881nl A01 = C36881nl.A01(this.A05, interfaceC11380iw, userSession, "newsfeed");
        A01.A0A(c5hw.A04.A0p);
        A01.A0x = false;
        A01.A06();
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.InterfaceC58311Pt3
    public final synchronized void DRM(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        String str2;
        AnonymousClass341 anonymousClass341;
        C140966Yy A0P;
        Fragment A02;
        long j;
        long j2;
        String str3;
        Long l;
        if (c5hw.A00 == 1508) {
            Ddu(null, c51693MsO, c5hw, i);
        } else {
            BJ5 bj5 = this.A0R;
            if (C14360o3.A0K(c5hw.A0C, "remind_me_about_this_ad")) {
                String A07 = c5hw.A07();
                String A09 = c5hw.A09(AbstractC43591JPw.A00(457));
                if (A09 != null) {
                    l = AbstractC166997dE.A0j(A09);
                } else {
                    l = null;
                }
                if (A07 != null && l != null) {
                    ((C27966CUm) bj5.A02.getValue()).A01(AbstractC43591JPw.A00(1197), A07, l.longValue());
                }
            }
            C31343Dq8 c31343Dq8 = this.A0T;
            String A08 = c5hw.A08();
            if (A08 != null) {
                String A072 = c5hw.A07();
                String A092 = c5hw.A09("media_id");
                String A093 = c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A072 == null) {
                    if (A092 == null) {
                        A072 = A093;
                        if (A093 == null) {
                            A072 = null;
                        }
                    } else {
                        A072 = A092;
                    }
                }
                C121695fL c121695fL = c5hw.A04.A0I;
                if (c121695fL != null) {
                    str3 = c121695fL.A0J;
                } else {
                    str3 = null;
                }
                String A094 = c5hw.A09("ad_id");
                String A095 = c5hw.A09("ad_tracking_token");
                C146076i5 c146076i5 = c31343Dq8.A00;
                Long l2 = null;
                Long A0k = AbstractC003100w.A0k(10, A08);
                if (str3 != null) {
                    l2 = AbstractC003100w.A0k(10, str3);
                }
                C146076i5.A03(c146076i5, A0k, l2, A072, AbstractC43591JPw.A00(1383), "activity_feed", A094, A095);
            }
            if (!this.A0L.A05(c51693MsO, c5hw, str)) {
                EnumC31336Dq1 A03 = c5hw.A03();
                if (A03 != null) {
                    F9G f9g = F9G.$redex_init_class;
                    switch (A03.ordinal()) {
                        case 6:
                            A0G(c5hw);
                            break;
                        case Seq.RefTracker.REF_OFFSET /* 42 */:
                            String A096 = c5hw.A09("parent_post_id");
                            String A097 = c5hw.A09("parent_post_thumbnail_url");
                            I0V.A00(this.A07.requireActivity(), this.A0A, A096, A097);
                            break;
                        case 44:
                            A0I(c5hw);
                            break;
                        case 151:
                            FC7.A00(this.A0A, c5hw.A09("media_ids"), c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                            break;
                        case 155:
                        case 190:
                            AbstractC86593tX.A0c(this.A05, this.A0A, str);
                            break;
                    }
                }
                A05(c5hw.A00);
                if (c5hw.A06() != null) {
                    str2 = c5hw.A06();
                } else {
                    str2 = "";
                }
                boolean z = true;
                if (str2.equals("tv_viewer")) {
                    A07(ClipsViewerSource.A1s, c5hw, str, true);
                } else if (str2.equals("clips_home")) {
                    A07(ClipsViewerSource.A1s, c5hw, str, false);
                } else if ("clips_home".equals(A03)) {
                    A07(ClipsViewerSource.A2A, c5hw, str, false);
                } else if (EnumC31336Dq1.A0t.equals(str2)) {
                    String A0B = c5hw.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    FB6.A00().A03(this.A07.requireActivity(), this.A0B, this.A0A, A0B);
                } else if (str2.equals("story_fullscreen")) {
                    A0L(c5hw);
                } else if (str2.equals(EnumC31336Dq1.A0L)) {
                    String str4 = c5hw.A04.A0e;
                    if (str4 != null) {
                        AbstractC70160WDy.A03(this.A0A, this.A05, str4);
                    } else {
                        C0w9.A03("bloks_newsfeed_error", "Missing destination data");
                    }
                } else if (str2.equals(EnumC31336Dq1.A0M)) {
                    A0P(c5hw.A0B("bloks_app_id"), c5hw.A0B("params"));
                } else if (EnumC31336Dq1.A2T.equals(str2)) {
                    A0F(c5hw);
                } else {
                    C5Hd c5Hd = c5hw.A05;
                    C5Hd c5Hd2 = C5Hd.INSIGHTS_ENTRY;
                    if (c5Hd == c5Hd2 && c5hw.A00 == 121) {
                        if (AbstractC31249DoX.A00(c5hw)) {
                            UserSession userSession = this.A0A;
                            C14360o3.A0B(userSession, 1);
                            C19280xC A00 = C19280xC.A00(AbstractC31171DnF.A0D(AbstractC111324zv.A00(60)), "aymt_click");
                            C14360o3.A0A(A00);
                            A00.A0C("actor_igid", userSession.userId);
                            Long l3 = c5hw.A04.A0S;
                            if (l3 != null) {
                                j = l3.longValue();
                            } else {
                                j = 0;
                            }
                            A00.A0B("tip_id", Long.valueOf(j));
                            Long l4 = c5hw.A04.A0R;
                            if (l4 != null) {
                                j2 = l4.longValue();
                            } else {
                                j2 = 0;
                            }
                            A00.A0B("channel_id", Long.valueOf(j2));
                            AbstractC31173DnH.A1S(A00, userSession);
                        }
                        C1Y8.A00.A02(this.A05, this.A0A, "activity_feed", null, false);
                    } else {
                        if (c5hw.A09("media_ids") != null) {
                            ArrayList A0h = AbstractC31178DnM.A0h(A03(c5hw, "media_ids"));
                            A0P = AbstractC25225BEi.A0r(this.A07.getActivity(), this.A0A);
                            InterfaceC11380iw interfaceC11380iw = this.A08;
                            C31569Dtv A002 = AbstractC34365FDh.A00(interfaceC11380iw.getModuleName());
                            A002.A06 = "Static";
                            A002.A0A = AbstractC166997dE.A0n();
                            A002.A07 = this.A05.getString(2131962738);
                            A002.A0A(A0h);
                            A002.A09 = interfaceC11380iw.getModuleName();
                            A0P.A0E(A002.A08());
                        } else {
                            if (c5hw.A00 == 822) {
                                A0P = AbstractC31173DnH.A0P(this.A05, this.A0A);
                                AbstractC69933Cc.A01();
                                Bundle A0E = AbstractC31174DnI.A0E(str, 0);
                                A0E.putString(MSV.A00(341), str);
                                A0E.putBoolean(MSV.A00(752), true);
                                A02 = new EditMediaInfoFragment();
                                A02.setArguments(A0E);
                            } else {
                                UserSession userSession2 = this.A0A;
                                C14360o3.A0B(userSession2, 0);
                                if (!((C36273FzQ) userSession2.A01(C36273FzQ.class, GUB.A00)).A00.add(str) && c5hw.A04.A0b == null) {
                                    z = false;
                                }
                                String A0d = AbstractC31171DnF.A0d(this);
                                if (c5Hd2.equals(c5hw.A05)) {
                                    A0d = "insights_notification";
                                }
                                String A098 = c5hw.A09("notification_type");
                                if (A098 != null) {
                                    A0d = A098;
                                }
                                if (c5hw.A00 == 5) {
                                    anonymousClass341 = AnonymousClass341.A04;
                                } else {
                                    anonymousClass341 = AnonymousClass341.A0U;
                                }
                                A0P = AbstractC31173DnH.A0P(this.A05, userSession2);
                                IgFragmentFactoryImpl.A00();
                                boolean A1W = AbstractC167007dF.A1W(c5hw.A09("child_media_id_to_switch"));
                                String A099 = c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                if (A1W && A099 != null) {
                                    str = A099;
                                }
                                C35028Fc1 c35028Fc1 = new C35028Fc1();
                                c35028Fc1.A0B = str;
                                c35028Fc1.A07 = c5hw.A09("child_media_id_to_switch");
                                c35028Fc1.A0M = z;
                                c35028Fc1.A0E = A0d;
                                c35028Fc1.A09 = c5hw.A04.A0b;
                                c35028Fc1.A0H = c5hw.A09("target_note_id");
                                c35028Fc1.A02 = anonymousClass341;
                                c35028Fc1.A0A = c5hw.A09("android_link_lead_gen_form_id");
                                c35028Fc1.A08 = c5hw.A09("cta_title");
                                c35028Fc1.A05 = c5hw.A09("ad_id");
                                c35028Fc1.A06 = c5hw.A09("ad_tracking_token");
                                A02 = c35028Fc1.A02();
                            }
                            A0P.A0E(A02);
                        }
                        A0P.A04();
                    }
                }
                A0C(this, c51693MsO, c5hw);
            }
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dht(C5HW c5hw, int i) {
        A0S(null, c5hw, i);
    }

    @Override // X.InterfaceC58311Pt3
    public final void E0u(MUD mud, C5HW c5hw, int i) {
        A0C(this, new C51693MsO(mud, EnumC33370Ep3.A0H, null, i), c5hw);
        String A07 = c5hw.A07();
        String str = c5hw.A04.A06;
        str.getClass();
        A0Q(A07, str, null, false, true, true, false);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.FQj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.2pF] */
    public C31250DoY(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC37135GXw interfaceC37135GXw, GZI gzi, C31338Dq3 c31338Dq3, C31339Dq4 c31339Dq4) {
        ComponentCallbacks2 parent;
        InterfaceC37135GXw interfaceC37135GXw2 = interfaceC37135GXw;
        C31426DrW c31426DrW = new C31426DrW(this, 1);
        this.A0G = c31426DrW;
        this.A0J = new C36495G7t(this, 2);
        this.A05 = fragmentActivity;
        this.A0A = userSession;
        this.A06 = abstractC10360h2;
        this.A07 = abstractC59962oe;
        this.A08 = interfaceC11380iw;
        this.A0B = interfaceC60442pS;
        this.A0K = new C63822v3(fragmentActivity, AbstractC018607g.A00(abstractC59962oe), interfaceC11380iw, userSession);
        this.A0P = c31339Dq4;
        if (fragmentActivity instanceof InterfaceC53782dH) {
            if (fragmentActivity.getParent() == null) {
                parent = fragmentActivity;
            } else {
                parent = fragmentActivity.getParent();
            }
            this.A0H = ((InterfaceC53782dH) parent).Als();
        }
        this.A0Q = new C38E(interfaceC11380iw, userSession, new C38C(abstractC59962oe));
        this.A0I = new C31340Dq5(fragmentActivity, abstractC59962oe, interfaceC11380iw, userSession);
        this.A0V = AbstractC166997dE.A0n();
        this.A0D = interfaceC37135GXw == null ? A0Y : interfaceC37135GXw2;
        this.A01 = C31650DvG.A00(this, 53);
        AbstractC25651Mw.A00(userSession).A01(this.A01, C36058Fvu.class);
        this.A02 = C31650DvG.A00(this, 54);
        AbstractC25651Mw.A00(userSession).A01(this.A02, C36059Fvv.class);
        this.A0S = new C31341Dq6(userSession);
        this.A09 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A0O = c31338Dq3;
        this.A0M = gzi;
        this.A0N = C4DZ.A00(userSession);
        this.A0U = new Object();
        abstractC59962oe.registerLifecycleListener(c31426DrW);
        this.A0L = new C31342Dq7(fragmentActivity, interfaceC11380iw, userSession, interfaceC60442pS);
        this.A0R = new BJ5(userSession, interfaceC60442pS);
        this.A0T = new C31343Dq8(interfaceC11380iw, userSession);
        if (C18U.A06(C06090Tz.A06, userSession, 36325012323447441L)) {
            C14360o3.A0B(userSession, 0);
            BJ7 bj7 = (BJ7) userSession.A01(BJ7.class, new C29887DGb(userSession, 39));
            if (!bj7.A01) {
                bj7.A01 = true;
                C04060Jx c04060Jx = GraphQlCallInput.A02;
                UserSession userSession2 = bj7.A02;
                C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, userSession2.userId, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                C2JM A0b = AbstractC25225BEi.A0b();
                AbstractC40691uc.A01(userSession2).ATV(C31347DqC.A00, new C58510Pwe(bj7, 9), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "request_data"), "IGCommentInsightsOptinStatusQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C58507Pwb.class, false, null, 0, null, "xdt_get_comment_summary_opt_in_status_by_user_id", AbstractC166987dD.A1E()));
            }
        }
    }

    public static C140966Yy A00(C31250DoY c31250DoY) {
        return new C140966Yy(c31250DoY.A05, c31250DoY.A0A);
    }

    private InterfaceC53892dT A01() {
        FragmentActivity fragmentActivity = this.A05;
        boolean z = fragmentActivity instanceof InterfaceC53892dT;
        Object obj = fragmentActivity;
        if (!z) {
            if (fragmentActivity.getParent() instanceof InterfaceC53892dT) {
                obj = fragmentActivity.getParent();
            } else {
                return null;
            }
        }
        return (InterfaceC53892dT) obj;
    }

    public static String A04(String str) {
        int i;
        if ("SHOPPING_PRODUCT_STICKER_NUDGE".equals(str)) {
            i = 1186;
        } else if ("PRODUCT_SWIPE_UP_LINK_NUDGE".equals(str)) {
            i = 1187;
        } else if ("sticker-drop-activity-feed".equals(str)) {
            i = 867;
        } else {
            String A00 = AbstractC111324zv.A00(1279);
            if (A00.equals(str)) {
                return A00;
            }
            return "on_click_activity_feed_row";
        }
        return AbstractC111324zv.A00(i);
    }

    private void A05(int i) {
        C55772hI.A00(this.A0A).A08(this.A05, this.A08, "nf_story_type", Integer.toString(i));
    }

    private void A06(EnumC151596s5 enumC151596s5, String str, int i) {
        C1QE.A01("business_conversion_flow").A08();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC155756z4.A00();
        AbstractC59962oe abstractC59962oe = this.A07;
        Context context = abstractC59962oe.getContext();
        C14360o3.A0B(context, 0);
        Intent A08 = AbstractC31173DnH.A08(context);
        AbstractC31173DnH.A1C(A0b, this.A0A);
        AbstractC31171DnF.A13(A0b, str);
        A0b.putInt("intro_entry_position", 0);
        AbstractC31174DnI.A1A(A08, enumC151596s5.A00, A0b);
        C12260kU.A06(abstractC59962oe, A08, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r1.equalsIgnoreCase("true") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (r1.equals("True") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.instagram.clips.intf.ClipsViewerSource r14, X.C5HW r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31250DoY.A07(com.instagram.clips.intf.ClipsViewerSource, X.5HW, java.lang.String, boolean):void");
    }

    public static void A09(C38321qM c38321qM, C31250DoY c31250DoY, User user, String str, String str2) {
        C36881nl A01 = C36881nl.A01(c31250DoY.A05, c31250DoY.A08, c31250DoY.A0A, "notification_message_button");
        A01.A0B = new C122145g6(ImmutableList.of((Object) new PendingRecipient(user)));
        A01.A0f = c38321qM.getId();
        A01.A0W = str;
        A01.A0a = str2;
        A01.A0u = true;
        A01.A06();
    }

    public static void A0A(C38321qM c38321qM, C31250DoY c31250DoY, User user, String str, String str2, String str3, long j) {
        String str4;
        UserSession userSession = c31250DoY.A0A;
        InterfaceC11380iw interfaceC11380iw = c31250DoY.A08;
        boolean equals = str.equals(AbstractC111324zv.A00(499));
        if (equals) {
            str4 = "see_response_button_click";
        } else {
            str4 = "message_button_click";
        }
        C162337Ov.A0S(interfaceC11380iw, userSession, str4, user.getId(), str2, null);
        C32955Eem A00 = InterfaceC38901rP.A00.A00();
        A00.A0r = str2;
        A00.A09 = user;
        A00.A0t = str3;
        A00.A0g = Long.valueOf(j);
        C84923qg c84923qg = new C84923qg(A00.A00());
        c84923qg.A01(c38321qM);
        C31340Dq5 c31340Dq5 = c31250DoY.A0I;
        User user2 = c84923qg.A08;
        if (user2 != null) {
            user2.getId();
            user2.getUsername();
            user2.Bhu();
            PendingRecipient pendingRecipient = new PendingRecipient(user2);
            if (equals) {
                String str5 = c84923qg.A0G;
                Activity activity = c31340Dq5.A00;
                UserSession userSession2 = c31340Dq5.A03;
                InterfaceC11380iw interfaceC11380iw2 = c31340Dq5.A02;
                C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw2, userSession2, str);
                Fragment fragment = c31340Dq5.A01;
                A01.A00 = fragment;
                A01.A0B(AbstractC166987dD.A1J(pendingRecipient));
                A01.A0n = true;
                A01.A01 = fragment;
                A01.A0a = str5;
                A01.A0s = true;
                A01.A0F = 38241;
                if (str.equals("private_reply_message")) {
                    C162337Ov.A0S(interfaceC11380iw2, userSession2, "open_thread_error", pendingRecipient.getId(), str5, "Post link should not be null.");
                }
                A01.A06();
                return;
            }
            C38321qM c38321qM2 = c84923qg.A07;
            if (c38321qM2 == null || c38321qM2.getId() == null || c84923qg.A0G == null || c84923qg.A0e == null) {
                return;
            }
            C32540EUq c32540EUq = new C32540EUq(6, c84923qg, pendingRecipient, c31340Dq5);
            Activity activity2 = c31340Dq5.A00;
            C08790ch A002 = AbstractC018607g.A00(c31340Dq5.A01);
            UserSession userSession3 = c31340Dq5.A03;
            C38321qM c38321qM3 = c84923qg.A07;
            if (c38321qM3 != null) {
                C1ON A003 = AbstractC35242Fgb.A00(userSession3, c38321qM3, null, C05F.A09, c31340Dq5.A02.getModuleName());
                A003.A00 = c32540EUq;
                C1GJ.A00(activity2, A002, A003);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    private void A0B(Hashtag hashtag) {
        FragmentActivity fragmentActivity = this.A05;
        UserSession userSession = this.A0A;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0E(WE2.A02(userSession, hashtag, AbstractC31171DnF.A0d(this), "DEFAULT"));
        A0P.A04();
    }

    public static void A0C(C31250DoY c31250DoY, C51693MsO c51693MsO, C5HW c5hw) {
        UserSession userSession = c31250DoY.A0A;
        JTE A01 = MUK.A01(userSession);
        String str = userSession.userId;
        InterfaceC11380iw interfaceC11380iw = c31250DoY.A08;
        GZI gzi = c31250DoY.A0M;
        A01.A0I(interfaceC11380iw, c51693MsO, c5hw, str, null, null, gzi.AbS(), gzi.BdC());
        c5hw.A0E();
        String str2 = c5hw.A09;
        String str3 = c5hw.A04.A0s;
        C14360o3.A0B(str2, 2);
        C1GJ.A03(AbstractC31425DrV.A00(userSession, "click", str2, str3, null));
    }

    public static void A0D(C31250DoY c31250DoY, C5HW c5hw) {
        String str;
        String obj;
        boolean z;
        String decode = android.net.Uri.decode(c5hw.A09("deeplink"));
        if (AbstractC31171DnF.A1X(android.net.Uri.decode(c5hw.A09("aymt")))) {
            str = null;
            Uri.Builder A04 = AbstractC31175DnJ.A04("fb://webview/");
            A04.appendQueryParameter("url", decode);
            obj = A04.build().toString();
            z = false;
        } else {
            str = null;
            Uri.Builder A042 = AbstractC31175DnJ.A04("fb://family_entrypoint/");
            A042.appendQueryParameter(AbstractC58317Pt9.A00(139), decode);
            if (C18U.A06(C06090Tz.A05, c31250DoY.A0A, 36322267839342691L)) {
                obj = decode;
            } else {
                obj = A042.build().toString();
            }
            z = true;
        }
        AbstractC35190Ffi.A02(c31250DoY.A07.getContext(), c31250DoY.A0B, c31250DoY.A0A, "ig_activity_feed", decode, obj, str, str, z);
    }

    private void A0E(EnumC31336Dq1 enumC31336Dq1, C5HW c5hw) {
        String A0R = AnonymousClass001.A0R("instagram://", c5hw.A04.A0k);
        try {
            android.net.Uri A03 = AbstractC08820cl.A03(A0R);
            C14H A00 = C14H.A00();
            FragmentActivity fragmentActivity = this.A05;
            C12260kU.A0C(fragmentActivity, A00.A04(fragmentActivity, A03));
        } catch (IllegalArgumentException | SecurityException unused) {
            C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0R("Error attempting to handle action: ", enumC31336Dq1.A00), 817901067);
            AEp.ABW("url", A0R);
            AEp.report();
        }
    }

    private void A0F(C5HW c5hw) {
        String A09 = c5hw.A09("use_case");
        if (A09 != null && A09.equals("saved_audio_reminder")) {
            String A092 = c5hw.A09("audio_id");
            String A093 = c5hw.A09(AbstractC111324zv.A00(2729));
            if (A092 == null) {
                C0w9.A03("DefaultNewsfeedRowDelegate", "Null audio asset id in trend midcard");
                return;
            }
            UserSession userSession = this.A0A;
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A2C, userSession);
            c116875Qr.A1C = A092;
            c116875Qr.A0v = A093;
            c116875Qr.A0M = AudioType.A04;
            AbstractC31173DnH.A1J(this.A05, c116875Qr, userSession);
            return;
        }
        String A0R = AnonymousClass001.A0R("instagram://", c5hw.A04.A0k);
        if ("ig_rename_original_audio".equals(c5hw.A0C)) {
            A0R = AnonymousClass001.A0R(A0R, "&reason=RENAME_OA_NOTIF");
        }
        UserSession userSession2 = this.A0A;
        FragmentActivity fragmentActivity = this.A05;
        InterfaceC60442pS interfaceC60442pS = this.A0B;
        C14360o3.A0B(userSession2, 0);
        AbstractC167007dF.A1E(fragmentActivity, 1, A0R);
        C35221FgE.A02(C35221FgE.A00(userSession2, A0R, null, false), fragmentActivity, userSession2, interfaceC60442pS, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r2, 36321408846407064L) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(X.C5HW r18) {
        /*
            r17 = this;
            r0 = 2038(0x7f6, float:2.856E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2 = r18
            java.lang.String r10 = r2.A09(r0)
            java.lang.String r0 = "chain_source"
            java.lang.String r1 = r2.A09(r0)
            java.lang.String r0 = "ad_id"
            java.lang.String r7 = r2.A09(r0)
            java.lang.String r0 = "media_id"
            java.lang.String r9 = r2.A09(r0)
            java.lang.String r0 = "media_author_id"
            java.lang.String r8 = r2.A09(r0)
            java.lang.String r0 = "notification_type"
            java.lang.String r14 = r2.A09(r0)
            if (r10 == 0) goto Lcd
            if (r1 == 0) goto Lcd
            if (r9 == 0) goto Lcd
            if (r8 == 0) goto Lcd
            if (r7 == 0) goto Lcd
            if (r14 == 0) goto Lcd
            X.1ZQ r0 = X.C1ZQ.A00
            if (r0 != 0) goto L42
            X.AbstractC31171DnF.A0v()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L42:
            r0 = r17
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            com.instagram.common.session.UserSession r2 = r0.A0A
            boolean r6 = X.AbstractC167017dG.A1a(r3, r2)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = "NOTIFICATION"
            boolean r0 = X.AbstractC31180DnO.A1Z(r4, r10, r5)
            if (r0 == 0) goto Ld5
            java.lang.String r0 = "RECON"
            boolean r0 = X.AbstractC31180DnO.A1Z(r0, r1, r5)
            if (r0 == 0) goto Lce
            com.instagram.feed.ui.state.IntentAwareAdPivotState r1 = new com.instagram.feed.ui.state.IntentAwareAdPivotState
            r1.<init>()
            r1.A02 = r6
            boolean r0 = X.AbstractC31180DnO.A1Z(r4, r10, r5)
            if (r0 == 0) goto L7b
            X.0Tz r0 = X.C06090Tz.A06
            r4 = 36321408846407064(0x810a2100082598, double:3.0331434368174874E-306)
            boolean r4 = X.C18U.A06(r0, r2, r4)
            r0 = 2131971609(0x7f134e19, float:1.9580202E38)
            if (r4 != 0) goto L7e
        L7b:
            r0 = 2131971610(0x7f134e1a, float:1.9580204E38)
        L7e:
            java.lang.String r12 = X.AbstractC25227BEk.A0u(r3, r0)
            r13 = 0
            r0 = 3480(0xd98, float:4.877E-42)
            java.lang.String r11 = X.AbstractC111324zv.A00(r0)
            java.lang.String r15 = r1.A0E
            android.os.Bundle r10 = X.AbstractC166987dD.A0b()
            r0 = 196(0xc4, float:2.75E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r10.putString(r0, r9)
            r0 = 379(0x17b, float:5.31E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r10.putString(r0, r8)
            r0 = 849(0x351, float:1.19E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r10.putString(r0, r7)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_IS_ADS_CHAINING_FEED_ACP_ENABLED"
            r10.putBoolean(r0, r6)
            r0 = 378(0x17a, float:5.3E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r10.putParcelable(r0, r1)
            X.6Yy r2 = X.AbstractC25225BEi.A0r(r3, r2)
            instagram.features.feed.fragment.ContextualFeedFragment r1 = new instagram.features.feed.fragment.ContextualFeedFragment
            r1.<init>()
            r16 = r13
            android.os.Bundle r0 = X.C31569Dtv.A06(r10, r11, r12, r13, r14, r15, r16)
            r1.setArguments(r0)
            X.AbstractC31175DnJ.A0s(r13, r1, r2)
        Lcd:
            return
        Lce:
            java.lang.String r0 = "Unsupported ChainSource: "
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r0, r1)
            throw r0
        Ld5:
            java.lang.String r0 = "Unsupported ChainType: "
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r0, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31250DoY.A0G(X.5HW):void");
    }

    private void A0H(C5HW c5hw) {
        String A09 = c5hw.A09(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        String A092 = c5hw.A09("merchant_igid");
        String A093 = c5hw.A09(AbstractC111324zv.A00(2998));
        UserSession userSession = this.A0A;
        C18U.A06(C06090Tz.A05, userSession, 36323509085351224L);
        if (A092 == null) {
            C1XJ.A00.A0p(this.A07.getActivity(), EnumC39651Hig.A0C, EnumC39644HiZ.TAB_FEED, EnumC39650Hif.A06, EnumC39649Hie.A02, userSession, null, AbstractC31171DnF.A0d(this), A09, null, null, null, false);
            return;
        }
        HashMap hashMap = null;
        if (A093 != null) {
            try {
                JSONArray jSONArray = new JSONArray(A093);
                HashMap A1G = AbstractC166987dD.A1G();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    A1G.put(jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject.getString("reference_price"));
                }
                hashMap = A1G;
            } catch (JSONException unused) {
            }
        }
        C1XJ.A00.A0m(this.A07.getActivity(), EnumC39651Hig.A0C, EnumC39644HiZ.TAB_FEED, EnumC39650Hif.A06, EnumC39649Hie.A02, userSession, null, A092, null, AbstractC31171DnF.A0d(this), A09, null, null, null, null, null, null, null, null, null, hashMap, false);
    }

    private void A0I(C5HW c5hw) {
        String A09 = c5hw.A09("media_list");
        String A092 = c5hw.A09(AbstractC111324zv.A00(806));
        String A093 = c5hw.A09("module");
        String A094 = c5hw.A09("open_in_direct");
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_ids", A09);
        A0b.putString(AbstractC111324zv.A00(4888), A092);
        A0b.putString("module_name", A093);
        A0b.putBoolean("open_in_direct", Boolean.parseBoolean(A094));
        AbstractC53883NsF.A00(A0b, this.A05, this.A0A);
    }

    private void A0J(C5HW c5hw) {
        String A09 = c5hw.A09("media_id");
        String A092 = c5hw.A09("permission_id");
        if (!TextUtils.isEmpty(A09)) {
            Bundle A0D = AbstractC31177DnL.A0D("media_id", A09, "permission_id", A092);
            A0D.putBoolean(AbstractC111324zv.A00(524), false);
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = this.A0A;
            FragmentActivity fragmentActivity = this.A05;
            c1xj.A0i(A0D, fragmentActivity, userSession, EnumC39540HdC.A02, null, null, fragmentActivity.getString(2131969835), A09, null, null, null);
        }
    }

    private void A0K(C5HW c5hw) {
        String A09 = c5hw.A09("merchant_id");
        String A092 = c5hw.A09("merchant_name");
        String A093 = c5hw.A09("collection_id");
        if (A093 == null) {
            C0w9.A03("DefaultNewsfeedRowDelegate", "Null product collection ID");
            return;
        }
        String A094 = c5hw.A09(DialogModule.KEY_TITLE);
        INF A0J = C1XJ.A00.A0J(this.A07.getActivity(), this.A0A, EnumC39622HeW.A0I, null, this.A0B.getModuleName());
        A0J.A08 = A09;
        A0J.A09 = A092;
        A0J.A01(AbstractC40733I3n.A00(c5hw.A09("collection_type")), A093);
        A0J.A0D = A094;
        A0J.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0164, code lost:
    
        if (A0R(r14) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0144, code lost:
    
        if ("story_viewer_list".equalsIgnoreCase(r7.A00) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13.A0A, 36318221981521968L) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0269, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13.A0A, 36318221981521968L) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0L(X.C5HW r14) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31250DoY.A0L(X.5HW):void");
    }

    private void A0N(C5HW c5hw, boolean z) {
        String A0B;
        String A0B2;
        if (!z) {
            A0B = c5hw.A09("merchant_id");
            A0B2 = c5hw.A09("merchant_username");
        } else {
            A0B = c5hw.A0B("merchant_id");
            A0B2 = c5hw.A0B("merchant_username");
        }
        C1XJ.A00.A16(this.A07.requireActivity(), this.A0A, false, null, this.A0B.getModuleName(), null, null, A0B, A0B2, null, null, null, null, false, false, false);
    }

    private void A0O(C31368DqX c31368DqX) {
        FragmentActivity fragmentActivity = this.A05;
        UserSession userSession = this.A0A;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0E(AbstractC31364DqT.A01(userSession, c31368DqX));
        A0P.A0G = true;
        A0P.A04();
    }

    private void A0P(String str, String str2) {
        HashMap A01;
        if (str2 != null) {
            try {
                A01 = FTf.A01(this.A0A, str2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            A01 = null;
        }
        FragmentActivity fragmentActivity = this.A05;
        C6WQ c6wq = new C6WQ(fragmentActivity);
        AbstractC31176DnK.A13(fragmentActivity, c6wq);
        C0fJ.A00(c6wq);
        AbstractC59962oe abstractC59962oe = this.A07;
        AbstractC192798gL A04 = C192108fB.A04(this.A0A, str, A01);
        C32394EOv.A00(A04, this, c6wq, 5);
        abstractC59962oe.schedule(A04);
    }

    public final void A0S(MUD mud, C5HW c5hw, int i) {
        String str;
        User A04;
        String str2;
        List list;
        List unmodifiableList;
        FRG frg;
        String str3;
        List list2;
        List unmodifiableList2;
        C34711FQw c34711FQw;
        List list3;
        List unmodifiableList3;
        C34711FQw c34711FQw2;
        UserSession userSession = this.A0A;
        JTE A01 = MUK.A01(userSession);
        String str4 = c5hw.A04.A0s;
        if (str4 == null || !A01.A01.contains(str4)) {
            String str5 = userSession.userId;
            InterfaceC11380iw interfaceC11380iw = this.A08;
            GZI gzi = this.A0M;
            A01.A0H(mud, interfaceC11380iw, c5hw, str5, gzi.AbS(), gzi.BdC(), i);
            if (c5hw.A05 == C5Hd.GROUPED_FRIEND_REQUEST) {
                C54432ex c54432ex = new C54432ex(EnumC54222eY.A0f, AbstractC167017dG.A0K(c5hw.A04.A05));
                C54392et A0b = AbstractC31173DnH.A0b(userSession);
                EnumC58162lY enumC58162lY = EnumC58162lY.A04;
                EnumC58122lU enumC58122lU = EnumC58122lU.A04;
                A0b.A02(enumC58122lU, enumC58162lY, c54432ex);
                C54412ev A0c = AbstractC31174DnI.A0c(userSession);
                EnumC58162lY enumC58162lY2 = EnumC58162lY.A0C;
                C14360o3.A0B(enumC58162lY2, 0);
                A0c.A02(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex);
            }
            if (c5hw.A05 == C5Hd.FOLLOW_REQUEST && (A04 = c5hw.A04()) != null) {
                BIM.A02(interfaceC11380iw, userSession, A04.getId(), i);
            }
            BJ5 bj5 = this.A0R;
            if (C14360o3.A0K(c5hw.A0C, "remind_me_about_this_ad")) {
                String A07 = c5hw.A07();
                Long A0n = AbstractC25233BEq.A0n(c5hw.A09(AbstractC43591JPw.A00(457)));
                if (A07 != null && A0n != null) {
                    ((C27966CUm) bj5.A02.getValue()).A01("notification_impression", A07, A0n.longValue());
                }
            }
            C31343Dq8 c31343Dq8 = this.A0T;
            String A08 = c5hw.A08();
            if (A08 != null) {
                String A072 = c5hw.A07();
                String A09 = c5hw.A09("media_id");
                String A092 = c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A072 == null) {
                    if (A09 == null) {
                        A072 = A092;
                        if (A092 == null) {
                            A072 = null;
                        }
                    } else {
                        A072 = A09;
                    }
                }
                C121695fL c121695fL = c5hw.A04.A0I;
                if (c121695fL != null) {
                    str = c121695fL.A0J;
                } else {
                    str = null;
                }
                String A093 = c5hw.A09("ad_id");
                String A094 = c5hw.A09("ad_tracking_token");
                C146076i5 c146076i5 = c31343Dq8.A00;
                Long l = null;
                Long A0k = AbstractC003100w.A0k(10, A08);
                if (str != null) {
                    l = AbstractC003100w.A0k(10, str);
                }
                C146076i5.A03(c146076i5, A0k, l, A072, "upcoming_event_reminder_notification_impression", "activity_feed", A093, A094);
            }
            if ("shopping_bag".equals(c5hw.A06())) {
                C06090Tz c06090Tz = C06090Tz.A06;
                if (!C18U.A06(c06090Tz, userSession, 36323509085351224L)) {
                    if (C18U.A06(c06090Tz, userSession, 36323509085285687L)) {
                        C1XJ.A00.A1G(this.A07, userSession, c5hw.A09("merchant_igid"));
                    } else if (C18U.A06(C06090Tz.A05, userSession, 36323509084892465L)) {
                        C34523FJj c34523FJj = new C34523FJj(userSession);
                        AbstractC59962oe abstractC59962oe = this.A07;
                        C14360o3.A0B(abstractC59962oe, 1);
                        String A095 = c5hw.A09("merchant_igid");
                        if (A095 != null && A095.length() != 0) {
                            synchronized (c34523FJj.A01) {
                                C14120nc.A00().ATO(new C32665EZp(C62862tP.A02(abstractC59962oe, AbstractC31171DnF.A0D("CartPrefetch"), c34523FJj.A00, null), c34523FJj, A095));
                            }
                        }
                    }
                }
            }
        }
        if (!this.A04 && c5hw.A0H()) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            AbstractC167007dF.A1L(A00, A00.A3I, C23031Ai.A8c, 243, true);
            this.A04 = true;
        }
        if (AbstractC31249DoX.A00(c5hw)) {
            C14360o3.A0B(userSession, 1);
            C19280xC A002 = C19280xC.A00(AbstractC31171DnF.A0D(AbstractC111324zv.A00(60)), AbstractC111324zv.A00(1964));
            C14360o3.A0A(A002);
            A002.A0C("actor_igid", userSession.userId);
            A002.A0B("tip_id", Long.valueOf(AbstractC25232BEp.A0t(c5hw.A04.A0S)));
            A002.A0B("channel_id", Long.valueOf(AbstractC25232BEp.A0t(c5hw.A04.A0R)));
            AbstractC31173DnH.A1S(A002, userSession);
        }
        if (EnumC31336Dq1.A11 == c5hw.A03()) {
            AbstractC31265Don.A00();
            C14360o3.A0B(userSession, 0);
            InterfaceC09390do interfaceC09390do = AbstractC31266Doo.A00(userSession).A02;
            if (((FF9) interfaceC09390do.getValue()).A00.getLong("notification_receive_time_ms", 0L) == 0) {
                FF9 ff9 = (FF9) interfaceC09390do.getValue();
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = ff9.A00.ARD();
                ARD.E7G("notification_receive_time_ms", currentTimeMillis);
                ARD.apply();
            }
        }
        C35023Fbw c35023Fbw = c5hw.A01;
        if (c35023Fbw != null && (str2 = c35023Fbw.A02) != null && (list = c35023Fbw.A04) != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (frg = (FRG) AbstractC001800i.A0J(unmodifiableList)) != null && (str3 = frg.A01) != null && frg.A03 != null && (list2 = frg.A05) != null && (unmodifiableList2 = Collections.unmodifiableList(list2)) != null && (c34711FQw = (C34711FQw) AbstractC001800i.A0O(unmodifiableList2, 0)) != null && c34711FQw.A00 != null && c34711FQw.A01 != null && (list3 = frg.A05) != null && (unmodifiableList3 = Collections.unmodifiableList(list3)) != null && (c34711FQw2 = (C34711FQw) AbstractC001800i.A0O(unmodifiableList3, 1)) != null && c34711FQw2.A00 != null && c34711FQw2.A01 != null) {
            String str6 = c35023Fbw.A00;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            String str8 = c35023Fbw.A03;
            if (str8 != null) {
                str7 = str8;
            }
            java.util.Set set = this.A0F;
            if (!set.contains(str2)) {
                set.add(str2);
                String valueOf = String.valueOf(c5hw.A00);
                String str9 = c5hw.A09;
                AbstractC167007dF.A1G(userSession, 0, str9);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_notification_inline_survey_impression");
                if (A0f.isSampled()) {
                    A0f.AAP("extra_data_token", str6);
                    A0f.AAP("n_pk", str9);
                    A0f.AAP("channel", "activity_feed");
                    C14360o3.A0B(str2, 0);
                    A0f.A9K("qp_id", Long.valueOf(AbstractC31178DnM.A03(AbstractC003100w.A0k(10, str2))));
                    A0f.AAP("question_id", str3);
                    A0f.AAP("notification_type", valueOf);
                    A0f.A9K("tessa_survey_config_id", AbstractC003100w.A0k(10, str7));
                    A0f.Cht();
                }
            }
        }
        if (c5hw.A07 == C05F.A01 && "new_stories".equals(c5hw.A0D)) {
            C107264sX A003 = AbstractC107254sW.A00(userSession);
            AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new C9D0(A003, c5hw, (InterfaceC23621Ds) null, 48), A003.A04);
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void A7A(MUD mud, C5HW c5hw, User user, int i) {
        String A00;
        String A002;
        this.A0N.A00();
        FragmentActivity fragmentActivity = this.A05;
        C6WQ c6wq = new C6WQ(fragmentActivity);
        AbstractC31176DnK.A13(fragmentActivity, c6wq);
        HashMap A1G = AbstractC166987dD.A1G();
        C34698FQj c34698FQj = this.A0U;
        UserSession userSession = this.A0A;
        Integer num = C05F.A00;
        if (c34698FQj.A01(userSession, user, num)) {
            c34698FQj.A00(this.A07.requireContext(), userSession, user, num, "");
            return;
        }
        String BxT = user.A03.BxT();
        String A003 = MSV.A00(560);
        if (BxT != null) {
            C0fJ.A00(c6wq);
            A1G.put(A003, user.getId());
            A1G.put("connected_user_id", user.A03.BxT());
            A1G.put("position", String.valueOf(i));
            this.A0E.put(user.getId(), c5hw);
            A00 = MSV.A00(1066);
        } else {
            Boolean Cac = user.A03.Cac();
            A00 = MSV.A00(1041);
            if (Cac != null && user.A03.Cac().booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36319497585434077L)) {
                C0fJ.A00(c6wq);
                A002 = "SCAMS";
            } else if (user.A03.CaZ() != null && user.A03.CaZ().Caa().Cez() && C18U.A06(C06090Tz.A05, userSession, 36319720923733620L)) {
                C0fJ.A00(c6wq);
                A002 = AbstractC111324zv.A00(1653);
            } else {
                if (user.A1b()) {
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    BitSet A0j = AbstractC31171DnF.A0j(2);
                    A1I.put("ig_user_id", user.getId());
                    A0j.set(0);
                    A1I.put(AbstractC43591JPw.A00(164), user.getUsername());
                    A0j.set(1);
                    if (A0j.nextClearBit(0) >= 2) {
                        C16920sk c16920sk = C16920sk.A00;
                        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                        C63719SsZ c63719SsZ = new C63719SsZ(MSV.A00(1042), null, null, AbstractC06930Yk.A0B(A1I), c16920sk, 719983200, 0L, true);
                        AnonymousClass637 A004 = VRA.A00(userSession, false);
                        WTZ wtz = new WTZ(null, false, null, null, 1.0f, false, false, false, true);
                        C14360o3.A0B(A004, 1);
                        c63719SsZ.E2V(fragmentActivity, wtz, A004);
                        return;
                    }
                    throw AbstractC31172DnG.A0v();
                }
                user.A16(false);
                AbstractC129875tr.A00(userSession).A0B(fragmentActivity, user.getId(), new GRS(user, 5));
                A0C(this, new C51693MsO(mud, EnumC33370Ep3.A08, C05F.A0C, i), c5hw);
                return;
            }
            A1G.put("harm_type", A002);
            A1G.put(A003, user.getId());
            A1G.put("position", String.valueOf(i));
            this.A0E.put(user.getId(), c5hw);
        }
        AbstractC59962oe abstractC59962oe = this.A07;
        AbstractC192798gL A04 = C192108fB.A04(userSession, A00, A1G);
        C32394EOv.A00(A04, this, c6wq, 6);
        abstractC59962oe.schedule(A04);
    }

    @Override // X.GZ9
    public final void D3r(Hashtag hashtag) {
        this.A0N.A00();
        C5HW c5hw = (C5HW) this.A0X.get(hashtag.getId());
        Number A0W = AbstractC31171DnF.A0W(hashtag.getId(), this.A0W);
        if (c5hw != null && A0W != null) {
            A0C(this, new C51693MsO(null, EnumC33370Ep3.A08, C05F.A00, A0W.intValue()), c5hw);
        }
        this.A0K.A05(this.A0A, this.A0J, hashtag, "newsfeed_follow_button");
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        Integer num;
        this.A0N.A00();
        C5HW c5hw = (C5HW) AbstractC31174DnI.A0r(user, this.A0X);
        Number number = (Number) AbstractC31174DnI.A0r(user, this.A0W);
        if (c5hw != null && number != null) {
            int intValue = number.intValue();
            EnumC33370Ep3 enumC33370Ep3 = EnumC33370Ep3.A08;
            if (user.CQf()) {
                num = C05F.A0Y;
            } else {
                F9G f9g = F9G.$redex_init_class;
                int ordinal = followStatus.ordinal();
                if (ordinal != 4) {
                    if (ordinal != 3) {
                        if (ordinal != 5) {
                            num = null;
                        } else {
                            num = C05F.A0N;
                        }
                    } else {
                        num = C05F.A00;
                    }
                } else {
                    num = C05F.A01;
                }
            }
            A0C(this, new C51693MsO(null, enumC33370Ep3, num, intValue), c5hw);
        }
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
        C5HW c5hw = (C5HW) AbstractC31174DnI.A0r(user, this.A0X);
        Number number = (Number) AbstractC31174DnI.A0r(user, this.A0W);
        if (c5hw != null && number != null) {
            A0C(this, new C51693MsO(null, EnumC33370Ep3.A07, null, number.intValue()), c5hw);
        }
    }

    @Override // X.GZ9
    public final void D4c(Hashtag hashtag) {
        C5HW c5hw = (C5HW) this.A0X.get(hashtag.getId());
        Number A0W = AbstractC31171DnF.A0W(hashtag.getId(), this.A0W);
        if (c5hw != null && A0W != null) {
            A0C(this, new C51693MsO(null, EnumC33370Ep3.A08, C05F.A01, A0W.intValue()), c5hw);
        }
        this.A0K.A06(this.A0A, this.A0J, hashtag, "newsfeed_follow_button");
    }

    @Override // X.InterfaceC58311Pt3
    public final void D6D(C51693MsO c51693MsO, C5HW c5hw, int i) {
        A05(c5hw.A00);
        String A07 = c5hw.A07();
        String str = c5hw.A04.A06;
        str.getClass();
        A0Q(A07, str, null, true, false, true, false);
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void D7o(C51693MsO c51693MsO, C5HW c5hw, int i) {
        UserSession userSession = this.A0A;
        MUK.A02(userSession).A00 = true;
        FragmentActivity fragmentActivity = this.A05;
        SimpleWebViewActivity.A00(fragmentActivity, userSession, new SimpleWebViewConfig((String) null, (String) null, false, false, true, false, false, true, true, false, true, false, false, false, fragmentActivity.getString(2131956844), AbstractC63260SgI.A02(fragmentActivity, C1HO.A03(c5hw.A04.A0U))));
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void D9j(MUD mud, C5HW c5hw, int i, boolean z) {
        NewsfeedFragment newsfeedFragment;
        final User A04;
        this.A0N.A00();
        final C31338Dq3 c31338Dq3 = this.A0O;
        if (C31338Dq3.A05(c31338Dq3) && (A04 = c5hw.A04()) != null) {
            final FragmentActivity requireActivity = c31338Dq3.A00.requireActivity();
            final GRW grw = new GRW(i, 0, mud, c31338Dq3, c5hw);
            final GRW grw2 = new GRW(i, 1, requireActivity, c31338Dq3, c5hw);
            Runnable runnable = new Runnable() { // from class: X.GQo
                @Override // java.lang.Runnable
                public final void run() {
                    C31338Dq3 c31338Dq32 = c31338Dq3;
                    FragmentActivity fragmentActivity = requireActivity;
                    User user = A04;
                    AbstractC129875tr.A00(c31338Dq32.A03).A0A(fragmentActivity, user.getId(), c31338Dq32.A01.getModuleName(), grw, grw2);
                }
            };
            if (!z) {
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC25226BEj.A1N(requireActivity, A0K, 2131968508);
                AbstractC31178DnM.A0o(requireActivity, A0K);
                A0K.A0A = new C36521G8t(i, 1, runnable, c31338Dq3, c5hw);
                A0K.A0L = true;
                A0K.A06();
                A0K.A02 = 0;
                AbstractC31178DnM.A1N(c41451vu, A0K);
            }
            C31338Dq3.A0B.postDelayed(runnable, C31338Dq3.A0A);
            c31338Dq3.A06.EFq(c5hw, true);
        }
        A0C(this, new C51693MsO(mud, EnumC33370Ep3.A08, C05F.A0j, i), c5hw);
        C31339Dq4 c31339Dq4 = this.A0P;
        if (c31339Dq4 != null) {
            Fragment requireParentFragment = c31339Dq4.A00.requireParentFragment();
            if ((requireParentFragment instanceof NewsfeedFragment) && (newsfeedFragment = (NewsfeedFragment) requireParentFragment) != null) {
                AbstractC55352ga abstractC55352ga = (AbstractC55352ga) newsfeedFragment.A08.getValue();
                java.util.Set singleton = Collections.singleton(Trigger.A0d);
                C14360o3.A07(singleton);
                abstractC55352ga.AVr(singleton);
            }
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void DHy(C51693MsO c51693MsO, C5HW c5hw, int i) {
        A05(c5hw.A00);
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A05, this.A0A);
        String A07 = c5hw.A07();
        ENP enp = new ENP();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_id", A07);
        AbstractC31176DnK.A1A(A0b, enp, A0P);
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DJs(C51693MsO c51693MsO, C5HW c5hw, int i) {
        FragmentActivity fragmentActivity = this.A05;
        UserSession userSession = this.A0A;
        AbstractC31179DnN.A1L(AbstractC25225BEi.A0r(fragmentActivity, userSession), userSession, AbstractC31171DnF.A0d(this));
        A0C(this, c51693MsO, c5hw);
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A0f, AbstractC167017dG.A0K(c5hw.A04.A05));
        C54392et A0b = AbstractC31173DnH.A0b(userSession);
        EnumC58162lY enumC58162lY = EnumC58162lY.A04;
        EnumC58122lU enumC58122lU = EnumC58122lU.A04;
        A0b.A01(enumC58122lU, enumC58162lY, c54432ex);
        C54412ev A0c = AbstractC31174DnI.A0c(userSession);
        EnumC58162lY enumC58162lY2 = EnumC58162lY.A0C;
        C14360o3.A0B(enumC58162lY2, 0);
        A0c.A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex, false);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A09, "follow_request_entrypoint_tapped");
        AbstractC31171DnF.A1I(A0f, AbstractC31171DnF.A0d(this));
        A0f.Cht();
    }

    @Override // X.InterfaceC58311Pt3
    public final void DMB(C51693MsO c51693MsO, C5HW c5hw, int i) {
        EnumC31336Dq1 enumC31336Dq1 = (EnumC31336Dq1) c5hw.A04.A12.getValue();
        if (enumC31336Dq1 != null) {
            F9G f9g = F9G.$redex_init_class;
            int ordinal = enumC31336Dq1.ordinal();
            if (ordinal != 198) {
                if (ordinal != 52) {
                    if (ordinal != 18) {
                        if (ordinal != 19) {
                            if (ordinal == 138) {
                                C5HX c5hx = c5hw.A04;
                                AbstractC31364DqT.A03().A01(this.A05, this.A0A, null, new User(c5hx.A0f, c5hx.A0h), null);
                            }
                        } else {
                            String A0A = c5hw.A0A("bloks_app_id");
                            String A0A2 = c5hw.A0A("params");
                            if (!TextUtils.isEmpty(A0A)) {
                                A0P(A0A, A0A2);
                            }
                        }
                    } else {
                        C5HX c5hx2 = c5hw.A04;
                        if (c5hx2.A0e != null) {
                            AbstractC70160WDy.A03(this.A0A, this.A05, c5hx2.A0k);
                        } else {
                            C0w9.A03("bloks_newsfeed_error", "Missing destination data");
                        }
                    }
                } else {
                    String A0A3 = c5hw.A0A("collection_id");
                    if (A0A3 != null) {
                        FB6.A00().A03(this.A07.requireActivity(), this.A0B, this.A0A, A0A3);
                    }
                }
            } else {
                String A0A4 = c5hw.A0A("url");
                if (!TextUtils.isEmpty(A0A4)) {
                    AbstractC41776Ies.A09(this.A05, this.A0A, C2Fb.A08, A0A4, AbstractC31171DnF.A0d(this));
                }
            }
            A0C(this, c51693MsO, c5hw);
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void DOw(C5HW c5hw, int i, boolean z) {
        C1ON A01;
        c5hw.A04.A0b.getClass();
        this.A0N.A00();
        UserSession userSession = this.A0A;
        String str = c5hw.A04.A0b;
        String A0d = AbstractC31171DnF.A0d(this);
        if (z) {
            A01 = AbstractC55152OdF.A02(userSession, null, str, A0d, -1, -1, false, false);
        } else {
            A01 = AbstractC55152OdF.A01(userSession, null, str, A0d, -1, -1, false, false);
        }
        C31456Ds0.A00(A01, this, c5hw, 33);
        this.A07.schedule(A01);
        A0C(this, new C51693MsO(null, EnumC33370Ep3.A06, null, i), c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DPM(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        A05(c5hw.A00);
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A05, this.A0A);
        AbstractC31412DrH.A00();
        Bundle A0C = AbstractC31177DnL.A0C(str);
        A0C.putString("LikesListFragment.BROADCAST_ID", str);
        A0C.putBoolean("LikesListFragment.TIME_ORDERED", true);
        AbstractC31176DnK.A1A(A0C, new ENZ(), A0P);
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DQC(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        C454227b c454227b = AbstractC454327d.A00;
        if (c454227b != null) {
            c454227b.A04(this.A07.getActivity(), str, str);
            A0C(this, c51693MsO, c5hw);
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void DRQ(C51693MsO c51693MsO, C5HW c5hw, int i) {
        String str;
        String A06 = c5hw.A06();
        if (A0T(c5hw)) {
            C31342Dq7 c31342Dq7 = this.A0L;
            if (F9P.A00(c31342Dq7.A02)) {
                EnumC31336Dq1 A03 = c5hw.A03();
                if (A03 != null) {
                    str = A03.A00;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, "featured_product_media")) {
                    C31342Dq7.A04(c31342Dq7, c5hw);
                    C31342Dq7.A03(c31342Dq7, c51693MsO, c5hw);
                    return;
                } else if (C14360o3.A0K(str, "profile_tagged_posts")) {
                    C31342Dq7.A02(c31342Dq7);
                    return;
                } else if (C14360o3.A0K(str, "pending_tagged_posts")) {
                    C31342Dq7.A01(c31342Dq7);
                    return;
                }
            }
            A05(c5hw.A00);
            A0C(this, c51693MsO, c5hw);
            if (A06 == null) {
                return;
            }
            switch (A06.hashCode()) {
                case -2058699197:
                    if (!A06.equals("featured_product_media")) {
                        return;
                    }
                    A0J(c5hw);
                    return;
                case -1610081298:
                    if (!A06.equals("product_collection")) {
                        return;
                    }
                    A0K(c5hw);
                    return;
                case -1577211727:
                    if (!A06.equals("shopping_bag")) {
                        return;
                    }
                    A0H(c5hw);
                    return;
                case -1511625256:
                    if (!A06.equals("live_camera")) {
                        return;
                    }
                    A08(null, "on_click_activity_feed_row");
                    return;
                case -1120828100:
                    if (!A06.equals("product_display_page")) {
                        return;
                    }
                    String A0B = c5hw.A0B("business_user_id");
                    String A0B2 = c5hw.A0B("product_id");
                    String A0B3 = c5hw.A0B("business_username");
                    String A0B4 = c5hw.A0B(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    AbstractC31180DnO.A1U(A0B, A0B2, A0B3);
                    if (A0B4 == null) {
                        A0B4 = "activity_feed";
                    }
                    String A09 = c5hw.A09("reference_price");
                    String A092 = c5hw.A09("pinned_media_id");
                    String A093 = c5hw.A09("featured_product_permission_id");
                    boolean equals = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(c5hw.A09("cpdp_disabled"));
                    C42130Ile A0K = C1XJ.A00.A0K(this.A07.getActivity(), ProductReviewStatus.A04, this.A0A, this.A0B, A0B2, A0B, A0B3, A0B4, null);
                    A0K.A0R = A09;
                    A0K.A0L = A092;
                    A0K.A0J = A093;
                    A0K.A0W = equals;
                    C42130Ile.A01(A0K);
                    return;
                case 862879669:
                    if (!A06.equals("your_shopping_items")) {
                        return;
                    }
                    A0N(c5hw, true);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void DRz(C5HW c5hw, int i, int i2) {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A0A("media_id", ((C206409Bx) c5hw.A04.A0x.get(i)).A01);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i3 = 0; i3 < c5hw.A04.A0x.size(); i3++) {
            A1E.add(((C206409Bx) c5hw.A04.A0x.get(i3)).A01);
        }
        FragmentActivity fragmentActivity = this.A05;
        String A0a = AbstractC31177DnL.A0a(fragmentActivity, A1E.size(), 2131969866);
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, this.A0A);
        String str = ((C206409Bx) c5hw.A04.A0x.get(i)).A01;
        AbstractC167007dF.A1D(str, 0, A0a);
        Bundle A05 = AbstractC31179DnN.A05(str, A0a, A1E, false);
        A05.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", null);
        A05.putString("ContextualFeedFragment.ARGUMENT_MODULE_NAME", "feed_contextual_newsfeed_multi_media_liked");
        A05.putString("ContextualFeedFragment.ARGUMENT_NEXT_MAX_ID", null);
        A05.putString("ContextualFeedFragment.ARGUMENT_GROUP_ID", null);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_WARM_START", false);
        A05.putString("ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE", null);
        A05.putParcelable("ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG", null);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", false);
        A05.putString("ContextualFeedFragment.ARGUMENT_PAGINATION_SOURCE", null);
        A05.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", null);
        A05.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", null);
        A05.putString("ContextualFeedFragment.ARGUMENT_SESSION_ID", null);
        A05.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", c11520jB);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", false);
        A05.putString("ContextualFeedFragment.ARGUMENT_RESHARE_TARGET", null);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", false);
        A05.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", 0);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_EXPLORE_ATTRIBUTION_VISIBLE", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", true);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", true);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_IS_FROM_NOTIFICATION", false);
        A05.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", false);
        AbstractC31176DnK.A1A(A05, new ContextualFeedFragment(), A0P);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DSh(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        A0O(AbstractC31402Dr6.A02(this.A0A, str, "newsfeed_mention", AbstractC31171DnF.A0d(this)));
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void Day(C5HW c5hw, String str) {
        InterfaceC11380iw interfaceC11380iw;
        String str2;
        String str3;
        String str4;
        String str5;
        UserSession userSession = this.A0A;
        User A00 = FW5.A00(userSession, c5hw);
        C5HX c5hx = c5hw.A04;
        String str6 = c5hx.A0b;
        String str7 = c5hx.A0c;
        Double A05 = c5hw.A05();
        if (str6 != null && str7 != null && A05 != null && c5hw.A07() != null) {
            if (A00 == null) {
                interfaceC11380iw = this.A08;
                str5 = c5hw.A04.A0b;
                str2 = "open_thread_error";
                str3 = "";
                str4 = "Activity Feed - Comment owner should not be null.";
            } else {
                C38321qM A02 = C1DW.A00(userSession).A02(c5hw.A07());
                if (A02 == null) {
                    ETV etv = new ETV(this, A00, A05, str, str7, str6, 0);
                    AbstractC59962oe abstractC59962oe = this.A07;
                    C1ON A04 = AbstractC2044893h.A04(userSession, c5hw.A07());
                    A04.A00 = etv;
                    abstractC59962oe.schedule(A04);
                    return;
                }
                if (str.equals("notification_message_button")) {
                    A09(A02, this, A00, str7, str6);
                    return;
                } else {
                    C5HX c5hx2 = c5hw.A04;
                    A0A(A02, this, A00, str, c5hx2.A0b, c5hx2.A0c, c5hw.A05().longValue());
                    return;
                }
            }
        } else {
            interfaceC11380iw = this.A08;
            str2 = "open_thread_error";
            str3 = "";
            str4 = "Activity Feed - Comment data should not be null.";
            str5 = "";
        }
        C162337Ov.A0S(interfaceC11380iw, userSession, str2, str3, str5, str4);
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dbb(RectF rectF, C51693MsO c51693MsO, C5HW c5hw, int i) {
        String str;
        String A02;
        MUD mud = c51693MsO.A01;
        Object value = c5hw.A04.A1B.getValue();
        if (value != null && EnumC31336Dq1.A0o.equals(value) && (A02 = A02(c5hw)) != null) {
            DRM(new C51693MsO(mud, EnumC33370Ep3.A0C, null, i), c5hw, A02, i);
            return;
        }
        C5HX c5hx = c5hw.A04;
        if (!AbstractC81033jX.A03(c5hx.A0G)) {
            F9G f9g = F9G.$redex_init_class;
            C5Hd c5Hd = c5hw.A05;
            switch (c5Hd.ordinal()) {
                case 0:
                    A0M(c5hw, AbstractC166987dD.A1A(AbstractC43591JPw.A00(204), (Map) c5hx.A1C.getValue()));
                    A0C(this, c51693MsO, c5hw);
                    return;
                case 2:
                    if (c5hw.A03() == EnumC31336Dq1.A3C) {
                        Dxs(c51693MsO, c5hw, i);
                        return;
                    } else {
                        DHy(c51693MsO, c5hw, i);
                        return;
                    }
                case 3:
                case 16:
                    if (TextUtils.isEmpty(c5hx.A0f)) {
                        return;
                    }
                    str = c5hw.A04.A0f;
                    break;
                case 10:
                    D6G(c51693MsO, c5hw, i);
                    return;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    EnumC31336Dq1 A03 = c5hw.A03();
                    if (A03 != null && "live_likers".equalsIgnoreCase(A03.A00) && !TextUtils.isEmpty(c5hw.A09(TraceFieldType.BroadcastId))) {
                        DPM(c51693MsO, c5hw, c5hw.A09(TraceFieldType.BroadcastId), i);
                        return;
                    } else {
                        Ddu(rectF, c51693MsO, c5hw, i);
                        return;
                    }
                default:
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Unsupported item story type: ");
                    A1C.append(c5Hd);
                    A1C.append(" Story: ");
                    A1C.append(c5hw.A00);
                    throw AbstractC166987dD.A12(A1C.toString());
            }
        } else {
            if (TextUtils.isEmpty(c5hx.A0f)) {
                return;
            }
            str = c5hw.A04.A0f;
            c51693MsO = new C51693MsO(mud, EnumC33370Ep3.A0C, null, i);
        }
        Dxj(c51693MsO, c5hw, str, i);
    }

    @Override // X.InterfaceC58311Pt3
    public final void Ddu(RectF rectF, C51693MsO c51693MsO, C5HW c5hw, int i) {
        this.A00 = rectF;
        EnumC31336Dq1 A03 = c5hw.A03();
        if (A03 != null && "live_likers".equalsIgnoreCase(A03.A00) && !TextUtils.isEmpty(c5hw.A09(TraceFieldType.BroadcastId))) {
            DPM(c51693MsO, c5hw, c5hw.A09(TraceFieldType.BroadcastId), i);
        } else {
            A0L(c5hw);
            A0C(this, c51693MsO, c5hw);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC58311Pt3
    public final boolean Dho(MUD mud, C5HW c5hw, int i) {
        MUK.A01(this.A0A).A0F(mud, this.A08, c5hw, this.A0M.AbS(), i);
        C31338Dq3 c31338Dq3 = this.A0O;
        C5HX c5hx = c5hw.A04;
        List list = c5hx.A0t;
        if (list == null) {
            list = c31338Dq3.A08;
        }
        ?? r4 = c5hx.A0v;
        if (r4 == 0) {
            r4 = AbstractC166987dD.A1E();
            for (int i2 = 0; i2 < list.size(); i2++) {
                String A1I = AbstractC25226BEj.A1I(list, i2);
                if (!TextUtils.isEmpty(A1I)) {
                    C9CK c9ck = new C9CK(3);
                    C14360o3.A0B(A1I, 0);
                    c9ck.A02 = A1I;
                    r4.add(c9ck);
                }
            }
        }
        Fragment fragment = c31338Dq3.A00;
        if (fragment.getContext() != null && !r4.isEmpty()) {
            Context context = fragment.getContext();
            C50674MYs c50674MYs = new C50674MYs(context, c31338Dq3.A03);
            for (int i3 = 0; i3 < r4.size(); i3++) {
                C9CK c9ck2 = (C9CK) r4.get(i3);
                C31345DqA c31345DqA = c31338Dq3.A07;
                int i4 = c5hw.A00;
                String str = c9ck2.A02;
                C14360o3.A0B(str, 1);
                if (!c31345DqA.A00.contains(AnonymousClass001.A0H(str, ':', i4))) {
                    C31338Dq3.A01(context, c9ck2, mud, c50674MYs, c31338Dq3, c5hw, i);
                }
            }
            if (c31338Dq3.A09) {
                C31338Dq3.A01(context, new C9CK("debug_copy", "[employee only] Copy Raw JSON"), mud, c50674MYs, c31338Dq3, c5hw, i);
            }
            if (!c50674MYs.A09.isEmpty()) {
                C31338Dq3.A04(c31338Dq3, c5hw, "newsfeed_story_inline_impression", i);
                C31727DwY.A01(context, c50674MYs);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dxj(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        String str2;
        String A09;
        C31342Dq7 c31342Dq7 = this.A0L;
        C14360o3.A0B(str, 0);
        UserSession userSession = c31342Dq7.A02;
        if (F9P.A00(userSession)) {
            int i2 = c5hw.A00;
            if (i2 != 386 && i2 != 388) {
                if (i2 == 583) {
                    FragmentActivity fragmentActivity = c31342Dq7.A00;
                    String str3 = c5hw.A04.A0Z;
                    if (str3 == null) {
                        str3 = null;
                    }
                    AbstractC35253Fgm.A04(fragmentActivity, userSession, "bc_inbox", str3, false);
                }
            } else {
                C31368DqX.A02(AbstractC25225BEi.A0r(c31342Dq7.A00, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(userSession, str, "branded_content_ad_sponsor", c31342Dq7.A01.getModuleName()));
            }
            C31342Dq7.A03(c31342Dq7, c51693MsO, c5hw);
            return;
        }
        A05(c5hw.A00);
        C31368DqX A01 = AbstractC31402Dr6.A01(this.A0A, str, "feed_story_header", AbstractC31171DnF.A0d(this));
        String A08 = c5hw.A08();
        if (A08 != null) {
            Long A0d = AbstractC167007dF.A0d();
            A01.A0P = A08;
            A01.A0Q = "";
            A01.A07 = A0d;
            A01.A06 = null;
        }
        A01.A0f = Boolean.parseBoolean(c5hw.A09("open_create_flow"));
        String str4 = c5hw.A04.A0k;
        if (str4 != null && str4.contains("fan_club") && (A09 = c5hw.A09("params")) != null) {
            try {
                str2 = new JSONObject(A09).getString("origin");
            } catch (JSONException unused) {
                AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A05(c5hw.A00, "params parameter in newsfeed story was not a valid json object. Story type: ", ", params: ", A09), 1062876315);
            }
            A01.A0C = str2;
            A0O(A01);
            A0C(this, c51693MsO, c5hw);
        }
        str2 = null;
        A01.A0C = str2;
        A0O(A01);
        A0C(this, c51693MsO, c5hw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r8.A09("chaining_auto_expand").equals("True") == false) goto L6;
     */
    @Override // X.InterfaceC58311Pt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dxs(X.C51693MsO r7, X.C5HW r8, int r9) {
        /*
            r6 = this;
            java.lang.String r1 = "chaining_auto_expand"
            java.lang.String r0 = r8.A09(r1)
            if (r0 == 0) goto L15
            java.lang.String r1 = r8.A09(r1)
            java.lang.String r0 = "True"
            boolean r0 = r1.equals(r0)
            r5 = 1
            if (r0 != 0) goto L16
        L15:
            r5 = 0
        L16:
            androidx.fragment.app.FragmentActivity r0 = r6.A05
            com.instagram.common.session.UserSession r4 = r6.A0A
            X.6Yy r3 = X.AbstractC31173DnH.A0P(r0, r4)
            X.1XQ r2 = X.AbstractC31412DrH.A01()
            java.lang.String r0 = "category"
            java.lang.String r1 = r8.A09(r0)
            java.lang.String r0 = "order"
            java.lang.String r0 = r8.A09(r0)
            X.DtK r0 = r2.CsO(r4, r1, r0, r5)
            r3.A0E(r0)
            r0 = 1
            r3.A0G = r0
            r3.A04()
            A0C(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31250DoY.Dxs(X.MsO, X.5HW, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r6.A09("chaining_auto_expand").equals("True") == false) goto L6;
     */
    @Override // X.InterfaceC58311Pt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DyJ(X.C51693MsO r5, X.C5HW r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            java.lang.String r1 = "chaining_auto_expand"
            java.lang.String r0 = r6.A09(r1)
            if (r0 == 0) goto L15
            java.lang.String r1 = r6.A09(r1)
            java.lang.String r0 = "True"
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L16
        L15:
            r3 = 0
        L16:
            int r0 = r6.A00
            r4.A05(r0)
            com.instagram.common.session.UserSession r2 = r4.A0A
            java.lang.String r1 = X.AbstractC31171DnF.A0d(r4)
            java.lang.String r0 = "feed_story_header"
            X.DqX r0 = X.AbstractC31402Dr6.A02(r2, r7, r0, r1)
            r0.A0T = r3
            r4.A0O(r0)
            A0C(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31250DoY.DyJ(X.MsO, X.5HW, java.lang.String, int):void");
    }

    @Override // X.InterfaceC58311Pt3
    public final void EYY(C5HW c5hw, String str, int i) {
        this.A0X.put(str, c5hw);
        AbstractC166997dE.A1U(str, this.A0W, i);
    }

    public static String A02(C5HW c5hw) {
        String A07 = c5hw.A07();
        if (A07 == null) {
            String A09 = c5hw.A09("media_id");
            if (A09 == null) {
                return c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }
            return A09;
        }
        return A07;
    }

    public static String A03(C5HW c5hw, String str) {
        String A09 = c5hw.A09(str);
        if (A09 == null) {
            return "";
        }
        return A09;
    }

    private void A08(C55U c55u, String str) {
        InterfaceC53892dT A01 = A01();
        if (A01 != null) {
            CameraConfiguration cameraConfiguration = null;
            if (c55u != null) {
                cameraConfiguration = C82R.A00(c55u, new C81W[0]);
            }
            A01.FBp(new PositionConfig(null, cameraConfiguration, null, str, null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
        }
    }

    private void A0M(C5HW c5hw, String str) {
        if (c5hw.A07() != null) {
            A05(c5hw.A00);
            FragmentActivity fragmentActivity = this.A05;
            UserSession userSession = this.A0A;
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            C1XQ A01 = AbstractC31412DrH.A01();
            String A07 = c5hw.A07();
            boolean A1a = AbstractC167017dG.A1a(userSession, A07);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("LikesListFragment.MEDIA_ID", A07);
            A0b.putBoolean("LikesListFragment.TIME_ORDERED", A1a);
            A0b.putString("FollowListFragment.RequestParametersSelectedFilters", str);
            A0P.A0E(((C1XP) A01).CsT(A0b, userSession));
            A0P.A04();
        }
    }

    private void A0Q(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass548.A00().A00().A01(this.A05, EnumC120785dO.NOTIFICATIONS, this.A0A, this.A0B, str, str2, str3, z, z2, false, z3, z4, false);
    }

    public static boolean A0R(C5HW c5hw) {
        EnumC31336Dq1 A03 = c5hw.A03();
        if (A03 != null && "story_fullscreen".equalsIgnoreCase(c5hw.A06()) && "story_viewer_list".equalsIgnoreCase(A03.A00) && !TextUtils.isEmpty(c5hw.A0B("reel_id")) && !TextUtils.isEmpty(c5hw.A0B("feeditem_id"))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58311Pt3
    public final void Czm(C51693MsO c51693MsO, C5HW c5hw, String str, String str2, int i) {
        A0P(str, str2);
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void D25(C5HW c5hw, int i) {
        c5hw.A0E();
        C140966Yy A00 = A00(this);
        IgFragmentFactoryImpl.A00();
        String str = c5hw.A04.A0a;
        C67882V0n c67882V0n = new C67882V0n();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(295), str);
        A0b.putBoolean(AbstractC111324zv.A00(294), false);
        A0b.putBoolean(AbstractC111324zv.A00(601), true);
        AbstractC31176DnK.A1A(A0b, c67882V0n, A00);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DK8(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        A0B(AbstractC1120253r.A00(str));
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DOz(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        A0M(c5hw, str);
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DfT(C51693MsO c51693MsO, C5HW c5hw, int i) {
        c5hw.A07().getClass();
        AnonymousClass548.A00().A00();
        UserSession userSession = this.A0A;
        InterfaceC60442pS interfaceC60442pS = this.A0B;
        String A07 = c5hw.A07();
        AbstractC167027dH.A12(userSession, interfaceC60442pS, A07);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString(AbstractC111324zv.A00(609), interfaceC60442pS.getModuleName());
        A05.putBoolean(AbstractC111324zv.A00(606), interfaceC60442pS.isOrganicEligible());
        A05.putBoolean(AbstractC111324zv.A00(607), interfaceC60442pS.isSponsoredEligible());
        A05.putString("CommentThreadFragment.MEDIA_ID", A07);
        A05.putString(AbstractC111324zv.A00(605), "activity_feed");
        A05.putBoolean("intent_extra_show_inapp_notification_on_post", true);
        String str = c5hw.A09;
        C14360o3.A0B(str, 0);
        A05.putString("intent_extra_newsfeed_story_pk", str);
        C32955Eem A00 = InterfaceC38901rP.A00.A00();
        C5HX c5hx = c5hw.A04;
        A00.A0r = c5hx.A0b;
        A00.A0t = c5hx.A0c;
        C84923qg c84923qg = new C84923qg(A00.A00());
        C5HX c5hx2 = c5hw.A04;
        User user = new User(c5hx2.A0f, c5hx2.A0h);
        user.A0i(c5hw.A04.A0E);
        c84923qg.A08 = user;
        boolean equals = Boolean.TRUE.equals(c5hw.A04.A0N);
        A05.putString("intent_extra_replied_to_comment_id", c84923qg.A0G);
        A05.putString("intent_extra_replied_to_comment_text", c84923qg.A0e);
        User user2 = c84923qg.A08;
        if (user2 != null) {
            A05.putString("intent_extra_replied_to_comment_user_id", user2.getId());
            A05.putString("intent_extra_replied_to_comment_username", user2.getUsername());
            A05.putString("intent_extra_replied_to_comment_user_image", AbstractC25228BEl.A19(user2));
            A05.putBoolean("intent_extra_replied_to_comment_eligible_for_vcr", equals);
        }
        C3DN A0r = AbstractC31172DnG.A0r(this.A05);
        EMb eMb = new EMb();
        eMb.setArguments(A05);
        A0r.A0J(eMb);
        A0C(this, c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void DI3(Hashtag hashtag, C5HW c5hw, int i) {
        A0B(hashtag);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0e75, code lost:
    
        if (r3.equalsIgnoreCase("true") == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x15d5, code lost:
    
        if (r0 == false) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x2282, code lost:
    
        if (r7.equals("comments_v2") == false) goto L879;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0069. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:513:0x1139 A[Catch: all -> 0x242b, TryCatch #10 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0039, B:9:0x003d, B:11:0x004c, B:12:0x0050, B:15:0x005c, B:16:0x0069, B:17:0x006c, B:19:0x0076, B:21:0x007c, B:22:0x007e, B:24:0x0084, B:26:0x008d, B:27:0x00b0, B:29:0x00b8, B:31:0x00c8, B:33:0x00d5, B:34:0x00d7, B:35:0x23d7, B:36:0x00e8, B:37:0x00eb, B:39:0x00f3, B:42:0x00fc, B:43:0x0102, B:45:0x010e, B:47:0x0112, B:48:0x23e4, B:49:0x23e8, B:51:0x0118, B:53:0x0120, B:54:0x0126, B:56:0x0130, B:58:0x0136, B:60:0x0146, B:62:0x0152, B:63:0x23e9, B:64:0x23ed, B:65:0x016d, B:67:0x0175, B:68:0x0199, B:70:0x01a1, B:71:0x01b1, B:73:0x01b9, B:77:0x01c5, B:78:0x01d6, B:80:0x01e0, B:82:0x01e6, B:84:0x01f8, B:88:0x0203, B:90:0x022c, B:92:0x0234, B:93:0x0239, B:95:0x0241, B:96:0x0246, B:98:0x024e, B:99:0x0253, B:101:0x025b, B:102:0x0266, B:104:0x026e, B:105:0x0275, B:107:0x027d, B:108:0x0288, B:110:0x0290, B:111:0x029b, B:113:0x02a3, B:114:0x02b4, B:116:0x02c0, B:119:0x02cd, B:120:0x02ed, B:122:0x02f7, B:123:0x0310, B:125:0x0318, B:127:0x0320, B:128:0x0333, B:129:0x0340, B:130:0x0349, B:132:0x0351, B:133:0x036e, B:135:0x0376, B:136:0x038d, B:138:0x0395, B:140:0x039b, B:141:0x03b5, B:143:0x03c9, B:145:0x03cf, B:147:0x0456, B:148:0x0477, B:150:0x03df, B:152:0x03e7, B:155:0x03f0, B:158:0x03f9, B:159:0x0415, B:162:0x041f, B:164:0x042e, B:166:0x047c, B:168:0x0484, B:170:0x048a, B:172:0x0494, B:173:0x04ab, B:176:0x04dd, B:177:0x04f9, B:179:0x0501, B:181:0x0507, B:182:0x050d, B:183:0x0524, B:185:0x052c, B:186:0x0533, B:188:0x053b, B:190:0x0543, B:191:0x23ee, B:192:0x23f2, B:193:0x0548, B:195:0x0550, B:197:0x0556, B:198:0x055c, B:201:0x00a9, B:204:0x0580, B:206:0x0588, B:207:0x0597, B:209:0x059d, B:210:0x05a8, B:211:0x05bd, B:212:0x05d2, B:213:0x0643, B:215:0x064e, B:216:0x0657, B:218:0x065f, B:224:0x0664, B:226:0x066e, B:227:0x0677, B:229:0x067f, B:235:0x0684, B:237:0x06ca, B:238:0x06cc, B:239:0x06d1, B:242:0x06e0, B:243:0x06ed, B:245:0x06fa, B:246:0x0735, B:247:0x070b, B:249:0x0722, B:250:0x073c, B:252:0x0742, B:253:0x0749, B:254:0x0752, B:256:0x0758, B:257:0x0765, B:259:0x076b, B:260:0x0778, B:262:0x0784, B:264:0x078a, B:265:0x07a3, B:267:0x07b1, B:268:0x23d4, B:269:0x07c5, B:270:0x23d1, B:271:0x07f0, B:272:0x07f5, B:273:0x0802, B:274:0x0807, B:276:0x080f, B:277:0x19b4, B:278:0x0859, B:281:0x0863, B:283:0x086f, B:284:0x087e, B:287:0x088a, B:288:0x08a4, B:289:0x08d8, B:290:0x08e1, B:291:0x08f4, B:292:0x091f, B:294:0x092f, B:296:0x0937, B:298:0x0943, B:299:0x0949, B:300:0x0960, B:302:0x098c, B:304:0x0994, B:310:0x09c7, B:312:0x09cd, B:317:0x09d8, B:319:0x09eb, B:320:0x09f3, B:321:0x0a60, B:322:0x0a07, B:324:0x0a17, B:325:0x0a1b, B:327:0x0a39, B:328:0x0a41, B:329:0x0956, B:330:0x0a6a, B:331:0x0a82, B:332:0x0a9a, B:333:0x0aad, B:334:0x0ac3, B:335:0x0ad9, B:336:0x0aef, B:337:0x0b02, B:339:0x0b1e, B:341:0x0b22, B:342:0x0b24, B:344:0x0b29, B:345:0x0b2f, B:346:0x0b3d, B:347:0x0b68, B:348:0x0b73, B:350:0x0b7b, B:352:0x0b90, B:521:0x241b, B:370:0x0bb8, B:373:0x0bd7, B:374:0x1dee, B:375:0x0c03, B:376:0x0c08, B:378:0x0c0e, B:379:0x0c13, B:380:0x0c27, B:381:0x0c36, B:382:0x0c45, B:383:0x2092, B:384:0x0c62, B:385:0x0c83, B:387:0x0c91, B:389:0x0c99, B:390:0x0ca2, B:392:0x0caa, B:393:0x0cbc, B:394:0x0cc7, B:395:0x0cd2, B:396:0x0cdb, B:399:0x0ce7, B:401:0x0cf5, B:402:0x0cfc, B:404:0x0d09, B:405:0x0d12, B:407:0x0d32, B:409:0x0d3e, B:410:0x0d4c, B:411:0x0fa5, B:413:0x0d66, B:414:0x0d6f, B:415:0x0d93, B:418:0x0da7, B:419:0x22e7, B:420:0x0dd9, B:421:0x0de8, B:423:0x0df2, B:426:0x0dfd, B:428:0x0e01, B:429:0x0e13, B:430:0x0e18, B:431:0x0e50, B:433:0x0e60, B:434:0x0e66, B:436:0x0e6e, B:438:0x0e78, B:440:0x0e96, B:442:0x0ea4, B:443:0x0eaa, B:448:0x0ec0, B:449:0x0ebb, B:450:0x0ec4, B:452:0x0ecc, B:453:0x0ed4, B:456:0x0ede, B:459:0x0ee8, B:461:0x0f17, B:463:0x0f2c, B:464:0x0f31, B:467:0x0f20, B:470:0x0eb3, B:471:0x0f3a, B:473:0x0f48, B:475:0x0f50, B:477:0x0f5c, B:478:0x0f75, B:480:0x0f7b, B:481:0x0faa, B:483:0x0fcb, B:484:0x0fcf, B:486:0x0fd0, B:487:0x0fe2, B:489:0x0fe6, B:491:0x0fec, B:492:0x100b, B:497:0x102b, B:498:0x1063, B:500:0x106f, B:501:0x107a, B:523:0x10b1, B:525:0x10b7, B:526:0x10c4, B:528:0x10ca, B:517:0x10d9, B:505:0x10dd, B:508:0x1106, B:510:0x110c, B:511:0x1112, B:513:0x1139, B:514:0x1140, B:520:0x240a, B:532:0x1145, B:533:0x114a, B:535:0x1150, B:536:0x1157, B:538:0x115f, B:539:0x1173, B:540:0x1178, B:541:0x117d, B:542:0x1182, B:544:0x118a, B:546:0x1190, B:547:0x1197, B:548:0x119c, B:549:0x11aa, B:550:0x11b1, B:552:0x11b9, B:556:0x11d7, B:557:0x11db, B:558:0x11e0, B:561:0x11ee, B:562:0x1205, B:565:0x120f, B:568:0x121d, B:569:0x1231, B:571:0x1240, B:573:0x1246, B:574:0x1261, B:576:0x1269, B:577:0x1276, B:579:0x127c, B:582:0x128c, B:583:0x1291, B:586:0x12a2, B:589:0x12b3, B:590:0x12b8, B:594:0x12ca, B:595:0x12fd, B:596:0x12dc, B:599:0x12f2, B:600:0x130a, B:602:0x131a, B:603:0x1320, B:604:0x132c, B:605:0x1333, B:607:0x134d, B:609:0x1353, B:612:0x135b, B:613:0x1388, B:615:0x13aa, B:617:0x13b0, B:619:0x13c5, B:622:0x13e7, B:623:0x13b7, B:625:0x13bd, B:626:0x13cd, B:627:0x13ec, B:628:0x13fd, B:630:0x141c, B:631:0x1424, B:632:0x1442, B:634:0x1462, B:636:0x146c, B:637:0x147f, B:638:0x149b, B:640:0x14b2, B:641:0x14b4, B:643:0x14be, B:644:0x14c0, B:646:0x14cd, B:647:0x14cf, B:648:0x14e2, B:650:0x14e8, B:652:0x14f8, B:654:0x14fe, B:656:0x1506, B:657:0x151b, B:660:0x1543, B:662:0x154b, B:663:0x1553, B:664:0x155c, B:665:0x157b, B:667:0x158a, B:670:0x159a, B:672:0x15a4, B:673:0x15a6, B:680:0x15c5, B:682:0x15d8, B:684:0x15ca, B:685:0x15d0, B:686:0x15b8, B:687:0x1600, B:688:0x1611, B:690:0x1620, B:692:0x1632, B:694:0x1638, B:696:0x1655, B:697:0x166c, B:698:0x1679, B:699:0x1680, B:700:0x1687, B:701:0x1694, B:702:0x16a1, B:703:0x16a8, B:705:0x16bc, B:706:0x16e5, B:707:0x16f6, B:708:0x1706, B:709:0x1730, B:710:0x1842, B:711:0x173e, B:713:0x174f, B:714:0x2421, B:715:0x2425, B:716:0x1756, B:718:0x175a, B:719:0x1761, B:720:0x1768, B:722:0x1770, B:726:0x1790, B:727:0x1798, B:730:0x17a2, B:731:0x241e, B:732:0x17e2, B:733:0x17f0, B:734:0x1802, B:735:0x1818, B:736:0x1828, B:737:0x1836, B:738:0x1847, B:740:0x1869, B:742:0x186f, B:744:0x187f, B:746:0x1895, B:748:0x189d, B:750:0x18a3, B:751:0x18a7, B:752:0x18ac, B:753:0x18c0, B:754:0x18cd, B:755:0x1904, B:757:0x1917, B:758:0x1919, B:760:0x192d, B:762:0x1936, B:764:0x193e, B:765:0x1943, B:767:0x1954, B:769:0x195c, B:770:0x1969, B:771:0x197c, B:772:0x1995, B:773:0x19b8, B:775:0x1a4a, B:777:0x1a50, B:779:0x1a56, B:780:0x1ab4, B:781:0x1ac5, B:783:0x1acd, B:784:0x1b89, B:785:0x1add, B:786:0x1af3, B:788:0x1b05, B:789:0x1b0a, B:790:0x1b37, B:791:0x1b53, B:792:0x1b6b, B:793:0x1b8e, B:795:0x1b94, B:796:0x1b99, B:797:0x1baa, B:799:0x1bd1, B:800:0x1c30, B:801:0x1c5b, B:802:0x1ca3, B:803:0x1cc4, B:805:0x1cdb, B:806:0x1cdd, B:807:0x1ce4, B:809:0x1cee, B:811:0x1cf4, B:814:0x1d08, B:815:0x1d13, B:817:0x1d21, B:818:0x1d32, B:820:0x1d5e, B:821:0x1d63, B:822:0x1d73, B:823:0x1d81, B:828:0x1da1, B:829:0x1df3, B:830:0x1dfe, B:832:0x1e06, B:833:0x1e13, B:836:0x1e3f, B:837:0x1e4c, B:838:0x1e77, B:839:0x1e8b, B:840:0x1e9f, B:841:0x1ebf, B:843:0x1f17, B:845:0x1f3b, B:846:0x1f3f, B:849:0x1f4e, B:851:0x1f59, B:852:0x2426, B:853:0x242a, B:854:0x1f78, B:856:0x1f7e, B:858:0x1f86, B:859:0x1f9f, B:860:0x1fb3, B:862:0x1fbb, B:863:0x1fd5, B:865:0x1fe7, B:867:0x1ffb, B:870:0x201e, B:872:0x2026, B:873:0x2003, B:875:0x200b, B:877:0x2013, B:878:0x202b, B:880:0x2039, B:881:0x2042, B:882:0x2069, B:884:0x2073, B:885:0x2075, B:886:0x2082, B:887:0x2097, B:888:0x20ae, B:890:0x20b4, B:892:0x20c0, B:894:0x20d8, B:895:0x20da, B:897:0x20de, B:899:0x20e9, B:901:0x20ef, B:903:0x2108, B:905:0x210e, B:907:0x211a, B:909:0x2122, B:911:0x2128, B:913:0x2134, B:915:0x213a, B:916:0x2147, B:918:0x214b, B:919:0x2157, B:921:0x215d, B:923:0x216e, B:925:0x2167, B:926:0x219a, B:927:0x21b7, B:928:0x21d3, B:929:0x21e9, B:930:0x21fd, B:931:0x2219, B:932:0x2228, B:933:0x2255, B:935:0x227b, B:937:0x2285, B:942:0x2291, B:944:0x22af, B:945:0x22b5, B:947:0x22c3, B:948:0x22eb, B:949:0x2301, B:952:0x2311, B:953:0x231a, B:955:0x2324, B:957:0x2337, B:958:0x2350, B:959:0x2361, B:961:0x2369, B:962:0x23f3, B:963:0x23fd), top: B:3:0x0003, inners: #0, #4, #5, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x10d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v360, types: [java.lang.Object, X.Evy] */
    /* JADX WARN: Type inference failed for: r0v371, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r3v38, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.achievements.IgAchievementsUrlHandlerActivity] */
    @Override // X.InterfaceC58311Pt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void Dhk(X.C51693MsO r39, X.C5HW r40, int r41) {
        /*
            Method dump skipped, instructions count: 9682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31250DoY.Dhk(X.MsO, X.5HW, int):void");
    }
}
