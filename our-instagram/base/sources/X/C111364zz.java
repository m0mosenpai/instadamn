package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C111364zz {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass500 A04;
    public final HashSet A05;
    public final HashSet A06;
    public final HashSet A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C111364zz(Context context, UserSession userSession, String str) {
        C14360o3.A0B(context, 1);
        this.A02 = context;
        this.A03 = userSession;
        this.A0C = str;
        this.A04 = new AnonymousClass500(userSession.userId);
        this.A05 = new HashSet();
        this.A06 = new HashSet();
        this.A07 = new HashSet();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0A = C18U.A06(c06090Tz, userSession, 36315722309635580L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36317925627401919L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36316370849501486L);
        this.A0D = C18U.A06(c06090Tz, userSession, 36316370850091316L);
        this.A0E = C18U.A06(c06090Tz, userSession, 36316370849960242L);
        this.A0F = C18U.A06(c06090Tz, userSession, 36316370850025779L);
        this.A01 = (int) C18U.A01(c06090Tz, userSession, 36606324091786680L);
        this.A0B = AnonymousClass502.A00(userSession);
    }

    public final void A05(InterfaceC1116050z interfaceC1116050z) {
        String A00;
        String str = "";
        if (this.A0D && (A00 = A00(C42132Ilg.A00, this)) != null) {
            str = A00;
        }
        UserSession userSession = this.A03;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0P(null, C2045893s.class, C2046093u.class, false);
        String A002 = MSV.A00(277);
        c25621Ms.A0B(A002);
        c25621Ms.A9s("is_prefetch", "true");
        String str2 = this.A04.A00;
        c25621Ms.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        c25621Ms.A0G("x_RESPONSE_SHAPE_LOGGING", str);
        c25621Ms.A0A = A002;
        c25621Ms.A08(C05F.A0Y);
        C1ON A0N = c25621Ms.A0N();
        HashSet hashSet = this.A05;
        EnumC2045493n enumC2045493n = EnumC2045493n.A0D;
        hashSet.add(enumC2045493n);
        C1P3 A003 = C1P2.A00(userSession);
        String A01 = AbstractC2044993i.A01(enumC2045493n, str2);
        C14360o3.A0B(A01, 0);
        C1P3.A00(A003, C207869Hs.A00, null, new N9Y(interfaceC1116050z, this), A0N, null, A01, 21600L, true, false);
    }

    public static final void A01(InterfaceC1116050z interfaceC1116050z, C1ON c1on, C111364zz c111364zz, boolean z) {
        C1P3 A00 = C1P2.A00(c111364zz.A03);
        String A01 = AbstractC2044993i.A01(EnumC2045493n.A0A, c111364zz.A04.A00);
        C14360o3.A0B(A01, 0);
        C1P3.A00(A00, C207869Hs.A00, null, new C52215N9e(interfaceC1116050z, c111364zz, z), c1on, null, A01, 21600L, true, false);
    }

    public static final void A02(InterfaceC1116050z interfaceC1116050z, C111364zz c111364zz) {
        if (c111364zz.A05.isEmpty() && c111364zz.A06.isEmpty() && c111364zz.A07.isEmpty()) {
            c111364zz.A00 = false;
            interfaceC1116050z.AVi("self_profile_background_prefetch");
        }
    }

    public static final void A03(InterfaceC1116050z interfaceC1116050z, C111364zz c111364zz, List list) {
        C38321qM A1e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = (C38321qM) it.next();
            ImageUrl A1S = c38321qM.A1S();
            if (A1S != null) {
                C55946Ose c55946Ose = new C55946Ose(interfaceC1116050z, c111364zz);
                c111364zz.A06.add(c55946Ose);
                C1OG A0J = C25821No.A00().A0J(A1S, "self_profile_background_prefetch");
                A0J.A02(c55946Ose);
                A0J.A0I = true;
                A0J.A0F = false;
                arrayList.add(A0J);
                if (c38321qM.Cff() || (c38321qM.A5M() && (A1e = c38321qM.A1e(c38321qM.A0x())) != null && A1e.Cff())) {
                    if (!c38321qM.A5M() || (c38321qM = c38321qM.A1e(c38321qM.A0x())) != null) {
                        C43059J1z c43059J1z = new C43059J1z(interfaceC1116050z, c111364zz);
                        c111364zz.A07.add(c43059J1z);
                        C4AD c4ad = new C4AD(c38321qM.CFR(), "self_profile_background_prefetch");
                        c4ad.A01(c43059J1z, c111364zz.A01);
                        arrayList2.add(c4ad);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C1OG) it2.next()).A00().E7X();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C4AG.A00(c111364zz.A03).A01((C4AD) it3.next());
        }
    }

    public static final void A04(C111364zz c111364zz, String str, Throwable th) {
        String str2 = c111364zz.A0C;
        if (str2 != null && str2.equals("settings_update")) {
            C0f5 AEp = C18950wb.A01.AEp("SettingsUserUpdate", 245701013);
            AEp.ABW("userid", c111364zz.A04.A00);
            AEp.ABW("fetch_method", str);
            AEp.ERI(th);
            AEp.report();
        }
    }

    public static final String A00(InterfaceC1116050z interfaceC1116050z, C111364zz c111364zz) {
        C55684Oo9 A00 = AbstractC54111Nw9.A00();
        UserSession userSession = c111364zz.A03;
        A00.A00(userSession.userId);
        C1Dk A002 = A00.A00();
        boolean z = c111364zz.A0D;
        if (z) {
            A002.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(A002.hashCode()));
        }
        boolean z2 = c111364zz.A0E;
        if (z2) {
            A002.setEnsureCacheWrite(true);
            A002.setNetworkTimeoutSeconds(4);
        } else if (c111364zz.A0F) {
            A002.setCacheFallbackByDuration_EXPERIMENTAL(4000L);
        }
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C14360o3.A0A(A002);
        A01(interfaceC1116050z, AnonymousClass963.A00(A01.A03(A002)), c111364zz, z2);
        if (z) {
            return String.valueOf(A002.hashCode());
        }
        return null;
    }
}
