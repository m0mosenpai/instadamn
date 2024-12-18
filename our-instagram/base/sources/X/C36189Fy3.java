package X;

import com.instagram.user.model.User;

/* renamed from: X.Fy3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36189Fy3 implements InterfaceC66482zP {
    public final FNI A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A01.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C36189Fy3 c36189Fy3 = (C36189Fy3) obj;
        User user2 = this.A00.A01;
        if (c36189Fy3 != null) {
            user = c36189Fy3.A00.A01;
        } else {
            user = null;
        }
        return AbstractC50102Ry.A00(user2, user);
    }

    public C36189Fy3(FNI fni) {
        this.A00 = fni;
    }
}
