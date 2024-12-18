package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.89e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1828389e extends AbstractC52922bZ {
    public final C2GS A00 = new C2GT(EnumC1828489f.A09);
    public final C05A A01 = C10E.A00(null);
    public final UserSession A02;

    public final EnumC1828489f A00() {
        EnumC1828489f enumC1828489f = (EnumC1828489f) this.A00.A02();
        if (enumC1828489f == null) {
            return EnumC1828489f.A09;
        }
        return enumC1828489f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    public C1828389e(UserSession userSession) {
        this.A02 = userSession;
    }
}
