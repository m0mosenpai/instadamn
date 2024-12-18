package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OLV {
    public final XC1 A00;
    public final String A01;

    public final void A00(C51673Ms4 c51673Ms4, Integer num, String str, String str2, Throwable th, Map map) {
        Long l;
        String str3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c51673Ms4 != null) {
            if (map != null) {
                A1I.putAll(map);
            }
            A1I.put("snapshot_type", AbstractC53757Nq9.A00(c51673Ms4.A01));
            str3 = c51673Ms4.A04;
            l = Long.valueOf(c51673Ms4.A00);
        } else {
            l = null;
            str3 = null;
        }
        A01(num, null, l, str3, str, str2, th, null, A1I);
    }

    public final void A02(Integer num, Integer num2, Long l, String str, Throwable th, Map map) {
        A01(num, num2, l, str, null, null, th, null, map);
    }

    public final void A01(Integer num, Integer num2, Long l, String str, String str2, String str3, Throwable th, Map map, Map map2) {
        JSONObject jSONObject;
        String str4;
        XC1 xc1 = this.A00;
        if (xc1 != null) {
            try {
                HashMap A1G = AbstractC166987dD.A1G();
                String str5 = this.A01;
                if (str5 != null) {
                    A1G.put("waterfall_id", str5);
                }
                if (str2 != null) {
                    A1G.put("uploaded_media_id", str2);
                }
                if (str != null) {
                    A1G.put("player_session_id", str);
                }
                if (map2 == null) {
                    jSONObject = AbstractC31171DnF.A0q();
                } else {
                    jSONObject = new JSONObject(map2);
                }
                if (l != null) {
                    jSONObject.put("timestamp_us", String.valueOf(l.longValue()));
                }
                if (num2 != null) {
                    jSONObject.put("snapshot_type", AbstractC53757Nq9.A00(num2));
                }
                if (jSONObject.length() > 0) {
                    A1G.put("snapshot_reference", jSONObject.toString());
                }
                if (th != null) {
                    String message = th.getMessage();
                    if (message != null) {
                        A1G.put("error_message", message);
                    }
                    A1G.put("error_stack_trace", android.util.Log.getStackTraceString(th));
                }
                if (str3 != null) {
                    String A0h = AbstractC31171DnF.A0h("error_message", A1G);
                    if (A0h != null) {
                        str3 = AnonymousClass001.A0g(str3, ": ", A0h);
                    }
                    A1G.put("error_message", str3);
                }
                if (map != null) {
                    A1G.put("error_params", new JSONObject(map).toString());
                }
                switch (num.intValue()) {
                    case 0:
                        str4 = "media_accuracy_client_generic_error";
                        break;
                    case 1:
                        str4 = "media_accuracy_capturer_intermediate";
                        break;
                    case 2:
                        str4 = "media_accuracy_capturer_completed";
                        break;
                    case 3:
                        str4 = "media_accuracy_capturer_failed";
                        break;
                    case 4:
                        str4 = "media_accuracy_effects_burner_completed";
                        break;
                    case 5:
                        str4 = "media_accuracy_effects_burner_failed";
                        break;
                    case 6:
                        str4 = "media_accuracy_uploader_started";
                        break;
                    case 7:
                        str4 = "media_accuracy_uploader_completed";
                        break;
                    case 8:
                        str4 = "media_accuracy_uploader_failed";
                        break;
                    case 9:
                        str4 = "media_accuracy_uploader_cancelled";
                        break;
                    case 10:
                        str4 = "media_accuracy_uploader_skipped";
                        break;
                    case 11:
                        str4 = "media_accuracy_audio_recorder_started";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str4 = "media_accuracy_audio_recorder_completed";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str4 = "media_accuracy_audio_recorder_failed";
                        break;
                    default:
                        str4 = "media_accuracy_audio_file_created";
                        break;
                }
                xc1.logEvent(str4, A1G);
            } catch (Throwable unused) {
            }
        }
    }

    public OLV(XC1 xc1, String str) {
        this.A00 = xc1;
        this.A01 = str;
    }
}
