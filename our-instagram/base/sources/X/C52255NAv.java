package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NAv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52255NAv extends AbstractC60592pi implements InterfaceC61312qt, InterfaceC69463Ag {
    public View A00;
    public C64012vM A01;
    public C140626Xq A02;
    public final Handler A03;
    public final AbstractC60672pq A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC61352qx A07;
    public final C61252qn A08;
    public final C69473Ah A09;
    public final AbstractC69533An A0A;
    public final C25671My A0B;
    public final InterfaceC41501vz A0C;
    public final InterfaceC58046PoX A0D;
    public final C69633Ax A0E;

    public C52255NAv(Context context, AbstractC60672pq abstractC60672pq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, InterfaceC58046PoX interfaceC58046PoX, InterfaceC61352qx interfaceC61352qx) {
        C14360o3.A0B(interfaceC61352qx, 4);
        AbstractC167017dG.A1T(interfaceC58046PoX, userSession);
        this.A04 = abstractC60672pq;
        this.A07 = interfaceC61352qx;
        this.A0D = interfaceC58046PoX;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A03 = AbstractC167007dF.A0J();
        C61252qn A00 = AbstractC61242qm.A00(userSession);
        C14360o3.A07(A00);
        this.A08 = A00;
        C69473Ah c69473Ah = new C69473Ah(abstractC60672pq.requireActivity(), context, interfaceC11380iw, userSession, null, this);
        this.A09 = c69473Ah;
        this.A0A = c69473Ah.A0C;
        C64012vM c64012vM = new C64012vM(interfaceC11380iw, userSession, null, null, null);
        this.A01 = c64012vM;
        this.A0E = new C69633Ax(c57112jm, null, c64012vM, A00);
        this.A0B = AbstractC25651Mw.A00(userSession);
        this.A0C = C56034Ou6.A00(this, 5);
    }

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        C69473Ah c69473Ah = this.A09;
        c69473Ah.A03();
        this.A00 = c69473Ah.A03;
        De4(false, false);
        this.A0D.Eet(this.A00);
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
    }

    @Override // X.InterfaceC61312qt
    public final void DKn(boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void DSa() {
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
    }

    @Override // X.InterfaceC61322qu
    public final void DXf(long j, int i) {
    }

    @Override // X.InterfaceC61322qu
    public final void DXg(long j) {
    }

    @Override // X.InterfaceC63992vK
    public final void Ddr(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De6(Reel reel, C70873Fz c70873Fz, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        long j;
        C14360o3.A0B(str, 0);
        C69473Ah c69473Ah = this.A09;
        Reel A01 = c69473Ah.A01(str);
        if (A01 != null) {
            C140626Xq c140626Xq = this.A02;
            if (c140626Xq != null) {
                c140626Xq.A05(C05F.A0C);
            }
            RecyclerView recyclerView = c69473Ah.A03;
            if (recyclerView != null) {
                recyclerView.A0n(c69473Ah.A0C.CNP(A01));
            }
            View view = this.A00;
            if (view != null) {
                RunnableC56988PQe runnableC56988PQe = new RunnableC56988PQe(this, A01);
                if (c69473Ah.A00(A01) != null) {
                    j = 0;
                } else {
                    j = 100;
                }
                view.postDelayed(runnableC56988PQe, j);
            }
        }
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
        AbstractC167017dG.A1O(reel, c70873Fz);
        this.A01.A02(reel, c70873Fz, null, null, null, i);
    }

    @Override // X.InterfaceC64002vL
    public final void DeC(List list, int i, String str) {
    }

    @Override // X.InterfaceC61312qt
    public final void DeD(Integer num, int i, long j, boolean z) {
        C14360o3.A0B(num, 3);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(new RunnableC56899PMs(this), 250L);
        }
        C64012vM c64012vM = this.A01;
        UserSession userSession = this.A06;
        c64012vM.A04(new C70873Fz(userSession, C1OU.A04(userSession).A0P()), this.A08, num, i, j, z);
    }

    @Override // X.InterfaceC61312qt
    public final void DeE(C1OP c1op, String str, int i, long j, boolean z, boolean z2) {
        boolean A1a = AbstractC167017dG.A1a(c1op, str);
        UserSession userSession = this.A06;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        AbstractC167007dF.A1D(userSession, A1a ? 1 : 0, interfaceC11380iw);
        C64012vM c64012vM = new C64012vM(interfaceC11380iw, userSession, null, str, c1op.A07);
        this.A01 = c64012vM;
        C69633Ax c69633Ax = this.A0E;
        c69633Ax.A06.A00 = c64012vM;
        c69633Ax.A05.A00 = c64012vM;
        c69633Ax.A04.A00 = c64012vM;
        C1OU c1ou = C1OU.$redex_init_class;
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        c64012vM.A03(new C70873Fz(userSession, A03.A0P()), this.A08, null, c1op.A04, j, z);
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
    }

    @Override // X.InterfaceC61312qt
    public final /* synthetic */ void DeG() {
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
    }

    @Override // X.InterfaceC69463Ag
    public final void EDJ(View view, int i, boolean z) {
    }

    @Override // X.InterfaceC69463Ag
    public final void EDl(View view, int i) {
    }

    @Override // X.InterfaceC69463Ag
    public final void EDx(View view, Reel reel, C70873Fz c70873Fz, int i) {
        C14360o3.A0B(view, 0);
        this.A0E.A00(view, reel, c70873Fz, null, i);
    }

    @Override // X.InterfaceC63992vK
    public final void EI4(long j, int i) {
    }

    @Override // X.InterfaceC63992vK
    public final void EI5(long j) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ int C9u() {
        return 0;
    }

    @Override // X.InterfaceC61312qt
    public final void De4(boolean z, boolean z2) {
        if (this.A00 != null) {
            UserSession userSession = this.A06;
            ArrayList A0P = C1OU.A04(userSession).A0P();
            C69473Ah c69473Ah = this.A09;
            c69473Ah.A0C.EcN(A0P, false, c69473Ah.A0B);
            C14360o3.A0B(userSession, 0);
            C3G6.A00(userSession).A06(C3G5.A08, A0P);
            if (z) {
                c69473Ah.A06();
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        this.A08.A0G(this);
        this.A0B.A01(this.A0C, C3DH.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A08.A0H(this);
        this.A0B.A02(this.A0C, C3DH.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A09.A04();
        if (this.A00 != null) {
            this.A00 = null;
            this.A0D.AI2();
        }
        C140626Xq c140626Xq = this.A02;
        if (c140626Xq != null) {
            this.A07.F9f(c140626Xq);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C61252qn c61252qn = this.A08;
        c61252qn.A02 = System.currentTimeMillis();
        this.A09.A05();
        c61252qn.A0H(this);
        C140626Xq c140626Xq = this.A02;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A0N);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        AbstractC69533An abstractC69533An = this.A0A;
        abstractC69533An.notifyDataSetChanged();
        if (this.A00 != null && abstractC69533An.getItemCount() > 0) {
            abstractC69533An.notifyDataSetChanged();
        }
        this.A08.A0G(this);
    }
}
