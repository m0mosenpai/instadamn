package X;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.http.client.HttpResponseException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class WG6 {
    public long A00;
    public XGn A02;
    public java.net.URI A03;
    public final C54993OUc A04;
    public final C55191Odx A05;
    public final C68902Vdz A06;
    public final OVd A07;
    public volatile C53680NoV A09;
    public volatile C66546UMb A0A;
    public volatile C66548UMd A0B;
    public final Object A08 = new Object();
    public long A01 = -1;

    public static final long A00(Exception exc) {
        List list;
        if (exc instanceof HttpResponseException) {
            try {
                String message = exc.getMessage();
                if (message != null && message.length() != 0) {
                    List A03 = new C11L("\\n").A03(message);
                    if (!A03.isEmpty()) {
                        ListIterator listIterator = A03.listIterator(A03.size());
                        while (listIterator.hasPrevious()) {
                            if (((String) listIterator.previous()).length() != 0) {
                                list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list = C16930sl.A00;
                    String[] A1b = AbstractC31173DnH.A1b(list, 0);
                    if (A1b.length >= 2) {
                        String str = A1b[1];
                        try {
                            C68669Va5 parseFromJson = VMI.parseFromJson(C16V.A00(str));
                            if (parseFromJson != null) {
                                long j = parseFromJson.A00;
                                if (j >= 0) {
                                    return j;
                                }
                            }
                            C14360o3.A0B(str, 1);
                            throw new Exception(str);
                        } catch (IOException unused) {
                            throw new Exception();
                        }
                    }
                }
                return -1L;
            } catch (Exception unused2) {
            }
        }
        return -1L;
    }

    public static final void A01(WG6 wg6) {
        Integer num = C05F.A00;
        wg6.A04(null, num, false);
        java.net.URI uri = wg6.A03;
        if (uri != null) {
            HashMap hashMap = new HashMap();
            C54993OUc c54993OUc = wg6.A04;
            hashMap.putAll(c54993OUc.A0B);
            wg6.A05(hashMap, true);
            wg6.A02.Dkd(AbstractC166987dD.A19(uri), hashMap);
            wg6.A0A = new C66546UMb(c54993OUc, wg6);
            OVd oVd = wg6.A07;
            LinkedHashMap A03 = AbstractC06930Yk.A03(hashMap);
            C66546UMb c66546UMb = wg6.A0A;
            if (c66546UMb != null) {
                wg6.A09 = oVd.A01(c66546UMb, null, num, uri, A03);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(WG6 wg6, long j, boolean z) {
        Integer num = C05F.A01;
        wg6.A04(null, num, false);
        wg6.A02.DkZ(j, z);
        wg6.A00 = j;
        C68902Vdz c68902Vdz = wg6.A06;
        c68902Vdz.A00 = SystemClock.uptimeMillis();
        ArrayList arrayList = c68902Vdz.A01;
        arrayList.add(new Object());
        if (!arrayList.isEmpty()) {
            C69684VtU c69684VtU = (C69684VtU) arrayList.get(arrayList.size() - 1);
            c69684VtU.A00 = c69684VtU.A00;
            c69684VtU.A01 = c69684VtU.A01;
        }
        C54993OUc c54993OUc = wg6.A04;
        wg6.A0B = new C66548UMd(c54993OUc, c68902Vdz, wg6, z);
        OVd oVd = wg6.A07;
        HashMap hashMap = new HashMap(c54993OUc.A0B);
        if (!c54993OUc.A0F) {
            hashMap.put(MSV.A00(880), String.valueOf(wg6.A05.A00));
        }
        hashMap.put("Offset", String.valueOf(j));
        C55191Odx c55191Odx = wg6.A05;
        String str = c55191Odx.A04;
        if (str != null) {
            hashMap.put("X-Entity-Type", str);
        }
        String str2 = c54993OUc.A08;
        if (str2 != null || (str2 = c55191Odx.A03) != null) {
            hashMap.put("X-Entity-Name", str2);
        }
        wg6.A05(hashMap, z);
        LinkedHashMap A03 = AbstractC06930Yk.A03(hashMap);
        java.net.URI uri = wg6.A03;
        if (uri != null) {
            C54509O6m c54509O6m = new C54509O6m(c55191Odx, j);
            C66548UMd c66548UMd = wg6.A0B;
            if (c66548UMd != null) {
                wg6.A09 = oVd.A01(c66548UMd, c54509O6m, num, uri, A03);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A03(WG6 wg6, Exception exc, Integer num, String str, Map map, int i, long j, boolean z) {
        String str2;
        File file;
        String str3;
        long j2 = j;
        XGn xGn = wg6.A02;
        if (num.intValue() != 0) {
            str2 = "POST";
        } else {
            str2 = "GET";
        }
        xGn.DFo(exc, str, str2, map, i, j2, z);
        wg6.A04(exc, num, z);
        if (z) {
            C54993OUc c54993OUc = wg6.A04;
            C69056Vgx c69056Vgx = c54993OUc.A07;
            int i2 = c69056Vgx.A01;
            c69056Vgx.A01 = i2 + 1;
            W2I w2i = c69056Vgx.A02;
            if (i2 < w2i.A01 && (file = wg6.A05.A01) != null && file.exists()) {
                try {
                    if (c54993OUc.A00) {
                        Uri.Builder builder = new Uri.Builder();
                        builder.scheme("https");
                        builder.encodedAuthority(AnonymousClass001.A0R("rupload.", IGPixelRequestBuffer.URL_PREFIX));
                        java.net.URI uri = wg6.A03;
                        if (uri != null) {
                            String A19 = AbstractC166987dD.A19(uri);
                            String A0C = AnonymousClass001.A0C(IGPixelRequestBuffer.URL_PREFIX, '/');
                            int A08 = AbstractC001900j.A08(A19, A0C, 0, false);
                            if (A08 >= 0) {
                                str3 = A19.substring(A08 + A0C.length());
                                C14360o3.A07(str3);
                            } else {
                                str3 = "";
                            }
                            builder.appendEncodedPath(str3);
                            wg6.A03 = new java.net.URI(builder.build().toString());
                            c54993OUc.A00 = false;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                if (j < 0) {
                    int i3 = c69056Vgx.A00;
                    c69056Vgx.A00 = Math.min(i3 << 1, w2i.A00);
                    j2 = i3;
                }
                try {
                    Thread.sleep(j2);
                } catch (InterruptedException unused) {
                    AbstractC58318PtA.A18();
                }
                if (c54993OUc.A0D) {
                    A01(wg6);
                    return;
                } else {
                    A02(wg6, 0L, c54993OUc.A02.A01);
                    return;
                }
            }
        }
        xGn.DFz(new VIA(exc, str, map, i, wg6.A00, false));
        wg6.A09 = null;
        wg6.A0A = null;
        wg6.A0B = null;
    }

    private final void A04(Exception exc, Integer num, boolean z) {
        String str;
        C54993OUc c54993OUc = this.A04;
        C69055Vgw c69055Vgw = c54993OUc.A06;
        if (c69055Vgw != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mBytesUploaded", this.A00);
                if (num.intValue() != 0) {
                    str = "POST";
                } else {
                    str = "GET";
                }
                jSONObject.put("method", str);
                jSONObject.put("retryCount", c54993OUc.A07.A01);
                if (exc != null) {
                    jSONObject.put("exception", exc.getMessage());
                    jSONObject.put("isRetriable", z);
                }
            } catch (JSONException unused) {
            }
            HashMap hashMap = new HashMap();
            hashMap.put("debug", jSONObject.toString());
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(c69055Vgw.A02);
            hashMap2.putAll(hashMap);
            c69055Vgw.A01.logEvent("media_upload_debug_info", hashMap2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (((X.VCK) r1).A01 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(java.util.Map r6, boolean r7) {
        /*
            r5 = this;
            X.OUc r4 = r5.A04
            boolean r0 = r4.A0E
            if (r0 == 0) goto L15
            X.Odx r0 = r5.A05
            java.io.File r1 = r0.A01
            boolean r0 = r1 instanceof X.VCK
            if (r0 == 0) goto L15
            X.VCK r1 = (X.VCK) r1
            boolean r0 = r1.A01
            r2 = 1
            if (r0 != 0) goto L16
        L15:
            r2 = 0
        L16:
            X.Vr6 r1 = r4.A05
            X.W2H r0 = r1.A01
            boolean r0 = r0.A01
            if (r0 == 0) goto L79
            int r1 = r1.A00
            r0 = 1
            if (r1 >= r0) goto L79
            X.W2H r3 = r4.A02
            boolean r0 = r4.A0F
            if (r0 == 0) goto L37
            if (r2 == 0) goto L79
            X.Odx r2 = r5.A05
            java.io.File r0 = r2.A01
            if (r0 == 0) goto L74
            long r0 = r0.length()
            r2.A00 = r0
        L37:
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L6f
            X.Odx r2 = r5.A05     // Catch: java.lang.Throwable -> L6e
            r0 = 1788(0x6fc, float:2.506E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.Throwable -> L6e
            int r1 = r3.A02     // Catch: java.lang.Throwable -> L6e
            X.O6l r4 = r2.A01(r0, r1)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L79
            byte[] r1 = r4.A01     // Catch: java.lang.Throwable -> L6e
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Throwable -> L6e
            if (r7 == 0) goto L61
            java.lang.String r2 = "X-Entity-Digest"
            java.lang.String r1 = "sha256"
            r0 = 32
            java.lang.String r0 = X.AnonymousClass001.A0T(r1, r3, r0)     // Catch: java.lang.Throwable -> L6e
            r6.put(r2, r0)     // Catch: java.lang.Throwable -> L6e
        L61:
            java.lang.String r3 = "X-Digest-Time-Ms"
            long r1 = r4.A00     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L6e
            r6.put(r3, r0)     // Catch: java.lang.Throwable -> L6e
            r5.A01 = r1     // Catch: java.lang.Throwable -> L6e
        L6e:
            return
        L6f:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L74:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WG6.A05(java.util.Map, boolean):void");
    }

    public WG6(C54993OUc c54993OUc, C55191Odx c55191Odx, XGn xGn, OVd oVd) {
        java.net.URI uri;
        this.A05 = c55191Odx;
        this.A04 = c54993OUc;
        this.A02 = xGn;
        this.A07 = oVd;
        String str = c54993OUc.A09;
        str = (str == null || str.length() == 0) ? AnonymousClass001.A0R("rupload.", IGPixelRequestBuffer.URL_PREFIX) : str;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.encodedAuthority(str);
        builder.appendPath(c54993OUc.A03.A01);
        String str2 = c54993OUc.A08;
        builder.appendPath(str2 == null ? c55191Odx.A03 : str2);
        String str3 = c54993OUc.A0A;
        if (str3 != null && str3.length() != 0) {
            builder.appendQueryParameter("target", str3);
        }
        if (c54993OUc.A0B.containsKey("Stream-Id")) {
            builder.appendQueryParameter("segmented", "true");
            builder.appendQueryParameter("phase", "transfer");
        }
        try {
            uri = new java.net.URI(builder.build().toString());
        } catch (URISyntaxException unused) {
            uri = null;
        }
        this.A03 = uri;
        this.A09 = null;
        this.A00 = 0L;
        this.A06 = new C68902Vdz();
    }
}
