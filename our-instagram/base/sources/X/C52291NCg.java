package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;

/* renamed from: X.NCg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52291NCg extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final Integer A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Integer num = this.A02;
        UserSession userSession = this.A01;
        Application application = this.A00;
        return new C44540Jmk(userSession, new AvatarStickerInteractor(application, userSession, 22), new AvatarStickerPreRenderInteractor(application, userSession, 94), num);
    }

    public C52291NCg(Application application, UserSession userSession, Integer num) {
        this.A01 = userSession;
        this.A02 = num;
        this.A00 = application;
    }
}
