package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.6P1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6P1 extends C4SW {
    @Override // X.C4SW
    public final void A00(InterfaceC02550Ad interfaceC02550Ad) {
        boolean z;
        String str;
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
        Double d;
        String str2;
        Long l16;
        Long l17;
        Long l18;
        C14360o3.A0B(interfaceC02550Ad, 0);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "video_audio_enabled");
        if (A00.isSampled()) {
            C95684Sc c95684Sc = this.A06;
            boolean z2 = true;
            Long l19 = null;
            if (c95684Sc != null) {
                if (c95684Sc.A0Y != null) {
                    A00.A9K("seq_num", Long.valueOf(r0.intValue()));
                    String str3 = c95684Sc.A10;
                    if (str3 == null) {
                        str3 = "0";
                    }
                    A00.AAP("m_pk", str3);
                    C4SX c4sx = c95684Sc.A00;
                    long j = 0;
                    if (c4sx == null) {
                        c4sx = new C4SX(0L);
                    }
                    A00.AAK(c4sx, "a_pk");
                    if (c95684Sc.A0L != null) {
                        A00.A8I("loop_count", Double.valueOf(r0.floatValue()));
                        if (C14360o3.A0K(c95684Sc.A05, true)) {
                            j = 1;
                        }
                        A00.A9K("audio_fetched", Long.valueOf(j));
                        if (c95684Sc.A0I != null) {
                            d = Double.valueOf(r0.floatValue());
                        } else {
                            d = null;
                        }
                        A00.A8I("duration", d);
                        A00.AAP("follow_status", c95684Sc.A0v);
                        Integer num = c95684Sc.A0T;
                        if (num != null) {
                            str2 = num.toString();
                        } else {
                            str2 = null;
                        }
                        A00.A7v("is_dash_eligible", Boolean.valueOf(Boolean.parseBoolean(str2)));
                        A00.A7v("is_video_to_carousel", c95684Sc.A09);
                        if (c95684Sc.A0S != null) {
                            l16 = Long.valueOf(r0.intValue());
                        } else {
                            l16 = null;
                        }
                        A00.A9K("m_ix", l16);
                        A00.A9K("m_ts", c95684Sc.A0f);
                        Double d2 = null;
                        A00.A8I("system_volume", null);
                        A00.AAP("playback_format", c95684Sc.A16);
                        A00.A7v("playing_audio", c95684Sc.A04);
                        A00.AAP(CacheBehaviorLogger.SOURCE, c95684Sc.A0l);
                        if (c95684Sc.A0H != null) {
                            d2 = Double.valueOf(r0.floatValue());
                        }
                        A00.A8I("time", d2);
                        A00.A8I("timeAsPercent", c95684Sc.A0D);
                        A00.AAP("tracking_token", c95684Sc.A1H);
                        A00.AAP("video_codec", c95684Sc.A1K);
                        A00.AAP("video_type", c95684Sc.A1L);
                        if (c95684Sc.A0c != null) {
                            l17 = Long.valueOf(r0.intValue());
                        } else {
                            l17 = null;
                        }
                        A00.A9K("video_width", l17);
                        A00.AAP("viewer_session_id", c95684Sc.A1M);
                        A00.AAP("chaining_session_id", c95684Sc.A0p);
                        if (c95684Sc.A0W != null) {
                            l18 = Long.valueOf(r0.intValue());
                        } else {
                            l18 = null;
                        }
                        A00.A9K("recent_bandwidth", l18);
                        A00.AAP("a_i", c95684Sc.A1I);
                        A00.AAP("nav_chain", c95684Sc.A13);
                        z = true;
                    } else {
                        throw new IllegalStateException("loopCount should not be null.");
                    }
                } else {
                    throw new IllegalStateException("seqNum should not be null.");
                }
            } else {
                z = false;
            }
            C95714Sf c95714Sf = this.A07;
            if (c95714Sf != null) {
                if (z) {
                    if (c95714Sf.A0K != null) {
                        l2 = Long.valueOf(r0.intValue());
                    } else {
                        l2 = null;
                    }
                    A00.A9K("reel_position", l2);
                    if (c95714Sf.A0L != null) {
                        l3 = Long.valueOf(r0.intValue());
                    } else {
                        l3 = null;
                    }
                    A00.A9K("reel_size", l3);
                    A00.A7v("is_replay", c95714Sf.A03);
                    A00.AAP("host_video_pk", null);
                    if (c95714Sf.A0A != null) {
                        l4 = Long.valueOf(r0.intValue());
                    } else {
                        l4 = null;
                    }
                    A00.A9K("session_reel_counter", l4);
                    A00.AAP("tray_session_id", c95714Sf.A0a);
                    if (c95714Sf.A0N != null) {
                        l5 = Long.valueOf(r0.intValue());
                    } else {
                        l5 = null;
                    }
                    A00.A9K("tray_position", l5);
                    if (c95714Sf.A0H != null) {
                        l6 = Long.valueOf(r0.intValue());
                    } else {
                        l6 = null;
                    }
                    A00.A9K("mqtt_connection_status", l6);
                    if (c95714Sf.A06 != null) {
                        l7 = Long.valueOf(r0.intValue());
                    } else {
                        l7 = null;
                    }
                    A00.A9K("battery_level", l7);
                    A00.AAP("battery_status", c95714Sf.A0Q);
                    if (c95714Sf.A0E != null) {
                        l8 = Long.valueOf(r0.intValue());
                    } else {
                        l8 = null;
                    }
                    A00.A9K("live_donation", l8);
                    if (c95714Sf.A0J != null) {
                        l9 = Long.valueOf(r0.intValue());
                    } else {
                        l9 = null;
                    }
                    A00.A9K("number_of_qualities", l9);
                    if (c95714Sf.A0F != null) {
                        l10 = Long.valueOf(r0.intValue());
                    } else {
                        l10 = null;
                    }
                    A00.A9K("is_live_streaming", l10);
                    if (c95714Sf.A0C != null) {
                        l11 = Long.valueOf(r0.intValue());
                    } else {
                        l11 = null;
                    }
                    A00.A9K("has_igtv_video", l11);
                    if (c95714Sf.A0D != null) {
                        l12 = Long.valueOf(r0.intValue());
                    } else {
                        l12 = null;
                    }
                    A00.A9K("has_reshared_clips_video", l12);
                    A00.AAP("channel_id", null);
                    A00.AAP("channel_type", null);
                    A00.AAP("channel_session_id", null);
                    A00.AAP("subtype", c95714Sf.A0Z);
                    A00.AAP("position", c95714Sf.A0V);
                    A00.AAP("size", c95714Sf.A0W);
                    A00.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c95714Sf.A0P);
                    if (c95714Sf.A07 != null) {
                        l13 = Long.valueOf(r0.intValue());
                    } else {
                        l13 = null;
                    }
                    A00.A9K("carousel_index", l13);
                    A00.AAP("carousel_media_id", c95714Sf.A0S);
                    A00.AAP("carousel_cover_media_id", c95714Sf.A0R);
                    if (c95714Sf.A09 != null) {
                        l14 = Long.valueOf(r0.intValue());
                    } else {
                        l14 = null;
                    }
                    A00.A9K("carousel_size", l14);
                    if (c95714Sf.A08 != null) {
                        l15 = Long.valueOf(r0.intValue());
                    } else {
                        l15 = null;
                    }
                    A00.A9K("carousel_m_t", l15);
                    A00.A7v("video_subtitles_available", c95714Sf.A04);
                    A00.A7v("video_subtitles_displayed", c95714Sf.A05);
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
                String str4 = c95714Sf.A0Y;
                if (str4 != null) {
                    l = AbstractC003100w.A0k(10, str4);
                } else {
                    l = null;
                }
                String str5 = c95714Sf.A0X;
                if (str5 != null) {
                    l19 = AbstractC003100w.A0k(10, str5);
                }
                c0Zx.A05("story_preview_media_owner_id", l);
                c0Zx.A05("story_preview_media_id", l19);
                if (z) {
                    A00.AAQ(c0Zx, "adhoc_data");
                }
                C95684Sc c95684Sc2 = this.A06;
                if (c95684Sc2 == null || c95684Sc2.A16 == null) {
                    Integer num2 = c95714Sf.A0B;
                    if (num2 == null || num2.intValue() != 1) {
                        z2 = false;
                    }
                    if (z) {
                        A00.AAP("playback_format", c95714Sf.A0U);
                        A00.A7v("is_dash_eligible", Boolean.valueOf(z2));
                    }
                }
            }
            C95684Sc c95684Sc3 = this.A06;
            if (c95684Sc3 != null && (str = c95684Sc3.A0x) != null) {
                if (z) {
                    A00.A9K("host_profile_id", Long.valueOf(Long.parseLong(str)));
                } else {
                    return;
                }
            } else if (!z) {
                return;
            }
            A00.Cht();
        }
    }
}
