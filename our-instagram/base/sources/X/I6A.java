package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes7.dex */
public abstract class I6A {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPj jPj, IIF iif, INQ inq, EnumC39541HdD enumC39541HdD, C39349HZo c39349HZo) {
        boolean A1R = AbstractC167007dF.A1R(0, iif, c39349HZo);
        AbstractC25234BEr.A1R(enumC39541HdD, inq, interfaceC11380iw, userSession, jPj);
        I68.A00(userSession, jPj, iif.A02, c39349HZo);
        MediaFrameLayout mediaFrameLayout = iif.A03;
        mediaFrameLayout.A00 = ((IN1) c39349HZo).A00;
        if (enumC39541HdD != EnumC39541HdD.A02) {
            inq.A01(mediaFrameLayout);
        }
        ExtendedImageUrl A00 = c39349HZo.A00(iif.A00);
        if (A00 != null) {
            iif.A01.setUrl(A00, interfaceC11380iw);
        }
        AbstractC37304Gc5.A0v(iif.A01, enumC39541HdD, EnumC39541HdD.A03, A1R);
    }
}
