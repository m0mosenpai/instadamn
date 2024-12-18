package X;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes11.dex */
public final class WFS {
    public static boolean A00 = true;
    public static InterfaceC02550Ad A01;
    public static C70128W5p A02;
    public static C69440VnP A03;
    public static C68933VeX A04;
    public static W28 A05;
    public static C69280Vko A06;
    public static C19320xG A07;
    public static AbstractC12990ll A08;
    public static C3N6 A09;
    public static boolean A0B;
    public static boolean A0C;
    public static final /* synthetic */ C0YR[] A0J = {new AnonymousClass013(WFS.class, "eventScannerModeEnabled", "getEventScannerModeEnabled()Z", 0), new AnonymousClass013(WFS.class, "secondChannelModeEnabled", "getSecondChannelModeEnabled()Z", 0)};
    public static final WFS A0E = new Object();
    public static final Handler A0D = AbstractC167007dF.A0J();
    public static Integer A0A = C05F.A01;
    public static final InterfaceC09670ek A0I = C70296WQb.A00;
    public static final InterfaceC16530ry A0G = new X6G(true, 0);
    public static final InterfaceC16530ry A0H = new X6G(true, 1);
    public static final Runnable A0F = new RunnableC71203Wps();

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04(Activity activity, InterfaceC02550Ad interfaceC02550Ad, AbstractC12990ll abstractC12990ll, C3N6 c3n6, boolean z) {
        C07X c07x;
        C07T lifecycle;
        C14360o3.A0B(c3n6, 4);
        A0B = z;
        A08 = abstractC12990ll;
        A01 = interfaceC02550Ad;
        A09 = c3n6;
        String A042 = C18U.A04(C06090Tz.A05, abstractC12990ll, 36878616428282053L);
        if (AbstractC001900j.A0T(A042)) {
            A042 = "{\n  \"version\":\"0.0.1\",\n  \"events\": [{\n  \"name\": \"gnv_generic_click\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"like\": \"secondary\",\n    \"unlike\": \"secondary\",\n    \"comment\": \"secondary\",\n    \"save\": \"secondary\",\n    \"unsave\": \"secondary\",\n    \"ad_share\": \"secondary\",\n    \"reshare\": \"secondary\",\n    \"follow\": \"secondary\",\n    \"unfollow\": \"secondary\",\n    \"story_reply\": \"secondary\"\n  },\n  \"two_measurement_categorization\": {\n    \"like\": [\n      {\n        \"content_is_liked\": \"false\",\n        \"clicked_target_description\": \"like_button\"\n      },\n      {\n        \"content_is_liked\": \"false\",\n        \"clicked_target_description\": \"tap_media\",\n        \"tap_index\": \"1\"\n      }\n    ],\n    \"unlike\": [\n      {\n        \"content_is_liked\": \"true\",\n        \"clicked_target_description\": \"like_button\"\n      }\n    ],\n    \"comment\": [\n      {\n        \"clicked_target_description\": \"comment_send_button\"\n      }\n    ],\n    \"save\": [\n      {\n          \"content_is_saved\":\"false\",\n          \"clicked_target_description\":\"save_button\"\n      }\n    ],\n    \"unsave\": [\n      {\n        \"content_is_saved\": \"true\",\n        \"clicked_target_description\": \"save_button\"\n      }\n    ],\n    \"ad_share\": [\n      {\n        \"clicked_target_description\": \"share_button\",\n        \"tracking_models\":\"@REGEX(.*\\\"is_sponsored\\\":true.*)\"\n      }\n    ],\n    \"reshare\": [\n      {\n        \"clicked_target_description\": \"share_button\"\n      }\n    ],\n    \"follow\": [\n      {\n        \"clicked_target_description\": \"follow_button\",\n        \"clicked_target_is_selected\": \"true\"\n      }\n    ],\n    \"unfollow\": [\n      {\n        \"clicked_target_description\": \"follow_button\",\n        \"clicked_target_is_selected\": \"false\"\n      }\n    ],\n    \"story_reply\":[\n      {\n        \"clicked_target_description\": \"reply_send_button\"\n      },  \n      {\n        \"clicked_target_description\": \"story_quick_reaction\"\n      }\n    ]\n  },\n  \"two_measurement_matching\": {\n     \"like\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"save\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"unsave\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"comment\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"ad_share\":{\n      \"m_pk\":\"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"reshare\": {\n      \"m_pk\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"follow\": {\n      \"follow_user_id\": \"content_owner_id\"\n     },\n     \"unfollow\":{\n      \"follow_user_id\": \"content_owner_id\"\n     }\n  },\n  \"validation_rule\": {\n    \"like\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module\":\"@NONNULL\",\n      \"tracking_nodes\":\"@NONNULL\",\n      \"tracking_models\":\"@NONNULL\"\n    },\n    \"unlike\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module\":\"@NONNULL\",\n      \"tracking_nodes\":\"@NONNULL\",\n      \"tracking_models\":\"@NONNULL\"\n    },\n    \"save\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_nodes\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"tap_index\":\"0\"\n    },\n    \"unsave\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"gesture_type\":\"1\",\n        \"tap_index\":\"0\"\n    },\n    \"comment\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"gesture_type\":\"1\",\n        \"tap_index\":\"0\"\n    },\n    \"reshare\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"tap_index\":\"0\"\n    },\n    \"follow\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\"\n    },\n    \"unfollow\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"central_nav_from_gesture\",\n  \"two_measurement_info\": {\n    \"link_click\": \"secondary\"\n  },\n  \"two_measurement_categorization\": {\n  },\n  \"two_measurement_matching\": {},\n  \"validation_rule\": {\n    \"link_click\":\n    { \"after_module\":\"@NONNULL\",\n      \"before_module\":\"@NONNULL\",\n      \"before_tracking_models\":\"@NONNULL\",\n      \"before_tracking_nodes\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_like\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"like\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"like\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"container_module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"link_click_virtual_event\",\n  \"two_measurement_info\": {\n    \"link_click\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"link_click\": {\n      \"tracking\":\"@NONNULL\",\n      \"tracking_nodes\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_unlike\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"unlike\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"unlike\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"container_module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_save\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"save\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"save\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module_name\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_unsave\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"unsave\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"unsave\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module_name\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_comment\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"comment\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"comment\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"container_module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"direct_reshare_send\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"reshare\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"reshare\": {\n      \"module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_follow\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"follow\": \"primary\"\n  },\n  \"validation_rule\": {\n  }\n},\n{\n  \"name\": \"distillery_unfollow\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"unfollow\": \"primary\"\n  },\n  \"validation_rule\": {\n  }\n},\n{\n  \"name\": \"reel_compose_message\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"story_reply\": \"primary\"\n  },\n  \"two_measurement_categorization\": {\n    \"story_reply\": [\n      {\n        \"reel_type\":\"story\"\n      }\n    ]\n  },\n  \"validation_rule\": {\n  }\n},\n{\n  \"name\": \"instagram_ad_direct_reshare_send\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"ad_share\": \"primary\"\n  },\n  \"validation_rule\": {\n  }\n},\n{\n    \"name\":\"instagram_ad_impression\",\n     \"two_measurement_info\": {\n         \"ad_impression\": \"scan\"\n     },\n    \"validation_rule\":{\n      \"ad_impression\":{\n            \"ad_id\":\"@NONNULL\",\n            \"a_pk\":\"@NONNULL\",\n            \"nav_chain\":\"@NONNULL\",\n            \"m_pk\":\"@NONNULL\",\n            \"tracking_token\":\"@NONNULL\"\n      }\n    }\n  },\n{\n    \"name\":\"instagram_organic_impression\",\n     \"two_measurement_info\": {\n         \"organic_imp\": \"scan\"\n     },\n    \"validation_rule\":{\n      \"organic_imp\":{\n            \"ad_id\":\"\",\n            \"a_pk\":\"@NONNULL\",\n            \"nav_chain\":\"@NONNULL\",\n            \"m_pk\":\"@NONNULL\",\n            \"tracking_token\":\"@NONNULL\"\n      }\n    }\n }\n]}";
        }
        C70128W5p c70128W5p = new C70128W5p(A042);
        A02 = c70128W5p;
        if (A06 == null) {
            A06 = new C69280Vko(this, c70128W5p);
        }
        if (A05 == null) {
            A05 = new W28(c70128W5p);
        }
        if (A04 == null) {
            A04 = new C68933VeX(c70128W5p);
        }
        if (A03 == null) {
            A03 = new C69440VnP(this);
        }
        if (A08 != null) {
            A00 = !C18U.A06(r3, r2, 36315666474733038L);
            A07 = C19320xG.A00();
            JsonObject A032 = AbstractC100754fe.A03((JsonElement) AbstractC73763Sg.A03.A00("{ \"http_event_name_signature\": \n  { \"https://i.instagram.com/api/v1/media/\\\\w+/like/\": \"distillery_like\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/unlike/\": \"distillery_unlike\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/comment/\": \"distillery_comment\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/save/\": \"distillery_save\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/unsave/\": \"distillery_unsave\",\n    \"api/v1/friendships/create/\\\\d+\": \"distillery_follow\", \n    \"api/v1/friendships/destroy/\\\\d+\": \"distillery_unfollow\" \n    }, \n    \"http_event_url_fields\": { \n      \"distillery_like\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_unlike\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_comment\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_save\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_unsave\": { \"media_id\": \"\\\\d+_\\\\d+\" },\n      \"distillery_follow\": { \"follow_user_id\": \"\\\\d{2,}\"},\n      \"distillery_unfollow\": { \"follow_user_id\": \"\\\\d{2,}\"}\n      }, \n      \"http_event_body_fields\": {} }", JsonElementSerializer.A00));
            JsonElement jsonElement = (JsonElement) A032.get("http_event_name_signature");
            if (jsonElement != null) {
                for (Map.Entry<String, JsonElement> entry : AbstractC100754fe.A03(jsonElement).entrySet()) {
                    VZH.A00.put(new C11L(entry.getKey()), AbstractC001900j.A0M(entry.getValue().toString(), '\"'));
                }
            }
            JsonElement jsonElement2 = (JsonElement) A032.get("http_event_url_fields");
            if (jsonElement2 != null) {
                for (Map.Entry<String, JsonElement> entry2 : AbstractC100754fe.A03(jsonElement2).entrySet()) {
                    VZH.A01.put(entry2.getKey(), AbstractC06930Yk.A0B(AbstractC100754fe.A03(entry2.getValue())));
                }
            }
            C19320xG c19320xG = A07;
            if (c19320xG != null) {
                c19320xG.A00.A02();
            }
            C1HS.A01.A02();
            if ((activity instanceof C07X) && (c07x = (C07X) activity) != null && (lifecycle = c07x.getLifecycle()) != null) {
                lifecycle.A09(A0I);
            }
            if (!A0C) {
                A0D.post(A0F);
                A0C = true;
                return;
            }
            return;
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    public static final void A00(Activity activity, WFS wfs, boolean z) {
        ViewGroup viewGroup;
        TabLayout tabLayout;
        ImageView imageView;
        View findViewById;
        C69440VnP c69440VnP = A03;
        if (c69440VnP != null) {
            if (z) {
                C14360o3.A0B(activity, 0);
                View rootView = AbstractC43592JPx.A08(activity).getRootView();
                C14360o3.A0C(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                c69440VnP.A08 = new WeakReference(rootView);
                C2GS c2gs = c69440VnP.A09;
                MSX.A1B(c2gs, true);
                ViewGroup viewGroup2 = (ViewGroup) c69440VnP.A08.get();
                if (viewGroup2 != null) {
                    View inflate = AbstractC25228BEl.A0P(viewGroup2).inflate(R.layout.main_log_overlay, viewGroup2, false);
                    c69440VnP.A03 = inflate;
                    viewGroup2.addView(inflate);
                }
                View view = c69440VnP.A03;
                LinearLayout linearLayout = null;
                if (view != null) {
                    tabLayout = (TabLayout) view.findViewById(R.id.event_debugger_tab_layout);
                } else {
                    tabLayout = null;
                }
                c69440VnP.A07 = tabLayout;
                if (tabLayout != null) {
                    tabLayout.A0D(new C35868Fsi(c69440VnP, 0));
                }
                View view2 = c69440VnP.A03;
                if (view2 != null && (findViewById = view2.findViewById(R.id.reset_indicator)) != null) {
                    WNN.A00(findViewById, 60, c69440VnP);
                }
                View view3 = c69440VnP.A03;
                if (view3 != null) {
                    imageView = (ImageView) view3.findViewById(R.id.overlay_show_hide_indicator);
                } else {
                    imageView = null;
                }
                C14360o3.A0C(imageView, AbstractC111324zv.A00(34));
                c69440VnP.A04 = imageView;
                if (imageView != null) {
                    WNN.A00(imageView, 59, c69440VnP);
                }
                View view4 = c69440VnP.A03;
                View view5 = null;
                if (view4 != null) {
                    linearLayout = (LinearLayout) view4.findViewById(R.id.overlay_display);
                }
                C14360o3.A0C(linearLayout, AbstractC111324zv.A00(4));
                C14360o3.A0B(linearLayout, 0);
                c69440VnP.A05 = linearLayout;
                View view6 = c69440VnP.A03;
                if (view6 != null) {
                    view5 = view6.findViewById(R.id.overlay_drag_indicator);
                }
                C14360o3.A0C(view5, AbstractC111324zv.A00(2));
                C14360o3.A0B(view5, 0);
                c69440VnP.A02 = view5;
                WO5.A00(view5, 3, c69440VnP);
                c2gs.A09(new C9LO(38, new C50356MLi(c69440VnP, 12)));
                A01(wfs);
                return;
            }
            View view7 = c69440VnP.A03;
            if (view7 != null && (viewGroup = (ViewGroup) c69440VnP.A08.get()) != null) {
                viewGroup.removeView(view7);
            }
            c69440VnP.A03 = null;
            return;
        }
        C14360o3.A0F("eventOverlay");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130 A[LOOP:3: B:47:0x012a->B:49:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.WFS r17) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFS.A01(X.WFS):void");
    }

    public static final void A02(WFS wfs, boolean z, boolean z2) {
        if (!z && !z2) {
            if (A0C) {
                A0D.removeCallbacks(A0F);
                A0C = false;
            }
            wfs.A03();
            return;
        }
        if (!A0C) {
            A0D.post(A0F);
            A0C = true;
        }
        A01(wfs);
    }

    public final void A03() {
        String str;
        C68933VeX c68933VeX = A04;
        if (c68933VeX == null) {
            str = "generalModeEventHandler";
        } else {
            c68933VeX.A01.clear();
            C69280Vko c69280Vko = A06;
            if (c69280Vko == null) {
                str = "secondChannelEventHandler";
            } else {
                c69280Vko.A01.clear();
                c69280Vko.A02.clear();
                c69280Vko.A03.clear();
                A01(this);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
