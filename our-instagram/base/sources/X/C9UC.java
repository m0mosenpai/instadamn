package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.9UC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9UC extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, X.AbstractC70663Fe
    public final C3OP A1F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C169747ho) {
            return new C9U9((C169747ho) layoutParams);
        }
        return super.A1F(layoutParams);
    }
}
