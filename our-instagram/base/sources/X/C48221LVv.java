package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.LVv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48221LVv implements InterfaceC65545TmK {
    public final /* synthetic */ C47617L1c A00;

    @Override // X.InterfaceC65545TmK
    public final void DFv(int i, String str) {
        C14360o3.A0B(str, 1);
        Execution.executeAsync(new C45323K4a(this.A00.A01, str, i), null, 3);
    }

    public C48221LVv(C47617L1c c47617L1c) {
        this.A00 = c47617L1c;
    }

    @Override // X.InterfaceC65545TmK
    public final void DcP(int i) {
        Execution.executeAsync(new K4T(this.A00.A01, i), null, 3);
    }

    @Override // X.InterfaceC65545TmK
    public final void onSuccess(int i) {
        Execution.executeAsync(new K4S(this.A00.A01, i), null, 3);
    }
}
