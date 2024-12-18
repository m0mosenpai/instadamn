package X;

import com.facebook.proxygen.HTTPClient;
import com.facebook.proxygen.HTTPRequestHandler;
import com.facebook.proxygen.HTTPThread;
import com.facebook.proxygen.JniHandler;
import com.facebook.proxygen.NativeReadBuffer;
import com.facebook.proxygen.NetworkStatusMonitor;
import com.facebook.proxygen.TraceEventContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sen, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63188Sen {
    public static int A0V;
    public static int A0W;
    public static int A0Y;
    public static HTTPClient A0Z;
    public static NetworkStatusMonitor A0a;
    public static SCK A0b;
    public static String A0d;
    public static Thread A0g;
    public static List A0h;
    public static boolean A0i;
    public static boolean A0j;
    public static boolean A0k;
    public static boolean A0m;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final C1Bs A09;
    public final C23301Br A0A;
    public final C41371vm A0B = new C41371vm(C41371vm.A02);
    public final C1Bj A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final C23271Bi A0U;
    public static final HTTPThread A0n = new HTTPThread();
    public static int A0X = 3;
    public static boolean A0l = true;
    public static String A0e = "";
    public static String A0f = "";
    public static String A0c = "";

    static {
        C09170dP.A0C("fb");
        C09170dP.A0C("liger");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (X.C63188Sen.A0f.isEmpty() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            com.facebook.proxygen.HTTPClient r3 = X.C63188Sen.A0Z
            monitor-enter(r3)
            com.facebook.proxygen.HTTPClient r2 = X.C63188Sen.A0Z     // Catch: java.lang.Throwable -> L38
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = X.C63188Sen.A0e     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L17
            java.lang.String r0 = X.C63188Sen.A0f     // Catch: java.lang.Throwable -> L35
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L35
            r0 = 0
            if (r1 != 0) goto L18
        L17:
            r0 = 1
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            r2 = 0
            if (r0 == 0) goto L1e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            return r2
        L1e:
            com.facebook.proxygen.HTTPClient r1 = X.C63188Sen.A0Z     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = ""
            r1.setProxy(r4, r8, r0, r0)     // Catch: java.lang.Throwable -> L38
            r1.setSecureProxy(r4, r8, r0, r0)     // Catch: java.lang.Throwable -> L38
            r1.setProxyDomainsRules(r5, r6)     // Catch: java.lang.Throwable -> L38
            r1.mProxyClientAddress = r7     // Catch: java.lang.Throwable -> L38
            r1.mProxyFallbackEnabled = r2     // Catch: java.lang.Throwable -> L38
            r1.reInitializeIfNeeded()     // Catch: java.lang.Throwable -> L38
            r0 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63188Sen.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public final void A01(HTTPRequestHandler hTTPRequestHandler, JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, TraceEventContext traceEventContext, C1QW c1qw, String str) {
        C11T.A05("This operation can't be run on UI thread.");
        A0Z.make(jniHandler, nativeReadBuffer, traceEventContext);
        if (C21A.A02()) {
            C14360o3.A0B("true", 1);
            Map map = c1qw.A0A;
            map.put("ta_enabled", "true");
            C14360o3.A0B(str, 1);
            map.put("request_name", str);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C23781El c23781El : c1qw.A01) {
            if (!C21A.A05.containsValue(c23781El.A00)) {
                A1E.add(c23781El);
            }
        }
        if (!c1qw.A02("User-Agent")) {
            AbstractC58319PtB.A1I("User-Agent", C1FO.A00(), A1E);
        }
        if (!c1qw.A02("Accept-Language")) {
            AbstractC58319PtB.A1I("Accept-Language", AbstractC15660qM.A00(), A1E);
        }
        if (!c1qw.A02("Connection")) {
            AbstractC58319PtB.A1I("Connection", "Keep-Alive", A1E);
        }
        C1JP c1jp = c1qw.A05;
        if (c1jp != null) {
            c1jp.ACw(c1qw.A09, A1E);
        }
        if (C0K8.A01.isLoggable(3)) {
            ArrayList A1F = AbstractC166987dD.A1F(A1E);
            java.net.URI uri = c1qw.A09;
            String host = uri.getHost();
            if (host != null) {
                AbstractC58319PtB.A1I("Host", host, A1F);
            }
            AbstractC58319PtB.A1I("Accept-Encoding", "gzip,deflate", A1F);
            AbstractC62258S4d.A00(c1qw.A06, AbstractC26611Qq.A00(c1qw.A07), uri, (C23781El[]) A1F.toArray(new C23781El[A1F.size()]));
        }
        hTTPRequestHandler.executeWithDefragmentation(AbstractC63079Sc1.A00(c1qw, A1E));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01ab, code lost:
    
        if (r3 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63188Sen(android.content.Context r82, X.C1Bs r83, X.C23301Br r84, X.C23271Bi r85, X.C1Bj r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.util.List r93, int r94, int r95, int r96, int r97, int r98, int r99, int r100, int r101, int r102, int r103, long r104, boolean r106, boolean r107, boolean r108, boolean r109, boolean r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, boolean r118, boolean r119, boolean r120, boolean r121, boolean r122, boolean r123, boolean r124, boolean r125, boolean r126, boolean r127, boolean r128, boolean r129) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63188Sen.<init>(android.content.Context, X.1Bs, X.1Br, X.1Bi, X.1Bj, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, int, int, int, int, int, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
