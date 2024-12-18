package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Typ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66052Typ extends AbstractRunnableC14200nk {
    public final /* synthetic */ JR2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66052Typ(JR2 jr2, int i) {
        super(899347975, i, false, false);
        this.A00 = jr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock writeLock;
        Lock writeLock2;
        C65911TwI c65911TwI = this.A00.A0J;
        if (c65911TwI != null) {
            synchronized (c65911TwI) {
                C66053Tyq c66053Tyq = c65911TwI.A00;
                UserSession userSession = c66053Tyq.A08;
                if (C18U.A06(C06090Tz.A06, userSession, 36320403823534523L)) {
                    if (!c66053Tyq.A06) {
                        try {
                            C121125e6 c121125e6 = c66053Tyq.A07;
                            if (c121125e6.A01) {
                                writeLock2 = c121125e6.A00.readLock();
                            } else {
                                writeLock2 = c121125e6.A00.writeLock();
                            }
                            if (writeLock2.tryLock(1L, TimeUnit.SECONDS)) {
                                try {
                                    boolean A1O = AbstractC167007dF.A1O(((AbstractC31177DnL.A06() - c66053Tyq.A03.A02.getLong("last_sync_prompts_timestamp_sec", -1L)) > C18U.A00(C06090Tz.A05, userSession, 37164828753723768L) ? 1 : ((AbstractC31177DnL.A06() - c66053Tyq.A03.A02.getLong("last_sync_prompts_timestamp_sec", -1L)) == C18U.A00(C06090Tz.A05, userSession, 37164828753723768L) ? 0 : -1)));
                                    writeLock2.unlock();
                                    if (A1O) {
                                        C66053Tyq.A03(c66053Tyq);
                                    }
                                } catch (Throwable th) {
                                    writeLock2.unlock();
                                    throw th;
                                }
                            } else {
                                throw new InterruptedException("Failed to claim lock after 1 seconds");
                            }
                        } catch (InterruptedException e) {
                            C0K8.A0F(C66053Tyq.A0B, "Unable to acquire lock for executing this block.", e);
                        }
                    }
                    try {
                        C121125e6 c121125e62 = c66053Tyq.A07;
                        if (c121125e62.A01) {
                            writeLock = c121125e62.A00.readLock();
                        } else {
                            writeLock = c121125e62.A00.writeLock();
                        }
                        if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
                            try {
                                try {
                                    c66053Tyq.A01 = c66053Tyq.A03.A00();
                                } catch (Throwable th2) {
                                    writeLock.unlock();
                                    throw th2;
                                }
                            } catch (IOException e2) {
                                C0w9.A06(C66053Tyq.A0B, "Error while deserializing prompt", e2);
                                C66053Tyq.A03(c66053Tyq);
                            }
                            writeLock.unlock();
                        }
                    } catch (InterruptedException e3) {
                        C0K8.A0F(C66053Tyq.A0B, "Unable to acquire lock for executing this block.", e3);
                    }
                }
            }
        }
    }
}
