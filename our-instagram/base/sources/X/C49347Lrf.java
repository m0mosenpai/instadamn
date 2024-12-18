package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Lrf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49347Lrf implements C7GL {
    public final /* synthetic */ C44137Jf2 A00;

    @Override // X.C7GL
    public final void E1O(int i) {
    }

    @Override // X.C7GL
    public final void E1P(Exception exc) {
    }

    @Override // X.C7GL
    public final void E1Q(boolean z, int i) {
    }

    @Override // X.C7GL
    public final void E1R(boolean z) {
    }

    @Override // X.C7GL
    public final /* synthetic */ void E1S() {
    }

    @Override // X.C7GL
    public final /* synthetic */ void E1T() {
    }

    public C49347Lrf(C44137Jf2 c44137Jf2) {
        this.A00 = c44137Jf2;
    }

    @Override // X.C7GL
    public final void EOo(L33 l33, String str) {
        C7TH c7th;
        C44137Jf2 c44137Jf2 = this.A00;
        C31667DvX.A00(c44137Jf2.A0A, "bulk_reply_send", "message_voice");
        Iterator A15 = AbstractC166997dE.A15(c44137Jf2.A04);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (A1K.getKey() instanceof MsysThreadId) {
                c7th = c44137Jf2.A0C;
            } else {
                c7th = c44137Jf2.A0B;
            }
            AbstractRunnableC133325zz.A02(new C44289Jhf(new C50261MHq(c44137Jf2, 10), 8), c7th.EOm(null, (C3o9) A1K.getKey(), l33, "from_bulk_reply", null, null, null, ((C31228DoB) A1K.getValue()).A09), new Executor() { // from class: X.M8H
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C14360o3.A0B(runnable, 0);
                    C11T.A02(runnable);
                }
            });
        }
    }
}
