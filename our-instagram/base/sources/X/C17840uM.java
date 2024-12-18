package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0uM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17840uM implements InterfaceC17670u3 {
    public final UserSession A00;
    public final File A01;
    public final InterfaceC14020nS A03;
    public final AtomicInteger A02 = new AtomicInteger();
    public final Object A04 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (0 == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C17840uM r6, java.util.Set r7) {
        /*
            X.0vz r0 = X.AbstractC12960li.A00
            X.18s r3 = X.C226218q.A01(r0)
            java.lang.String r1 = "FEED_SEEN_STATE_PERFORM_READ_START"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r3.A02
            r3.A0P(r0, r1)
            r5 = 0
            java.lang.Object r4 = r6.A04     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6a
            monitor-enter(r4)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6a
            java.io.File r2 = r6.A01()     // Catch: java.lang.Throwable -> L54
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L52
            boolean r0 = r2.canRead()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L52
            java.lang.String r1 = "FEED_SEEN_STATE_PARSE_START"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r3.A02     // Catch: java.lang.Throwable -> L54
            r3.A0P(r0, r1)     // Catch: java.lang.Throwable -> L54
            com.instagram.common.session.UserSession r1 = r6.A00     // Catch: java.lang.Throwable -> L54
            X.0b8 r0 = X.C07950bF.A04     // Catch: java.lang.Throwable -> L54
            r0 = 0
            X.C14360o3.A0B(r1, r0)     // Catch: java.lang.Throwable -> L54
            X.15v r0 = X.AbstractC221915u.A00     // Catch: java.lang.Throwable -> L54
            X.16L r0 = r0.A00(r2)     // Catch: java.lang.Throwable -> L54
            X.0bF r0 = X.C07880b8.A00(r0, r1)     // Catch: java.lang.Throwable -> L54
            r0.A1J()     // Catch: java.lang.Throwable -> L54
            r5 = r0
            X.0rY r2 = X.AbstractC16290ra.parseFromJson(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "FEED_SEEN_STATE_PARSE_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r3.A02     // Catch: java.lang.Throwable -> L54
            r3.A0P(r0, r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L5f
            java.util.List r0 = r2.A00     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6a
            r7.addAll(r0)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6a
            goto L5f
        L52:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L6a
        L57:
            r1 = move-exception
            java.lang.String r0 = "JsonFileStoreAdapter"
            X.C0w9.A07(r0, r1)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L62
        L5f:
            r5.close()     // Catch: java.io.IOException -> L62
        L62:
            java.lang.String r1 = "FEED_SEEN_STATE_PERFORM_READ_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r3.A02
            r3.A0P(r0, r1)
            return
        L6a:
            r0 = move-exception
            if (r5 == 0) goto L70
            r5.close()     // Catch: java.io.IOException -> L70
        L70:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17840uM.A00(X.0uM, java.util.Set):void");
    }

    public final File A01() {
        return new File(this.A01, String.format(Locale.US, "%s_ViewInfoStore.json", this.A00.userId));
    }

    @Override // X.InterfaceC17670u3
    public final java.util.Set E7s() {
        final HashSet hashSet = new HashSet();
        if (C18U.A06(C06090Tz.A05, this.A00, 2342170117481183537L)) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.A03.ATO(new AbstractRunnableC14200nk() { // from class: X.0uN
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(129, 1, false, true);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C17840uM.A00(C17840uM.this, hashSet);
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
                return hashSet;
            } catch (InterruptedException e) {
                C0w9.A07("JsonFileStoreAdapter", e);
                return hashSet;
            }
        }
        A00(this, hashSet);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.0rY] */
    @Override // X.InterfaceC17670u3
    public final void FEL(java.util.Set set) {
        C120295cS A07;
        UserSession userSession = this.A00;
        if (!C18U.A06(C06090Tz.A05, userSession, 36328057456442451L)) {
            C11T.A05("This operation can't be run on UI thread.");
        }
        File file = new File(this.A01, String.format(Locale.US, "%s_ViewInfoStore.json.%d", userSession.userId, Integer.valueOf(this.A02.getAndIncrement())));
        try {
            try {
                try {
                    A07 = AbstractC221915u.A00.A07(file, C05F.A00);
                } catch (IOException e) {
                    C0w9.A07("JsonFileStoreAdapter", e);
                    if (!file.exists()) {
                        return;
                    }
                }
                try {
                    ArrayList arrayList = new ArrayList(set);
                    ?? obj = new Object();
                    obj.A00 = arrayList;
                    AbstractC16290ra.A00(A07, obj);
                    A07.flush();
                    synchronized (this.A04) {
                        if (!file.renameTo(A01())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unable to rename ");
                            sb.append(file);
                            sb.append(" to ");
                            sb.append(A01());
                            throw new IOException(sb.toString());
                        }
                    }
                    A07.close();
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable th) {
                    try {
                        A07.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (SecurityException unused) {
            }
        } catch (Throwable th3) {
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (SecurityException unused2) {
            }
            throw th3;
        }
    }

    public C17840uM(Context context, UserSession userSession, InterfaceC14020nS interfaceC14020nS) {
        this.A00 = userSession;
        this.A01 = context.getCacheDir();
        this.A03 = interfaceC14020nS;
    }
}
