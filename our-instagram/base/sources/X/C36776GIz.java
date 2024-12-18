package X;

import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.GIz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36776GIz implements InterfaceC58091PpG {
    public final /* synthetic */ UserDetailTabController A00;
    public final /* synthetic */ MUB A01;

    public C36776GIz(UserDetailTabController userDetailTabController, MUB mub) {
        this.A01 = mub;
        this.A00 = userDetailTabController;
    }

    @Override // X.InterfaceC58091PpG
    public final void Dpw(C59644QjO c59644QjO) {
        String str;
        if (c59644QjO != null) {
            String A00 = AbstractC58317Pt9.A00(49);
            String A09 = c59644QjO.A09(A00);
            if (A09 != null && A09.length() != 0) {
                if (C18U.A06(C06090Tz.A05, this.A01.A0A, 36312690062263510L)) {
                    UserDetailTabController userDetailTabController = this.A00;
                    String A092 = c59644QjO.A09(A00);
                    C155666yv c155666yv = userDetailTabController.A0O;
                    String str2 = c155666yv.A0K;
                    if (str2 != null) {
                        if (str2.equals(A092)) {
                            return;
                        }
                    } else if (A092 == null) {
                        return;
                    }
                    c155666yv.A0K = A092;
                    c155666yv.A00();
                    return;
                }
            }
            String A093 = c59644QjO.A09(A00);
            if (A093 != null && A093.length() != 0) {
                return;
            }
        }
        C155666yv c155666yv2 = this.A00.A0O;
        if (!AbstractC31171DnF.A1X(c155666yv2.A0K) || (str = c155666yv2.A0K) == null || str.equals(null)) {
            return;
        }
        c155666yv2.A0K = null;
        c155666yv2.A00();
    }

    @Override // X.InterfaceC58091PpG
    public final void onFailure() {
        C0w9.A03(AbstractC111324zv.A00(1598), AbstractC111324zv.A00(1624));
    }
}
