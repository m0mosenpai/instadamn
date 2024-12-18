package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.ILl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41197ILl {
    public final InterfaceC30994Djt A00;
    public final UserSession A01;
    public final InterfaceC65702y7 A02;
    public final InterfaceC60442pS A03;

    public C41197ILl(UserSession userSession, InterfaceC65702y7 interfaceC65702y7, InterfaceC30994Djt interfaceC30994Djt, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC30994Djt, 4);
        this.A01 = userSession;
        this.A02 = interfaceC65702y7;
        this.A03 = interfaceC60442pS;
        this.A00 = interfaceC30994Djt;
    }

    public final void A00(C38612GyF c38612GyF, IgProgressImageView igProgressImageView, MediaFrameLayout mediaFrameLayout, int i, boolean z) {
        AbstractC167007dF.A1D(igProgressImageView, 1, c38612GyF);
        InterfaceC65702y7 interfaceC65702y7 = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        mediaFrameLayout.A00 = c38612GyF.A00;
        igProgressImageView.setPostProcessor(interfaceC65702y7);
        igProgressImageView.setProgressiveImageConfig(new C80673iw());
        igProgressImageView.A0A(new C49407Lsf(igProgressImageView, 3), R.id.listener_id_for_thumbnail_media_url_tag);
        AbstractC80683ix.A00(interfaceC60442pS, c38612GyF.A02, igProgressImageView);
        ((InterfaceC16620sF) c38612GyF.A01.A02).invoke(mediaFrameLayout, Integer.valueOf(i));
        if (z) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36329633708327375L)) {
                C0fQ.A00(new LPK(i, 4, c38612GyF, this, mediaFrameLayout), mediaFrameLayout);
                mediaFrameLayout.setOnTouchListener(new ViewOnTouchListenerC42057IkQ(i, 1, mediaFrameLayout, c38612GyF, this));
                AbstractC77703du.A05(igProgressImageView, EnumC77673dr.A0L);
            }
        }
        C0fQ.A00(new ViewOnClickListenerC77633dn(this.A01, null, null, new C30176DRg(i, 10, mediaFrameLayout, c38612GyF, this), true), mediaFrameLayout);
        AbstractC77703du.A05(igProgressImageView, EnumC77673dr.A0L);
    }
}
