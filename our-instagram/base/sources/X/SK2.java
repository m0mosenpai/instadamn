package X;

import android.content.Context;
import android.graphics.ColorSpace;
import android.hardware.display.DisplayManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.view.Display;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes10.dex */
public final class SK2 {
    public final void A00(Context context) {
        DisplayManager displayManager;
        int i;
        ColorSpace preferredWideGamutColorSpace;
        String name;
        C006802i c006802i = C006802i.A0p;
        try {
            c006802i.markerStart(115358944);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Object systemService = context.getSystemService("display");
            if ((systemService instanceof DisplayManager) && (displayManager = (DisplayManager) systemService) != null) {
                A1I.put("display_count", Integer.valueOf(displayManager.getDisplays().length));
                boolean z = false;
                Display display = displayManager.getDisplay(0);
                if (display != null) {
                    A1I.put("display_info", display);
                    A1I.put("display_width", Integer.valueOf(display.getWidth()));
                    A1I.put("display_height", Integer.valueOf(display.getHeight()));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 29 && (preferredWideGamutColorSpace = display.getPreferredWideGamutColorSpace()) != null && (name = preferredWideGamutColorSpace.getName()) != null) {
                        A1I.put("preferred_wide_gamut_colorspace", name);
                    }
                    A1I.put("is_wide_gamut", Boolean.valueOf(display.isWideColorGamut()));
                    Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
                    int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    C14360o3.A07(supportedHdrTypes);
                    List A0G = AbstractC009903n.A0G(supportedHdrTypes);
                    int size = A0G.size();
                    if (size > 0) {
                        z = true;
                    }
                    A1I.put("hdr_support", Boolean.valueOf(z));
                    A1I.put("hdr_type_count", Integer.valueOf(size));
                    A1I.put("hdr_types", A0G);
                    A1I.put("luma_min", Float.valueOf(hdrCapabilities.getDesiredMinLuminance()));
                    A1I.put("luma_max", Float.valueOf(hdrCapabilities.getDesiredMaxLuminance()));
                    A1I.put("luma_avg", Float.valueOf(hdrCapabilities.getDesiredMaxAverageLuminance()));
                    if (i2 >= 34) {
                        A1I.put("hdr_sdr_ratio_available", Boolean.valueOf(display.isHdrSdrRatioAvailable()));
                        A1I.put("hdr_sdr_ratio", Float.valueOf(display.getHdrSdrRatio()));
                    }
                }
                LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                Object systemService2 = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                C14360o3.A0C(systemService2, MSV.A00(7));
                AudioDeviceInfo[] devices = ((AudioManager) systemService2).getDevices(2);
                A1I2.put("audio_output_dev_count", Integer.valueOf(devices.length));
                JSONArray A0p = AbstractC31171DnF.A0p();
                C0s6 c0s6 = new C0s6(devices);
                while (c0s6.hasNext()) {
                    Object next = c0s6.next();
                    C14360o3.A07(next);
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) next;
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    int[] channelCounts = audioDeviceInfo.getChannelCounts();
                    C14360o3.A07(channelCounts);
                    A0q.put("channel_count", AbstractC009903n.A0G(channelCounts));
                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, audioDeviceInfo.getType());
                    int[] encodings = audioDeviceInfo.getEncodings();
                    C14360o3.A07(encodings);
                    A0q.put("encoding", AbstractC009903n.A0G(encodings));
                    int[] sampleRates = audioDeviceInfo.getSampleRates();
                    C14360o3.A07(sampleRates);
                    A0p.put(A0q.put(MSV.A00(117), AbstractC009903n.A0G(sampleRates)));
                }
                A1I2.put("audio_dev_json", A0p);
                LinkedHashMap A1I3 = AbstractC166987dD.A1I();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null && (i = Build.VERSION.SDK_INT) >= 29) {
                    A1I3.put("thermal_stat", String.valueOf(powerManager.getCurrentThermalStatus()));
                    if (i >= 30) {
                        A1I3.put("thermal_headroom_30", String.valueOf(powerManager.getThermalHeadroom(30)));
                    }
                }
                C09530e4 A1L = AbstractC166987dD.A1L("emoji_bright_bug", Boolean.valueOf(C62921SXd.A00.A00()));
                C09530e4 A1L2 = AbstractC166987dD.A1L("light_sensor_lux", Float.valueOf(AbstractC71553Ja.A00));
                LinkedHashMap A1I4 = AbstractC166987dD.A1I();
                A1I4.put("fingerprint", Build.FINGERPRINT);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 31) {
                    SUo sUo = SUo.A00;
                    SI3 si3 = SUo.A01;
                    if (si3 == null) {
                        synchronized (sUo) {
                            try {
                                si3 = SUo.A01;
                                if (si3 == null) {
                                    si3 = new SI3(AbstractC166987dD.A0O(context));
                                    SUo.A01 = si3;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    A1I4.put("playservice_mpc", Integer.valueOf(AbstractC166987dD.A0H(si3.A04.getValue())));
                    A1I4.put("sdk_mpc", Integer.valueOf(Build.VERSION.MEDIA_PERFORMANCE_CLASS));
                }
                C06860Yd c06860Yd = new C06860Yd();
                c06860Yd.put("physical_ram_kb", Integer.valueOf(AbstractC166987dD.A0H(O1C.A07.getValue())));
                c06860Yd.put("cpu_core_count", Integer.valueOf(AbstractC166987dD.A0H(O1C.A02.getValue())));
                C06860Yd A0N = AbstractC16850sd.A0N(c06860Yd);
                C06860Yd c06860Yd2 = new C06860Yd();
                if (i3 >= 33) {
                    try {
                        c06860Yd2.put("dv_dec_supported", Boolean.valueOf(C63394SjK.A05()));
                        c06860Yd2.put("dv_enc_supported", Boolean.valueOf(C63394SjK.A06()));
                        String A00 = C63394SjK.A00();
                        if (A00 == null) {
                            A00 = NetInfoModule.CONNECTION_TYPE_NONE;
                        }
                        c06860Yd2.put("dv_enc_name", A00);
                        c06860Yd2.put("dv_screen_supported", Boolean.valueOf(C63394SjK.A07()));
                        c06860Yd2.put("dv_camera_supported", Boolean.valueOf(C63394SjK.A04()));
                        c06860Yd2.put("dv_dec_list", C63394SjK.A02());
                        c06860Yd2.put("dv_all_codec_list", C63394SjK.A01());
                    } catch (Throwable th2) {
                        new C09540e5(th2);
                    }
                }
                C06860Yd A0N2 = AbstractC16850sd.A0N(c06860Yd2);
                LinkedHashMap linkedHashMap = new LinkedHashMap(A1I2);
                linkedHashMap.putAll(A1I);
                Iterator A14 = AbstractC166997dE.A14(AbstractC06930Yk.A04(AbstractC06930Yk.A04(AbstractC06930Yk.A04(AbstractC06930Yk.A0C(AbstractC06930Yk.A0C(AbstractC06930Yk.A04(linkedHashMap, A1I3), A1L), A1L2), A1I4), A0N), A0N2));
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    c006802i.markerAnnotate(115358944, AbstractC31172DnG.A17(A1K), A1K.getValue().toString());
                }
                c006802i.markerEnd(115358944, (short) 2);
                return;
            }
            throw AbstractC166987dD.A14("cannot get display service");
        } catch (Throwable th3) {
            c006802i.markerAnnotate(115358944, "error", th3.toString());
            c006802i.markerEnd(115358944, (short) 3);
            C0w9.A07("screen_hdr_qpl_err", th3);
        }
    }
}
