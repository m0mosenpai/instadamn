package X;

import android.os.Process;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.systrace.Systrace;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5e4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5e4 implements InterfaceC13000lm {
    public static boolean A02;
    public final BanyanCoordinator A00;
    public final InterfaceC09390do A01;

    public C5e4(UserSession userSession, boolean z) {
        Lock writeLock;
        C14360o3.A0B(userSession, 1);
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A03, new C9EI(userSession, 33));
        AwakeTimeSinceBootClock.INSTANCE.now();
        BanyanCoordinator banyanCoordinator = new BanyanCoordinator(userSession);
        this.A00 = banyanCoordinator;
        if (z) {
            banyanCoordinator.A0A();
        } else {
            final boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327486225594998L);
            C1GJ.A06(new C121275eQ(new Callable(this) { // from class: X.5eP
                public final /* synthetic */ C5e4 A00;

                {
                    this.A00 = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* bridge */ /* synthetic */ Object call() {
                    BanyanCoordinator banyanCoordinator2;
                    if (!A06) {
                        banyanCoordinator2 = this.A00.A00;
                    } else {
                        C5e4 c5e4 = this.A00;
                        int threadPriority = Process.getThreadPriority(Process.myTid());
                        if (0 >= threadPriority) {
                            banyanCoordinator2 = c5e4.A00;
                        } else {
                            if (Systrace.A0E(1L)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(AbstractC43591JPw.A00(29));
                                sb.append((Object) 0);
                                C0fO.A01(sb.toString(), -354609198);
                            }
                            Process.setThreadPriority(0);
                            try {
                                c5e4.A00.A0A();
                                Process.setThreadPriority(threadPriority);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-96062548);
                                }
                                return C0eB.A00;
                            } catch (Throwable th) {
                                Process.setThreadPriority(threadPriority);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-1377413530);
                                }
                                throw th;
                            }
                        }
                    }
                    banyanCoordinator2.A0A();
                    return C0eB.A00;
                }
            }, 1967622104), 1967622104, 2, A06, false);
        }
        try {
            C121125e6 c121125e6 = banyanCoordinator.A09;
            if (c121125e6.A01) {
                writeLock = c121125e6.A00.readLock();
            } else {
                writeLock = c121125e6.A00.writeLock();
            }
        } catch (IOException | InterruptedException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
        if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
            try {
                if (!banyanCoordinator.A04) {
                    C25671My A00 = AbstractC25651Mw.A00(banyanCoordinator.A0I);
                    A00.A01(banyanCoordinator.A0F, C42281xI.class);
                    A00.A01(banyanCoordinator.A0H, C121285eR.class);
                    A00.A01(banyanCoordinator.A0G, C3MC.class);
                    A00.A01(banyanCoordinator.A0E, C48032Iq.class);
                    A00.A01(banyanCoordinator.A0D, C121295eS.class);
                    A00.A01(banyanCoordinator.A0C, C2IP.class);
                    banyanCoordinator.A04 = true;
                }
                writeLock.unlock();
                A02 = true;
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        }
    }

    public final C121305eT A01(String str) {
        C121305eT A07;
        C14360o3.A0B(str, 0);
        if (A00(this)) {
            synchronized (this) {
                A07 = this.A00.A07(str);
            }
            return A07;
        }
        return this.A00.A07(str);
    }

    public static final boolean A00(C5e4 c5e4) {
        Object value = c5e4.A01.getValue();
        C14360o3.A07(value);
        return ((Boolean) value).booleanValue();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A0H(false);
    }

    public final C121305eT A02(String str, String str2, String str3, java.util.Set set, java.util.Set set2) {
        C121305eT A00;
        if (A00(this)) {
            synchronized (this) {
                A00 = BanyanCoordinator.A00(this.A00, str, str2, str3, set, set2);
            }
            return A00;
        }
        return BanyanCoordinator.A00(this.A00, str, str2, str3, set, set2);
    }

    public final String A03(String str) {
        String A09;
        if (A00(this)) {
            synchronized (this) {
                A09 = this.A00.A09(str);
            }
            return A09;
        }
        return this.A00.A09(str);
    }

    public final void A04(C122045fw c122045fw, boolean z) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0C(c122045fw, "", z);
            }
        } else {
            this.A00.A0C(c122045fw, "", z);
        }
    }

    public final void A05(String str) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0D(str);
            }
        } else {
            this.A00.A0D(str);
        }
    }

    public final void A06(String str) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0E(str);
            }
        } else {
            this.A00.A0E(str);
        }
    }

    public final void A07(String str) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0F(str);
            }
        } else {
            this.A00.A0F(str);
        }
    }

    public final void A08(ArrayList arrayList) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0G(arrayList);
            }
        } else {
            this.A00.A0G(arrayList);
        }
    }
}
