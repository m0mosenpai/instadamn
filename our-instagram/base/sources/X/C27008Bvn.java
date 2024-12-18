package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.genai.imageservice.service.GenAIImageService;
import com.instagram.genai.imageservice.service.GenAIImagineService;

/* renamed from: X.Bvn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27008Bvn extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public C27008Bvn(Application application, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        return new ContextualBackgroundViewModel(userSession, new C27262C1f(new GenAIImageService(application, new C51755Mte(new C51758Mth(29, (Object) 1000000L, AbstractC167017dG.A1a(userSession, application))), userSession, 8), new GenAIImagineService(userSession)));
    }
}
