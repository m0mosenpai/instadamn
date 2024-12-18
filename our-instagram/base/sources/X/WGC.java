package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class WGC {
    public C68232VIs A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public VD6 A05;
    public final int A06;
    public final C54993OUc A07;
    public final InterfaceC58100PpP A08;
    public final MYB A09;
    public final C69492VoF A0A;
    public final XE8 A0B;
    public final C69276Vkk A0C;
    public final String A0D;
    public final String A0E;
    public final Map A0F;
    public final Map A0G;
    public final java.util.Set A0H;
    public final java.util.Set A0I;
    public final java.util.Set A0J;
    public final ExecutorService A0K;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.XE8, X.WZi] */
    public WGC(InterfaceC58100PpP interfaceC58100PpP, MYB myb, C69616VsJ c69616VsJ, C69492VoF c69492VoF, XE8 xe8, C69276Vkk c69276Vkk, ExecutorService executorService, int i) {
        C14360o3.A0B(c69616VsJ, 1);
        AbstractC167017dG.A1T(interfaceC58100PpP, executorService);
        this.A06 = i;
        this.A08 = interfaceC58100PpP;
        this.A0K = executorService;
        this.A0A = c69492VoF;
        this.A0C = c69276Vkk;
        this.A09 = myb;
        Map map = c69616VsJ.A05;
        this.A0D = AnonymousClass001.A0T((String) map.get("waterfall_id"), (String) map.get("asset_id"), '_');
        this.A0E = c69616VsJ.A04;
        this.A07 = c69492VoF.A05;
        ?? obj = new Object();
        obj.A00 = xe8;
        this.A0B = obj;
        this.A0G = new HashMap();
        this.A0I = new HashSet();
        this.A0J = new HashSet();
        this.A0H = new HashSet();
        this.A0F = new HashMap();
        this.A05 = VD6.A05;
    }

    public static final synchronized void A01(W63 w63, W62 w62, WGC wgc) {
        long j;
        synchronized (wgc) {
            wgc.A0G.remove(w62);
            wgc.A0J.remove(w62);
            wgc.A0I.add(w62);
            wgc.A0F.put(w62, w63);
            C69276Vkk c69276Vkk = wgc.A0C;
            W2L w2l = c69276Vkk.A02;
            synchronized (w2l) {
                Long l = (Long) w2l.A01.get(w62);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                W2L.A00(w62, w2l, null, "media_upload_chunk_transfer_success", null, w2l.A00.now() - j);
            }
            c69276Vkk.A01.ELs();
            c69276Vkk.A04.DkE(w63, w62);
            wgc.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (X.WGX.A07(r9) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A02(X.C68232VIs r11, X.WGC r12) {
        /*
            monitor-enter(r12)
            X.VD6 r0 = X.VD6.A03     // Catch: java.lang.Throwable -> L7b
            r12.A05 = r0     // Catch: java.lang.Throwable -> L7b
            X.Vkk r4 = r12.A0C     // Catch: java.lang.Throwable -> L7b
            X.XEJ r3 = r4.A01     // Catch: java.lang.Throwable -> L7b
            r3.ELs()     // Catch: java.lang.Throwable -> L7b
            X.Vkj r2 = r4.A03     // Catch: java.lang.Throwable -> L7b
            long r0 = r2.A00     // Catch: java.lang.Throwable -> L7b
            X.XC1 r5 = r2.A03     // Catch: java.lang.Throwable -> L7b
            long r9 = r5.now()     // Catch: java.lang.Throwable -> L7b
            long r9 = r9 - r0
            java.lang.String r7 = "media_post_success"
            r6 = 0
            java.util.Map r8 = r2.A04     // Catch: java.lang.Throwable -> L7b
            X.AbstractC68335VMv.A00(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7b
            X.VIs r6 = r12.A00     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L76
            java.util.Map r5 = r12.A0F     // Catch: java.lang.Throwable -> L7b
            X.VoF r9 = r12.A0A     // Catch: java.lang.Throwable -> L7b
            X.O1d r0 = r9.A0J     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L4f
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = r0.A00     // Catch: java.lang.Throwable -> L7b
            boolean r0 = X.WGX.A04(r10)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L64
            X.56h r9 = X.EnumC1125356h.VIDEO     // Catch: java.lang.Throwable -> L7b
            X.56l r0 = X.WGX.A00(r9, r10)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L4d
            long r0 = r0.A02     // Catch: java.lang.Throwable -> L7b
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L4d
            boolean r0 = X.WGX.A04(r10)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L64
            X.WGX.A00(r9, r10)     // Catch: java.lang.Throwable -> L7b
            goto L64
        L4d:
            r0 = 0
            goto L65
        L4f:
            long r0 = r9.A04     // Catch: java.lang.Throwable -> L7b
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L64
            long r1 = r9.A03     // Catch: java.lang.Throwable -> L7b
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L64
            boolean r1 = X.WGX.A07(r9)     // Catch: java.lang.Throwable -> L7b
            r0 = 0
            if (r1 == 0) goto L65
        L64:
            r0 = 1
        L65:
            X.VjW r2 = new X.VjW     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r6, r11, r5, r0)     // Catch: java.lang.Throwable -> L7b
            X.XEx r1 = r4.A04     // Catch: java.lang.Throwable -> L7b
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.DvE(r0)     // Catch: java.lang.Throwable -> L7b
            r3.DxM(r2)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r12)
            return
        L76:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGC.A02(X.VIs, X.WGC):void");
    }

    public static final synchronized void A03(C68232VIs c68232VIs, WGC wgc) {
        String str;
        String str2;
        synchronized (wgc) {
            wgc.A00 = c68232VIs;
            C69276Vkk c69276Vkk = wgc.A0C;
            c69276Vkk.A01.ELs();
            C69275Vkj c69275Vkj = c69276Vkk.A03;
            String str3 = null;
            try {
                JSONObject jSONObject = new JSONObject(c68232VIs.A00);
                str = jSONObject.optString("stream_id", "");
                if (str.length() == 0) {
                    str = null;
                }
                try {
                    str2 = jSONObject.optString("upload_session_id", "");
                    if (str2.length() == 0) {
                        str2 = null;
                    }
                    try {
                        String optString = jSONObject.optString("video_id", "");
                        if (optString.length() == 0) {
                            optString = null;
                        }
                        str3 = optString;
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    str2 = null;
                }
            } catch (JSONException unused3) {
                str = null;
                str2 = null;
            }
            Map map = c69275Vkj.A04;
            map.put("stream_id", str);
            map.put("upload_session_id", str2);
            map.put("video_id", str3);
            long j = c69275Vkj.A02;
            XC1 xc1 = c69275Vkj.A03;
            AbstractC68335VMv.A00(xc1, null, "media_upload_init_success", map, xc1.now() - j);
            wgc.A00();
        }
    }

    public static final synchronized void A04(W62 w62, WGC wgc, Exception exc, Map map, int i) {
        long j;
        JSONObject jSONObject;
        synchronized (wgc) {
            W2L w2l = wgc.A0C.A02;
            synchronized (w2l) {
                Long l = (Long) w2l.A01.get(w62);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                JSONObject jSONObject2 = null;
                if (exc instanceof VIA) {
                    try {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("transfered_bytes", String.valueOf(((VIA) exc).A01));
                        } catch (JSONException unused) {
                            jSONObject2 = jSONObject;
                        }
                    } catch (JSONException unused2) {
                    }
                    W2L.A00(w62, w2l, exc, "media_upload_chunk_transfer_failure", jSONObject, w2l.A00.now() - j);
                }
                jSONObject = jSONObject2;
                W2L.A00(w62, w2l, exc, "media_upload_chunk_transfer_failure", jSONObject, w2l.A00.now() - j);
            }
            wgc.A0G.remove(w62);
            wgc.A0J.remove(w62);
            A05(wgc, exc, map, i);
        }
    }

    public static final synchronized void A05(WGC wgc, Exception exc, Map map, int i) {
        synchronized (wgc) {
            wgc.A05 = VD6.A04;
            C69276Vkk c69276Vkk = wgc.A0C;
            C14360o3.A0B(map, 2);
            C69055Vgw c69055Vgw = c69276Vkk.A00;
            XC1 xc1 = c69055Vgw.A01;
            long now = xc1.now() - c69055Vgw.A00;
            HashMap hashMap = new HashMap();
            hashMap.putAll(c69055Vgw.A02);
            hashMap.put("error", exc.toString());
            String stackTraceString = android.util.Log.getStackTraceString(exc);
            C14360o3.A0A(stackTraceString);
            hashMap.put(TraceFieldType.Error, stackTraceString);
            if (now >= 0) {
                hashMap.put("elapsed_time", String.valueOf(now));
            }
            xc1.logEvent("media_upload_transfer_failure", hashMap);
            c69276Vkk.A01.DvC(exc);
            InterfaceC72009XEx interfaceC72009XEx = c69276Vkk.A04;
            interfaceC72009XEx.DkB(exc);
            interfaceC72009XEx.DvB(exc, new LinkedHashMap(map), i);
        }
    }

    public final synchronized void A06() {
        VD6 vd6 = this.A05;
        VD6 vd62 = VD6.A02;
        if (vd6 != vd62) {
            XE8 xe8 = this.A0B;
            if (xe8 != null && this.A00 != null) {
                C70498WZf c70498WZf = new C70498WZf(new C70499WZg(null, null, this, C05F.A0N), this.A0K);
                C68232VIs c68232VIs = this.A00;
                if (c68232VIs != null) {
                    xe8.EN9(c68232VIs, c70498WZf);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            Iterator A16 = AbstractC166997dE.A16(this.A0G);
            while (A16.hasNext()) {
                this.A08.AGL((InterfaceC57793PkK) A16.next());
            }
            this.A05 = vd62;
        }
    }

    public final synchronized void A07() {
        if (this.A04) {
            if (!this.A0H.isEmpty()) {
                this.A01 = true;
                A00();
            }
        } else {
            throw new IllegalStateException("UploadJob.start() not called.");
        }
    }

    public final synchronized void A08() {
        this.A04 = true;
        C69276Vkk c69276Vkk = this.A0C;
        C69055Vgw c69055Vgw = c69276Vkk.A00;
        XC1 xc1 = c69055Vgw.A01;
        c69055Vgw.A00 = xc1.now();
        HashMap hashMap = new HashMap();
        hashMap.putAll(c69055Vgw.A02);
        xc1.logEvent("media_upload_transfer_start", hashMap);
        c69276Vkk.A04.DvG();
        A00();
    }

    public final synchronized void A09(W62 w62) {
        if (this.A04) {
            this.A0H.add(w62);
            A00();
        } else {
            throw new IllegalStateException("UploadJob.start() not called.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (((X.VCK) r4).A02 == false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r2v23, types: [X.VIs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.VIs, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGC.A00():void");
    }
}
