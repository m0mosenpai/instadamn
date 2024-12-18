package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.Pyc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58609Pyc implements Runnable {
    public final /* synthetic */ C96T A00;

    public RunnableC58609Pyc(C96T c96t) {
        this.A00 = c96t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.json.JSONObject] */
    @Override // java.lang.Runnable
    public final void run() {
        Map A03;
        long j;
        String str;
        DisplayManager displayManager;
        Display[] displays;
        String obj;
        int[] supportedHdrTypes;
        String A0g;
        String str2;
        File[] listFiles;
        Object obj2;
        AnonymousClass150 A00 = AnonymousClass150.A00();
        while (true) {
            Queue queue = A00.A03;
            if (queue.isEmpty()) {
                break;
            }
            C2050595u c2050595u = (C2050595u) queue.poll();
            if (c2050595u != null) {
                AnonymousClass150.A01(c2050595u, C1K3.A00);
            }
        }
        for (C62595SHy c62595SHy : A00.A02) {
            if (!c62595SHy.A00) {
                c62595SHy.A00 = true;
                try {
                    C15E c15e = c62595SHy.A01;
                    if (c15e != null && (A03 = c15e.A03()) != null) {
                        C2050595u c2050595u2 = new C2050595u(0, 45, true);
                        c2050595u2.A02("event", "cpu_boost_device_compatibility");
                        for (Map.Entry entry : A03.entrySet()) {
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            if (str4 == null) {
                                str4 = "no data";
                            }
                            c2050595u2.A02(str3, str4);
                        }
                        c2050595u2.A02("build_product", Build.PRODUCT);
                        c2050595u2.A02("build_model", Build.MODEL);
                        c2050595u2.A02("build_brand", Build.BRAND);
                        c2050595u2.A02("build_board", Build.BOARD);
                        c2050595u2.A02("build_device", Build.DEVICE);
                        c2050595u2.A02("build_manufacturer", Build.MANUFACTURER);
                        C15G A002 = C15G.A00();
                        c2050595u2.A02("chip_name", A002.A00);
                        String str5 = A002.A01;
                        c2050595u2.A02("chip_vendor", str5);
                        c2050595u2.A02("platform_qualcomm", String.valueOf("qualcomm".equals(str5)));
                        c2050595u2.A02("platform_samsung", String.valueOf("samsung".equals(str5)));
                        c2050595u2.A02("platform_mediatek", String.valueOf("mediatek".equals(str5)));
                        c2050595u2.A02("platform_spreadtrum", String.valueOf("spreadtrum".equals(str5)));
                        c2050595u2.A02("platform_hisilicon", String.valueOf("hisilicon".equals(str5)));
                        C15I c15i = C15G.A00().A08;
                        c2050595u2.A01("cores", c15i.A02);
                        c2050595u2.A02("is_biglittle", String.valueOf(c15i.A07));
                        if (c15i.A07) {
                            int[] iArr = c15i.A0C;
                            int i = iArr[1];
                            int i2 = iArr[0];
                            c2050595u2.A01("little_freq_min", (i2 + ((int) ((i - i2) * 0.0d))) / 1000);
                            int[] iArr2 = c15i.A0C;
                            int i3 = iArr2[1];
                            int i4 = iArr2[0];
                            c2050595u2.A01("little_freq_max", (i4 + ((int) ((i3 - i4) * 1.0d))) / 1000);
                            int[] iArr3 = c15i.A0A;
                            int i5 = iArr3[1];
                            int i6 = iArr3[0];
                            c2050595u2.A01("big_freq_min", (i6 + ((int) ((i5 - i6) * 0.0d))) / 1000);
                            int[] iArr4 = c15i.A0A;
                            int i7 = iArr4[1];
                            int i8 = iArr4[0];
                            c2050595u2.A01("big_freq_max", (i8 + ((int) ((i7 - i8) * 1.0d))) / 1000);
                            c2050595u2.A01("little_cores", c15i.A03);
                            c2050595u2.A01("big_cores", c15i.A00);
                            int i9 = c15i.A05;
                            if (i9 != 0) {
                                c2050595u2.A01("mid_cores", i9);
                            }
                            c2050595u2.A01("little_index", c15i.A04);
                            j = c15i.A01;
                            str = "big_index";
                        } else {
                            int[] iArr5 = c15i.A0B;
                            int i10 = iArr5[1];
                            int i11 = iArr5[0];
                            c2050595u2.A01("freq_min", (i11 + ((int) ((i10 - i11) * 0.0d))) / 1000);
                            int[] iArr6 = c15i.A0B;
                            int i12 = iArr6[1];
                            j = (iArr6[0] + ((int) ((i12 - r8) * 1.0d))) / 1000;
                            str = "freq_max";
                        }
                        c2050595u2.A01(str, j);
                        c2050595u2.A02("prebuild", String.valueOf(c15i.A09));
                        c2050595u2.A02("video_decode", AbstractC62784SRc.A00(false));
                        c2050595u2.A02("video_encode", AbstractC62784SRc.A00(true));
                        c2050595u2.A02("format_decode", AbstractC62784SRc.A01(false));
                        c2050595u2.A02("format_encode", AbstractC62784SRc.A01(true));
                        JSONObject jSONObject = new JSONObject();
                        int i13 = 0;
                        String[] strArr = {"/vendor/etc/", "/etc", "/system/etc/"};
                        do {
                            File file = new File(strArr[i13]);
                            if (file.exists() && (listFiles = file.listFiles()) != null) {
                                for (File file2 : listFiles) {
                                    String name = file2.getName();
                                    if (name.startsWith("media_codecs_performance") && name.endsWith(".xml")) {
                                        try {
                                            String canonicalPath = file2.getCanonicalPath();
                                            jSONObject.put(canonicalPath, "Start");
                                            if (file2.canRead()) {
                                                obj2 = new JSONObject();
                                                try {
                                                    XmlPullParser newPullParser = android.util.Xml.newPullParser();
                                                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                                                    newPullParser.setInput(new FileReader(file2));
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                                                        if (eventType == 2) {
                                                            String name2 = newPullParser.getName();
                                                            if (!name2.equals("MediaCodec")) {
                                                                if (name2.equals("Limit")) {
                                                                    jSONObject2.getJSONObject("limits").put(newPullParser.getAttributeValue(0), newPullParser.getAttributeValue(1));
                                                                }
                                                            } else {
                                                                String attributeValue = newPullParser.getAttributeValue(0);
                                                                jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, newPullParser.getAttributeValue(1));
                                                                jSONObject2.put("limits", new JSONObject());
                                                                obj2.put(attributeValue, jSONObject2);
                                                            }
                                                        } else if (eventType == 3 && newPullParser.getName().equals("MediaCodec")) {
                                                            jSONObject2 = new JSONObject();
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            } else {
                                                obj2 = "Can't Read";
                                            }
                                            jSONObject.put(canonicalPath, obj2);
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                }
                            }
                            i13++;
                        } while (i13 < 3);
                        c2050595u2.A02("achievable_fps", jSONObject.toString());
                        Context context = C62595SHy.A04;
                        if (context != null && (displayManager = (DisplayManager) context.getSystemService("display")) != null && (displays = displayManager.getDisplays()) != null) {
                            c2050595u2.A02("display_count", String.valueOf(displays.length));
                            Display display = displayManager.getDisplay(0);
                            if (display != null && (obj = display.toString()) != null) {
                                c2050595u2.A02("default_display_info", obj);
                                Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
                                if (hdrCapabilities != null && (supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes()) != null) {
                                    int length = supportedHdrTypes.length;
                                    boolean z = false;
                                    if (length >= 1) {
                                        z = true;
                                    }
                                    c2050595u2.A02("hdr_supported", String.valueOf(z));
                                    c2050595u2.A02("hdr_type_count", String.valueOf(length));
                                    for (int i14 = 0; i14 < length; i14++) {
                                        int i15 = supportedHdrTypes[i14];
                                        if (i15 != 1) {
                                            if (i15 != 2) {
                                                if (i15 != 3) {
                                                    A0g = AnonymousClass001.A0g("hdr_type[", String.valueOf(i14), "]");
                                                    if (i15 != 4) {
                                                        str2 = "INVALID_HDR_TYPE";
                                                    } else {
                                                        str2 = "HDR_TYPE_HDR10_PLUS";
                                                    }
                                                } else {
                                                    A0g = AnonymousClass001.A0g("hdr_type[", String.valueOf(i14), "]");
                                                    str2 = "HDR_TYPE_HLG";
                                                }
                                            } else {
                                                A0g = AnonymousClass001.A0g("hdr_type[", String.valueOf(i14), "]");
                                                str2 = "HDR_TYPE_HDR10";
                                            }
                                        } else {
                                            A0g = AnonymousClass001.A0g("hdr_type[", String.valueOf(i14), "]");
                                            str2 = "HDR_TYPE_DOLBY_VISION";
                                        }
                                        c2050595u2.A02(A0g, str2);
                                    }
                                }
                            }
                        }
                        c62595SHy.A03.CjC(c2050595u2);
                    }
                } catch (Error | Exception e) {
                    c62595SHy.A02.A00.EmP("MobileBoost", "TrackingError", e);
                }
            }
        }
    }
}
