package X;

import android.util.LruCache;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.JSw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43664JSw implements XF4 {
    public final LruCache A00;
    public final JT0 A01;
    public final C43666JSy A02;
    public final C43661JSt A03;
    public final Executor A04;
    public final C43667JSz A05;

    public static final AnonymousClass600 A00(XP9 xp9, C43658JSq c43658JSq, AbstractC43664JSw abstractC43664JSw, ListenableFuture listenableFuture, String str, Map map, boolean z) {
        C44239Jgj c44239Jgj = new C44239Jgj(xp9, abstractC43664JSw);
        Executor executor = abstractC43664JSw.A04;
        ListenableFuture[] listenableFutureArr = {AbstractRunnableC133325zz.A01(c44239Jgj, listenableFuture, executor), AbstractRunnableC133325zz.A01(new C44240Jgk(xp9, c43658JSq, abstractC43664JSw, str, map, z), listenableFuture, executor)};
        C25051Kj c25051Kj = C1LT.A03;
        return AbstractRunnableC133325zz.A01(new C43624JRh(0, C44241Jgl.A00), new C43659JSr(ImmutableList.copyOf(listenableFutureArr), true), executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.K5x, X.1Ke, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.common.util.concurrent.ListenableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.common.util.concurrent.ListenableFuture A01(X.XP9 r24, X.C43658JSq r25, X.AbstractC43664JSw r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43664JSw.A01(X.XP9, X.JSq, X.JSw, java.lang.String, java.lang.String, java.lang.String, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    public AbstractC43664JSw(LruCache lruCache, JT0 jt0, C43666JSy c43666JSy, C43667JSz c43667JSz, C43661JSt c43661JSt, Executor executor) {
        this.A05 = c43667JSz;
        this.A02 = c43666JSy;
        this.A03 = c43661JSt;
        this.A04 = executor;
        this.A00 = lruCache;
        this.A01 = jt0;
    }
}
