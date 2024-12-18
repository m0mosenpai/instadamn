package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.4bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98754bv extends C4SW {
    @Override // X.C4SW
    public final void A00(InterfaceC02550Ad interfaceC02550Ad) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Double d;
        Double d2;
        Double d3;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        String str;
        String str2;
        String str3;
        String str4;
        Long l22;
        Long l23;
        C14360o3.A0B(interfaceC02550Ad, 0);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "video_format_changed");
        if (A00.isSampled()) {
            C95684Sc c95684Sc = this.A06;
            Long l24 = null;
            if (c95684Sc != null) {
                Integer num = c95684Sc.A0Y;
                if (num != null) {
                    int intValue = num.intValue();
                    String str5 = c95684Sc.A10;
                    if (str5 == null) {
                        str5 = "0";
                    }
                    C4SX c4sx = c95684Sc.A00;
                    if (c4sx == null) {
                        c4sx = new C4SX(0L);
                    }
                    String str6 = c95684Sc.A1I;
                    Number number = c95684Sc.A0J;
                    if (number == null) {
                        number = 0;
                    }
                    A00.A9K("seq_num", Long.valueOf(intValue));
                    A00.AAP("m_pk", str5);
                    A00.A9K("a_pk", c4sx.A00);
                    A00.AAP("a_i", str6);
                    if (c95684Sc.A0H != null) {
                        d = Double.valueOf(r0.floatValue());
                    } else {
                        d = null;
                    }
                    A00.A8I("time", d);
                    A00.A8I("lsp", Double.valueOf(number.doubleValue()));
                    if (c95684Sc.A0L != null) {
                        d2 = Double.valueOf(r0.floatValue());
                    } else {
                        d2 = null;
                    }
                    A00.A8I("loop_count", d2);
                    if (c95684Sc.A0I != null) {
                        d3 = Double.valueOf(r0.floatValue());
                    } else {
                        d3 = null;
                    }
                    A00.A8I("duration", d3);
                    A00.AAP("tracking_token", c95684Sc.A1H);
                    A00.AAP("video_type", c95684Sc.A1L);
                    A00.AAP("upload_id", c95684Sc.A1J);
                    A00.AAP("parent_m_pk", c95684Sc.A15);
                    A00.AAP("representation_id", c95684Sc.A1C);
                    A00.AAP("audio_representation_id", c95684Sc.A0k);
                    A00.A9K("m_ts", c95684Sc.A0f);
                    A00.AAP("follow_status", c95684Sc.A0v);
                    if (c95684Sc.A0S != null) {
                        l17 = Long.valueOf(r0.intValue());
                    } else {
                        l17 = null;
                    }
                    A00.A9K("m_ix", l17);
                    A00.A8I("timeAsPercent", c95684Sc.A0D);
                    A00.A7v("playing_audio", c95684Sc.A04);
                    A00.A8I("system_volume", null);
                    Long l25 = null;
                    A00.A9K("carousel_index", null);
                    A00.AAP("carousel_media_id", null);
                    A00.A9K("carousel_media_type", null);
                    A00.A9K("carousel_size", null);
                    A00.AAP("carousel_cover_media_id", null);
                    A00.AAP("chaining_session_id", c95684Sc.A0p);
                    A00.AAP("viewer_session_id", c95684Sc.A1M);
                    if (c95684Sc.A0c != null) {
                        l25 = Long.valueOf(r0.intValue());
                    }
                    A00.A9K("video_width", l25);
                    if (c95684Sc.A0a != null) {
                        l18 = Long.valueOf(r0.intValue());
                    } else {
                        l18 = null;
                    }
                    A00.A9K("video_height", l18);
                    if (c95684Sc.A0E != null) {
                        l19 = Long.valueOf(r0.floatValue());
                    } else {
                        l19 = null;
                    }
                    A00.A9K(TraceFieldType.Bitrate, l19);
                    A00.AAP("mime_type", c95684Sc.A12);
                    if (c95684Sc.A0W != null) {
                        l20 = Long.valueOf(r0.intValue());
                    } else {
                        l20 = null;
                    }
                    A00.A9K("recent_bandwidth", l20);
                    if (c95684Sc.A0T != null) {
                        l21 = Long.valueOf(r0.intValue());
                    } else {
                        l21 = null;
                    }
                    A00.A9K("is_dash_eligible", l21);
                    A00.AAP("playback_format", c95684Sc.A16);
                    A00.AAP("video_codec", c95684Sc.A1K);
                    A00.A7v("is_replay", null);
                    A00.AAP("audience", c95684Sc.A0h);
                    A00.AAP("effect_id", c95684Sc.A0t);
                    A00.AAP("channel_pk", c95684Sc.A0r);
                    A00.AAP("ranking_info_token", c95684Sc.A1A);
                    A00.AAP("mezql_token", c95684Sc.A11);
                    A00.AAP("discovery_session_id", c95684Sc.A0s);
                    A00.AAP("camera_session_id", c95684Sc.A0o);
                    A00.A7v("is_video_to_carousel", c95684Sc.A09);
                    A00.AAP("connection_type", c95684Sc.A0q);
                    A00.A8I("device_lat", c95684Sc.A0B);
                    A00.A8I("device_long", c95684Sc.A0C);
                    A00.AAP("hardware_address", c95684Sc.A0m);
                    HashMap hashMap = c95684Sc.A1Q;
                    if (hashMap != null) {
                        str = (String) hashMap.get("is_network_roaming");
                    } else {
                        str = null;
                    }
                    A00.AAP("is_network_roaming", str);
                    HashMap hashMap2 = c95684Sc.A1Q;
                    if (hashMap2 != null) {
                        str2 = (String) hashMap2.get("network_generation");
                    } else {
                        str2 = null;
                    }
                    A00.AAP("network_generation", str2);
                    HashMap hashMap3 = c95684Sc.A1Q;
                    if (hashMap3 != null) {
                        str3 = (String) hashMap3.get("network_params");
                    } else {
                        str3 = null;
                    }
                    A00.AAP("network_params", str3);
                    HashMap hashMap4 = c95684Sc.A1Q;
                    if (hashMap4 != null) {
                        str4 = (String) hashMap4.get("network_type_info");
                    } else {
                        str4 = null;
                    }
                    A00.AAP("network_type_info", str4);
                    A00.AAP("random_session_id", c95684Sc.A18);
                    if (c95684Sc.A0W != null) {
                        l22 = Long.valueOf(r0.intValue());
                    } else {
                        l22 = null;
                    }
                    A00.A9K("recent_bandwidth", l22);
                    if (c95684Sc.A0b != null) {
                        l23 = Long.valueOf(r0.intValue());
                    } else {
                        l23 = null;
                    }
                    A00.A9K("segment_count", l23);
                    A00.AAP("nav_chain", c95684Sc.A13);
                    z = true;
                } else {
                    throw new IllegalStateException("seqNum number should not be null.");
                }
            } else {
                z = false;
            }
            C95714Sf c95714Sf = this.A07;
            if (c95714Sf != null) {
                if (z) {
                    if (c95714Sf.A0K != null) {
                        l3 = Long.valueOf(r0.intValue());
                    } else {
                        l3 = null;
                    }
                    A00.A9K("reel_position", l3);
                    if (c95714Sf.A0L != null) {
                        l4 = Long.valueOf(r0.intValue());
                    } else {
                        l4 = null;
                    }
                    A00.A9K("reel_size", l4);
                    A00.A7v("is_replay", c95714Sf.A03);
                    A00.AAP("host_video_pk", null);
                    if (c95714Sf.A0A != null) {
                        l5 = Long.valueOf(r0.intValue());
                    } else {
                        l5 = null;
                    }
                    A00.A9K("session_reel_counter", l5);
                    A00.AAP("tray_session_id", c95714Sf.A0a);
                    if (c95714Sf.A0N != null) {
                        l6 = Long.valueOf(r0.intValue());
                    } else {
                        l6 = null;
                    }
                    A00.A9K("tray_position", l6);
                    if (c95714Sf.A0H != null) {
                        l7 = Long.valueOf(r0.intValue());
                    } else {
                        l7 = null;
                    }
                    A00.A9K("mqtt_connection_status", l7);
                    if (c95714Sf.A06 != null) {
                        l8 = Long.valueOf(r0.intValue());
                    } else {
                        l8 = null;
                    }
                    A00.A9K("battery_level", l8);
                    A00.AAP("battery_status", c95714Sf.A0Q);
                    if (c95714Sf.A0E != null) {
                        l9 = Long.valueOf(r0.intValue());
                    } else {
                        l9 = null;
                    }
                    A00.A9K("live_donation", l9);
                    if (c95714Sf.A0J != null) {
                        l10 = Long.valueOf(r0.intValue());
                    } else {
                        l10 = null;
                    }
                    A00.A9K("number_of_qualities", l10);
                    if (c95714Sf.A0F != null) {
                        l11 = Long.valueOf(r0.intValue());
                    } else {
                        l11 = null;
                    }
                    A00.A9K("is_live_streaming", l11);
                    if (c95714Sf.A0C != null) {
                        l12 = Long.valueOf(r0.intValue());
                    } else {
                        l12 = null;
                    }
                    A00.A9K("has_igtv_video", l12);
                    if (c95714Sf.A0D != null) {
                        l13 = Long.valueOf(r0.intValue());
                    } else {
                        l13 = null;
                    }
                    A00.A9K("has_reshared_clips_video", l13);
                    A00.AAP("channel_id", null);
                    A00.AAP("channel_type", null);
                    A00.AAP("subtype", c95714Sf.A0Z);
                    A00.AAP("position", c95714Sf.A0V);
                    A00.AAP("size", c95714Sf.A0W);
                    A00.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c95714Sf.A0P);
                    if (c95714Sf.A07 != null) {
                        l14 = Long.valueOf(r0.intValue());
                    } else {
                        l14 = null;
                    }
                    A00.A9K("carousel_index", l14);
                    A00.AAP("carousel_media_id", c95714Sf.A0S);
                    A00.AAP("carousel_cover_media_id", c95714Sf.A0R);
                    if (c95714Sf.A09 != null) {
                        l15 = Long.valueOf(r0.intValue());
                    } else {
                        l15 = null;
                    }
                    A00.A9K("carousel_size", l15);
                    if (c95714Sf.A08 != null) {
                        l16 = Long.valueOf(r0.intValue());
                    } else {
                        l16 = null;
                    }
                    A00.A9K("carousel_m_t", l16);
                }
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("igtv_destination_session_id", null);
                c0Zx.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
                c0Zx.A06("surface", null);
                c0Zx.A06("component_type", null);
                c0Zx.A03("was_live", null);
                c0Zx.A05("video_x_position", null);
                c0Zx.A05("video_y_position", null);
                c0Zx.A06("source_channel_type", null);
                c0Zx.A03("captions_available", c95714Sf.A04);
                c0Zx.A03("captions_displayed", c95714Sf.A05);
                String str7 = c95714Sf.A0Y;
                if (str7 != null) {
                    l = AbstractC003100w.A0k(10, str7);
                } else {
                    l = null;
                }
                String str8 = c95714Sf.A0X;
                if (str8 != null) {
                    l2 = AbstractC003100w.A0k(10, str8);
                } else {
                    l2 = null;
                }
                c0Zx.A05("story_preview_media_owner_id", l);
                c0Zx.A05("story_preview_media_id", l2);
                if (z) {
                    A00.AAQ(c0Zx, "adhoc_data");
                }
                C95684Sc c95684Sc2 = this.A06;
                if (c95684Sc2 == null || c95684Sc2.A16 == null) {
                    if (z) {
                        A00.AAP("playback_format", c95714Sf.A0U);
                        if (c95714Sf.A0B != null) {
                            l24 = Long.valueOf(r0.intValue());
                        }
                        A00.A9K("is_dash_eligible", l24);
                        A00.Cht();
                    }
                    return;
                }
            }
            if (!z) {
                return;
            }
            A00.Cht();
        }
    }
}
