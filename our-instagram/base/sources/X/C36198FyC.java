package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FyC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36198FyC implements InterfaceC66482zP {
    public final User A00;
    public final List A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C36198FyC c36198FyC = (C36198FyC) obj;
        User user2 = this.A00;
        if (c36198FyC != null) {
            user = c36198FyC.A00;
        } else {
            user = null;
        }
        return C14360o3.A0K(user2, user);
    }

    public C36198FyC(User user, List list) {
        AbstractC167017dG.A1P(user, list);
        this.A00 = user;
        this.A01 = list;
    }
}
