package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* renamed from: X.8K2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8K2 {
    public C217309jP A00;
    public final Context A01;
    public final C49602Pt A02;
    public final ExecutorService A04 = new C14140ne(711, 3, false, true);
    public final Queue A03 = new LinkedList();

    public C8K2(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = C2Ps.A00(context, userSession);
    }
}
