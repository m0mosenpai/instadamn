package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.36a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C683736a implements C33C {
    public final UserSession A00;

    public C683736a(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.C33C
    public final boolean Elr() {
        return false;
    }

    @Override // X.C33C
    public final void Dtr() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        A00.A4J.Egi(A00, true, C23031Ai.A8c[71]);
    }

    @Override // X.C33C
    public final boolean Ejn() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        return !((Boolean) A00.A4J.CES(A00, C23031Ai.A8c[71])).booleanValue();
    }

    @Override // X.C33C
    public final /* synthetic */ boolean Elq() {
        return true;
    }
}
