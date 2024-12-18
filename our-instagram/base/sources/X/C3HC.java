package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.Arrays;

/* renamed from: X.3HC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HC extends DataSetObserver {
    public float A00;
    public View A02;
    public int[] A03;
    public final Handler A04;
    public final SparseArray A05;
    public final ViewGroup A06;
    public final ListAdapter A07;
    public final C3FQ A09;
    public final C3HD A08 = new C1I2() { // from class: X.3HD
        @Override // X.C1I2
        public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
            int A03 = C0f9.A03(-826318008);
            C3HC c3hc = C3HC.this;
            C3HC.A00(c3fq, c3hc, i);
            c3hc.A01 = i;
            C0f9.A0A(-2067539083, A03);
        }

        @Override // X.C1I2
        public final void onScrollStateChanged(C3FQ c3fq, int i) {
            C0f9.A0A(-1231062177, C0f9.A03(-1523581385));
        }
    };
    public int A01 = -1;

    public static void A00(C3FQ c3fq, C3HC c3hc, int i) {
        int[] iArr = c3hc.A03;
        if (iArr != null && iArr.length != 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= c3fq.AnZ()) {
                    break;
                }
                if (c3fq.AnU(i2).getBottom() > c3hc.A00) {
                    i += i2;
                    break;
                }
                i2++;
            }
            int binarySearch = Arrays.binarySearch(c3hc.A03, i);
            if (binarySearch != -1) {
                if (binarySearch < 0) {
                    binarySearch = Math.abs(binarySearch + 2);
                }
                int[] iArr2 = c3hc.A03;
                int i3 = iArr2[binarySearch];
                int i4 = Integer.MAX_VALUE;
                if (binarySearch < iArr2.length - 1) {
                    i4 = iArr2[binarySearch + 1];
                }
                ListAdapter listAdapter = c3hc.A07;
                if (i3 >= listAdapter.getCount()) {
                    C0w9.A03("STICKY_ITEM_POSITION", AnonymousClass001.A02(i3, listAdapter.getCount(), "The sticky item position ", " is larger than than the adapter count "));
                    return;
                }
                int itemViewType = listAdapter.getItemViewType(i3);
                SparseArray sparseArray = c3hc.A05;
                View view = listAdapter.getView(i3, (View) sparseArray.get(itemViewType), c3hc.A06);
                sparseArray.put(itemViewType, view);
                View view2 = c3hc.A02;
                if (view2 != view) {
                    if (view2 != null) {
                        c3hc.A04.post(new POW(c3hc));
                    }
                    c3hc.A04.post(new RunnableC57013PRe(view, c3hc));
                }
                View AnU = c3hc.A09.AnU(1);
                int i5 = i + 1;
                float f = c3hc.A00;
                if (view == null) {
                    return;
                }
                if (i5 < listAdapter.getCount() && AnU != null && i5 == i4) {
                    f = Math.min(AnU.getTop() - view.getMeasuredHeight(), 0);
                }
                view.setTranslationY(f);
                return;
            }
        }
        if (c3hc.A02 == null) {
            return;
        }
        c3hc.A04.post(new POW(c3hc));
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int[] iArr;
        Boolean bool;
        int[] modelIndex;
        C65192xH c65192xH = (C65192xH) this.A07;
        C110424yE c110424yE = c65192xH.A04;
        if (c110424yE == null || (((bool = ((C110394yB) c110424yE.A00).A01) != null && !bool.booleanValue()) || (modelIndex = c65192xH.getModelIndex(c110424yE)) == null)) {
            iArr = new int[0];
        } else {
            iArr = new int[]{modelIndex[0]};
        }
        this.A03 = iArr;
        int i = this.A01;
        if (i != -1) {
            A00(this.A09, this, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3HD] */
    public C3HC(Context context, ViewGroup viewGroup, ListAdapter listAdapter, C3FQ c3fq, float f) {
        this.A00 = 0.0f;
        this.A04 = new Handler(context.getMainLooper());
        this.A07 = listAdapter;
        listAdapter.registerDataSetObserver(this);
        this.A09 = c3fq;
        this.A06 = viewGroup;
        this.A05 = new SparseArray();
        this.A00 = f;
    }
}
