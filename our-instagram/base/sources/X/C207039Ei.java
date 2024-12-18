package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207039Ei extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207039Ei(Object obj, long j, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        QuickPerformanceLogger quickPerformanceLogger;
        int hashCode;
        long j;
        TimeUnit timeUnit;
        C16920sk A0E;
        int i;
        short s;
        UserSession userSession;
        Context context;
        C40Y A00;
        C901940c c901940c;
        boolean z;
        switch (this.A00) {
            case 0:
                C6PU c6pu = (C6PU) this.A02;
                quickPerformanceLogger = c6pu.A01;
                hashCode = c6pu.A00.hashCode();
                j = this.A01;
                timeUnit = TimeUnit.NANOSECONDS;
                A0E = AbstractC06930Yk.A0E();
                i = 51511298;
                s = 4;
                C139446Sz.A04(quickPerformanceLogger, A0E, timeUnit, i, hashCode, j, s);
                break;
            case 1:
                C6PU c6pu2 = (C6PU) this.A02;
                QuickPerformanceLogger quickPerformanceLogger2 = c6pu2.A01;
                C9H8 c9h8 = c6pu2.A00;
                int hashCode2 = c9h8.hashCode();
                long j2 = this.A01;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                HashMap hashMap = new HashMap();
                hashMap.put(AbstractC50531MSk.A02(32, 10, 12), c9h8.A05);
                hashMap.put("client_name", c9h8.A02);
                hashMap.put("placement", c9h8.A04);
                hashMap.put("template_name", c9h8.A06);
                hashMap.put("logging_info", c9h8.A03);
                hashMap.put(TraceFieldType.ContentLength, String.valueOf(c9h8.A01));
                hashMap.put("custom_logging_info", c6pu2.A02.A00());
                C139446Sz.A03(quickPerformanceLogger2, hashMap, timeUnit2, 51511298, hashCode2, j2);
                break;
            case 2:
                C6PU c6pu3 = (C6PU) this.A02;
                quickPerformanceLogger = c6pu3.A01;
                hashCode = c6pu3.A00.hashCode();
                j = this.A01;
                timeUnit = TimeUnit.NANOSECONDS;
                A0E = AbstractC06930Yk.A0E();
                i = 51511298;
                s = 2;
                C139446Sz.A04(quickPerformanceLogger, A0E, timeUnit, i, hashCode, j, s);
                break;
            case 3:
                super/*X.1S9*/.onFirstByteFlushed(this.A01);
                break;
            case 4:
                C62912tU c62912tU = (C62912tU) this.A02;
                c62912tU.A00 = AFT.A00();
                c62912tU.A01 = Long.valueOf(this.A01);
                break;
            case 5:
                C62912tU c62912tU2 = (C62912tU) this.A02;
                C9ZS A002 = AFT.A00();
                C9ZS c9zs = c62912tU2.A00;
                Long l = c62912tU2.A01;
                if (c9zs != null && A002 != null && l != null) {
                    long j3 = A002.A01 - c9zs.A01;
                    long j4 = A002.A02 - c9zs.A02;
                    long j5 = A002.A03 - c9zs.A03;
                    C006802i c006802i = c62912tU2.A02;
                    long j6 = this.A01;
                    c006802i.A0e(725683882, l.longValue());
                    c006802i.markerAnnotate(725683882, "cpu_time", j3);
                    c006802i.markerAnnotate(725683882, "timeslices_count", j5);
                    c006802i.markerAnnotate(725683882, "waiting_time", j4);
                    c006802i.markerAnnotate(725683882, "context", c62912tU2.A03);
                    c006802i.markerEnd(725683882, (short) 2, j6, TimeUnit.MILLISECONDS);
                    break;
                }
                break;
            case 6:
                C60302pD c60302pD = (C60302pD) this.A02;
                userSession = c60302pD.A02;
                context = c60302pD.A00;
                A00 = C40Y.A00(context, userSession);
                long j7 = this.A01;
                c901940c = new C901940c(C4Mk.A04.A01, R.id.background_prefetch_job_scheduler_id);
                z = true;
                c901940c.A05 = true;
                c901940c.A00 = 1;
                c901940c.A02 = j7;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36315288519314569L) && !C18U.A06(c06090Tz, userSession, 36316203346890875L)) {
                    z = false;
                }
                c901940c.A06 = z;
                A00.A03(context, userSession, new C902040d(c901940c));
                break;
            default:
                C60302pD c60302pD2 = (C60302pD) this.A02;
                userSession = c60302pD2.A02;
                context = c60302pD2.A00;
                A00 = C40Y.A00(context, userSession);
                long j8 = this.A01;
                c901940c = new C901940c(C4Mk.A06.A01, R.id.story_background_prefetch_job_scheduler_id);
                c901940c.A05 = true;
                c901940c.A00 = 1;
                c901940c.A02 = j8;
                z = C18U.A06(C06090Tz.A05, userSession, 36316203346890875L);
                c901940c.A06 = z;
                A00.A03(context, userSession, new C902040d(c901940c));
                break;
        }
        return C0eB.A00;
    }
}
