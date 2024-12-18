package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.Gn0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37958Gn0 extends C3OO {
    public C6T7 A00;
    public final FrameLayout A01;
    public final C126545np A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37958Gn0(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        FrameLayout frameLayout = (FrameLayout) AbstractC166987dD.A0c(view, R.id.bloks_container);
        this.A01 = frameLayout;
        C126545np c126545np = new C126545np(AbstractC166997dE.A0L(view));
        this.A02 = c126545np;
        frameLayout.addView(c126545np);
    }
}
