package X;

import android.content.Context;
import com.facebook.pando.primaryexecution.cache.PandoResponseCache;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.9Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207119Eq extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207119Eq(int i, Object obj, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Executor executorC14040nU;
        switch (this.A00) {
            case 0:
                C6PU c6pu = (C6PU) this.A01;
                QuickPerformanceLogger quickPerformanceLogger = c6pu.A01;
                int hashCode = c6pu.A00.hashCode();
                Map A0M = AbstractC16850sd.A0M(new C09530e4("parallel_downloads", Integer.valueOf(this.A02 ? 1 : 0)));
                if (C139446Sz.A01.containsKey(new C9B2(51511298, hashCode, 0))) {
                    for (Map.Entry entry : A0M.entrySet()) {
                        quickPerformanceLogger.markerAnnotate(51511298, hashCode, (String) entry.getKey(), ((Number) entry.getValue()).intValue());
                    }
                }
                return C0eB.A00;
            case 1:
            case 2:
            default:
                ((InterfaceC16660sJ) this.A01).invoke(Boolean.valueOf(!this.A02));
                return C0eB.A00;
            case 3:
                C8GR c8gr = (C8GR) this.A01;
                if (c8gr != null) {
                    c8gr.A0A(this.A02);
                }
                return C0eB.A00;
            case 4:
                C65622xy c65622xy = (C65622xy) this.A01;
                Context context = c65622xy.A04;
                C61142qc c61142qc = c65622xy.A07;
                InterfaceC686036x interfaceC686036x = c65622xy.A00;
                if (interfaceC686036x == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                C57332k8 c57332k8 = c65622xy.A09;
                UserSession userSession = c65622xy.A06;
                InterfaceC60442pS interfaceC60442pS = c65622xy.A08;
                return new C693739x(context, userSession, interfaceC686036x, (C691439a) c65622xy.A0C.getValue(), c61142qc, interfaceC60442pS, interfaceC60442pS, c57332k8, (C65502xm) c65622xy.A0D.getValue(), c65622xy.A0A, c65622xy.A0F, this.A02);
            case 5:
                return new C693439u(((AnonymousClass371) this.A01).C9D(), this.A02);
            case 6:
                return AbstractC22726A0w.A00(EnumC71343Hv.A0N, (C75113Zb) this.A01, this.A02);
            case 7:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                boolean z = this.A02;
                C40731ug c40731ug = C40731ug.A00;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, abstractC12990ll, 36317320040158282L)) {
                    executorC14040nU = Executors.newSingleThreadExecutor();
                } else {
                    C13920nI c13920nI = C13920nI.A00;
                    InterfaceC14020nS A00 = C14120nc.A00();
                    C14360o3.A07(A00);
                    C14360o3.A0B(c13920nI, 1);
                    executorC14040nU = new ExecutorC14040nU(new C18220v9(c13920nI, A00), 1795207155, 3, false, true);
                }
                Executor executor = executorC14040nU;
                long A01 = C18U.A01(c06090Tz, abstractC12990ll, 36598795015556397L);
                boolean A06 = C18U.A06(c06090Tz, abstractC12990ll, 36317320039044159L);
                C4Id c4Id = PandoResponseCache.Companion;
                C14360o3.A0A(executor);
                C14360o3.A0B(abstractC12990ll, 0);
                return new PandoResponseCache(executor, ((C93614If) abstractC12990ll.A01(C93614If.class, C93604Ie.A00)).A00, z, (int) A01, A06);
            case 8:
                AbstractC24641Ih.A02.Ep8(new C2N1(new C50168MDv(39, this.A01, this.A02)));
                return C0eB.A00;
        }
    }
}
