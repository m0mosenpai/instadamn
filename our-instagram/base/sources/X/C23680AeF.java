package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.AeF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23680AeF implements XCU {
    public final /* synthetic */ C184858Ia A00;

    @Override // X.XCU
    public final void onFailure(Exception exc) {
    }

    public C23680AeF(C184858Ia c184858Ia) {
        this.A00 = c184858Ia;
    }

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        C184858Ia c184858Ia = this.A00;
        Activity activity = c184858Ia.A06;
        C14360o3.A07(activity);
        UserSession userSession = c184858Ia.A07;
        C14360o3.A07(userSession);
        LBX.A00(activity, C8IU.A03(file, 1, 0), userSession, c184858Ia.A0B);
    }
}
