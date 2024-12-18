package X;

import android.os.Handler;

/* loaded from: classes9.dex */
public final class NA6 extends C1P1 {
    public InterfaceC74303Vl A00;
    public boolean A01;
    public AbstractC115105If A02;
    public boolean A03;
    public final long A04;
    public final Handler A05;
    public final C1GL A06;
    public final AbstractC154286wd A07;
    public final C154806xV A08;

    public final void A00() {
        InterfaceC74303Vl interfaceC74303Vl = this.A00;
        if (interfaceC74303Vl != null) {
            C154806xV c154806xV = this.A08;
            c154806xV.A00(C05F.A0C);
            c154806xV.A07 = interfaceC74303Vl.getNextMaxId();
            c154806xV.A0A = interfaceC74303Vl.CQG();
            AbstractC154286wd abstractC154286wd = this.A07;
            abstractC154286wd.onFinish();
            abstractC154286wd.onSuccess(interfaceC74303Vl);
            this.A00 = null;
            return;
        }
        AbstractC115105If abstractC115105If = this.A02;
        if (abstractC115105If != null) {
            this.A08.A00(C05F.A01);
            AbstractC154286wd abstractC154286wd2 = this.A07;
            abstractC154286wd2.onFinish();
            abstractC154286wd2.onFail(abstractC115105If);
            this.A02 = null;
            return;
        }
        this.A01 = AbstractC167007dF.A1N(this.A03 ? 1 : 0);
    }

    public NA6(Handler handler, C1GL c1gl, AbstractC154286wd abstractC154286wd, C154806xV c154806xV) {
        C14360o3.A0B(c154806xV, 1);
        this.A08 = c154806xV;
        this.A06 = c1gl;
        this.A05 = handler;
        this.A07 = abstractC154286wd;
        this.A04 = 3600000L;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -349823877);
        this.A02 = abstractC115105If;
        if (this.A01) {
            A00();
        }
        C0f9.A0A(-1111472528, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-499831656);
        this.A03 = true;
        C0f9.A0A(-175050117, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-2113648707);
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC74303Vl, -1216451432);
        this.A00 = interfaceC74303Vl;
        long j = this.A04;
        if (j > 0 && System.currentTimeMillis() - ((InterfaceC55612h1) interfaceC74303Vl).Ajf() > j) {
            i = -1169860509;
        } else {
            A00();
            i = -1649110953;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(-1648133388, A03);
    }
}
