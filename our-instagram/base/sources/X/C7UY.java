package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7UY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UY {
    public boolean A00;
    public final C006802i A01;
    public final UserSession A02;

    public final void A00(C9Y c9y) {
        short s;
        C006802i c006802i;
        int i;
        if (this.A00) {
            if (c9y instanceof C27182Bz1) {
                c006802i = this.A01;
                i = 125763585;
                s = 2;
            } else {
                s = 4;
                if (!(c9y instanceof C27180Byz) && !(c9y instanceof C27181Bz0)) {
                    throw new RuntimeException();
                }
                c006802i = this.A01;
                i = 125763585;
            }
            c006802i.markerEnd(i, s);
            this.A00 = false;
        }
    }

    public C7UY(C006802i c006802i, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = c006802i;
    }
}
