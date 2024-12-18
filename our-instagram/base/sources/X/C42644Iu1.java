package X;

import android.content.Context;
import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Iu1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42644Iu1 implements C3Y7 {
    public Context A00;
    public IgProgressImageView A01;
    public MediaFrameLayout A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C43179J7c.A00);
    public final boolean A04;
    public final UserSession A05;
    public final C75113Zb A06;

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return null;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A06;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        MediaFrameLayout mediaFrameLayout = this.A02;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout.getWidth();
        }
        return 0;
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        IgProgressImageView igProgressImageView = this.A01;
        if (igProgressImageView != null) {
            igProgressImageView.A06(i);
            return;
        }
        throw AbstractC166987dD.A14(AbstractC111324zv.A00(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
    }

    public C42644Iu1(UserSession userSession, C75113Zb c75113Zb, boolean z) {
        this.A05 = userSession;
        this.A06 = c75113Zb;
        this.A04 = z;
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        IgProgressImageView igProgressImageView = this.A01;
        if (igProgressImageView != null) {
            igProgressImageView.setUrl(imageUrl, interfaceC11380iw);
            return;
        }
        throw AbstractC166987dD.A14(AbstractC111324zv.A00(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
    }
}
