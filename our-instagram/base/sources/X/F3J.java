package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public abstract class F3J {
    public static final void A00(EnumC33491ErQ enumC33491ErQ, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        int i3 = i;
        int A06 = AbstractC167007dF.A06(0, userSession, interfaceC11380iw);
        String A00 = AbstractC34051F1e.A00(i2);
        String A08 = directShareTarget.A08();
        if (i2 != A06 && i2 != 6) {
            i3 = -1;
        }
        long j = i3;
        if (z) {
            C162337Ov.A0C(enumC33491ErQ, interfaceC11380iw, userSession, directShareTarget, A00, A08, null, str, null, str2, str3, str4, str5, str6, "DIRECT_RESHARE_SHEET", j, -1L);
        } else {
            C162337Ov.A0H(interfaceC11380iw, userSession, directShareTarget, A00, A08, null, str2, str3, str4, str5, str6, "DIRECT_RESHARE_SHEET", j, -1L);
        }
    }
}
