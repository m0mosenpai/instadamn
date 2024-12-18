package X;

/* renamed from: X.6wU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154196wU implements InterfaceC24551Hy {
    public boolean A00;
    public final AbstractC154286wd A01;
    public final C154806xV A02;
    public final C11R A03;

    public C154196wU(C11R c11r, AbstractC154286wd abstractC154286wd, C154806xV c154806xV) {
        C14360o3.A0B(c154806xV, 2);
        this.A03 = c11r;
        this.A02 = c154806xV;
        this.A01 = abstractC154286wd;
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        C14360o3.A0B(abstractC115105If, 1);
        C154806xV c154806xV = this.A02;
        c154806xV.A01 = null;
        c154806xV.A00(C05F.A01);
        this.A01.onFail(abstractC115105If);
    }

    @Override // X.InterfaceC24551Hy
    public final void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        String str;
        C14360o3.A0B(abstractC115105If, 1);
        Throwable A01 = abstractC115105If.A01();
        String str2 = null;
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = null;
        }
        C0w9.A03("StreamingFeedRequestCallbackFailure", AnonymousClass001.A0R("error=", str));
        if (this.A00) {
            if (A01 != null) {
                str2 = A01.getMessage();
            }
            C0w9.A03("StreamingFeedRequestCallbackPartialFailure", AnonymousClass001.A0R("error=", str2));
        }
        this.A01.onFailInBackground(abstractC115105If);
    }

    @Override // X.InterfaceC24551Hy
    public final void DVR() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        C14360o3.A0B(interfaceC40801un, 2);
        this.A00 = true;
        this.A01.onSuccessInBackground(interfaceC40801un);
    }

    @Override // X.InterfaceC24551Hy
    public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        C154806xV c154806xV = this.A02;
        c154806xV.A01 = null;
        c154806xV.A00(C05F.A0C);
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) interfaceC40801un;
        C14360o3.A0B(interfaceC74303Vl, 2);
        C154806xV c154806xV = this.A02;
        c154806xV.A07 = interfaceC74303Vl.getNextMaxId();
        c154806xV.A0A = interfaceC74303Vl.CQG();
        if (interfaceC74303Vl instanceof C124275jh) {
            c154806xV.A02 = ((C124275jh) interfaceC74303Vl).A01;
        }
        if (interfaceC74303Vl instanceof C123645id) {
            C123645id c123645id = (C123645id) interfaceC74303Vl;
            c154806xV.A09 = c123645id.A02;
            c154806xV.A08 = c123645id.A01;
        }
        this.A01.onSuccess(interfaceC74303Vl);
    }

    @Override // X.InterfaceC24551Hy
    public final void Dg4() {
        C154806xV c154806xV = this.A02;
        c154806xV.A01 = null;
        if (c154806xV.A03 == C05F.A00) {
            c154806xV.A00(C05F.A0C);
        }
        this.A01.onFinish();
    }

    @Override // X.InterfaceC24551Hy
    public final void DgK() {
        C154806xV c154806xV = this.A02;
        c154806xV.A00(C05F.A00);
        c154806xV.A01 = this.A03;
        this.A01.onStart();
    }

    @Override // X.InterfaceC24551Hy
    public final void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        this.A01.onResponseStarted();
    }
}
