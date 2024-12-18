package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151576s3 implements C73R {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC151446rm A02;
    public final C73S A03;
    public final User A04;

    public C151576s3(Context context, UserSession userSession, InterfaceC151446rm interfaceC151446rm, User user) {
        long j;
        C14360o3.A0B(interfaceC151446rm, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = interfaceC151446rm;
        this.A04 = user;
        Long A0k = AbstractC003100w.A0k(10, user.getId());
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        interfaceC151446rm.D0z(j, Aj7());
        this.A03 = C73S.A0K;
    }

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final String Aj7() {
        return BHX.A00(this.A00, C72Y.A00(this.A01, this.A04)).toString();
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A03;
    }

    @Override // X.C73R
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    @Override // X.C73R
    public final void onClick() {
        this.A02.D0p(this.A04);
    }
}
