package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G72 implements InterfaceC71950XCc {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public G72(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC71950XCc
    public final void onFailure() {
        C9GR.A0E(this.A00, "request_error");
    }

    @Override // X.InterfaceC71950XCc
    public final void onSuccess() {
        FVD.A00(this.A00, this.A01);
    }
}
