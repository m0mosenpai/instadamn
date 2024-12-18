package X;

import android.view.View;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* loaded from: classes9.dex */
public final class PIA implements C8RA {
    public final /* synthetic */ OKm A00;

    @Override // X.C8RA
    public final int AEg(FilmstripTimelineView filmstripTimelineView, C8RB c8rb, int i) {
        C14360o3.A0B(c8rb, 2);
        C8RA c8ra = C51369MmU.A0B;
        if (c8ra != null) {
            return c8ra.AEg(filmstripTimelineView, c8rb, i);
        }
        return c8rb.A06;
    }

    public PIA(OKm oKm) {
        this.A00 = oKm;
    }

    @Override // X.C8RA
    public final int AEt(FilmstripTimelineView filmstripTimelineView, C8RB c8rb, int i) {
        return View.MeasureSpec.makeMeasureSpec((int) this.A00.A00(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    @Override // X.C8RA
    public final int Bs1() {
        C8RA c8ra = C51369MmU.A0B;
        if (c8ra != null) {
            return c8ra.Bs1();
        }
        return 0;
    }

    @Override // X.C8RA
    public final int Bs3() {
        C8RA c8ra = C51369MmU.A0B;
        if (c8ra != null) {
            return c8ra.Bs3();
        }
        return 0;
    }
}
