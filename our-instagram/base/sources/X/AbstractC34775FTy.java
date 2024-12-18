package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.FTy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34775FTy {
    public static final void A00(Context context, UserSession userSession, String str, String str2, Map map, boolean z) {
        AbstractC167007dF.A1D(userSession, 1, str);
        Map A02 = AbstractC06930Yk.A02(AbstractC167007dF.A1b("entrypoint", str2, AbstractC166987dD.A1L("seller_id", userSession.userId), AbstractC166987dD.A1L("buyer_id", str)));
        if (map != null) {
            A02 = AbstractC06930Yk.A04(map, A02);
        }
        if (z) {
            C66277U6x A01 = C66277U6x.A01("com.bloks.www.biig.universal.business.consent", A02);
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0i = true;
            AbstractC31173DnH.A0Z(AbstractC13330mJ.A00(context), W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks").A0C(context);
            return;
        }
        AbstractC31174DnI.A19(context, C66277U6x.A01("com.bloks.www.biig.universal.business.consent", A02), userSession);
    }

    public static final void A01(UserSession userSession, Context context, boolean z) {
        HashMap A0r = AbstractC167017dG.A0r("seller_id", userSession.userId);
        if (z) {
            C66277U6x A01 = C66277U6x.A01("com.bloks.www.biig.data.sharing.settings", A0r);
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0i = true;
            AbstractC31171DnF.A10(context, A0C, 2131952100);
            AbstractC31173DnH.A0Z(AbstractC13330mJ.A00(context), W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks").A0C(context);
            return;
        }
        C66277U6x A012 = C66277U6x.A01("com.bloks.www.biig.data.sharing.settings", A0r);
        IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(context, A0C2, 2131952100);
        A012.A04(context, A0C2);
    }
}
