package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.Jac, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43872Jac extends AbstractC61132qb {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ UserSession A01;

    public C43872Jac(Application application, UserSession userSession) {
        this.A00 = application;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C43904JbF(application, C12L.A00, userSession, ClipsDraftPreviewItemRepository.A09.A00(application, userSession));
    }
}
