package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* loaded from: classes11.dex */
public final class V6L extends AbstractRunnableC14200nk {
    public final /* synthetic */ C69550VrE A00;
    public final /* synthetic */ C66053Tyq A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6L(C69550VrE c69550VrE, C66053Tyq c66053Tyq) {
        super(1132146482, 2, false, true);
        this.A01 = c66053Tyq;
        this.A00 = c69550VrE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock writeLock;
        try {
            C66053Tyq c66053Tyq = this.A01;
            C121125e6 c121125e6 = c66053Tyq.A07;
            C69550VrE c69550VrE = this.A00;
            if (c121125e6.A01) {
                writeLock = c121125e6.A00.readLock();
            } else {
                writeLock = c121125e6.A00.writeLock();
            }
            if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    try {
                        C66054Tyr c66054Tyr = c66053Tyq.A03;
                        C66053Tyq.A01(c66054Tyr.A01(), c66053Tyq);
                        c66054Tyr.A00.A00();
                        Map all = c66054Tyr.A01.getAll();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator A15 = AbstractC166997dE.A15(all);
                        while (A15.hasNext()) {
                            Map.Entry entry = (Map.Entry) A15.next();
                            String str = (String) entry.getKey();
                            C14360o3.A0A(str);
                            if (AbstractC002300n.A0h(str, "thread:", false)) {
                                AbstractC43594JPz.A1S(linkedHashMap, entry);
                            }
                        }
                        Collection values = linkedHashMap.values();
                        ArrayList A0q = AbstractC167017dG.A0q(values);
                        for (Object obj : values) {
                            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                            A0q.add(AbstractC121365ec.parseFromJson(C16V.A00((String) obj)));
                        }
                        c66053Tyq.A00 = AbstractC31173DnH.A0L(A0q);
                        c69550VrE.A00();
                    } catch (Throwable th) {
                        writeLock.unlock();
                        throw th;
                    }
                } catch (IOException e) {
                    C0w9.A06(C66053Tyq.A0B, "Error while deserializing user", e);
                    C66053Tyq.A02(c69550VrE, c66053Tyq);
                }
                writeLock.unlock();
            }
        } catch (InterruptedException e2) {
            C0K8.A0F(C66053Tyq.A0B, "Unable to acquire lock for executing this block.", e2);
        }
    }
}
