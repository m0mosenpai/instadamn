package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Go3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38016Go3 extends C1I2 implements InterfaceC61782rf, C38Q, C31R {
    public AbstractC70663Fe A00;
    public C3I9 A01;
    public C66290U7l A02;
    public C38018Go6 A03;
    public C3CO A04;
    public C33P A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final Context A09;
    public final C37816GkW A0A;
    public final C37816GkW A0B;
    public final C37816GkW A0C;
    public final C37816GkW A0D;
    public final AbstractC59962oe A0E;
    public final ViewOnTouchListenerC60632pm A0F;
    public final InterfaceC41501vz A0G;
    public final UserSession A0H;
    public final IMU A0I;
    public final ILJ A0J;
    public final C63352uI A0K;
    public final C37430GeA A0L;
    public final InterfaceC60442pS A0M;
    public final C1I7 A0N;
    public final InterfaceC669530m A0O;
    public final String A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final InterfaceC43460JHy A0T;
    public final C60972qL A0U;

    @Override // X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return A01().BRZ(c38321qM);
    }

    public final C38018Go6 A01() {
        C38018Go6 c38018Go6 = this.A03;
        if (c38018Go6 != null) {
            return c38018Go6;
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // X.C31R
    public final void F7s(boolean z) {
        C33P c33p = this.A05;
        if (c33p != null) {
            C30E c30e = c33p.A0G;
            if (z) {
                C30E.A07(c30e, "start", false, true);
                return;
            } else {
                c30e.A0U("paused_for_replay");
                return;
            }
        }
        C14360o3.A0F("videoFeedModule");
        throw C00O.createAndThrow();
    }

    public final int A00(C38321qM c38321qM) {
        C75113Zb BRZ = A01().BRZ(c38321qM);
        if (BRZ.A0p()) {
            return BRZ.getPosition();
        }
        return -1;
    }

    @Override // X.C38Q
    public final void DRS(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        C38018Go6.A00(A01());
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(848780224);
        C14360o3.A0B(c3fq, 0);
        ViewGroup CFj = c3fq.CFj();
        C14360o3.A07(CFj);
        if (c3fq.CXX()) {
            AbsListView absListView = (AbsListView) CFj;
            if (A01().A01) {
                if (LJW.A01()) {
                    AbstractC167007dF.A0J().postDelayed(new RunnableC43084J2z(this), 0L);
                } else if (LJW.A02(absListView)) {
                    A01().A01 = false;
                }
            }
            this.A0L.onScroll(absListView, i, i2, i3);
        } else {
            this.A0L.onScrolled((RecyclerView) CFj, i4, i5);
            A01().A01 = false;
        }
        C0f9.A0A(-129475073, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C3FQ c3fq2;
        int A0N = AbstractC167017dG.A0N(c3fq, 2013313119);
        this.A0L.onScrollStateChanged(c3fq, i);
        if (!this.A0I.A02 && c3fq.BM3() == A01().getCount() - 1) {
            C41718Idp c41718Idp = this.A0J.A01.A08;
            if (c41718Idp == null) {
                C14360o3.A0F("chainingLogger");
                throw C00O.createAndThrow();
            }
            if (!c41718Idp.A02 && (c3fq2 = c41718Idp.A01) != null) {
                int BM3 = c3fq2.BM3() - 1;
                C38321qM A04 = AbstractC41071vF.A04(c41718Idp.A04.getItem(BM3));
                if (A04 != null) {
                    A04.getId();
                    A04.BRp();
                    C41718Idp.A01(c41718Idp, BM3);
                    c41718Idp.A02 = true;
                }
            }
        }
        C0f9.A0A(1187646943, A0N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38016Go3(AbstractC70663Fe abstractC70663Fe, AbstractC59962oe abstractC59962oe, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, C57112jm c57112jm, IER ier, YRM yrm, IMU imu, C65682y4 c65682y4, ILJ ilj, C40949IBw c40949IBw, C68752VbV c68752VbV, C61142qc c61142qc, C60972qL c60972qL, AbstractC61692rW abstractC61692rW, AnonymousClass341 anonymousClass341, C62812tK c62812tK, C63762ux c63762ux, C5GV c5gv, InterfaceC65002wy interfaceC65002wy, InterfaceC64872wl interfaceC64872wl, InterfaceC669530m interfaceC669530m, C1M1 c1m1, Integer num, Integer num2, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean A1a = AbstractC31175DnJ.A1a(c61142qc);
        AbstractC167017dG.A1U(ilj, c40949IBw);
        C14360o3.A0B(c62812tK, 19);
        this.A0E = abstractC59962oe;
        this.A0U = c60972qL;
        this.A0J = ilj;
        this.A00 = abstractC70663Fe;
        this.A0P = str;
        this.A0O = interfaceC669530m;
        this.A0R = z5;
        this.A0S = z6;
        UserSession userSession = c60972qL.A01;
        this.A0H = userSession;
        Context context = c60972qL.A00;
        this.A09 = context;
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        this.A0M = interfaceC60442pS;
        C37430GeA c37430GeA = new C37430GeA();
        this.A0L = c37430GeA;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0Q = C18U.A06(c06090Tz, userSession, 36317006504399633L);
        this.A0G = new C42261Inl(this, 0);
        this.A0D = C37816GkW.A00(this, 4);
        this.A0A = C37816GkW.A00(this, A1a ? 1 : 0);
        this.A0C = C37816GkW.A00(this, 3);
        this.A0B = C37816GkW.A00(this, 2);
        C42416IqJ c42416IqJ = new C42416IqJ(this);
        this.A0T = c42416IqJ;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        int A00 = C3HB.A00(context);
        this.A08 = A00;
        Integer num3 = C05F.A00;
        It9 it9 = new It9(abstractC59962oe, requireActivity, interfaceC60442pS, userSession, c65682y4, num3);
        C42707Iv2 c42707Iv2 = new C42707Iv2(requireActivity, interfaceC60442pS, userSession, new C63822v3(context, AbstractC018607g.A00(abstractC59962oe), interfaceC60442pS, userSession), num3);
        C62662t5 c62662t5 = new C62662t5(abstractC59962oe, userSession, c57112jm);
        C63712us c63712us = new C63712us(userSession, c57112jm, it9, c1m1);
        InterfaceC60682pr interfaceC60682pr = (InterfaceC60682pr) abstractC59962oe;
        C63352uI c63352uI = new C63352uI(abstractC59962oe, userSession, interfaceC60442pS, interfaceC60682pr);
        this.A0K = c63352uI;
        C62862tP A02 = C62862tP.A02(abstractC59962oe, interfaceC60442pS, userSession, c57112jm);
        C63872v8 c63872v8 = new C63872v8(userSession, c57112jm, c42707Iv2, c1m1);
        IHS ihs = new IHS(userSession, c57112jm, abstractC59962oe.getModuleName(), str3);
        J1M j1m = new J1M(this);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36317844023023232L);
        J1H j1h = new J1H(this);
        C114485Es c114485Es = c40949IBw.A00;
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A06(c114485Es.A0x.A00);
        this.A03 = new C38018Go6(abstractC59962oe, A02, interfaceC60442pS, A0B.A00(), ier, yrm, c65682y4, c61142qc, A06 ? c63352uI : null, c37430GeA, c60972qL, it9, c63712us, this, anonymousClass341, c42707Iv2, c63872v8, c62812tK, c62662t5, c63762ux, interfaceC60682pr, c5gv, interfaceC65002wy, interfaceC64872wl, j1h, j1m, c1m1, ihs, num, num2, str2, z2, z4);
        C33P c33p = new C33P(context, abstractC59962oe, userSession, c57112jm, interfaceC60442pS, abstractC61692rW, A01(), null, C33N.A08, C05F.A15, c1m1.getSessionId(), false);
        this.A05 = c33p;
        c62662t5.A00 = c33p;
        this.A0F = viewOnTouchListenerC60632pm;
        this.A0N = AbstractC65908TwF.A00(userSession, j1h, A01(), null, C05F.A01, i, A1a);
        if (z) {
            String moduleName = abstractC59962oe.getModuleName();
            int i2 = z6 ? A00 : 0;
            C14360o3.A0B(moduleName, 3);
            this.A02 = new C66290U7l(context, viewOnTouchListenerC60632pm, userSession, c68752VbV, moduleName, i2, C3HB.A00(context), z3);
        }
        this.A0I = imu;
        imu.A01 = c42416IqJ;
    }
}
