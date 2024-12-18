package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;

/* renamed from: X.EUz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32549EUz extends C1P1 {
    public static final InterfaceC37178GZp A0D = new GFB();
    public FragmentActivity A00;
    public InterfaceC37178GZp A01 = A0D;
    public GYF A02 = new GFD(this);
    public RegFlowExtras A03;
    public C33629Etf A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final C07270a1 A08;
    public final EnumC33445EqI A09;
    public final Integer A0A;
    public final String A0B;
    public final GY6 A0C;

    public static void A00(UserSession userSession, AbstractC32549EUz abstractC32549EUz, User user, boolean z) {
        C33629Etf c33629Etf = abstractC32549EUz.A04;
        if (c33629Etf != null && c33629Etf.A02) {
            c33629Etf.A00();
        }
        if (!z) {
            abstractC32549EUz.A03(user);
            C3BH.A00().A02(abstractC32549EUz.A07, userSession, abstractC32549EUz.A09, AbstractC167007dF.A1T(user.A03.AbE()), false, true, false, abstractC32549EUz.A06);
            return;
        }
        if (!(!C1AD.A06(C06090Tz.A05, 18316923120927991L)) || !(abstractC32549EUz instanceof C33086Eij)) {
            return;
        }
        C33086Eij c33086Eij = (C33086Eij) abstractC32549EUz;
        AbstractC59962oe abstractC59962oe = c33086Eij.A01;
        AbstractC31525Dt9.A08(abstractC59962oe.requireActivity(), c33086Eij.A02, userSession);
        C34907FZt.A00 = null;
        C35146Fen.A02(abstractC59962oe.requireContext());
    }

    public final void A01(C07270a1 c07270a1, User user, C1Q9 c1q9, boolean z, boolean z2) {
        String str;
        if (c1q9 == C1Q9.A0u) {
            String id = user.getId();
            String str2 = this.A09.A00;
            Integer num = this.A0A;
            if (num != null) {
                str = AbstractC34293FAn.A00(num);
            } else {
                str = null;
            }
            String str3 = this.A0B;
            C14360o3.A0B(c07270a1, 0);
            FD1.A00(c07270a1, null, "done", id, str2, str, str3);
        } else {
            String id2 = user.getId();
            C25531Mh A00 = FD7.A00(c07270a1, this.A0A, this.A09.A00, "consumer", id2, this.A0B);
            this.A01.AOO(A00, C1Q9.A1I, null);
            A00.Cht();
        }
        C07270a1 c07270a12 = this.A08;
        Context context = this.A07;
        UserSession A02 = AbstractC31525Dt9.A02(context, null, c07270a12, user, null, false);
        if (!z) {
            VPV.A00(context, A02).A01(EnumC33361Eou.A05);
        }
        if (z2) {
            C1GJ.A03(new G0C(A02, this, user, z));
        } else {
            A00(A02, this, user, z);
        }
    }

    public final void A04(String str, Integer num) {
        GY6 gy6 = this.A0C;
        if (gy6 != null) {
            gy6.Eks(str, num);
        } else {
            C41451vu.A01.E4s(new C36047Fvj(str, num));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Etf] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Uzp, X.EkO] */
    public AbstractC32549EUz(Fragment fragment, C07270a1 c07270a1, GY6 gy6, RegFlowExtras regFlowExtras, EnumC33445EqI enumC33445EqI, Integer num, String str, boolean z, boolean z2, boolean z3) {
        this.A08 = c07270a1;
        this.A0C = gy6;
        this.A07 = fragment.getContext();
        this.A09 = enumC33445EqI;
        this.A0A = num;
        this.A0B = str;
        ?? c67858Uzp = new C67858Uzp();
        c67858Uzp.A00 = z;
        ?? obj = new Object();
        obj.A00 = fragment;
        obj.A01 = c67858Uzp;
        this.A04 = obj;
        this.A03 = regFlowExtras;
        this.A00 = fragment.getActivity();
        this.A05 = z2;
        this.A06 = z3;
    }

    public void A02(EDQ edq) {
        C1Q9 c1q9;
        int A03 = C0f9.A03(1589469580);
        User user = edq.A01;
        user.A03.Edl(edq.A02);
        boolean z = edq.A06;
        boolean z2 = edq.A05;
        if (z2) {
            c1q9 = C1Q9.A0u;
        } else {
            c1q9 = C1Q9.A1I;
        }
        A01(this.A08, user, c1q9, z2, z);
        C0f9.A0A(1740980549, A03);
    }

    public void A03(User user) {
        user.A03.EYn(AbstractC25227BEk.A0p());
        AbstractC31177DnL.A1O(user);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(132518277);
        this.A02.ADL(abstractC115105If, new FPP(this));
        C0f9.A0A(-1501313004, A03);
    }

    @Override // X.C1P1
    public void onStart() {
        int i;
        int A03 = C0f9.A03(-463206009);
        C33629Etf c33629Etf = this.A04;
        if (c33629Etf != null && c33629Etf.A02) {
            i = 1851793246;
        } else {
            c33629Etf.A01();
            i = 259848533;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1189645139);
        A02((EDQ) obj);
        C0f9.A0A(2055009702, A03);
    }
}
