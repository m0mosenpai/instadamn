package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.IHr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41100IHr {
    public final XFB A00;
    public final InterfaceC43468JIg A01;
    public final User A02;
    public final String A03;

    public C41100IHr(InterfaceC43468JIg interfaceC43468JIg) {
        C14360o3.A0B(interfaceC43468JIg, 1);
        this.A01 = interfaceC43468JIg;
        H3N h3n = (H3N) interfaceC43468JIg;
        User user = h3n.A01;
        this.A02 = user;
        this.A03 = h3n.A05;
        this.A00 = h3n.A00;
        if (user != null) {
            user.A16(AbstractC167007dF.A1T(h3n.A03));
            user.A10(false);
            user.A0z(AbstractC167007dF.A1T(h3n.A02));
            Boolean bool = h3n.A04;
            user.A1E(bool != null ? bool.booleanValue() : false);
            if (AbstractC166997dE.A1Z(bool, true)) {
                user.A0k(FollowStatus.A07);
            }
        }
    }
}
