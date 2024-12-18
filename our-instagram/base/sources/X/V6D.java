package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes11.dex */
public final class V6D extends AbstractRunnableC14200nk {
    public final /* synthetic */ C4AV A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6D(C4AV c4av) {
        super(804, 3, false, false);
        this.A00 = c4av;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Comparator] */
    @Override // java.lang.Runnable
    public final void run() {
        C4AV c4av = this.A00;
        C11T.A05("This operation can't be run on UI thread.");
        long currentTimeMillis = System.currentTimeMillis();
        C1UM c1um = c4av.A00.A00;
        HashMap Aax = c1um.Aax();
        C14360o3.A0C(Aax, AbstractC58317Pt9.A00(888));
        HashMap hashMap = new HashMap();
        Iterator A14 = AbstractC166997dE.A14(Aax);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            if (entry.getValue() instanceof Long) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                C14360o3.A0C(value, AbstractC111324zv.A00(10));
                hashMap.put(key, value);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("found non-long value: ");
                sb.append((String) entry.getKey());
                sb.append(':');
                C0w9.A03("IgCacheExpirationStore", AbstractC166997dE.A0v(entry.getValue(), sb));
                C1ZT AR9 = c1um.AR9();
                AR9.A06((String) entry.getKey());
                AR9.A03();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator A142 = AbstractC166997dE.A14(hashMap);
        while (A142.hasNext()) {
            Map.Entry entry2 = (Map.Entry) A142.next();
            Object key2 = entry2.getKey();
            long longValue = ((Number) entry2.getValue()).longValue();
            if (longValue > 0 && longValue < Long.MAX_VALUE && longValue < currentTimeMillis) {
                arrayList.add(key2);
            }
        }
        if (!arrayList.isEmpty()) {
            C2BZ c2bz = c4av.A01.A00.A06;
            if (c2bz != null) {
                c2bz.A06(arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String A0Q = AbstractC167027dH.A0Q(it.next());
                C1ZT AR92 = c1um.AR9();
                AR92.A06(A0Q);
                AR92.A03();
            }
        }
        C11T.A05("This operation can't be run on UI thread.");
        if (c1um.getSize() > 1000) {
            java.util.Set entrySet = c1um.Aax().entrySet();
            C14360o3.A0C(entrySet, "null cannot be cast to non-null type java.util.Collection<kotlin.collections.Map.Entry<kotlin.String, kotlin.Long>>");
            PriorityQueue priorityQueue = new PriorityQueue(entrySet.size(), new Object());
            AnonymousClass016.A16(entrySet, priorityQueue);
            C1ZT AR93 = c1um.AR9();
            long size = entrySet.size() - 1000;
            for (long j = 0; j < size; j++) {
                Map.Entry entry3 = (Map.Entry) priorityQueue.remove();
                if (entry3 != null) {
                    AR93.A06((String) entry3.getKey());
                }
            }
            AR93.A03();
        }
    }
}
