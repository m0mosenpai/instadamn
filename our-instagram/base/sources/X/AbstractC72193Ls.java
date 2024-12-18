package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import java.util.List;

/* renamed from: X.3Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72193Ls {
    public static final boolean A06(AbstractC70663Fe abstractC70663Fe, RecyclerView recyclerView, int i) {
        View A0e;
        int A03 = A03(abstractC70663Fe, recyclerView, i);
        if (A03 != -1 && (A0e = abstractC70663Fe.A0e(A03)) != null) {
            boolean A19 = abstractC70663Fe.A19(A0e, true);
            if (Boolean.valueOf(A19) != null) {
                return A19;
            }
        }
        return false;
    }

    public static final int A00(AbstractC70663Fe abstractC70663Fe) {
        int i;
        int size;
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC70663Fe).A1c();
        }
        if (abstractC70663Fe instanceof FlowingGridLayoutManager) {
            return ((FlowingGridLayoutManager) abstractC70663Fe).A1a();
        }
        if (abstractC70663Fe instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC70663Fe;
            int[] iArr = new int[staggeredGridLayoutManager.A06];
            for (int i2 = 0; i2 < staggeredGridLayoutManager.A06; i2++) {
                C9GM c9gm = staggeredGridLayoutManager.A0H[i2];
                if (c9gm.A05.A0D) {
                    i = c9gm.A03.size() - 1;
                    size = -1;
                } else {
                    i = 0;
                    size = c9gm.A03.size();
                }
                iArr[i2] = c9gm.A05(i, size, true, true, false);
            }
            return iArr[0];
        }
        throw A04(abstractC70663Fe);
    }

    public static final int A01(AbstractC70663Fe abstractC70663Fe) {
        int A04;
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC70663Fe).A1a();
        }
        if (abstractC70663Fe instanceof FlowingGridLayoutManager) {
            return ((FlowingGridLayoutManager) abstractC70663Fe).A1b();
        }
        if (abstractC70663Fe instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC70663Fe;
            int[] iArr = new int[staggeredGridLayoutManager.A06];
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                C9GM c9gm = staggeredGridLayoutManager.A0H[i];
                boolean z = c9gm.A05.A0D;
                int size = c9gm.A03.size();
                if (z) {
                    A04 = c9gm.A04(size - 1, -1);
                } else {
                    A04 = c9gm.A04(0, size);
                }
                iArr[i] = A04;
            }
            return iArr[0];
        }
        if (abstractC70663Fe == null) {
            throw new IllegalStateException("Required value was null.");
        }
        throw A04(abstractC70663Fe);
    }

    public static final int A02(AbstractC70663Fe abstractC70663Fe) {
        int A04;
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) abstractC70663Fe).A1b();
        }
        if (abstractC70663Fe instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) abstractC70663Fe;
            if (flowingGridLayoutManager.A0U() != 0) {
                List list = flowingGridLayoutManager.A07;
                if (!list.isEmpty()) {
                    return ((Number) list.get(list.size() - 1)).intValue();
                }
                return -1;
            }
            return -1;
        }
        if (abstractC70663Fe instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC70663Fe;
            int[] iArr = new int[staggeredGridLayoutManager.A06];
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                C9GM c9gm = staggeredGridLayoutManager.A0H[i];
                boolean z = c9gm.A05.A0D;
                int size = c9gm.A03.size();
                if (z) {
                    A04 = c9gm.A04(0, size);
                } else {
                    A04 = c9gm.A04(size - 1, -1);
                }
                iArr[i] = A04;
            }
            return iArr[0];
        }
        throw A04(abstractC70663Fe);
    }

    public static final int A03(AbstractC70663Fe abstractC70663Fe, RecyclerView recyclerView, int i) {
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            int A1a = i - ((LinearLayoutManager) abstractC70663Fe).A1a();
            if (A1a >= 0 && A1a < recyclerView.getChildCount()) {
                return A1a;
            }
            return -1;
        }
        if (abstractC70663Fe instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) abstractC70663Fe;
            if (flowingGridLayoutManager.A0U() != 0) {
                List list = flowingGridLayoutManager.A07;
                if (!list.isEmpty()) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (((Number) list.get(i2)).intValue() == i) {
                            return i2;
                        }
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        throw A04(abstractC70663Fe);
    }

    public static final IllegalArgumentException A04(AbstractC70663Fe abstractC70663Fe) {
        String str;
        Class<?> cls;
        if (abstractC70663Fe != null && (cls = abstractC70663Fe.getClass()) != null) {
            str = cls.getCanonicalName();
        } else {
            str = null;
        }
        return new IllegalArgumentException(AnonymousClass001.A0R("Unsupported LayoutManager: ", str));
    }

    public static final void A05(AbstractC70663Fe abstractC70663Fe, int i, int i2) {
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            ((LinearLayoutManager) abstractC70663Fe).A1p(i, i2);
            return;
        }
        if (abstractC70663Fe instanceof FlowingGridLayoutManager) {
            ((FlowingGridLayoutManager) abstractC70663Fe).A1d(i, i2);
            return;
        }
        if (abstractC70663Fe instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC70663Fe;
            StaggeredGridLayoutManager.SavedState savedState = staggeredGridLayoutManager.A0A;
            if (savedState != null) {
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A00 = -1;
                savedState.A03 = -1;
            }
            staggeredGridLayoutManager.A03 = i;
            staggeredGridLayoutManager.A04 = i2;
            staggeredGridLayoutManager.A0i();
            return;
        }
        throw A04(abstractC70663Fe);
    }
}
