package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public final class A93 {
    public final Context A00;
    public final C8KY A01;
    public final UserSession A02;
    public final List A03;

    public A93(Context context, UserSession userSession, List list) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = list;
        this.A01 = new C8KY(new C8KU(context, new AZT(1), new C85N(context, userSession)), list);
    }
}
