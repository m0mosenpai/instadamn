package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Lz7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49800Lz7 implements JIH {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final UserSession A03;
    public final C43754JWs A04;
    public final HashMap A05;

    public C49800Lz7(UserSession userSession, C43754JWs c43754JWs, String str) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = c43754JWs;
        this.A00 = str;
        this.A05 = AbstractC166987dD.A1G();
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        C9CG A02;
        C14360o3.A0B(c120985dq, 0);
        if (!this.A02) {
            this.A05.putAll(C23031Ai.A02(AbstractC23021Ah.A00(this.A03), "direct_reels_impression_map"));
            this.A02 = true;
        }
        if (!C14360o3.A0K(c120985dq.getId(), this.A00)) {
            this.A01 = false;
            this.A00 = c120985dq.getId();
        }
        if (!this.A01 && (A02 = this.A04.A02(c120985dq)) != null) {
            this.A05.put(A02.A03, Double.valueOf(3.0d));
            this.A01 = true;
        }
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
        if (this.A02) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A03);
            HashMap hashMap = this.A05;
            C14360o3.A0B(hashMap, 0);
            C23031Ai.A05(A00, "direct_reels_impression_map", hashMap);
            hashMap.clear();
            this.A02 = false;
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
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

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }
}
