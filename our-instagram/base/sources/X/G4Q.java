package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* loaded from: classes6.dex */
public final class G4Q implements InterfaceC165037Zs {
    public final Activity A00;
    public final UserSession A01;
    public final C3G2 A02;
    public final InterfaceC11380iw A03;
    public final C7WA A04;

    public G4Q(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7WA c7wa, C3G2 c3g2) {
        AbstractC167007dF.A1G(interfaceC11380iw, 3, c7wa);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = c3g2;
        this.A04 = c7wa;
    }

    @Override // X.InterfaceC165037Zs
    public final void CrA(String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        C105824pt c105824pt = (C105824pt) this.A04.A00.get(str2);
        if (c105824pt == null) {
            C0w9.A03("DirectThreadFragment_navigateToLiveViewerFromLiveViewerInvite", "Broadcast item wasn't found in the map");
            return;
        }
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        String str3 = c105824pt.A0e;
        str3.getClass();
        String id = c105824pt.A03().getId();
        EnumC109104va enumC109104va = c105824pt.A06;
        if (enumC109104va == null) {
            enumC109104va = EnumC109104va.A0E;
        }
        String obj = enumC109104va.toString();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, obj, 5), "ig_live_viewer_invite_tap");
        A0f.AAP(AbstractC111324zv.A00(4037), obj);
        A0f.AAP("i_pk", str);
        A0f.AAP("m_pk", str3);
        A0f.AAP("a_pk", id);
        A0f.Cht();
        C162337Ov.A0I(interfaceC11380iw, userSession, C2EY.A1B.A00);
        EnumC109104va enumC109104va2 = c105824pt.A06;
        if (enumC109104va2 == null) {
            enumC109104va2 = EnumC109104va.A0E;
        }
        if (enumC109104va2 != EnumC109104va.A08 && enumC109104va2.A00()) {
            return;
        }
        Reel A0G = C1OU.A04(userSession).A0G(c105824pt);
        IT4.A01(this.A00, userSession, A0G, this.A02, null, null, AbstractC166987dD.A1J(A0G), 0, false, false);
    }

    @Override // X.InterfaceC165037Zs
    public final void CrT(String str, String str2, String str3) {
        if (str3 != null) {
            UserSession userSession = this.A01;
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0s, userSession);
            c116875Qr.A1D = str3;
            Activity activity = this.A00;
            AbstractC31171DnF.A1P(activity);
            AbstractC41751IeQ.A01((FragmentActivity) activity, c116875Qr, userSession, false);
            return;
        }
        if (str2 == null) {
            return;
        }
        Cr9(null, str2);
    }

    @Override // X.InterfaceC165037Zs
    public final void Cr9(C47777L8c c47777L8c, String str) {
        C4M5.A00().A04(new C32531EUh(c47777L8c, this, str, 3), this.A01, str, true);
    }
}
