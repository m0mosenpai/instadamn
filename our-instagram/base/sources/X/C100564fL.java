package X;

import com.instagram.user.model.User;

/* renamed from: X.4fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100564fL {
    public final InterfaceC75453aC A00;

    public static final C9C1 A00(C38321qM c38321qM, User user) {
        String str;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        return new C9C1(c38321qM, str, c38321qM.A5M());
    }

    public C100564fL(InterfaceC75453aC interfaceC75453aC) {
        this.A00 = interfaceC75453aC;
    }
}
