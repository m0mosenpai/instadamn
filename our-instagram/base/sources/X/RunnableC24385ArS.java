package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.ArS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24385ArS implements Runnable {
    public final /* synthetic */ C184048Et A00;

    public RunnableC24385ArS(C184048Et c184048Et) {
        this.A00 = c184048Et;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C184048Et c184048Et = this.A00;
        InterfaceC09390do interfaceC09390do = c184048Et.A0B;
        ((ClipsTrimFilmstrip) AbstractC166987dD.A17(interfaceC09390do)).A07.setScrollXPercent(0.0f);
        ClipsTrimFilmstrip clipsTrimFilmstrip = (ClipsTrimFilmstrip) AbstractC166987dD.A17(interfaceC09390do);
        ClipInfo clipInfo = c184048Et.A03;
        if (clipInfo != null) {
            clipsTrimFilmstrip.A0D((int) clipInfo.A0A, 60000, clipInfo.A07, clipInfo.A05);
            InterfaceC09390do interfaceC09390do2 = c184048Et.A0C;
            Resources resources = AbstractC167007dF.A0L(interfaceC09390do2).getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
            int i = (((ClipsTrimFilmstrip) AbstractC166987dD.A17(interfaceC09390do)).A01 / dimensionPixelSize2) + 1;
            Context A0L = AbstractC166997dE.A0L(AbstractC167007dF.A0L(interfaceC09390do2));
            UserSession userSession = c184048Et.A08;
            Fragment fragment = c184048Et.A07;
            ClipInfo clipInfo2 = c184048Et.A03;
            if (clipInfo2 != null) {
                OYA.A00(A0L, fragment, userSession, ((ClipsTrimFilmstrip) AbstractC166987dD.A17(interfaceC09390do)).A07, AbstractC54906OQd.A01(clipInfo2.A0F, null, (int) clipInfo2.A0A), "post_capture", i, dimensionPixelSize2, dimensionPixelSize);
                return;
            }
        }
        C14360o3.A0F("clipInfo");
        throw C00O.createAndThrow();
    }
}
