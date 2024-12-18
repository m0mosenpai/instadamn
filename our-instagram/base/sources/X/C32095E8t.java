package X;

import com.instagram.user.model.User;

/* renamed from: X.E8t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32095E8t extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final User A01;
    public final String A02;

    public C32095E8t(User user, String str, int i) {
        C14360o3.A0B(user, 1);
        this.A01 = user;
        this.A00 = i;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32095E8t) {
                C32095E8t c32095E8t = (C32095E8t) obj;
                if (!C14360o3.A0K(this.A01, c32095E8t.A01) || this.A00 != c32095E8t.A00 || !C14360o3.A0K(this.A02, c32095E8t.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GroupMentionViewModel(user=");
        A1C.append(this.A01);
        A1C.append(", position=");
        A1C.append(this.A00);
        A1C.append(", reelPk=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
