package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public final class OLA {
    public AH6 A00;
    public boolean A01;
    public final C4RG A02;
    public final C55332Ogv A03;
    public final C4RB A04;
    public final AtomicInteger A05 = MSW.A1C(1);
    public final AtomicReference A06;
    public final Handler A07;
    public final HeroPlayerSetting A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final ReentrantLock A0B;
    public volatile int A0C;

    public OLA(Handler handler, C4RG c4rg, C4RP c4rp, C4RB c4rb, HeroPlayerSetting heroPlayerSetting) {
        this.A07 = handler;
        this.A02 = c4rg;
        AtomicReference atomicReference = new AtomicReference(EnumC53177NfZ.A08);
        this.A06 = atomicReference;
        this.A03 = new C55332Ogv(c4rp, atomicReference);
        this.A08 = heroPlayerSetting;
        this.A04 = c4rb;
        this.A0B = new ReentrantLock();
        this.A0A = new PLD(this);
        this.A09 = new PLC(this);
    }

    public final void A00() {
        if (!this.A01) {
            return;
        }
        try {
            ReentrantLock reentrantLock = this.A0B;
            boolean tryLock = reentrantLock.tryLock(1L, TimeUnit.SECONDS);
            try {
                this.A09.run();
            } finally {
                if (tryLock) {
                    reentrantLock.unlock();
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void A01() {
        if (!this.A01) {
            ReentrantLock reentrantLock = this.A0B;
            reentrantLock.lock();
            try {
                this.A0A.run();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
