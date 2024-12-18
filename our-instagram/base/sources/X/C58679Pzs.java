package X;

import java.util.concurrent.Executor;

/* renamed from: X.Pzs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58679Pzs implements C11R {
    public final C58681Pzu A00;
    public final C1Dk A01;
    public final C40701ud A02;
    public final Executor A03;

    public C58679Pzs(C1Dk c1Dk, C58681Pzu c58681Pzu, C40701ud c40701ud, Executor executor) {
        C14360o3.A0B(c40701ud, 2);
        this.A01 = c1Dk;
        this.A02 = c40701ud;
        this.A03 = executor;
        this.A00 = c58681Pzu;
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
        String friendlyName = this.A01.getFriendlyName();
        C14360o3.A07(friendlyName);
        return friendlyName;
    }

    @Override // X.C11R
    public final void run() {
        C40701ud c40701ud = this.A02;
        C1Dk c1Dk = this.A01;
        c40701ud.ATW(new C64006Sxd(this, 3), new C58510Pwe(this, 3), c1Dk, this.A03);
    }
}
