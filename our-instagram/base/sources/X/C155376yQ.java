package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6yQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C155376yQ implements InterfaceC65952yX {
    public final UserSession A00;

    public C155376yQ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65952yX
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public boolean EjD(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A00 == 0 && !C3YS.A00(this.A00).A05(c38321qM)) {
            return true;
        }
        return false;
    }
}
