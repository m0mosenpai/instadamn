package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lz8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49801Lz8 implements JIH {
    public ArrayList A00;
    public ArrayList A01;
    public ArrayList A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public final UserSession A06;
    public final C43754JWs A07;
    public final java.util.Set A08;

    public C49801Lz8(UserSession userSession, C43754JWs c43754JWs, String str) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A07 = c43754JWs;
        this.A04 = str;
        this.A08 = AbstractC31171DnF.A0l();
        this.A01 = AbstractC166987dD.A1E();
        this.A02 = AbstractC166987dD.A1E();
        this.A00 = AbstractC166987dD.A1E();
    }

    public static void A00(C9CG c9cg, C49801Lz8 c49801Lz8, Object obj) {
        User user;
        c49801Lz8.A03 = true;
        C9BN c9bn = (C9BN) c9cg.A01;
        if (c9bn != null && (user = (User) c9bn.A02) != null) {
            String id = user.getId();
            c49801Lz8.A01.add(obj);
            c49801Lz8.A02.add(id);
            c49801Lz8.A00.add(c9cg.A02);
        }
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        C9CG A02 = this.A07.A02(c120985dq);
        if (A02 != null) {
            String str = A02.A03;
            if (!C14360o3.A0K(str, this.A04)) {
                this.A03 = false;
                this.A04 = str;
            }
            if (i >= 3000 && !this.A03) {
                this.A08.add(str);
                A00(A02, this, str);
            }
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        C9CG A02;
        C14360o3.A0B(c120985dq, 0);
        if (i2 >= 1 && !this.A03 && (A02 = this.A07.A02(c120985dq)) != null) {
            java.util.Set set = this.A08;
            String str = A02.A03;
            set.add(str);
            A00(A02, this, str);
        }
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A06);
        java.util.Set set = this.A08;
        A00.A19(set);
        set.clear();
        this.A05 = false;
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        if (!this.A05) {
            this.A08.addAll(AbstractC001800i.A0X(AbstractC166987dD.A0x(this.A06).C2v("direct_reels_watched_set")));
            this.A05 = true;
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
