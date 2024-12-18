package X;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1I2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1I2 extends C1I3 implements AbsListView.OnScrollListener {
    public static final int DEFAULT_FIRST_VISIBLE_ITEM_POSITION = 0;
    public static SparseIntArray LV_MAPPINGS = null;
    public static SparseIntArray RV_MAPPINGS = null;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_INVALID = -1;
    public static final int STATE_SETTLING = 2;
    public int mCumulativeDy;
    public int mCurrentScrollStateLV;
    public int mOnScrollDyThreshold;
    public Runnable mScrollIdleDebouncer;

    private void onScrolledInternal(RecyclerView recyclerView, int i, int i2, boolean z) {
        int i3 = i2;
        super.onScrolled(recyclerView, i, i2);
        if (!z && skipOnScroll(i2)) {
            return;
        }
        boolean z2 = false;
        if (this.mOnScrollDyThreshold > 0) {
            z2 = true;
        }
        if (z2) {
            i3 = this.mCumulativeDy;
            this.mCumulativeDy = 0;
        }
        C2UU c2uu = recyclerView.A0A;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (c2uu == null || abstractC70663Fe == null) {
            return;
        }
        int itemCount = c2uu.getItemCount();
        int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
        int A02 = AbstractC72193Ls.A02(abstractC70663Fe);
        int i4 = 0;
        if (A01 > -1) {
            i4 = (A02 - A01) + 1;
        }
        onScroll(C3FN.A00(recyclerView), Math.max(A01, 0), i4, itemCount, i, i3);
    }

    public abstract void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        RV_MAPPINGS = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        LV_MAPPINGS = sparseIntArray2;
        sparseIntArray2.put(0, 0);
        sparseIntArray2.put(1, 1);
        sparseIntArray2.put(2, 2);
    }

    private boolean shouldLimitScrollEvents() {
        if (this.mOnScrollDyThreshold <= 0) {
            return false;
        }
        return true;
    }

    private boolean shouldSkipToDebounceIdleStateForLV(AbsListView absListView, int i) {
        if (this.mCurrentScrollStateLV == 2 && i == 0 && this.mScrollIdleDebouncer == null) {
            RunnableC43120J4j runnableC43120J4j = new RunnableC43120J4j(absListView, this);
            this.mScrollIdleDebouncer = runnableC43120J4j;
            absListView.postOnAnimation(runnableC43120J4j);
            this.mCurrentScrollStateLV = i;
            return true;
        }
        Runnable runnable = this.mScrollIdleDebouncer;
        if (runnable != null) {
            absListView.removeCallbacks(runnable);
            this.mScrollIdleDebouncer = null;
        }
        this.mCurrentScrollStateLV = i;
        return false;
    }

    private boolean skipOnScroll(int i) {
        int i2 = this.mOnScrollDyThreshold;
        if (i2 > 0) {
            int i3 = this.mCumulativeDy;
            if (i3 * i < 0) {
                this.mCumulativeDy = i;
            } else {
                int i4 = i3 + i;
                this.mCumulativeDy = i4;
                if (Math.abs(i4) <= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-1610399148);
        onScroll(C3FN.A00(absListView), i, i2, i3, 0, 0);
        C0f9.A0A(1341363251, A03);
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(1417106028);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            int i2 = this.mCumulativeDy;
            if (i2 > 0) {
                onScrolledInternal(recyclerView, 0, i2, true);
            }
            this.mCumulativeDy = 0;
        }
        int i3 = RV_MAPPINGS.get(i, -1);
        if (i3 != -1) {
            onScrollStateChanged(C3FN.A00(recyclerView), i3);
            C0f9.A0A(-2089996579, A03);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass001.A0O("Unknown RecyclerView State:", i));
            C0f9.A0A(-1980651712, A03);
            throw illegalStateException;
        }
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(-1960086385);
        boolean z = false;
        if (i2 == 0) {
            z = true;
        }
        onScrolledInternal(recyclerView, i, i2, z);
        C0f9.A0A(1057555355, A03);
    }

    public void setOnScrollDyThreshold(Context context, int i) {
        this.mOnScrollDyThreshold = (int) AbstractC13880nE.A04(context, i);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int i2;
        int A03 = C0f9.A03(-1769682703);
        if (shouldSkipToDebounceIdleStateForLV(absListView, i)) {
            i2 = -881998776;
        } else {
            int i3 = LV_MAPPINGS.get(i, -1);
            if (i3 != -1) {
                onScrollStateChanged(C3FN.A00(absListView), i3);
                i2 = -2008374745;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass001.A0O("Unknown AbsListView State:", i));
                C0f9.A0A(669395920, A03);
                throw illegalStateException;
            }
        }
        C0f9.A0A(i2, A03);
    }

    public void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(1681701111, C0f9.A03(-1552294235));
    }
}
