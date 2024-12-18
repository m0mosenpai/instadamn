package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.ABo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22989ABo {
    public final InterfaceC16660sJ A05;
    public final InterfaceC16620sF A06;
    public final InterfaceC16660sJ A07;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public AtomicInteger A00 = new AtomicInteger(0);
    public AtomicInteger A02 = new AtomicInteger(0);
    public AtomicInteger A01 = new AtomicInteger(0);
    public AtomicLong A03 = new AtomicLong(0);

    public final void A00() {
        ConcurrentHashMap concurrentHashMap = this.A04;
        Iterator A0t = AbstractC167017dG.A0t(concurrentHashMap);
        while (A0t.hasNext()) {
            AbstractCollection abstractCollection = (AbstractCollection) A0t.next();
            C14360o3.A0A(abstractCollection);
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                this.A07.invoke(it.next());
            }
        }
        concurrentHashMap.clear();
    }

    public C22989ABo(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF) {
        this.A06 = interfaceC16620sF;
        this.A05 = interfaceC16660sJ;
        this.A07 = interfaceC16660sJ2;
    }
}
