package X;

import android.content.Context;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4Cx, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Cx {
    public static final String A0G = AnonymousClass001.A0R("LocalDebug:", "DefaultStreamingLogger");
    public C1UK A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final C38081ps A05;
    public final C38131px A06;
    public final C38071pr A07;
    public final C92624Cw A08;
    public final String A09;
    public final String A0A;
    public final java.util.Set A0B;
    public final ScheduledExecutorService A0C;
    public final boolean A0D;
    public final C38141q1 A0E;
    public final C38951rU A0F;

    public C4Cx(C38141q1 c38141q1, C38081ps c38081ps, C38131px c38131px, C38071pr c38071pr, C38951rU c38951rU, C92624Cw c92624Cw, String str, String str2, java.util.Set set, ScheduledExecutorService scheduledExecutorService, long j, boolean z) {
        C14360o3.A0B(scheduledExecutorService, 2);
        C14360o3.A0B(c38081ps, 4);
        C14360o3.A0B(c38131px, 5);
        C14360o3.A0B(set, 6);
        C14360o3.A0B(c38141q1, 12);
        this.A08 = c92624Cw;
        this.A0C = scheduledExecutorService;
        this.A07 = c38071pr;
        this.A05 = c38081ps;
        this.A06 = c38131px;
        this.A0B = set;
        this.A09 = str;
        this.A04 = j;
        this.A0A = str2;
        this.A0D = z;
        this.A0F = c38951rU;
        this.A0E = c38141q1;
        this.A01 = "^^^";
    }

    public static final void A00(C4Cx c4Cx, String str, String str2, String str3) {
        C38951rU c38951rU = c4Cx.A0F;
        if (c38951rU.A01()) {
            c38951rU.A00().Ci2(1L, str, str2, str3, true);
        }
    }

    public final void A01(final Context context, final C39841t8 c39841t8) {
        if (this.A02 && C14360o3.A0K(c39841t8.A00(), this.A01)) {
            return;
        }
        this.A0C.execute(new Runnable() { // from class: X.4Cy
            @Override // java.lang.Runnable
            public final void run() {
                C39831t7 c39831t7;
                String A02;
                final C4Cx c4Cx = this;
                C39841t8 c39841t82 = c39841t8;
                synchronized (c4Cx) {
                    if (!c4Cx.A03 && ((!c4Cx.A02 || !C14360o3.A0K(c39841t82.A00(), c4Cx.A01)) && (c39831t7 = c39841t82.A01) != null)) {
                        C1UK c1uk = c4Cx.A00;
                        if (c1uk != null && c4Cx.A02) {
                            c1uk.cancel();
                        }
                        BaseRequestStreamClient baseRequestStreamClient = DGWRequestStreamClientHolder.getInstance(c4Cx.A08.A00.A06).mClient;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("method", "FalcoMobile");
                        String str = c4Cx.A0A;
                        if (str.length() > 0 && !str.equals(IGPixelRequestBuffer.URL_PREFIX)) {
                            if (AbstractC002300n.A0h(str, "svcscm.", false)) {
                                str = AbstractC001900j.A0F("svcscm.", str);
                            }
                            if (!AbstractC002300n.A0h(str, "www", false)) {
                                str = String.format("www.%s", Arrays.copyOf(new Object[]{str}, 1));
                                C14360o3.A07(str);
                            }
                            if (!AbstractC002300n.A0f(str, AbstractC58317Pt9.A00(61), false)) {
                                str = String.format("%s.facebook.com", Arrays.copyOf(new Object[]{str}, 1));
                                C14360o3.A07(str);
                            }
                            jSONObject.put("javascript-sandbox", str);
                        }
                        jSONObject.toString();
                        String obj = jSONObject.toString();
                        C14360o3.A07(obj);
                        String str2 = c39841t82.A02;
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        C38071pr c38071pr = c4Cx.A07;
                        jSONObject3.put("appId", "567067343352427");
                        StringBuilder sb = new StringBuilder();
                        sb.append(c38071pr.A01());
                        sb.append(" (");
                        sb.append(c38071pr.A00());
                        sb.append(')');
                        jSONObject3.put("appVersion", sb.toString());
                        jSONObject3.put("sessionId", str2);
                        jSONObject3.put("consentState", 0L);
                        jSONObject2.put("appIdentity", jSONObject3);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("deviceId", C16030qx.A02.A05(c4Cx.A05.A00));
                        C11830jh c11830jh = c4Cx.A06.A00;
                        if (c11830jh == null) {
                            A02 = null;
                        } else {
                            A02 = c11830jh.A02(C19T.A1H);
                        }
                        jSONObject4.put("familyDeviceId", A02);
                        jSONObject2.put("deviceIdentity", jSONObject4);
                        JSONObject jSONObject5 = new JSONObject();
                        JSONObject jSONObject6 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        String str3 = c39831t7.A01;
                        if (str3 != null) {
                            jSONArray.put(str3);
                        }
                        jSONObject6.put("claims", jSONArray);
                        String str4 = c39831t7.A00;
                        jSONObject6.put("uid", str4);
                        jSONObject6.put("identifier", str4);
                        jSONObject5.put("appScopedIdentity", jSONObject6);
                        jSONObject2.put("userIdentity", jSONObject5);
                        String str5 = c4Cx.A09;
                        if (str5.length() == 0) {
                            str5 = "[]";
                        }
                        jSONObject2.put("falcoExperimentTags", new JSONArray(str5));
                        jSONObject2.toString();
                        String obj2 = jSONObject2.toString();
                        C14360o3.A07(obj2);
                        byte[] bytes = obj2.getBytes(C15W.A05);
                        C14360o3.A07(bytes);
                        c4Cx.A00 = baseRequestStreamClient.createStreamNative(obj, bytes, "", new StreamEventHandler() { // from class: X.4Cz
                            @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                            public final void onData(byte[] bArr) {
                                C14360o3.A0B(bArr, 0);
                                bArr.toString();
                            }

                            @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                            public final void onFlowStatus(int i) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            C4Cx.this.A02 = false;
                                        }
                                    } else {
                                        C4Cx c4Cx2 = C4Cx.this;
                                        c4Cx2.A02 = true;
                                        c4Cx2.A03 = false;
                                    }
                                }
                            }

                            @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                            public final void onLog(String str6) {
                                C14360o3.A0B(str6, 0);
                            }

                            @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                            public final void onTermination(int i, String str6, boolean z) {
                                C14360o3.A0B(str6, 1);
                                C4Cx c4Cx2 = C4Cx.this;
                                c4Cx2.A02 = false;
                                c4Cx2.A03 = false;
                            }
                        }, c4Cx.A0C, 2, null);
                        c4Cx.A01 = c39841t82.A00();
                        c4Cx.A03 = true;
                    }
                }
            }
        });
    }
}
