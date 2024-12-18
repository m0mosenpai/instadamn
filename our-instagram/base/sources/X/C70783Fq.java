package X;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* renamed from: X.3Fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70783Fq {
    public SparseArray A01 = new SparseArray();
    public int A00 = 0;
    public java.util.Set A02 = Collections.newSetFromMap(new IdentityHashMap());

    public final void A01() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                ArrayList arrayList = ((C3ON) sparseArray.valueAt(i)).A03;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC105064oM.A01(((C3OO) it.next()).itemView);
                }
                arrayList.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public static C3ON A00(C70783Fq c70783Fq, int i) {
        SparseArray sparseArray = c70783Fq.A01;
        C3ON c3on = (C3ON) sparseArray.get(i);
        if (c3on == null) {
            C3ON c3on2 = new C3ON();
            sparseArray.put(i, c3on2);
            return c3on2;
        }
        return c3on;
    }

    public final void A03(C3OO c3oo) {
        int i = c3oo.mItemViewType;
        ArrayList arrayList = A00(this, i).A03;
        if (((C3ON) this.A01.get(i)).A00 <= arrayList.size()) {
            AbstractC105064oM.A01(c3oo.itemView);
        } else {
            if (RecyclerView.A1C && arrayList.contains(c3oo)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            c3oo.resetInternal();
            arrayList.add(c3oo);
        }
    }

    public final void A02(int i, int i2) {
        C3ON A00 = A00(this, i);
        A00.A00 = i2;
        ArrayList arrayList = A00.A03;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
