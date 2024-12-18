package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class L40 {
    public boolean A00;
    public final WeakReference A02;
    public final UserSession A05;
    public final Map A03 = new WeakHashMap();
    public final java.util.Set A04 = AbstractC31171DnF.A0l();
    public final Rect A01 = AbstractC166987dD.A0U();

    public L40(UserSession userSession, WeakReference weakReference) {
        this.A05 = userSession;
        this.A02 = weakReference;
        View view = (View) weakReference.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC48098LQy(this, 1));
            }
        }
    }
}
