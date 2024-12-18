package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

/* renamed from: X.DrP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31420DrP extends C03E implements InterfaceC16660sJ {
    public C31420DrP(Object obj) {
        super(1, obj, C31410DrF.class, "openProfile", "openProfile(Linstagram/features/clips/viewer/feature/clipsitem/feature/mediainfo/feature/authorinfo/feature/profilepicture/domain/ProfileLaunchInfo;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        CUJ As5;
        InterfaceC16820sZ interfaceC16820sZ;
        C32058E6k c32058E6k = (C32058E6k) obj;
        C14360o3.A0B(c32058E6k, 0);
        C31410DrF c31410DrF = (C31410DrF) this.receiver;
        C120985dq c120985dq = c32058E6k.A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = c31410DrF.A01;
            User user = c32058E6k.A02;
            C31368DqX A02 = AbstractC31402Dr6.A02(userSession, user.getUsername(), c32058E6k.A04, c32058E6k.A03);
            A02.A0O = c32058E6k.A06;
            String id = c38321qM.getId();
            if (id != null) {
                C75113Zb c75113Zb = c32058E6k.A01;
                A02.A04 = new SourceModelInfoParams(id, null, AbstractC25226BEj.A1G(c38321qM), c75113Zb.getPosition(), c75113Zb.A03);
                A02.A0Y = false;
                A02.A0U = c32058E6k.A07;
                if (c120985dq.CdW()) {
                    JI2 ji2 = c31410DrF.A03;
                    if (ji2.CT4(c120985dq, false) && (As5 = ji2.As5()) != null && (interfaceC16820sZ = As5.A03) != null) {
                        interfaceC16820sZ.invoke();
                    }
                    A02.A09 = AbstractC151266rU.A01(userSession, c120985dq.A06());
                }
                if (c38321qM.A1x() == EnumC76383bi.A0C) {
                    if (AbstractC151756sL.A01() && AbstractC151756sL.A00().A04(userSession)) {
                        C35043FcG A0d = AbstractC31174DnI.A0d();
                        String id2 = user.getId();
                        if (C14360o3.A0K(c32058E6k.A05, PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                            str = AbstractC31192Dnb.A00(52, 8, 81);
                        } else {
                            str = "profile_picture";
                        }
                        c38321qM.getId();
                        A0d.A04(c31410DrF.A00, userSession, null, id2, str, true, false);
                    }
                } else {
                    AbstractC25228BEl.A1G(c31410DrF.A00, AbstractC31364DqT.A02().A01(userSession, A02.A03()), userSession, ModalActivity.class, "profile");
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return C0eB.A00;
    }
}
