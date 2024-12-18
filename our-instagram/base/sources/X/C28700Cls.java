package X;

import android.view.View;
import android.widget.ViewSwitcher;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Cls, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28700Cls implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ C81373k7 A00;

    public C28700Cls(C81373k7 c81373k7) {
        this.A00 = c81373k7;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        return new IgTextView(this.A00.A0G);
    }
}
