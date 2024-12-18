package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Iaz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41610Iaz {
    public static final C41610Iaz A00 = new Object();

    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IID iid, INQ inq, C38376GuD c38376GuD, JPq jPq, IKK ikk, C39349HZo c39349HZo, INL inl) {
        AbstractC167017dG.A1N(userSession, iid);
        AbstractC25234BEr.A1R(c39349HZo, ikk, inq, c38376GuD, jPq);
        AbstractC167007dF.A1I(interfaceC11380iw, 7, inl);
        C41609Iay c41609Iay = C41609Iay.A00;
        IJ5 ij5 = iid.A02;
        new C41580IaT(userSession, jPq, inl);
        c41609Iay.A00(interfaceC11380iw, userSession, ij5, c38376GuD, C41580IaT.A00(c39349HZo, ikk, new C43210J8h(17, ikk, c39349HZo, jPq)));
        if (ikk.A00 != EnumC39541HdD.A02) {
            inq.A01(iid.A03);
        }
        MediaFrameLayout mediaFrameLayout = iid.A03;
        Context context = iid.A00;
        AbstractC37302Gc3.A0o(context, mediaFrameLayout, ikk.A04.A0J, 2131963481);
        ExtendedImageUrl A002 = c39349HZo.A00(context);
        if (A002 != null) {
            iid.A01.setUrl(A002, interfaceC11380iw);
        }
        AbstractC37304Gc5.A0v(iid.A01, ikk.A00, EnumC39541HdD.A03, true);
    }
}
