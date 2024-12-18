package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.LTt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48169LTt implements MailboxCallback {
    public final C1346766r A00;

    public C48169LTt(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 1);
        this.A00 = c1346766r;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final void onCompletion(Object obj) {
        C1346766r c1346766r = this.A00;
        c1346766r.A02(obj);
        c1346766r.A00();
    }
}
