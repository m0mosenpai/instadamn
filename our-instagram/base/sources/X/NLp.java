package X;

/* loaded from: classes9.dex */
public final class NLp extends AbstractC154286wd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OKv A01;
    public final /* synthetic */ C54694ODu A02;

    public NLp(OKv oKv, C54694ODu c54694ODu, int i) {
        this.A02 = c54694ODu;
        this.A01 = oKv;
        this.A00 = i;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -255566046);
        this.A02.A00.A0B(new O8H(4, new MUG((C38071Gp0) abstractC115105If.A00(), this.A01)));
        C0f9.A0A(1967959154, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        Throwable A01;
        String str;
        int A03 = C0f9.A03(760440158);
        C14360o3.A0B(abstractC115105If, 0);
        C54428O3i c54428O3i = this.A02.A04;
        String str2 = this.A01.A01;
        int i = this.A00;
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        if ((c40781ul == null || (str = c40781ul.getErrorMessage()) == null) && ((A01 = abstractC115105If.A01()) == null || (str = A01.getMessage()) == null)) {
            str = "null_response";
        }
        AbstractC167007dF.A1D(str2, 0, str);
        C24Q c24q = MSZ.A0V(c54428O3i.A00.A0A).A0E;
        c24q.A07(str, "", 17639880, c24q.A00.generateFlowId(17639880, i));
        C0f9.A0A(20633977, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1564932732);
        this.A02.A00.A0B(new O8H(2, new MUG((C38071Gp0) null, this.A01)));
        C0f9.A0A(1518863576, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1939911754);
        this.A02.A00.A0B(new O8H(1, new MUG((C38071Gp0) null, this.A01)));
        C0f9.A0A(-683928513, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1957328321);
        C38071Gp0 c38071Gp0 = (C38071Gp0) obj;
        int A032 = C0f9.A03(1797045994);
        C14360o3.A0B(c38071Gp0, 0);
        C54694ODu c54694ODu = this.A02;
        C54428O3i c54428O3i = c54694ODu.A04;
        OKv oKv = this.A01;
        String str = oKv.A01;
        boolean CR4 = c38071Gp0.CR4();
        int size = c38071Gp0.A05.size();
        C14360o3.A0B(str, 0);
        MSZ.A0V(c54428O3i.A00.A0A).A0G(str, CR4, size);
        c54694ODu.A00.A0B(new O8H(3, new MUG(c38071Gp0, oKv)));
        C0f9.A0A(-2013200579, A032);
        C0f9.A0A(1857749932, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1830028495);
        C38071Gp0 c38071Gp0 = (C38071Gp0) obj;
        int A032 = C0f9.A03(1751366673);
        C14360o3.A0B(c38071Gp0, 0);
        C54428O3i c54428O3i = this.A02.A04;
        String str = this.A01.A01;
        int i = this.A00;
        boolean CR4 = c38071Gp0.CR4();
        C14360o3.A0B(str, 0);
        C24Q c24q = MSZ.A0V(c54428O3i.A00.A0A).A0E;
        long generateFlowId = c24q.A00.generateFlowId(17639880, i);
        if (CR4) {
            c24q.A07("No network response in time, using http cache", "", 17639880, generateFlowId);
        } else {
            c24q.A02(17639880, generateFlowId);
        }
        C0f9.A0A(1912590059, A032);
        C0f9.A0A(-1759180950, A03);
    }
}
