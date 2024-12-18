package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;

/* renamed from: X.NCe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52289NCe extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

    public C52289NCe(Context context, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        String str = this.A02;
        C40131tg c40131tg = C40121td.A0G;
        Context context = this.A00;
        QuickSnapRepository A00 = AbstractC191088d4.A00(userSession, c40131tg.A01(context, userSession));
        C14360o3.A0B(userSession, 0);
        return new C51002Mg9(userSession, AbstractC191128dA.A00(userSession), new QuickSnapArchiveRepository(new QuickSnapApi(userSession)), A00, new QuickSnapMediaSaver(context), str);
    }
}
