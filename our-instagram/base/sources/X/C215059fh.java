package X;

/* renamed from: X.9fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215059fh extends AbstractC192798gL {
    public int A00;
    public C1Df A01;
    public C6FQ A02;
    public final C192778gJ A03;
    public final C1Dk A04;
    public final C40701ud A05;

    public C215059fh(C1Dk c1Dk, C192778gJ c192778gJ, C6FQ c6fq, C40701ud c40701ud) {
        C14360o3.A0B(c40701ud, 2);
        this.A04 = c1Dk;
        this.A05 = c40701ud;
        this.A03 = c192778gJ;
        this.A02 = c6fq;
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
        String callName = this.A04.getCallName();
        C14360o3.A07(callName);
        return callName;
    }

    @Override // X.C11R
    public final void run() {
        C6FG c6fg;
        C6FQ c6fq = this.A02;
        if (c6fq != null && (c6fg = c6fq.A03) != null) {
            this.A01 = this.A05.ATV(new C23354AXd(this, 2), new MV7(this, 1), this.A04);
            AnonymousClass634.A09(c6fg, new C23594Aco(this));
        }
    }
}
