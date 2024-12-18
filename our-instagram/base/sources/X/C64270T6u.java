package X;

import android.app.Activity;
import android.content.Intent;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzc;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.T6u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64270T6u implements YO0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64270T6u(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        C5KS c5ks2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c5ks, 0);
                ((C1336561u) this.A02).A02.execute(new RunnableC49924M2r((LK0) this.A01, c5ks));
                return;
            case 1:
                ((CountDownLatch) this.A02).countDown();
                return;
            default:
                C14360o3.A0B(c5ks, 0);
                if (c5ks.A0F()) {
                    ReviewInfo reviewInfo = (ReviewInfo) c5ks.A06();
                    InterfaceC65268Tgy interfaceC65268Tgy = (InterfaceC65268Tgy) this.A01;
                    NTS nts = (NTS) this.A02;
                    Activity activity = nts.A04;
                    T7Q t7q = (T7Q) interfaceC65268Tgy;
                    zza zzaVar = (zza) reviewInfo;
                    if (zzaVar.A01) {
                        c5ks2 = AbstractC58319PtB.A0Y(null);
                    } else {
                        Intent A08 = MSW.A08(activity, PlayCoreDialogWrapperActivity.class);
                        A08.putExtra("confirmation_intent", zzaVar.A00);
                        A08.putExtra("window_flags", AbstractC43592JPx.A08(activity).getWindowSystemUiVisibility());
                        C58411Pup c58411Pup = new C58411Pup();
                        A08.putExtra("result_receiver", new zzc(t7q.A00, c58411Pup));
                        activity.startActivity(A08);
                        c5ks2 = c58411Pup.A00;
                    }
                    C14360o3.A07(c5ks2);
                    c5ks2.A03(new C64266T6q(nts, 4));
                    return;
                }
                return;
        }
    }
}
