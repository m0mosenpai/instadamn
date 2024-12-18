package X;

import androidx.fragment.app.Fragment;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.PSt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57054PSt implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ FilmstripTimelineView A01;
    public final /* synthetic */ C183298Bb A02;

    public RunnableC57054PSt(Fragment fragment, FilmstripTimelineView filmstripTimelineView, C183298Bb c183298Bb) {
        this.A02 = c183298Bb;
        this.A00 = fragment;
        this.A01 = filmstripTimelineView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC37301Gc2.A0w(this.A00, this.A02.A06, new C57746PjZ(this.A01, 30), 16);
    }
}
