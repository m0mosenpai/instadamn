package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubCustomizedBenefitsRepository;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DyB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31792DyB extends C193578hc {
    public static final List A0A = AbstractC16960so.A1Q(new C32084E8i(2131957364, 2131957365, true, false), new C32084E8i(2131957348, 2131957349, true, true), new C32084E8i(2131957362, 2131957363, true, true), new C32084E8i(2131957338, 2131957339, false, true), new C32084E8i(2131957336, 2131957337, false, true), new C32084E8i(2131957346, 2131957347, false, true), new C32084E8i(2131957352, 2131957353, false, true), new C32084E8i(2131957360, 2131957361, false, true), new C32084E8i(2131957350, 2131957351, false, true), new C32084E8i(2131957344, 2131957345, false, true), new C32084E8i(2131957358, 2131957359, false, true), new C32084E8i(2131957342, 2131957343, false, true), new C32084E8i(2131957356, 2131957357, false, true), new C32084E8i(2131957340, 2131957341, false, true), new C32084E8i(2131957354, 2131957355, false, true), new C32084E8i(2131957366, 2131957367, false, true));
    public List A00;
    public final UserSession A01;
    public final FanClubCustomizedBenefitsRepository A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C99694dm A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31792DyB(Application application, UserSession userSession, C99694dm c99694dm, FanClubCustomizedBenefitsRepository fanClubCustomizedBenefitsRepository, String str, List list) {
        super(application);
        C14360o3.A0B(application, 1);
        AbstractC25234BEr.A1R(userSession, str, list, fanClubCustomizedBenefitsRepository, c99694dm);
        this.A01 = userSession;
        this.A09 = str;
        this.A00 = list;
        this.A02 = fanClubCustomizedBenefitsRepository;
        this.A08 = c99694dm;
        C008002u A00 = C10E.A00(C32913Edu.A00);
        this.A04 = A00;
        this.A07 = A00;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A05 = A0o;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A06 = A1A;
        this.A03 = new C31199Dni(15, new InterfaceC19390xP[]{A0o, A1A}, this);
        String str2 = userSession.userId;
        C14360o3.A0B(str2, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_customized_benefits_selection_screen_impression");
        AbstractC31171DnF.A1I(A0f, "fan_club_custom_benefits_selection");
        AbstractC31178DnM.A17(A0f, str2);
        AbstractC31180DnO.A1I(A0f, str);
    }

    public static final void A00(C31792DyB c31792DyB) {
        c31792DyB.A04.Egh(new C32910Edr(BHS.A00(new Object[0], 2131974293), EnumC141996bI.A05));
        AbstractC166997dE.A1Y(c31792DyB.A06, false);
    }

    public static final void A01(C31792DyB c31792DyB, int i) {
        for (C32084E8i c32084E8i : AbstractC001800i.A0c(AbstractC31172DnG.A0w(c31792DyB.A05), 1)) {
            if (!c32084E8i.A01) {
                c32084E8i.A00 = AbstractC167007dF.A1Q(i, 8);
            }
        }
    }

    public final List A0E(List list) {
        List<C32084E8i> list2 = A0A;
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        for (C32084E8i c32084E8i : list2) {
            Application A0D = A0D();
            int i = c32084E8i.A03;
            A0q.add(new C32084E8i(i, c32084E8i.A02, list.contains(A0D.getString(i)), c32084E8i.A00));
        }
        return A0q;
    }

    public final void A0F() {
        C99694dm c99694dm = this.A08;
        String str = this.A01.userId;
        String str2 = this.A09;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_customized_benefits_selection_screen_save_button_tap");
        AbstractC31171DnF.A1I(A0f, "fan_club_custom_benefits_selection");
        AbstractC31178DnM.A17(A0f, str);
        AbstractC31180DnO.A1I(A0f, str2);
        AbstractC166987dD.A1Z(new MBp(this, null, 5), AbstractC141776au.A00(this));
    }
}
