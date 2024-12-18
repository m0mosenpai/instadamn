package X;

import com.instagram.comments.mvvm.data.CommentGiphyRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jlx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44491Jlx extends AbstractC52922bZ {
    public final C7FT A00;
    public final CommentGiphyRepository A01;
    public final UserSession A02;
    public final C05A A03;
    public final C0UO A04;

    public /* synthetic */ C44491Jlx(UserSession userSession) {
        CommentGiphyRepository commentGiphyRepository = new CommentGiphyRepository(userSession);
        C7FT c7ft = new C7FT(userSession);
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = commentGiphyRepository;
        this.A00 = c7ft;
        C008002u A00 = C10E.A00(KE9.A00);
        this.A03 = A00;
        this.A04 = A00;
        AbstractC166987dD.A1Z(new MBT(this, null, 23), AbstractC141776au.A00(this));
    }
}
