package X;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sdx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63150Sdx {
    public static final WeakHashMap A06 = new WeakHashMap();
    public final WeakReference A04;
    public final java.util.Set A03 = new CopyOnWriteArraySet();
    public final AtomicInteger A05 = AbstractC58319PtB.A16();
    public final java.util.Set A02 = new CopyOnWriteArraySet();
    public final Map A01 = AbstractC58318PtA.A14();
    public final SparseArray A00 = AbstractC58318PtA.A0G();

    public static C63150Sdx A00(Q21 q21) {
        WeakHashMap weakHashMap = A06;
        C63150Sdx c63150Sdx = (C63150Sdx) weakHashMap.get(q21);
        if (c63150Sdx == null) {
            C63150Sdx c63150Sdx2 = new C63150Sdx(q21);
            weakHashMap.put(q21, c63150Sdx2);
            return c63150Sdx2;
        }
        return c63150Sdx;
    }

    public C63150Sdx(Q21 q21) {
        this.A04 = AbstractC25225BEi.A16(q21);
    }
}
