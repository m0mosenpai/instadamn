package X;

import android.content.Context;
import android.view.View;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.AnU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24145AnU implements C8RA {
    public final int A00;
    public final int A01;

    public C24145AnU(Context context, int i) {
        this.A00 = i;
        this.A01 = AbstractC167017dG.A06(context);
    }

    @Override // X.C8RA
    public final int AEg(FilmstripTimelineView filmstripTimelineView, C8RB c8rb, int i) {
        int i2 = this.A00;
        C14360o3.A0B(c8rb, 2);
        int additionalHeightFromSeekbar = c8rb.A06 + filmstripTimelineView.getAdditionalHeightFromSeekbar();
        if (i2 == 0) {
            filmstripTimelineView.setPivotY(AbstractC166987dD.A02(additionalHeightFromSeekbar));
        }
        return View.MeasureSpec.makeMeasureSpec(additionalHeightFromSeekbar, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    @Override // X.C8RA
    public final int AEt(FilmstripTimelineView filmstripTimelineView, C8RB c8rb, int i) {
        int i2;
        if (this.A00 != 0) {
            C14360o3.A0B(c8rb, 2);
            Context A0L = AbstractC166997dE.A0L(filmstripTimelineView);
            i2 = AbstractC167007dF.A0K(A0L).widthPixels - c8rb.A07;
        } else {
            C14360o3.A0B(c8rb, 2);
            i2 = c8rb.A07;
        }
        return View.MeasureSpec.makeMeasureSpec(i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    @Override // X.C8RA
    public final int Bs1() {
        return this.A01;
    }

    @Override // X.C8RA
    public final int Bs3() {
        return this.A01;
    }
}
