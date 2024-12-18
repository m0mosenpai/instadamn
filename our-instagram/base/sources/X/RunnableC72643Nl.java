package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC72643Nl implements Runnable {
    public long A00;
    public long A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public static final ThreadLocal A05 = new ThreadLocal();
    public static Comparator A04 = new Comparator() { // from class: X.3Nm
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C123275i2 c123275i2 = (C123275i2) obj;
            C123275i2 c123275i22 = (C123275i2) obj2;
            RecyclerView recyclerView = c123275i2.A03;
            int i = 1;
            boolean z = false;
            if (recyclerView == null) {
                z = true;
            }
            boolean z2 = false;
            if (c123275i22.A03 == null) {
                z2 = true;
            }
            if (z != z2) {
                if (recyclerView != null) {
                    return -1;
                }
            } else {
                boolean z3 = c123275i2.A04;
                if (z3 != c123275i22.A04) {
                    if (z3) {
                        return -1;
                    }
                } else {
                    i = c123275i22.A02 - c123275i2.A02;
                    if (i == 0) {
                        int i2 = c123275i2.A00 - c123275i22.A00;
                        if (i2 == 0) {
                            return 0;
                        }
                        return i2;
                    }
                }
            }
            return i;
        }
    };

    public static C3OO A00(RecyclerView recyclerView, int i, long j) {
        C3FI c3fi = recyclerView.A08;
        int A042 = c3fi.A04();
        for (int i2 = 0; i2 < A042; i2++) {
            C3OO A052 = RecyclerView.A05(c3fi.A07(i2));
            if (A052.mPosition == i && !A052.isInvalid()) {
                return null;
            }
        }
        C70593Ew c70593Ew = recyclerView.A0y;
        try {
            recyclerView.A01++;
            C3OO A053 = c70593Ew.A05(i, j);
            if (A053 != null) {
                if (A053.isBound() && !A053.isInvalid()) {
                    c70593Ew.A0A(A053.itemView);
                } else {
                    c70593Ew.A0E(A053, false);
                }
            }
            return A053;
        } finally {
            recyclerView.A17(false);
        }
    }

    public final void A01(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.A0T) {
            if (RecyclerView.A1C && !this.A02.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.A01 == 0) {
                this.A01 = System.nanoTime();
                recyclerView.post(this);
            }
        }
        C3F3 c3f3 = recyclerView.A09;
        c3f3.A01 = i;
        c3f3.A02 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long j;
        WeakReference weakReference;
        RecyclerView recyclerView;
        C123275i2 c123275i2;
        try {
            AbstractC09780fb.A01("RV Prefetch", -966120296);
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i2);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                    }
                }
                if (j2 == 0) {
                    this.A01 = 0L;
                    i = 583900495;
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.A00;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            C3F3 c3f3 = recyclerView3.A09;
                            c3f3.A00(recyclerView3, false);
                            i3 += c3f3.A00;
                        }
                    }
                    ArrayList arrayList2 = this.A03;
                    arrayList2.ensureCapacity(i3);
                    int i5 = 0;
                    for (int i6 = 0; i6 < size2; i6++) {
                        RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i6);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C3F3 c3f32 = recyclerView4.A09;
                            int abs = Math.abs(c3f32.A01) + Math.abs(c3f32.A02);
                            for (int i7 = 0; i7 < c3f32.A00 * 2; i7 += 2) {
                                if (i5 >= arrayList2.size()) {
                                    Object obj = new Object();
                                    arrayList2.add(obj);
                                    c123275i2 = obj;
                                } else {
                                    c123275i2 = (C123275i2) arrayList2.get(i5);
                                }
                                int[] iArr = c3f32.A03;
                                int i8 = iArr[i7 + 1];
                                boolean z = false;
                                if (i8 <= abs) {
                                    z = true;
                                }
                                c123275i2.A04 = z;
                                c123275i2.A02 = abs;
                                c123275i2.A00 = i8;
                                c123275i2.A03 = recyclerView4;
                                c123275i2.A01 = iArr[i7];
                                i5++;
                            }
                        }
                    }
                    Collections.sort(arrayList2, A04);
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        C123275i2 c123275i22 = (C123275i2) arrayList2.get(i9);
                        if (c123275i22.A03 == null) {
                            break;
                        }
                        if (c123275i22.A04) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = nanos;
                        }
                        C3OO A00 = A00(c123275i22.A03, c123275i22.A01, j);
                        if (A00 != null && (weakReference = A00.mNestedRecyclerView) != null && A00.isBound() && !A00.isInvalid() && (recyclerView = (RecyclerView) weakReference.get()) != null) {
                            if (recyclerView.A0P && recyclerView.A08.A04() != 0) {
                                C3F1 c3f1 = recyclerView.A0C;
                                if (c3f1 != null) {
                                    c3f1.A0I();
                                }
                                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                                if (abstractC70663Fe != null) {
                                    C70593Ew c70593Ew = recyclerView.A0y;
                                    abstractC70663Fe.A0v(c70593Ew);
                                    recyclerView.A0D.A0w(c70593Ew);
                                }
                                recyclerView.A0y.A06();
                            }
                            C3F3 c3f33 = recyclerView.A09;
                            c3f33.A00(recyclerView, true);
                            if (c3f33.A00 != 0) {
                                try {
                                    AbstractC09780fb.A01("RV Nested Prefetch", -1882727927);
                                    C3F5 c3f5 = recyclerView.mState;
                                    C2UU c2uu = recyclerView.A0A;
                                    c3f5.A04 = 1;
                                    c3f5.A03 = c2uu.getItemCount();
                                    c3f5.A08 = false;
                                    c3f5.A0D = false;
                                    c3f5.A09 = false;
                                    for (int i10 = 0; i10 < c3f33.A00 * 2; i10 += 2) {
                                        A00(recyclerView, c3f33.A03[i10], nanos);
                                    }
                                    AbstractC09780fb.A00(-839132815);
                                } finally {
                                }
                            } else {
                                continue;
                            }
                        }
                        c123275i22.A04 = false;
                        c123275i22.A02 = 0;
                        c123275i22.A00 = 0;
                        c123275i22.A03 = null;
                        c123275i22.A01 = 0;
                    }
                    this.A01 = 0L;
                    i = 1577108253;
                }
            } else {
                this.A01 = 0L;
                i = 264918373;
            }
            AbstractC09780fb.A00(i);
        } catch (Throwable th) {
            this.A01 = 0L;
            AbstractC09780fb.A00(679703661);
            throw th;
        }
    }
}
