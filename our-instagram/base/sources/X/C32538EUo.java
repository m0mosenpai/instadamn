package X;

import android.content.Context;
import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.EUo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32538EUo extends C1P1 {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final User A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    private final boolean A00(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        Iterator A0i = AbstractC31178DnM.A0i(this.A02);
        while (A0i.hasNext()) {
            C83803oP c83803oP = (C83803oP) A0i.next();
            if (str.equals(c83803oP.A06)) {
                return !C14360o3.A0K(c83803oP.A05, str2);
            }
        }
        return true;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        Boolean valueOf;
        String str;
        int i2;
        int A03 = C0f9.A03(1040896501);
        C32197ECs c32197ECs = (C32197ECs) obj;
        int A032 = C0f9.A03(1475888847);
        C14360o3.A0B(c32197ECs, 0);
        if (this.A05) {
            Context context = this.A00;
            if (context != null && C1AD.A06(C06090Tz.A05, 18312860081994165L)) {
                C2052496p.A00(context, this.A02, AbstractC111324zv.A00(4857), "save_one_tap_user_profile_nonce_fetch");
            }
            if (!C1AD.A06(C06090Tz.A05, 2324155869295753654L)) {
                i = -392312804;
                C0f9.A0A(i, A032);
                C0f9.A0A(1344756495, A03);
            }
        }
        User user = this.A03;
        boolean A00 = A00(user.getId(), c32197ECs.A00);
        if (A00) {
            C83803oP c83803oP = new C83803oP(user, c32197ECs.A00);
            UserSession userSession = this.A02;
            if (C83743oJ.A01(userSession).A04(user.getId()).booleanValue()) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(C83743oJ.A01(userSession).A0J(user.getId()));
            }
            C83743oJ.A01(userSession);
            if (valueOf == null) {
                i2 = 3491;
            } else if (valueOf.booleanValue()) {
                i2 = 3492;
            } else {
                str = "APP_LEVEL_SPI_NO";
                c83803oP.A04 = str;
                C83743oJ.A01(userSession).A0E(c83803oP);
            }
            str = AbstractC111324zv.A00(i2);
            c83803oP.A04 = str;
            C83743oJ.A01(userSession).A0E(c83803oP);
        }
        if (!c32197ECs.A01.isEmpty()) {
            for (OneTapLinkedProfileInfoImpl oneTapLinkedProfileInfoImpl : c32197ECs.A01) {
                String str2 = oneTapLinkedProfileInfoImpl.A02;
                String str3 = oneTapLinkedProfileInfoImpl.A00;
                if (A00(str2, str3)) {
                    C19700xy c19700xy = C17280tP.A4E;
                    if ((!AbstractC001800i.A0u(c19700xy.A00().A09(), str2) && !AbstractC001800i.A0u(c19700xy.A00().A09(), oneTapLinkedProfileInfoImpl.A03)) || this.A06) {
                        C83803oP c83803oP2 = new C83803oP(AbstractC25225BEi.A0t(oneTapLinkedProfileInfoImpl.A01), str2, oneTapLinkedProfileInfoImpl.A03, str3);
                        UserSession userSession2 = this.A02;
                        C83743oJ.A01(userSession2).A0E(c83803oP2);
                        C83743oJ A01 = C83743oJ.A01(userSession2);
                        String str4 = c83803oP2.A06;
                        if (str4 != null) {
                            A01.A08(this.A00, AbstractC31171DnF.A0D("one_tap_login_nonce_callback"), userSession2, true, false, C05F.A06, str4, true);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
            }
        }
        if (c32197ECs.A02) {
            UserSession userSession3 = this.A02;
            Iterator A0i = AbstractC31178DnM.A0i(userSession3);
            while (true) {
                if (!A0i.hasNext()) {
                    break;
                }
                C83803oP c83803oP3 = (C83803oP) A0i.next();
                if (C14360o3.A0K(user.getId(), c83803oP3.A06)) {
                    c83803oP3.A03 = this.A04;
                    c83803oP3.A00 = System.currentTimeMillis();
                    C83743oJ.A01(userSession3).A0E(c83803oP3);
                    break;
                }
            }
        }
        UserSession userSession4 = this.A02;
        C19280xC A002 = C19280xC.A00(this.A01, "ig_onetap_nonce_received");
        A002.A09("multi_tap_enabled", true);
        A002.A0C("guid", AbstractC31174DnI.A0s());
        A002.A09("updated", Boolean.valueOf(A00));
        AbstractC31173DnH.A1S(A002, userSession4);
        i = 659778682;
        C0f9.A0A(i, A032);
        C0f9.A0A(1344756495, A03);
    }

    public C32538EUo(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z, boolean z2) {
        this.A00 = context;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = userSession;
        this.A03 = AbstractC166997dE.A0Y(userSession);
        this.A01 = interfaceC11380iw;
        this.A04 = str;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-2050824323);
        UserSession userSession = this.A02;
        C19280xC A00 = C19280xC.A00(this.A01, "ig_onetap_nonce_response_failed");
        A00.A09("multi_tap_enabled", AbstractC166997dE.A0b());
        A00.A0C("guid", AbstractC31174DnI.A0s());
        AbstractC31173DnH.A1S(A00, userSession);
        String Btn = this.A03.A03.Btn();
        if (Btn != null) {
            C14270nr.A00().A01(new C32668EZs(this, userSession.userId, Btn, 0), 3600000L);
        }
        C0f9.A0A(494012616, A03);
    }
}
