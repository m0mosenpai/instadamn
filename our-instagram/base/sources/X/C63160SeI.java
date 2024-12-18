package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.dextricks.DexStore;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SeI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63160SeI {
    public static Handler A00;
    public static C206359Bs A01;
    public static final C63160SeI A02 = new Object();
    public static final AtomicLong A08 = AbstractC58318PtA.A15(0);
    public static final AtomicLong A09 = AbstractC58318PtA.A15(0);
    public static final AtomicLong A06 = AbstractC58318PtA.A15(0);
    public static final AtomicLong A07 = AbstractC58318PtA.A15(0);
    public static final AtomicLong A05 = AbstractC58318PtA.A15(0);
    public static final ConcurrentLinkedQueue A04 = new ConcurrentLinkedQueue();
    public static final ConcurrentHashMap A03 = AbstractC58318PtA.A14();

    public static final void A00() {
        String str;
        boolean z;
        Number number;
        AbstractC58570Pxo abstractC58570Pxo = (AbstractC58570Pxo) A04.peek();
        long j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        if (abstractC58570Pxo != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C206359Bs c206359Bs = A01;
            if (c206359Bs == null) {
                str = DexStore.CONFIG_FILENAME;
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            long j2 = currentTimeMillis - c206359Bs.A01;
            if (abstractC58570Pxo instanceof R6Z) {
                z = true;
            } else {
                z = abstractC58570Pxo instanceof C58571Pxp;
            }
            long j3 = 0;
            if (z) {
                Object obj = abstractC58570Pxo.A03.get("timestamp");
                if ((obj instanceof Long) && (number = (Number) obj) != null) {
                    j3 = number.longValue();
                }
            }
            long j4 = j3 - j2;
            if (j4 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                j = j4;
            }
        }
        Handler handler = A00;
        if (handler == null) {
            str = "backgroundHandler";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        handler.postDelayed(TRZ.A00, j);
    }

    public final void A01(C206359Bs c206359Bs) {
        List A0m;
        A01 = c206359Bs;
        HandlerThread handlerThread = new HandlerThread("RelLithoDebugEventStore", 10);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        A00 = MSY.A09(handlerThread);
        C206359Bs c206359Bs2 = A01;
        if (c206359Bs2 == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        String str = c206359Bs2.A04;
        if (str.length() == 0) {
            A0m = AbstractC16960so.A1Q("Litho.Resolve.ComponentRendered", "Litho.ComponentTree.Resolve", "Litho.TreeFuture.Interrupt", "Litho.TreeFuture.Resume", "Litho.TreeFuture.Run", "Litho.TreeFuture.Wait", "Litho.TreeFuture.Get", "Litho.TreeFuture.GetPartial");
        } else {
            A0m = AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        }
        String[] A1b = AbstractC31173DnH.A1b(A0m, 0);
        AbstractC50692Uq.A00.add(new C60537R6a(Arrays.copyOf(A1b, A1b.length)));
    }
}
