package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.HKo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39135HKo extends HGS {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final EnumC114765Gh A03;
    public final C147066ji A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C39135HKo(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, EnumC114765Gh enumC114765Gh, boolean z, boolean z2, boolean z3) {
        super(fragmentActivity, userSession, c38321qM);
        this.A00 = fragmentActivity;
        this.A04 = new C147066ji(super.A01, fragmentActivity);
        this.A05 = z;
        this.A07 = c38321qM.A60();
        this.A08 = z2;
        this.A03 = enumC114765Gh;
        this.A06 = z3;
        this.A02 = c38321qM;
        this.A01 = userSession;
    }

    @Override // X.HGS, X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-585947417);
        super.onFail(abstractC115105If);
        if (this.A06) {
            AbstractC37765Gjg.A00.A01(2131957623, Integer.valueOf(R.drawable.instagram_error_pano_outline_24));
            AbstractC40629Hzn.A00("mutation_fail_instagram_only", this.A01, this.A02);
        }
        C0f9.A0A(1669701105, A03);
    }

    @Override // X.HGS, X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(528392221);
        super.onFinish();
        if (!this.A05) {
            this.A04.A00(null, false);
        }
        C0f9.A0A(1556853920, A03);
    }

    @Override // X.HGS, X.C1P1
    public void onSuccess(Object obj) {
        UserSession userSession;
        C38321qM c38321qM;
        String str;
        int A03 = C0f9.A03(1305000463);
        C38321qM c38321qM2 = super.A02;
        EnumC40111tc BRp = c38321qM2.BRp();
        InterfaceC11380iw interfaceC11380iw = new InterfaceC11380iw() { // from class: X.Imu
            public static final String __redex_internal_original_name = "DeleteMediaCallback$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "activity_center";
            }
        };
        EnumC114765Gh enumC114765Gh = this.A03;
        if (enumC114765Gh != null) {
            Integer num = C05F.A01;
            UserSession userSession2 = super.A01;
            String A2u = c38321qM2.A2u();
            A2u.getClass();
            IT8.A00(interfaceC11380iw, userSession2, enumC114765Gh, num, A2u);
        } else if (BRp == EnumC40111tc.A0Q || BRp == EnumC40111tc.A09 || BRp == EnumC40111tc.A0a) {
            InterfaceC37071o5 A00 = C37091o7.A00();
            UserSession userSession3 = super.A01;
            FragmentActivity fragmentActivity = this.A00;
            EnumC39589Hdz enumC39589Hdz = EnumC39589Hdz.A0I;
            String A2u2 = c38321qM2.A2u();
            A2u2.getClass();
            A00.API(fragmentActivity, interfaceC11380iw, userSession3, c38321qM2.BRp(), enumC39589Hdz, A2u2);
        }
        if (c38321qM2.A0C.Bns() != null) {
            c38321qM2.A0C.Eck(null);
            UserSession userSession4 = super.A01;
            AbstractC25651Mw.A00(userSession4).E4s(new C42239InP(c38321qM2));
            AbstractC25651Mw.A00(userSession4).E4s(new C70143Cy(c38321qM2));
            String string = this.A00.getResources().getString(2131972419);
            ImageUrl A1S = c38321qM2.A1S();
            A1S.getClass();
            C14360o3.A0B(string, 0);
            C146106i8 A0X = AbstractC31173DnH.A0X(string);
            A0X.A09 = A1S;
            A0X.A03();
            AbstractC31178DnM.A1S(A0X);
        } else {
            int i = 1;
            if (c38321qM2.A5g()) {
                i = 3;
            }
            c38321qM2.A00 = i;
            c38321qM2.A4L(C05F.A0C);
            super.onSuccess(obj);
            UserSession userSession5 = super.A01;
            User A2E = c38321qM2.A2E(userSession5);
            A2E.getClass();
            if (!this.A07 && !c38321qM2.A5P()) {
                A2E.A0W();
            }
            A2E.A0c(userSession5);
            if (c38321qM2.A1z() == ProductType.CLIPS) {
                FragmentActivity fragmentActivity2 = this.A00;
                AbstractC40913IAl.A00(userSession5, fragmentActivity2, "feed");
                if (this.A08) {
                    AbstractC167007dF.A1K(fragmentActivity2, userSession5);
                    C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity2, userSession5);
                    A0P.A0B(null, AbstractC54311NzV.A00(null, userSession5, false));
                    A0P.A04();
                }
            }
        }
        if (this.A06 && (obj instanceof H9U)) {
            C38622GyP c38622GyP = ((H9U) obj).A00;
            if (c38622GyP == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            if (c38622GyP.A01) {
                userSession = this.A01;
                c38321qM = this.A02;
                str = "mutation_success_instagram_only";
            } else {
                AbstractC37765Gjg.A00.A01(2131957623, Integer.valueOf(R.drawable.instagram_error_pano_outline_24));
                userSession = this.A01;
                c38321qM = this.A02;
                str = "mutation_fail_instagram_only";
            }
            AbstractC40629Hzn.A00(str, userSession, c38321qM);
        }
        C0f9.A0A(1518770121, A03);
    }
}
