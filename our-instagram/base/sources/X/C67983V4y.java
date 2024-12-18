package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.V4y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67983V4y extends AbstractC61132qb {
    public final EnumC68121VCe A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44544Jmo(this.A00, this.A01, this.A02);
    }

    public C67983V4y(EnumC68121VCe enumC68121VCe, UserSession userSession, String str) {
        AbstractC167027dH.A13(userSession, str, enumC68121VCe);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = enumC68121VCe;
    }
}
