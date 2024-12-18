package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LC2 {
    public static final View A00(PointF pointF, RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        recyclerView.getLocationOnScreen(new int[2]);
        return recyclerView.A0T(pointF.x - r3[0], pointF.y - r3[1]);
    }

    public static final L6L A01(View view, RecyclerView recyclerView, boolean z) {
        List list;
        View view2;
        View[] viewArr;
        ArrayList A12 = AbstractC166997dE.A12(recyclerView, 0);
        C3OO A0X = recyclerView.A0X(view);
        if (A0X != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C3OO A0X2 = recyclerView.A0X(recyclerView.getChildAt(i));
                if (A0X2 != null && A0X2 != A0X) {
                    View view3 = null;
                    if (A0X2 instanceof C7SP) {
                        C7SP c7sp = (C7SP) A0X2;
                        View BKF = c7sp.A0M.BKF();
                        C7S0 c7s0 = c7sp.A0P;
                        if (c7s0 != null) {
                            view3 = c7s0.BKF();
                        }
                        viewArr = new View[]{BKF, view3};
                    } else if (A0X2 instanceof C1585479p) {
                        C1585479p c1585479p = (C1585479p) A0X2;
                        C7QD c7qd = ((AbstractC1585579q) c1585479p).A00;
                        if (c7qd != null) {
                            view2 = c7qd.BKF();
                        } else {
                            view2 = null;
                        }
                        View BKF2 = ((AbstractC1585579q) c1585479p).A01.BKF();
                        C7S0 c7s02 = c1585479p.A0J;
                        if (c7s02 != null) {
                            view3 = c7s02.BKF();
                        }
                        viewArr = new View[]{view2, BKF2, view3};
                    } else {
                        if (!(A0X2 instanceof C1574475a) && !(A0X2 instanceof C7N6) && !(A0X2 instanceof C44696Jqf)) {
                            list = AbstractC166987dD.A1J(A0X2.itemView);
                        } else {
                            list = C16930sl.A00;
                        }
                        A12.addAll(list);
                    }
                    list = AbstractC16960so.A1R(viewArr);
                    A12.addAll(list);
                }
            }
        }
        if (A12.isEmpty()) {
            return null;
        }
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            View A09 = AbstractC43592JPx.A09(it);
            if (z) {
                A09.animate().alpha(0.55f).start();
            } else {
                A09.setAlpha(0.55f);
            }
        }
        return new L6L(A12);
    }
}
