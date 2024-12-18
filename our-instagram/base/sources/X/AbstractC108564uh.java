package X;

import java.io.IOException;

/* renamed from: X.4uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108564uh {
    public static C109054vU parseFromJson(C16L c16l) {
        C0KX c0kx;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C108944vJ c108944vJ = null;
            C109034vS c109034vS = null;
            C108584uj c108584uj = null;
            C108794v4 c108794v4 = null;
            C109004vP c109004vP = null;
            C108854vA c108854vA = null;
            C108884vD c108884vD = null;
            C108704uv c108704uv = null;
            C108734uy c108734uy = null;
            C108764v1 c108764v1 = null;
            C108974vM c108974vM = null;
            C108824v7 c108824v7 = null;
            C108644up c108644up = null;
            C108614um c108614um = null;
            C108914vG c108914vG = null;
            C108674us c108674us = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ig_allow_4p_live_with".equals(A0q)) {
                    c108944vJ = AbstractC108934vI.parseFromJson(c16l);
                } else if ("ig_live_android_games".equals(A0q)) {
                    c109034vS = AbstractC109024vR.parseFromJson(c16l);
                } else if ("ig_live_audio_video_toggle".equals(A0q)) {
                    c108584uj = AbstractC108574ui.parseFromJson(c16l);
                } else if ("ig_live_badges_ufi".equals(A0q)) {
                    c108794v4 = AbstractC108784v3.parseFromJson(c16l);
                } else if ("ig_live_bff_upsell".equals(A0q)) {
                    c109004vP = AbstractC108994vO.parseFromJson(c16l);
                } else if ("ig_live_comment_interactions".equals(A0q)) {
                    c108854vA = AbstractC108844v9.parseFromJson(c16l);
                } else if ("ig_live_comment_subscription".equals(A0q)) {
                    c108884vD = AbstractC108874vC.parseFromJson(c16l);
                } else if ("ig_live_emoji_reactions".equals(A0q)) {
                    c108704uv = AbstractC108694uu.parseFromJson(c16l);
                } else if ("ig_live_friend_chat".equals(A0q)) {
                    c108734uy = AbstractC108724ux.parseFromJson(c16l);
                } else if ("ig_live_halo_call_controls".equals(A0q)) {
                    c108764v1 = AbstractC108754v0.parseFromJson(c16l);
                } else if ("ig_live_invite_only".equals(A0q)) {
                    c108974vM = AbstractC108964vL.parseFromJson(c16l);
                } else if ("ig_live_share_system_comment".equals(A0q)) {
                    c108824v7 = AbstractC108814v6.parseFromJson(c16l);
                } else if ("ig_live_upvoteable_qa".equals(A0q)) {
                    c108644up = AbstractC108634uo.parseFromJson(c16l);
                } else if ("ig_live_use_rsys_rtc_infra".equals(A0q)) {
                    c108614um = AbstractC108604ul.parseFromJson(c16l);
                } else if ("ig_live_viewer_redesign_broadcaster_v1".equals(A0q)) {
                    c108914vG = AbstractC108904vF.parseFromJson(c16l);
                } else if ("ig_live_viewer_to_viewer_waves".equals(A0q)) {
                    c108674us = AbstractC108664ur.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c108944vJ == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("ig_allow_4p_live_with", "IGLiveBroadcastExperiments");
            } else if (c109034vS != null || !(c16l instanceof C07950bF)) {
                if (c108584uj == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_audio_video_toggle", "IGLiveBroadcastExperiments");
                } else if (c108794v4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_badges_ufi", "IGLiveBroadcastExperiments");
                } else if (c109004vP == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_bff_upsell", "IGLiveBroadcastExperiments");
                } else if (c108854vA == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_comment_interactions", "IGLiveBroadcastExperiments");
                } else if (c108884vD == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_comment_subscription", "IGLiveBroadcastExperiments");
                } else if (c108704uv == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_emoji_reactions", "IGLiveBroadcastExperiments");
                } else if (c108734uy == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_friend_chat", "IGLiveBroadcastExperiments");
                } else if (c108764v1 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_halo_call_controls", "IGLiveBroadcastExperiments");
                } else if (c108974vM == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_invite_only", "IGLiveBroadcastExperiments");
                } else if (c108824v7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_live_share_system_comment", "IGLiveBroadcastExperiments");
                } else {
                    if (c108644up == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "ig_live_upvoteable_qa";
                    } else if (c108614um != null || !(c16l instanceof C07950bF)) {
                        if (c108914vG == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "ig_live_viewer_redesign_broadcaster_v1";
                        } else if (c108674us == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "ig_live_viewer_to_viewer_waves";
                        } else {
                            return new C109054vU(c108944vJ, c108584uj, c109004vP, c108794v4, c108854vA, c108884vD, c108704uv, c108734uy, c109034vS, c108764v1, c108974vM, c108824v7, c108644up, c108614um, c108914vG, c108674us);
                        }
                    } else {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "ig_live_use_rsys_rtc_infra";
                    }
                    c0kx.A00(str, "IGLiveBroadcastExperiments");
                }
            } else {
                ((C07950bF) c16l).A03.A00("ig_live_android_games", "IGLiveBroadcastExperiments");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109054vU c109054vU) {
        anonymousClass182.A0d();
        InterfaceC108954vK interfaceC108954vK = c109054vU.A00;
        if (interfaceC108954vK != null) {
            anonymousClass182.A0r("ig_allow_4p_live_with");
            C108944vJ EuS = interfaceC108954vK.EuS();
            anonymousClass182.A0d();
            anonymousClass182.A0T("allow", EuS.A00);
            anonymousClass182.A0a();
        }
        InterfaceC109044vT interfaceC109044vT = c109054vU.A08;
        if (interfaceC109044vT != null) {
            anonymousClass182.A0r("ig_live_android_games");
            C109034vS Euz = interfaceC109044vT.Euz();
            anonymousClass182.A0d();
            anonymousClass182.A0T("viewer_poll_enabled", Euz.A00);
            anonymousClass182.A0a();
        }
        C108584uj c108584uj = c109054vU.A01;
        if (c108584uj != null) {
            anonymousClass182.A0r("ig_live_audio_video_toggle");
            anonymousClass182.A0d();
            anonymousClass182.A0T("audio_toggle_enabled", c108584uj.A00);
            anonymousClass182.A0T("video_toggle_enabled", c108584uj.A01);
            anonymousClass182.A0a();
        }
        InterfaceC108804v5 interfaceC108804v5 = c109054vU.A03;
        if (interfaceC108804v5 != null) {
            anonymousClass182.A0r("ig_live_badges_ufi");
            C108794v4 Eut = interfaceC108804v5.Eut();
            anonymousClass182.A0d();
            anonymousClass182.A0T("badges_always_on_enabled", Eut.A00);
            anonymousClass182.A0a();
        }
        C109004vP c109004vP = c109054vU.A02;
        if (c109004vP != null) {
            anonymousClass182.A0r("ig_live_bff_upsell");
            anonymousClass182.A0d();
            anonymousClass182.A0T("show_join_live_sheet", c109004vP.A00);
            anonymousClass182.A0a();
        }
        InterfaceC108864vB interfaceC108864vB = c109054vU.A04;
        if (interfaceC108864vB != null) {
            anonymousClass182.A0r("ig_live_comment_interactions");
            C108854vA Euv = interfaceC108864vB.Euv();
            anonymousClass182.A0d();
            anonymousClass182.A0T("android_is_required_mvvm_enabled", Euv.A00);
            anonymousClass182.A0T("is_broadcast_level_expand_enabled", Euv.A01);
            anonymousClass182.A0T("is_host_comment_liking_enabled", Euv.A02);
            anonymousClass182.A0T("is_host_comment_reply_redesign_enabled", Euv.A03);
            anonymousClass182.A0a();
        }
        InterfaceC108894vE interfaceC108894vE = c109054vU.A05;
        if (interfaceC108894vE != null) {
            anonymousClass182.A0r("ig_live_comment_subscription");
            C108884vD Euw = interfaceC108894vE.Euw();
            anonymousClass182.A0d();
            anonymousClass182.A0T("dont_change_comments_height", Euw.A00);
            anonymousClass182.A0T("is_broadcast_enabled", Euw.A01);
            anonymousClass182.A0a();
        }
        InterfaceC108714uw interfaceC108714uw = c109054vU.A06;
        if (interfaceC108714uw != null) {
            anonymousClass182.A0r("ig_live_emoji_reactions");
            C108704uv Eux = interfaceC108714uw.Eux();
            anonymousClass182.A0d();
            anonymousClass182.A0T("is_host_enabled", Eux.A00);
            anonymousClass182.A0T("use_emoji_set_2", Eux.A01);
            anonymousClass182.A0a();
        }
        InterfaceC108744uz interfaceC108744uz = c109054vU.A07;
        if (interfaceC108744uz != null) {
            anonymousClass182.A0r("ig_live_friend_chat");
            C108734uy Euy = interfaceC108744uz.Euy();
            anonymousClass182.A0d();
            anonymousClass182.A0T("is_enabled_for_broadcast", Euy.A00);
            anonymousClass182.A0a();
        }
        InterfaceC108774v2 interfaceC108774v2 = c109054vU.A09;
        if (interfaceC108774v2 != null) {
            anonymousClass182.A0r("ig_live_halo_call_controls");
            C108764v1 Ev0 = interfaceC108774v2.Ev0();
            anonymousClass182.A0d();
            anonymousClass182.A0T("tap_state_animation_enabled", Ev0.A00);
            anonymousClass182.A0T("tap_state_bottom_call_controls_enabled", Ev0.A01);
            anonymousClass182.A0T("tap_to_show_pill_enabled", Ev0.A02);
            anonymousClass182.A0a();
        }
        InterfaceC108984vN interfaceC108984vN = c109054vU.A0A;
        if (interfaceC108984vN != null) {
            anonymousClass182.A0r("ig_live_invite_only");
            C108974vM Ev1 = interfaceC108984vN.Ev1();
            anonymousClass182.A0d();
            anonymousClass182.A0T("is_invite_only_branding_enabled", Ev1.A00);
            anonymousClass182.A0a();
        }
        InterfaceC108834v8 interfaceC108834v8 = c109054vU.A0B;
        if (interfaceC108834v8 != null) {
            anonymousClass182.A0r("ig_live_share_system_comment");
            C108824v7 Ev2 = interfaceC108834v8.Ev2();
            anonymousClass182.A0d();
            anonymousClass182.A0T("join_request_system_comment_delay_5_else_0", Ev2.A00);
            anonymousClass182.A0T("share_system_comment_delay_10_else_5", Ev2.A01);
            anonymousClass182.A0T("show_join_request_system_comment", Ev2.A02);
            anonymousClass182.A0T("show_share_system_comment", Ev2.A03);
            anonymousClass182.A0a();
        }
        InterfaceC108654uq interfaceC108654uq = c109054vU.A0C;
        if (interfaceC108654uq != null) {
            anonymousClass182.A0r("ig_live_upvoteable_qa");
            C108644up Ev3 = interfaceC108654uq.Ev3();
            anonymousClass182.A0d();
            anonymousClass182.A0T("enabled", Ev3.A00);
            anonymousClass182.A0a();
        }
        InterfaceC108624un interfaceC108624un = c109054vU.A0D;
        if (interfaceC108624un != null) {
            anonymousClass182.A0r("ig_live_use_rsys_rtc_infra");
            C108614um Ev4 = interfaceC108624un.Ev4();
            anonymousClass182.A0d();
            anonymousClass182.A0T("enabled", Ev4.A00);
            anonymousClass182.A0a();
        }
        InterfaceC108924vH interfaceC108924vH = c109054vU.A0E;
        if (interfaceC108924vH != null) {
            anonymousClass182.A0r("ig_live_viewer_redesign_broadcaster_v1");
            C108914vG Ev5 = interfaceC108924vH.Ev5();
            anonymousClass182.A0d();
            anonymousClass182.A0T("aspect_ratio_change_enabled", Ev5.A00);
            anonymousClass182.A0T("comment_redesign_combined_test_enabled", Ev5.A01);
            anonymousClass182.A0T("is_aspect_ratio_16_9", Ev5.A02);
            anonymousClass182.A0T("viewer_redesign_combined_test_enabled", Ev5.A03);
            anonymousClass182.A0T("viewer_redesign_v2_combined_test_enabled", Ev5.A04);
            anonymousClass182.A0a();
        }
        InterfaceC108684ut interfaceC108684ut = c109054vU.A0F;
        if (interfaceC108684ut != null) {
            anonymousClass182.A0r("ig_live_viewer_to_viewer_waves");
            C108674us Ev6 = interfaceC108684ut.Ev6();
            anonymousClass182.A0d();
            anonymousClass182.A0T("enabled", Ev6.A00);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
