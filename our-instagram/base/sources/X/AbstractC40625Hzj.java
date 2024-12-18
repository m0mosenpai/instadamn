package X;

import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hzj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40625Hzj {
    public static final void A00(MediaControlEventSourceEnum mediaControlEventSourceEnum, MediaControlSurfaceEnum mediaControlSurfaceEnum, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 3);
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        String id = c38321qM.getId();
        if (id != null) {
            String mezqlToken = c38321qM.A0C.getMezqlToken();
            String A1G = AbstractC25226BEj.A1G(c38321qM);
            String Bl8 = c38321qM.A0C.Bl8();
            String A0S = AbstractC37300Gc1.A0S(c38321qM);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            if (num.intValue() != 0) {
                str2 = "discover/media_positive_control_event_undo/";
            } else {
                str2 = "discover/media_positive_control_event/";
            }
            A0c.A0E = str2;
            A0c.A9s("m_pk", id);
            A0c.A0H(AbstractC58358Pty.A00(), str);
            A0c.A0H("surface", mediaControlSurfaceEnum.A00);
            A0c.A0H("event_source", mediaControlEventSourceEnum.A00);
            A0c.A0H("inventory_source", A0S);
            A0c.A9s("recommendation_data", Bl8);
            A0c.A0H("mezql_token", mezqlToken);
            A0c.A0H("ranking_info_token", A1G);
            C1GJ.A03(AbstractC31178DnM.A0K(A0c, "container_module", interfaceC11380iw.getModuleName()));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
