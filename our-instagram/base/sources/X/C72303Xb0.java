package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Xb0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72303Xb0 extends C4SW {
    @Override // X.C4SW
    public final void A00(InterfaceC02550Ad interfaceC02550Ad) {
        boolean z;
        int i;
        C14360o3.A0B(interfaceC02550Ad, 0);
        InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, AbstractC111324zv.A00(3290));
        if (A0H.isSampled()) {
            C95684Sc c95684Sc = this.A06;
            Long l = null;
            if (c95684Sc != null) {
                Integer num = c95684Sc.A0Y;
                boolean z2 = false;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                String str = c95684Sc.A10;
                if (str == null) {
                    str = "0";
                }
                C4SX c4sx = c95684Sc.A00;
                if (c4sx == null) {
                    c4sx = new C4SX(AbstractC167007dF.A0d());
                }
                String str2 = c95684Sc.A1I;
                Object obj = c95684Sc.A0L;
                if (obj == null) {
                    obj = 0;
                }
                Object obj2 = c95684Sc.A0J;
                if (obj2 == null) {
                    obj2 = 0;
                }
                Integer num2 = c95684Sc.A0U;
                if (num2 != null && num2.intValue() == 1) {
                    z2 = true;
                }
                AbstractC37300Gc1.A0l(A0H, str);
                A0H.AAK(c4sx, "a_pk");
                A0H.AAP("a_i", str2);
                A0H.A9K("seq_num", AbstractC31171DnF.A0V(i));
                AbstractC72047XLn.A1W(A0H, Long.valueOf(AbstractC166987dD.A0N(obj)), obj2, "loop_count");
                A0H.A8I(TraceFieldType.RetryCount, AbstractC72046XLm.A0V(c95684Sc.A0M));
                A0H.A8I("duration", AbstractC72046XLm.A0V(c95684Sc.A0I));
                A0H.AAP("tracking_token", c95684Sc.A1H);
                A0H.AAP("video_type", c95684Sc.A1L);
                A0H.AAP("upload_id", c95684Sc.A1J);
                A0H.AAP("parent_m_pk", c95684Sc.A15);
                A0H.AAP("representation_id", c95684Sc.A1C);
                A0H.A9K("m_ts", c95684Sc.A0f);
                A0H.AAP("follow_status", c95684Sc.A0v);
                A0H.A9K("m_ix", AbstractC72047XLn.A0F(c95684Sc.A0S));
                A0H.A8I("time", AbstractC72046XLm.A0V(c95684Sc.A0H));
                A0H.A8I("timeAsPercent", c95684Sc.A0D);
                A0H.A7v("playing_audio", c95684Sc.A04);
                A0H.A8I(AbstractC111324zv.A00(4038), AbstractC72046XLm.A0V(c95684Sc.A0G));
                A0H.A8I("system_volume", null);
                Long l2 = null;
                A0H.A9K("carousel_index", null);
                A0H.AAP("carousel_media_id", null);
                A0H.A9K("carousel_media_type", null);
                A0H.A9K("carousel_size", null);
                A0H.AAP("carousel_cover_media_id", null);
                A0H.AAP("chaining_session_id", c95684Sc.A0p);
                A0H.AAP("viewer_session_id", c95684Sc.A1M);
                Integer num3 = c95684Sc.A0c;
                if (num3 != null) {
                    l2 = AbstractC25229BEm.A0n(num3);
                }
                A0H.A9K("video_width", l2);
                A0H.A9K(AbstractC111324zv.A00(1363), AbstractC72047XLn.A0F(c95684Sc.A0a));
                A0H.A9K("recent_bandwidth", AbstractC72047XLn.A0F(c95684Sc.A0W));
                A0H.A9K("is_dash_eligible", AbstractC72047XLn.A0F(c95684Sc.A0T));
                A0H.AAP("playback_format", c95684Sc.A16);
                A0H.AAP("video_codec", c95684Sc.A1K);
                A0H.A7v("is_replay", null);
                A0H.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, null);
                A0H.AAP("audience", c95684Sc.A0h);
                A0H.AAP("effect_id", c95684Sc.A0t);
                A0H.AAP("channel_pk", c95684Sc.A0r);
                A0H.AAP("ranking_info_token", c95684Sc.A1A);
                A0H.AAP("mezql_token", c95684Sc.A11);
                A0H.AAP(AbstractC111324zv.A00(396), c95684Sc.A0s);
                A0H.AAP(AbstractC111324zv.A00(2024), c95684Sc.A0o);
                A0H.A7v("is_video_to_carousel", c95684Sc.A09);
                A0H.AAP("connection_type", c95684Sc.A0q);
                A0H.A8I("device_lat", c95684Sc.A0B);
                A0H.A8I("device_long", c95684Sc.A0C);
                A0H.AAP("error_message", c95684Sc.A0u);
                A0H.AAP("hardware_address", c95684Sc.A0m);
                A0H.AAP("original_start_reason", c95684Sc.A14);
                A0H.A7v("pip", Boolean.valueOf(z2));
                A0H.AAP("random_session_id", c95684Sc.A18);
                A0H.AAP("reason", c95684Sc.A1B);
                A0H.A9K("recent_bandwidth", AbstractC72047XLn.A0F(c95684Sc.A0W));
                A0H.A9K("segment_count", AbstractC72047XLn.A0F(c95684Sc.A0b));
                A0H.A8I("view_height", AbstractC72046XLm.A0V(c95684Sc.A0P));
                A0H.A8I("view_width", AbstractC72046XLm.A0V(c95684Sc.A0Q));
                A0H.AAP("nav_chain", c95684Sc.A13);
                z = true;
            } else {
                z = false;
            }
            C95714Sf c95714Sf = this.A07;
            if (c95714Sf != null) {
                if (z) {
                    A0H.A9K("reel_position", AbstractC72047XLn.A0F(c95714Sf.A0K));
                    A0H.A9K("reel_size", AbstractC72047XLn.A0F(c95714Sf.A0L));
                    A0H.A7v("is_replay", c95714Sf.A03);
                    A0H.AAP("host_video_pk", null);
                    A0H.A9K("session_reel_counter", AbstractC72047XLn.A0F(c95714Sf.A0A));
                    A0H.AAP("tray_session_id", c95714Sf.A0a);
                    A0H.A9K("tray_position", AbstractC72047XLn.A0F(c95714Sf.A0N));
                    A0H.A9K("mqtt_connection_status", AbstractC72047XLn.A0F(c95714Sf.A0H));
                    A0H.A9K("battery_level", AbstractC72047XLn.A0F(c95714Sf.A06));
                    A0H.AAP("battery_status", c95714Sf.A0Q);
                    A0H.A9K("live_donation", AbstractC72047XLn.A0F(c95714Sf.A0E));
                    A0H.A9K("number_of_qualities", AbstractC72047XLn.A0F(c95714Sf.A0J));
                    A0H.A9K("is_live_streaming", AbstractC72047XLn.A0F(c95714Sf.A0F));
                    A0H.A9K(AbstractC111324zv.A00(4537), AbstractC72047XLn.A0F(c95714Sf.A0C));
                    A0H.A9K(AbstractC111324zv.A00(4546), AbstractC72047XLn.A0F(c95714Sf.A0D));
                    A0H.AAP("channel_id", null);
                    A0H.AAP("channel_type", null);
                    A0H.AAP("subtype", c95714Sf.A0Z);
                    A0H.AAP("position", c95714Sf.A0V);
                    A0H.AAP("size", c95714Sf.A0W);
                    A0H.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c95714Sf.A0P);
                    A0H.A9K("carousel_index", AbstractC72047XLn.A0F(c95714Sf.A07));
                    A0H.AAP("carousel_media_id", c95714Sf.A0S);
                    A0H.AAP("carousel_cover_media_id", c95714Sf.A0R);
                    A0H.A9K("carousel_size", AbstractC72047XLn.A0F(c95714Sf.A09));
                    A0H.A9K("carousel_m_t", AbstractC72047XLn.A0F(c95714Sf.A08));
                }
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06(AbstractC111324zv.A00(442), null);
                c0Zx.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
                c0Zx.A06("surface", null);
                c0Zx.A06("component_type", null);
                c0Zx.A03("was_live", null);
                c0Zx.A05("video_x_position", null);
                c0Zx.A05("video_y_position", null);
                c0Zx.A06(AbstractC111324zv.A00(269), null);
                c0Zx.A03("captions_available", c95714Sf.A04);
                c0Zx.A03("captions_displayed", c95714Sf.A05);
                Long A0W = AbstractC37302Gc3.A0W(c95714Sf.A0Y);
                Long A0W2 = AbstractC37302Gc3.A0W(c95714Sf.A0X);
                c0Zx.A05(AbstractC111324zv.A00(3165), A0W);
                c0Zx.A05(AbstractC111324zv.A00(3164), A0W2);
                if (z) {
                    A0H.AAQ(c0Zx, "adhoc_data");
                }
                C95684Sc c95684Sc2 = this.A06;
                if (c95684Sc2 == null || c95684Sc2.A16 == null) {
                    if (z) {
                        A0H.AAP("playback_format", c95714Sf.A0U);
                        Integer num4 = c95714Sf.A0B;
                        if (num4 != null) {
                            l = AbstractC25229BEm.A0n(num4);
                        }
                        A0H.A9K("is_dash_eligible", l);
                        A0H.Cht();
                    }
                    return;
                }
            }
            if (!z) {
                return;
            }
            A0H.Cht();
        }
    }
}
