package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5S7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S7 {
    public static final C5S8 A02 = new Object();
    public List A00;
    public final Map A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4NQ] */
    public C5S7(C5S7 c5s7) {
        C14360o3.A0B(c5s7, 1);
        this.A00 = new ArrayList();
        this.A01 = Collections.synchronizedMap(new HashMap());
        synchronized (c5s7) {
            List<C4NQ> list = c5s7.A00;
            C14360o3.A0A(list);
            for (C4NQ c4nq : list) {
                C14360o3.A0B(c4nq, 1);
                ?? obj = new Object();
                obj.A05 = new ArrayList();
                obj.A06 = new ArrayList();
                obj.A04 = new ArrayList();
                obj.A03 = new ArrayList();
                obj.A07 = new ArrayList();
                synchronized (c4nq) {
                    obj.A01 = c4nq.A01;
                    obj.A02 = c4nq.A02;
                    obj.A05 = c4nq.A05;
                    obj.A06 = c4nq.A06;
                    obj.A04 = c4nq.A04;
                    obj.A00 = c4nq.A00;
                    obj.A03 = c4nq.A03;
                }
                synchronized (this) {
                    A00(obj, this, C5S8.A00(obj));
                }
            }
        }
    }

    public static final synchronized void A00(C4NQ c4nq, C5S7 c5s7, String str) {
        synchronized (c5s7) {
            C4NQ c4nq2 = (C4NQ) c5s7.A01.put(str, c4nq);
            if (c4nq2 != null) {
                List list = c5s7.A00;
                C14360o3.A0A(list);
                list.remove(c4nq2);
            }
            List list2 = c5s7.A00;
            C14360o3.A0A(list2);
            list2.add(c4nq);
        }
    }

    public C5S7() {
        this.A00 = new ArrayList();
        this.A01 = Collections.synchronizedMap(new HashMap());
    }
}
