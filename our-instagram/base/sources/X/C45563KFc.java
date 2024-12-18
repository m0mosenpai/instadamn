package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.ghostwriter.graphql.GhostWriterGraphQLDataSource;

/* renamed from: X.KFc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45563KFc extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44492Jly(new KZ4(new GhostWriterGraphQLDataSource(AbstractC40691uc.A01(this.A00))));
    }

    public C45563KFc(UserSession userSession) {
        this.A00 = userSession;
    }
}
