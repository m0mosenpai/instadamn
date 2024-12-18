package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;

/* renamed from: X.6i9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146116i9 extends AbstractC61132qb {
    public final UserSession A00;

    public C146116i9(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new StoriesTemplateParticipationViewModel(userSession, new C149776oU(userSession));
    }
}
