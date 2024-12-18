package X;

/* renamed from: X.5ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124735ke implements InterfaceC24901Jp, InterfaceC24871Jm {
    public final C24891Jo A00;
    public final /* synthetic */ AnonymousClass139 A01;

    @Override // X.InterfaceC24901Jp
    public final boolean AGJ(Throwable th) {
        return this.A00.AGJ(th);
    }

    @Override // X.InterfaceC24901Jp
    public final void AIl(Object obj) {
        this.A00.AIl(obj);
    }

    @Override // X.InterfaceC24901Jp
    public final void CPA(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.CPA(interfaceC16660sJ);
    }

    @Override // X.InterfaceC24871Jm
    public final void CPB(C13C c13c, int i) {
        this.A00.CPB(c13c, i);
    }

    @Override // X.InterfaceC24901Jp
    public final /* bridge */ /* synthetic */ Object F8r(Object obj, Object obj2, InterfaceC16660sJ interfaceC16660sJ) {
        AnonymousClass139 anonymousClass139 = this.A01;
        Object F8r = this.A00.F8r(obj, null, new C207199Ey(5, anonymousClass139, this));
        if (F8r != null) {
            AnonymousClass139.A01.set(anonymousClass139, null);
        }
        return F8r;
    }

    @Override // X.InterfaceC24901Jp
    public final boolean isActive() {
        return this.A00.isActive();
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        this.A00.resumeWith(obj);
    }

    public C124735ke(C24891Jo c24891Jo, AnonymousClass139 anonymousClass139) {
        this.A01 = anonymousClass139;
        this.A00 = c24891Jo;
    }

    @Override // X.InterfaceC24901Jp
    public final /* bridge */ /* synthetic */ void EKh(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        AnonymousClass139 anonymousClass139 = this.A01;
        AnonymousClass139.A01.set(anonymousClass139, null);
        this.A00.EKh(new C207199Ey(4, anonymousClass139, this), obj);
    }

    @Override // X.InterfaceC24901Jp
    public final /* bridge */ /* synthetic */ void EKp(Object obj, C12T c12t) {
        this.A00.EKp(obj, c12t);
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return this.A00.A01;
    }
}
