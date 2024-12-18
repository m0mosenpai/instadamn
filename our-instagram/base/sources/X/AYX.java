package X;

import com.facebook.msys.mca.MailboxCallback;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes4.dex */
public final class AYX implements MailboxCallback {
    public final /* synthetic */ C125875mc A00;
    public final /* synthetic */ SettableFuture A01;

    public AYX(C125875mc c125875mc, SettableFuture settableFuture) {
        this.A00 = c125875mc;
        this.A01 = settableFuture;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A01.set(Boolean.TRUE);
        C125875mc c125875mc = this.A00;
        C125875mc c125875mc2 = C125875mc.$redex_init_class;
        c125875mc.A0E = false;
        c125875mc.A0F = false;
    }
}
