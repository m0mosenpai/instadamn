package X;

import com.instagram.api.schemas.NoteReactionType;
import com.instagram.user.model.User;

/* renamed from: X.Jzs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45212Jzs extends C0T6 implements InterfaceC66482zP {
    public final NoteReactionType A00;
    public final User A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public C45212Jzs(NoteReactionType noteReactionType, User user, Integer num, String str, boolean z) {
        C14360o3.A0B(user, 2);
        this.A03 = str;
        this.A01 = user;
        this.A02 = num;
        this.A00 = noteReactionType;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45212Jzs) {
                C45212Jzs c45212Jzs = (C45212Jzs) obj;
                if (!C14360o3.A0K(this.A03, c45212Jzs.A03) || !C14360o3.A0K(this.A01, c45212Jzs.A01) || this.A02 != c45212Jzs.A02 || this.A00 != c45212Jzs.A00 || this.A04 != c45212Jzs.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        String username = this.A01.getUsername();
        Integer num = this.A02;
        if (num != null) {
            str = AbstractC46775KmW.A00(num);
        } else {
            str = "null";
        }
        return AnonymousClass001.A0R(username, str);
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A03));
        Integer num = this.A02;
        return AbstractC166987dD.A0K(this.A04, (AbstractC167017dG.A0L(num, AbstractC46775KmW.A00(num), A0J) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C45212Jzs c45212Jzs = (C45212Jzs) obj;
        String str2 = this.A03;
        if (c45212Jzs != null) {
            str = c45212Jzs.A03;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A01, c45212Jzs.A01) && this.A02 == c45212Jzs.A02) {
            return true;
        }
        return false;
    }
}
