package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.WZl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70504WZl implements XCC {
    public final XCC A00;
    public final ExecutorService A01;

    @Override // X.XCC
    public final void D6X(List list) {
        this.A01.execute(new RunnableC71445Wu7(this, new ArrayList(list)));
    }

    @Override // X.XCC
    public final void onFailure(Exception exc) {
        this.A01.execute(new RunnableC71446Wu8(this, exc));
    }

    public C70504WZl(XCC xcc, ExecutorService executorService) {
        this.A00 = xcc;
        this.A01 = executorService;
    }
}
