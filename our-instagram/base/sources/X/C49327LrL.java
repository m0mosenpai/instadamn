package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LrL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49327LrL implements MR6 {
    public AbstractRunnableC14200nk A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ LHz A02;

    @Override // X.MR6
    public final void onFailure() {
        onFailureInBackground(null);
    }

    public C49327LrL(LHz lHz, long j) {
        this.A02 = lHz;
        this.A01 = j;
    }

    @Override // X.MR6
    public final void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
        List A0z;
        int i;
        C0K8.A0C("DirectThreadLoaderThreadRepositoryDelegate", "failed to fetch the thread");
        if (interfaceC40821up == null) {
            A0z = C16930sl.A00;
            i = 20;
        } else {
            A0z = AbstractC43594JPz.A0z(AbstractC167017dG.A0K(AbstractC003100w.A0i(AbstractC35240FgZ.A00(new C115115Ig(interfaceC40821up)).A03)));
            i = 22;
        }
        C47621L1g c47621L1g = new C47621L1g(null, A0z, i);
        long j = this.A01;
        AbstractC43594JPz.A1R(this.A00);
        LHz.A00(this.A02, c47621L1g, j);
    }

    @Override // X.MR6
    public final void onStart() {
        LHz lHz = this.A02;
        Map map = lHz.A01;
        long j = this.A01;
        List A12 = AbstractC43592JPx.A12(Long.valueOf(j), map);
        if (A12 != null) {
            Iterator it = A12.iterator();
            while (it.hasNext()) {
                ((MQ3) it.next()).DGo(false);
            }
        }
        C45719KLw c45719KLw = new C45719KLw(lHz, j);
        C14270nr.A00().A01(c45719KLw, 30000L);
        this.A00 = c45719KLw;
    }

    @Override // X.MR6
    public final void onSuccessInBackground(C2EC c2ec) {
        long j = this.A01;
        C47621L1g c47621L1g = new C47621L1g(c2ec, C16930sl.A00, 0);
        AbstractC43594JPz.A1R(this.A00);
        LHz.A00(this.A02, c47621L1g, j);
    }

    @Override // X.MR6
    public final void onSuccess(C2EC c2ec) {
        onSuccessInBackground(c2ec);
    }
}
