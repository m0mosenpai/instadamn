package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.7qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C175087qi {
    public InterfaceC175367rC A00;
    public Condition A02;
    public long A01 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
    public final ReentrantLock A03 = new ReentrantLock();

    public final void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            try {
                Condition condition = this.A02;
                if (condition != null) {
                    condition.await(this.A01, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Operation blocker interrupted. ", e);
            }
        } finally {
            if (this.A02 != null) {
                this.A02 = null;
                InterfaceC175367rC interfaceC175367rC = this.A00;
                if (interfaceC175367rC != null) {
                    interfaceC175367rC.DtK();
                }
            }
            reentrantLock.unlock();
        }
    }

    public final void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public final void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j <= 0) {
                j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            }
            this.A01 = j;
            reentrantLock.unlock();
            return;
        }
        throw new IllegalStateException("There is already a block condition being used.");
    }
}
