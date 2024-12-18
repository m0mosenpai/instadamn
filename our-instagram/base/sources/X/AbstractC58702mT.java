package X;

import com.facebook.common.callercontext.CallerContext;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.client.HttpResponseException;

/* renamed from: X.2mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58702mT extends AbstractC58712mU {
    public CallerContext A00;
    public String A01;
    public final int A02;
    public final Executor A05;
    public volatile Object A08;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public final Queue A04 = new ConcurrentLinkedQueue();
    public final AtomicInteger A06 = new AtomicInteger();
    public final AtomicReference A07 = new AtomicReference();

    public static final void A01(AbstractC58702mT abstractC58702mT) {
        if (abstractC58702mT.A06.get() <= 0 && abstractC58702mT.A08 != null) {
            synchronized (abstractC58702mT.A07) {
                if (abstractC58702mT.A08 != null) {
                    abstractC58702mT.A08 = null;
                }
            }
        }
    }

    @Override // X.AbstractC58712mU
    public final void A03(C1W1 c1w1) {
        boolean A00 = C1EM.A00(c1w1, null, this.A07);
        Throwable A03 = c1w1.A03();
        if (A03 instanceof HttpResponseException) {
            ((HttpResponseException) A03).getStatusCode();
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                AbstractC58672mQ abstractC58672mQ = (AbstractC58672mQ) ((Reference) it.next()).get();
                if (abstractC58672mQ == null) {
                    it.remove();
                } else {
                    AbstractC58672mQ.A00(abstractC58672mQ);
                    if (A00) {
                        Map map = JYX.A00;
                        synchronized (map) {
                            map.remove(abstractC58672mQ);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public AbstractC58702mT(Executor executor, int i) {
        this.A02 = i;
        this.A05 = executor;
    }
}
