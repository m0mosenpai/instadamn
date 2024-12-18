package X;

/* renamed from: X.6Ls, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Ls implements InterfaceC13050lr {
    public final C41761wQ A00;
    public final C137716Lt A01;
    public final C6DQ A02;
    public final C2IV A03;

    public C6Ls(C137716Lt c137716Lt, C6DQ c6dq, C2IV c2iv) {
        C14360o3.A0B(c6dq, 1);
        C14360o3.A0B(c2iv, 3);
        this.A02 = c6dq;
        this.A01 = c137716Lt;
        this.A03 = c2iv;
        this.A00 = new C41761wQ(AbstractC142856cl.A01);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00.A01();
    }
}
