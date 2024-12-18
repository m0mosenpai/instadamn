package com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram;

import X.AbstractC31174DnI;
import X.AbstractC37300Gc1;
import X.C06090Tz;
import X.C0Gd;
import X.C13920nI;
import X.C14120nc;
import X.C18U;
import X.C1AT;
import X.C1AV;
import X.C61560Rpg;
import X.C63968Swu;
import X.ExecutorC14040nU;
import X.InterfaceC1820085k;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.interfaces.IARClassBenchmark;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class InstagramARClassBenchmark implements IARClassBenchmark {
    public final Context A00;
    public final AnalyticsLogger A01;
    public final C0Gd A02;
    public final UserSession A03;
    public final Executor A04 = new ExecutorC14040nU(C14120nc.A00(), 813, 3, false, false);
    public final C61560Rpg A05;
    public final InterfaceC1820085k A06;

    @Override // com.facebook.cameracore.mediapipeline.arclass.benchmark.interfaces.IARClassBenchmark
    public final void startBenchmarks() {
        UserSession userSession = this.A03;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36310327830446100L);
        C06090Tz c06090Tz = C06090Tz.A06;
        long A01 = C18U.A01(c06090Tz, userSession, 36591802807222288L);
        long A012 = C18U.A01(c06090Tz, userSession, 36591802806960143L);
        double A00 = C18U.A00(c06090Tz, userSession, 37154752760446976L);
        double A002 = C18U.A00(c06090Tz, userSession, 37154752760512513L);
        if (A06) {
            C61560Rpg c61560Rpg = this.A05;
            long j = A01 * 1000;
            InterfaceC19630xq interfaceC19630xq = c61560Rpg.A01;
            boolean z = false;
            if (interfaceC19630xq.contains("refreshTimeMillis") && AbstractC37300Gc1.A00(interfaceC19630xq.getLong("refreshTimeMillis", 0L)) < j) {
                z = true;
            }
            if (!AbstractC31174DnI.A1b(z)) {
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = c61560Rpg.A01.ARD();
                ARD.E7G("refreshTimeMillis", currentTimeMillis);
                ARD.apply();
                if (Math.random() < A00) {
                    this.A06.Chc(new C63968Swu(this, A002, A012));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.Rpg] */
    public InstagramARClassBenchmark(Context context, AnalyticsLogger analyticsLogger, InterfaceC1820085k interfaceC1820085k, C0Gd c0Gd, UserSession userSession) {
        this.A01 = analyticsLogger;
        this.A00 = context;
        this.A03 = userSession;
        this.A06 = interfaceC1820085k;
        this.A02 = c0Gd;
        ?? obj = new Object();
        obj.A01 = C1AT.A01(userSession).A03(C1AV.A0F);
        obj.A00 = C13920nI.A00;
        this.A05 = obj;
    }
}
