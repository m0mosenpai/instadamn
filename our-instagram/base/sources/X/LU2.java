package X;

import com.facebook.msys.mca.MailboxCallback;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LU2 implements MailboxCallback {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ boolean A01;

    public LU2(boolean z, UserSession userSession) {
        this.A01 = z;
        this.A00 = userSession;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.A01 && bool.booleanValue()) {
            C129115sX.A00.A00(this.A00);
        }
    }
}
