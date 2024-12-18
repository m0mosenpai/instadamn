package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;

/* renamed from: X.LTy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48174LTy implements MailboxCallback {
    public final /* synthetic */ C135876Cp A00;
    public final /* synthetic */ Runnable A01;

    public C48174LTy(C135876Cp c135876Cp, Runnable runnable) {
        this.A00 = c135876Cp;
        this.A01 = runnable;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ((SlimMailbox) obj).mCallbackExecutor.execute(this.A01);
    }
}
