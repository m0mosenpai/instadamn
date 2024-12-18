package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.ml.hashtag.IgContextualHashtagsProcessor;

/* renamed from: X.JlG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44448JlG extends C193578hc {
    public final IgContextualHashtagsProcessor A00;
    public final C05A A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44448JlG(Application application, UserSession userSession) {
        super(application);
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = new IgContextualHashtagsProcessor(AbstractC166987dD.A0O(application), userSession);
        this.A01 = AbstractC25227BEk.A0z();
    }
}
