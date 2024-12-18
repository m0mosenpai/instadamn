package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.43o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C909643o implements C33C {
    public final UserSession A00;

    @Override // X.C33C
    public final boolean Elr() {
        return false;
    }

    @Override // X.C33C
    public final void Dtr() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        A00.A50.Egi(A00, true, C23031Ai.A8c[72]);
    }

    @Override // X.C33C
    public final boolean Ejn() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        return !((Boolean) A00.A50.CES(A00, C23031Ai.A8c[72])).booleanValue();
    }

    @Override // X.C33C
    public final /* synthetic */ boolean Elq() {
        return true;
    }

    public C909643o(UserSession userSession) {
        this.A00 = userSession;
    }
}
