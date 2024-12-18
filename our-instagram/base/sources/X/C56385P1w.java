package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.P1w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56385P1w implements InterfaceC57946Pms {
    public final /* synthetic */ C31200Dnj A00;
    public final /* synthetic */ SettableFuture A01;

    public C56385P1w(C31200Dnj c31200Dnj, SettableFuture settableFuture) {
        this.A00 = c31200Dnj;
        this.A01 = settableFuture;
    }

    @Override // X.InterfaceC57946Pms
    public final void DTH(String str, boolean z, String str2) {
        C31200Dnj c31200Dnj = this.A00;
        SettableFuture settableFuture = this.A01;
        String str3 = c31200Dnj.A00;
        if (str3 != null && str.equals(str3)) {
            settableFuture.set(AbstractC166987dD.A1L(Boolean.valueOf(z), str2));
        }
    }
}
