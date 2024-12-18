package X;

import com.instagram.user.model.User;

/* renamed from: X.FyW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36217FyW implements InterfaceC66482zP, X8P {
    public final User A00;
    public final String A01;
    public final boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public C36217FyW(User user, String str, boolean z) {
        this.A00 = user;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
