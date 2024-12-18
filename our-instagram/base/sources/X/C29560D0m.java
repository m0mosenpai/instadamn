package X;

import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.MediaTrialStatus;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.D0m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29560D0m implements JIH {
    public boolean A00;
    public final C37546Gg2 A01;
    public final InterfaceC31137Dmc A02;
    public final String A03;
    public final String A04;

    public C29560D0m(C37546Gg2 c37546Gg2, InterfaceC31137Dmc interfaceC31137Dmc, String str, String str2) {
        String str3;
        C14360o3.A0B(interfaceC31137Dmc, 4);
        this.A01 = c37546Gg2;
        this.A04 = str2;
        this.A02 = interfaceC31137Dmc;
        this.A00 = false;
        if (str != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            str3 = C38801rC.A06(str);
        } else {
            str3 = null;
        }
        this.A03 = str3;
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        String str;
        boolean z;
        ClipsTrialDict Aog;
        ClipsTrialDict Aog2;
        String id;
        C14360o3.A0B(c120985dq, 0);
        if (!this.A00) {
            C38321qM c38321qM = c120985dq.A02;
            MediaTrialStatus mediaTrialStatus = null;
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                str = C38801rC.A06(id);
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, this.A03)) {
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null && (Aog2 = c38321qM2.A0C.Aog()) != null) {
                    mediaTrialStatus = Aog2.C0I();
                }
                if (mediaTrialStatus == MediaTrialStatus.A04) {
                    C37644Ghd C09 = this.A01.A0A.C09(c120985dq);
                    InterfaceC31137Dmc interfaceC31137Dmc = this.A02;
                    C38321qM c38321qM3 = c120985dq.A02;
                    if (c38321qM3 != null && (Aog = c38321qM3.A0C.Aog()) != null) {
                        z = AbstractC166997dE.A1Z(Aog.Cc9(), true);
                    } else {
                        z = false;
                    }
                    interfaceC31137Dmc.E32(c120985dq, C09, this.A04, z);
                    this.A00 = true;
                }
            }
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
    public final void DzJ(C120985dq c120985dq, int i) {
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
