package X;

import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70593Ew {
    public int A00;
    public int A01;
    public C70783Fq A02;
    public AbstractC72457Xe3 A03;
    public ArrayList A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final List A07;
    public final /* synthetic */ RecyclerView A08;

    public static boolean A02(C70593Ew c70593Ew, C3OO c3oo, int i, int i2, long j) {
        c3oo.mBindingAdapter = null;
        RecyclerView recyclerView = c70593Ew.A08;
        c3oo.mOwnerRecyclerView = recyclerView;
        int i3 = c3oo.mItemViewType;
        long nanoTime = System.nanoTime();
        boolean z = false;
        if (j != Long.MAX_VALUE) {
            long j2 = C70783Fq.A00(c70593Ew.A02, i3).A01;
            if (j2 != 0 && nanoTime + j2 >= j) {
                return false;
            }
        }
        if (c3oo.isTmpDetached()) {
            RecyclerView.A0G(c3oo.itemView, c3oo.itemView.getLayoutParams(), recyclerView, recyclerView.getChildCount());
            z = true;
        }
        recyclerView.A0A.bindViewHolder(c3oo, i);
        if (z) {
            RecyclerView.A0H(c3oo.itemView, recyclerView);
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        C3ON A00 = C70783Fq.A00(c70593Ew.A02, c3oo.mItemViewType);
        long j3 = A00.A01;
        if (j3 != 0) {
            nanoTime2 = ((j3 / 4) * 3) + (nanoTime2 / 4);
        }
        A00.A01 = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.A0x;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            View view = c3oo.itemView;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            C3FK c3fk = recyclerView.A0J;
            if (c3fk != null) {
                C02V A0a = c3fk.A0a();
                if (A0a instanceof C3FL) {
                    C3FL c3fl = (C3FL) A0a;
                    C02V A01 = AbstractC010103p.A01(view);
                    if (A01 != null && A01 != c3fl) {
                        c3fl.A00.put(view, A01);
                    }
                }
                AbstractC010103p.A0B(view, A0a);
            }
        }
        if (recyclerView.mState.A08) {
            c3oo.mPreLayoutPosition = i2;
        }
        return true;
    }

    public C70593Ew(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        this.A04 = null;
        this.A06 = new ArrayList();
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A00 = 2;
        this.A01 = 2;
    }

    public static void A00(C2UU c2uu, C70593Ew c70593Ew, boolean z) {
        C70783Fq c70783Fq = c70593Ew.A02;
        if (c70783Fq != null) {
            java.util.Set set = c70783Fq.A02;
            set.remove(c2uu);
            if (set.size() == 0 && !z) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = c70783Fq.A01;
                    if (i < sparseArray.size()) {
                        ArrayList arrayList = ((C3ON) sparseArray.get(sparseArray.keyAt(i))).A03;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            AbstractC105064oM.A01(((C3OO) arrayList.get(i2)).itemView);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A01(C70593Ew c70593Ew) {
        RecyclerView recyclerView;
        C2UU c2uu;
        C70783Fq c70783Fq = c70593Ew.A02;
        if (c70783Fq != null && (c2uu = (recyclerView = c70593Ew.A08).A0A) != null && recyclerView.A0T) {
            c70783Fq.A02.add(c2uu);
        }
    }

    public final int A03(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A08;
            C3F5 c3f5 = recyclerView.mState;
            if (i < c3f5.A00()) {
                if (c3f5.A08) {
                    return recyclerView.A07.A04(i, 0);
                }
                return i;
            }
        }
        RecyclerView recyclerView2 = this.A08;
        throw new IndexOutOfBoundsException(AnonymousClass001.A0n("invalid position ", ". State item count is ", recyclerView2.A0Z(), i, recyclerView2.mState.A00()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0207, code lost:
    
        if (r3.mState.A08 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02f0, code lost:
    
        if (r7.mItemId != r9.getItemId(r7.mPosition)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015b, code lost:
    
        r7.addFlags(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Type inference failed for: r0v116, types: [X.3Sb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO A05(int r24, long r25) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70593Ew.A05(int, long):X.3OO");
    }

    public final void A06() {
        this.A05.clear();
        A07();
    }

    public final void A07() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                A09(size);
            }
        }
        arrayList.clear();
        float f = RecyclerView.A1E;
        C3F3 c3f3 = this.A08.A09;
        int[] iArr = c3f3.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c3f3.A00 = 0;
    }

    public final void A08() {
        int i;
        AbstractC70663Fe abstractC70663Fe = this.A08.A0D;
        if (abstractC70663Fe != null) {
            i = abstractC70663Fe.A02;
        } else {
            i = 0;
        }
        this.A01 = this.A00 + i;
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0 && arrayList.size() > this.A01) {
                A09(size);
            } else {
                return;
            }
        }
    }

    public final void A09(int i) {
        float f = RecyclerView.A1E;
        ArrayList arrayList = this.A06;
        A0E((C3OO) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0.onFailedToRecycleView(r11) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.C3OO r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70593Ew.A0C(X.3OO):void");
    }

    public final void A0D(C3OO c3oo) {
        ArrayList arrayList;
        if (c3oo.mInChangeScrap) {
            arrayList = this.A04;
        } else {
            arrayList = this.A05;
        }
        arrayList.remove(c3oo);
        c3oo.mScrapContainer = null;
        c3oo.mInChangeScrap = false;
        c3oo.clearReturnedFromScrapFlag();
    }

    public final void A0A(View view) {
        C3OO A05 = RecyclerView.A05(view);
        if (A05.isTmpDetached()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A05.mScrapContainer != null) {
            A05.unScrap();
        } else if (A05.wasReturnedFromScrap()) {
            A05.clearReturnedFromScrapFlag();
        }
        A0C(A05);
        RecyclerView recyclerView = this.A08;
        if (recyclerView.A0C != null && !A05.isRecyclable()) {
            recyclerView.A0C.A0K(A05);
        }
    }

    public final void A0B(View view) {
        ArrayList arrayList;
        C3F1 c3f1;
        C3OO A05 = RecyclerView.A05(view);
        if ((A05.mFlags & 12) == 0 && A05.isUpdated() && (c3f1 = this.A08.A0C) != null) {
            List unmodifiedPayloads = A05.getUnmodifiedPayloads();
            if (((!(c3f1 instanceof C70623Ez) && !(c3f1 instanceof AbstractC82213li)) || unmodifiedPayloads.isEmpty()) && !c3f1.A0H(A05)) {
                arrayList = this.A04;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.A04 = arrayList;
                }
                A05.setScrapContainer(this, true);
                arrayList.add(A05);
            }
        }
        if (A05.isInvalid() && !A05.isRemoved()) {
            RecyclerView recyclerView = this.A08;
            if (!recyclerView.A0A.hasStableIds()) {
                throw new IllegalArgumentException(AnonymousClass001.A0R("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.", recyclerView.A0Z()));
            }
        }
        A05.setScrapContainer(this, false);
        arrayList = this.A05;
        arrayList.add(A05);
    }

    public final void A0E(C3OO c3oo, boolean z) {
        C02V c02v;
        RecyclerView.A0J(c3oo);
        View view = c3oo.itemView;
        RecyclerView recyclerView = this.A08;
        C3FK c3fk = recyclerView.A0J;
        if (c3fk != null) {
            C02V A0a = c3fk.A0a();
            if (A0a instanceof C3FL) {
                c02v = (C02V) ((C3FL) A0a).A00.remove(view);
            } else {
                c02v = null;
            }
            AbstractC010103p.A0B(view, c02v);
        }
        if (z) {
            JFP jfp = recyclerView.A0H;
            if (jfp != null) {
                ((C42068Ikb) jfp).A00(c3oo.itemView, true);
            }
            List list = recyclerView.A14;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C42068Ikb) ((JFP) list.get(i))).A00(c3oo.itemView, true);
            }
            C2UU c2uu = recyclerView.A0A;
            if (c2uu != null) {
                c2uu.onViewRecycled(c3oo);
            }
            if (recyclerView.mState != null) {
                recyclerView.A10.A04(c3oo);
            }
        }
        c3oo.mBindingAdapter = null;
        c3oo.mOwnerRecyclerView = null;
        if (this.A02 == null) {
            this.A02 = new C70783Fq();
            A01(this);
        }
        this.A02.A03(c3oo);
    }

    public final View A04(int i) {
        return A05(i, Long.MAX_VALUE).itemView;
    }
}
