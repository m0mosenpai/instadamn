package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MWQ {
    public UserSession A00;
    public boolean A01;

    public static synchronized void A00(MWQ mwq, boolean z) {
        synchronized (mwq) {
            mwq.A01 = z;
        }
    }
}
