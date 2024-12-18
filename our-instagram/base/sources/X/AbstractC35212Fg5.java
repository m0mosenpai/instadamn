package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Fg5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35212Fg5 {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str) {
        C14360o3.A0B(userSession, 0);
        if (A03(fragmentActivity, interfaceC11380iw, userSession, user, false)) {
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A00 = interfaceC11380iw;
            F0L.A00(c12210kP.A00(), str, "profile");
        }
    }

    public static final boolean A04(User user) {
        Boolean BwW = user.A03.BwW();
        if (BwW != null && BwW.booleanValue() && !AbstractC31174DnI.A0f().getBoolean(AbstractC111324zv.A00(4555), false)) {
            return true;
        }
        return false;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("data_ordering", "APPROXIMATED_EARNINGS");
        A1G.put(AbstractC43591JPw.A00(481), "ONE_YEAR");
        A1G.put("target_id", userSession.userId);
        C66277U6x A01 = C66277U6x.A01("com.instagram.insights.account.media_grid.igtv.container", A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131964392);
        A01.A04(fragmentActivity, A0C);
    }

    public static final boolean A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, boolean z) {
        Boolean BwW = user.A03.BwW();
        if (BwW != null && BwW.booleanValue()) {
            C1o1 c1o1 = C1o1.A01;
            if (c1o1 != null) {
                if (c1o1.A00 != null) {
                    C140966Yy A0N = AbstractC31174DnI.A0N(new C53Z(), fragmentActivity, userSession);
                    if (z) {
                        A0N.A0D = false;
                    }
                    A0N.A04();
                    return false;
                }
                C14360o3.A0F("fragmentFactory");
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
        }
        C006802i.A0p.markerStart(39124996);
        C006802i.A0p.markerAnnotate(39124996, AbstractC111324zv.A00(1013), "redesign");
        C62862tP A01 = C62862tP.A01(null, fragmentActivity, interfaceC11380iw, userSession);
        AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.insights.account.timeframe.summary", null);
        C32393EOu.A00(A05, fragmentActivity, A01, userSession, 1);
        C1GJ.A00(fragmentActivity, AbstractC018607g.A00(fragmentActivity), A05);
        return true;
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, Map map, boolean z, boolean z2, boolean z3) {
        int i;
        String string;
        int i2;
        AbstractC167017dG.A1O(userSession, str);
        map.put("target_id", str);
        map.put("origin", str2);
        C006802i c006802i = C006802i.A0p;
        if (z2) {
            i = 39130588;
            string = fragmentActivity.getString(2131976707);
            i2 = 820;
        } else if (z3) {
            i = 39137013;
            string = fragmentActivity.getString(2131955545);
            i2 = 2138;
        } else if (z) {
            i = 39124993;
            string = null;
            i2 = 818;
        } else {
            i = 39124994;
            string = fragmentActivity.getString(2131969801);
            i2 = 816;
        }
        String A00 = AbstractC111324zv.A00(i2);
        c006802i.markerStart(i);
        c006802i.markerAnnotate(i, AbstractC111324zv.A00(2170), A00);
        c006802i.markerAnnotate(i, AbstractC111324zv.A00(1013), "umi");
        AbstractC167007dF.A0J().postDelayed(new GNY(c006802i, i), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        C66277U6x A01 = C66277U6x.A01(A00, map);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0U = string;
        A0C.A03 = new EOY(i, 0);
        A01.A04(fragmentActivity, A0C);
    }
}
