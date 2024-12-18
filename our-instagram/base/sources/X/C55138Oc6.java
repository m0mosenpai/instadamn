package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Iterator;

/* renamed from: X.Oc6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55138Oc6 {
    public int A00;
    public int A01;
    public final UserSession A02;
    public final C55103ObG A03;
    public final C54843OMo A04;
    public final ClipsCreationViewModel A05;
    public final C187358Sd A06;
    public final C50868Mdz A07;
    public final C87H A08;
    public final InterfaceC16660sJ A09;
    public final Context A0A;
    public final C07X A0B;
    public final NI5 A0C;
    public final ClipsStackedTimelineViewController A0D;

    public C55138Oc6(Context context, C07X c07x, UserSession userSession, C55103ObG c55103ObG, C54843OMo c54843OMo, NI5 ni5, ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C50868Mdz c50868Mdz, C87H c87h, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A0A = context;
        this.A0B = c07x;
        this.A0D = clipsStackedTimelineViewController;
        this.A05 = clipsCreationViewModel;
        this.A06 = c187358Sd;
        this.A08 = c87h;
        this.A03 = c55103ObG;
        this.A0C = ni5;
        this.A04 = c54843OMo;
        this.A07 = c50868Mdz;
        this.A09 = interfaceC16660sJ;
        AbstractC31178DnM.A11(c07x, PZJ.A01(this, null, 35), c50868Mdz.A0Q);
        ClipsTimelineActionBarViewController.A01(new ViewOnClickListenerC55460OkF(this, 10), EnumC53325Ni3.A0X, clipsStackedTimelineViewController.A0C);
    }

    public static final C115475Kh A00(C55138Oc6 c55138Oc6, int i) {
        C84B A0N = MSY.A0N(c55138Oc6.A05);
        if (A0N != null) {
            return MSW.A0V(A0N, i);
        }
        return null;
    }

    public static final void A01(C55138Oc6 c55138Oc6) {
        C187518St c187518St;
        C187358Sd c187358Sd = c55138Oc6.A06;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if ((A0E instanceof C187518St) && (c187518St = (C187518St) A0E) != null) {
            int i = c187518St.A00;
            C115475Kh A00 = A00(c55138Oc6, i);
            if (A00 != null && A00.A09 != c55138Oc6.A01 && A00.A08 != c55138Oc6.A00) {
                A00.A0Q = true;
            }
            c55138Oc6.A01 = 0;
            c55138Oc6.A00 = 0;
            C55103ObG c55103ObG = c55138Oc6.A03;
            Iterator A01 = C55103ObG.A01(c55103ObG);
            while (A01.hasNext()) {
                MSY.A0x(MSW.A0T(A01).A08);
            }
            Iterator A002 = C55103ObG.A00(c55103ObG);
            while (A002.hasNext()) {
                MSY.A0x(MSW.A0T(A002).A08);
            }
            c55138Oc6.A04.A02(1.0f);
            C87H c87h = c55138Oc6.A08;
            c87h.A01();
            AbstractC43592JPx.A19(i, c55138Oc6.A09);
            MSX.A1L(c187358Sd, i);
            c87h.A04();
            return;
        }
        AbstractC12120kG.A07("ClipsTimelineSlipController", "Attempted to exit slip state when not in Slip state", null);
    }

    public static final void A02(C55138Oc6 c55138Oc6) {
        C187518St c187518St;
        C84B A0N;
        int i;
        AbstractC187378Sf A0E = c55138Oc6.A06.A0E();
        if ((A0E instanceof C187518St) && (c187518St = (C187518St) A0E) != null && (A0N = MSY.A0N(c55138Oc6.A05)) != null) {
            int i2 = c187518St.A00;
            int A01 = A0N.A01(i2);
            C115475Kh A00 = A00(c55138Oc6, i2);
            if (A00 != null) {
                i = MSW.A05(A00);
            } else {
                i = 0;
            }
            C87H c87h = c55138Oc6.A08;
            c87h.A08(A01, i + A01);
            MSX.A1B(c87h.A08, true);
        }
    }

    public final void A03() {
        C187518St c187518St;
        AbstractC187378Sf A0E = this.A06.A0E();
        if ((A0E instanceof C187518St) && (c187518St = (C187518St) A0E) != null) {
            ClipsCreationViewModel.A05(this.A05, c187518St.A00, this.A01, this.A00);
        }
        A01(this);
        C448124l A0S = MSW.A0S(this.A02);
        C25531Mh A08 = C25531Mh.A08(A0S.A02);
        EnumC114925Hg A0J = A0S.A0J();
        if (AbstractC25226BEj.A1Z(A08) && A0J != null) {
            MSW.A1W(A08);
            A08.A0q("TIMELINE_SLIP_CANCEL_TAP");
            C448124l.A00(A08, A0S);
            AbstractC50522MSa.A1G(A08, A0J, A0S);
            A08.Cht();
        }
    }

    public final boolean A04() {
        C8TF c8tf;
        C187358Sd c187358Sd = this.A06;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if ((A0E instanceof C8TF) && (c8tf = (C8TF) A0E) != null) {
            int i = c8tf.A00;
            C115475Kh A00 = A00(this, i);
            if (A00 != null) {
                this.A01 = A00.A09;
                this.A00 = A00.A08;
            }
            this.A08.A01();
            c187358Sd.A0G(new C187518St(i));
            return true;
        }
        return false;
    }
}
