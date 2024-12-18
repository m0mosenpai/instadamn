package X;

import com.instagram.user.model.User;

/* renamed from: X.FyH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36203FyH implements InterfaceC66482zP {
    public boolean A00;
    public final User A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36203FyH c36203FyH = (C36203FyH) obj;
        C14360o3.A0B(c36203FyH, 0);
        if (AbstractC31174DnI.A1Y(c36203FyH.A01, this.A01.getId()) && this.A00 == c36203FyH.A00 && this.A03 == c36203FyH.A03) {
            return true;
        }
        return false;
    }

    public C36203FyH(User user, String str, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1P(user, str);
        this.A01 = user;
        this.A02 = str;
        this.A04 = z;
        this.A00 = z2;
        this.A03 = z3;
    }
}
