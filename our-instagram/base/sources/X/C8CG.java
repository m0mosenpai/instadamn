package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;

/* renamed from: X.8CG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8CG extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C8CG(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        context.getApplicationContext();
        C8CI c8ci = (C8CI) userSession.A01(C8CI.class, new B8P(userSession, 36));
        return new StoryDraftsCreationViewModel(this.A01, userSession, new C8CQ(new C8CO(c8ci), new C8CM(c8ci), new C8CN(c8ci), new C8CP(c8ci)));
    }
}
