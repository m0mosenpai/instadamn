package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.8b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189878b6 implements InterfaceC49612Pu {
    public final File A00;

    @Override // X.InterfaceC49612Pu
    public final File C5c() {
        return this.A00;
    }

    public C189878b6(Context context, UserSession userSession) {
        File file = new File(new File(context.getFilesDir(), AnonymousClass001.A0R(userSession.userId, "/audioburnin")), "temp");
        this.A00 = file;
        AbstractC189888b7.A00(file);
    }
}
