package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator;

/* loaded from: classes9.dex */
public final class NDB extends AbstractC61132qb {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final Integer A03;

    public NDB(Context context, UserSession userSession, Integer num, int i) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = num;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        QuickSnapArchiveRepository quickSnapArchiveRepository = new QuickSnapArchiveRepository(new QuickSnapApi(userSession));
        C40131tg c40131tg = C40121td.A0G;
        Context context = this.A01;
        QuickSnapRepository A00 = AbstractC191088d4.A00(userSession, c40131tg.A01(context, userSession));
        int i = this.A00;
        return new QuickSnapArchiveViewModel(userSession, AbstractC23021Ah.A00(userSession), quickSnapArchiveRepository, A00, new QuickSnapMediaSaver(context), new QuickSnapRecapVideoGenerator(context, i), this.A03, i);
    }
}
