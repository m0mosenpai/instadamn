package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GAJ implements InterfaceC58311Pt3 {
    public RectF A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AbstractC10360h2 A03;
    public final AbstractC60672pq A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final InterfaceC58311Pt3 A08;
    public final C28421Zd A09;

    @Override // X.InterfaceC58311Pt3
    public final void A7A(MUD mud, C5HW c5hw, User user, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void Czm(C51693MsO c51693MsO, C5HW c5hw, String str, String str2, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void D25(C5HW c5hw, int i) {
    }

    @Override // X.GZ9
    public final void D3r(Hashtag hashtag) {
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void D4J(Reel reel, C3Ow c3Ow) {
    }

    @Override // X.GZ9
    public final void D4c(Hashtag hashtag) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void D6D(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void D6G(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void D7o(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void D9j(MUD mud, C5HW c5hw, int i, boolean z) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DAO(C51693MsO c51693MsO, C5HW c5hw, int i, boolean z) {
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
    public final void DHy(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DI3(Hashtag hashtag, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DJs(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DK8(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DMB(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DOw(C5HW c5hw, int i, boolean z) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DOz(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DPM(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DQC(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DRz(C5HW c5hw, int i, int i2) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DSh(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void Day(C5HW c5hw, String str) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void Ddu(RectF rectF, C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DfT(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dhk(C51693MsO c51693MsO, C5HW c5hw, int i) {
        String str;
        String str2;
        C140966Yy A0P;
        boolean z;
        Object obj;
        List A0m;
        HashMap A02;
        String str3;
        Object obj2;
        List A0m2;
        UserSession userSession;
        C72743Nv A01;
        FragmentActivity fragmentActivity;
        UserSession userSession2;
        C14360o3.A0B(c5hw, 0);
        EnumC31336Dq1 A03 = c5hw.A03();
        if (A03 != null) {
            str = A03.A00;
        } else {
            str = null;
        }
        String A07 = c5hw.A07();
        if (str != null) {
            boolean z2 = false;
            if (AbstractC002300n.A0h(str, "igtv_insights", false)) {
                String A09 = c5hw.A09("media_id");
                UserSession userSession3 = this.A06;
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1r, userSession3);
                c116875Qr.A1D = A09;
                c116875Qr.A1S = true;
                c116875Qr.A1n = true;
                AbstractC86593tX.A0Y(this.A02, c116875Qr.A00(), userSession3);
            } else if (AbstractC002300n.A0h(str, "product_eligibility", false)) {
                UserMonetizationProductType A00 = AbstractC104314mu.A00(c5hw.A09("product"));
                if (A00.ordinal() == 0) {
                    userSession2 = this.A06;
                    if (C18U.A06(C06090Tz.A05, userSession2, 36327563534023356L)) {
                        fragmentActivity = this.A02;
                    }
                } else {
                    fragmentActivity = this.A02;
                    userSession2 = this.A06;
                }
                C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession2);
                A0r.A0B(null, AbstractC34823FVz.A00().A00(A00, userSession2, null, false));
                A0r.A04();
            } else {
                if (AbstractC002300n.A0h(str, "branded_content_ad_access_permission", false)) {
                    FragmentActivity fragmentActivity2 = this.A02;
                    UserSession userSession4 = this.A06;
                    String str4 = c5hw.A04.A0Z;
                    if (str4 == null) {
                        str4 = null;
                    }
                    AbstractC35253Fgm.A04(fragmentActivity2, userSession4, "bc_inbox", str4, false);
                    return;
                }
                if (AbstractC002300n.A0h(str, "ad_partner_promotion", false)) {
                    FragmentActivity fragmentActivity3 = this.A02;
                    UserSession userSession5 = this.A06;
                    if (A07 != null) {
                        AbstractC35253Fgm.A03(fragmentActivity3, userSession5, A07, c5hw.A00);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                if (AbstractC002300n.A0h(str, "branded_content_ad", false)) {
                    AbstractC35253Fgm.A04(this.A02, this.A06, "bc_inbox", null, false);
                    return;
                }
                if (str.equals("profile_shop")) {
                    C5HX c5hx = c5hw.A04;
                    String str5 = c5hx.A0f;
                    if (str5 == null) {
                        str5 = AbstractC166987dD.A1A("merchant_id", (Map) c5hx.A1E.getValue());
                    }
                    if (str5 != null) {
                        C1XJ c1xj = C1XJ.A00;
                        FragmentActivity fragmentActivity4 = this.A02;
                        UserSession userSession6 = this.A06;
                        InterfaceC60442pS interfaceC60442pS = this.A07;
                        String A092 = c5hw.A09("merchant_username");
                        if (A092 != null) {
                            c1xj.A0N(fragmentActivity4, AbstractC223416o.A00(c5hw.A09("seller_shoppable_feed_type")), userSession6, interfaceC60442pS, null, null, "branded_content_notification", str5, A092).A05();
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    if (str.equals("branded_content_settings_approval")) {
                        UserSession userSession7 = this.A06;
                        AbstractC31175DnJ.A1N(AbstractC31176DnK.A0L(this.A05, userSession7), "ig_branded_content_tag_approval_request_notification_tapped");
                        A0P = FT2.A00(this.A02, userSession7);
                        N8I n8i = new N8I();
                        AbstractC25233BEq.A15(n8i, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "bc_inbox");
                        A0P.A0B(null, n8i);
                    } else if (str.equals("request_brand_approval_screen")) {
                        A0P = FT2.A00(this.A02, this.A06);
                        A0P.A0B(null, new N8H());
                    } else if (str.equals("branded_content_pending_approval")) {
                        C5HX c5hx2 = c5hw.A04;
                        String str6 = c5hx2.A0h;
                        String str7 = c5hx2.A0f;
                        if (str6 != null && str7 != null && A07 != null) {
                            A0P = FT2.A00(this.A02, this.A06);
                            A0P.A0B(null, AbstractC55149OdC.A02(str6, str7, A07, "bc_inbox_push_notification"));
                        }
                    } else if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
                        String A093 = c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (A093 != null) {
                            String A094 = c5hw.A09("entry_trigger");
                            String A095 = c5hw.A09(MSV.A00(188));
                            if (A095 == null || Integer.parseInt(A095) == 1) {
                                z2 = true;
                            }
                            UserSession userSession8 = this.A06;
                            if (A094 == null) {
                                A094 = "feed_story_header";
                            }
                            C31368DqX A012 = AbstractC31402Dr6.A01(userSession8, A093, A094, this.A05.getModuleName());
                            String A096 = c5hw.A09("merchant_id");
                            String A097 = c5hw.A09("merchant_username");
                            A012.A0J = A096;
                            A012.A0K = A097;
                            A012.A0W = z2;
                            A0P = AbstractC31173DnH.A0P(this.A02, userSession8);
                            A0P.A0B(null, C31368DqX.A00(userSession8, this.A09.A01, A012));
                        }
                    } else if (str.equals("featured_product_media")) {
                        A04(c5hw);
                    } else if (str.equals("profile_tagged_posts")) {
                        A01();
                    } else if (str.equals("pending_tagged_posts")) {
                        A00();
                    } else if (str.equals("igtv_ads_creator_onboarding")) {
                        A02(UserMonetizationProductType.A0D, c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), null);
                    } else if (str.equals("reels_overlay_ads_onboarding")) {
                        A02(UserMonetizationProductType.A0G, null, null);
                    } else if (str.equals("user_pay_creator_onboarding")) {
                        A02(UserMonetizationProductType.A0J, c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), null);
                    } else if (str.equals("user_pay_badges_incentives_onboarding")) {
                        A02(UserMonetizationProductType.A05, c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), null);
                    } else if (str.equals("incentive_platform_management")) {
                        A02(UserMonetizationProductType.A0E, c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), c5hw.A09("program"));
                    } else if (str.equals("resume_payout_onboarding")) {
                        String A098 = c5hw.A09("product");
                        String A099 = c5hw.A09("origin");
                        if (A099 == null) {
                            A099 = "MONETIZATION_INBOX";
                        }
                        FW0.A01(null, this.A02, AbstractC104314mu.A00(A098), this.A06, this.A05.getModuleName(), A099, c5hw.A09("created_deal_id"), c5hw.A09("fe_id"), null);
                    } else if (str.equals("incentive_platform_progress_tracking")) {
                        String A0910 = c5hw.A09("fbid_of_incentive");
                        FragmentActivity fragmentActivity5 = this.A02;
                        UserSession userSession9 = this.A06;
                        A0P = AbstractC31173DnH.A0P(fragmentActivity5, userSession9);
                        A0P.A0A = "MONETIZATION_INBOX";
                        A0P.A0B(null, AbstractC34897FZj.A00().A02(userSession9, "MONETIZATION_INBOX", A0910));
                    } else if (str.equals("incentive_platform_available_bonus")) {
                        String A0911 = c5hw.A09("deal_template_id");
                        if (A0911 == null) {
                            AbstractC34897FZj.A00();
                            userSession = this.A06;
                            A01 = AbstractC31180DnO.A0G(userSession, "com.instagram.incentive_platform.screens.deal_information", AbstractC167017dG.A0r(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC31178DnM.A0f("MONETIZATION_INBOX")));
                        } else {
                            OX3 A002 = AbstractC34897FZj.A00();
                            userSession = this.A06;
                            A01 = A002.A01(userSession, A0911, "MONETIZATION_INBOX");
                        }
                        A0P = AbstractC31173DnH.A0P(this.A02, userSession);
                        A0P.A0A = "MONETIZATION_INBOX";
                        A0P.A0B(null, A01);
                    } else if (str.equals("incentive_platform_xar_upsell")) {
                        String A0912 = c5hw.A09("fbid_of_incentive");
                        FragmentActivity fragmentActivity6 = this.A02;
                        UserSession userSession10 = this.A06;
                        A0P = AbstractC31173DnH.A0P(fragmentActivity6, userSession10);
                        A0P.A0A = "MONETIZATION_INBOX";
                        A0P.A0B(null, AbstractC34897FZj.A00().A04(fragmentActivity6, this.A05, userSession10, A0912, "MONETIZATION_INBOX"));
                    } else if (str.equals("creator_payout")) {
                        String A0913 = c5hw.A09("financial_entity_id");
                        A0P = AbstractC25225BEi.A0r(this.A02, this.A06);
                        A0P.A0B(null, AbstractC53973Ntk.A00(null, EnumC33407Epe.A06, A0913, null));
                    } else if (str.equals("broadcast")) {
                        String A0914 = c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (A0914 != null) {
                            C3KW.A01(this.A04.requireContext(), this.A06).A08(A0914, c5hw.A09("comment_id"));
                        }
                    } else {
                        boolean equals = str.equals("branded_content_live_insights");
                        String A003 = MSV.A00(11);
                        if (equals) {
                            String A0915 = c5hw.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            if (A0915 == null || (A0m2 = AbstractC167007dF.A0m(A0915, "_", 0)) == null || (obj2 = AbstractC001800i.A0O(A0m2, 0)) == null) {
                                obj2 = "";
                            }
                            A02 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b("origin", "branded_content_brand_notification", AbstractC166987dD.A1L("target_id", obj2)));
                            str3 = AbstractC111324zv.A00(2140);
                        } else if (str.equals("branded_content_brand_tag_request")) {
                            String A0916 = c5hw.A09("media_id");
                            if (A0916 == null) {
                                A0916 = "";
                            }
                            String A0917 = c5hw.A09("suspected_sponsor");
                            if (A0917 == null) {
                                A0917 = "";
                            }
                            A02 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b("suspected_sponsor", A0917, AbstractC166987dD.A1L("media_id", A0916)));
                            str3 = "com.instagram.branded_content.screens.single_media_with_request_view";
                        } else {
                            boolean equals2 = str.equals("branded_content_expired_story_insights");
                            String A004 = AbstractC111324zv.A00(818);
                            if (equals2) {
                                if (A07 == null || (A0m = AbstractC167007dF.A0m(A07, "_", 0)) == null || (obj = AbstractC001800i.A0O(A0m, 0)) == null) {
                                    obj = "";
                                }
                                C66277U6x A013 = C66277U6x.A01(A004, AbstractC06930Yk.A02(AbstractC25229BEm.A1b("origin", "branded_content_brand_notification", AbstractC166987dD.A1L("target_id", obj))));
                                FragmentActivity fragmentActivity7 = this.A02;
                                C14360o3.A0C(fragmentActivity7, A003);
                                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(this.A06);
                                AbstractC31171DnF.A10(this.A01, A0C, 2131974641);
                                A013.A04(fragmentActivity7, A0C);
                            } else if (str.equals("creator_suspected_bc_review")) {
                                A03(c51693MsO, c5hw);
                                EnumC31336Dq1 A032 = c5hw.A03();
                                if (A032 != null) {
                                    if (C14360o3.A0K(A032.A00, "branded_content_review_policies")) {
                                        AbstractC60672pq abstractC60672pq = this.A04;
                                        AbstractC31175DnJ.A1M(abstractC60672pq, new C63397SjR(AbstractC31172DnG.A04(abstractC60672pq), this.A06, C2Fb.A0e, MSV.A00(50), false));
                                    } else {
                                        Bundle A0b = AbstractC166987dD.A0b();
                                        UserSession userSession11 = this.A06;
                                        AbstractC03240Dh.A00(A0b, userSession11);
                                        A0b.putString(MSV.A00(190), c5hw.A07());
                                        A0b.putString(MSV.A00(412), c5hw.A09);
                                        A0b.putString(MSV.A00(414), c5hw.A04.A0s);
                                        String A0918 = c5hw.A09("notif_source");
                                        if (A0918 == null) {
                                            A0918 = "";
                                        }
                                        A0b.putString(MSV.A00(413), A0918);
                                        AbstractC31175DnJ.A0v(A0b, new N6L(), FT2.A00(this.A02, userSession11));
                                    }
                                }
                            } else if (str.equals("user_pay_demonetization")) {
                                String str8 = c5hw.A04.A0o;
                                if (str8 != null) {
                                    z = AbstractC001900j.A0a(str8, "24", false);
                                } else {
                                    z = false;
                                }
                                FragmentActivity fragmentActivity8 = this.A02;
                                UserSession userSession12 = this.A06;
                                A0P = AbstractC25225BEi.A0r(fragmentActivity8, userSession12);
                                A0P.A0B(null, AbstractC34823FVz.A00().A00(UserMonetizationProductType.A0J, userSession12, "not_eligible", z));
                            } else if (str.equals("igtv_content_library")) {
                                AbstractC35212Fg5.A01(this.A02, this.A06);
                            } else if (str.equals("active_promotions")) {
                                FragmentActivity fragmentActivity9 = this.A02;
                                UserSession userSession13 = this.A06;
                                String str9 = c5hw.A04.A0f;
                                if (str9 != null) {
                                    AbstractC35253Fgm.A05(fragmentActivity9, userSession13, "bc_inbox", str9, false);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else if (str.equals("content_appreciation_management")) {
                                String A0919 = c5hw.A09("origin");
                                if (A0919 != null) {
                                    str2 = AbstractC166997dE.A10(Locale.ROOT, A0919);
                                } else {
                                    str2 = "NOTIFICATION";
                                }
                                FragmentActivity fragmentActivity10 = this.A02;
                                UserSession userSession14 = this.A06;
                                A0P = AbstractC31173DnH.A0P(fragmentActivity10, userSession14);
                                A0P.A0B(null, C27S.A00().A02().A00(userSession14, str2, null, null, false));
                                A0P.A0A = str2;
                            } else if (str.equals("subscriptions_story_sticker")) {
                                C66277U6x A014 = C66277U6x.A01(A004, AbstractC06930Yk.A02(AbstractC25229BEm.A1b("origin", "subscriptions_story_sticker", AbstractC166987dD.A1L("target_id", c5hw.A0B("media_id")))));
                                FragmentActivity fragmentActivity11 = this.A02;
                                C14360o3.A0C(fragmentActivity11, A003);
                                IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(this.A06);
                                AbstractC31171DnF.A10(this.A01, A0C2, 2131974641);
                                A014.A04(fragmentActivity11, A0C2);
                            } else {
                                this.A08.Dhk(c51693MsO, c5hw, i);
                            }
                        }
                        C66277U6x A015 = C66277U6x.A01(str3, A02);
                        FragmentActivity fragmentActivity12 = this.A02;
                        C14360o3.A0C(fragmentActivity12, A003);
                        AbstractC31174DnI.A19(fragmentActivity12, A015, this.A06);
                    }
                    A0P.A04();
                }
            }
            A03(c51693MsO, c5hw);
            return;
        }
        if (A07 == null) {
            return;
        }
        DRM(c51693MsO, c5hw, A07, i);
    }

    @Override // X.InterfaceC58311Pt3
    public final boolean Dho(MUD mud, C5HW c5hw, int i) {
        return false;
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dht(C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        UserSession userSession = this.A06;
        JTE A01 = MUK.A01(userSession);
        C14360o3.A07(A01);
        String str = c5hw.A04.A0s;
        if (str == null || !A01.A01.contains(str)) {
            A01.A0H(null, this.A05, c5hw, userSession.userId, null, null, i);
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dxj(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
        C14360o3.A0B(str, 0);
        int i2 = c5hw.A00;
        if (i2 != 386 && i2 != 388) {
            if (i2 != 583) {
                this.A08.Dxj(c51693MsO, c5hw, str, i);
                return;
            }
            FragmentActivity fragmentActivity = this.A02;
            UserSession userSession = this.A06;
            String str2 = c5hw.A04.A0Z;
            if (str2 == null) {
                str2 = null;
            }
            AbstractC35253Fgm.A04(fragmentActivity, userSession, "bc_inbox", str2, false);
        } else {
            FragmentActivity fragmentActivity2 = this.A02;
            UserSession userSession2 = this.A06;
            C31368DqX.A02(AbstractC25225BEi.A0r(fragmentActivity2, userSession2), userSession2, this.A09.A01, AbstractC31402Dr6.A01(userSession2, str, "branded_content_ad_sponsor", this.A05.getModuleName()));
        }
        A03(c51693MsO, c5hw);
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dxs(C51693MsO c51693MsO, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void DyJ(C51693MsO c51693MsO, C5HW c5hw, String str, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void E0u(MUD mud, C5HW c5hw, int i) {
    }

    @Override // X.InterfaceC58311Pt3
    public final void EYY(C5HW c5hw, String str, int i) {
    }

    private final void A00() {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A06;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0D(this.A09.A01.A08(EnumC33341Eoa.A02, C05F.A00, userSession.userId, AbstractC166997dE.A0Y(userSession).getUsername(), true));
        A0r.A04();
    }

    private final void A01() {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A06;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        C28431Ze c28431Ze = this.A09.A01;
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, userSession.userId, "branded_content_activity_notification", this.A05.getModuleName());
        A01.A0O = AbstractC111324zv.A00(262);
        C31368DqX.A02(A0r, userSession, c28431Ze, A01);
    }

    private final void A02(UserMonetizationProductType userMonetizationProductType, String str, String str2) {
        if (userMonetizationProductType == UserMonetizationProductType.A05) {
            C55045OZt c55045OZt = FE6.A00;
            FragmentActivity fragmentActivity = this.A02;
            UserSession userSession = this.A06;
            c55045OZt.A02(null, fragmentActivity, userMonetizationProductType, userSession, IRO.A00(userSession, AbstractC166987dD.A1G()), this.A05.getModuleName(), "MONETIZATION_INBOX", AbstractC166997dE.A0p(this.A01, 2131976470), str, null, "MONETIZATION_INBOX");
            return;
        }
        FragmentActivity fragmentActivity2 = this.A02;
        UserSession userSession2 = this.A06;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity2, userSession2);
        A0P.A0A = "MONETIZATION_INBOX";
        A0P.A0B(null, C55045OZt.A01(userMonetizationProductType, userSession2, "MONETIZATION_INBOX", str, str2));
        A0P.A04();
    }

    private final void A03(C51693MsO c51693MsO, C5HW c5hw) {
        UserSession userSession = this.A06;
        MUK.A01(userSession).A0I(this.A05, c51693MsO, c5hw, userSession.userId, null, null, null, null);
        c5hw.A0E();
        String str = c5hw.A04.A0s;
        if (str != null) {
            String str2 = c5hw.A09;
            C14360o3.A07(str2);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("business/branded_content/news/log/");
            A0c.A9s("action", "click");
            A0c.A9s("pk", str2);
            C1GJ.A03(AbstractC31178DnM.A0K(A0c, "tuuid", str));
        }
    }

    private final void A04(C5HW c5hw) {
        String A09 = c5hw.A09("media_id");
        String A092 = c5hw.A09("permission_id");
        if (A09 != null && A09.length() != 0) {
            Bundle A0D = AbstractC31177DnL.A0D("media_id", A09, "permission_id", A092);
            A0D.putBoolean(AbstractC111324zv.A00(524), false);
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = this.A06;
            FragmentActivity fragmentActivity = this.A02;
            c1xj.A0i(A0D, fragmentActivity, userSession, EnumC39540HdC.A02, null, null, fragmentActivity.getString(2131969835), A09, null, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // X.InterfaceC58311Pt3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DRM(X.C51693MsO r25, X.C5HW r26, java.lang.String r27, int r28) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAJ.DRM(X.MsO, X.5HW, java.lang.String, int):void");
    }

    @Override // X.InterfaceC58311Pt3
    public final void Dbb(RectF rectF, C51693MsO c51693MsO, C5HW c5hw, int i) {
        this.A08.Dbb(rectF, c51693MsO, c5hw, i);
    }

    public /* synthetic */ GAJ(Context context, FragmentActivity fragmentActivity, AbstractC60672pq abstractC60672pq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C28421Zd A03 = AbstractC31364DqT.A03();
        C14360o3.A0B(userSession, 3);
        this.A02 = fragmentActivity;
        this.A04 = abstractC60672pq;
        this.A06 = userSession;
        this.A01 = context;
        this.A05 = interfaceC11380iw;
        this.A07 = interfaceC60442pS;
        this.A09 = A03;
        AbstractC10360h2 parentFragmentManager = abstractC60672pq.getParentFragmentManager();
        this.A03 = parentFragmentManager;
        GAM gam = new GAM();
        int i = C31338Dq3.A0A;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        GAL gal = GAL.A00;
        this.A08 = new C31250DoY(fragmentActivity, parentFragmentManager, abstractC60672pq, interfaceC11380iw, userSession, interfaceC60442pS, null, gal, new C31338Dq3(abstractC60672pq, interfaceC11380iw, A01, userSession, gal, gam), null);
    }

    @Override // X.InterfaceC58311Pt3
    public final void D6B(C51693MsO c51693MsO, C5HW c5hw, int i) {
        String A07 = c5hw.A07();
        if (A07 != null) {
            DRM(c51693MsO, c5hw, A07, i);
        }
    }

    @Override // X.InterfaceC58311Pt3
    public final void DRQ(C51693MsO c51693MsO, C5HW c5hw, int i) {
        String str;
        EnumC31336Dq1 A03 = c5hw.A03();
        if (A03 != null && (str = A03.A00) != null) {
            if (str.equals("featured_product_media")) {
                A04(c5hw);
                A03(c51693MsO, c5hw);
            } else if (str.equals("profile_tagged_posts")) {
                A01();
            } else {
                if (!str.equals("pending_tagged_posts")) {
                    return;
                }
                A00();
            }
        }
    }
}
