package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.flexiblesampling.SamplingResult;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;

/* renamed from: X.XPf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC72133XPf extends Handler {
    public long A00;
    public final int A01;
    public final int A02;
    public final C72683XlA A03;
    public final C72734Xm6 A04;
    public final int A05;
    public final C01U A06;

    public HandlerC72133XPf(Looper looper, C72683XlA c72683XlA, C72734Xm6 c72734Xm6) {
        super(looper);
        this.A04 = c72734Xm6;
        this.A03 = c72683XlA;
        this.A05 = 1;
        this.A02 = 2;
        this.A01 = 3;
        this.A06 = new C01U();
        sendEmptyMessageDelayed(1, 500L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        int i = message.what;
        if (i == this.A01) {
            Object obj = message.obj;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics2.fabric.handler.EventDataWithLatency");
            this.A06.add(obj);
            return;
        }
        int i2 = this.A05;
        if (i == i2) {
            A00();
            sendEmptyMessageDelayed(i2, 500L);
        } else {
            if (i != this.A02) {
                return;
            }
            A00();
            Object obj2 = message.obj;
            C14360o3.A0C(obj2, AbstractC111324zv.A00(10));
            this.A00 = AbstractC166987dD.A0N(obj2);
        }
    }

    private final void A00() {
        while (true) {
            C01U c01u = this.A06;
            if (!c01u.isEmpty()) {
                C39851t9 c39851t9 = (C39851t9) c01u.removeFirst();
                this.A03.A00.A03(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                C14080nY.A00().A03(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                C0CA c0ca = c39851t9.A03;
                HashMap A00 = C5KW.A00(c0ca);
                long j = c39851t9.A01;
                SamplingResult samplingResult = c39851t9.A04;
                boolean z = samplingResult.A04;
                String A002 = AbstractC111324zv.A00(4996);
                if (z) {
                    long j2 = this.A00;
                    String str = c39851t9.A05;
                    long j3 = c39851t9.A02;
                    C72734Xm6 c72734Xm6 = this.A04;
                    long j4 = c39851t9.A00;
                    C39921tG c39921tG = c72734Xm6.A00;
                    C37571ou c37571ou = c72734Xm6.A01;
                    long j5 = c39921tG.A01(j4).A01;
                    long j6 = c37571ou.A0n;
                    if (j6 != -1) {
                        j5 = Math.min(j6, j5);
                    }
                    Object obj = A00.get("extra");
                    C14360o3.A0C(obj, A002);
                    FFSingletonJNILogger.log(j2, str, j, false, 1L, false, j3, j5, (String) obj, c39851t9.A06);
                } else {
                    long j7 = this.A00;
                    String str2 = c39851t9.A05;
                    long j8 = c39851t9.A02;
                    C72734Xm6 c72734Xm62 = this.A04;
                    long j9 = c39851t9.A00;
                    C39921tG c39921tG2 = c72734Xm62.A00;
                    C37571ou c37571ou2 = c72734Xm62.A01;
                    long j10 = c39921tG2.A01(j9).A01;
                    long j11 = c37571ou2.A0n;
                    if (j11 != -1) {
                        j10 = Math.min(j11, j10);
                    }
                    Object obj2 = A00.get("extra");
                    C14360o3.A0C(obj2, A002);
                    FFSingletonJNILogger.logWithCollectionControlDecision(j7, str2, j, false, j8, j10, (String) obj2, new FFSingletonJNILogger.CollectionControlDecision(samplingResult.A00, samplingResult.A03, j, false, FFSingletonJNILogger.CollectionControlDecisionStatus.SUCCESS.mVal), c39851t9.A06);
                }
                c0ca.A02();
            } else {
                return;
            }
        }
    }
}
