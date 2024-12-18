package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* renamed from: X.Swu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63968Swu implements InterfaceC1819985j {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InstagramARClassBenchmark A02;

    public C63968Swu(InstagramARClassBenchmark instagramARClassBenchmark, double d, long j) {
        this.A02 = instagramARClassBenchmark;
        this.A00 = d;
        this.A01 = j;
    }

    @Override // X.InterfaceC1819985j
    public final void DG7(boolean z, Throwable th) {
        this.A02.A02.EmP("InstagramARClassBenchmark", "AR Class benchmark lib download failed.", th);
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00e9: IGET (r0 I:com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark) = (r7 I:X.Swu) (LINE:233) X.Swu.A02 com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark, block:B:17:0x00e9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.Swu] */
    @Override // X.InterfaceC1819985j
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ?? r7;
        try {
            int i = 0;
            Constructor<?> constructor = Class.forName("com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.base.ARClassBenchmark").getConstructor(Executor.class, AnalyticsLogger.class, Context.class, Float.TYPE, InterfaceC65202Tfk.class);
            final InstagramARClassBenchmark instagramARClassBenchmark = this.A02;
            final Object newInstance = constructor.newInstance(instagramARClassBenchmark.A04, instagramARClassBenchmark.A01, instagramARClassBenchmark.A00, Float.valueOf((float) this.A00), null);
            Integer num = (Integer) AbstractC58323PtF.A0l(newInstance, newInstance.getClass(), "getBenchmarkVersion");
            if (num != null) {
                i = num.intValue();
            }
            Integer valueOf = Integer.valueOf(i);
            final long j = this.A01;
            UserSession userSession = instagramARClassBenchmark.A03;
            if (C18U.A06(C06090Tz.A05, userSession, 36314476772264561L)) {
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                String num2 = Integer.toString(valueOf.intValue());
                A0b.A04("benchmark_version", num2);
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC167007dF.A1W(num2)), "ARClassBenchmarkCountQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59604QiT.class, false, null, 0, null, "xfb_arclass_benchmark_count", AbstractC166987dD.A1E());
                AbstractC40691uc.A01(userSession).ATV(new C63994SxR(0), new InterfaceC48192Ji() { // from class: X.Sxo
                    @Override // X.InterfaceC48192Ji
                    public final void invoke(AnonymousClass436 anonymousClass436) {
                        Object Bos;
                        InstagramARClassBenchmark instagramARClassBenchmark2 = InstagramARClassBenchmark.this;
                        long j2 = j;
                        Object obj2 = newInstance;
                        if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                            if (((C2JS) Bos).getOptionalTreeField(0, "xfb_arclass_benchmark_count(benchmark_version:$benchmark_version)", C59603QiS.class, -252052557) == null || r9.getOptionalTreeField(0, "xfb_arclass_benchmark_count(benchmark_version:$benchmark_version)", C59603QiS.class, -252052557).getCoercedIntField(0, IntentModule.EXTRA_MAP_KEY_FOR_VALUE) < j2) {
                                try {
                                    AbstractC58318PtA.A0t(obj2.getClass(), "startBenchmarks").invoke(obj2, new Object[0]);
                                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                                    instagramARClassBenchmark2.A02.EmP("InstagramARClassBenchmark", "AR Class benchmark invoke failed.", e);
                                }
                            }
                        }
                    }
                }, pandoGraphQLRequest);
                return;
            }
            C2JM A0b3 = AbstractC25225BEi.A0b();
            String num3 = Integer.toString(valueOf.intValue());
            A0b3.A04("benchmark_version", num3);
            C18C.A0E(AbstractC167007dF.A1W(num3));
            C907442n c907442n = new C907442n(A0b3, QH9.class, "ARClassBenchmarkCountQuery", false);
            C907542o c907542o = new C907542o(userSession);
            c907542o.A08(c907442n);
            C1ON A07 = c907542o.A07(C05F.A00);
            A07.A00 = new C60901RbG(instagramARClassBenchmark, newInstance, j);
            C1GJ.A06(A07, 813, 3, false, false);
        } catch (Exception e) {
            r7.A02.A02.EmP("InstagramARClassBenchmark", "AR Class benchmark instance creation failed.", e);
        }
    }
}
