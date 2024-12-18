package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36334G1m implements GXQ {
    public final UserSession A00;
    public final EnumC33330EoP A01;

    @Override // X.GXQ
    public final void Cq8(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        EnumC33330EoP enumC33330EoP = this.A01;
        if (enumC33330EoP == null) {
            UserSession userSession = this.A00;
            if (C5SJ.A02(userSession) && C5SJ.A01(userSession)) {
                return;
            }
            if (C5SJ.A02(userSession)) {
                enumC33330EoP = EnumC33330EoP.A03;
            } else {
                enumC33330EoP = EnumC33330EoP.A02;
            }
        }
        bundle.putString("InterestBasedChannelType", enumC33330EoP.name());
    }

    public C36334G1m(UserSession userSession, EnumC33330EoP enumC33330EoP) {
        this.A00 = userSession;
        this.A01 = enumC33330EoP;
    }
}
