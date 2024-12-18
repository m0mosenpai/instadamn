package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gju, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37779Gju extends C03E implements InterfaceC16610sE {
    public C37779Gju(Object obj) {
        super(3, obj, C31410DrF.class, "launchPbiaProfileFragment", "launchPbiaProfileFragment(Lcom/instagram/pbiaproxyprofile/intf/PBIAProxyProfileLaunchConfig;Lcom/instagram/feed/media/Media;Lcom/instagram/feed/ui/state/MediaState;)V", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        IJ2 ij2 = (IJ2) obj;
        C38321qM c38321qM = (C38321qM) obj2;
        C75113Zb c75113Zb = (C75113Zb) obj3;
        AbstractC167027dH.A12(ij2, c38321qM, c75113Zb);
        C31410DrF c31410DrF = (C31410DrF) this.receiver;
        FragmentActivity fragmentActivity = c31410DrF.A00;
        UserSession userSession = c31410DrF.A01;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        HD4 hd4 = new HD4();
        hd4.setArguments(AbstractC40761I4p.A00(ij2));
        A0P.A0D(hd4);
        A0P.A04();
        if (c75113Zb.A1o && C25375BKs.A03(userSession, c38321qM)) {
            AbstractC167017dG.A0y(fragmentActivity, C3DN.A00);
        }
        return C0eB.A00;
    }
}
