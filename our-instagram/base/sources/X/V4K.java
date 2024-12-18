package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* loaded from: classes11.dex */
public final class V4K extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = new RefreshableNestedScrollingParent(context);
        refreshableNestedScrollingParent.addView(new C131555wr(context), new FrameLayout.LayoutParams(-1, -1));
        return refreshableNestedScrollingParent;
    }

    public V4K(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
