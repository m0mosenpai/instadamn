package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.viewer.GiphyAttributionFragment;

/* renamed from: X.ClR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28679ClR implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public ViewOnTouchListenerC28679ClR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        View A07;
        View findViewWithTag;
        switch (this.A00) {
            case 0:
                GiphyAttributionFragment giphyAttributionFragment = (GiphyAttributionFragment) this.A01;
                RecyclerView recyclerView2 = giphyAttributionFragment.recycler;
                if (recyclerView2 != null) {
                    AbstractC70663Fe abstractC70663Fe = recyclerView2.A0D;
                    if (((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null && linearLayoutManager.A1c() == 0) || motionEvent.getAction() != 0 || (recyclerView = giphyAttributionFragment.recycler) == null) {
                        return false;
                    }
                    recyclerView.requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                return false;
            case 1:
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        C29361Cwu c29361Cwu = (C29361Cwu) this.A01;
                        c29361Cwu.A04 = false;
                        if (!c29361Cwu.A03) {
                            c29361Cwu.A0F.Dj5(c29361Cwu);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                view.getParent().requestDisallowInterceptTouchEvent(true);
                C29361Cwu c29361Cwu2 = (C29361Cwu) this.A01;
                c29361Cwu2.A04 = true;
                if (!c29361Cwu2.A03) {
                    c29361Cwu2.A0F.Dj6(c29361Cwu2);
                    return false;
                }
                return false;
            default:
                AbstractC167017dG.A1N(view, motionEvent);
                C37582Ggd c37582Ggd = (C37582Ggd) this.A01;
                C37556GgC c37556GgC = ((AbstractC37623GhI) c37582Ggd).A02;
                if (c37556GgC != null && (A07 = c37556GgC.A07(c37582Ggd.A00)) != null && (findViewWithTag = A07.findViewWithTag("clips_attached_scrubber_view_tag")) != null) {
                    return findViewWithTag.dispatchTouchEvent(motionEvent);
                }
                view.setVisibility(8);
                return false;
        }
    }
}
