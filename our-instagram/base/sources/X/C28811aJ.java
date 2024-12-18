package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1aJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28811aJ extends RealtimeEventHandler implements InterfaceC13000lm {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public RealtimeClientManager A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Context A0G;
    public final Handler A0H;
    public final Handler A0I;
    public final Handler A0J;
    public final Looper A0K;
    public final C9BW A0L;
    public final UserSession A0M;
    public final C4K7 A0N;
    public final C4KQ A0O;
    public final C93914Kb A0P;
    public final C4K6 A0Q;
    public final InterfaceC02900Bo A0R;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final List A0W;
    public final List A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC41501vz A0i;
    public final InterfaceC41501vz A0j;
    public final InterfaceC41501vz A0k;
    public final InterfaceC12870lZ A0l;
    public final C47232Ep A0m;
    public final C94014Kl A0n;
    public final InterfaceC09390do A0p;
    public final InterfaceC09390do A0q;
    public final InterfaceC09390do A0r;
    public final InterfaceC09390do A0s;
    public static final Charset A0v = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public static final IntentFilter A0t = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public static final List A0u = new ArrayList();
    public final BroadcastReceiver A0F = new BroadcastReceiver() { // from class: X.4KG
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int A01 = C0f9.A01(-467084556);
            C0fM.A01(this, context, intent);
            C28811aJ c28811aJ = C28811aJ.this;
            Charset charset = C28811aJ.A0v;
            c28811aJ.A0J.obtainMessage(7, intent.getParcelableExtra("otherNetwork")).sendToTarget();
            C0f9.A0E(-473422874, A01, intent);
        }
    };
    public final C4KH A0S = new C4KH(5);
    public final Runnable A0o = new Runnable() { // from class: X.4KI
        @Override // java.lang.Runnable
        public final void run() {
            Integer num;
            Long l;
            String str;
            C28811aJ c28811aJ = C28811aJ.this;
            Charset charset = C28811aJ.A0v;
            boolean z = false;
            if (c28811aJ.A01 != -1) {
                z = true;
            }
            C18C.A0F(z);
            Handler handler = c28811aJ.A0J;
            handler.removeMessages(5);
            handler.sendMessageDelayed(handler.obtainMessage(5), 10000L);
            try {
                c28811aJ.A04 = c28811aJ.A01;
                c28811aJ.A0V.clear();
                RealtimeClientManager realtimeClientManager = c28811aJ.A06;
                long j = c28811aJ.A04;
                long j2 = c28811aJ.A05;
                String str2 = c28811aJ.A08;
                long offset = TimeZone.getDefault().getOffset(new Date().getTime()) / 1000;
                UserSession userSession = c28811aJ.A0M;
                if (!C2E8.A00(userSession) && !C2E9.A0D(userSession) && !C2E9.A0C(userSession)) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                if (j2 != 0) {
                    l = Long.valueOf(j2);
                } else {
                    l = null;
                }
                Long valueOf = Long.valueOf(offset);
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0d();
                A0A.A0R("seq_id", j);
                if (l != null) {
                    A0A.A0R("snapshot_at_ms", l.longValue());
                }
                if (str2 != null) {
                    A0A.A0S("snapshot_app_version", str2);
                }
                if (valueOf != null) {
                    A0A.A0R("timezone_offset", offset);
                }
                if (num.intValue() != 0) {
                    str = DialogModule.KEY_MESSAGE;
                } else {
                    str = "all_message";
                }
                A0A.A0S("subscription_type", str);
                A0A.A0S("bloks_versioning_id", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
                A0A.A0a();
                A0A.close();
                realtimeClientManager.publish(RealtimeConstants.MQTT_TOPIC_SUB_IRIS, stringWriter.toString(), C4Q5.ACKNOWLEDGED_DELIVERY, false);
                C4K7 c4k7 = c28811aJ.A0N;
                C18920wW c18920wW = c4k7.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_iris_subscription");
                A00.AAP("action", RealtimeConstants.SEND_ATTEMPT);
                A00.Cht();
                ((C006802i) c4k7.A02.getValue()).markerStart(505875015);
            } catch (IOException e) {
                C1ZX A002 = ((C1ZW) c28811aJ.A0Z.getValue()).A00(C05F.A03, 817891655, 0, false);
                A002.A05(new RuntimeException("Error serializing IrisSubscribeRequest", e));
                A002.A00();
            }
        }
    };

    public C28811aJ(Context context, final UserSession userSession, UserSession userSession2, C47232Ep c47232Ep, C4K7 c4k7, C4K6 c4k6, List list, List list2, List list3, List list4, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, final InterfaceC09390do interfaceC09390do4, InterfaceC09390do interfaceC09390do5, InterfaceC09390do interfaceC09390do6, InterfaceC09390do interfaceC09390do7, int i, boolean z) {
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.4KJ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(90865128);
                int A032 = C0f9.A03(827611998);
                C28811aJ c28811aJ = C28811aJ.this;
                Charset charset = C28811aJ.A0v;
                c28811aJ.A0J.obtainMessage(1).sendToTarget();
                C0f9.A0A(-1148223577, A032);
                C0f9.A0A(-677255448, A03);
            }
        };
        this.A0i = interfaceC41501vz;
        InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.4KK
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(194926129);
                int A032 = C0f9.A03(1951227506);
                C28811aJ c28811aJ = C28811aJ.this;
                Charset charset = C28811aJ.A0v;
                c28811aJ.A0J.obtainMessage(11).sendToTarget();
                C0f9.A0A(-196556852, A032);
                C0f9.A0A(761788448, A03);
            }
        };
        this.A0j = interfaceC41501vz2;
        InterfaceC41501vz interfaceC41501vz3 = new InterfaceC41501vz() { // from class: X.4KL
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(204210313);
                int A032 = C0f9.A03(1163082068);
                C28811aJ c28811aJ = C28811aJ.this;
                Charset charset = C28811aJ.A0v;
                final KPB A00 = AbstractC46737Klu.A00(c28811aJ.A0M);
                A00.A05("INBOX_SNAPSHOT_START");
                c28811aJ.A0D(C47032Dr.A00, new InterfaceC2056798r() { // from class: X.LqT
                    @Override // X.InterfaceC2056798r
                    public final void Dn9(C7J1 c7j1) {
                        Integer num;
                        KPB kpb = KPB.this;
                        if (c7j1.A01) {
                            if (c7j1.A03) {
                                kpb.A05("INBOX_SNAPSHOT_SUCCESS");
                                num = C05F.A00;
                            } else {
                                kpb.A05("INBOX_SNAPSHOT_FAILURE");
                                num = C05F.A01;
                            }
                            kpb.A04(num);
                        }
                    }
                }, AbstractC43591JPw.A00(1156));
                C0f9.A0A(815703521, A032);
                C0f9.A0A(1046500126, A03);
            }
        };
        this.A0k = interfaceC41501vz3;
        this.A0I = new Handler(Looper.getMainLooper());
        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.4KM
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-329391953);
                C28811aJ c28811aJ = C28811aJ.this;
                Charset charset = C28811aJ.A0v;
                c28811aJ.A0N.A00 = -1L;
                C0f9.A0A(88237854, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C0f9.A0A(-192779766, C0f9.A03(1330566926));
            }
        };
        this.A0l = interfaceC12870lZ;
        this.A0U = new ArrayList();
        this.A0V = new ArrayList();
        Integer num = C05F.A00;
        this.A0L = new C9BW(num);
        this.A0C = true;
        this.A01 = -1L;
        this.A00 = -1L;
        this.A04 = -1L;
        this.A03 = -1L;
        this.A02 = -1L;
        this.A0G = context;
        this.A0M = userSession;
        final Looper A02 = ((C4HD) userSession.A01(C4HC.class, C4HE.A00)).A02();
        this.A0K = A02;
        this.A06 = RealtimeClientManager.getInstance(userSession);
        this.A0m = c47232Ep;
        this.A0Q = c4k6;
        final C4KQ c4kq = new C4KQ(userSession2, (C4KN) userSession2.A01(C4KN.class, new MHJ(userSession2, 37)), this, i, z);
        this.A0O = c4kq;
        this.A0a = interfaceC09390do2;
        this.A0h = interfaceC09390do;
        this.A0b = interfaceC09390do3;
        this.A0Z = interfaceC09390do4;
        this.A0P = new C93914Kb(new InterfaceC16820sZ() { // from class: X.4Ka
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return InterfaceC09390do.this.getValue();
            }
        });
        this.A0N = c4k7;
        this.A0g = interfaceC09390do5;
        this.A0Y = interfaceC09390do6;
        this.A0c = interfaceC09390do7;
        this.A0T = list2;
        this.A0W = list3;
        this.A0X = list4;
        this.A0R = C0BQ.A00(userSession);
        this.A0q = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4Kc
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession3 = UserSession.this;
                Charset charset = C28811aJ.A0v;
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36322435343132914L));
            }
        });
        this.A0e = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4Kd
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession3 = UserSession.this;
                Charset charset = C28811aJ.A0v;
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36322435343198451L));
            }
        });
        this.A0f = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4Ke
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession3 = UserSession.this;
                Charset charset = C28811aJ.A0v;
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36322435343263988L));
            }
        });
        this.A0d = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4Kf
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession3 = UserSession.this;
                Charset charset = C28811aJ.A0v;
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36322435343329525L));
            }
        });
        C17050sx A01 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4Kg
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession3 = UserSession.this;
                Charset charset = C28811aJ.A0v;
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36322516947511569L));
            }
        });
        this.A0p = A01;
        C17050sx A012 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4Kh
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession3 = UserSession.this;
                Charset charset = C28811aJ.A0v;
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession3, 36328873499115347L));
            }
        });
        this.A0r = A012;
        this.A0s = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.4Ki
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                Charset charset = C28811aJ.A0v;
                return C18950wb.A01;
            }
        });
        this.A0H = new Handler(A02) { // from class: X.4Kj
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                boolean z2;
                ArrayList A00;
                C4K6 c4k62;
                C129085sT c129085sT;
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        C28811aJ c28811aJ = this;
                        Charset charset = C28811aJ.A0v;
                        C2JD.A00(c28811aJ.A0M).ELj();
                        return;
                    }
                    throw new IllegalStateException(AnonymousClass001.A0O("Invalid message.what: ", i2));
                }
                C28811aJ c28811aJ2 = this;
                Object obj = message.obj;
                obj.getClass();
                String str = (String) obj;
                Charset charset2 = C28811aJ.A0v;
                try {
                    A00 = AbstractC125175lN.A00(str);
                    c4k62 = c28811aJ2.A0Q;
                    Iterator it = A00.iterator();
                    while (it.hasNext()) {
                        C5lP c5lP = (C5lP) it.next();
                        C006802i c006802i = c4k62.A00;
                        long j = c5lP.A00;
                        c006802i.markerStart(724184457, (int) (j ^ (j >>> 32)), false);
                        int size = c5lP.A05.size();
                        long j2 = c5lP.A00;
                        c006802i.markerAnnotate(724184457, (int) (j2 ^ (j2 >>> 32)), "data_size", size);
                        long j3 = c5lP.A00;
                        c006802i.markerAnnotate(724184457, (int) (j3 ^ (j3 >>> 32)), "seq_id", j3);
                        boolean z3 = c5lP.A06;
                        long j4 = c5lP.A00;
                        c006802i.markerAnnotate(724184457, (int) (j4 ^ (j4 >>> 32)), "realtime", z3);
                        Long l = c5lP.A01;
                        if (l != null) {
                            long longValue = l.longValue();
                            long j5 = c5lP.A00;
                            c006802i.markerAnnotate(724184457, (int) (j5 ^ (j5 >>> 32)), "mi_trace_id", longValue);
                        }
                    }
                } catch (IOException e) {
                    C1ZX A002 = ((C1ZW) c28811aJ2.A0Z.getValue()).A00(C05F.A02, 817891655, 0, false);
                    A002.A05(new RuntimeException("Could not deserialize RealtimeSyncMessages", e));
                    A002.A00();
                    z2 = c28811aJ2.A0B;
                }
                if (c28811aJ2.A0B && c28811aJ2.A0D) {
                    if (((Boolean) c28811aJ2.A0f.getValue()).booleanValue()) {
                        c129085sT = C129085sT.A04;
                    } else {
                        c129085sT = C129085sT.A03;
                    }
                    if (((Boolean) c28811aJ2.A0e.getValue()).booleanValue() && !c28811aJ2.A0P.A00(c129085sT, A00, c28811aJ2.A00)) {
                        z2 = ((Boolean) c28811aJ2.A0d.getValue()).booleanValue();
                        if (!z2) {
                            return;
                        }
                        c28811aJ2.A0B();
                        return;
                    }
                    c4k62.A00(A00);
                    C28811aJ.A07(c28811aJ2, A00);
                    return;
                }
                Iterator it2 = A00.iterator();
                while (it2.hasNext()) {
                    AbstractC125215lS.A00(c4k62.A00, (C5lP) it2.next(), "bootstrap_start");
                }
                c28811aJ2.A0V.add(A00);
            }
        };
        Handler handler = new Handler(A02, c4kq, this) { // from class: X.4Kk
            public final WeakReference A00;
            public final /* synthetic */ C28811aJ A01;

            {
                this.A01 = this;
                this.A00 = new WeakReference(c4kq);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                boolean isConnected;
                C4KH c4kh;
                int i2;
                C006802i c006802i;
                int i3;
                short s;
                String str;
                java.util.Set<String> BKn;
                String A00;
                String str2;
                if (Systrace.A0E(1L)) {
                    int i4 = message.what;
                    Charset charset = C28811aJ.A0v;
                    switch (i4) {
                        case 1:
                            str2 = "STORE_LOADED";
                            break;
                        case 2:
                        case 6:
                        default:
                            str2 = "UNKNOWN";
                            break;
                        case 3:
                            str2 = "MQTT_CHANNEL_STATE_CHANGED";
                            break;
                        case 4:
                            str2 = "SUBSCRIBE_RESPONSE_MESSAGE";
                            break;
                        case 5:
                            str2 = "SUBSCRIBE_REQUEST_TIMEOUT";
                            break;
                        case 7:
                            str2 = "CONNECTIVITY_STATE_CHANGED";
                            break;
                        case 8:
                            str2 = "SNAPSHOT_REQUEST";
                            break;
                        case 9:
                            str2 = "SNAPSHOT_REQUEST_CANCELED";
                            break;
                        case 10:
                            str2 = "DEFERRED_INITIALIZATION";
                            break;
                        case 11:
                            str2 = "WHAT_SESSION_LOADED";
                            break;
                    }
                    C0fO.A01(AnonymousClass001.A0R("IrisSyncManager.handleMessage.", str2), 2020223535);
                }
                try {
                    switch (message.what) {
                        case 1:
                            C28811aJ c28811aJ = this.A01;
                            Charset charset2 = C28811aJ.A0v;
                            if (!c28811aJ.A0D) {
                                c28811aJ.A0D = true;
                                C28811aJ.A05(c28811aJ);
                                C28811aJ.A03(c28811aJ);
                                break;
                            }
                            break;
                        case 3:
                            C28811aJ c28811aJ2 = this.A01;
                            Object obj = message.obj;
                            obj.getClass();
                            Charset charset3 = C28811aJ.A0v;
                            if (((C95094Pu) obj).A00 == C05F.A01) {
                                c4kh = c28811aJ2.A0S;
                                i2 = 0;
                                c4kh.A01 = 0;
                                c4kh.A00 = i2;
                                break;
                            } else {
                                C28811aJ.A06(c28811aJ2, null, -1L, false);
                                C28811aJ.A02(c28811aJ2);
                                break;
                            }
                        case 4:
                            C28811aJ c28811aJ3 = this.A01;
                            Object obj2 = message.obj;
                            obj2.getClass();
                            C114365Ec c114365Ec = (C114365Ec) obj2;
                            C28811aJ.A02(c28811aJ3);
                            if (c114365Ec.A05) {
                                C4KH c4kh2 = c28811aJ3.A0S;
                                c4kh2.A01 = 0;
                                c4kh2.A00 = 0;
                                long j = c114365Ec.A02;
                                if (j == c28811aJ3.A01) {
                                    C28811aJ.A06(c28811aJ3, Long.valueOf(c114365Ec.A03), c114365Ec.A01, true);
                                    long j2 = c114365Ec.A02;
                                    long j3 = c114365Ec.A01;
                                    C9BW c9bw = c28811aJ3.A0L;
                                    Integer num2 = C05F.A0C;
                                    c9bw.A01 = num2;
                                    AbstractC94044Ko.A03 = num2;
                                    AbstractC94044Ko.A00 = j3;
                                    AbstractC94044Ko.A01 = j2;
                                    C5EW c5ew = new C5EW(num2);
                                    InterfaceC09390do interfaceC09390do8 = c28811aJ3.A0a;
                                    ((C25671My) interfaceC09390do8.getValue()).E4s(c5ew);
                                    ((C25671My) interfaceC09390do8.getValue()).A05(new C5EX(j2, j3, num2));
                                    if (((Boolean) c28811aJ3.A0g.getValue()).booleanValue()) {
                                        c28811aJ3.A03 = j3;
                                        if (c28811aJ3.A02 != -1) {
                                            c28811aJ3.A0b.getValue();
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (currentTimeMillis - c28811aJ3.A02 >= TimeUnit.SECONDS.toMillis(((Long) c28811aJ3.A0c.getValue()).longValue())) {
                                                boolean z2 = false;
                                                if (c28811aJ3.A03 - j2 > ((Long) c28811aJ3.A0Y.getValue()).longValue()) {
                                                    z2 = true;
                                                }
                                                c28811aJ3.A0A = z2;
                                                if (!z2) {
                                                    num2 = C05F.A00;
                                                }
                                                ((C25671My) interfaceC09390do8.getValue()).E4s(new LYI(num2));
                                                UserSession userSession3 = c28811aJ3.A0M;
                                                switch (num2.intValue()) {
                                                    case 0:
                                                        A00 = AbstractC43591JPw.A00(615);
                                                        break;
                                                    case 1:
                                                        A00 = AbstractC43591JPw.A00(642);
                                                        break;
                                                    default:
                                                        A00 = AbstractC43591JPw.A00(696);
                                                        break;
                                                }
                                                C162337Ov.A0p(userSession3, A00, j2, c28811aJ3.A03, currentTimeMillis - c28811aJ3.A02);
                                            }
                                            c28811aJ3.A02 = -1L;
                                        }
                                    }
                                } else if (j != c28811aJ3.A04) {
                                    C1ZX A002 = ((C1ZW) c28811aJ3.A0Z.getValue()).A00(C05F.A03, 817891655, 0, false);
                                    A002.A05(new RuntimeException(AnonymousClass001.A0f("Unexpected subscription response: seqId=", " expected=", c114365Ec.A02, c28811aJ3.A04)));
                                    A002.A02("response.seqId", c114365Ec.A02);
                                    A002.A02("expected.seqId", c28811aJ3.A04);
                                    A002.A00();
                                }
                                C4K7 c4k72 = c28811aJ3.A0N;
                                C18920wW c18920wW = c4k72.A01;
                                InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "ig_direct_iris_subscription");
                                A003.AAP("action", "success");
                                A003.Cht();
                                c4k72.A00 = -1L;
                                c006802i = (C006802i) c4k72.A02.getValue();
                                i3 = 505875015;
                                s = 2;
                                c006802i.markerEnd(i3, s);
                                break;
                            } else {
                                C0K8.A0P("IrisSyncManager", "Failed iris subscription %d %s", Integer.valueOf(c114365Ec.A00), c114365Ec.A04);
                                C4K7 c4k73 = c28811aJ3.A0N;
                                int i5 = c114365Ec.A00;
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            str = "unknown";
                                        } else {
                                            str = "resnapshotTakedown";
                                        }
                                    } else {
                                        str = "retry";
                                    }
                                } else {
                                    str = "resnapshot";
                                }
                                String str3 = c114365Ec.A04;
                                C14360o3.A0B(str3, 1);
                                C18920wW c18920wW2 = c4k73.A01;
                                InterfaceC02590Ai A004 = c18920wW2.A00(c18920wW2.A00, "ig_direct_iris_subscription");
                                A004.AAP("action", "error");
                                A004.AAP("error_kind", "serverside");
                                A004.AAP("error_type", str);
                                A004.A9K("error_retryable", 1L);
                                A004.AAP("error_message", str3);
                                if (str3.equals("IrisQueueTooLargeException")) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    if (c4k73.A00 != -1) {
                                        ((C006802i) c4k73.A02.getValue()).markerAnnotate(505875015, "TIME_ELAPSED_SINCE_LAST_ERROR_MS", currentTimeMillis2 - c4k73.A00);
                                        A004.A9K("time_elapsed_since_last_error_ms", Long.valueOf(currentTimeMillis2 - c4k73.A00));
                                    }
                                    c4k73.A00 = currentTimeMillis2;
                                }
                                A004.Cht();
                                InterfaceC09390do interfaceC09390do9 = c4k73.A02;
                                MarkerEditor withMarker = ((C006802i) interfaceC09390do9.getValue()).withMarker(505875015);
                                withMarker.annotate("error_type", str);
                                withMarker.annotate("error_reason", "serverside");
                                withMarker.annotate("error_message", str3);
                                withMarker.markerEditingCompleted();
                                ((C006802i) interfaceC09390do9.getValue()).markerEnd(505875015, (short) 87);
                                int i6 = c114365Ec.A00;
                                if (i6 != 1) {
                                    if (i6 != 2) {
                                        if (i6 == 3) {
                                            c28811aJ3.A0B();
                                            c28811aJ3.A0A();
                                            UserSession userSession4 = c28811aJ3.A0M;
                                            if (AbstractC453326q.A02(userSession4)) {
                                                AbstractC207749He.A00().A00(userSession4);
                                                C14360o3.A0B(userSession4, 0);
                                                C25821No A005 = C25821No.A00();
                                                InterfaceC24271Gw A006 = A005.A0G.A00();
                                                if (A006 != null) {
                                                    if (A006 instanceof C59852oS) {
                                                        BKn = ((C59852oS) A006).A00.getAllKeys();
                                                    } else {
                                                        BKn = A006.BKn();
                                                    }
                                                    for (String str4 : BKn) {
                                                        try {
                                                            C14360o3.A0B(str4, 0);
                                                            if (AbstractC002300n.A0h(str4, "msys", false)) {
                                                                A006.EEk(str4);
                                                                A005.A0K.A03.A00(str4);
                                                            }
                                                        } catch (IllegalStateException | NoSuchElementException unused) {
                                                        }
                                                    }
                                                }
                                                LJJ ljj = C48517LdF.A08;
                                                File file = LJJ.A01(userSession4).A03;
                                                if (file.exists()) {
                                                    MT6.A03(file);
                                                    break;
                                                }
                                            }
                                        } else {
                                            C1ZX A007 = ((C1ZW) c28811aJ3.A0Z.getValue()).A00(C05F.A03, 817891655, 0, false);
                                            A007.A05(new RuntimeException(AnonymousClass001.A05(c114365Ec.A00, "Unexpected error: errorType=", AbstractC43591JPw.A00(503), c114365Ec.A04)));
                                            A007.A01("response.errorType", c114365Ec.A00);
                                            A007.A03("response.errorMessage", c114365Ec.A04);
                                            A007.A00();
                                        }
                                    }
                                    c28811aJ3.A0S.A00();
                                    break;
                                } else {
                                    c28811aJ3.A0B();
                                    c28811aJ3.A0A();
                                    break;
                                }
                            }
                            break;
                        case 5:
                            C28811aJ c28811aJ4 = this.A01;
                            Charset charset4 = C28811aJ.A0v;
                            c28811aJ4.A0E = false;
                            c28811aJ4.A0S.A00();
                            C4K7 c4k74 = c28811aJ4.A0N;
                            C18920wW c18920wW3 = c4k74.A01;
                            InterfaceC02590Ai A008 = c18920wW3.A00(c18920wW3.A00, "ig_direct_iris_subscription");
                            A008.AAP("action", "error");
                            A008.AAP("error_kind", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                            A008.A9K("error_retryable", 1L);
                            A008.Cht();
                            c006802i = (C006802i) c4k74.A02.getValue();
                            i3 = 505875015;
                            c006802i.markerAnnotate(505875015, "error_reason", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                            s = 87;
                            c006802i.markerEnd(i3, s);
                            break;
                        case 7:
                            C28811aJ c28811aJ5 = this.A01;
                            NetworkInfo networkInfo = (NetworkInfo) message.obj;
                            Charset charset5 = C28811aJ.A0v;
                            if (networkInfo != null && (isConnected = networkInfo.isConnected()) != c28811aJ5.A0C) {
                                c28811aJ5.A0C = isConnected;
                                c4kh = c28811aJ5.A0S;
                                i2 = 0;
                                c4kh.A01 = 0;
                                c4kh.A00 = i2;
                                break;
                            }
                            break;
                        case 8:
                            C28811aJ c28811aJ6 = this.A01;
                            C7J1 c7j1 = (C7J1) message.obj;
                            Charset charset6 = C28811aJ.A0v;
                            c28811aJ6.A0U.add(c7j1);
                            break;
                        case 9:
                            Object obj3 = message.obj;
                            obj3.getClass();
                            Charset charset7 = C28811aJ.A0v;
                            ((C7J1) obj3).A01();
                            break;
                        case 10:
                            C28811aJ c28811aJ7 = this.A01;
                            Charset charset8 = C28811aJ.A0v;
                            ((C2DS) c28811aJ7.A0h.getValue()).CoS("IrisManagerDeferredInit");
                            break;
                        case 11:
                            C28811aJ.A05(this.A01);
                            break;
                    }
                    C28811aJ.A04(this.A01);
                    C4KQ c4kq2 = (C4KQ) this.A00.get();
                    if (c4kq2 != null) {
                        c4kq2.A08();
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-455316391);
                    }
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-822418647);
                    }
                    throw th;
                }
            }
        };
        this.A0J = handler;
        this.A0n = new C94014Kl(userSession, c4kq, c4k6, AbstractC28761aE.A00(userSession), list);
        ((C25671My) interfaceC09390do2.getValue()).A01(interfaceC41501vz3, C94024Km.class);
        C2DS c2ds = (C2DS) interfaceC09390do.getValue();
        ((C25671My) interfaceC09390do2.getValue()).A01(interfaceC41501vz, C2Im.class);
        C28741aC c28741aC = ((C2DU) c2ds).A0H;
        if (c28741aC.A0F) {
            handler.obtainMessage(1).sendToTarget();
        }
        if (((Boolean) A01.getValue()).booleanValue()) {
            ((C25671My) interfaceC09390do2.getValue()).A01(interfaceC41501vz2, C2S0.class);
            if (c28741aC.A0H && ((Boolean) A012.getValue()).booleanValue()) {
                handler.obtainMessage(11).sendToTarget();
            }
        }
        C218914p.A08.A0A(interfaceC12870lZ);
        if (!this.A09) {
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = this.A0G;
            BroadcastReceiver broadcastReceiver = this.A0F;
            IntentFilter intentFilter = A0t;
            this.A09 = (i2 >= 33 ? context2.registerReceiver(broadcastReceiver, intentFilter, 4) : context2.registerReceiver(broadcastReceiver, intentFilter)) != null;
        }
        AbstractC94044Ko.A03 = num;
        AbstractC94044Ko.A04 = null;
        AbstractC94044Ko.A00 = -1L;
        AbstractC94044Ko.A01 = -1L;
        AbstractC94044Ko.A02 = -1L;
    }

    public static void A02(C28811aJ c28811aJ) {
        c28811aJ.A0E = false;
        c28811aJ.A04 = -1L;
        Handler handler = c28811aJ.A0J;
        handler.removeCallbacks(c28811aJ.A0o);
        handler.removeMessages(5);
    }

    public final void A0B() {
        A06(this, null, -1L, false);
        this.A01 = -1L;
        this.A00 = -1L;
        C47232Ep c47232Ep = this.A0m;
        C2Et c2Et = c47232Ep.A02;
        c2Et.A04 = -1L;
        c2Et.A01 = 4;
        C47232Ep.A00(c47232Ep);
    }

    public final void A0D(AbstractC46972Dl abstractC46972Dl, InterfaceC2056798r interfaceC2056798r, String str) {
        new C99G(abstractC46972Dl, interfaceC2056798r, this, C4I3.A03, str, true, true).A03();
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean shouldNotifyMqttChannelStateChanged() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (X.AbstractC63302u8.A00(r10).A05 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C28811aJ A00(final com.instagram.common.session.UserSession r10) {
        /*
            java.util.List r1 = X.C28811aJ.A0u
            int r0 = r1.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            r4 = r10
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()
            X.0KV r0 = (X.C0KV) r0
            java.lang.Object r0 = r0.AXR(r10)
            r5.add(r0)
            goto Lf
        L24:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r0 = X.C4A4.A01(r10)
            if (r0 != 0) goto L3b
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AbstractC63302u8.A00(r10)
            boolean r0 = r0.A05
            if (r0 == 0) goto L40
        L3b:
            X.4I2 r0 = X.C4I2.A00
            r6.add(r0)
        L40:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.2Dr r2 = X.C47032Dr.A00
            r7.add(r2)
            X.2Dk r1 = X.C46962Dk.A00
            r7.add(r1)
            r0 = 0
            boolean r0 = X.C2E8.A0A(r10, r0)
            if (r0 == 0) goto L61
            boolean r0 = X.C2E9.A03(r10)
            if (r0 != 0) goto L61
            X.2Dx r0 = X.C47092Dx.A00
            r7.add(r0)
        L61:
            boolean r0 = X.C2E8.A04(r10)
            if (r0 == 0) goto L6c
            X.2Du r0 = X.C47062Du.A00
            r7.add(r0)
        L6c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r2)
            r8.add(r1)
            android.content.Context r3 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC14490oL.A0C(r3)
            if (r0 == 0) goto Lba
            boolean r0 = X.C4K3.A00(r10)
            if (r0 != 0) goto L98
            boolean r0 = X.C2E8.A06(r10)
            if (r0 == 0) goto Lba
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36310834636652880(0x81008300040150, double:3.0264562639900163E-306)
            boolean r0 = X.C18U.A06(r2, r10, r0)
            if (r0 == 0) goto Lba
        L98:
            r10 = 1
        L99:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36592309613101491(0x820083000001b3, double:3.204462172504874E-306)
            long r0 = X.C18U.A01(r2, r4, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r9 = r0.intValue()
            java.lang.Class<X.1aJ> r0 = X.C28811aJ.class
            X.4K4 r2 = new X.4K4
            r2.<init>()
            java.lang.Object r0 = r4.A01(r0, r2)
            X.1aJ r0 = (X.C28811aJ) r0
            return r0
        Lba:
            r10 = 0
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28811aJ.A00(com.instagram.common.session.UserSession):X.1aJ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36320536969814682L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean A01(X.C28811aJ r3) {
        /*
            com.instagram.common.session.UserSession r3 = r3.A0M
            boolean r0 = X.AbstractC94034Kn.A00(r3)
            if (r0 != 0) goto L1a
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320536969814682(0x8109560023229a, double:3.0325920585497E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28811aJ.A01(X.1aJ):java.lang.Boolean");
    }

    public static void A03(C28811aJ c28811aJ) {
        C129085sT c129085sT;
        if (c28811aJ.A0B && c28811aJ.A0D) {
            List<List> list = c28811aJ.A0V;
            if (!list.isEmpty()) {
                if (((Boolean) c28811aJ.A0q.getValue()).booleanValue()) {
                    c129085sT = C129085sT.A04;
                } else {
                    c129085sT = C129085sT.A03;
                }
                for (List list2 : list) {
                    if (c28811aJ.A0P.A00(c129085sT, list2, c28811aJ.A00)) {
                        C4K6 c4k6 = c28811aJ.A0Q;
                        C14360o3.A0B(list2, 0);
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            AbstractC125215lS.A00(c4k6.A00, (C5lP) it.next(), "bootstrap_end");
                        }
                        c4k6.A00(list2);
                        A07(c28811aJ, list2);
                    }
                }
                list.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1, 36318861939448542L) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r6 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C28811aJ r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28811aJ.A04(X.1aJ):void");
    }

    public static void A05(C28811aJ c28811aJ) {
        long j;
        ReentrantReadWriteLock.ReadLock readLock;
        String str;
        C46922Dg c46922Dg = ((C2DU) ((C2DS) c28811aJ.A0h.getValue())).A0C;
        long A08 = c46922Dg.A08();
        c28811aJ.A01 = A08;
        c28811aJ.A00 = A08;
        ReentrantReadWriteLock reentrantReadWriteLock = c46922Dg.A0G;
        boolean z = c46922Dg.A0L;
        if (z) {
            readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                j = c46922Dg.A00.A06;
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (c46922Dg.A0D) {
                j = c46922Dg.A00.A06;
            }
        }
        c28811aJ.A05 = j;
        if (z) {
            readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            str = c46922Dg.A00.A09;
        } else {
            synchronized (c46922Dg.A0D) {
                str = c46922Dg.A00.A09;
            }
        }
        c28811aJ.A08 = str;
        C47232Ep c47232Ep = c28811aJ.A0m;
        long j2 = c28811aJ.A01;
        C2Et c2Et = c47232Ep.A02;
        c2Et.A04 = j2;
        c2Et.A01 = 1;
        C47232Ep.A00(c47232Ep);
    }

    public static void A06(C28811aJ c28811aJ, Long l, long j, boolean z) {
        long j2;
        if (z != c28811aJ.A0B) {
            c28811aJ.A0B = z;
            C47232Ep c47232Ep = c28811aJ.A0m;
            C2Et c2Et = c47232Ep.A02;
            c2Et.A07 = z;
            c2Et.A05 = j;
            if (z) {
                j2 = c47232Ep.A01.A04;
            } else {
                j2 = -1;
            }
            c2Et.A03 = j2;
            C47232Ep.A00(c47232Ep);
            C2DU c2du = (C2DU) ((C2DS) c28811aJ.A0h.getValue());
            synchronized (c2du) {
                c2du.A04 = l;
            }
            if (c28811aJ.A0B) {
                A03(c28811aJ);
            }
        }
    }

    public final C7J0 A08(ThreadFetchReason threadFetchReason, InterfaceC2056798r interfaceC2056798r, String str, boolean z) {
        C7J0 c7j0 = new C7J0(threadFetchReason, interfaceC2056798r, this, str, z);
        c7j0.A03();
        return c7j0;
    }

    public final void A09() {
        if (C2E8.A02(this.A0M)) {
            new C220159o1(this, "resnapshot_delta").A03();
        }
        A0D(C4I1.A00, null, "resnapshot_delta");
    }

    public final void A0A() {
        if (((Boolean) this.A0g.getValue()).booleanValue()) {
            this.A0b.getValue();
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.A02;
            if (j == -1) {
                this.A02 = currentTimeMillis;
            } else {
                if (currentTimeMillis - j < TimeUnit.SECONDS.toMillis(((Number) this.A0c.getValue()).longValue())) {
                    return;
                }
                ((C25671My) this.A0a.getValue()).E4s(new LYI(C05F.A01));
                C162337Ov.A0p(this.A0M, "IRIS_QUEUE_STUCK", this.A01, this.A03, currentTimeMillis - this.A02);
            }
        }
    }

    public final void A0C(long j, int i) {
        if (this.A01 != j) {
            this.A01 = j;
            this.A00 = j;
            ((C2DU) ((C2DS) this.A0h.getValue())).A0C.A0L(j);
            C47232Ep c47232Ep = this.A0m;
            C2Et c2Et = c47232Ep.A02;
            c2Et.A04 = j;
            c2Et.A01 = i;
            C47232Ep.A00(c47232Ep);
        }
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final List getMqttTopicsToHandle() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC);
        arrayList.add(RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE);
        if (!C18U.A06(C06090Tz.A05, this.A0M, 36315846866636418L)) {
            arrayList.add(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC);
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleRealtimeEvent(X.C5EZ r6, com.instagram.realtimeclient.RealtimePayload r7) {
        /*
            r5 = this;
            java.lang.String r3 = r6.A00
            byte[] r1 = r6.A01
            java.nio.charset.Charset r0 = X.C28811aJ.A0v
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1892903684: goto L14;
                case 1526307141: goto L4b;
                case 1931258631: goto L4e;
                default: goto L12;
            }
        L12:
            r0 = 1
            return r0
        L14:
            java.lang.String r0 = "/ig_sub_iris_response"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            X.16L r0 = X.C16V.A00(r2)     // Catch: java.io.IOException -> L2a
            X.5Ec r2 = X.AbstractC114355Eb.parseFromJson(r0)     // Catch: java.io.IOException -> L2a
            if (r2 == 0) goto L12
            android.os.Handler r1 = r5.A0J
            r0 = 4
            goto L59
        L2a:
            r4 = move-exception
            X.0do r0 = r5.A0Z
            java.lang.Object r3 = r0.getValue()
            X.1ZW r3 = (X.C1ZW) r3
            java.lang.Integer r2 = X.C05F.A03
            r1 = 817891655(0x30c00947, float:1.3972475E-9)
            r0 = 0
            X.1ZX r2 = r3.A00(r2, r1, r0, r0)
            java.lang.String r1 = "Could not deserialize IrisSubscribeResponse"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r4)
            r2.A05(r0)
            r2.A00()
            goto L12
        L4b:
            java.lang.String r0 = "/ig_message_sync"
            goto L50
        L4e:
            java.lang.String r0 = "/ig_large_scale_fire_and_forget_sync"
        L50:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            android.os.Handler r1 = r5.A0H
            r0 = 1
        L59:
            android.os.Message r0 = r1.obtainMessage(r0, r2)
            r0.sendToTarget()
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28811aJ.handleRealtimeEvent(X.5EZ, com.instagram.realtimeclient.RealtimePayload):boolean");
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final void onMqttChannelStateChanged(C95094Pu c95094Pu) {
        this.A0J.obtainMessage(3, c95094Pu).sendToTarget();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC09390do interfaceC09390do = this.A0a;
        ((C25671My) interfaceC09390do.getValue()).A02(this.A0i, C2Im.class);
        if (((Boolean) this.A0p.getValue()).booleanValue()) {
            ((C25671My) interfaceC09390do.getValue()).A02(this.A0j, C2S0.class);
        }
        ((C25671My) interfaceC09390do.getValue()).A02(this.A0k, C94024Km.class);
        C218914p.A06(this.A0l);
        if (this.A09) {
            this.A0G.unregisterReceiver(this.A0F);
            this.A09 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C28811aJ r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28811aJ.A07(X.1aJ, java.util.List):void");
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        String str3;
        switch (str.hashCode()) {
            case -1892903684:
                str3 = RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE;
                break;
            case 1526307141:
                str3 = RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC;
                break;
            case 1931258631:
                if (str.equals(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC)) {
                    return !C18U.A06(C06090Tz.A05, this.A0M, 36315846866636418L);
                }
            default:
                return false;
        }
        if (!str.equals(str3)) {
            return false;
        }
        return true;
    }
}
