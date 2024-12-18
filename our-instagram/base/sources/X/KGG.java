package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;

/* loaded from: classes8.dex */
public final class KGG extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final ContentNotesImmersiveReplyContent A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        InterfaceC11380iw interfaceC11380iw = this.A00;
        UserSession userSession = this.A01;
        return new C25861BcG(interfaceC11380iw, userSession, C4Ez.A00(userSession), this.A02);
    }

    public KGG(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent) {
        AbstractC167017dG.A1R(userSession, contentNotesImmersiveReplyContent);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A02 = contentNotesImmersiveReplyContent;
    }
}
