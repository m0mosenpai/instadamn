package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3FN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3FN {
    public static C3FQ A00(ViewGroup viewGroup) {
        C3FQ c3fp;
        Object tag = viewGroup.getTag(-1557369111);
        if (tag != null) {
            if (tag instanceof C3FQ) {
                return (C3FQ) tag;
            }
            throw new IllegalStateException("view tag item is not a proxy");
        }
        if (viewGroup instanceof AbsListView) {
            if (viewGroup instanceof RefreshableListView) {
                c3fp = new C38019Go7((AbsListView) viewGroup);
            } else {
                c3fp = new JWK((AbsListView) viewGroup);
            }
        } else if (viewGroup instanceof RecyclerView) {
            ViewParent parent = viewGroup.getParent();
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            if (parent instanceof RefreshableNestedScrollingParent) {
                c3fp = new C3FO(recyclerView, (RefreshableNestedScrollingParent) parent);
            } else {
                c3fp = new C3FP(recyclerView);
            }
        } else {
            throw new IllegalArgumentException("Trying to wrap a scrollable view that isn't either a RecyclerView or a ListView");
        }
        viewGroup.setTag(-1557369111, c3fp);
        return c3fp;
    }
}
