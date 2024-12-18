package X;

import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.user.model.User;

/* renamed from: X.FyJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36205FyJ implements InterfaceC66482zP {
    public final FanClubCategoryType A00;
    public final User A01;
    public final User A02;
    public final String A03;
    public final String A04;

    public C36205FyJ(FanClubCategoryType fanClubCategoryType, User user, User user2, String str, String str2) {
        AbstractC167027dH.A0a(1, fanClubCategoryType, str, str2, user);
        C14360o3.A0B(user2, 5);
        this.A00 = fanClubCategoryType;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = user;
        this.A01 = user2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36205FyJ c36205FyJ = (C36205FyJ) obj;
        C14360o3.A0B(c36205FyJ, 0);
        if (this.A00 == c36205FyJ.A00 && C14360o3.A0K(this.A03, c36205FyJ.A03)) {
            return true;
        }
        return false;
    }
}
