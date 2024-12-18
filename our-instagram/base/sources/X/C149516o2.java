package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.comments.repository.StoryCommentsRepository;

/* renamed from: X.6o2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149516o2 extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C148426mC A02;

    public C149516o2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C148426mC c148426mC) {
        C14360o3.A0B(c148426mC, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A01 = userSession;
        this.A02 = c148426mC;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C17060sy A00 = C08730cb.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        StoryCommentsRepository storyCommentsRepository = new StoryCommentsRepository(interfaceC11380iw, new C149526o3(userSession));
        return new C148456mF(userSession, AbstractC23021Ah.A00(userSession), this.A02, new C149766oT(userSession), storyCommentsRepository, A00);
    }
}
