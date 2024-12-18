package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.KlG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46697KlG {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, Medium medium, UserSession userSession, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A12(userSession, interfaceC11380iw, context);
        C14360o3.A0B(str4, 7);
        Object obj = EnumC76383bi.A01.get(str4);
        if (obj != null) {
            L15 l15 = new L15(interfaceC11380iw, userSession, C40121td.A0G.A01(context, userSession));
            AbstractC166987dD.A1Z(new C50117MBd(l15, obj, medium, str, str3, str2, null, 2), AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00)));
        }
    }
}
