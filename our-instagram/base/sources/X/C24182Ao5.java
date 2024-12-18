package X;

import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;

/* renamed from: X.Ao5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24182Ao5 implements BD6 {
    public final /* synthetic */ SettableFuture A00;

    public C24182Ao5(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.BD6
    public final void DYT(Exception exc) {
        this.A00.setException(new IOException(exc));
    }

    @Override // X.BD6
    public final void DYU(C183978Ee c183978Ee) {
        this.A00.set(c183978Ee);
    }
}
