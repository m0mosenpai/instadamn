package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.thread.threadmedia.data.SharedLinksDataSource;

/* loaded from: classes8.dex */
public final class KZ6 extends C4A7 {
    public final UserSession A00;
    public final SharedLinksDataSource A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KZ6(UserSession userSession) {
        super("DirectThreadSharedLinks", C4A8.A01(604517096, 1));
        SharedLinksDataSource sharedLinksDataSource = new SharedLinksDataSource(userSession, AbstractC40691uc.A01(userSession));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = sharedLinksDataSource;
    }
}
