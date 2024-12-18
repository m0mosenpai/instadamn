package X;

import com.facebook.location.platform.api.Location;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.5JE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JE {
    public final String A00(List list) {
        int i;
        String str;
        Long l;
        String str2;
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        A0A.A0Q("num_segments", i);
        A0A.A0M("clips_segments");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5JD c5jd = (C5JD) it.next();
                A0A.A0d();
                A0A.A0Q("index", c5jd.A02);
                A0A.A0S("face_effect_id", c5jd.A0B);
                A0A.A0Q(Location.SPEED, c5jd.A03);
                String str3 = c5jd.A0H;
                String str4 = c5jd.A0E;
                if (C14360o3.A0K(str3, "54") && (str4 == null || AbstractC001900j.A0T(str4))) {
                    str3 = "4";
                }
                A0A.A0S("source_type", str3);
                A0A.A0Q("duration_ms", c5jd.A01);
                A0A.A0S("audio_type", c5jd.A0A);
                if (c5jd.A0K) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str = "0";
                }
                A0A.A0S("from_draft", str);
                A0A.A0Q("camera_position", c5jd.A00);
                A0A.A0S("media_folder", c5jd.A0D);
                A0A.A0S("media_type", MediaStreamTrack.VIDEO_TRACK_KIND);
                A0A.A0Q("original_media_type", c5jd.A05.A00);
                A0A.A0S("original_segment_hash", c5jd.A0F);
                A0A.A0T("is_remix", c5jd.A0M);
                C9ZE c9ze = c5jd.A06;
                String str5 = null;
                if (c9ze != null) {
                    str5 = c9ze.A03;
                }
                if (str5 != null) {
                    if (c9ze != null && (str2 = c9ze.A03) != null) {
                        A0A.A0S("source_media_group_id", str2);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C9ZE c9ze2 = c5jd.A06;
                if (c9ze2 != null && (l = c9ze2.A01) != null) {
                    A0A.A0R("source_media_id", l.longValue());
                    A0A.A0Q("trimmed_start_time_ms", c5jd.A04);
                }
                String str6 = c5jd.A0E;
                if (str6 != null && !AbstractC001900j.A0T(str6)) {
                    A0A.A0S("metagallery_media_id", c5jd.A0E);
                }
                A0A.A0T("has_reusable_template_asset", c5jd.A0J);
                Integer num = c5jd.A09;
                if (num != null) {
                    A0A.A0Q("reusable_template_media_asset_start_time_ms", num.intValue());
                }
                Integer num2 = c5jd.A08;
                if (num2 != null) {
                    A0A.A0Q("reusable_template_media_asset_end_time_ms", num2.intValue());
                }
                A0A.A0a();
            }
        }
        A0A.A0Z();
        A0A.A0a();
        A0A.close();
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
