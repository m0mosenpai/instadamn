package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7K {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public final void A00(Integer num, String str, String str2, boolean z, boolean z2) {
        Integer num2;
        int i;
        if (!z && num != null && num.intValue() == 2 && str2 != null && !z2) {
            C43689JTy c43689JTy = new C43689JTy(this.A02);
            if (C43689JTy.A00(c43689JTy, str) != null) {
                if (C43689JTy.A00(c43689JTy, str) == C05F.A0Y) {
                    num2 = C05F.A0C;
                } else {
                    return;
                }
            } else {
                num2 = C05F.A00;
            }
            C23031Ai c23031Ai = c43689JTy.A00;
            c23031Ai.A12(AnonymousClass001.A0g("on_device_nudity_banner_state/recipient/", str, "/message_id/"), str2);
            String A0R = AnonymousClass001.A0R("on_device_nudity_banner_state/recipient/", str);
            switch (num2.intValue()) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                default:
                    i = 3;
                    break;
            }
            c23031Ai.A0z(A0R, i);
        }
    }

    public L7K(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
