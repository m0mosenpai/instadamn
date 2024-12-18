package X;

import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDR extends AbstractC61132qb {
    public final C57312k6 A00;
    public final UserSession A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public NDR(C57312k6 c57312k6, UserSession userSession, String str, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c57312k6;
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        OMj oMj = new OMj(this.A00, AbstractC43592JPx.A0N());
        UserSession userSession = this.A01;
        ArchiveStoryRepository archiveStoryRepository = new ArchiveStoryRepository(userSession);
        boolean z = this.A03;
        boolean z2 = this.A04;
        String str = this.A02;
        C55197Oe4 A00 = C55197Oe4.A00(userSession);
        C14360o3.A07(A00);
        return new C51039Mgp(A00, archiveStoryRepository, oMj, userSession, str, z, z2);
    }
}
