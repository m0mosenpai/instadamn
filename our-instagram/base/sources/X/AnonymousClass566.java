package X;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.566, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass566 {
    public static Pair A00(UserSession userSession) {
        String string = AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("preference_supported_ar_capabilities_as_json", null);
        if (string == null) {
            string = A03(userSession).toString();
        }
        return new Pair("supported_capabilities_new", string);
    }

    public static String A02(String str) {
        if (str.startsWith("etc")) {
            return "ETC";
        }
        if (str.startsWith("pvr")) {
            return "PVR";
        }
        if (str.startsWith("astc")) {
            return "ASTC";
        }
        AbstractC12120kG.A01("ArEffectSupportedCapabilities", "Unsupported texture compression.");
        return "";
    }

    public static JSONArray A03(UserSession userSession) {
        Map A00 = AnonymousClass567.A00();
        Map A03 = C56A.A03(AbstractC12290kX.A00, new AnonymousClass569(userSession), A00);
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, Arrays.asList(C56G.A01));
        String join2 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, Arrays.asList(C56G.A00));
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "SUPPORTED_SDK_VERSIONS");
            jSONObject.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, join);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "SUPPORTED_BETA_SDK_VERSIONS");
            jSONObject2.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, join2);
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "FACE_TRACKER_VERSION");
            jSONObject3.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, String.valueOf(14));
            jSONArray.put(jSONObject3);
            if ("segmentation_enabled".equals(A03.get("segmentation"))) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "segmentation");
                jSONObject4.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "segmentation_enabled");
                jSONArray.put(jSONObject4);
            }
            for (String str : A00.keySet()) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "COMPRESSION");
                jSONObject5.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str.toUpperCase(Locale.US));
                jSONArray.put(jSONObject5);
            }
            if ("world_tracker_enabled".equals(A03.get("world_tracker"))) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "world_tracker");
                jSONObject6.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "world_tracker_enabled");
                jSONArray.put(jSONObject6);
            }
            if ("gyroscope_enabled".equals(A03.get("gyroscope"))) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "gyroscope");
                jSONObject7.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "gyroscope_enabled");
                jSONArray.put(jSONObject7);
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean A05() {
        String str;
        C56E c56e = C56E.A06;
        C56E.A00(c56e, true);
        if (c56e.A02 && (str = Build.CPU_ABI) != null && str.toLowerCase().contains("arm64")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r1.contains("GL_KHR_texture_compression_astc_hdr") == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2JO A01(com.instagram.common.session.UserSession r9) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass566.A01(com.instagram.common.session.UserSession):X.2JO");
    }

    public static JSONObject A04(UserSession userSession) {
        C2JO A01 = A01(userSession);
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(A01.A00, A01, treeMap);
        return new JSONObject(treeMap);
    }
}
