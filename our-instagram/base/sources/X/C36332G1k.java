package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36332G1k implements GXQ {
    public final UserSession A00;

    @Override // X.GXQ
    public final void Cq8(Bundle bundle) {
        EnumC33330EoP enumC33330EoP;
        String str;
        C14360o3.A0B(bundle, 0);
        UserSession userSession = this.A00;
        if (C5SJ.A02(userSession) && C5SJ.A01(userSession)) {
            str = "broadcast_chat_chooser";
        } else {
            if (C5SJ.A02(userSession)) {
                enumC33330EoP = EnumC33330EoP.A03;
            } else {
                enumC33330EoP = EnumC33330EoP.A02;
            }
            if (FU2.A01(userSession, enumC33330EoP)) {
                str = "broadcast_chat_setup";
            } else {
                str = "broadcast_chat_nux";
            }
        }
        bundle.putString("interest_based_channel_entry_point", str);
    }

    public C36332G1k(UserSession userSession) {
        this.A00 = userSession;
    }
}
