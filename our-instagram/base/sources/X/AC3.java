package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AC3 {
    public final HashMap A00;
    public final UserSession A01;

    public AC3(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC166987dD.A1G();
    }

    public final void A01(Context context, C2AH c2ah, String str, boolean z) {
        AbstractC167007dF.A1K(context, str);
        File A00 = A00(str);
        if (A00 != null) {
            c2ah.onSuccess(A00);
            return;
        }
        C121275eQ A03 = AbstractC50633MWu.A03(context, this.A01, new OUQ(str, "DirectVisualMessageRepository", z, false, false));
        A03.A00 = new C215959hB(c2ah, this, str, 0);
        C1GJ.A03(A03);
    }

    public final File A00(String str) {
        File file;
        Boolean bool;
        String str2 = (String) this.A00.get(str);
        if (str2 != null) {
            file = AbstractC166987dD.A11(str2);
            bool = Boolean.valueOf(file.exists());
        } else {
            file = null;
            bool = null;
        }
        if (!AbstractC166997dE.A1Z(bool, true)) {
            return null;
        }
        return file;
    }
}
