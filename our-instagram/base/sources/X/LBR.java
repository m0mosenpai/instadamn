package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LBR {
    public static final void A00(Context context, C1P1 c1p1, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A05 = context.getString(2131957444);
        A0I.A0r(context.getString(2131957443));
        A0I.A0M(new LMH(c1p1, userSession, str, 0), 2131957640);
        A0I.A0D(LMR.A00);
        AbstractC31178DnM.A1R(A0I, true);
    }

    public static final void A01(C1P1 c1p1, UserSession userSession, String str) {
        String str2;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("media/delete_cutout_sticker/");
        A0c.A9s("cutout_sticker_id", str);
        A0c.A0R(C32125E9y.class, FS6.class);
        A0c.A0R = true;
        C1ON A0N = A0c.A0N();
        A0N.A00 = c1p1;
        C1GJ.A06(A0N, 759527209, 2, true, false);
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36609704232359889L);
        List A00 = LBp.A00(userSession, A07);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A00) {
            C49807LzE c49807LzE = (C49807LzE) obj;
            if (c49807LzE.A03 == EnumC46173KcB.A04) {
                C148286ly c148286ly = c49807LzE.A02;
                if (c148286ly != null) {
                    str2 = c148286ly.A0S;
                } else {
                    str2 = null;
                }
                if (C14360o3.A0K(str2, str)) {
                }
            }
            A1E.add(obj);
        }
        if (A1E.size() < LBp.A00(userSession, A07).size()) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC47847LBq.A00((C49807LzE) it.next()));
            }
            java.util.Set A0k = AbstractC001800i.A0k(A0q);
            InterfaceC19630xq interfaceC19630xq = A002.A01;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.EEj("recent_direct_stickers");
            ARD.apply();
            AbstractC43594JPz.A1M(interfaceC19630xq, "recent_direct_stickers", A0k);
        }
        AnonymousClass229.A01(userSession).A09.A0T("CUTOUT_STICKER_DELETION_DIALOG_DELETE_TAP", str);
    }
}
