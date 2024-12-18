package X;

import android.os.Handler;

/* renamed from: X.AVm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23327AVm implements InterfaceC178817wt {
    public C80F A00;
    public final InterfaceC178817wt A01;
    public final C219919nd A02;

    @Override // X.InterfaceC178077vg
    public final void APM() {
    }

    @Override // X.InterfaceC178077vg
    public final void ARQ() {
    }

    @Override // X.InterfaceC178817wt
    public final C178847ww B9v() {
        return null;
    }

    @Override // X.InterfaceC178817wt
    public final C178867wy B9x() {
        return null;
    }

    @Override // X.InterfaceC178077vg
    public final void CNZ() {
    }

    @Override // X.InterfaceC178077vg
    public final void CNu() {
    }

    @Override // X.InterfaceC178817wt
    public final void E3h() {
    }

    @Override // X.InterfaceC178077vg
    public final void E50() {
    }

    @Override // X.InterfaceC178077vg
    public final void ECK() {
    }

    @Override // X.InterfaceC178817wt
    public final void EGn(Long l) {
        this.A01.getHandler().post(new RunnableC24674AwF(this, null));
    }

    @Override // X.InterfaceC178077vg
    public final void EKd() {
    }

    @Override // X.InterfaceC178817wt
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
    }

    @Override // X.InterfaceC178077vg
    public final void connect() {
    }

    @Override // X.InterfaceC178077vg
    public final void disconnect() {
    }

    @Override // X.InterfaceC178077vg
    public final void pause() {
    }

    @Override // X.InterfaceC178077vg
    public final void release() {
    }

    @Override // X.InterfaceC178817wt
    public final C179067xI AMz() {
        return this.A01.AMz();
    }

    @Override // X.InterfaceC178817wt
    public final int AZ1() {
        return this.A01.AZ1();
    }

    @Override // X.InterfaceC178817wt
    public final C178747wm Ac3() {
        return this.A01.Ac3();
    }

    @Override // X.InterfaceC178817wt
    public final C179067xI AwL() {
        return this.A01.AwL();
    }

    @Override // X.InterfaceC178817wt
    public final C178907x2 B9w() {
        return this.A01.B9w();
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return this.A01.BKV();
    }

    @Override // X.InterfaceC178817wt
    public final InterfaceC179037xF BQq() {
        return this.A01.BQq();
    }

    @Override // X.InterfaceC178817wt
    public final InterfaceC179077xJ BQr() {
        return this.A01.BQr();
    }

    @Override // X.InterfaceC178817wt
    public final boolean CLu() {
        return this.A01.CLu();
    }

    @Override // X.InterfaceC178817wt
    public final void EGZ(Long l) {
        this.A01.getHandler().post(new RunnableC24674AwF(this, l));
    }

    @Override // X.InterfaceC178817wt
    public final void EGa(Long l, boolean z) {
        this.A01.getHandler().post(new RunnableC24674AwF(this, l));
    }

    @Override // X.InterfaceC178817wt
    public final void EYp(InterfaceC179077xJ interfaceC179077xJ) {
        this.A01.EYp(interfaceC179077xJ);
    }

    @Override // X.InterfaceC178817wt
    public final Handler getHandler() {
        return this.A01.getHandler();
    }

    public C23327AVm(InterfaceC178817wt interfaceC178817wt, C219919nd c219919nd) {
        this.A01 = interfaceC178817wt;
        this.A02 = c219919nd;
    }

    @Override // X.InterfaceC178817wt
    public final void Eca(C80F c80f) {
        this.A00 = c80f;
    }
}
