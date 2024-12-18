package X;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: X.15G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15G {
    public static C15G A09;
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C03880Jd A07;
    public final C15I A08;

    public static synchronized C15G A00() {
        C15G c15g;
        synchronized (C15G.class) {
            c15g = A09;
            if (c15g == null) {
                c15g = new C15G();
                A09 = c15g;
            }
        }
        return c15g;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("chip_name", this.A00);
            String str = this.A01;
            jSONObject.put("chip_vendor", str);
            jSONObject.put("platform_qualcomm", "qualcomm".equals(str));
            jSONObject.put("platform_samsung", "samsung".equals(str));
            jSONObject.put("platform_mediatek", "mediatek".equals(str));
            jSONObject.put("platform_spreadtrum", "spreadtrum".equals(str));
            jSONObject.put("platform_hisilicon", "hisilicon".equals(str));
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if ("samsung".equals(android.os.Build.MANUFACTURER) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        if (r3.A04 == 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15G() {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15G.<init>():void");
    }

    public static boolean A01() {
        try {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown") && !Build.MODEL.contains("google_sdk")) {
                String str2 = Build.MODEL;
                if (!str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                    if (!"google_sdk".equals(Build.PRODUCT)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }
}
