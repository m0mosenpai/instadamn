package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;
import java.io.IOException;

/* renamed from: X.AoL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24198AoL implements InterfaceC58179Pqj {
    public int A00;
    public final float A01;
    public final Context A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final String A05;

    public C24198AoL(Context context, UserSession userSession, C38321qM c38321qM, String str, float f) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = c38321qM;
        this.A02 = context;
        this.A01 = f;
        this.A05 = str;
    }

    @Override // X.InterfaceC58179Pqj
    public final void COH(C208719Lf c208719Lf, int i) {
        C14360o3.A0B(c208719Lf, 0);
        this.A00 = C17s.A03(-1, 0, (int) this.A04.A1C());
        VideoFilter A00 = C9N7.A00(this.A02, this.A03);
        A00.A0F = true;
        A00.A02(new C9N3());
        throw AbstractC166987dD.A1D("We don't use VideoFilters in the OC MP");
    }

    @Override // X.InterfaceC58179Pqj
    public final void E4x(C208719Lf c208719Lf) {
    }

    @Override // X.InterfaceC58179Pqj
    public final boolean ESx(MY7 my7) {
        C14360o3.A0B(my7, 0);
        try {
            my7.ESw(this.A05);
            return true;
        } catch (IOException e) {
            C0K8.A0M(MSV.A00(363), "Exception when preparing codec: %s", e, e.getMessage());
            return false;
        }
    }

    @Override // X.InterfaceC58179Pqj
    public final void EfU(RunnableC208819Lp runnableC208819Lp) {
        C14360o3.A0B(runnableC208819Lp, 0);
        Point C5V = C5V();
        runnableC208819Lp.A08.offer(new RunnableC24814Aya(runnableC208819Lp, C5V.x, C5V.y));
    }

    @Override // X.InterfaceC58179Pqj
    public final int Bzi() {
        return this.A00;
    }

    @Override // X.InterfaceC58179Pqj
    public final Point C5V() {
        int A0z;
        Context context = this.A02;
        float f = this.A01;
        C38321qM c38321qM = this.A04;
        C88583xH c88583xH = c38321qM.CFR().A0A;
        if (c88583xH != null) {
            A0z = c88583xH.A03;
        } else {
            A0z = c38321qM.A0z();
        }
        return ALe.A02(context, this.A03, f, A0z);
    }
}
