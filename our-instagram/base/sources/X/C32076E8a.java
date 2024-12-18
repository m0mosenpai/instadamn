package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.E8a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32076E8a extends C0T6 implements InterfaceC66482zP {
    public final Reel A00;
    public final User A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32076E8a) {
                C32076E8a c32076E8a = (C32076E8a) obj;
                if (!C14360o3.A0K(this.A01, c32076E8a.A01) || !C14360o3.A0K(this.A00, c32076E8a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R(this.A01.getId(), this.A00.getId());
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        C32076E8a c32076E8a = (C32076E8a) obj;
        String id = this.A01.getId();
        if (c32076E8a != null && (user = c32076E8a.A01) != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (C14360o3.A0K(id, str) && C14360o3.A0K(this.A00.getId(), c32076E8a.A00.getId())) {
            return true;
        }
        return false;
    }

    public C32076E8a(Reel reel, User user) {
        this.A01 = user;
        this.A00 = reel;
    }
}
