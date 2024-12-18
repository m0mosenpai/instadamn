package X;

import android.view.View;
import com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes9.dex */
public final class PS4 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ HorizontalStaggeredLayoutManager A01;
    public final /* synthetic */ boolean A02;

    public PS4(View view, HorizontalStaggeredLayoutManager horizontalStaggeredLayoutManager, boolean z) {
        this.A01 = horizontalStaggeredLayoutManager;
        this.A00 = view;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentMap concurrentMap = this.A01.A0A;
        View view = this.A00;
        if (concurrentMap.containsKey(view)) {
            concurrentMap.remove(view);
        }
        view.setVisibility(AbstractC167007dF.A05(this.A02 ? 1 : 0));
    }
}
