package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.user.userlist.data.LikesListRepository;

/* renamed from: X.DzH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31849DzH extends C53432cR {
    public final Application A00;
    public final C51757Mtg A01;
    public final UserSession A02;
    public final LikesListRepository A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31849DzH(Application application, C51757Mtg c51757Mtg, UserSession userSession, LikesListRepository likesListRepository) {
        super(application);
        AbstractC167007dF.A1F(userSession, 2, c51757Mtg);
        this.A00 = application;
        this.A02 = userSession;
        this.A03 = likesListRepository;
        this.A01 = c51757Mtg;
    }

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        LikesListRepository likesListRepository = this.A03;
        if (likesListRepository == null) {
            likesListRepository = new LikesListRepository(this.A02);
        }
        return new C50861Mds(this.A00, this.A01, this.A02, likesListRepository);
    }
}
