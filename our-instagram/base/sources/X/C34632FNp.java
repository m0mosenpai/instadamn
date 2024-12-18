package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FNp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34632FNp {
    public final Context A00;
    public final C41761wQ A01;
    public final UserSession A02;
    public final C34420FFk A03;
    public final C32886EdT A04;
    public final C32887EdU A05;
    public final HashMap A06;

    public C34632FNp(Context context, UserSession userSession, C34420FFk c34420FFk) {
        C32887EdU c32887EdU;
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c34420FFk;
        this.A01 = AbstractC31173DnH.A0S();
        this.A04 = C32886EdT.A00.A00(userSession);
        synchronized (C32887EdU.A00) {
            c32887EdU = (C32887EdU) userSession.A01(C32887EdU.class, new C37054GUk(userSession, 18));
        }
        this.A05 = c32887EdU;
        this.A06 = AbstractC166987dD.A1G();
    }
}
