package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27701Vy {
    public final /* synthetic */ C27661Vu A00;

    public C27701Vy(C27661Vu c27661Vu) {
        this.A00 = c27661Vu;
    }

    public final void A00(boolean z) {
        java.util.Set<C56140Ow0> keySet = this.A00.A06.keySet();
        C14360o3.A07(keySet);
        for (C56140Ow0 c56140Ow0 : keySet) {
            Context context = c56140Ow0.A00;
            if (C56140Ow0.A00(context)) {
                OWH owh = OWH.A00;
                UserSession userSession = c56140Ow0.A01;
                int i = 4;
                if (z) {
                    i = 3;
                }
                owh.A01(context, userSession, null, null, null, null, null, null, i, 0, 0L);
            }
        }
    }
}
