package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gjs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37777Gjs extends C03E implements InterfaceC16620sF {
    public C37777Gjs(Object obj) {
        super(2, obj, C31410DrF.class, "launchWhatsAppProfile", "launchWhatsAppProfile(Lcom/instagram/feed/media/Media;Lcom/instagram/feed/ui/state/MediaState;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        C38321qM c38321qM = (C38321qM) obj;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C31410DrF c31410DrF = (C31410DrF) this.receiver;
        C41607Iaw c41607Iaw = C41607Iaw.A00;
        UserSession userSession = c31410DrF.A01;
        FragmentActivity fragmentActivity = c31410DrF.A00;
        InterfaceC39541sb A0F = AbstractC37300Gc1.A0F(c38321qM);
        if (A0F == null || (str = A0F.AZR()) == null) {
            str = "";
        }
        c41607Iaw.A00(fragmentActivity, userSession, c38321qM, c75113Zb, null, str);
        return C0eB.A00;
    }
}
