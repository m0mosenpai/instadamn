package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public final class JSM implements MSJ {
    public AbstractC46972Dl A00;
    public C3o9 A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A09;
    public final UserSession A0B;
    public final JS8 A0C;
    public final C42221xC A0D;
    public final C43951Jc0 A0F;
    public final C41761wQ A0E = AbstractC31174DnI.A0S();
    public final C42201xA A0A = AbstractC42021ws.A00();
    public boolean A08 = true;

    public JSM(C42221xC c42221xC, UserSession userSession, JS8 js8, AbstractC46972Dl abstractC46972Dl, boolean z, boolean z2, boolean z3) {
        this.A0B = userSession;
        this.A0C = js8;
        this.A0D = c42221xC;
        this.A00 = abstractC46972Dl;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A0F = new C43951Jc0(C4HC.A00.A00(userSession).A01(), AbstractC167007dF.A0J(), new C43953Jc2(this), new C43952Jc1(this));
    }

    @Override // X.MSJ
    public final void FD2(java.util.Set set) {
        List list = this.A02;
        if (list != null) {
            C42201xA c42201xA = this.A0A;
            Collection collection = (Collection) c42201xA.A0W();
            if (collection != null) {
                ArrayList A1F = AbstractC166987dD.A1F(collection);
                if (!A1F.isEmpty() && list.size() == A1F.size()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C2EC c2ec = (C2EC) list.get(i);
                        if (c2ec.BSD().size() == 1 && set.contains(c2ec.BSD().get(0))) {
                            A1F.set(i, A00(c2ec, i));
                        }
                    }
                    c42201xA.accept(A1F);
                }
            }
        }
    }

    @Override // X.MR3
    public final void cancel() {
        this.A09 = false;
        C43951Jc0 c43951Jc0 = this.A0F;
        JSU jsu = c43951Jc0.A00;
        if (jsu != null) {
            jsu.A00 = true;
        }
        c43951Jc0.A02.removeCallbacksAndMessages(null);
        c43951Jc0.A01.removeCallbacksAndMessages(null);
        this.A0E.A01();
    }

    private final JRL A00(C2EC c2ec, int i) {
        return this.A0C.A00(this.A00, c2ec, AbstractC28761aE.A00(this.A0B), i, this.A03, this.A06, this.A04, this.A05, C14360o3.A0K(this.A01, c2ec.BKb()));
    }

    public static final void A01(JSM jsm) {
        List list = jsm.A02;
        if (list != null) {
            if (!jsm.A07 || jsm.A08) {
                C43951Jc0 c43951Jc0 = jsm.A0F;
                Handler handler = c43951Jc0.A01;
                handler.removeCallbacksAndMessages(null);
                JSU jsu = new JSU(c43951Jc0, list);
                c43951Jc0.A00 = jsu;
                handler.post(jsu);
            }
        }
    }

    @Override // X.MSJ
    public final C43918JbT AFJ() {
        List<C2EC> list = this.A02;
        int i = 0;
        if (list == null) {
            return new C43918JbT(0, 0, 0, 0);
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (C2EC c2ec : list) {
            if (c2ec.Cf8(this.A0B)) {
                i++;
                if (c2ec.CWl()) {
                    i3++;
                } else {
                    i2++;
                }
                if (!c2ec.isMuted()) {
                    i4++;
                }
            }
        }
        return new C43918JbT(i, i2, i3, i4);
    }

    @Override // X.MSJ
    @Deprecated(message = "Use viewModelObservable() instead")
    public final List Av6() {
        return (List) this.A0A.A0W();
    }

    @Override // X.MSJ
    public final int CCs() {
        List list = this.A02;
        if (list != null) {
            UserSession userSession = this.A0B;
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (((C2EH) list.get(i2)).Cf8(userSession)) {
                    i++;
                }
            }
            return i;
        }
        return 0;
    }

    @Override // X.MSJ
    public final void EWR(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A01(this);
        }
    }

    @Override // X.MSJ
    public final void EWV(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            A01(this);
        }
    }

    @Override // X.MSJ
    public final void EWW(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            A01(this);
        }
    }

    @Override // X.MSJ
    public final void EWg(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            A01(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r5 == false) goto L6;
     */
    @Override // X.MSJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EWh(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.A08
            if (r0 != 0) goto L7
            r0 = 1
            if (r5 != 0) goto L8
        L7:
            r0 = 0
        L8:
            r4.A08 = r5
            if (r0 == 0) goto L13
            boolean r0 = r4.A07
            if (r0 == 0) goto L13
            A01(r4)
        L13:
            com.instagram.common.session.UserSession r3 = r4.A0B
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325819777299860(0x810e2400003594, double:3.0359329272754846E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JSM.EWh(boolean):void");
    }

    @Override // X.MR3
    public final void EdV(AbstractC46972Dl abstractC46972Dl) {
        if (!C14360o3.A0K(this.A00, abstractC46972Dl)) {
            this.A00 = abstractC46972Dl;
            A01(this);
        }
    }

    @Override // X.MSJ
    public final void EdW(C3o9 c3o9) {
        if (!c3o9.equals(this.A01)) {
            this.A01 = c3o9;
            A01(this);
        }
    }

    @Override // X.MSJ
    public final void FD1(C2EC c2ec) {
        if (this.A02 != null) {
            DirectThreadKey BKb = c2ec.BKb();
            C42201xA c42201xA = this.A0A;
            Collection collection = (Collection) c42201xA.A0W();
            if (collection != null) {
                ArrayList A1F = AbstractC166987dD.A1F(collection);
                int size = A1F.size();
                for (int i = 0; i < size; i++) {
                    if (C14360o3.A0K(((JRL) A1F.get(i)).A0I, BKb)) {
                        A1F.set(i, A00(c2ec, i));
                        c42201xA.accept(A1F);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.MR3
    public final C42221xC FDh() {
        C42201xA c42201xA = this.A0A;
        if (C18U.A06(C06090Tz.A05, this.A0B, 36325819777496471L)) {
            C42221xC A0H = c42201xA.A0H(new C43923JbY(C44034JdL.A00, 1));
            C14360o3.A0A(A0H);
            return A0H;
        }
        return c42201xA;
    }

    @Override // X.MR3
    public final void start() {
        if (this.A09) {
            if (C18U.A06(C06090Tz.A05, this.A0B, 36329036707807206L)) {
                return;
            }
        }
        this.A09 = true;
        JQn.A00(this.A0D, this.A0E, this, 32);
        this.A07 = C18U.A06(C06090Tz.A05, this.A0B, 36325819777299860L);
    }

    @Override // X.MR3
    public final void AX3() {
        A01(this);
    }
}
