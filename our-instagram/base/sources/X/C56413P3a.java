package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.P3a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56413P3a implements JPd {
    public final UserSession A00;
    public final C38900HAw A01;
    public final C105824pt A02;

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.JPd
    public final boolean CY4() {
        return false;
    }

    @Override // X.JPd
    public final boolean Ca5() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    @Override // X.JPd
    public final boolean Ejl() {
        return false;
    }

    @Override // X.JPd, X.JPW
    public final C105824pt AiE() {
        return this.A02;
    }

    @Override // X.JPW
    public final String An2() {
        String str = this.A01.A03;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.JPd
    public final String BK9() {
        String str = this.A02.A0Y;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.JPW
    public final C38321qM BQN() {
        throw AbstractC166987dD.A1D("Not supported for live.");
    }

    @Override // X.JPd
    public final ImageUrl C8A(Context context) {
        return this.A02.A02();
    }

    @Override // X.JPd
    public final User CDj() {
        User user = this.A02.A09;
        user.getClass();
        return user;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return true;
    }

    @Override // X.JPd
    public final boolean Cfd() {
        User user = this.A02.A09;
        user.getClass();
        return user.isVerified();
    }

    @Override // X.JPd, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A02.getId();
    }

    @Override // X.JPd
    public final String getUsername() {
        User user = this.A02.A09;
        user.getClass();
        return user.getUsername();
    }

    @Override // X.JPd
    public final int getViewCount() {
        return this.A02.A00();
    }

    public C56413P3a(UserSession userSession, C38900HAw c38900HAw, C105824pt c105824pt) {
        AbstractC167027dH.A13(userSession, c38900HAw, c105824pt);
        this.A00 = userSession;
        this.A01 = c38900HAw;
        this.A02 = c105824pt;
        O0C.A00.getAndIncrement();
    }
}
