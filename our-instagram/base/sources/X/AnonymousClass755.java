package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.755, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass755 {
    public static final AnonymousClass755 A00 = new Object();

    public final C24531Hw A04(UserSession userSession, Integer num, String str, String str2, boolean z) {
        C14360o3.A0B(num, 3);
        C23711Eb A02 = AbstractC37797GkC.A02(userSession, 173651701);
        A02.A9s("should_stream_response", "true");
        A02.A9s("should_have_max_id_in_last_chunk_only", "true");
        A02.A0D("no_of_medias_in_each_chunk", 6);
        A02(A02, userSession, num, str, str2, null, z);
        return A02.A0N();
    }

    public static final C72083XNc A00(UserSession userSession, AnonymousClass435 anonymousClass435) {
        C2JS requiredTreeField;
        C65943Two c65943Two;
        C2JS c2js = (C2JS) anonymousClass435.A01;
        if (c2js != null && (requiredTreeField = c2js.getRequiredTreeField(0, "xdt_user_clips_graphql(data:$data)", C65942Twn.class, 352468645)) != null && (c65943Two = (C65943Two) requiredTreeField.reinterpretRequired(0, C65943Two.class, -2107973840)) != null) {
            return new C72083XNc(c65943Two.A0E(C1DS.A00(userSession)).A0q(), c65943Two, userSession, C1DS.A00(userSession));
        }
        throw new RuntimeException("Expected profile clips to be available");
    }

    public static final C1ON A01(UserSession userSession, String str, String str2) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("usertags/review/");
        c25621Ms.A9s(str, str2);
        c25621Ms.A9s("container_module", "feed_contextual_self_profile");
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final void A02(AbstractC23721Ec abstractC23721Ec, UserSession userSession, Integer num, String str, String str2, String str3, boolean z) {
        Integer num2 = C05F.A01;
        abstractC23721Ec.A09(num2);
        String str4 = "clips/user/";
        abstractC23721Ec.A0B("clips/user/");
        abstractC23721Ec.A9s("include_feed_video", "true");
        abstractC23721Ec.A0H("target_user_id", str);
        abstractC23721Ec.A0H("max_id", str2);
        abstractC23721Ec.A0H("audience", str3);
        if (str != null) {
            str4 = AnonymousClass001.A0R("clips/user/", str);
        }
        if (str2 != null) {
            str4 = AnonymousClass001.A0R(str4, str2);
        }
        abstractC23721Ec.A0A = str4;
        if (!z && !C2TN.A05(userSession, str)) {
            abstractC23721Ec.A08(C05F.A0N);
            abstractC23721Ec.A01 = TimeUnit.MINUTES.toMillis(60L);
        } else {
            abstractC23721Ec.A08(num2);
        }
        if (num == num2) {
            abstractC23721Ec.A9s("is_request_from_viewer", "true");
        }
    }

    public final PandoGraphQLRequest A03(UserSession userSession, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(num, 3);
        C0CA A02 = GraphQlCallInput.A02.A02();
        C0CA.A00(A02, true, "include_feed_video");
        C0CA.A00(A02, str, "target_user_id");
        C0CA.A00(A02, str2, "max_id");
        C0CA.A00(A02, str3, "audience");
        C0CA.A00(A02, Boolean.valueOf(z3), "sort_by_views");
        C0CA.A00(A02, 6, "no_of_medias_in_each_chunk");
        C0CA.A00(A02, true, "should_stream_response");
        C0CA.A00(A02, 12, "page_size");
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm2.A02("use_defer", false);
        c2jm2.A02("use_stream", false);
        c2jm2.A03("initial_stream_count", 0);
        c2jm2.A02("stream_use_customized_batch", true);
        c2jm2.A02("enable_likers_in_full_media", false);
        c2jm2.A02("enable_clips_metadata_in_light_media", false);
        c2jm2.A02("enable_thumbnails_in_light_media", false);
        c2jm2.A02("enable_video_versions_in_light_media", false);
        c2jm2.A02("enable_audience_in_light_media", false);
        c2jm2.A02("exclude_main_user_field", false);
        c2jm2.A02("exclude_caption_user_field", false);
        c2jm.A00.A02().A0E(A02, "data");
        c2jm2.A02("use_defer", true);
        if (z2) {
            c2jm2.A02("enable_audience_in_light_media", true);
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        c2jm2.A02("exclude_caption_user_field", Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36324673022996847L)));
        c2jm2.A02("exclude_main_user_field", Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36324673022931310L)));
        c2jm2.A02("use_stream", true);
        c2jm2.A02("enable_video_versions_in_light_media", true);
        c2jm2.A02("stream_use_customized_batch", true);
        c2jm2.A03("initial_stream_count", 6);
        c2jm2.A02("enable_likers_in_full_media", false);
        c2jm2.A02("enable_clips_metadata_in_light_media", false);
        c2jm2.A02("enable_thumbnails_in_light_media", false);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "ClipsProfileQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), AnonymousClass756.class, false, null, 0, null, "xdt_user_clips_graphql", new ArrayList());
        if (!z && !C2TN.A05(userSession, str)) {
            long millis = TimeUnit.MINUTES.toMillis(60L);
            pandoGraphQLRequest.setFreshCacheAgeMs(millis);
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(millis);
        }
        return pandoGraphQLRequest;
    }
}
