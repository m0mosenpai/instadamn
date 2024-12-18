package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gjt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37778Gjt extends C03E implements InterfaceC16660sJ {
    public C37778Gjt(Object obj) {
        super(1, obj, C31410DrF.class, "launchPbiaProfile", "launchPbiaProfile(Lcom/instagram/pbiaproxyprofile/intf/PBIAProxyProfileLaunchConfig;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IJ2 ij2 = (IJ2) obj;
        C31410DrF c31410DrF = (C31410DrF) AbstractC25229BEm.A0o(ij2, this);
        UserSession userSession = c31410DrF.A01;
        AbstractC31177DnL.A0o(c31410DrF.A00, AbstractC40761I4p.A00(ij2), userSession, "pbia_proxy_profile");
        return C0eB.A00;
    }
}
