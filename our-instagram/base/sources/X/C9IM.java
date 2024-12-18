package X;

import android.util.LruCache;

/* renamed from: X.9IM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9IM extends LruCache {
    public final int A00 = 1;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9IM(AGE age) {
        super(99);
        this.A01 = age;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.9vX, java.lang.Object] */
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C9IB c9ib;
        if (this.A00 != 0) {
            C124005jE c124005jE = (C124005jE) obj2;
            AbstractC167017dG.A1P(obj, c124005jE);
            if (z && (c9ib = ((C9IA) this.A01).A00) != null) {
                C170937jk c170937jk = c9ib.A00;
                if (c170937jk.A05) {
                    if (C2XV.A01()) {
                        c124005jE.A04();
                        return;
                    } else {
                        c170937jk.A04.post(new RunnableC24551Au8(c124005jE, c9ib));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!z) {
            return;
        }
        AGE age = (AGE) this.A01;
        AGE.A05.A00("IABTabs.cleanUp.Start");
        synchronized (age) {
            if (age.A00 == null) {
                age.A00 = new Object();
            }
        }
        throw AbstractC166987dD.A18(AbstractC111324zv.A00(87));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9IM(C9IA c9ia) {
        super(4);
        this.A01 = c9ia;
    }
}
