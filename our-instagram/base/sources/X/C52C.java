package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.52C, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C52C implements InterfaceC108294uG {
    public C108284uF A00;
    public List A01;
    public final double A02;
    public final long A03;
    public final String A04;
    public final List A05;
    public final ReentrantLock A08 = new ReentrantLock();
    public final Map A07 = new LinkedHashMap();
    public final Map A06 = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC108294uG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ELI(X.C54779OIt r8) {
        /*
            r7 = this;
            r5 = 0
            X.51t r3 = r8.A03
            if (r3 != 0) goto L28
            X.4uF r0 = r7.A00
            if (r0 == 0) goto L82
            X.51t r3 = r0.A01
            if (r3 != 0) goto L28
            java.lang.String r1 = "No predictor specificed"
            X.3R9[] r0 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = new com.instagram.igsignals.core.IgSignalsModelPrediction
            r0.<init>(r1, r2, r3, r5)
            r8.A00(r0)
            java.lang.String r1 = "IgSignals"
            java.lang.String r0 = "No predictor set"
            X.C0w9.A03(r1, r0)
        L27:
            return
        L28:
            X.WD2 r0 = r3.A00()
            java.lang.String r2 = r0.A00()
            java.util.concurrent.locks.ReentrantLock r6 = r7.A08
            r6.lock()
            java.util.Map r1 = r7.A07     // Catch: java.lang.Throwable -> L96
            java.lang.Object r5 = r1.get(r2)     // Catch: java.lang.Throwable -> L96
            if (r5 != 0) goto L49
            X.4uF r0 = r7.A00     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L8c
            X.NMM r5 = new X.NMM     // Catch: java.lang.Throwable -> L96
            r5.<init>(r7, r0, r3)     // Catch: java.lang.Throwable -> L96
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L96
        L49:
            X.NMM r5 = (X.NMM) r5     // Catch: java.lang.Throwable -> L96
            r6.unlock()
            r0 = 35
            X.9Ew r4 = new X.9Ew
            r4.<init>(r0, r8, r7)
            r3 = 1
            java.util.concurrent.locks.ReentrantLock r6 = r5.A03
            r6.lock()
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = r5.A00     // Catch: java.lang.Throwable -> L96
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L6f
            java.util.List r0 = r5.A02     // Catch: java.lang.Throwable -> L96
            r0.add(r8)     // Catch: java.lang.Throwable -> L96
            boolean r0 = r5.A01     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L6e
            r5.A01 = r3     // Catch: java.lang.Throwable -> L96
            r0 = r1
            goto L70
        L6e:
            r0 = r1
        L6f:
            r2 = 0
        L70:
            r6.unlock()
            if (r0 == 0) goto L78
            r8.A00(r0)
        L78:
            if (r2 == 0) goto L27
            r5.A00 = r4
            X.4uG r0 = r5.A02
            r0.ELI(r5)
            return
        L82:
            java.lang.String r0 = "delegate"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L8c:
            java.lang.String r0 = "delegate"
            X.C14360o3.A0F(r0)     // Catch: java.lang.Throwable -> L96
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52C.ELI(X.OIt):void");
    }

    public static final void A00(C52C c52c, IgSignalsModelPrediction igSignalsModelPrediction, InterfaceC16660sJ interfaceC16660sJ) {
        short s;
        if (igSignalsModelPrediction.A01 >= 0 && igSignalsModelPrediction.A00 >= 0) {
            if (c52c.A00 != null) {
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                AC5 ac5 = new AC5(c006802i);
                long j = igSignalsModelPrediction.A01;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = ac5.A01;
                int i = ac5.A00;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lightweightQuickPerformanceLogger.markerStartWithCancelPolicy(873412642, false, i, j, timeUnit);
                lightweightQuickPerformanceLogger.markerPoint(873412642, i, "prediction_start", igSignalsModelPrediction.A01, timeUnit);
                lightweightQuickPerformanceLogger.markerPoint(873412642, i, MSV.A00(1496), igSignalsModelPrediction.A00, timeUnit);
                WD2 wd2 = igSignalsModelPrediction.A02;
                if (wd2 != null) {
                    ac5.A01(MSV.A00(110), wd2.A01);
                    lightweightQuickPerformanceLogger.markerAnnotate(873412642, i, MSV.A00(231), wd2.A00);
                    ac5.A01("predictor_type", wd2.A02);
                }
                ac5.A00("result_value", igSignalsModelPrediction.A03);
                ac5.A00("schema_version", c52c.A02);
                C108284uF c108284uF = c52c.A00;
                if (c108284uF != null) {
                    AbstractC108234uA abstractC108234uA = c108284uF.A02;
                    String str = abstractC108234uA.A01;
                    String str2 = abstractC108234uA.A00;
                    ac5.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                    ac5.A01("identifier", str2);
                    interfaceC16660sJ.invoke(ac5);
                    boolean z = igSignalsModelPrediction.A06;
                    long j2 = igSignalsModelPrediction.A00;
                    if (z) {
                        s = 2;
                    } else {
                        String str3 = igSignalsModelPrediction.A04;
                        if (str3 != null) {
                            lightweightQuickPerformanceLogger.markerAnnotate(873412642, TraceFieldType.FailureReason, str3);
                        }
                        s = 3;
                    }
                    lightweightQuickPerformanceLogger.markerEnd(873412642, i, s, j2, timeUnit);
                    return;
                }
            }
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
    }

    public final void A01() {
        C108284uF c108284uF = this.A00;
        if (c108284uF != null) {
            C19L c19l = c108284uF.A08;
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZH(this, c108284uF, null, 0), c19l);
            return;
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }

    public final void A02(List list) {
        ReentrantLock reentrantLock = this.A08;
        reentrantLock.lock();
        try {
            if (this.A01 == null) {
                this.A01 = list;
                Iterator it = this.A06.values().iterator();
                while (it.hasNext()) {
                    A00(this, (IgSignalsModelPrediction) it.next(), new C206969Eb(list, 11));
                }
                C108284uF c108284uF = this.A00;
                if (c108284uF != null) {
                    AbstractC108234uA abstractC108234uA = c108284uF.A02;
                    L0G l0g = new L0G(abstractC108234uA.A01, abstractC108234uA.A00);
                    Iterator it2 = c108284uF.A03.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC57950Pmw) it2.next()).AIQ(this, l0g, list);
                    }
                } else {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C52C(String str, List list, double d, long j) {
        this.A04 = str;
        this.A02 = d;
        this.A05 = list;
        this.A03 = j;
    }
}
