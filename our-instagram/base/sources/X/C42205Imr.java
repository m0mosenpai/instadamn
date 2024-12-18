package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Imr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42205Imr implements C38Y {
    public final ClipsViewerConfig A00;
    public final UserSession A01;
    public final C37546Gg2 A02;
    public final C37556GgC A03;
    public final String A04;

    public C42205Imr(ClipsViewerConfig clipsViewerConfig, UserSession userSession, C37546Gg2 c37546Gg2, C37556GgC c37556GgC, String str) {
        AbstractC167007dF.A1G(userSession, 1, clipsViewerConfig);
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = c37546Gg2;
        this.A03 = c37556GgC;
        this.A00 = clipsViewerConfig;
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void DXc(int i, int i2) {
        List list;
        UserSession userSession = this.A01;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        String str = this.A04;
        ClipsViewerConfig clipsViewerConfig = this.A00;
        boolean z = clipsViewerConfig.A1s;
        if (str == null) {
            list = C16930sl.A00;
        } else {
            ArrayList A1F = AbstractC166987dD.A1F(A00.A02(str).A03);
            ArrayList A1F2 = AbstractC166987dD.A1F(A00.A02(str).A06);
            A1F.removeAll(A1F2);
            list = A1F;
            if (z) {
                A1F.addAll(A1F2);
                list = A1F;
            }
        }
        C120985dq A002 = C37621GhG.A00(clipsViewerConfig, userSession, clipsViewerConfig.A1I);
        if (A002 != null && str != null) {
            java.util.Set set = A00.A02(str).A06;
            set.remove(A002);
            set.add(A002);
        }
        AbstractC37552Gg8 abstractC37552Gg8 = this.A02.A0A;
        if (i == abstractC37552Gg8.A0B() - 2 && abstractC37552Gg8.A0F(abstractC37552Gg8.A0B() - 1).A01 == EnumC129395t1.A08 && i <= clipsViewerConfig.A07 && 0 < list.size()) {
            C120985dq c120985dq = (C120985dq) list.get(0);
            int A0B = abstractC37552Gg8.A0B() - 1;
            if (A0B < 0) {
                A0B = 0;
            }
            C14360o3.A0B(c120985dq, 0);
            abstractC37552Gg8.A0c(c120985dq, A0B);
            if (str != null) {
                java.util.Set set2 = A00.A02(str).A06;
                set2.remove(c120985dq);
                set2.add(c120985dq);
            }
        }
    }
}
