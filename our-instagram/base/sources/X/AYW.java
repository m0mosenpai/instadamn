package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: classes4.dex */
public final class AYW implements MailboxCallback {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public AYW(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        C14360o3.A0A(obj);
        interfaceC16660sJ.invoke(obj);
    }
}
