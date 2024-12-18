package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.KGj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45595KGj extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C45595KGj(UserSession userSession, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A01;
        boolean z = this.A04;
        NotesRepository A00 = C4A5.A00(userSession);
        C14360o3.A0B(userSession, 0);
        return new C44528JmY(userSession, new KZJ(userSession), A00, new KZK(userSession), str, str2, str3, z);
    }
}
