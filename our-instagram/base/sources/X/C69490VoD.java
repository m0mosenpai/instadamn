package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.VoD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69490VoD {
    public final int A00;
    public final int A01;
    public final FragmentActivity A02;
    public final XIGIGBoostDestination A03;
    public final XDF A04;
    public final BoostFlowType A05;
    public final PromoteLaunchOrigin A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final EnumC39597He7 A09;
    public final C38321qM A0A;
    public final ProductType A0B;
    public final AudioOverlayTrack A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final String[] A0R;

    public C69490VoD(C69667Vt8 c69667Vt8) {
        BoostFlowType boostFlowType;
        XIGIGBoostDestination xIGIGBoostDestination;
        String A00 = c69667Vt8.A00();
        C38321qM c38321qM = c69667Vt8.A0J;
        String str = c69667Vt8.A0K;
        UserSession userSession = c69667Vt8.A0I;
        FragmentActivity fragmentActivity = c69667Vt8.A0G;
        int ordinal = c38321qM.A1b().ordinal();
        if (ordinal != 7) {
            if (ordinal != 5) {
                boostFlowType = BoostFlowType.A07;
            } else {
                boostFlowType = BoostFlowType.A04;
            }
        } else {
            boostFlowType = BoostFlowType.A05;
        }
        InterfaceC11380iw interfaceC11380iw = c69667Vt8.A0H;
        boolean A53 = c38321qM.A53();
        ProductType A1z = c38321qM.A1z();
        String[] A1b = AbstractC31173DnH.A1b(AbstractC009903n.A0I(c38321qM.A6p()), 0);
        EnumC39597He7 A1b2 = c38321qM.A1b();
        EnumC39597He7 enumC39597He7 = EnumC39597He7.A07;
        if (A1b2 == enumC39597He7 && c38321qM.A0C.BZW() == OrganicCTAType.A05) {
            xIGIGBoostDestination = XIGIGBoostDestination.A04;
        } else if (c38321qM.A1b() == enumC39597He7 && !c38321qM.A5P() && c38321qM.A0C.BZW() == OrganicCTAType.A06) {
            xIGIGBoostDestination = XIGIGBoostDestination.A0G;
        } else {
            xIGIGBoostDestination = null;
        }
        boolean z = c69667Vt8.A0D;
        String str2 = c69667Vt8.A05;
        int i = c69667Vt8.A00;
        String str3 = c69667Vt8.A06;
        String str4 = c69667Vt8.A07;
        int i2 = c69667Vt8.A01;
        boolean z2 = c69667Vt8.A0C;
        boolean z3 = c69667Vt8.A0E;
        boolean z4 = c69667Vt8.A0F;
        String str5 = c69667Vt8.A08;
        PromoteLaunchOrigin promoteLaunchOrigin = c69667Vt8.A03;
        XDF xdf = c69667Vt8.A02;
        String str6 = c69667Vt8.A0A;
        AudioOverlayTrack audioOverlayTrack = c69667Vt8.A04;
        String str7 = c69667Vt8.A09;
        boolean A1W = AbstractC167007dF.A1W(c38321qM.A0C.BGH());
        EnumC39597He7 A1b3 = c38321qM.A1b();
        AbstractC25229BEm.A1J(A00, 1, A1b);
        C14360o3.A0B(A1b3, 37);
        this.A0H = A00;
        this.A0A = c38321qM;
        this.A0G = str;
        this.A08 = userSession;
        this.A02 = fragmentActivity;
        this.A05 = boostFlowType;
        this.A07 = interfaceC11380iw;
        this.A0M = A53;
        this.A0B = A1z;
        this.A0R = A1b;
        this.A03 = xIGIGBoostDestination;
        this.A0O = z;
        this.A0D = str2;
        this.A00 = i;
        this.A0E = str3;
        this.A0F = str4;
        this.A01 = i2;
        this.A0N = z2;
        this.A0P = z3;
        this.A0Q = z4;
        this.A0I = str5;
        this.A06 = promoteLaunchOrigin;
        this.A04 = xdf;
        this.A0K = str6;
        this.A0C = audioOverlayTrack;
        this.A0J = str7;
        this.A0L = A1W;
        this.A09 = A1b3;
    }
}
