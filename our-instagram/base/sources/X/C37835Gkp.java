package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.Gkp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37835Gkp extends AbstractC60592pi {
    public final java.util.Set A00 = AbstractC166987dD.A1H();

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00.clear();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = (View) ((Reference) it.next()).get();
            if (callback != null) {
                TransitionCarouselImageView.A03((TransitionCarouselImageView) ((JFQ) callback));
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = (View) ((Reference) it.next()).get();
            if (callback != null) {
                TransitionCarouselImageView transitionCarouselImageView = (TransitionCarouselImageView) ((JFQ) callback);
                if (transitionCarouselImageView.getVisibility() == 0) {
                    TransitionCarouselImageView.A02(transitionCarouselImageView);
                }
            }
        }
    }
}
