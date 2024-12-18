package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class G3Q implements AnonymousClass760 {
    public final /* synthetic */ C32285EJx A00;

    @Override // X.AnonymousClass760
    public final void ERs(int i, int i2, int i3, int i4) {
    }

    @Override // X.AnonymousClass760
    public final void setBackgroundColor(int i) {
    }

    public G3Q(C32285EJx c32285EJx) {
        this.A00 = c32285EJx;
    }

    @Override // X.AnonymousClass760
    public final void EQQ(Drawable drawable) {
        View findViewById;
        View view = this.A00.mView;
        if (view != null && (findViewById = view.findViewById(R.id.thread_background_view)) != null) {
            findViewById.setBackground(drawable);
        }
    }
}
