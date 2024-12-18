package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.Wry, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71330Wry implements Runnable {
    public final /* synthetic */ RefreshableRecyclerViewLayout A00;

    public RunnableC71330Wry(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        this.A00 = refreshableRecyclerViewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Method method;
        try {
            RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.A00;
            RecyclerView recyclerView = refreshableRecyclerViewLayout.A0P;
            Field declaredField = recyclerView.getClass().getDeclaredField("mGapWorker");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(recyclerView);
                refreshableRecyclerViewLayout.A0A = obj;
                if (obj != null) {
                    Class<?> cls = obj.getClass();
                    if (cls != null) {
                        Class cls2 = Integer.TYPE;
                        method = cls.getDeclaredMethod("postFromTraversal", RecyclerView.class, cls2, cls2);
                    } else {
                        method = null;
                    }
                    refreshableRecyclerViewLayout.A0B = method;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                }
            }
        } catch (Exception e) {
            RefreshableRecyclerViewLayout.A08(this.A00, e, C05F.A00);
        }
    }
}
