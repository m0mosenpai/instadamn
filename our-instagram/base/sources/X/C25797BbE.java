package X;

import android.app.Application;
import com.instagram.barcelona.weblink.WebLinkUseCase;
import com.instagram.common.session.UserSession;

/* renamed from: X.BbE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25797BbE extends C193578hc {
    public final WebLinkUseCase A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25797BbE(Application application, UserSession userSession) {
        super(application);
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = new WebLinkUseCase(userSession);
    }
}
