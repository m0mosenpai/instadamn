package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WFw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70193WFw {
    public int A00;
    public InterfaceC58100PpP A01;
    public MYB A02;
    public MediaComposition A03;
    public MediaComposition A04;
    public XEJ A05;
    public W8v A06;
    public C68262VJz A07;
    public File A08;
    public Integer A09;
    public boolean A0A;
    public C70479WYk A0B;
    public final Context A0C;
    public final XC1 A0D;
    public final C68920VeK A0E;
    public final C69546VrA A0F;
    public final C69616VsJ A0G;
    public final C69492VoF A0H;
    public final VaY A0I;
    public final C71646Wxt A0J;
    public final C69799Vvj A0K;
    public final InterfaceC72009XEx A0L;
    public final XE9 A0M;
    public final String A0N;
    public final List A0O;
    public final ExecutorService A0P;
    public final C68924VeO A0Q;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A03(X.C70193WFw r4) {
        /*
            monitor-enter(r4)
            X.W8v r3 = r4.A06     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L48
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            r2.<init>()     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            int r1 = r4.A00     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            java.lang.String r0 = "mCurrentStrategyIndex"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            java.lang.String r1 = r4.A00()     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            java.lang.String r0 = "libraryConfigHashCode"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            org.json.JSONObject r1 = r3.A00     // Catch: org.json.JSONException -> L25 org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            java.lang.String r0 = "video_uploader"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L25 org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            X.W8v.A01(r3)     // Catch: org.json.JSONException -> L25 org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            goto L48
        L25:
            r2 = move-exception
            java.lang.String r1 = "Failed to update MediaUploader data"
            X.VHu r0 = new X.VHu     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            r0.<init>(r1, r2)     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
            throw r0     // Catch: org.json.JSONException -> L2e X.C68212VHu -> L3a java.lang.Throwable -> L4a
        L2e:
            r3 = move-exception
            X.VoF r0 = r4.A0H     // Catch: java.lang.Throwable -> L4a
            X.X9S r2 = r0.A0D     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "videolite-crash-recovery"
            java.lang.String r0 = "Cannot save state in MediaUploader"
            if (r2 == 0) goto L48
            goto L45
        L3a:
            r3 = move-exception
            X.VoF r0 = r4.A0H     // Catch: java.lang.Throwable -> L4a
            X.X9S r2 = r0.A0D     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "videolite-crash-recovery"
            java.lang.String r0 = "Cannot save state in MediaUploader"
            if (r2 == 0) goto L48
        L45:
            r2.CjB(r3, r1, r0)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r4)
            return
        L4a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70193WFw.A03(X.WFw):void");
    }

    public static final synchronized void A04(C70193WFw c70193WFw, Exception exc) {
        synchronized (c70193WFw) {
            if (!c70193WFw.A0A) {
                W54 w54 = new W54(c70193WFw.A0D, c70193WFw.A0E, c70193WFw.A0G.A00());
                w54.A01();
                w54.A02(exc);
            }
            c70193WFw.A0M.DG3(exc);
            c70193WFw.A0L.onFailure(exc);
            c70193WFw.A0J.A00.set(null);
            A01(c70193WFw);
        }
    }

    public final synchronized C70479WYk A05() {
        C70479WYk c70479WYk;
        if (this.A0B == null) {
            this.A0B = new C70479WYk(this);
            ExecutorService executorService = this.A0P;
            if (executorService != null) {
                executorService.execute(new RunnableC71270Wqz(this));
                c70479WYk = this.A0B;
                if (c70479WYk == null) {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            throw new IllegalStateException("upload can be called only one time!");
        }
        return c70479WYk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        if (r1 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00aa, code lost:
    
        if (r1 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        if (r0 > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70193WFw(android.content.Context r16, X.XC1 r17, X.C69492VoF r18, X.XE9 r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70193WFw.<init>(android.content.Context, X.XC1, X.VoF, X.XE9, java.lang.String):void");
    }

    private final String A00() {
        Object[] objArr;
        if (this.A0K.A06()) {
            objArr = new Object[]{this.A0O};
        } else {
            C69492VoF c69492VoF = this.A0H;
            Long valueOf = Long.valueOf(c69492VoF.A04);
            Long valueOf2 = Long.valueOf(c69492VoF.A03);
            Boolean valueOf3 = Boolean.valueOf(c69492VoF.A0U);
            WDI wdi = c69492VoF.A0H;
            Object obj = "null";
            Object obj2 = c69492VoF.A0R;
            if (obj2 != null) {
                obj = obj2;
            }
            objArr = new Object[]{valueOf, valueOf2, valueOf3, wdi, obj};
        }
        String arrays = Arrays.toString(objArr);
        C14360o3.A07(arrays);
        return arrays;
    }

    public static final void A01(C70193WFw c70193WFw) {
        C70479WYk c70479WYk = c70193WFw.A0B;
        if (c70479WYk != null) {
            Object obj = c70479WYk.A01;
            synchronized (obj) {
                obj.notifyAll();
                c70479WYk.A00 = true;
                c70479WYk.A02 = null;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(C70193WFw c70193WFw) {
        W8v w8v = c70193WFw.A06;
        if (w8v != null) {
            try {
                W8v.A00(w8v);
                JSONObject optJSONObject = w8v.A00.optJSONObject("video_uploader");
                if (optJSONObject != null) {
                    if (!C14360o3.A0K(optJSONObject.getString("libraryConfigHashCode"), c70193WFw.A00())) {
                        w8v.A00 = new JSONObject();
                        W8v.A01(w8v);
                        c70193WFw.A09 = C05F.A01;
                    } else {
                        String string = optJSONObject.getString("mCurrentStrategyIndex");
                        C14360o3.A07(string);
                        c70193WFw.A00 = Integer.parseInt(string);
                        c70193WFw.A09 = C05F.A0C;
                    }
                }
            } catch (C68212VHu | JSONException e) {
                c70193WFw.A09 = C05F.A01;
                X9S x9s = c70193WFw.A0H.A0D;
                if (x9s != null) {
                    x9s.CjB(e, "videolite-crash-recovery", "Cannot restore state in MediaUploader");
                }
            }
        }
    }
}
