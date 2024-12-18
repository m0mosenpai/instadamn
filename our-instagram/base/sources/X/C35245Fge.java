package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35245Fge {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C34921Fa7 A03;
    public final boolean A04;

    private final void A00(C189478aR c189478aR, boolean z) {
        String str;
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36311324262728184L)) {
            C34921Fa7.A00(this.A03, "message_setting_icebreaker_impression");
            ((C36292Fzm) C31651DvH.A00(userSession, C36292Fzm.class, 4)).A03();
            FragmentActivity fragmentActivity = this.A00;
            String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131962823);
            if (z) {
                str = fragmentActivity.getString(2131959572);
            } else {
                str = null;
            }
            A04(this, c189478aR, A0p, str, 31);
        }
    }

    private final void A01(C189478aR c189478aR, boolean z) {
        String str;
        UserSession userSession = this.A02;
        JUI A00 = JUJ.A00(userSession);
        if (!A00.A02) {
            A00.A05();
        }
        if (!C7I2.A00(userSession)) {
            C14360o3.A0B(userSession, 0);
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!AbstractC31177DnL.A1U(c06090Tz, userSession, 36315194028264555L) && !C18U.A06(c06090Tz, userSession, 36316173280743515L)) {
                return;
            }
        }
        C34921Fa7.A00(this.A03, "message_settings_response_suggestions_impression");
        FragmentActivity fragmentActivity = this.A00;
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131960377);
        if (z) {
            str = fragmentActivity.getString(2131960376);
        } else {
            str = null;
        }
        A04(this, c189478aR, A0p, str, 33);
    }

    private final void A02(C189478aR c189478aR, boolean z) {
        String str;
        UserSession userSession = this.A02;
        if (AbstractC31270Dos.A00(userSession)) {
            C34921Fa7.A00(this.A03, "message_setting_saved_replies_impression");
            JUI A00 = JUJ.A00(userSession);
            if (!A00.A02) {
                A00.A05();
            }
            FragmentActivity fragmentActivity = this.A00;
            String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131960374);
            if (z) {
                str = fragmentActivity.getString(2131960373);
            } else {
                str = null;
            }
            A04(this, c189478aR, A0p, str, 34);
        }
    }

    private final void A03(C189478aR c189478aR, boolean z) {
        String str;
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A06, userSession, 36314042977159555L)) {
            C34921Fa7.A00(this.A03, "message_setting_welcome_message_impression");
            F3H.A00(this.A01, userSession).A00();
            FragmentActivity fragmentActivity = this.A00;
            String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131977044);
            if (z) {
                str = fragmentActivity.getString(2131960891);
            } else {
                str = null;
            }
            A04(this, c189478aR, A0p, str, 35);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.EtI] */
    public static void A04(Object obj, Object obj2, String str, String str2, int i) {
        FpQ fpQ = new FpQ(i, obj, obj2);
        ?? obj3 = new Object();
        obj3.A02 = str;
        obj3.A01 = str2;
        obj3.A00 = fpQ;
        E03.A01.add(obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.EtI] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.EIE, androidx.fragment.app.Fragment, X.2oe] */
    public final void A05() {
        String str;
        C189448aO A0y = AbstractC25225BEi.A0y(this.A02);
        boolean z = this.A04;
        if (!z) {
            AbstractC25226BEj.A1M(this.A00, A0y, 2131959658);
        }
        C189478aR A00 = A0y.A00();
        ?? abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.A03 = z;
        List list = E03.A01;
        list.clear();
        if (z) {
            A00(A00, z);
            A02(A00, z);
            A03(A00, z);
            A01(A00, z);
        } else {
            A01(A00, z);
            A02(A00, z);
            A00(A00, z);
            A03(A00, z);
        }
        C34921Fa7.A00(this.A03, "message_setting_message_control_impression");
        FragmentActivity fragmentActivity = this.A00;
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131966409);
        if (z) {
            str = fragmentActivity.getString(2131959868);
        } else {
            str = null;
        }
        FpQ fpQ = new FpQ(32, this, A00);
        ?? obj = new Object();
        obj.A02 = A0p;
        obj.A01 = str;
        obj.A00 = fpQ;
        list.add(obj);
        A00.A02(fragmentActivity, abstractC59962oe);
    }

    public C35245Fge(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A03 = new C34921Fa7(interfaceC11380iw, userSession);
        this.A04 = C18U.A06(C06090Tz.A06, userSession, 36319046614260636L);
    }
}
