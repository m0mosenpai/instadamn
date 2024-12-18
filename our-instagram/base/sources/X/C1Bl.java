package X;

import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.1Bl, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Bl {
    /* JADX WARN: Type inference failed for: r6v0, types: [X.1Bo, java.lang.Object, X.1Bn] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.1Bn] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.1Bq, java.lang.Object, X.1Bn] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1Bm] */
    public static final C23301Br A00() {
        String A03 = C20150ym.A03(AbstractC20070ye.A00(18858857799942145L));
        boolean A07 = C20150ym.A07(AbstractC20070ye.A00(18295907846717450L));
        String A032 = C20150ym.A03(AbstractC20070ye.A00(18858857800204290L));
        String A033 = C20150ym.A03(AbstractC20070ye.A00(18858857800269827L));
        String A034 = C20150ym.A03(AbstractC20070ye.A00(18858857799811072L));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        ?? r9 = new Object() { // from class: X.1Bm
        };
        Random random = new Random();
        if (A03 != null) {
            if (A032 != null) {
                if (A033 != null) {
                    ?? obj = new Object();
                    obj.A02 = A03;
                    obj.A03 = A034;
                    obj.A04 = A07;
                    obj.A00 = A032;
                    obj.A01 = A033;
                    ?? obj2 = new Object();
                    obj2.A02 = A03;
                    obj2.A03 = "";
                    obj2.A04 = A07;
                    obj2.A00 = A032;
                    obj2.A01 = A033;
                    obj2.A02 = A03;
                    obj2.A03 = "";
                    ?? obj3 = new Object();
                    obj3.A02 = A03;
                    obj3.A03 = "";
                    obj3.A04 = A07;
                    obj3.A00 = A032;
                    obj3.A01 = A033;
                    obj3.A02 = A03;
                    obj3.A03 = "";
                    return new C23301Br(obj2, obj, obj3, r9, random, scheduledThreadPoolExecutor);
                }
                throw new NullPointerException("mSonar6Host == null");
            }
            throw new NullPointerException("mSonarHost == null");
        }
        throw new NullPointerException("mSonarProberEndpoint == null");
    }
}
