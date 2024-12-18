package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ds6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31462Ds6 implements InterfaceC66482zP {
    public final int A00;
    public final User A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C31462Ds6 c31462Ds6 = (C31462Ds6) obj;
        User user2 = this.A01;
        if (c31462Ds6 != null) {
            user = c31462Ds6.A01;
        } else {
            user = null;
        }
        return C14360o3.A0K(user2, user);
    }

    public C31462Ds6(User user, String str, List list, int i, boolean z) {
        this.A01 = user;
        this.A02 = str;
        this.A00 = i;
        this.A04 = z;
        this.A03 = list;
    }
}
