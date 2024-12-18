package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.R6d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60540R6d extends AbstractC50682Uo {
    public static final AtomicInteger A01 = AbstractC58319PtB.A16();
    public final LightweightQuickPerformanceLogger A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C60540R6d(com.facebook.quicklog.LightweightQuickPerformanceLogger r3, X.EnumC61148Rg9 r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            java.lang.String[] r1 = r4.A00
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r2.<init>(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60540R6d.<init>(com.facebook.quicklog.LightweightQuickPerformanceLogger, X.Rg9):void");
    }

    public final C62745SOm A01(String str) {
        EnumC61180Rgg A00 = S5R.A00(str);
        if (A00 == null) {
            return null;
        }
        int andIncrement = A01.getAndIncrement();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        int i = A00.A00;
        lightweightQuickPerformanceLogger.markerStart(i, andIncrement, -1L, TimeUnit.MILLISECONDS);
        if (!lightweightQuickPerformanceLogger.isMarkerOn(i, andIncrement, false)) {
            return null;
        }
        return new C62745SOm(A00, andIncrement);
    }

    @Override // X.AbstractC50682Uo
    public final void A00(AbstractC58570Pxo abstractC58570Pxo) {
        EnumC61180Rgg A00;
        if ((abstractC58570Pxo instanceof C58571Pxp) && (A00 = S5R.A00(abstractC58570Pxo.A02)) != null) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            int i = A00.A00;
            Object obj = "unknown";
            Map map = abstractC58570Pxo.A03;
            Object obj2 = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (obj2 != null) {
                obj = obj2;
            }
            EventBuilder markEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(i, (String) obj);
            String[] strArr = A00.A01;
            int length = strArr.length;
            int i2 = 0;
            if (length == 0) {
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    markEventBuilder.annotate(AbstractC31172DnG.A17(A1K), String.valueOf(A1K.getValue()));
                }
                markEventBuilder.annotate("thread", abstractC58570Pxo.A01);
                markEventBuilder.report();
            }
            do {
                String str = strArr[i2];
                markEventBuilder.annotate(str, String.valueOf(map.get(str)));
                i2++;
            } while (i2 < length);
            markEventBuilder.annotate("thread", abstractC58570Pxo.A01);
            markEventBuilder.report();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(R6Z r6z, Object obj) {
        C62745SOm c62745SOm = (C62745SOm) obj;
        if (c62745SOm != null) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            EnumC61180Rgg enumC61180Rgg = c62745SOm.A01;
            int i = enumC61180Rgg.A00;
            int i2 = c62745SOm.A00;
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "thread", ((AbstractC58570Pxo) r6z).A01);
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "duration", TimeUnit.NANOSECONDS.toMillis(r6z.A00));
            String[] strArr = enumC61180Rgg.A01;
            int length = strArr.length;
            int i3 = 0;
            if (length == 0) {
                Iterator A15 = AbstractC166997dE.A15(r6z.A03);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, AbstractC31172DnG.A17(A1K), String.valueOf(A1K.getValue()));
                }
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "asl_session_id", C0L6.A01());
                lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2);
            }
            do {
                String str = strArr[i3];
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, String.valueOf(r6z.A03.get(str)));
                i3++;
            } while (i3 < length);
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "asl_session_id", C0L6.A01());
            lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2);
        }
    }
}
