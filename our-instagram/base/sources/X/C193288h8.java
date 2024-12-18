package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.8h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193288h8 implements InterfaceC13000lm {
    public final UserSession A02;
    public final Object A01 = new Object();
    public String A00 = UUID.randomUUID().toString();

    public final String A00() {
        String str;
        synchronized (this.A01) {
            str = this.A00;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C14360o3.A07(str);
            }
            this.A00 = str;
        }
        return str;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C193288h8.class);
    }

    public C193288h8(UserSession userSession) {
        this.A02 = userSession;
    }
}
