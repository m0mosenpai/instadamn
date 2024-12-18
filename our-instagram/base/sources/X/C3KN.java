package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3KN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KN {
    public static String A00;
    public static final C3KN A01 = new Object();
    public static final List A02 = new ArrayList();

    public static final View A00(View view, C3KN c3kn) {
        if (!(view instanceof RecyclerView) && !(view instanceof ReboundViewPager) && !(view instanceof RefreshableListView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C14360o3.A07(childAt);
                    View A002 = A00(childAt, c3kn);
                    if (A002 != null) {
                        return A002;
                    }
                }
            }
            return null;
        }
        return view;
    }
}
