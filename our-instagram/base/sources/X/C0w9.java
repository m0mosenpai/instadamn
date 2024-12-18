package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: X.0w9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0w9 implements C0Gd {
    public static C0Gd A00;
    public static final C0w9 A01 = new Object();

    @Deprecated
    public static final void A01(EnumC12410kj enumC12410kj, String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C0Gd A002 = A00();
        Integer num = enumC12410kj.A00;
        if (num == null) {
            num = C05F.A00;
        }
        A002.EHD(str, num, str2);
    }

    @Deprecated
    public static final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmN(str, str2);
    }

    @Deprecated
    public static final void A04(String str, String str2, int i) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmO(str, str2, i);
    }

    @Deprecated
    public static final void A05(String str, String str2, int i, Throwable th) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmT(str, str2, i, th);
    }

    @Deprecated
    public static final void A06(String str, String str2, Throwable th) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmP(str, str2, th);
    }

    @Deprecated
    public static final void A07(String str, Throwable th) {
        C14360o3.A0B(str, 0);
        A00().EmQ(str, th);
    }

    @Deprecated
    public static final void A08(String str, Throwable th) {
        A00().EmR(str, th, 1);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EHC(Integer num, String str, String str2, Throwable th) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(str2, 2);
        A00().EHC(num, str, str2, th);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EHD(String str, Integer num, String str2) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(str2, 2);
        A00().EHD(str, num, str2);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmM(C0Gf c0Gf) {
        C14360o3.A0B(c0Gf, 0);
        A00().EmM(c0Gf);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmN(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmN(str, str2);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmO(String str, String str2, int i) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmO(str, str2, i);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmP(String str, String str2, Throwable th) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmP(str, str2, th);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmQ(String str, Throwable th) {
        C14360o3.A0B(str, 0);
        A00().EmQ(str, th);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmR(String str, Throwable th, int i) {
        A00().EmR(str, th, 1);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmT(String str, String str2, int i, Throwable th) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A00().EmT(str, str2, i, th);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmW(String str, String str2) {
        C14360o3.A0B(str2, 1);
        A00().EmW(str, str2);
    }

    public static final C0Gd A00() {
        C0Gd c0Gd = A00;
        if (c0Gd == null) {
            synchronized (C12400ki.class) {
                if (C12400ki.A00 == null) {
                    C12400ki.A00 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.0kh
                        public final AtomicInteger A00 = new AtomicInteger(1);

                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new Thread(runnable, AnonymousClass001.A0O("ErrorReportingThread-", this.A00.getAndIncrement()));
                        }
                    });
                }
            }
            C04380Le c04380Le = new C04380Le(C12400ki.A00);
            A00 = c04380Le;
            return c04380Le;
        }
        return c0Gd;
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmX(String str, String str2, Throwable th) {
        C14360o3.A0B(str, 0);
        A00().EmX(str, "Choreographer reflection failed.", th);
    }

    @Deprecated
    public static final void A02(EnumC12410kj enumC12410kj, String str, String str2, Throwable th) {
        C0Gd A002 = A00();
        Integer num = enumC12410kj.A00;
        if (num == null) {
            num = C05F.A00;
        }
        A002.EHC(num, str, str2, th);
    }

    @Override // X.C0Gd
    public final void EHm(Throwable th) {
        A00().EHm(th);
    }

    @Override // X.C0Gd
    @Deprecated
    public final void EmY(String str, Throwable th) {
        A00().EmY(str, th);
    }
}
