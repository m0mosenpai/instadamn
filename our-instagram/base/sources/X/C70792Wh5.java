package X;

import com.instagram.user.model.User;

/* renamed from: X.Wh5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70792Wh5 implements InterfaceC66482zP {
    public Integer A00;
    public final User A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C70792Wh5(User user, Integer num, String str, boolean z, boolean z2) {
        C14360o3.A0B(user, 1);
        this.A01 = user;
        this.A00 = num;
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R(this.A01.getId(), AbstractC34345FCn.A00(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C70792Wh5 c70792Wh5 = (C70792Wh5) obj;
        User user2 = this.A01;
        Integer num = null;
        if (c70792Wh5 != null) {
            user = c70792Wh5.A01;
        } else {
            user = null;
        }
        if (C14360o3.A0K(user2, user)) {
            Integer num2 = this.A00;
            if (c70792Wh5 != null) {
                num = c70792Wh5.A00;
            }
            if (num2 == num && c70792Wh5 != null && this.A03 == c70792Wh5.A03) {
                return true;
            }
            return false;
        }
        return false;
    }
}
