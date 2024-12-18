package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.8kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195518kr {
    public final File A00;

    public C195518kr(Context context, UserSession userSession) {
        this.A00 = new File(context.getFilesDir(), AnonymousClass001.A0R(userSession.userId, "/storydrafts"));
    }
}
