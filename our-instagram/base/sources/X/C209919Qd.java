package X;

/* renamed from: X.9Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209919Qd extends AbstractC192798gL {
    public final C192778gJ A00;
    public final C1Dk A01;
    public final C40701ud A02;

    public C209919Qd(C1Dk c1Dk, C192778gJ c192778gJ, C40701ud c40701ud) {
        C14360o3.A0B(c40701ud, 2);
        this.A01 = c1Dk;
        this.A02 = c40701ud;
        this.A00 = c192778gJ;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return -6;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    @Override // X.C11R
    public final String getName() {
        String callName = this.A01.getCallName();
        C14360o3.A07(callName);
        return callName;
    }

    @Override // X.C11R
    public final void run() {
        this.A02.A06(this.A01, new C207879Ht(this, 1));
    }
}
