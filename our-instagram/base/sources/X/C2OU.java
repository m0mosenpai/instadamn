package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.2OU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2OU implements InterfaceC41501vz, InterfaceC13050lr {
    public final C25671My A00;
    public final ClipsDraftPreviewItemRepository A01;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.A02(this, C2QB.class);
        }
    }

    public C2OU(Context context, UserSession userSession) {
        this.A00 = AbstractC25651Mw.A00(userSession);
        C2OW c2ow = ClipsDraftPreviewItemRepository.A09;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        this.A01 = c2ow.A00((Application) applicationContext, userSession);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1882084250);
        C2QB c2qb = (C2QB) obj;
        int A032 = C0f9.A03(1672233653);
        C14360o3.A0B(c2qb, 0);
        ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A01;
        String id = c2qb.A00.getId();
        if (id != null) {
            C47Z c47z = c2qb.A01;
            C19K A02 = AnonymousClass194.A02(clipsDraftPreviewItemRepository.A01);
            C206709Db c206709Db = new C206709Db(clipsDraftPreviewItemRepository, c47z, id, null, 1);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206709Db, A02);
            C0f9.A0A(-1130133639, A032);
            C0f9.A0A(-2076631066, A03);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A0A(-8535106, A032);
        throw illegalStateException;
    }
}
