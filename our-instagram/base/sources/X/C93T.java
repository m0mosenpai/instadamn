package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.Future;

/* renamed from: X.93T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C93T implements C11R {
    public C1VW A00;
    public final /* synthetic */ C93R A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    @Override // X.C11R
    public final String getName() {
        return "LocationPlugin";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 150;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public C93T(C93R c93r, UserSession userSession, String str) {
        this.A01 = c93r;
        this.A02 = userSession;
        this.A03 = str;
    }

    @Override // X.C11R
    public final void onFinish() {
        C93R c93r = this.A01;
        if (!c93r.isCancelled()) {
            C1VW c1vw = this.A00;
            c1vw.getClass();
            final Future prefetchLocation = c1vw.prefetchLocation(this.A02, this.A03);
            c93r.addListener(new Runnable() { // from class: X.5pT
                @Override // java.lang.Runnable
                public final void run() {
                    if (C93T.this.A01.isCancelled()) {
                        prefetchLocation.cancel(true);
                    }
                }
            }, new ExecutorC14040nU(C14120nc.A00(), 149, 4, false, true));
        }
    }

    @Override // X.C11R
    public final void run() {
        this.A00 = C1VW.A00;
    }
}
