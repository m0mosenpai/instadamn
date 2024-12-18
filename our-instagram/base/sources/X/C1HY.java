package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.1HY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HY implements C1G4 {
    public final Context A00;
    public final AbstractC12990ll A01;
    public final C1G4 A02;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        c26511Qg.A01(new C19Q() { // from class: X.1Qo
            @Override // X.C19Q, X.C19O
            public final void onResponseStarted(C1QW c1qw2, C1QY c1qy2, C3JQ c3jq) {
                String str;
                C14360o3.A0B(c3jq, 2);
                C23781El A00 = c3jq.A00("x-ig-quick-promotion-deeplink");
                if (A00 != null && (str = A00.A01) != null) {
                    C1HY c1hy = C1HY.this;
                    AbstractC12990ll abstractC12990ll = c1hy.A01;
                    Context context = c1hy.A00;
                    if ((abstractC12990ll instanceof UserSession) && ((C56130Ovq) abstractC12990ll.A01(C56130Ovq.class, new C57519Pft(abstractC12990ll, 6))).A00.compareAndSet(false, true)) {
                        C12260kU.A0C(context, new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(str)));
                    }
                }
            }
        });
        InterfaceC27191Tt startRequest = this.A02.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    public C1HY(Context context, C1G4 c1g4, AbstractC12990ll abstractC12990ll) {
        this.A02 = c1g4;
        this.A01 = abstractC12990ll;
        this.A00 = context;
    }
}
