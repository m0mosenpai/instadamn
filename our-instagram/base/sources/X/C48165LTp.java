package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.LTp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48165LTp implements MailboxCallback {
    public final /* synthetic */ InterfaceC24901Jp A00;

    public C48165LTp(InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = interfaceC24901Jp;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final void onCompletion(Object obj) {
        this.A00.EKh(null, obj);
    }
}
