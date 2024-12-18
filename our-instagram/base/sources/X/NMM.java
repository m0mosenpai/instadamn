package X;

import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public final class NMM extends C54779OIt {
    public IgSignalsModelPrediction A00;
    public boolean A01;
    public final List A02;
    public final ReentrantLock A03;

    @Override // X.C54779OIt
    public final void A00(IgSignalsModelPrediction igSignalsModelPrediction) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            this.A00 = igSignalsModelPrediction;
            List list = this.A02;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C54779OIt) it.next()).A00(igSignalsModelPrediction);
            }
            list.clear();
            reentrantLock.unlock();
            super.A00(igSignalsModelPrediction);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public NMM(C52C c52c, InterfaceC108294uG interfaceC108294uG, AbstractC1117051t abstractC1117051t) {
        super(c52c, interfaceC108294uG, abstractC1117051t);
        this.A03 = new ReentrantLock();
        this.A02 = AbstractC166987dD.A1E();
    }
}
