package X;

import com.instagram.user.model.User;

/* renamed from: X.OvG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56096OvG implements InterfaceC66482zP {
    public final User A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56096OvG c56096OvG = (C56096OvG) obj;
        C14360o3.A0B(c56096OvG, 0);
        if (C14360o3.A0K(this.A00, c56096OvG.A00) && C14360o3.A0K(this.A01, c56096OvG.A01)) {
            return true;
        }
        return false;
    }

    public C56096OvG(User user, String str) {
        AbstractC167017dG.A1P(user, str);
        this.A00 = user;
        this.A01 = str;
    }
}
