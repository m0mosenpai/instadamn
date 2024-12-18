package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1MS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MS implements InterfaceC12870lZ, C1MT, C1MU {
    public static C1MS A0A;
    public static final C1MV A0B = new Object();
    public ScheduledFuture A02;
    public boolean A03;
    public final LightweightQuickPerformanceLogger A04;
    public final C1MX A05;
    public final C1F1 A06;
    public final C23111Aq A07;
    public final Executor A09;
    public final Map A08 = Collections.synchronizedMap(new HashMap());
    public Boolean A00 = null;
    public Boolean A01 = null;

    private final synchronized void A00() {
        if (this.A03 && this.A02 == null) {
            this.A02 = C14250np.A00().A00.scheduleAtFixedRate(new Runnable() { // from class: X.939
                @Override // java.lang.Runnable
                public final void run() {
                    C124265jg c124265jg;
                    synchronized (C124265jg.class) {
                        c124265jg = C124265jg.A0A;
                        if (c124265jg == null) {
                            throw new IllegalStateException("getInstance() called before initialize()");
                        }
                    }
                    if (!c124265jg.A04.A08()) {
                        C1MS c1ms = C1MS.this;
                        for (Map.Entry entry : c1ms.A01().entrySet()) {
                            File file = (File) entry.getKey();
                            c1ms.A09.execute(new RunnableC24749AxX((C1MF) entry.getValue(), c1ms, file));
                        }
                    }
                }
            }, 30L, 30L, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
    
        if (r6 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        if (r1.A02.longValue() == Long.MIN_VALUE) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a0 A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:3:0x0026, B:5:0x0031, B:7:0x0035, B:8:0x0040, B:10:0x0044, B:11:0x0046, B:12:0x004b, B:151:0x0064, B:152:0x006d, B:154:0x008f, B:156:0x0099, B:14:0x00a3, B:16:0x00a9, B:18:0x00ad, B:21:0x00c0, B:22:0x00c6, B:24:0x00cc, B:26:0x00d2, B:28:0x00d6, B:29:0x00d8, B:35:0x0222, B:36:0x0226, B:37:0x0232, B:39:0x0238, B:41:0x024a, B:42:0x024c, B:59:0x0252, B:45:0x0255, B:56:0x0262, B:48:0x0265, B:51:0x0272, B:62:0x0275, B:66:0x010e, B:71:0x0124, B:73:0x012f, B:75:0x0135, B:77:0x0145, B:80:0x0155, B:88:0x0166, B:90:0x016f, B:91:0x0173, B:93:0x0179, B:96:0x0181, B:99:0x018d, B:107:0x01a0, B:108:0x01ac, B:110:0x01b2, B:112:0x01ba, B:114:0x01c4, B:116:0x01d3, B:123:0x01e5, B:124:0x01f1, B:126:0x01f7, B:129:0x020c, B:132:0x0218, B:138:0x011b, B:140:0x00e6, B:142:0x00ea, B:143:0x00f8, B:145:0x00fe, B:148:0x0105, B:158:0x0069, B:159:0x0050, B:161:0x005a), top: B:2:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e5 A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:3:0x0026, B:5:0x0031, B:7:0x0035, B:8:0x0040, B:10:0x0044, B:11:0x0046, B:12:0x004b, B:151:0x0064, B:152:0x006d, B:154:0x008f, B:156:0x0099, B:14:0x00a3, B:16:0x00a9, B:18:0x00ad, B:21:0x00c0, B:22:0x00c6, B:24:0x00cc, B:26:0x00d2, B:28:0x00d6, B:29:0x00d8, B:35:0x0222, B:36:0x0226, B:37:0x0232, B:39:0x0238, B:41:0x024a, B:42:0x024c, B:59:0x0252, B:45:0x0255, B:56:0x0262, B:48:0x0265, B:51:0x0272, B:62:0x0275, B:66:0x010e, B:71:0x0124, B:73:0x012f, B:75:0x0135, B:77:0x0145, B:80:0x0155, B:88:0x0166, B:90:0x016f, B:91:0x0173, B:93:0x0179, B:96:0x0181, B:99:0x018d, B:107:0x01a0, B:108:0x01ac, B:110:0x01b2, B:112:0x01ba, B:114:0x01c4, B:116:0x01d3, B:123:0x01e5, B:124:0x01f1, B:126:0x01f7, B:129:0x020c, B:132:0x0218, B:138:0x011b, B:140:0x00e6, B:142:0x00ea, B:143:0x00f8, B:145:0x00fe, B:148:0x0105, B:158:0x0069, B:159:0x0050, B:161:0x005a), top: B:2:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x011b A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:3:0x0026, B:5:0x0031, B:7:0x0035, B:8:0x0040, B:10:0x0044, B:11:0x0046, B:12:0x004b, B:151:0x0064, B:152:0x006d, B:154:0x008f, B:156:0x0099, B:14:0x00a3, B:16:0x00a9, B:18:0x00ad, B:21:0x00c0, B:22:0x00c6, B:24:0x00cc, B:26:0x00d2, B:28:0x00d6, B:29:0x00d8, B:35:0x0222, B:36:0x0226, B:37:0x0232, B:39:0x0238, B:41:0x024a, B:42:0x024c, B:59:0x0252, B:45:0x0255, B:56:0x0262, B:48:0x0265, B:51:0x0272, B:62:0x0275, B:66:0x010e, B:71:0x0124, B:73:0x012f, B:75:0x0135, B:77:0x0145, B:80:0x0155, B:88:0x0166, B:90:0x016f, B:91:0x0173, B:93:0x0179, B:96:0x0181, B:99:0x018d, B:107:0x01a0, B:108:0x01ac, B:110:0x01b2, B:112:0x01ba, B:114:0x01c4, B:116:0x01d3, B:123:0x01e5, B:124:0x01f1, B:126:0x01f7, B:129:0x020c, B:132:0x0218, B:138:0x011b, B:140:0x00e6, B:142:0x00ea, B:143:0x00f8, B:145:0x00fe, B:148:0x0105, B:158:0x0069, B:159:0x0050, B:161:0x005a), top: B:2:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:3:0x0026, B:5:0x0031, B:7:0x0035, B:8:0x0040, B:10:0x0044, B:11:0x0046, B:12:0x004b, B:151:0x0064, B:152:0x006d, B:154:0x008f, B:156:0x0099, B:14:0x00a3, B:16:0x00a9, B:18:0x00ad, B:21:0x00c0, B:22:0x00c6, B:24:0x00cc, B:26:0x00d2, B:28:0x00d6, B:29:0x00d8, B:35:0x0222, B:36:0x0226, B:37:0x0232, B:39:0x0238, B:41:0x024a, B:42:0x024c, B:59:0x0252, B:45:0x0255, B:56:0x0262, B:48:0x0265, B:51:0x0272, B:62:0x0275, B:66:0x010e, B:71:0x0124, B:73:0x012f, B:75:0x0135, B:77:0x0145, B:80:0x0155, B:88:0x0166, B:90:0x016f, B:91:0x0173, B:93:0x0179, B:96:0x0181, B:99:0x018d, B:107:0x01a0, B:108:0x01ac, B:110:0x01b2, B:112:0x01ba, B:114:0x01c4, B:116:0x01d3, B:123:0x01e5, B:124:0x01f1, B:126:0x01f7, B:129:0x020c, B:132:0x0218, B:138:0x011b, B:140:0x00e6, B:142:0x00ea, B:143:0x00f8, B:145:0x00fe, B:148:0x0105, B:158:0x0069, B:159:0x0050, B:161:0x005a), top: B:2:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0238 A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:3:0x0026, B:5:0x0031, B:7:0x0035, B:8:0x0040, B:10:0x0044, B:11:0x0046, B:12:0x004b, B:151:0x0064, B:152:0x006d, B:154:0x008f, B:156:0x0099, B:14:0x00a3, B:16:0x00a9, B:18:0x00ad, B:21:0x00c0, B:22:0x00c6, B:24:0x00cc, B:26:0x00d2, B:28:0x00d6, B:29:0x00d8, B:35:0x0222, B:36:0x0226, B:37:0x0232, B:39:0x0238, B:41:0x024a, B:42:0x024c, B:59:0x0252, B:45:0x0255, B:56:0x0262, B:48:0x0265, B:51:0x0272, B:62:0x0275, B:66:0x010e, B:71:0x0124, B:73:0x012f, B:75:0x0135, B:77:0x0145, B:80:0x0155, B:88:0x0166, B:90:0x016f, B:91:0x0173, B:93:0x0179, B:96:0x0181, B:99:0x018d, B:107:0x01a0, B:108:0x01ac, B:110:0x01b2, B:112:0x01ba, B:114:0x01c4, B:116:0x01d3, B:123:0x01e5, B:124:0x01f1, B:126:0x01f7, B:129:0x020c, B:132:0x0218, B:138:0x011b, B:140:0x00e6, B:142:0x00ea, B:143:0x00f8, B:145:0x00fe, B:148:0x0105, B:158:0x0069, B:159:0x0050, B:161:0x005a), top: B:2:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135 A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:3:0x0026, B:5:0x0031, B:7:0x0035, B:8:0x0040, B:10:0x0044, B:11:0x0046, B:12:0x004b, B:151:0x0064, B:152:0x006d, B:154:0x008f, B:156:0x0099, B:14:0x00a3, B:16:0x00a9, B:18:0x00ad, B:21:0x00c0, B:22:0x00c6, B:24:0x00cc, B:26:0x00d2, B:28:0x00d6, B:29:0x00d8, B:35:0x0222, B:36:0x0226, B:37:0x0232, B:39:0x0238, B:41:0x024a, B:42:0x024c, B:59:0x0252, B:45:0x0255, B:56:0x0262, B:48:0x0265, B:51:0x0272, B:62:0x0275, B:66:0x010e, B:71:0x0124, B:73:0x012f, B:75:0x0135, B:77:0x0145, B:80:0x0155, B:88:0x0166, B:90:0x016f, B:91:0x0173, B:93:0x0179, B:96:0x0181, B:99:0x018d, B:107:0x01a0, B:108:0x01ac, B:110:0x01b2, B:112:0x01ba, B:114:0x01c4, B:116:0x01d3, B:123:0x01e5, B:124:0x01f1, B:126:0x01f7, B:129:0x020c, B:132:0x0218, B:138:0x011b, B:140:0x00e6, B:142:0x00ea, B:143:0x00f8, B:145:0x00fe, B:148:0x0105, B:158:0x0069, B:159:0x0050, B:161:0x005a), top: B:2:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016f A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:3:0x0026, B:5:0x0031, B:7:0x0035, B:8:0x0040, B:10:0x0044, B:11:0x0046, B:12:0x004b, B:151:0x0064, B:152:0x006d, B:154:0x008f, B:156:0x0099, B:14:0x00a3, B:16:0x00a9, B:18:0x00ad, B:21:0x00c0, B:22:0x00c6, B:24:0x00cc, B:26:0x00d2, B:28:0x00d6, B:29:0x00d8, B:35:0x0222, B:36:0x0226, B:37:0x0232, B:39:0x0238, B:41:0x024a, B:42:0x024c, B:59:0x0252, B:45:0x0255, B:56:0x0262, B:48:0x0265, B:51:0x0272, B:62:0x0275, B:66:0x010e, B:71:0x0124, B:73:0x012f, B:75:0x0135, B:77:0x0145, B:80:0x0155, B:88:0x0166, B:90:0x016f, B:91:0x0173, B:93:0x0179, B:96:0x0181, B:99:0x018d, B:107:0x01a0, B:108:0x01ac, B:110:0x01b2, B:112:0x01ba, B:114:0x01c4, B:116:0x01d3, B:123:0x01e5, B:124:0x01f1, B:126:0x01f7, B:129:0x020c, B:132:0x0218, B:138:0x011b, B:140:0x00e6, B:142:0x00ea, B:143:0x00f8, B:145:0x00fe, B:148:0x0105, B:158:0x0069, B:159:0x0050, B:161:0x005a), top: B:2:0x0026, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C1MF r25, java.io.File r26) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1MS.A03(X.1MF, java.io.File):void");
    }

    @Override // X.C1MT
    public final void F8g() {
        this.A00 = true;
        A02();
    }

    @Override // X.C1MT
    public final void F8h() {
        this.A00 = true;
        this.A01 = true;
        Iterator it = A01().entrySet().iterator();
        while (it.hasNext()) {
            this.A09.execute(new RunnableC24574AuV(this, (Map.Entry) it.next()));
        }
    }

    public final HashMap A01() {
        C1FB c1fb;
        C1FC c1fc;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A05.A00().entrySet()) {
            String str = (String) entry.getKey();
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject optJSONObject = jSONObject.optJSONObject("size_config");
                String str2 = null;
                if (optJSONObject != null) {
                    C24291Gy c24291Gy = new C24291Gy();
                    long optLong = optJSONObject.optLong("max_size", 0L);
                    long optLong2 = optJSONObject.optLong("max_size_low_space_bytes", 0L);
                    long optLong3 = optJSONObject.optLong("max_size_very_low_space_bytes", 0L);
                    if (optLong <= 0 && optLong2 <= 0 && optLong3 <= 0) {
                        c1fb = null;
                    } else {
                        c24291Gy.A01 = optLong;
                        c24291Gy.A02 = optLong2;
                        c24291Gy.A03 = optLong3;
                        c24291Gy.A04 = optJSONObject.optBoolean("delete_only_on_init", false);
                        c24291Gy.A05 = optJSONObject.optBoolean("is_itemized", false);
                        c1fb = c24291Gy.A00();
                    }
                } else {
                    c1fb = null;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("staleness_config");
                if (optJSONObject2 != null) {
                    long optLong4 = optJSONObject2.optLong("stale_age_s", -1L);
                    c1fc = null;
                    if (optLong4 >= 0) {
                        c1fc = new C1FC(optLong4, optJSONObject2.optBoolean("is_itemized", false));
                    }
                } else {
                    c1fc = null;
                }
                if (c1fb != null || c1fc != null) {
                    String optString = jSONObject.optString("cache_name");
                    String optString2 = jSONObject.optString("eviction_type", "file");
                    if (!TextUtils.isEmpty(optString)) {
                        str2 = optString;
                    }
                    C1MF c1mf = new C1MF(c1fb, c1fc, optString2, str2);
                    if (c1mf.A02 != null || c1mf.A01 != null) {
                        if (c1mf.A00 == null) {
                            c1mf.A00 = jSONObject.optString("feature_name", "n/a");
                        }
                        hashMap.put(new File(str), c1mf);
                    }
                }
            }
        }
        Map map = this.A08;
        synchronized (map) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @Override // X.C1MU
    public final /* bridge */ /* synthetic */ void DXo(final C1F9 c1f9, C1B1 c1b1, final File file) {
        File absoluteFile;
        final C1MF c1mf = (C1MF) c1b1;
        C14360o3.A0B(c1mf, 1);
        String str = c1mf.A00;
        if (str == null) {
            str = c1f9.A02;
        }
        c1mf.A00 = str;
        Map map = this.A08;
        try {
            absoluteFile = file.getCanonicalFile();
        } catch (IOException unused) {
            absoluteFile = file.getAbsoluteFile();
        }
        map.put(absoluteFile, c1mf);
        this.A09.execute(new Runnable() { // from class: X.1Ma
            @Override // java.lang.Runnable
            public final void run() {
                String absolutePath;
                C1MS c1ms = this;
                C1F9 c1f92 = c1f9;
                C1MF c1mf2 = c1mf;
                File file2 = file;
                try {
                    JSONObject jSONObject = new JSONObject();
                    C1FB c1fb = c1mf2.A01;
                    if (c1fb != null) {
                        jSONObject.put("size_config", c1fb.EqM());
                    }
                    C1FC c1fc = c1mf2.A02;
                    if (c1fc != null) {
                        jSONObject.put("staleness_config", c1fc.EqM());
                    }
                    jSONObject.put("eviction_type", c1mf2.A03);
                    String str2 = c1mf2.A00;
                    if (str2 != null) {
                        jSONObject.put("cache_name", str2);
                    }
                    jSONObject.put("feature_name", c1f92.A02);
                    C1MX c1mx = c1ms.A05;
                    try {
                        absolutePath = file2.getCanonicalPath();
                    } catch (IOException unused2) {
                        absolutePath = file2.getAbsolutePath();
                    }
                    c1mx.A02(absolutePath, jSONObject);
                } catch (JSONException unused3) {
                }
            }
        });
        if ((c1mf instanceof C25471Mb) && ((C25471Mb) c1mf).A00) {
            this.A03 = true;
            A00();
        }
    }

    public C1MS(C23111Aq c23111Aq) {
        C1MX c1mw;
        this.A07 = c23111Aq;
        SharedPreferences sharedPreferences = c23111Aq.A06;
        if (sharedPreferences == null) {
            c1mw = new C1MX("eviction.v2");
        } else {
            c1mw = new C1MW(sharedPreferences, "eviction.v2");
        }
        this.A05 = c1mw;
        this.A09 = c23111Aq.A04(C05F.A00);
        this.A06 = c23111Aq.A02();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c23111Aq.A07;
        C14360o3.A07(lightweightQuickPerformanceLogger);
        this.A04 = lightweightQuickPerformanceLogger;
    }

    public final void A02() {
        Iterator it = A01().entrySet().iterator();
        while (it.hasNext()) {
            this.A09.execute(new RunnableC24573AuU(this, (Map.Entry) it.next()));
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-2060709538);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.A02;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.A02 = null;
        }
        C0f9.A0A(-1003950819, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(558984197);
        A00();
        C0f9.A0A(907123616, A03);
    }
}
