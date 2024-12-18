package X;

import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.7wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178377wB extends AbstractC178387wC {
    public static final AtomicLong A03 = new AtomicLong(0);
    public final SparseArray A00;
    public final C0J6 A01;
    public final C178457wJ A02;

    public static boolean A01(C178377wB c178377wB, Throwable th) {
        if (th == null) {
            return false;
        }
        int hashCode = th.toString().hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        SparseArray sparseArray = c178377wB.A00;
        Number number = (Number) sparseArray.get(hashCode, 0L);
        number.getClass();
        sparseArray.put(hashCode, Long.valueOf(currentTimeMillis));
        return currentTimeMillis - number.longValue() <= 300;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C178377wB(X.InterfaceC178207vu r6, X.InterfaceC178367wA r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L2d
            X.7wF r0 = new X.7wF
            r0.<init>()
        L7:
            X.7wJ r4 = new X.7wJ
            r4.<init>(r7)
            r5.<init>(r6, r7, r0)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.A00 = r0
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            com.facebook.common.time.AwakeTimeSinceBootClock r2 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            X.7wT r1 = new X.7wT
            r1.<init>()
            if (r2 == 0) goto L42
            X.0J6 r0 = new X.0J6
            r0.<init>(r1, r2, r3)
            r5.A01 = r0
            r5.A02 = r4
            X.7vc r0 = X.AbstractC178567wU.A00
            goto L33
        L2d:
            com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp r0 = new com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp
            r0.<init>(r9)
            goto L7
        L33:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.RuntimeException -> L3e
            java.lang.Object r0 = r6.AqG(r0)     // Catch: java.lang.RuntimeException -> L3e
            boolean r0 = r1.equals(r0)     // Catch: java.lang.RuntimeException -> L3e
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r5.A00 = r0
            return
        L42:
            java.lang.String r1 = "Must add a clock to the object pool builder"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178377wB.<init>(X.7vu, X.7wA, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, X.7xB] */
    public static C178997xB A00(AbstractC223559ty abstractC223559ty, C178377wB c178377wB, String str, String str2, String str3, String str4, Map map, long j) {
        Map map2;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        long nowNanos = awakeTimeSinceBootClock.nowNanos();
        String str5 = null;
        InterfaceC178427wG interfaceC178427wG = ((AbstractC178387wC) c178377wB).A01;
        if (interfaceC178427wG.getActiveSessionId() != null) {
            str5 = "pre_capture";
        }
        ?? c0Zx = new C0Zx();
        c0Zx.A06("product_name", ((AbstractC178397wD) c178377wB).A00);
        c0Zx.A06("component_name", str);
        c0Zx.A06("component_instance_id", String.valueOf(j));
        c0Zx.A06("logger_instance_id", c178377wB.A09);
        c0Zx.A04("client_time_ms", Double.valueOf(nowNanos / 1000000.0d));
        c0Zx.A06("product_session_id", ((AbstractC178397wD) c178377wB).A01);
        C178467wK c178467wK = c178377wB.A06;
        c0Zx.A07("effect_ids", c178467wK.A05);
        c0Zx.A06("video_recording_state", c178467wK.A04);
        c0Zx.A06("stage", str5);
        c0Zx.A06("active_session_id", interfaceC178427wG.getActiveSessionId());
        c0Zx.A06("custom_session_id", str4);
        if (abstractC223559ty != null && str2 != null && str3 != null) {
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A05(TraceFieldType.ErrorCode, Long.valueOf(abstractC223559ty.A01));
            c0Zx2.A06(TraceFieldType.Error, abstractC223559ty.getMessage());
            c0Zx2.A06("error_severity", str2);
            c0Zx2.A06("error_source", str3);
            c0Zx2.A06("error_stacktrace", android.util.Log.getStackTraceString(abstractC223559ty));
            c0Zx.A02(c0Zx2, "error");
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (abstractC223559ty != null && (map2 = abstractC223559ty.A00) != null) {
            hashMap.putAll(map2);
        }
        hashMap.put("event_counter", String.valueOf(A03.getAndIncrement()));
        c0Zx.A08("extra_data", hashMap);
        return c0Zx;
    }

    @Override // X.InterfaceC178407wE
    public final Map A7N() {
        return (Map) this.A01.A01();
    }

    @Override // X.InterfaceC178407wE
    public final void EEM(Map map) {
        this.A01.A02(map);
    }

    @Deprecated
    public C178377wB(InterfaceC178367wA interfaceC178367wA, String str, String str2) {
        super(interfaceC178367wA, new OneCameraXLoggerCpp(false), str, str2);
        this.A00 = new SparseArray();
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C0Go c0Go = new C0Go() { // from class: X.7wT
            @Override // X.C0Go
            public final /* bridge */ /* synthetic */ Object A00() {
                return new HashMap(8);
            }

            @Override // X.C0Go
            public final /* bridge */ /* synthetic */ void A02(Object obj) {
                ((Map) obj).clear();
            }
        };
        if (awakeTimeSinceBootClock != null) {
            this.A01 = new C0J6(c0Go, awakeTimeSinceBootClock, Map.class);
            this.A02 = new C178457wJ(interfaceC178367wA);
            return;
        }
        throw new IllegalArgumentException("Must add a clock to the object pool builder");
    }
}
