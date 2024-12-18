package X;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class M0A implements Runnable {
    public final /* synthetic */ L40 A00;

    public M0A(L40 l40) {
        this.A00 = l40;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L40 l40 = this.A00;
        java.util.Set keySet = l40.A03.keySet();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : keySet) {
            View view = (View) obj;
            if (view.isShown() && view.getVisibility() == 0 && view.getParent() != null) {
                Rect rect = l40.A01;
                if (view.getGlobalVisibleRect(rect)) {
                    int width = rect.width() * rect.height();
                    if (view.getWidth() * view.getHeight() > 0 && width / r1 > 0.6f) {
                        A1E.add(obj);
                    }
                }
            }
        }
        java.util.Set A0k = AbstractC001800i.A0k(A1E);
        java.util.Set set = l40.A04;
        set.clear();
        set.addAll(A0k);
        l40.A00 = false;
    }
}
