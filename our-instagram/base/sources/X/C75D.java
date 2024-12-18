package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository;
import com.instagram.creation.drafts.model.datasource.clips.ClipsImportDraftDataSource;

/* renamed from: X.75D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75D extends AbstractC61132qb {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public C75D(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        UserSession userSession = this.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        Context applicationContext = fragmentActivity.getApplication().getApplicationContext();
        C14360o3.A07(applicationContext);
        C49602Pt A002 = C2Ps.A00(applicationContext, userSession);
        C2OW c2ow = ClipsDraftPreviewItemRepository.A09;
        Application application2 = fragmentActivity.getApplication();
        C14360o3.A07(application2);
        ClipsDraftPreviewItemRepository A003 = c2ow.A00(application2, userSession);
        Context applicationContext2 = fragmentActivity.getApplication().getApplicationContext();
        C14360o3.A07(applicationContext2);
        ClipsImportDraftDataSource clipsImportDraftDataSource = new ClipsImportDraftDataSource(userSession, applicationContext2);
        return new C75E(application, userSession, C75L.A00(fragmentActivity, userSession), A003, new ClipsNetworkImportDraftRepository(applicationContext2, userSession, C75I.A00(applicationContext2, userSession), C2OY.A00(applicationContext2, userSession), clipsImportDraftDataSource, C2Ps.A00(applicationContext2, userSession)), A002, A00);
    }
}
