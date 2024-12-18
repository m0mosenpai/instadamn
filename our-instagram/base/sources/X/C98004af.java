package X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.4af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98004af implements InterfaceC96934Xd {
    public static final C98014ag A04 = new C98014ag(2, -9223372036854775807L);
    public static final C98014ag A05 = new C98014ag(3, -9223372036854775807L);
    public C2A4 A00;
    public HandlerC98524bV A01;
    public IOException A02;
    public final ExecutorService A03;

    public final void A01(Looper looper, C4YW c4yw, InterfaceC98244b3 interfaceC98244b3, int i) {
        C4B8.A04(looper != null);
        this.A02 = null;
        HandlerC98524bV handlerC98524bV = new HandlerC98524bV(looper, c4yw, interfaceC98244b3, this, i, SystemClock.elapsedRealtime());
        C98004af c98004af = handlerC98524bV.A0A;
        boolean z = false;
        if (c98004af.A01 == null) {
            z = true;
        }
        C4B8.A04(z);
        c98004af.A01 = handlerC98524bV;
        HandlerC98524bV.A00(handlerC98524bV);
    }

    public final void A00() {
        HandlerC98524bV handlerC98524bV = this.A01;
        C4B8.A01(handlerC98524bV);
        handlerC98524bV.A01(false);
    }

    public final void A03(final C4YX c4yx) {
        HandlerC98524bV handlerC98524bV = this.A01;
        if (handlerC98524bV != null) {
            handlerC98524bV.A01(true);
        }
        if (c4yx != null) {
            this.A03.execute(new Runnable(c4yx) { // from class: X.5gU
                public final C4YX A00;

                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.DQ5();
                }

                {
                    this.A00 = c4yx;
                }
            });
        }
        this.A03.shutdown();
    }

    @Override // X.InterfaceC96934Xd
    public final void Coy() {
        IOException iOException = this.A02;
        if (iOException == null) {
            HandlerC98524bV handlerC98524bV = this.A01;
            if (handlerC98524bV != null) {
                int i = handlerC98524bV.A06;
                IOException iOException2 = handlerC98524bV.A02;
                if (iOException2 != null && handlerC98524bV.A00 > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public C98004af(final String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: X.4ah
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
        C14360o3.A07(newSingleThreadExecutor);
        this.A03 = newSingleThreadExecutor;
        C2C5.A02(C2C1.A10);
    }

    public final void A02(C4YW c4yw, InterfaceC98244b3 interfaceC98244b3, int i) {
        Looper myLooper = Looper.myLooper();
        C4B8.A01(myLooper);
        A01(myLooper, c4yw, interfaceC98244b3, i);
    }
}
