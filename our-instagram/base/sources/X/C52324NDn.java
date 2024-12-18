package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.NDn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52324NDn extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ClipsTimelineEditorConfig A02;
    public final C8NF A03;
    public final ClipsCreationViewModel A04;
    public final C89P A05;
    public final C187358Sd A06;
    public final NIW A07;
    public final C50868Mdz A08;
    public final C1828989k A09;

    public C52324NDn(FragmentActivity fragmentActivity, UserSession userSession, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C8NF c8nf, ClipsCreationViewModel clipsCreationViewModel, C89P c89p, C187358Sd c187358Sd, NIW niw, C50868Mdz c50868Mdz, C1828989k c1828989k) {
        C14360o3.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A04 = clipsCreationViewModel;
        this.A09 = c1828989k;
        this.A06 = c187358Sd;
        this.A08 = c50868Mdz;
        this.A07 = niw;
        this.A05 = c89p;
        this.A03 = c8nf;
        this.A02 = clipsTimelineEditorConfig;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application A06 = MSX.A06(this.A00);
        UserSession userSession = this.A01;
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        C1828989k c1828989k = this.A09;
        C187358Sd c187358Sd = this.A06;
        C50868Mdz c50868Mdz = this.A08;
        NIW niw = this.A07;
        C89P c89p = this.A05;
        return new C50869Me0(A06, userSession, this.A02, this.A03, clipsCreationViewModel, c89p, c187358Sd, niw, c50868Mdz, c1828989k);
    }
}
