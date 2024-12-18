package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.KwG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47365KwG {
    public final File A00;

    public C47365KwG(Context context, UserSession userSession) {
        this.A00 = new File(context.getFilesDir(), AnonymousClass001.A0R(userSession.userId, "/magicmediadrafts"));
    }
}
