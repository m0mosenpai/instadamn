package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.Aun, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24592Aun implements Runnable {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ LIj A01;

    public RunnableC24592Aun(Medium medium, LIj lIj) {
        this.A01 = lIj;
        this.A00 = medium;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LIj lIj = this.A01;
        ClipsTrimFilmstrip clipsTrimFilmstrip = lIj.A0E;
        Medium medium = this.A00;
        int i = lIj.A05 * 1000;
        int min = Math.min(medium.A03, i * 2);
        int min2 = Math.min(i, min);
        int min3 = Math.min(lIj.A06, min);
        lIj.A01 = 0;
        lIj.A00 = min2;
        FilmstripTimelineView filmstripTimelineView = clipsTrimFilmstrip.A07;
        float f = min2;
        float f2 = min;
        filmstripTimelineView.setTrimmerMaximumRange(f / f2);
        filmstripTimelineView.setTrimmerMinimumRange(min3 / f2);
        filmstripTimelineView.setScrollXPercent(0.0f);
        clipsTrimFilmstrip.A02 = new C23898Ahr(lIj);
        clipsTrimFilmstrip.A0D(medium.A03, min, lIj.A01, lIj.A00);
        Context context = lIj.A08.getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        OYA.A00(context, lIj.A0A, lIj.A0B, filmstripTimelineView, AbstractC54906OQd.A01(medium.A0X, null, medium.A03), "trim", (clipsTrimFilmstrip.A01 / dimensionPixelSize2) + 1, dimensionPixelSize2, dimensionPixelSize);
    }
}
