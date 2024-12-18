package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AUj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23298AUj implements BCJ {
    public BBK A00;
    public final UserSession A01;
    public final /* synthetic */ C1Z8 A02;

    public C23298AUj(C1Z8 c1z8, UserSession userSession) {
        this.A02 = c1z8;
        this.A01 = userSession;
    }

    @Override // X.BCJ
    public final BBK E6S() {
        BBK bbk = this.A00;
        if (bbk == null) {
            C23300AUl c23300AUl = new C23300AUl(this, this.A02);
            this.A00 = c23300AUl;
            return c23300AUl;
        }
        return bbk;
    }

    @Override // X.BCJ
    public final AbstractC131215w9 E6V() {
        return this.A02.A00(this.A01);
    }
}
