package X;

import android.os.Parcelable;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.5nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126445nf {
    public static C126455ng parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C126455ng c126455ng = new C126455ng();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                A00(c16l, c126455ng, A0q);
                c16l.A0z();
            }
            c126455ng.A01();
            return c126455ng;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C16L c16l, C126455ng c126455ng, String str) {
        String A1P;
        String A1P2;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        HashMap hashMap = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        ArrayList arrayList7 = null;
        String str10 = null;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        ArrayList arrayList10 = null;
        HashMap hashMap2 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        HashMap hashMap3 = null;
        String str15 = null;
        ArrayList arrayList11 = null;
        String str16 = null;
        if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str2 = c16l.A1P();
            }
            c126455ng.A1E = str2;
            return;
        }
        if ("last_mentioned_item_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str3 = c16l.A1P();
            }
            c126455ng.A1F = str3;
            return;
        }
        if ("thread_v2_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str4 = c16l.A1P();
            }
            c126455ng.A1K = str4;
            return;
        }
        if ("group_thread_jid".equals(str)) {
            c126455ng.A19 = Long.valueOf(c16l.A0y());
            return;
        }
        if ("thread_title".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str5 = c16l.A1P();
            }
            c126455ng.A1L = str5;
            return;
        }
        if ("thread_image".equals(str)) {
            c126455ng.A0i = AbstractC106404qu.parseFromJson(c16l);
            return;
        }
        if ("nicknames".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList2 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C34502FIo parseFromJson = F46.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList2.add(parseFromJson);
                    }
                }
            }
            c126455ng.A1Y = arrayList2;
            return;
        }
        if ("nicknames_setting".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList3 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C34503FIp parseFromJson2 = F47.parseFromJson(c16l);
                    if (parseFromJson2 != null) {
                        arrayList3.add(parseFromJson2);
                    }
                }
            }
            c126455ng.A1Z = arrayList3;
            return;
        }
        if ("fan_club_eligibility".equals(str)) {
            c126455ng.A0Q = C5MX.parseFromJson(c16l);
            return;
        }
        if ("users".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList4 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    Parcelable.Creator creator = User.CREATOR;
                    User A00 = AbstractC38851rI.A00(c16l, false);
                    if (A00 != null) {
                        arrayList4.add(A00);
                    }
                }
            }
            c126455ng.A1d = arrayList4;
            return;
        }
        if ("admin_user_ids".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList5 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                        arrayList5.add(A1P2);
                    }
                }
            }
            c126455ng.A1T = arrayList5;
            return;
        }
        if ("left_users".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList6 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    User A002 = AbstractC38851rI.A00(c16l, false);
                    if (A002 != null) {
                        arrayList6.add(A002);
                    }
                }
            }
            c126455ng.A1X = arrayList6;
            return;
        }
        if ("last_seen_at".equals(str)) {
            if (c16l.A11() == C16R.A0D) {
                HashMap hashMap4 = new HashMap();
                while (c16l.A1J() != C16R.A09) {
                    String A1P3 = c16l.A1P();
                    c16l.A1J();
                    if (c16l.A11() == C16R.A0G) {
                        hashMap4.put(A1P3, null);
                    } else {
                        C80993jT parseFromJson3 = AbstractC80983jS.parseFromJson(c16l);
                        if (parseFromJson3 != null) {
                            hashMap4.put(A1P3, parseFromJson3);
                        }
                    }
                }
                hashMap = hashMap4;
            }
            c126455ng.A1S = hashMap;
            return;
        }
        if ("last_activity_at".equals(str)) {
            c126455ng.A1A = Long.valueOf(c16l.A0y());
            return;
        }
        if ("locked_status".equals(str)) {
            c126455ng.A07 = c16l.A1D();
            return;
        }
        if ("notification_preview_controls".equals(str)) {
            c126455ng.A09 = c16l.A1D();
            return;
        }
        if ("reshare_send_count".equals(str)) {
            c126455ng.A0D = c16l.A1D();
            return;
        }
        if ("reshare_receive_count".equals(str)) {
            c126455ng.A0C = c16l.A1D();
            return;
        }
        if ("expiring_media_send_count".equals(str)) {
            c126455ng.A03 = c16l.A1D();
            return;
        }
        if ("thread_subtype".equals(str)) {
            c126455ng.A0I = c16l.A1D();
            return;
        }
        if ("seen_count".equals(str)) {
            c126455ng.A0F = c16l.A1D();
            return;
        }
        if ("active_count".equals(str)) {
            c126455ng.A00 = c16l.A1D();
            return;
        }
        if ("expiring_media_receive_count".equals(str)) {
            c126455ng.A02 = c16l.A1D();
            return;
        }
        if ("thread_label".equals(str)) {
            c126455ng.A0H = c16l.A1D();
            return;
        }
        if ("thread_has_audio_only_call".equals(str)) {
            c126455ng.A1f = c16l.A0d();
            return;
        }
        if ("marked_as_unread".equals(str)) {
            c126455ng.A1o = c16l.A0d();
            return;
        }
        if ("muted".equals(str)) {
            c126455ng.A1q = c16l.A0d();
            return;
        }
        if ("mentions_muted".equals(str)) {
            c126455ng.A1p = c16l.A0d();
            return;
        }
        if ("reactions_muted".equals(str)) {
            c126455ng.A1t = c16l.A0d();
            return;
        }
        if ("vc_muted".equals(str)) {
            c126455ng.A1w = c16l.A0d();
            return;
        }
        if ("is_translation_enabled".equals(str)) {
            c126455ng.A1v = c16l.A0d();
            return;
        }
        if ("named".equals(str)) {
            c126455ng.A1r = c16l.A0d();
            return;
        }
        if ("canonical".equals(str)) {
            c126455ng.A1e = c16l.A0d();
            return;
        }
        if ("pending".equals(str)) {
            c126455ng.A11 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("spam".equals(str)) {
            c126455ng.A12 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("approval_required_for_new_members".equals(str)) {
            c126455ng.A1j = c16l.A0d();
            return;
        }
        if ("has_restricted_user".equals(str)) {
            c126455ng.A1h = c16l.A0d();
            return;
        }
        if ("inviter".equals(str)) {
            Parcelable.Creator creator3 = User.CREATOR;
            c126455ng.A0s = AbstractC38851rI.A00(c16l, false);
            return;
        }
        if ("video_call_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str6 = c16l.A1P();
            }
            c126455ng.A1N = str6;
            return;
        }
        if ("encoded_server_data_info".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str7 = c16l.A1P();
            }
            c126455ng.A1O = str7;
            return;
        }
        if ("folder".equals(str)) {
            c126455ng.A04 = c16l.A1D();
            return;
        }
        if ("custom_folder_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str8 = c16l.A1P();
            }
            c126455ng.A1C = str8;
            return;
        }
        if ("input_mode".equals(str)) {
            c126455ng.A06 = c16l.A1D();
            return;
        }
        if ("shh_mode_enabled".equals(str)) {
            c126455ng.A1x = c16l.A0d();
            return;
        }
        if ("shh_replay_enabled".equals(str)) {
            c126455ng.A1y = c16l.A0d();
            return;
        }
        if ("is_fanclub_subscriber_thread".equals(str)) {
            c126455ng.A1n = c16l.A0d();
            return;
        }
        if ("is_creator_thread".equals(str)) {
            c126455ng.A1m = c16l.A0d();
            return;
        }
        if ("ai_agent_social_signal_message_count".equals(str)) {
            c126455ng.A01 = c16l.A1D();
            return;
        }
        if ("is_business_thread".equals(str)) {
            c126455ng.A1k = c16l.A0d();
            return;
        }
        if ("creator_subscriber_thread_response".equals(str)) {
            c126455ng.A0n = AbstractC125285lZ.parseFromJson(c16l);
            return;
        }
        if ("creator_broadcast_thread_data".equals(str)) {
            c126455ng.A0m = AbstractC121425ei.parseFromJson(c16l);
            return;
        }
        if ("shh_toggler_userid".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str9 = c16l.A1P();
            }
            c126455ng.A1J = str9;
            return;
        }
        if ("theme".equals(str)) {
            c126455ng.A0f = AbstractC81503kK.A00(c16l);
            return;
        }
        if ("policy_violation".equals(str)) {
            c126455ng.A0b = AbstractC31321Dpj.parseFromJson(c16l);
            return;
        }
        if ("visual_thread".equals(str)) {
            c126455ng.A0g = F4H.parseFromJson(c16l);
            return;
        }
        if ("message_request_status".equals(str)) {
            c126455ng.A08 = c16l.A1D();
            return;
        }
        if ("thread_context_items".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList7 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C81583kT parseFromJson4 = AbstractC81573kS.parseFromJson(c16l);
                    if (parseFromJson4 != null) {
                        arrayList7.add(parseFromJson4);
                    }
                }
            }
            c126455ng.A1c = arrayList7;
            return;
        }
        if ("responsiveness_category".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str10 = c16l.A1P();
            }
            c126455ng.A1I = str10;
            return;
        }
        if ("icebreakers".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList8 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C105954q9 parseFromJson5 = C4q8.parseFromJson(c16l);
                    if (parseFromJson5 != null) {
                        arrayList8.add(parseFromJson5);
                    }
                }
            }
            c126455ng.A1V = arrayList8;
            return;
        }
        if ("persistent_menu_icebreakers".equals(str)) {
            c126455ng.A0R = AbstractC81523kN.parseFromJson(c16l);
            return;
        }
        if ("public_chat_metadata".equals(str)) {
            c126455ng.A0c = AbstractC81533kO.parseFromJson(c16l);
            return;
        }
        if ("ig_school_metadata".equals(str)) {
            c126455ng.A0V = F4C.parseFromJson(c16l);
            return;
        }
        if ("ig_thread_capabilities".equals(str)) {
            c126455ng.A0e = AbstractC81553kQ.parseFromJson(c16l);
            return;
        }
        if ("welcome_message".equals(str)) {
            c126455ng.A0Z = AbstractC34100F3c.parseFromJson(c16l);
            return;
        }
        if ("pending_user_ids".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList9 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                        arrayList9.add(A1P);
                    }
                }
            }
            c126455ng.A1W = arrayList9;
            return;
        }
        if ("is_close_friend_thread".equals(str)) {
            c126455ng.A0x = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_group".equals(str)) {
            c126455ng.A0z = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("will_xac_be_readonly".equals(str)) {
            c126455ng.A18 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_xac_thread".equals(str)) {
            c126455ng.A15 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_xac_readonly".equals(str)) {
            c126455ng.A14 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_verified_thread".equals(str)) {
            c126455ng.A13 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_limited".equals(str)) {
            c126455ng.A10 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("label_items".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList10 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C206419By parseFromJson6 = AbstractC46787Kmi.parseFromJson(c16l);
                    if (parseFromJson6 != null) {
                        arrayList10.add(parseFromJson6);
                    }
                }
            }
            c126455ng.A1U = arrayList10;
            return;
        }
        if ("persistent_menu".equals(str)) {
            c126455ng.A0P = AbstractC105644pb.parseFromJson(c16l);
            return;
        }
        if ("theme_data".equals(str)) {
            c126455ng.A0Y = AbstractC65783Tu1.parseFromJson(c16l);
            return;
        }
        if ("system_folder".equals(str)) {
            c126455ng.A0q = AbstractC81593kU.A00(c16l.A1D());
            return;
        }
        if ("thread_languages".equals(str)) {
            if (c16l.A11() == C16R.A0D) {
                HashMap hashMap5 = new HashMap();
                while (c16l.A1J() != C16R.A09) {
                    String A1P4 = c16l.A1P();
                    c16l.A1J();
                    if (c16l.A11() == C16R.A0G) {
                        hashMap5.put(A1P4, null);
                    } else {
                        String A1P5 = c16l.A1P();
                        if (A1P5 != null) {
                            hashMap5.put(A1P4, A1P5);
                        }
                    }
                }
                hashMap2 = hashMap5;
            }
            c126455ng.A1R = hashMap2;
            return;
        }
        if ("translation_banner_impression_count".equals(str)) {
            c126455ng.A0J = c16l.A1D();
            return;
        }
        if ("group_link_joinable_mode".equals(str)) {
            c126455ng.A05 = c16l.A1D();
            return;
        }
        if ("joinable_group_link".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str11 = c16l.A1P();
            }
            c126455ng.A1D = str11;
            return;
        }
        if ("smart_suggestion".equals(str)) {
            c126455ng.A0r = AbstractC82323lt.parseFromJson(c16l);
            return;
        }
        if ("chat_activity_muted".equals(str)) {
            c126455ng.A0u = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("outgoing_chat_activity_muted".equals(str)) {
            c126455ng.A16 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("outgoing_reels_together_activity_muted".equals(str)) {
            c126455ng.A0t = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("account_warning".equals(str)) {
            c126455ng.A0W = AbstractC31322Dpk.parseFromJson(c16l);
            return;
        }
        if ("snippet".equals(str)) {
            c126455ng.A0M = AbstractC81513kM.parseFromJson(c16l);
            return;
        }
        if ("is_3p_api_user".equals(str)) {
            c126455ng.A0v = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("ad_context_data".equals(str)) {
            c126455ng.A0d = AbstractC111204zi.parseFromJson(c16l);
            return;
        }
        if ("professional_metadata".equals(str)) {
            c126455ng.A0U = AbstractC37422Ge2.parseFromJson(c16l);
            return;
        }
        if ("is_appointment_booking_enabled".equals(str)) {
            c126455ng.A0w = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("should_upsell_nudge".equals(str)) {
            c126455ng.A17 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("context_line".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str12 = c16l.A1P();
            }
            c126455ng.A1B = str12;
            return;
        }
        if ("is_following_chat_creator".equals(str)) {
            c126455ng.A0y = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("discoverable_thread_data".equals(str)) {
            c126455ng.A0p = AbstractC125295lb.parseFromJson(c16l);
            return;
        }
        if ("shh_transport_mode".equals(str)) {
            c126455ng.A0G = c16l.A1D();
            return;
        }
        if ("wa_group_thread_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str13 = c16l.A1P();
            }
            c126455ng.A1P = str13;
            return;
        }
        if ("btv_enabled_map".equals(str)) {
            c126455ng.A0a = AbstractC81603kV.parseFromJson(c16l);
            return;
        }
        if ("dm_settings".equals(str)) {
            c126455ng.A0o = AbstractC1118652y.parseFromJson(c16l);
            return;
        }
        if ("takedown_data".equals(str)) {
            c126455ng.A0S = AbstractC50571MUc.parseFromJson(c16l);
            return;
        }
        if ("read_receipts_disabled".equals(str)) {
            c126455ng.A0A = c16l.A1D();
            return;
        }
        if ("typing_indicator_disabled".equals(str)) {
            c126455ng.A0K = c16l.A1D();
            return;
        }
        if ("unpublished_pro_page_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str14 = c16l.A1P();
            }
            c126455ng.A1M = str14;
            return;
        }
        if ("creator_agent_enabled".equals(str)) {
            c126455ng.A1l = c16l.A0d();
            return;
        }
        if ("creator_ai_enabled_map".equals(str)) {
            if (c16l.A11() == C16R.A0D) {
                HashMap hashMap6 = new HashMap();
                while (c16l.A1J() != C16R.A09) {
                    String A1P6 = c16l.A1P();
                    c16l.A1J();
                    if (c16l.A11() == C16R.A0G) {
                        hashMap6.put(A1P6, null);
                    } else {
                        Boolean valueOf = Boolean.valueOf(c16l.A0d());
                        if (valueOf != null) {
                            hashMap6.put(A1P6, valueOf);
                        }
                    }
                }
                hashMap3 = hashMap6;
            }
            c126455ng.A1Q = hashMap3;
            return;
        }
        if ("has_creator_ai_msg".equals(str)) {
            c126455ng.A1i = c16l.A0d();
            return;
        }
        if ("is_stale".equals(str)) {
            c126455ng.A1u = c16l.A0d();
            return;
        }
        if ("is_pin".equals(str)) {
            c126455ng.A1s = c16l.A0d();
            return;
        }
        if ("pinned_timestamp".equals(str)) {
            c126455ng.A0L = c16l.A0y();
            return;
        }
        if ("channels_context_lines_data".equals(str)) {
            c126455ng.A0l = AbstractC121435ek.parseFromJson(c16l);
            return;
        }
        if ("instamadillo_cutover_metadata".equals(str)) {
            c126455ng.A0h = AbstractC43709JUu.parseFromJson(c16l);
            return;
        }
        if ("ctd_outcome_upsell_setting".equals(str)) {
            c126455ng.A0O = C43M.parseFromJson(c16l);
            return;
        }
        if ("reminder".equals(str)) {
            c126455ng.A0T = F4G.parseFromJson(c16l);
            return;
        }
        if ("last_daily_prompt".equals(str)) {
            c126455ng.A0j = F4S.parseFromJson(c16l);
            return;
        }
        if ("last_challenge_prompt".equals(str)) {
            c126455ng.A0k = F4T.parseFromJson(c16l);
            return;
        }
        if ("recurring_prompt_type".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str15 = c16l.A1P();
            }
            c126455ng.A1H = str15;
            return;
        }
        if ("relevancy_score".equals(str)) {
            c126455ng.A0B = c16l.A1D();
            return;
        }
        if ("pinned_messages_metadata".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList11 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    L4Z parseFromJson7 = AbstractC46862Knv.parseFromJson(c16l);
                    if (parseFromJson7 != null) {
                        arrayList11.add(parseFromJson7);
                    }
                }
            }
            c126455ng.A1a = arrayList11;
            return;
        }
        if ("lightweight_intervention_appealable_entity_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str16 = c16l.A1P();
            }
            c126455ng.A1G = str16;
            return;
        }
        if ("has_reached_message_request_limit".equals(str)) {
            c126455ng.A1g = c16l.A0d();
            return;
        }
        if ("most_recent_polls".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C9CD parseFromJson8 = AnonymousClass547.parseFromJson(c16l);
                    if (parseFromJson8 != null) {
                        arrayList.add(parseFromJson8);
                    }
                }
            }
            c126455ng.A1b = arrayList;
            return;
        }
        if ("nudge".equals(str)) {
            c126455ng.A0N = AbstractC81653ka.parseFromJson(c16l);
            return;
        }
        if ("ongoing_live".equals(str)) {
            c126455ng.A0X = F4R.parseFromJson(c16l);
        } else if ("scheduled_message_count".equals(str)) {
            c126455ng.A0E = c16l.A1D();
        } else {
            C55702hA.A01(c16l, c126455ng, str);
        }
    }
}
