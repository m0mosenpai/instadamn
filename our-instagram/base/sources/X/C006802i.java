package X;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.common.util.TriState;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickEventFilter;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.02i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C006802i implements QuickPerformanceLogger {
    public static C006802i A0p;
    public RunnableC16080r6 A00;
    public C07G A01;
    public C15550qA A02;
    public ExecutorC19230x5 A03;
    public C19220x4 A04;
    public final AwakeTimeSinceBootClock A05;
    public final C0JM A06;
    public final AbstractC208510h A07;
    public final C0X4 A08;
    public final C0XB A09;
    public final C0XD A0A;
    public final C0XH A0B;
    public final C09410dq A0C;
    public final InterfaceC07520aR A0D;
    public final C05600Rk A0E;
    public final C0R9 A0F;
    public final InterfaceC07320a6 A0G;
    public final Runnable A0H;
    public final Map A0I;
    public final Random A0J;
    public final java.util.Set A0K;
    public final ConcurrentLinkedQueue A0L;
    public final ConcurrentLinkedQueue A0M;
    public final ReentrantLock A0N;
    public final InterfaceC08830cm A0O;
    public final InterfaceC08830cm A0P;
    public final InterfaceC08830cm A0Q;
    public final InterfaceC08830cm A0R;
    public final InterfaceC08830cm A0S;
    public final InterfaceC08830cm A0T;
    public final InterfaceC08830cm A0U;
    public final InterfaceC08830cm A0V;
    public final InterfaceC08830cm A0W;
    public final InterfaceC08830cm A0X;
    public final InterfaceC08830cm A0Y;
    public final InterfaceC08830cm A0Z;
    public final InterfaceC08830cm A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final InterfaceC12870lZ A0g;
    public volatile int A0h;
    public volatile TriState A0i;
    public volatile TriState A0j;
    public volatile TriState A0k;
    public volatile C0XM A0l;
    public volatile C0XQ A0m;
    public volatile InterfaceC06740Xq A0n;
    public volatile C10390h6 A0o;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A01(X.C0X2 r8, java.lang.String r9, java.lang.String r10, int r11, long r12, boolean r14, boolean r15) {
        /*
            r7 = this;
            r2 = 1
            if (r14 == 0) goto L9
            r0 = 7
            long r12 = X.AbstractC06750Xr.A00(r2, r0, r2)
        L8:
            return r12
        L9:
            if (r15 == 0) goto L10
            long r12 = r7.A00(r8, r11)
            return r12
        L10:
            if (r9 == 0) goto L30
            int r5 = (int) r12
            if (r5 == 0) goto L57
            if (r5 == r2) goto L8
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            byte[] r0 = r9.getBytes()
        L20:
            r1.update(r0)
            long r3 = r1.getValue()
            long r0 = (long) r5
            long r3 = r3 % r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
            return r12
        L30:
            if (r10 == 0) goto L47
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L47
            int r5 = (int) r12
            if (r5 == 0) goto L57
            if (r5 == r2) goto L8
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            byte[] r0 = r10.getBytes()
            goto L20
        L47:
            r0 = 32
            long r5 = r12 >> r0
            r3 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r3
            int r1 = (int) r5
            if (r1 == r2) goto L5e
            r0 = 2
            if (r1 == r0) goto L5a
            r0 = 3
            if (r1 == r0) goto L5a
        L57:
            long r12 = X.AbstractC06750Xr.A00
            return r12
        L5a:
            int r0 = (int) r12
            if (r0 != 0) goto L8
            goto L57
        L5e:
            X.0XM r1 = r7.A0l
            int r0 = (int) r12
            int r1 = r1.E7i(r0)
            r0 = 48
            long r12 = r12 >> r0
            long r12 = r12 & r3
            int r0 = (int) r12
            long r12 = X.AbstractC06750Xr.A00(r1, r0, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006802i.A01(X.0X2, java.lang.String, java.lang.String, int, long, boolean, boolean):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004e, code lost:
    
        if (r9.CY1(r33) != false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.quicklog.EventBuilder A02(X.C0XG r31, java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006802i.A02(X.0XG, java.lang.String, int):com.facebook.quicklog.EventBuilder");
    }

    private void A0E(Map map, int i, long j, short s) {
        RunnableC16080r6 A0N = A0N(null, A04(null, i, 0), null, null, TimeUnit.NANOSECONDS, i, 0, 0, -1, -1L, true, true);
        if (A0N != null) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    A0N.ABZ((String) entry.getKey(), (String) entry.getValue());
                }
            }
            A0N.A06 = j;
            A0N.A0M = s;
            A0N.A0B = this.A06.now();
            A0N.A09 = this.A05.nowNanos();
            A0N.A0N = (short) 1;
            A0m(A0N, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r14.A0l.CY1(r10) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0H(X.C0XM r12, X.RunnableC16080r6 r13, X.C006802i r14) {
        /*
            r3 = r13
            long r4 = r13.A0A
            r0 = 48
            long r7 = r4 >> r0
            r0 = 255(0xff, double:1.26E-321)
            long r7 = r7 & r0
            int r6 = (int) r7
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = 1
            r0 = 4
            if (r6 == r0) goto L5d
            r0 = 10
            if (r6 == r0) goto L19
            boolean r1 = r13.A0O
            return r1
        L19:
            r6 = r14
            X.0x4 r5 = r14.A04
            X.0XG r0 = r13.A0F
            if (r0 == 0) goto L67
            int r10 = r0.A01
        L22:
            long r11 = r12.BqB(r10)
            int r4 = (int) r11
            r0 = -1
            r14 = 0
            if (r4 != r0) goto L2c
            r14 = 1
        L2c:
            boolean r0 = A0I(r6)
            if (r0 != 0) goto L48
            boolean r0 = r6.A0G()
            if (r0 != 0) goto L48
            if (r5 == 0) goto L51
            X.0do r0 = r5.A00
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
        L48:
            X.0XM r0 = r6.A0l
            boolean r0 = r0.CY1(r10)
            r13 = 1
            if (r0 == 0) goto L52
        L51:
            r13 = 0
        L52:
            r7 = 0
            java.lang.String r8 = r3.A0J
            java.lang.String r9 = r3.A0K
            long r4 = r6.A01(r7, r8, r9, r10, r11, r13, r14)
            r3.A0A = r4
        L5d:
            int r0 = (int) r4
            if (r0 == r2) goto L65
            if (r0 == 0) goto L65
        L62:
            r3.A0O = r1
            return r1
        L65:
            r1 = 0
            goto L62
        L67:
            int r10 = r13.A03
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006802i.A0H(X.0XM, X.0r6, X.02i):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x035e A[Catch: all -> 0x0388, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036a A[Catch: all -> 0x0388, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0342 A[Catch: all -> 0x0388, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x0388, TRY_ENTER, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0381, TryCatch #2 {all -> 0x0381, blocks: (B:189:0x003b, B:191:0x003f, B:193:0x0043, B:195:0x004f, B:19:0x0068, B:21:0x0074, B:23:0x008a, B:53:0x0137, B:67:0x015c, B:69:0x0161, B:70:0x0164, B:25:0x008f, B:27:0x0095, B:32:0x0153, B:52:0x0134, B:65:0x0158, B:66:0x015b, B:29:0x0098, B:31:0x009c, B:33:0x00ad, B:35:0x00b3, B:36:0x00cf, B:39:0x00ea, B:40:0x00eb, B:43:0x00f4, B:45:0x00fa, B:46:0x010b, B:48:0x010f, B:49:0x0114, B:51:0x0130, B:62:0x0151, B:63:0x0152), top: B:188:0x003b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167 A[Catch: all -> 0x0388, TRY_ENTER, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f A[Catch: all -> 0x0388, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0 A[Catch: all -> 0x0388, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c6 A[Catch: all -> 0x0388, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0 A[Catch: all -> 0x0388, TryCatch #7 {, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0010, B:13:0x002d, B:17:0x005c, B:18:0x0064, B:56:0x013e, B:74:0x0167, B:75:0x016f, B:77:0x018f, B:79:0x0199, B:81:0x019d, B:83:0x01b0, B:84:0x01c2, B:87:0x01c6, B:89:0x01d0, B:91:0x01eb, B:93:0x01f0, B:94:0x01fa, B:96:0x01ff, B:97:0x0201, B:99:0x021d, B:100:0x0225, B:102:0x022c, B:116:0x0263, B:118:0x0268, B:120:0x02ba, B:124:0x0356, B:126:0x035e, B:127:0x0367, B:130:0x0371, B:131:0x036a, B:132:0x0342, B:137:0x0278, B:185:0x0387, B:139:0x0218, B:142:0x0284, B:145:0x029e, B:149:0x02b1, B:151:0x02b7, B:152:0x02c0, B:154:0x02c8, B:156:0x02dc, B:157:0x02e4, B:172:0x0333, B:174:0x0338, B:184:0x0384, B:186:0x029c, B:187:0x0282, B:197:0x001d, B:159:0x02e9, B:171:0x0330, B:180:0x0380, B:179:0x037d, B:166:0x030e, B:167:0x0321, B:169:0x032b, B:177:0x0315, B:104:0x0234, B:113:0x0256, B:115:0x025b, B:134:0x0273, B:135:0x0276, B:106:0x023e, B:108:0x0245, B:109:0x024d, B:111:0x0251), top: B:2:0x0002, inners: #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.RunnableC16080r6 A0O(X.C0XP r39, java.lang.String r40, java.lang.String r41, java.util.concurrent.TimeUnit r42, int r43, int r44, int r45, int r46, long r47, boolean r49) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006802i.A0O(X.0XP, java.lang.String, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, long, boolean):X.0r6");
    }

    public final void A0Q(final int i, final int i2, long j) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, i2)));
        }
        if (this.A0b) {
            String A05 = A05(i, i2, this.A0f, this.A0d, this.A0e);
            if (A0P(A05, null, TimeUnit.MILLISECONDS, i, i2, 0, -1L, true) != null) {
                this.A0I.put(String.valueOf(C0XD.A00(i, i2)), A05);
            }
        } else {
            markerStart(i, i2);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.0k7
            @Override // java.lang.Runnable
            public final void run() {
                C006802i.this.markerEnd(i, i2, (short) 113);
            }
        }, j);
    }

    public final void A0U(int i, int i2, String str, int i3) {
        int i4 = i;
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            this.A0A.A0B(c0x2, A0M(), str, i4, i2, i3);
            InterfaceC06740Xq interfaceC06740Xq = this.A0n;
            if (interfaceC06740Xq != null) {
                C0XG A04 = A04(c0x2, i, i2);
                if (A04 != null) {
                    i4 = A04.A01;
                }
                if (this.A0l.AsU().AVP(i4, str) != -1) {
                    interfaceC06740Xq.EET(i4, i2, str, i3);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "int", false);
            }
        }
    }

    public final void A0W(int i, int i2, String str, String str2) {
        int i3 = i;
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            this.A0A.A0C(c0x2, A0M(), str, str2, i3, i2);
            InterfaceC06740Xq interfaceC06740Xq = this.A0n;
            if (interfaceC06740Xq != null) {
                C0XG A04 = A04(c0x2, i, i2);
                if (A04 != null) {
                    i3 = A04.A01;
                }
                if (this.A0l.AsU().AVP(i3, str) != -1) {
                    interfaceC06740Xq.EEU(i3, i2, str, str2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, IgNetworkingModule.REQUEST_BODY_KEY_STRING, false);
            }
        }
    }

    public final void A0Y(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, i2)));
        }
        RunnableC16080r6 A0P = A0P(str, null, timeUnit, i, i2, 0, j, z);
        if (this.A0b && A0P != null) {
            this.A0I.put(String.valueOf(C0XD.A00(i, i2)), str);
        }
    }

    public final void A0e(int i, long j) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, 0)));
        }
        if (this.A0b) {
            String A05 = A05(i, 0, this.A0f, this.A0d, this.A0e);
            if (A0P(A05, null, TimeUnit.MILLISECONDS, i, 0, 0, j, true) != null) {
                this.A0I.put(String.valueOf(C0XD.A00(i, 0)), A05);
                return;
            }
            return;
        }
        markerStart(i, 0, j, TimeUnit.MILLISECONDS);
    }

    public final void A0f(final int i, long j) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, 0)));
        }
        if (this.A0b) {
            String A05 = A05(i, 0, this.A0f, this.A0d, this.A0e);
            if (A0P(A05, null, TimeUnit.MILLISECONDS, i, 0, 0, -1L, true) != null) {
                this.A0I.put(String.valueOf(C0XD.A00(i, 0)), A05);
            }
        } else {
            markerStart(i);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.0k6
            @Override // java.lang.Runnable
            public final void run() {
                C006802i.this.markerEnd(i, (short) 113);
            }
        }, j);
    }

    public final void A0g(int i, String str) {
        markEventBuilder(i, str).setLevel(7).report();
    }

    public final void A0h(int i, String str, String str2) {
        if (A0K(this, str)) {
            this.A0A.A0C(null, C0XP.A07, str, str2, i, 0);
        }
    }

    public final void A0k(RunnableC16080r6 runnableC16080r6, String str, String str2) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(runnableC16080r6.A03);
            }
            this.A0A.A0A(c0x2, A0M(), runnableC16080r6, str, str2);
            InterfaceC06740Xq interfaceC06740Xq = this.A0n;
            if (interfaceC06740Xq != null && this.A0l.AsU().AVP(runnableC16080r6.getMarkerId(), str) != -1) {
                interfaceC06740Xq.EEU(runnableC16080r6.getMarkerId(), runnableC16080r6.A02, str, str2);
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, IgNetworkingModule.REQUEST_BODY_KEY_STRING, true);
            }
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void dropAllInstancesOfMarker(int i) {
        long currentMonotonicTimestampNanos = currentMonotonicTimestampNanos();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Iterator it = this.A0A.A07(i).iterator();
        while (it.hasNext()) {
            A0R(i, ((Number) it.next()).intValue(), currentMonotonicTimestampNanos, timeUnit, 0);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final boolean isMarkerOn(int i) {
        return isMarkerOn(i, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, String str) {
        return A02(null, str, i);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i) {
        markerDrop(i, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDropForUserFlow(int i, int i2) {
        A0R(i, i2, currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS, 2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        markerEnd(i, 0, s, j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerEndAtPoint(int i, int i2, short s, String str) {
        if (this.A0c) {
            this.A0K.remove(Long.valueOf(C0XD.A00(i, i2)));
        }
        if (this.A0b) {
            String valueOf = String.valueOf(C0XD.A00(i, i2));
            Map map = this.A0I;
            if (map.containsKey(valueOf)) {
                map.remove(valueOf);
            }
        }
        A0i(null, str, TimeUnit.NANOSECONDS, i, i2, 0, -1L, s);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerGenerate(int i, short s, long j, TimeUnit timeUnit) {
        long j2 = j;
        if (j > 0) {
            j2 = timeUnit.toNanos(j);
        }
        A0E(null, i, j2, s);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        long j2 = j;
        if (j > 0) {
            j2 = timeUnit.toNanos(j);
        }
        A0E(map, i, j2, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        RunnableC16080r6 A0O = A0O(A0M(), null, str, timeUnit, i, i2, 2, -1, j2, z);
        A07(i, i2, j);
        if (A0O != null) {
            this.A0A.A0A(null, A0M(), A0O, "sampling_basis", str);
        }
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z) {
        markerStartWithCancelPolicy(i, z, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i) {
        return withMarker(i, 0);
    }

    private long A00(C0X2 c0x2, int i) {
        int E7i;
        int i2;
        C023509j c023509j;
        RunnableC16080r6 A01;
        C10390h6 c10390h6 = this.A0o;
        if (c10390h6 != null && !c10390h6.A01.getAndSet(true) && (A01 = C023509j.A01((c023509j = c10390h6.A00), TimeUnit.NANOSECONDS, 27787268)) != null) {
            A01.A0W.A05("markerId", i);
            c023509j.A00.execute(A01);
        }
        C0X4 c0x4 = this.A08;
        c0x4.A00(c0x2);
        try {
            int i3 = this.A0D.get(i, Integer.MIN_VALUE);
            c0x4.A01(c0x2);
            if (i3 != Integer.MIN_VALUE) {
                E7i = this.A0l.E7i(i3);
                i2 = 4;
            } else {
                E7i = this.A0l.E7i(Integer.MAX_VALUE);
                i2 = 3;
            }
            return AbstractC06750Xr.A00(E7i, i2, 1);
        } catch (Throwable th) {
            c0x4.A01(c0x2);
            throw th;
        }
    }

    private C0XG A03(C0X2 c0x2, int i, int i2) {
        return this.A0B.EEn(c0x2, C0XD.A00(i, i2));
    }

    private C0XG A04(C0X2 c0x2, int i, int i2) {
        return this.A0B.AXb(c0x2, C0XD.A00(i, i2));
    }

    public static String A05(int i, int i2, boolean z, boolean z2, boolean z3) {
        StringBuilder sb;
        String str;
        if (z) {
            sb = new StringBuilder();
            sb.append(C0HM.A00().toString());
            str = Integer.toString(i);
        } else {
            if (z2) {
                Random random = new Random();
                sb = new StringBuilder();
                sb.append(random.nextInt(Integer.MAX_VALUE));
                str = "-";
                sb.append("-");
                sb.append(System.currentTimeMillis());
            } else if (z3) {
                Random random2 = new Random();
                sb = new StringBuilder();
                sb.append(random2.nextInt(Integer.MAX_VALUE));
                str = "-";
            } else {
                return "fixed-join-id";
            }
            sb.append(str);
            sb.append(Integer.toString(i));
        }
        sb.append(str);
        sb.append(Integer.toString(i2));
        return sb.toString();
    }

    public static String A06(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString().replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    private void A07(int i, int i2, long j) {
        C0XD c0xd = this.A0A;
        if (j != -1) {
            long A00 = C0XD.A00(i, i2);
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(null);
            try {
                RunnableC16080r6 A01 = c0xd.A03.A01(null, A00);
                if (A01 == null) {
                    return;
                }
                c0xb.E7e(null, A01);
                try {
                    A01.A0C = j;
                } finally {
                    c0xb.E7f(null, A01);
                }
            } finally {
                c0xb.CIy(null);
            }
        }
    }

    public static void A08(C0XP c0xp, RunnableC16080r6 runnableC16080r6, boolean z) {
        if (c0xp.A04(runnableC16080r6.A0F, runnableC16080r6.A03, runnableC16080r6.A01)) {
            if (runnableC16080r6.A0L != null) {
                c0xp.A02(null, runnableC16080r6);
                return;
            }
            C09H c09h = new C09H(runnableC16080r6);
            c09h.A00 = runnableC16080r6.A09;
            C16040qz c16040qz = c0xp.A03;
            if (c16040qz != null) {
                C16040qz.A00(null, c09h, c16040qz, 1);
            }
            String str = null;
            int i = 0;
            for (String str2 : runnableC16080r6.A0W.A04()) {
                if (i % 2 == 0) {
                    str = str2;
                } else {
                    c09h.A01 = str;
                    c09h.A02 = str2;
                    c0xp.A01(null, c09h);
                }
                i++;
            }
            C0X7 c0x7 = runnableC16080r6.A0E;
            if (c0x7 != null) {
                int i2 = c0x7.A01;
                for (int i3 = 0; i3 < i2; i3++) {
                    String str3 = c0x7.A06[i3];
                    C0XJ c0xj = c0x7.A04[i3];
                    long millis = TimeUnit.NANOSECONDS.toMillis(c0x7.A03[i3]);
                    long j = c0x7.A03[i3];
                    int i4 = c0x7.A02[i3];
                    c09h.A00 = j;
                    c0xp.A00(null, c0xj, c09h, str3, i4, millis, j, false);
                }
            }
            if (!z) {
                return;
            }
            c09h.A00 = runnableC16080r6.A09 + runnableC16080r6.A06;
            if (c16040qz == null) {
                return;
            }
            C16040qz.A00(null, c09h, c16040qz, 2);
        }
    }

    public static synchronized void A09(C006802i c006802i, String str, int i) {
        String str2;
        synchronized (c006802i) {
            int length = str.length();
            int i2 = ((length + 1000) - 1) / 1000;
            int i3 = 0;
            while (i3 < i2) {
                if (i3 <= 0) {
                    str2 = "";
                } else {
                    str2 = "...";
                }
                int i4 = i3 * 1000;
                i3++;
                String A0R = AnonymousClass001.A0R(str2, str.substring(i4, Math.min(i3 * 1000, length)));
                if (i != 2 && i != 3) {
                    C0K8.A0D("QuickPerformanceLoggerImpl", A0R);
                }
            }
        }
    }

    public static void A0B(String str, Object obj, String str2) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(AnonymousClass001.A11("Component ", str, " should already be resolved, but was not. Check if the ", str2, " is a correct stage, or a stack trace: why it is called earlier then expected?"));
        }
    }

    public static void A0C(String str, StringBuilder sb, List list) {
        sb.append('\"');
        sb.append(str);
        sb.append("\":[");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append('\"');
            sb.append(A06(obj));
            sb.append('\"');
            z = false;
        }
        sb.append("]");
    }

    public static void A0D(String str, StringBuilder sb, Map map) {
        sb.append('\"');
        sb.append(str);
        sb.append("\":{");
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            if (entry.getValue() instanceof Map) {
                A0D(entry.getKey().toString(), sb, (Map) entry.getValue());
            } else {
                sb.append('\"');
                sb.append(entry.getKey());
                sb.append("\":\"");
                sb.append(A06(entry.getValue()));
                sb.append('\"');
            }
            z = false;
        }
        sb.append("}");
    }

    private boolean A0F() {
        TriState triState;
        C19220x4 c19220x4 = this.A04;
        if (c19220x4 == null) {
            return false;
        }
        if (this.A0i == TriState.UNSET) {
            if (!((Boolean) c19220x4.A00.getValue()).booleanValue()) {
                triState = TriState.NO;
            } else {
                triState = TriState.YES;
            }
            this.A0i = triState;
        }
        return this.A0i.asBoolean(false);
    }

    private boolean A0G() {
        TriState triState;
        if (this.A04 == null) {
            return false;
        }
        if (this.A0k == TriState.UNSET) {
            String str = "";
            String A03 = AbstractC02650Ap.A03("perfmarker_send_all");
            if (!A03.isEmpty()) {
                str = A03;
            }
            if (!"true".equals(str) && !"true".equals(System.getProperty("perfmarker_send_all", ""))) {
                triState = TriState.NO;
            } else {
                triState = TriState.YES;
            }
            this.A0k = triState;
        }
        return this.A0k.asBoolean(false);
    }

    public static boolean A0J(C006802i c006802i) {
        TriState triState;
        if (c006802i.A04 == null) {
            return false;
        }
        if (c006802i.A0j == TriState.UNSET) {
            String str = "";
            String A03 = AbstractC02650Ap.A03("perfmarker_to_logcat_json");
            if (!A03.isEmpty()) {
                str = A03;
            }
            if (!"true".equals(str) && !"true".equals(System.getProperty("perfmarker_to_logcat_json", ""))) {
                triState = TriState.NO;
            } else {
                triState = TriState.YES;
            }
            c006802i.A0j = triState;
        }
        return c006802i.A0j.asBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r0 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0K(X.C006802i r1, java.lang.String r2) {
        /*
            if (r2 == 0) goto L9
            boolean r0 = r2.isEmpty()
            r2 = 0
            if (r0 == 0) goto La
        L9:
            r2 = 1
        La:
            X.0h6 r1 = r1.A0o
            if (r2 == 0) goto L18
            if (r1 == 0) goto L18
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            r1.A08(r0)
        L18:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006802i.A0K(X.02i, java.lang.String):boolean");
    }

    public final long A0L(long j, TimeUnit timeUnit) {
        if (j == -1) {
            return this.A05.nowNanos();
        }
        return timeUnit.toNanos(j);
    }

    public final C0XP A0M() {
        C0XQ c0xq = this.A0m;
        if (c0xq == null) {
            return C0XP.A07;
        }
        return c0xq.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        if (r21.A0l.CY1(r27) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.RunnableC16080r6 A0N(X.C0X2 r22, X.C0XG r23, java.lang.String r24, java.lang.String r25, java.util.concurrent.TimeUnit r26, int r27, int r28, int r29, int r30, long r31, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006802i.A0N(X.0X2, X.0XG, java.lang.String, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, long, boolean, boolean):X.0r6");
    }

    public final RunnableC16080r6 A0P(String str, String str2, TimeUnit timeUnit, int i, int i2, int i3, long j, boolean z) {
        if (str == null) {
            return null;
        }
        RunnableC16080r6 A0O = A0O(A0M(), str, str2, timeUnit, i, i2, i3, -1, j, z);
        if (A0O == null) {
            return A0O;
        }
        C0XD c0xd = this.A0A;
        c0xd.A0A(null, A0M(), A0O, "join_id", str);
        c0xd.A0A(null, A0M(), A0O, CacheBehaviorLogger.SOURCE, DexOptimization.OPT_KEY_CLIENT);
        c0xd.A0A(null, A0M(), A0O, "sampling_basis", str2);
        return A0O;
    }

    public final void A0R(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        int i4;
        if (this.A0c) {
            this.A0K.remove(Long.valueOf(C0XD.A00(i, i2)));
        }
        if (this.A0b) {
            String valueOf = String.valueOf(C0XD.A00(i, i2));
            Map map = this.A0I;
            if (map.containsKey(valueOf)) {
                map.remove(valueOf);
            }
        }
        C0XG A03 = A03(null, i, i2);
        if (A03 == null) {
            i4 = i;
        } else {
            i4 = A03.A01;
        }
        InterfaceC06740Xq interfaceC06740Xq = this.A0n;
        if ((i3 & 2) != 0 && interfaceC06740Xq != null) {
            interfaceC06740Xq.EEV(i4, i2);
        }
        if (this.A0A.A05(A0M(), timeUnit, i, i2, j) != null) {
            A0A(this, "markerDrop", null, null, i);
        }
    }

    public final void A0S(int i, int i2, String str) {
        A0Y(i, i2, str, true, -1L, TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        if (r19.A03(r12, r9.getMarkerId()) != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[Catch: all -> 0x021e, TryCatch #4 {, blocks: (B:11:0x0033, B:13:0x0039, B:14:0x003d, B:21:0x0054, B:24:0x007b, B:26:0x0081, B:27:0x0089, B:51:0x0115, B:53:0x011a, B:55:0x0125, B:56:0x012d, B:76:0x01a1, B:79:0x01af, B:81:0x01b3, B:82:0x01b7, B:83:0x01c5, B:86:0x01cc, B:88:0x01d4, B:89:0x01da, B:92:0x01e3, B:94:0x01ed, B:96:0x0200, B:101:0x01dd, B:105:0x01a7, B:124:0x021a, B:125:0x021d, B:137:0x0044, B:29:0x0096, B:33:0x00a2, B:35:0x00ac, B:50:0x010b, B:58:0x0137, B:74:0x019c, B:117:0x0215, B:118:0x0218, B:37:0x00af, B:41:0x00be, B:43:0x00c2, B:49:0x00d2, B:59:0x013a, B:61:0x014b, B:63:0x0159, B:66:0x017a, B:68:0x0180, B:69:0x0188, B:71:0x018e, B:73:0x0194, B:45:0x00cd, B:107:0x00de, B:110:0x00f4, B:112:0x0104, B:113:0x0108, B:114:0x00ea), top: B:10:0x0033, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0i(X.C0XP r30, java.lang.String r31, java.util.concurrent.TimeUnit r32, int r33, int r34, int r35, long r36, short r38) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006802i.A0i(X.0XP, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, long, short):void");
    }

    public final void A0l(RunnableC16080r6 runnableC16080r6, String str, String str2, TimeUnit timeUnit, int i, int i2, long j) {
        C0XJ c0xj;
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(runnableC16080r6.A03);
            }
            boolean z = false;
            if (j == -1) {
                z = true;
            }
            long A0L = A0L(j, timeUnit);
            C0XD c0xd = this.A0A;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            boolean z2 = false;
            if (!z) {
                z2 = true;
            }
            C0XP A0M = A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            if (str2 != null) {
                try {
                    c0xj = new C0XJ();
                    c0xj.A00("__key", str2, 1);
                    c0xj.A03 = true;
                } catch (Throwable th) {
                    c0xb.CIy(c0x2);
                    throw th;
                }
            } else {
                c0xj = null;
            }
            c0xb.CIy(c0x2);
            c0xd.A08(c0x2, c0xj, A0M, runnableC16080r6, str, timeUnit2, i, i2, A0L, z2);
            A0A(this, "markerPoint", str, str2, runnableC16080r6.A03);
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A05(c0x2);
            }
        }
    }

    public final void A0m(final RunnableC16080r6 runnableC16080r6, boolean z) {
        String str;
        String str2;
        if (z) {
            if (this.A0h != 3) {
                ConcurrentLinkedQueue concurrentLinkedQueue = this.A0M;
                if (concurrentLinkedQueue.size() < 15000) {
                    concurrentLinkedQueue.add(runnableC16080r6);
                    return;
                }
                concurrentLinkedQueue.clear();
                RuntimeException runtimeException = new RuntimeException("Postponed events queue is full");
                if (this.A0o == null) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = this.A0L;
                    if (concurrentLinkedQueue2.size() < 10) {
                        concurrentLinkedQueue2.add(runtimeException);
                        return;
                    } else {
                        str = "QuickPerformanceLoggerImpl";
                        str2 = "SoftError occurred, but was not reported: error queue is full";
                    }
                } else {
                    C10390h6 c10390h6 = this.A0o;
                    if (c10390h6 != null) {
                        ((C19180x0) c10390h6.A00.A02.get()).A00.EmP("qpl", "error", runtimeException);
                        return;
                    } else {
                        str = "QuickPerformanceLoggerImpl";
                        str2 = "SoftError occurred, but was not reported: health monitor is off";
                    }
                }
                C0K8.A0F(str, str2, runtimeException);
                return;
            }
            while (runnableC16080r6 != null) {
                A0m(runnableC16080r6, false);
                runnableC16080r6 = (RunnableC16080r6) this.A0M.poll();
            }
            return;
        }
        final ExecutorC19230x5 executorC19230x5 = this.A03;
        A0B("BackgroundExecution", executorC19230x5, "MATURE");
        executorC19230x5.execute(new Runnable() { // from class: X.0Xj
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
            /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
            @Override // java.lang.Runnable
            public final void run() {
                final C006802i c006802i = this;
                final RunnableC16080r6 runnableC16080r62 = runnableC16080r6;
                ExecutorC19230x5 executorC19230x52 = executorC19230x5;
                final ?? obj = new Object();
                final ExecutorC19230x5 executorC19230x53 = c006802i.A03;
                C006802i.A0B("BackgroundExecution", executorC19230x53, "mature");
                InterfaceC08830cm interfaceC08830cm = c006802i.A0Y;
                if (runnableC16080r62.CKj()) {
                    C24991Kb c24991Kb = new C24991Kb();
                    for (C0X0 c0x0 : (Collection) interfaceC08830cm.get()) {
                        if (runnableC16080r62.CYk(c0x0.Cpb()) && c0x0.CTn(c24991Kb)) {
                            C0XF BTP = runnableC16080r62.BTP();
                            String AOP = c0x0.AOP();
                            C0XF.A00(BTP);
                            BTP.A01.add(AOP);
                            c0x0.DaR(runnableC16080r62);
                        }
                    }
                }
                ListenableFuture listenableFuture = C25191Kx.A01;
                final C07G c07g = c006802i.A01;
                if (c07g != null && runnableC16080r62.CKj()) {
                    final C24991Kb c24991Kb2 = new C24991Kb();
                    int[] iArr = c07g.A00;
                    int i = 0;
                    do {
                        final int i2 = iArr[i];
                        if (runnableC16080r62.CYl(i2)) {
                            final ?? obj2 = new Object();
                            C1LI c1li = new C1LI(ImmutableList.copyOf(new ListenableFuture[]{listenableFuture}));
                            final Runnable runnable = new Runnable() { // from class: X.0Xl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object obj3;
                                    Object obj4;
                                    C07G c07g2 = c07g;
                                    int i3 = i2;
                                    AbstractC208210e abstractC208210e = c24991Kb2;
                                    final SettableFuture settableFuture = obj2;
                                    RunnableC16080r6 runnableC16080r63 = runnableC16080r62;
                                    ExecutorC19230x5 executorC19230x54 = executorC19230x53;
                                    try {
                                        InterfaceC06630Wx A00 = c07g2.A00(i3);
                                        if (!A00.CTn(abstractC208210e)) {
                                            settableFuture.set(null);
                                            return;
                                        }
                                        int Biy = A00.Biy();
                                        InterfaceC07540aT interfaceC07540aT = runnableC16080r63.A0G;
                                        if (interfaceC07540aT == null) {
                                            obj3 = null;
                                        } else {
                                            obj3 = interfaceC07540aT.get(Biy);
                                        }
                                        InterfaceC07540aT interfaceC07540aT2 = runnableC16080r63.A0H;
                                        if (interfaceC07540aT2 == null) {
                                            obj4 = null;
                                        } else {
                                            obj4 = interfaceC07540aT2.get(Biy);
                                        }
                                        C0XF BTP2 = runnableC16080r63.BTP();
                                        String Bix = A00.Bix();
                                        C0XF.A00(BTP2);
                                        BTP2.A01.add(Bix);
                                        A00.AON(runnableC16080r63, A00.Bzs().cast(obj3), A00.ByC().cast(obj4)).addListener(new Runnable() { // from class: X.0Xk
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                SettableFuture.this.set(null);
                                            }
                                        }, executorC19230x54);
                                    } catch (Exception unused) {
                                    }
                                }
                            };
                            c1li.A00(new Callable() { // from class: X.1LM
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    runnable.run();
                                    return null;
                                }
                            }, executorC19230x53);
                            listenableFuture = obj2;
                        }
                        i++;
                    } while (i < 15);
                }
                C1LI c1li2 = new C1LI(ImmutableList.copyOf(new ListenableFuture[]{listenableFuture}));
                final Runnable runnable2 = new Runnable() { // from class: X.0Xm
                    @Override // java.lang.Runnable
                    public final void run() {
                        Lock readLock;
                        String obj3;
                        long longValue;
                        long A02;
                        C0Xc[] c0XcArr;
                        C006802i c006802i2 = c006802i;
                        RunnableC16080r6 runnableC16080r63 = runnableC16080r62;
                        SettableFuture settableFuture = obj;
                        try {
                            C11C c11c = c006802i2.A0M().A02;
                            if (c11c != null) {
                                C0XG c0xg = runnableC16080r63.A0F;
                                if (c0xg == null) {
                                    A02 = c11c.A02(runnableC16080r63.getMarkerId(), 0);
                                } else {
                                    A02 = c11c.A02(c0xg.A00, 0) | c11c.A02(c0xg.A01, 0);
                                }
                                if (A02 != 0 && (c0XcArr = c11c.A02) != null) {
                                    for (int i3 = 0; i3 < c0XcArr.length; i3++) {
                                    }
                                }
                            }
                            Iterator it = ((Collection) c006802i2.A0Z.get()).iterator();
                            while (it.hasNext()) {
                                final C07370aB c07370aB = (C07370aB) ((InterfaceC06670Xe) it.next());
                                ReadWriteLock readWriteLock = c07370aB.A08;
                                readWriteLock.readLock().lock();
                                try {
                                    boolean z2 = c07370aB.A02;
                                    readWriteLock.readLock().unlock();
                                    if (!z2) {
                                        readWriteLock.writeLock().lock();
                                        try {
                                            if (!c07370aB.A02) {
                                                boolean equals = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(AbstractC02650Ap.A03("facebook.PerfSocketEnabled"));
                                                c07370aB.A03 = equals;
                                                if (equals) {
                                                    int parseInt = Integer.parseInt(AbstractC02650Ap.A03("facebook.PerfSocketNumEvents"));
                                                    c07370aB.A01 = new HashSet();
                                                    for (int i4 = 0; i4 < parseInt; i4++) {
                                                        c07370aB.A01.add(AbstractC02650Ap.A03(AnonymousClass001.A0O("facebook.PerfSocketEvent", i4)));
                                                    }
                                                    c07370aB.A00 = Integer.parseInt(AbstractC02650Ap.A03("facebook.PerfSocketPort"));
                                                    c07370aB.A04 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(AbstractC02650Ap.A03("facebook.PerfSocketReqConfirm"));
                                                }
                                                c07370aB.A02 = true;
                                            }
                                            readWriteLock.writeLock().unlock();
                                        } catch (Throwable th) {
                                            th = th;
                                            readLock = readWriteLock.writeLock();
                                            readLock.unlock();
                                            throw th;
                                        }
                                    }
                                    if (c07370aB.A03) {
                                        int markerId = runnableC16080r63.getMarkerId();
                                        C11I c11i = c07370aB.A05;
                                        String A00 = c11i.A00(markerId);
                                        String A002 = AbstractC07060Yy.A00(runnableC16080r63.A0M);
                                        long j = runnableC16080r63.A0B;
                                        int Azm = runnableC16080r63.Azm();
                                        HashMap hashMap = new HashMap();
                                        int markerId2 = runnableC16080r63.getMarkerId();
                                        C0K8.A0P("MobileLabQPLSocketPublishListener", "QuickEvent %s(%d)'s enabled metadata categories: %d", c11i.A00(markerId2), Integer.valueOf(markerId2), Long.valueOf(runnableC16080r63.A07));
                                        C0K8.A0P("MobileLabQPLSocketPublishListener", "Is perf_event_info enabled: %b", Boolean.valueOf(runnableC16080r63.CYk(4294967296L)));
                                        if (runnableC16080r63.CKj()) {
                                            C0XF BTP2 = runnableC16080r63.BTP();
                                            String str3 = null;
                                            C0XF.A00(BTP2);
                                            ArrayList arrayList = BTP2.A01;
                                            int size = arrayList.size();
                                            int i5 = 0;
                                            for (int i6 = 0; i6 < size; i6++) {
                                                String str4 = (String) arrayList.get(i6);
                                                if (str4 == null) {
                                                    ArrayList arrayList2 = BTP2.A00;
                                                    int i7 = i5 + 1;
                                                    String str5 = (String) arrayList2.get(i5);
                                                    i5 = i7 + 1;
                                                    Object obj4 = arrayList2.get(i7);
                                                    if (!(obj4 instanceof String)) {
                                                        if (obj4 instanceof Integer) {
                                                            int intValue = ((Integer) obj4).intValue();
                                                            if (str3 != null) {
                                                                str5 = AnonymousClass001.A0g(str3, ".", str5);
                                                            }
                                                            longValue = intValue;
                                                        } else if (obj4 instanceof Long) {
                                                            longValue = ((Long) obj4).longValue();
                                                            if (str3 != null) {
                                                                str5 = AnonymousClass001.A0g(str3, ".", str5);
                                                            }
                                                        }
                                                        hashMap.put(str5, Long.valueOf(longValue));
                                                    }
                                                } else {
                                                    str3 = str4;
                                                }
                                            }
                                            hashMap.putAll(Collections.emptyMap());
                                        }
                                        ArrayList arrayList3 = new ArrayList(runnableC16080r63.A0W.A04());
                                        ArrayList arrayList4 = new ArrayList(runnableC16080r63.A0Y);
                                        String str6 = c07370aB.A06;
                                        C07100Zc c07100Zc = new C07100Zc(A00, A002, str6, arrayList3, arrayList4, hashMap, markerId, Azm, j);
                                        C0X7 c0x7 = runnableC16080r63.A0E;
                                        if (c0x7 != null) {
                                            String A003 = c11i.A00(runnableC16080r63.getMarkerId());
                                            for (int i8 = 0; i8 < c0x7.A01; i8++) {
                                                long millis = TimeUnit.NANOSECONDS.toMillis(c0x7.A03[i8]);
                                                String str7 = c0x7.A06[i8];
                                                C0XJ c0xj = c0x7.A04[i8];
                                                c07100Zc.A09.put(str7, Long.valueOf(millis));
                                                int markerId3 = runnableC16080r63.getMarkerId();
                                                String A0g = AnonymousClass001.A0g(A003, ":", str7);
                                                long j2 = runnableC16080r63.A0B + millis;
                                                int i9 = (int) millis;
                                                Map emptyMap = Collections.emptyMap();
                                                if (c0xj == null) {
                                                    obj3 = null;
                                                } else {
                                                    obj3 = c0xj.toString();
                                                }
                                                C07100Zc c07100Zc2 = new C07100Zc(A0g, "", str6, Arrays.asList("markerPointData", obj3), Collections.emptyList(), emptyMap, markerId3, i9, j2);
                                                List list = c07370aB.A07;
                                                synchronized (list) {
                                                    try {
                                                        list.add(c07100Zc2);
                                                    } finally {
                                                    }
                                                }
                                            }
                                        }
                                        final Runnable runnable3 = null;
                                        List list2 = c07370aB.A07;
                                        synchronized (list2) {
                                            try {
                                                list2.add(c07100Zc);
                                                readWriteLock.readLock().lock();
                                                try {
                                                    java.util.Set set = c07370aB.A01;
                                                    if (set != null && (set.contains("*") || c07370aB.A01.contains(c07100Zc.A04))) {
                                                        runnable3 = new Runnable() { // from class: X.0Zb
                                                            public final List A00;

                                                            {
                                                                List list3 = C07370aB.this.A07;
                                                                synchronized (list3) {
                                                                    this.A00 = new ArrayList(list3);
                                                                    list3.clear();
                                                                }
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                Object[] objArr;
                                                                String str8;
                                                                String trim;
                                                                List<C07100Zc> list3 = this.A00;
                                                                if (!list3.isEmpty()) {
                                                                    try {
                                                                        JSONArray jSONArray = new JSONArray();
                                                                        for (C07100Zc c07100Zc3 : list3) {
                                                                            JSONObject jSONObject = new JSONObject();
                                                                            int i10 = 0;
                                                                            while (true) {
                                                                                List list4 = c07100Zc3.A06;
                                                                                if (i10 >= list4.size()) {
                                                                                    break;
                                                                                }
                                                                                jSONObject.put((String) list4.get(i10), list4.get(i10 + 1));
                                                                                i10 += 2;
                                                                            }
                                                                            JSONObject jSONObject2 = new JSONObject();
                                                                            Map map = c07100Zc3.A08;
                                                                            for (String str9 : map.keySet()) {
                                                                                jSONObject2.put(str9, map.get(str9));
                                                                            }
                                                                            JSONObject jSONObject3 = new JSONObject();
                                                                            Map map2 = c07100Zc3.A09;
                                                                            for (String str10 : map2.keySet()) {
                                                                                jSONObject3.put(str10, map2.get(str10));
                                                                            }
                                                                            JSONObject jSONObject4 = new JSONObject();
                                                                            jSONObject4.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c07100Zc3.A01);
                                                                            jSONObject4.put("event", c07100Zc3.A04);
                                                                            jSONObject4.put("action", c07100Zc3.A03);
                                                                            jSONObject4.put("timestamp", c07100Zc3.A02);
                                                                            jSONObject4.put("duration", c07100Zc3.A00);
                                                                            jSONObject4.put("metadata", jSONObject2);
                                                                            jSONObject4.put("points", jSONObject3);
                                                                            jSONObject4.put("tags", c07100Zc3.A07);
                                                                            jSONObject4.put("extra", jSONObject);
                                                                            jSONObject4.put("process_name", c07100Zc3.A05);
                                                                            jSONArray.put(jSONObject4);
                                                                        }
                                                                        C07370aB c07370aB2 = C07370aB.this;
                                                                        Socket socket = new Socket("localhost", c07370aB2.A00);
                                                                        try {
                                                                            new PrintWriter(socket.getOutputStream(), true).println(jSONArray.toString());
                                                                            C0K8.A0A(RunnableC07090Zb.class, "Sent %d events.", Integer.valueOf(list3.size()));
                                                                            if (c07370aB2.A04) {
                                                                                String readLine = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                                                                                if (readLine == null) {
                                                                                    trim = "";
                                                                                } else {
                                                                                    trim = readLine.trim();
                                                                                }
                                                                                if (!"OK".equals(trim)) {
                                                                                    C0K8.A09(RunnableC07090Zb.class, "Recieving QPL event were not confirmed. Response: `%s`", trim);
                                                                                } else {
                                                                                    C0K8.A03(RunnableC07090Zb.class, "Recieved confirmation.");
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            socket.close();
                                                                        }
                                                                    } catch (IOException e) {
                                                                        e = e;
                                                                        objArr = new Object[0];
                                                                        str8 = "Unable to write record to socket.";
                                                                        C0K8.A07(RunnableC07090Zb.class, str8, e, objArr);
                                                                    } catch (JSONException e2) {
                                                                        e = e2;
                                                                        objArr = new Object[0];
                                                                        str8 = "Unable to construct JSON record.";
                                                                        C0K8.A07(RunnableC07090Zb.class, str8, e, objArr);
                                                                    }
                                                                }
                                                            }
                                                        };
                                                    }
                                                    readWriteLock.readLock().unlock();
                                                } catch (Throwable th2) {
                                                    readWriteLock.readLock().unlock();
                                                    throw th2;
                                                }
                                            } finally {
                                            }
                                        }
                                        if (runnable3 != null) {
                                            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.0x1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(596, 3, false, false);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    runnable3.run();
                                                }
                                            });
                                        }
                                    }
                                    if (c07370aB.A03) {
                                        C14360o3.A07(String.format("visit() %s %s", Arrays.copyOf(new Object[]{c07370aB.A05.A00(runnableC16080r63.getMarkerId()), AbstractC07060Yy.A00(runnableC16080r63.A0M)}, 2)));
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    readLock = readWriteLock.readLock();
                                }
                            }
                        } finally {
                            settableFuture.set(runnableC16080r63);
                        }
                    }
                };
                c1li2.A00(new Callable() { // from class: X.1LM
                    @Override // java.util.concurrent.Callable
                    public final /* bridge */ /* synthetic */ Object call() {
                        runnable2.run();
                        return null;
                    }
                }, executorC19230x52);
                C1LI c1li3 = new C1LI(ImmutableList.copyOf(new ListenableFuture[]{obj}));
                final Runnable runnable3 = new Runnable() { // from class: X.0Xn
                    @Override // java.lang.Runnable
                    public final void run() {
                        String format;
                        C006802i c006802i2 = c006802i;
                        RunnableC16080r6 runnableC16080r63 = runnableC16080r62;
                        ExecutorC19230x5 executorC19230x54 = c006802i2.A03;
                        C006802i.A0B("BackgroundExecution", executorC19230x54, "MATURE");
                        if (runnableC16080r63.A0O) {
                            if (!C20150ym.A07(AbstractC20070ye.A00(18308801337764937L)) || (C20150ym.A07(AbstractC20070ye.A00(18308801337764937L)) && runnableC16080r63.A0I == null)) {
                                runnableC16080r63.A0I = (C19200x2) c006802i2.A0V.get();
                            }
                            if (C006802i.A0I(c006802i2)) {
                                if (C006802i.A0J(c006802i2)) {
                                    StringBuilder sb = new StringBuilder("QPLSent - ");
                                    sb.append("{\"id\":");
                                    sb.append(runnableC16080r63.getMarkerId());
                                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                    sb.append("\"event\":\"");
                                    InterfaceC08830cm interfaceC08830cm2 = c006802i2.A0a;
                                    sb.append(((C11I) interfaceC08830cm2.get()).A00(runnableC16080r63.getMarkerId()));
                                    sb.append("\",");
                                    sb.append("\"action\":\"");
                                    interfaceC08830cm2.get();
                                    sb.append(AbstractC07060Yy.A00(runnableC16080r63.AYZ()));
                                    sb.append("\",");
                                    sb.append("\"unique_marker_debug_id\":");
                                    sb.append(AnonymousClass001.A0g("\"", runnableC16080r63.CCg(), "\""));
                                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                    sb.append("\"timestamp\":");
                                    sb.append(runnableC16080r63.C8d());
                                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                    sb.append("\"duration\":");
                                    sb.append(runnableC16080r63.Azm());
                                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                    sb.append("\"duration_nano\":");
                                    sb.append(runnableC16080r63.Azo());
                                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                    C006802i.A0C("tags", sb, runnableC16080r63.C53());
                                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                    C006802i.A0C("extra", sb, runnableC16080r63.B3f());
                                    if (!runnableC16080r63.BTP().A00.isEmpty()) {
                                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                        C006802i.A0D("metadata", sb, runnableC16080r63.BTP().A01());
                                    }
                                    C0X7 BeC = runnableC16080r63.BeC();
                                    if (BeC != null) {
                                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                        sb.append("\"points\":[");
                                        boolean z2 = true;
                                        for (int i3 = 0; i3 < BeC.A01; i3++) {
                                            long millis = TimeUnit.NANOSECONDS.toMillis(BeC.A03[i3]);
                                            String str3 = BeC.A06[i3];
                                            C0XJ c0xj = BeC.A04[i3];
                                            if (!z2) {
                                                sb.append(',');
                                            } else {
                                                z2 = false;
                                            }
                                            sb.append("{\"name\":\"");
                                            sb.append(C006802i.A06(str3));
                                            sb.append('\"');
                                            sb.append(",\"value\":");
                                            sb.append(millis);
                                            if (c0xj != null) {
                                                sb.append(",\"data\":{");
                                                boolean z3 = true;
                                                int i4 = 0;
                                                int i5 = 0;
                                                while (i4 < c0xj.A00) {
                                                    String[] strArr = c0xj.A02;
                                                    String str4 = strArr[i5];
                                                    String str5 = strArr[i5 + 1];
                                                    if (z3) {
                                                        z3 = false;
                                                    } else {
                                                        sb.append(',');
                                                    }
                                                    sb.append('\"');
                                                    sb.append(C006802i.A06(str4));
                                                    sb.append("\":\"");
                                                    sb.append(C006802i.A06(str5));
                                                    sb.append('\"');
                                                    i4++;
                                                    i5 += 2;
                                                }
                                                sb.append("}");
                                            }
                                            sb.append("}");
                                        }
                                        sb.append("]");
                                    }
                                    sb.append("}");
                                    format = sb.toString();
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    C0X7 c0x7 = runnableC16080r63.A0E;
                                    if (c0x7 != null) {
                                        for (int i6 = 0; i6 < c0x7.A01; i6++) {
                                            long millis2 = TimeUnit.NANOSECONDS.toMillis(c0x7.A03[i6]);
                                            String str6 = c0x7.A06[i6];
                                            C0XJ c0xj2 = c0x7.A04[i6];
                                            sb2.append("<p:");
                                            sb2.append(str6);
                                            if (c0xj2 != null) {
                                                sb2.append('=');
                                                sb2.append(c0xj2);
                                            }
                                            sb2.append(' ');
                                            sb2.append(millis2);
                                            sb2.append("[ms]>");
                                        }
                                        sb2.append(' ');
                                    }
                                    C0Wv c0Wv = runnableC16080r63.A0W;
                                    if (!c0Wv.A04().isEmpty()) {
                                        String str7 = null;
                                        int i7 = 0;
                                        for (String str8 : c0Wv.A04()) {
                                            i7++;
                                            if (i7 % 2 == 0) {
                                                sb2.append(", ");
                                                sb2.append(str7);
                                                sb2.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                                                sb2.append(str8);
                                            } else {
                                                str7 = str8;
                                            }
                                        }
                                    }
                                    if (!runnableC16080r63.A0Y.isEmpty()) {
                                        sb2.append(" ");
                                        sb2.append(runnableC16080r63.C54());
                                    }
                                    runnableC16080r63.BTP();
                                    sb2.append(" metadata=");
                                    sb2.append(runnableC16080r63.BTP().A01());
                                    Locale locale = Locale.US;
                                    InterfaceC08830cm interfaceC08830cm3 = c006802i2.A0a;
                                    String A00 = ((C11I) interfaceC08830cm3.get()).A00(runnableC16080r63.A03);
                                    interfaceC08830cm3.get();
                                    String A002 = AbstractC07060Yy.A00(runnableC16080r63.A0M);
                                    Integer valueOf = Integer.valueOf(runnableC16080r63.Azm());
                                    boolean z4 = runnableC16080r63.A0Q;
                                    boolean z5 = runnableC16080r63.A0P;
                                    int i8 = (int) ((runnableC16080r63.A0A >> 32) & 255);
                                    format = String.format(locale, "%s %s %s %d[ms]%s %s (1:%d) %s", "QPLSent - ", A00, A002, valueOf, "", C2VV.A00(i8, z4, z5), Integer.valueOf(i8), sb2.toString());
                                }
                                C006802i.A09(c006802i2, format, 4);
                                if (EndToEnd.isRunningEndToEndTest()) {
                                    synchronized (c006802i2) {
                                    }
                                }
                            }
                            executorC19230x54.execute(runnableC16080r63);
                            c006802i2.A00 = runnableC16080r63;
                        }
                    }
                };
                c1li3.A00(new Callable() { // from class: X.1LM
                    @Override // java.util.concurrent.Callable
                    public final /* bridge */ /* synthetic */ Object call() {
                        runnable3.run();
                        return null;
                    }
                }, executorC19230x52);
            }
        });
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestamp() {
        return this.A05.now();
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestampNanos() {
        return this.A05.nowNanos();
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void endAllInstancesOfMarker(int i, short s) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Iterator it = this.A0A.A07(i).iterator();
        while (it.hasNext()) {
            A0i(A0M(), null, timeUnit, i, ((Integer) it.next()).intValue(), 0, -1L, s);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void endAllMarkers(short s, final boolean z) {
        if (this.A0c) {
            this.A0K.clear();
        }
        if (this.A0b) {
            this.A0I.clear();
        }
        final long currentMonotonicTimestampNanos = currentMonotonicTimestampNanos();
        final TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (A0F()) {
            A09(this, "endAllMarkers", 2);
        }
        InterfaceC06740Xq interfaceC06740Xq = this.A0n;
        if (interfaceC06740Xq != null) {
            interfaceC06740Xq.EEZ();
        }
        final C0XD c0xd = this.A0A;
        C0XP A0M = A0M();
        final boolean z2 = false;
        if (s == 4340) {
            z2 = true;
        }
        C0XB c0xb = c0xd.A04;
        c0xb.CIx(null);
        try {
            C06610Wt c06610Wt = c0xd.A03;
            ArrayList EF3 = c06610Wt.A00.EF3(null, new QuickEventFilter() { // from class: X.10q
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
                
                    r8.E7f(null, r11);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0014, code lost:
                
                    if (r11.A0R == false) goto L6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
                
                    if (r11.A0S != false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
                
                    if (r11.A0C == (-1)) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
                
                    if (X.C0XD.A04(r11, r9.toMillis(r3)) == false) goto L18;
                 */
                @Override // com.facebook.quicklog.QuickEventFilter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean shouldRemove(X.RunnableC16080r6 r11) {
                    /*
                        r10 = this;
                        X.0XD r2 = X.C0XD.this
                        boolean r0 = r5
                        boolean r1 = r6
                        java.util.concurrent.TimeUnit r9 = r2
                        long r3 = r3
                        X.0XB r8 = r2.A04
                        r7 = 0
                        r8.E7e(r7, r11)
                        if (r0 == 0) goto L16
                        boolean r0 = r11.A0R     // Catch: java.lang.Throwable -> L2d
                        if (r0 != 0) goto L1c
                    L16:
                        if (r1 == 0) goto L34
                        boolean r0 = r11.A0S     // Catch: java.lang.Throwable -> L2d
                        if (r0 == 0) goto L34
                    L1c:
                        long r5 = r11.A0C     // Catch: java.lang.Throwable -> L2d
                        r1 = -1
                        int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                        if (r0 == 0) goto L39
                        long r0 = r9.toMillis(r3)     // Catch: java.lang.Throwable -> L2d
                        boolean r0 = X.C0XD.A04(r11, r0)     // Catch: java.lang.Throwable -> L2d
                        goto L32
                    L2d:
                        r0 = move-exception
                        r8.E7f(r7, r11)
                        throw r0
                    L32:
                        if (r0 == 0) goto L39
                    L34:
                        r8.E7f(r7, r11)
                        r0 = 1
                        return r0
                    L39:
                        r8.E7f(r7, r11)
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C209310q.shouldRemove(X.0r6):boolean");
                }
            });
            c0xb.CIy(null);
            Iterator it = EF3.iterator();
            while (it.hasNext()) {
                RunnableC16080r6 runnableC16080r6 = (RunnableC16080r6) it.next();
                c0xb.CIx(null);
                c0xb.E7e(null, runnableC16080r6);
                try {
                    runnableC16080r6.A0H = c0xd.A06(null, runnableC16080r6.A03, runnableC16080r6.A02, runnableC16080r6.A07);
                    C0XD.A03(c0xd, runnableC16080r6.A0G, runnableC16080r6.A07);
                    C0XD.A02(c0xd, runnableC16080r6, timeUnit, currentMonotonicTimestampNanos, s);
                    if (runnableC16080r6.A0C != -1 && C0XD.A04(runnableC16080r6, timeUnit.toMillis(currentMonotonicTimestampNanos))) {
                        runnableC16080r6.A0M = (short) 113;
                    } else {
                        runnableC16080r6.A0N = s;
                    }
                    runnableC16080r6.A08 = timeUnit.toNanos(currentMonotonicTimestampNanos);
                    C16040qz c16040qz = A0M.A03;
                    if (c16040qz != null) {
                        C16040qz.A00(null, runnableC16080r6, c16040qz, 2);
                    }
                    c0xb.E7f(null, runnableC16080r6);
                } catch (Throwable th) {
                    c0xb.E7f(null, runnableC16080r6);
                    c0xb.CIy(null);
                    throw th;
                }
            }
            Iterator it2 = EF3.iterator();
            while (it2.hasNext()) {
                RunnableC16080r6 runnableC16080r62 = (RunnableC16080r6) it2.next();
                A0A(this, "markerEnd", null, null, runnableC16080r62.getMarkerId());
                C0XG c0xg = runnableC16080r62.A0F;
                if (c0xg != null) {
                    A03(null, c0xg.A00, runnableC16080r62.A02);
                }
                A0m(runnableC16080r62, true);
            }
        } finally {
            c0xb.CIy(null);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        A0i(null, str, TimeUnit.NANOSECONDS, i, i2, 2, -1L, s);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, String str, int i2, short s) {
        A0i(null, str, TimeUnit.NANOSECONDS, i, i2, 2, -1L, s);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerLinkPivot(int i, int i2, String str) {
        this.A0B.E72(null, new C0XG(i, this.A0l.EKK(i, str), str), C0XD.A00(i, i2));
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerTag(int i, String str) {
        this.A0A.A0E(A0M(), str, i, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final int sampleRateForMarker(int i) {
        C19220x4 c19220x4 = this.A04;
        int BqB = (int) this.A0l.BqB(i);
        boolean z = false;
        if (BqB == -1) {
            z = true;
        }
        if (A0I(this) || A0G()) {
            return 1;
        }
        if (c19220x4 != null && ((Boolean) c19220x4.A00.getValue()).booleanValue()) {
            return 1;
        }
        if (z) {
            return (int) A00(null, i);
        }
        return BqB;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void updateListenerMarkers() {
        C0R9 c0r9;
        C0XQ c0xq = this.A0m;
        if (c0xq != null) {
            synchronized (c0xq) {
                C0XP c0xp = c0xq.A02;
                AwakeTimeSinceBootClock awakeTimeSinceBootClock = c0xp.A00;
                if (awakeTimeSinceBootClock != null && (c0r9 = c0xp.A05) != null) {
                    c0xp = new C0XP(awakeTimeSinceBootClock, c0xp.A01, c0xp.A04, c0r9, c0xp.A06);
                }
                c0xq.A02 = c0xp;
            }
        }
    }

    public static void A0A(C006802i c006802i, String str, String str2, String str3, int i) {
        String str4;
        if (A0I(c006802i)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(((C11I) c006802i.A0a.get()).A00(i));
            sb.append(" (");
            sb.append(i);
            sb.append(") ");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = ":";
            }
            sb.append(str4);
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            A09(c006802i, sb.toString(), 2);
        }
    }

    public static boolean A0I(C006802i c006802i) {
        if (!c006802i.A0F() && !A0J(c006802i)) {
            return false;
        }
        return true;
    }

    public final void A0T(int i, int i2, String str, double d) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (!c06610Wt.A03(c0x2, A0M, A00)) {
                if (c0x2 != null) {
                    c0x2.A04 = c0xd.A02.nowNanos();
                }
            } else {
                if (c0x2 != null) {
                    c0x2.A03 = c0xd.A02.nowNanos();
                }
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 == null) {
                        if (c0x2 != null) {
                            c0x2.A0B = c0xd.A02.nowNanos();
                        }
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = c0xd.A02.nowNanos();
                        }
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A02(str, d);
                                if (c0x2 != null) {
                                    c0x2.A01 = c0xd.A02.nowNanos();
                                }
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                    c0x2.A05 = c0xd.A02.nowNanos();
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "double", false);
            }
        }
    }

    public final void A0V(int i, int i2, String str, long j) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (!c06610Wt.A03(c0x2, A0M, A00)) {
                if (c0x2 != null) {
                    c0x2.A04 = c0xd.A02.nowNanos();
                }
            } else {
                if (c0x2 != null) {
                    c0x2.A03 = c0xd.A02.nowNanos();
                }
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 == null) {
                        if (c0x2 != null) {
                            c0x2.A0B = c0xd.A02.nowNanos();
                        }
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = c0xd.A02.nowNanos();
                        }
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A03(str, j);
                                if (c0x2 != null) {
                                    c0x2.A01 = c0xd.A02.nowNanos();
                                }
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                    c0x2.A05 = c0xd.A02.nowNanos();
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "long", false);
            }
        }
    }

    public final void A0X(int i, int i2, String str, boolean z) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (!c06610Wt.A03(c0x2, A0M, A00)) {
                if (c0x2 != null) {
                    c0x2.A04 = c0xd.A02.nowNanos();
                }
            } else {
                if (c0x2 != null) {
                    c0x2.A03 = c0xd.A02.nowNanos();
                }
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 == null) {
                        if (c0x2 != null) {
                            c0x2.A0B = c0xd.A02.nowNanos();
                        }
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = c0xd.A02.nowNanos();
                        }
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A0W.A06(str, z);
                                if (c0x2 != null) {
                                    c0x2.A01 = c0xd.A02.nowNanos();
                                }
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                    c0x2.A05 = c0xd.A02.nowNanos();
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "boolean", false);
            }
        }
    }

    public final void A0Z(int i, int i2, String str, double[] dArr) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (!c06610Wt.A03(c0x2, A0M, A00)) {
                if (c0x2 != null) {
                    c0x2.A04 = c0xd.A02.nowNanos();
                }
            } else {
                if (c0x2 != null) {
                    c0x2.A03 = c0xd.A02.nowNanos();
                }
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 == null) {
                        if (c0x2 != null) {
                            c0x2.A0B = c0xd.A02.nowNanos();
                        }
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = c0xd.A02.nowNanos();
                        }
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A04(str, dArr);
                                if (c0x2 != null) {
                                    c0x2.A01 = c0xd.A02.nowNanos();
                                }
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                    c0x2.A05 = c0xd.A02.nowNanos();
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "double_array", false);
            }
        }
    }

    public final void A0a(int i, int i2, String str, int[] iArr) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (!c06610Wt.A03(c0x2, A0M, A00)) {
                if (c0x2 != null) {
                    c0x2.A04 = c0xd.A02.nowNanos();
                }
            } else {
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 == null) {
                        if (c0x2 != null) {
                            c0x2.A0B = c0xd.A02.nowNanos();
                        }
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = c0xd.A02.nowNanos();
                        }
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A05(str, iArr);
                                if (c0x2 != null) {
                                    c0x2.A01 = c0xd.A02.nowNanos();
                                }
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                    c0x2.A05 = c0xd.A02.nowNanos();
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "int_array", false);
            }
        }
    }

    public final void A0b(int i, int i2, String str, long[] jArr) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (!c06610Wt.A03(c0x2, A0M, A00)) {
                if (c0x2 != null) {
                    c0x2.A04 = c0xd.A02.nowNanos();
                }
            } else {
                if (c0x2 != null) {
                    c0x2.A03 = c0xd.A02.nowNanos();
                }
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 == null) {
                        if (c0x2 != null) {
                            c0x2.A0B = c0xd.A02.nowNanos();
                        }
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = c0xd.A02.nowNanos();
                        }
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A06(str, jArr);
                                if (c0x2 != null) {
                                    c0x2.A01 = c0xd.A02.nowNanos();
                                }
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                    c0x2.A05 = c0xd.A02.nowNanos();
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "long_array", false);
            }
        }
    }

    public final void A0c(int i, int i2, String str, String[] strArr) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (!c06610Wt.A03(c0x2, A0M, A00)) {
                if (c0x2 != null) {
                    c0x2.A04 = c0xd.A02.nowNanos();
                }
            } else {
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 == null) {
                        if (c0x2 != null) {
                            c0x2.A0B = c0xd.A02.nowNanos();
                        }
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = c0xd.A02.nowNanos();
                        }
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A07(str, strArr);
                                if (c0x2 != null) {
                                    c0x2.A01 = c0xd.A02.nowNanos();
                                }
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                    c0x2.A05 = c0xd.A02.nowNanos();
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "string_array", false);
            }
        }
    }

    public final void A0d(int i, int i2, String str, boolean[] zArr) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            long A00 = C0XD.A00(i, i2);
            C06610Wt c06610Wt = c0xd.A03;
            if (c06610Wt.A03(c0x2, A0M, A00)) {
                C0XB c0xb = c0xd.A04;
                c0xb.CIx(c0x2);
                try {
                    RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
                    if (A01 != null) {
                        c0xb.E7e(c0x2, A01);
                        try {
                            if (!C06610Wt.A00(A0M, A01)) {
                                c0xb.E7f(c0x2, A01);
                            } else {
                                A01.A08(str, zArr);
                                A0M.A01(c0x2, A01);
                                if (c0x2 != null) {
                                    c0x2.A0N = true;
                                }
                            }
                        } finally {
                            c0xb.E7f(c0x2, A01);
                        }
                    }
                } finally {
                    c0xb.CIy(c0x2);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A07(c0x2, "boolean_array", false);
            }
        }
    }

    public final void A0j(RunnableC16080r6 runnableC16080r6, String str, int i) {
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = this.A0A;
            C0XP A0M = A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A0W.A05(str, i);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                try {
                    InterfaceC06740Xq interfaceC06740Xq = this.A0n;
                    if (interfaceC06740Xq != null && this.A0l.AsU().AVP(runnableC16080r6.getMarkerId(), str) != -1) {
                        interfaceC06740Xq.EET(runnableC16080r6.getMarkerId(), runnableC16080r6.A02, str, i);
                    }
                    if (this.A0o != null && c0x2 != null) {
                        this.A0o.A07(c0x2, "int", true);
                    }
                } catch (Throwable th) {
                }
            } catch (Throwable th2) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th2;
            }
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, AnonymousClass001.A0R("join_request_", str), j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, AnonymousClass001.A0R("join_response_", str), j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        markerAnnotate(i, i2, str, i3);
        InterfaceC06740Xq interfaceC06740Xq = this.A0n;
        if (interfaceC06740Xq != null) {
            C0XG A04 = A04(null, i, i2);
            if (A04 != null) {
                i = A04.A01;
            }
            interfaceC06740Xq.EET(i, i2, str, i3);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        A0Y(i, i2, str, z, j, timeUnit);
    }

    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, X.0R9] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0qA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.util.SparseIntArray, X.0aR] */
    /* JADX WARN: Type inference failed for: r4v25, types: [X.0aU, android.util.LongSparseArray] */
    public C006802i(AbstractC208510h abstractC208510h, final C0XQ c0xq, final InterfaceC06740Xq interfaceC06740Xq, C09410dq c09410dq, final C10390h6 c10390h6, final ExecutorC19230x5 executorC19230x5, final InterfaceC07320a6 interfaceC07320a6, C218914p c218914p, Runnable runnable, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, final InterfaceC08830cm interfaceC08830cm3, C0X0[] c0x0Arr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C0XB c0xb;
        InterfaceC06770Xt interfaceC06770Xt;
        C0XH c0xh;
        C0R9 c0r9;
        C0Xc[] c0XcArr;
        C0Xc[] c0XcArr2;
        long BqB;
        int BqB2;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock;
        C0R9 c0r92;
        final AwakeTimeSinceBootClock awakeTimeSinceBootClock2 = AwakeTimeSinceBootClock.INSTANCE;
        C03250Di c03250Di = C03250Di.A00;
        final C19220x4 c19220x4 = new C19220x4();
        final ?? obj = new Object();
        final C19120wt c19120wt = new C19120wt(c0x0Arr);
        C19120wt c19120wt2 = new C19120wt(new Object());
        ?? obj2 = new Object();
        InterfaceC08830cm interfaceC08830cm4 = new InterfaceC08830cm() { // from class: X.0vU
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C0XM.this;
            }
        };
        InterfaceC08830cm interfaceC08830cm5 = new InterfaceC08830cm() { // from class: X.0ug
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C19220x4.this;
            }
        };
        InterfaceC08830cm interfaceC08830cm6 = new InterfaceC08830cm() { // from class: X.0uf
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C15550qA.this;
            }
        };
        InterfaceC08830cm interfaceC08830cm7 = new InterfaceC08830cm() { // from class: X.0uA
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return ExecutorC19230x5.this;
            }
        };
        InterfaceC08830cm interfaceC08830cm8 = new InterfaceC08830cm() { // from class: X.0u5
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C0XQ.this;
            }
        };
        InterfaceC08830cm interfaceC08830cm9 = new InterfaceC08830cm() { // from class: X.0u2
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return Arrays.asList((Object[]) InterfaceC08830cm.this.get());
            }
        };
        InterfaceC08830cm interfaceC08830cm10 = new InterfaceC08830cm() { // from class: X.0tt
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return Arrays.asList((Object[]) InterfaceC08830cm.this.get());
            }
        };
        InterfaceC08830cm interfaceC08830cm11 = new InterfaceC08830cm() { // from class: X.0tr
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C10390h6.this;
            }
        };
        InterfaceC08830cm interfaceC08830cm12 = new InterfaceC08830cm() { // from class: X.0Ic
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return null;
            }
        };
        InterfaceC08830cm interfaceC08830cm13 = new InterfaceC08830cm() { // from class: X.110
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return InterfaceC06740Xq.this;
            }
        };
        TriState triState = TriState.UNSET;
        this.A0i = triState;
        this.A0j = triState;
        this.A0k = triState;
        this.A0J = new Random();
        this.A0M = new ConcurrentLinkedQueue();
        this.A0L = new ConcurrentLinkedQueue();
        this.A0h = 0;
        this.A0N = new ReentrantLock();
        this.A0V = interfaceC08830cm;
        this.A0Q = interfaceC08830cm4;
        this.A0l = new C0e0(10);
        this.A05 = awakeTimeSinceBootClock2;
        this.A06 = c03250Di;
        this.A0S = interfaceC08830cm5;
        this.A0O = interfaceC08830cm6;
        this.A0P = interfaceC08830cm7;
        this.A0R = interfaceC08830cm2;
        this.A0Y = interfaceC08830cm10;
        this.A07 = abstractC208510h;
        this.A0a = c19120wt2;
        this.A0U = interfaceC08830cm11;
        this.A0F = obj2;
        C05600Rk c05600Rk = C05600Rk.A00;
        this.A0E = c05600Rk;
        this.A0D = new SparseIntArray();
        if (!C20150ym.A07(AbstractC20100yh.A00(36326137604880039L))) {
            c0xb = new C0XB(awakeTimeSinceBootClock2) { // from class: X.0ri
                public final C0X4 A00;
                public final C0X4 A01;
                public final C0X4 A02;

                @Override // X.C0XB
                public final void E7e(C0X2 c0x2, RunnableC16080r6 runnableC16080r6) {
                }

                @Override // X.C0XB
                public final void E7f(C0X2 c0x2, RunnableC16080r6 runnableC16080r6) {
                }

                @Override // X.C0XB
                public final void CIx(C0X2 c0x2) {
                    this.A00.A00(c0x2);
                }

                @Override // X.C0XB
                public final void CIy(C0X2 c0x2) {
                    this.A00.A01(c0x2);
                }

                @Override // X.C0XB
                public final void F85(C0X2 c0x2, int i) {
                    this.A02.A00(c0x2);
                }

                @Override // X.C0XB
                public final void F86(C0X2 c0x2, int i) {
                    this.A02.A01(c0x2);
                }

                {
                    this.A01 = new C0X4(awakeTimeSinceBootClock2);
                    this.A00 = new C0X4(awakeTimeSinceBootClock2);
                    this.A02 = new C0X4(awakeTimeSinceBootClock2);
                }
            };
        } else {
            c0xb = new C0XB(awakeTimeSinceBootClock2) { // from class: X.0rk
                public final C0X4 A00;
                public final C0X5 A01;
                public final C0X5 A02;

                @Override // X.C0XB
                public final void CIx(C0X2 c0x2) {
                }

                @Override // X.C0XB
                public final void CIy(C0X2 c0x2) {
                }

                @Override // X.C0XB
                public final void E7e(C0X2 c0x2, RunnableC16080r6 runnableC16080r6) {
                    runnableC16080r6.A0X.A00(c0x2);
                }

                @Override // X.C0XB
                public final void E7f(C0X2 c0x2, RunnableC16080r6 runnableC16080r6) {
                    runnableC16080r6.A0X.A01(c0x2);
                }

                @Override // X.C0XB
                public final void F85(C0X2 c0x2, int i) {
                    long nowNanos;
                    AtomicLong atomicLong;
                    long nowNanos2;
                    long nowNanos3;
                    C0X5 c0x5 = this.A02;
                    if (i == 0) {
                        if (c0x2 == null) {
                            nowNanos3 = 0;
                        } else {
                            nowNanos3 = c0x5.A00.nowNanos();
                        }
                        c0x5.A01.readLock().lock();
                        if (c0x2 != null) {
                            atomicLong = c0x2.A0K;
                            nowNanos2 = c0x5.A00.nowNanos() - nowNanos3;
                        } else {
                            return;
                        }
                    } else {
                        if (c0x2 == null) {
                            nowNanos = 0;
                        } else {
                            nowNanos = c0x5.A00.nowNanos();
                        }
                        c0x5.A01.writeLock().lock();
                        if (c0x2 != null) {
                            atomicLong = c0x2.A0K;
                            nowNanos2 = c0x5.A00.nowNanos() - nowNanos;
                        } else {
                            return;
                        }
                    }
                    atomicLong.addAndGet(nowNanos2);
                }

                @Override // X.C0XB
                public final void F86(C0X2 c0x2, int i) {
                    long nowNanos;
                    AtomicLong atomicLong;
                    long nowNanos2;
                    long nowNanos3;
                    C0X5 c0x5 = this.A02;
                    if (i == 0) {
                        if (c0x2 == null) {
                            nowNanos3 = 0;
                        } else {
                            nowNanos3 = c0x5.A00.nowNanos();
                        }
                        c0x5.A01.readLock().unlock();
                        if (c0x2 != null) {
                            atomicLong = c0x2.A0K;
                            nowNanos2 = c0x5.A00.nowNanos() - nowNanos3;
                        } else {
                            return;
                        }
                    } else {
                        if (c0x2 == null) {
                            nowNanos = 0;
                        } else {
                            nowNanos = c0x5.A00.nowNanos();
                        }
                        c0x5.A01.writeLock().unlock();
                        if (c0x2 != null) {
                            atomicLong = c0x2.A0K;
                            nowNanos2 = c0x5.A00.nowNanos() - nowNanos;
                        } else {
                            return;
                        }
                    }
                    atomicLong.addAndGet(nowNanos2);
                }

                {
                    this.A01 = new C0X5(awakeTimeSinceBootClock2);
                    this.A00 = new C0X4(awakeTimeSinceBootClock2);
                    this.A02 = new C0X5(awakeTimeSinceBootClock2);
                }
            };
        }
        this.A09 = c0xb;
        int A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36607612581713527L));
        if (A01 != 1 && A01 != 2) {
            interfaceC06770Xt = null;
        } else {
            interfaceC06770Xt = new InterfaceC06770Xt() { // from class: X.10j
                public final ConcurrentHashMap A00 = new ConcurrentHashMap();

                @Override // X.InterfaceC06770Xt
                public final void AWM(C0XY c0xy) {
                    Iterator it = this.A00.values().iterator();
                    while (it.hasNext()) {
                        c0xy.ATK((RunnableC16080r6) it.next());
                    }
                }

                @Override // X.InterfaceC06770Xt
                public final RunnableC16080r6 AXc(C0X2 c0x2, long j) {
                    return (RunnableC16080r6) this.A00.get(Long.valueOf(j));
                }

                @Override // X.InterfaceC06770Xt
                public final void E73(C0X2 c0x2, RunnableC16080r6 runnableC16080r6, long j) {
                    this.A00.put(Long.valueOf(j), runnableC16080r6);
                }

                @Override // X.InterfaceC06770Xt
                public final RunnableC16080r6 EEo(C0X2 c0x2, long j) {
                    return (RunnableC16080r6) this.A00.remove(Long.valueOf(j));
                }

                @Override // X.InterfaceC06770Xt
                public final ArrayList EF3(C0X2 c0x2, QuickEventFilter quickEventFilter) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.A00.values().iterator();
                    while (it.hasNext()) {
                        RunnableC16080r6 runnableC16080r6 = (RunnableC16080r6) it.next();
                        if (quickEventFilter.shouldRemove(runnableC16080r6)) {
                            it.remove();
                            arrayList.add(runnableC16080r6);
                        }
                    }
                    return arrayList;
                }

                @Override // X.InterfaceC06770Xt
                public final int Em3(C0X2 c0x2) {
                    return this.A00.size();
                }
            };
        }
        int A012 = (int) C20150ym.A01(AbstractC20100yh.A00(36607612581647990L));
        if (A012 != 1 && A012 != 2) {
            final C0XB c0xb2 = this.A09;
            c0xh = new C0XH(c0xb2) { // from class: X.0rB
                public final C0XB A00;
                public final InterfaceC07550aU A01 = new LongSparseArray();

                @Override // X.C0XH
                public final void E72(C0X2 c0x2, C0XG c0xg, long j) {
                    C0XB c0xb3 = this.A00;
                    c0xb3.F85(null, 1);
                    try {
                        this.A01.put(j, c0xg);
                    } finally {
                        c0xb3.F86(null, 1);
                    }
                }

                @Override // X.C0XH
                public final C0XG AXb(C0X2 c0x2, long j) {
                    C0XB c0xb3 = this.A00;
                    c0xb3.F85(c0x2, 0);
                    try {
                        return (C0XG) this.A01.get(j);
                    } finally {
                        c0xb3.F86(c0x2, 0);
                    }
                }

                @Override // X.C0XH
                public final C0XG EEn(C0X2 c0x2, long j) {
                    C0XG c0xg;
                    C0XB c0xb3 = this.A00;
                    c0xb3.F85(c0x2, 1);
                    try {
                        InterfaceC07550aU interfaceC07550aU = this.A01;
                        int indexOfKey = interfaceC07550aU.indexOfKey(j);
                        if (indexOfKey >= 0) {
                            c0xg = (C0XG) interfaceC07550aU.valueAt(indexOfKey);
                            interfaceC07550aU.removeAt(indexOfKey);
                        } else {
                            c0xg = null;
                        }
                        return c0xg;
                    } finally {
                        c0xb3.F86(c0x2, 1);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.0aU, android.util.LongSparseArray] */
                {
                    this.A00 = c0xb2;
                }
            };
        } else {
            c0xh = new C0XH() { // from class: X.10i
                public final ConcurrentHashMap A00 = new ConcurrentHashMap();

                @Override // X.C0XH
                public final C0XG AXb(C0X2 c0x2, long j) {
                    return (C0XG) this.A00.get(Long.valueOf(j));
                }

                @Override // X.C0XH
                public final void E72(C0X2 c0x2, C0XG c0xg, long j) {
                    this.A00.put(Long.valueOf(j), c0xg);
                }

                @Override // X.C0XH
                public final C0XG EEn(C0X2 c0x2, long j) {
                    return (C0XG) this.A00.remove(Long.valueOf(j));
                }
            };
        }
        this.A0B = c0xh;
        this.A0Z = interfaceC08830cm9;
        this.A08 = new C0X4(awakeTimeSinceBootClock2);
        if (interfaceC06770Xt == null) {
            final ?? longSparseArray = new LongSparseArray();
            final C0XB c0xb3 = this.A09;
            interfaceC06770Xt = new InterfaceC06770Xt(c0xb3, longSparseArray) { // from class: X.0r4
                public final C0XB A00;
                public final InterfaceC07550aU A01;

                @Override // X.InterfaceC06770Xt
                public final void E73(C0X2 c0x2, RunnableC16080r6 runnableC16080r6, long j) {
                    C0XB c0xb4 = this.A00;
                    c0xb4.F85(null, 1);
                    try {
                        this.A01.put(j, runnableC16080r6);
                    } finally {
                        c0xb4.F86(null, 1);
                    }
                }

                @Override // X.InterfaceC06770Xt
                public final RunnableC16080r6 EEo(C0X2 c0x2, long j) {
                    C0XB c0xb4 = this.A00;
                    c0xb4.F85(null, 1);
                    try {
                        InterfaceC07550aU interfaceC07550aU = this.A01;
                        RunnableC16080r6 runnableC16080r6 = (RunnableC16080r6) interfaceC07550aU.get(j);
                        interfaceC07550aU.remove(j);
                        return runnableC16080r6;
                    } finally {
                        c0xb4.F86(null, 1);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
                
                    throw r0;
                 */
                @Override // X.InterfaceC06770Xt
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.util.ArrayList EF3(X.C0X2 r11, com.facebook.quicklog.QuickEventFilter r12) {
                    /*
                        r10 = this;
                        r6 = 0
                        java.util.ArrayList r9 = new java.util.ArrayList
                        r9.<init>()
                        java.util.ArrayList r8 = new java.util.ArrayList
                        r8.<init>()
                        X.0XB r5 = r10.A00
                        r4 = 1
                        r5.F85(r6, r4)
                        X.0aU r7 = r10.A01     // Catch: java.lang.Throwable -> L5e
                        int r3 = r7.size()     // Catch: java.lang.Throwable -> L5e
                        r2 = 0
                    L18:
                        if (r2 >= r3) goto L30
                        java.lang.Object r1 = r7.valueAt(r2)     // Catch: java.lang.Throwable -> L5e
                        X.0r6 r1 = (X.RunnableC16080r6) r1     // Catch: java.lang.Throwable -> L5e
                        boolean r0 = r12.shouldRemove(r1)     // Catch: java.lang.Throwable -> L5e
                        if (r0 == 0) goto L2a
                        r8.add(r1)     // Catch: java.lang.Throwable -> L5e
                        goto L2d
                    L2a:
                        r9.add(r1)     // Catch: java.lang.Throwable -> L5e
                    L2d:
                        int r2 = r2 + 1
                        goto L18
                    L30:
                        r5.F85(r6, r4)     // Catch: java.lang.Throwable -> L5e
                        r7.clear()     // Catch: java.lang.Throwable -> L59
                        r5.F86(r6, r4)     // Catch: java.lang.Throwable -> L5e
                        java.util.Iterator r3 = r9.iterator()     // Catch: java.lang.Throwable -> L5e
                    L3d:
                        boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L5e
                        if (r0 == 0) goto L55
                        java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L5e
                        X.0r6 r2 = (X.RunnableC16080r6) r2     // Catch: java.lang.Throwable -> L5e
                        int r1 = r2.A03     // Catch: java.lang.Throwable -> L5e
                        int r0 = r2.A02     // Catch: java.lang.Throwable -> L5e
                        long r0 = X.C0XD.A00(r1, r0)     // Catch: java.lang.Throwable -> L5e
                        r7.put(r0, r2)     // Catch: java.lang.Throwable -> L5e
                        goto L3d
                    L55:
                        r5.F86(r6, r4)
                        return r8
                    L59:
                        r0 = move-exception
                        r5.F86(r6, r4)     // Catch: java.lang.Throwable -> L5e
                        throw r0     // Catch: java.lang.Throwable -> L5e
                    L5e:
                        r0 = move-exception
                        r5.F86(r6, r4)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0r4.EF3(X.0X2, com.facebook.quicklog.QuickEventFilter):java.util.ArrayList");
                }

                @Override // X.InterfaceC06770Xt
                public final int Em3(C0X2 c0x2) {
                    C0XB c0xb4 = this.A00;
                    c0xb4.F85(null, 1);
                    try {
                        return this.A01.size();
                    } finally {
                        c0xb4.F86(null, 1);
                    }
                }

                @Override // X.InterfaceC06770Xt
                public final void AWM(C0XY c0xy) {
                    C0XB c0xb4 = this.A00;
                    c0xb4.F85(null, 1);
                    try {
                        InterfaceC07550aU interfaceC07550aU = this.A01;
                        int size = interfaceC07550aU.size();
                        for (int i = 0; i < size; i++) {
                            c0xy.ATK((RunnableC16080r6) interfaceC07550aU.valueAt(i));
                        }
                    } finally {
                        c0xb4.F86(null, 1);
                    }
                }

                @Override // X.InterfaceC06770Xt
                public final RunnableC16080r6 AXc(C0X2 c0x2, long j) {
                    C0XB c0xb4 = this.A00;
                    c0xb4.F85(c0x2, 0);
                    try {
                        return (RunnableC16080r6) this.A01.get(j);
                    } finally {
                        c0xb4.F86(c0x2, 0);
                    }
                }

                {
                    this.A01 = longSparseArray;
                    this.A00 = c0xb3;
                }
            };
        }
        this.A0A = new C0XD(awakeTimeSinceBootClock2, abstractC208510h, this.A09, interfaceC06770Xt, c05600Rk, obj2);
        this.A0T = interfaceC08830cm8;
        this.A0W = interfaceC08830cm12;
        this.A0X = interfaceC08830cm13;
        ReentrantLock reentrantLock = this.A0N;
        reentrantLock.lock();
        try {
            if (this.A0h == 0) {
                this.A0h = 1;
                reentrantLock.unlock();
                ReentrantLock reentrantLock2 = this.A0N;
                reentrantLock2.lock();
                try {
                    if (this.A0h == 1) {
                        C0XQ c0xq2 = (C0XQ) this.A0T.get();
                        if (c0xq2 != null) {
                            this.A0m = c0xq2;
                            AbstractC208510h abstractC208510h2 = this.A07;
                            AwakeTimeSinceBootClock awakeTimeSinceBootClock3 = this.A05;
                            C0R9 c0r93 = this.A0F;
                            synchronized (c0xq2) {
                                try {
                                    if (c0xq2.A00 == null) {
                                        C0Xc[] c0XcArr3 = (C0Xc[]) c0xq2.A01.toArray(new C0Xc[0]);
                                        C0XP c0xp = new C0XP(awakeTimeSinceBootClock3, abstractC208510h2, null, c0r93, c0XcArr3.length == 0 ? null : c0XcArr3);
                                        c0xq2.A02 = c0xp;
                                        C0Xc[] c0XcArr4 = c0xp.A06;
                                        if (c0XcArr4 != null) {
                                            for (C0Xc c0Xc : c0XcArr4) {
                                                c0Xc.setQuickPerformanceLogger(this);
                                            }
                                        }
                                        c0xq2.A00 = this;
                                    } else {
                                        throw new IllegalStateException("QPL listeners were already created");
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            Iterator it = this.A0M.iterator();
                            while (it.hasNext()) {
                                A08(c0xq2.A02, (RunnableC16080r6) it.next(), true);
                            }
                            final C0XP c0xp2 = c0xq2.A02;
                            this.A0A.A0F(new C0XY() { // from class: X.035
                                @Override // X.C0XY
                                public final void ATK(RunnableC16080r6 runnableC16080r6) {
                                    C006802i.A08(C0XP.this, runnableC16080r6, false);
                                }
                            });
                            this.A04 = (C19220x4) this.A0S.get();
                            this.A0h = 2;
                            reentrantLock2.unlock();
                            reentrantLock = this.A0N;
                            reentrantLock.lock();
                            try {
                                if (this.A0h == 2) {
                                    final C0XM c0xm = (C0XM) this.A0Q.get();
                                    if (c0xm != null) {
                                        this.A0l = c0xm;
                                        this.A0o = (C10390h6) this.A0U.get();
                                        C0XQ c0xq3 = this.A0m;
                                        A0B("QPLListenerListHolder", c0xq3, "Mature");
                                        C0XP c0xp3 = c0xq3.A02;
                                        C10390h6 c10390h62 = this.A0o;
                                        this.A0W.get();
                                        synchronized (c0xq3) {
                                            try {
                                                C0XP c0xp4 = c0xq3.A02;
                                                if (c0xp4.A04 != c10390h62 && (awakeTimeSinceBootClock = c0xp4.A00) != null && (c0r92 = c0xp4.A05) != null) {
                                                    c0xp4 = new C0XP(awakeTimeSinceBootClock, c0xp4.A01, c10390h62, c0r92, c0xp4.A06);
                                                }
                                                c0xq3.A02 = c0xp4;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        this.A01 = (C07G) this.A0R.get();
                                        C0XD c0xd = this.A0A;
                                        C10390h6 c10390h63 = this.A0o;
                                        C07G c07g = this.A01;
                                        c0xd.A01 = c10390h63;
                                        C06610Wt c06610Wt = c0xd.A03;
                                        if (c10390h63 != null && (BqB2 = (int) (BqB = c0xm.BqB(27791726))) > 0 && BqB2 != Integer.MAX_VALUE) {
                                            c06610Wt.A01 = new C0Ws(c10390h63, BqB2, new Random().nextInt(BqB2), BqB);
                                        }
                                        c0xd.A00 = c07g;
                                        this.A02 = (C15550qA) this.A0O.get();
                                        this.A03 = (ExecutorC19230x5) this.A0P.get();
                                        InterfaceC06740Xq interfaceC06740Xq2 = (InterfaceC06740Xq) this.A0X.get();
                                        if (interfaceC06740Xq2 != null) {
                                            interfaceC06740Xq2.setQuickPerformanceLogger(this);
                                        }
                                        this.A0n = interfaceC06740Xq2;
                                        final C0XP c0xp5 = c0xq3.A02;
                                        AwakeTimeSinceBootClock awakeTimeSinceBootClock4 = c0xp5.A00;
                                        if (awakeTimeSinceBootClock4 != null && (c0r9 = c0xp5.A05) != null && (c0XcArr = c0xp5.A06) != null && (c0XcArr2 = c0xp3.A06) != null && c0XcArr2.length != 0) {
                                            HashSet hashSet = new HashSet(Arrays.asList(c0XcArr2));
                                            ArrayList arrayList = new ArrayList();
                                            for (C0Xc c0Xc2 : c0XcArr) {
                                                if (!hashSet.contains(c0Xc2)) {
                                                    arrayList.add(c0Xc2);
                                                }
                                            }
                                            c0xp5 = new C0XP(awakeTimeSinceBootClock4, c0xp5.A01, c0xp5.A04, c0r9, (C0Xc[]) arrayList.toArray(new C0Xc[0]));
                                        }
                                        while (true) {
                                            RunnableC16080r6 runnableC16080r6 = (RunnableC16080r6) this.A0M.poll();
                                            if (runnableC16080r6 == null) {
                                                break;
                                            } else if (!c0xm.CY1(runnableC16080r6.A03) && A0H(c0xm, runnableC16080r6, this)) {
                                                A0m(runnableC16080r6, false);
                                            }
                                        }
                                        c0xd.A0F(new C0XY() { // from class: X.035
                                            @Override // X.C0XY
                                            public final void ATK(RunnableC16080r6 runnableC16080r62) {
                                                C006802i.A08(C0XP.this, runnableC16080r62, false);
                                            }
                                        });
                                        c0xd.A0F(new C0XY() { // from class: X.10U
                                            @Override // X.C0XY
                                            public final void ATK(RunnableC16080r6 runnableC16080r62) {
                                                C006802i.A0H(c0xm, runnableC16080r62, this);
                                            }
                                        });
                                        this.A0h = 3;
                                        C10390h6 c10390h64 = this.A0o;
                                        ConcurrentLinkedQueue concurrentLinkedQueue = this.A0L;
                                        Iterator it2 = concurrentLinkedQueue.iterator();
                                        while (it2.hasNext()) {
                                            Throwable th3 = (Throwable) it2.next();
                                            if (c10390h64 != null) {
                                                C19180x0 c19180x0 = (C19180x0) c10390h64.A00.A02.get();
                                                C14360o3.A0B(th3, 0);
                                                c19180x0.A00.EmP("qpl", "error", th3);
                                            } else {
                                                C0K8.A0F("QuickPerformanceLoggerImpl", "SoftError occurred, but was not reported: health monitor is off", th3);
                                            }
                                        }
                                        concurrentLinkedQueue.clear();
                                        reentrantLock.unlock();
                                        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.0wy
                                            @Override // X.InterfaceC12870lZ
                                            public final void onAppBackgrounded() {
                                                int A03 = C0f9.A03(-1199906462);
                                                C006802i c006802i = C006802i.this;
                                                c006802i.endAllMarkers((short) 630, true);
                                                c006802i.A0g(46333953, "afterEndAllMarkers");
                                                C0f9.A0A(391522172, A03);
                                            }

                                            @Override // X.InterfaceC12870lZ
                                            public final void onAppForegrounded() {
                                                C0f9.A0A(-882024525, C0f9.A03(-415415798));
                                            }
                                        };
                                        this.A0g = interfaceC12870lZ;
                                        this.A0K = Collections.synchronizedSet(new HashSet());
                                        this.A0I = Collections.synchronizedMap(new HashMap());
                                        this.A0c = z2;
                                        this.A0b = z3;
                                        this.A0e = z4;
                                        this.A0f = z5;
                                        this.A0d = z6;
                                        this.A0G = interfaceC07320a6;
                                        this.A0H = runnable;
                                        if (z) {
                                            c218914p.A0B(interfaceC12870lZ);
                                        } else {
                                            c218914p.A0A(interfaceC12870lZ);
                                        }
                                        this.A0C = c09410dq;
                                        return;
                                    }
                                    throw new NullPointerException(AnonymousClass001.A0R("QPLConfiguration", " must not be null"));
                                }
                                throw new IllegalStateException("transitToMatureStage can be done only after warm stage");
                            } finally {
                            }
                        }
                        throw new NullPointerException(AnonymousClass001.A0R("QPLListenersHolder", " must not be null"));
                    }
                    throw new IllegalStateException("transitToWarmStage can be done only after early stage");
                } catch (Throwable th4) {
                    reentrantLock2.unlock();
                    throw th4;
                }
            }
            throw new IllegalStateException("transitToEarlyStage can be done as first transition");
        } finally {
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double d) {
        A0T(i, i2, str, d);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int i3) {
        A0U(i, i2, str, i3);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long j) {
        A0V(i, i2, str, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String str2) {
        A0W(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean z) {
        A0X(i, i2, str, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double[] dArr) {
        A0Z(i, i2, str, dArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int[] iArr) {
        A0a(i, i2, str, iArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long[] jArr) {
        A0b(i, i2, str, jArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String[] strArr) {
        A0c(i, i2, str, strArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        A0d(i, i2, str, zArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double d) {
        A0T(i, 0, str, d);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int i2) {
        A0U(i, 0, str, i2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long j) {
        A0V(i, 0, str, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String str2) {
        A0W(i, 0, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean z) {
        A0X(i, 0, str, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double[] dArr) {
        A0Z(i, 0, str, dArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int[] iArr) {
        A0a(i, 0, str, iArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long[] jArr) {
        A0b(i, 0, str, jArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String[] strArr) {
        A0c(i, 0, str, strArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean[] zArr) {
        A0d(i, 0, str, zArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerPoint(int i, int i2, int i3, String str, C0XJ c0xj, long j, TimeUnit timeUnit, int i4) {
        int i5 = i;
        C0XJ c0xj2 = c0xj;
        if (c0xj == null) {
            c0xj2 = null;
        } else {
            c0xj2.A03 = true;
        }
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i5);
            }
            if (A0I(this)) {
                A0A(this, "markerPoint", str, c0xj2 == null ? null : c0xj2.toString(), i5);
            }
            boolean z = j == -1;
            this.A0A.A09(c0x2, c0xj2, A0M(), str, TimeUnit.NANOSECONDS, i5, i2, i3, i4, A0L(j, timeUnit), z ? false : true);
            InterfaceC06740Xq interfaceC06740Xq = this.A0n;
            if (interfaceC06740Xq != null) {
                C0XG A04 = A04(c0x2, i5, i2);
                if (A04 != null) {
                    i5 = A04.A01;
                }
                if (this.A0l.AsU().CY2(i5)) {
                    interfaceC06740Xq.EEX(i5, i2, str);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A05(c0x2);
            }
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str) {
        markerPoint(i, i2, str, null, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, str, null, j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2) {
        markerPoint(i, i2, str, str2, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, str, str2, j, timeUnit, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        C0XJ c0xj;
        int i4 = i;
        if (A0K(this, str)) {
            C0X2 c0x2 = null;
            if (this.A0o != null) {
                c0x2 = this.A0o.A01(i4);
            }
            A0A(this, "markerPoint", str, str2, i4);
            boolean z = j == -1;
            long A0L = A0L(j, timeUnit);
            C0XD c0xd = this.A0A;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            boolean z2 = z ? false : true;
            C0XP A0M = A0M();
            if (str2 == null) {
                c0xj = null;
            } else {
                c0xj = new C0XJ();
                c0xj.A00("__key", str2, 1);
                c0xj.A03 = true;
            }
            c0xd.A09(c0x2, c0xj, A0M, str, timeUnit2, i4, i2, 7, i3, A0L, z2);
            InterfaceC06740Xq interfaceC06740Xq = this.A0n;
            if (interfaceC06740Xq != null) {
                C0XG A04 = A04(c0x2, i4, i2);
                if (A04 != null) {
                    i4 = A04.A01;
                }
                if (this.A0l.AsU().CY2(i4)) {
                    interfaceC06740Xq.EEX(i4, i2, str);
                }
            }
            if (this.A0o != null && c0x2 != null) {
                this.A0o.A05(c0x2);
            }
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str) {
        markerPoint(i, 0, str, null, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, 0, str, null, j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2) {
        markerPoint(i, 0, str, str2, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerPoint(i, 0, str, str2, j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i) {
        markerStart(i, 0, -1L, TimeUnit.NANOSECONDS, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2) {
        markerStart(i, i2, -1L, TimeUnit.NANOSECONDS, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, i2)));
        }
        if (!this.A0b) {
            A0O(A0M(), null, null, timeUnit, i, i2, i3, -1, j, true);
            return;
        }
        String A05 = A05(i, i2, this.A0f, this.A0d, this.A0e);
        if (A0P(A05, null, timeUnit, i, i2, i3, j, true) != null) {
            this.A0I.put(String.valueOf(C0XD.A00(i, i2)), A05);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2) {
        markerStart(i, i2);
        markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit);
        markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStart(int i, int i2, boolean z) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, i2)));
        }
        if (this.A0b) {
            String A05 = A05(i, i2, this.A0f, this.A0d, this.A0e);
            if (A0P(A05, null, TimeUnit.NANOSECONDS, i, i2, 0, -1L, z) != null) {
                this.A0I.put(String.valueOf(C0XD.A00(i, i2)), A05);
                return;
            }
            return;
        }
        markerStartWithCancelPolicy(i, z, i2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2) {
        markerStart(i);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, 0, j, timeUnit);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStart(int i, boolean z) {
        markerStartWithCancelPolicy(i, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, int i2, boolean z) {
        return isMarkerOn(i, i2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, int i2, String str) {
        C0XG A03 = A03(null, i, i2);
        if (A03 != null) {
            i = A03.A01;
        }
        EventBuilder A02 = A02(A03, str, i);
        if (A03 != null) {
            A02.annotate("qpl_pivot_name", A03.A02);
            A02.annotate("qpl_pivot_host", A03.A00);
        }
        return A02;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        markerAnnotate(i, i2, str, str2);
        InterfaceC06740Xq interfaceC06740Xq = this.A0n;
        if (interfaceC06740Xq != null) {
            C0XG A04 = A04(null, i, i2);
            if (A04 != null) {
                i = A04.A01;
            }
            interfaceC06740Xq.EEU(i, i2, str, str2);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i, int i2) {
        A0R(i, i2, currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s) {
        markerEnd(i, i2, s, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, null, i2, s);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        RunnableC16080r6 A0O = A0O(A0M(), null, str, TimeUnit.NANOSECONDS, i, i2, 2, -1, -1L, z);
        A07(i, i2, j);
        if (A0O != null) {
            this.A0A.A0A(null, A0M(), A0O, "sampling_basis", str);
        }
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        markerStartWithCancelPolicy(i, z, i2, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerTag(int i, int i2, String str) {
        this.A0A.A0E(A0M(), str, i, i2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i, int i2) {
        C0X2 A01;
        C10390h6 c10390h6 = this.A0o;
        if (c10390h6 == null) {
            A01 = null;
        } else {
            A01 = c10390h6.A01(i);
        }
        RunnableC16080r6 A012 = this.A0A.A03.A01(A01, C0XD.A00(i, i2));
        if (A012 == null) {
            return C209210o.A00;
        }
        return new C209110n(A012, c10390h6, this);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final boolean isMarkerOn(int i, int i2) {
        C0XD c0xd = this.A0A;
        return c0xd.A03.A03(null, A0M(), C0XD.A00(i, i2));
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A0i(null, null, timeUnit, i, i2, 0, j, s);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        A0O(A0M(), null, null, timeUnit, i, i2, 2, -1, j, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit, String str) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, i2)));
        }
        if (this.A0b) {
            String A05 = A05(i, i2, this.A0f, this.A0d, this.A0e);
            if (A0P(A05, str, timeUnit, i, i2, 0, j, z) != null) {
                this.A0I.put(String.valueOf(C0XD.A00(i, i2)), A05);
                return;
            }
            return;
        }
        RunnableC16080r6 A0O = A0O(A0M(), null, str, timeUnit, i, i2, 0, -1, j, z);
        if (A0O == null) {
            return;
        }
        this.A0A.A0A(null, A0M(), A0O, "sampling_basis", str);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, boolean z) {
        return isMarkerOn(i);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s) {
        markerEnd(i, 0, s, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        A0O(A0M(), null, null, TimeUnit.NANOSECONDS, i, i2, 2, -1, -1L, z);
        A07(i, i2, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        if (this.A0c) {
            this.A0K.add(Long.valueOf(C0XD.A00(i, i2)));
        }
        if (!this.A0b) {
            A0O(A0M(), null, null, timeUnit, i, i2, 0, -1, j, z);
            return;
        }
        String A05 = A05(i, i2, this.A0f, this.A0d, this.A0e);
        if (A0P(A05, null, timeUnit, i, i2, 0, j, z) != null) {
            this.A0I.put(String.valueOf(C0XD.A00(i, i2)), A05);
        }
    }
}
