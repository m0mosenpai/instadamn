package X;

/* renamed from: X.2sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62282sT implements InterfaceC24551Hy {
    public boolean A00;
    public final C1P1 A01;

    public C62282sT(C1P1 c1p1) {
        C14360o3.A0B(c1p1, 1);
        this.A01 = c1p1;
    }

    @Override // X.InterfaceC24551Hy
    public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        C14360o3.A0B(abstractC115105If, 1);
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
        C0w9.A03(AbstractC111324zv.A00(3773), AnonymousClass001.A0R("error=", str));
        if (this.A00) {
            if (A01 != null) {
                str2 = A01.getMessage();
            }
            C0w9.A03(AbstractC111324zv.A00(3774), AnonymousClass001.A0R("error=", str2));
        }
        this.A01.onFailInBackground(abstractC115105If);
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        C14360o3.A0B(interfaceC40801un, 2);
        this.A01.onSuccess(interfaceC40801un);
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
    public final void Dg4() {
        this.A01.onFinish();
    }

    @Override // X.InterfaceC24551Hy
    public final void DgK() {
        this.A01.onStart();
    }

    @Override // X.InterfaceC24551Hy
    public final void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        this.A01.onResponseStarted();
    }
}
