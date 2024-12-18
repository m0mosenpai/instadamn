package X;

import com.instagram.user.model.User;

/* renamed from: X.Iob, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42313Iob implements InterfaceC66482zP {
    public final User A00;
    public final String A01;
    public final boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String A00 = AbstractC76433bn.A00(this.A00);
        if (A00 == null) {
            return "";
        }
        return A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42313Iob c42313Iob = (C42313Iob) obj;
        C14360o3.A0B(c42313Iob, 0);
        if (C14360o3.A0K(this.A00, c42313Iob.A00) && C14360o3.A0K(this.A01, c42313Iob.A01) && this.A02 == c42313Iob.A02) {
            return true;
        }
        return false;
    }

    public C42313Iob(User user, String str, boolean z) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = z;
    }
}
