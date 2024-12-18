package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NCz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52310NCz extends AbstractC61132qb {
    public final UserSession A00;
    public final C52128N5b A01;
    public final String A02;

    public C52310NCz(UserSession userSession, C52128N5b c52128N5b, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = c52128N5b;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C51056MhA(this.A00, this.A01, this.A02);
    }
}
