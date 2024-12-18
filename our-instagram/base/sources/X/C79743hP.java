package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3hP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79743hP implements C3Y7 {
    public Context A00;
    public C3W4 A01;
    public InterfaceC80343iO A02;
    public C3Y8 A03;
    public C86033sa A04;
    public C3Y1 A05;
    public IgProgressImageView A06;
    public C86003sX A07;
    public MediaActionsView A08;
    public MediaFrameLayout A09;
    public final C3YJ A0A = new C3YJ(null, null, null, null, null, null);
    public final String A0B;
    public final boolean A0C;
    public final UserSession A0D;
    public final C75113Zb A0E;

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        A00().setUrl(imageUrl, interfaceC11380iw);
    }

    public final IgProgressImageView A00() {
        IgProgressImageView igProgressImageView = this.A06;
        if (igProgressImageView != null) {
            return igProgressImageView;
        }
        throw new IllegalStateException(AbstractC111324zv.A00(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
    }

    public final MediaFrameLayout A01() {
        MediaFrameLayout mediaFrameLayout = this.A09;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout;
        }
        throw new IllegalStateException("layout view should not be null");
    }

    public final void A02(MediaFrameLayout mediaFrameLayout) {
        this.A09 = mediaFrameLayout;
        if (mediaFrameLayout != null) {
            mediaFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "media_view");
        }
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A08;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A06;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A09;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A0E;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return this.A04;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A09;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        MediaFrameLayout mediaFrameLayout = this.A09;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout.getWidth();
        }
        return 0;
    }

    public C79743hP(UserSession userSession, C75113Zb c75113Zb, String str, boolean z) {
        this.A0B = str;
        this.A0D = userSession;
        this.A0E = c75113Zb;
        this.A0C = z;
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        A00().A06(i);
    }
}
