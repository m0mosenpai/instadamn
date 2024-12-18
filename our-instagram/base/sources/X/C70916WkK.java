package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.WkK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70916WkK implements C3Y7 {
    public C75113Zb A00;
    public final View A01;
    public final C3W4 A02;
    public final C3Y8 A03;
    public final IgProgressImageView A04;
    public final MediaActionsView A05;
    public final MediaFrameLayout A06;

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
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
    public final C3W4 Adr() {
        return this.A02;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A05;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A04;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A06;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A00;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A06;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A05.getWidth();
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        this.A04.A06(i);
    }

    public C70916WkK(View view) {
        this.A04 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.fixed_media_header_image);
        this.A01 = AbstractC166997dE.A0S(view, R.id.fixed_media_header_overlay);
        this.A06 = (MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.fixed_media_header_container);
        this.A03 = new C3Y8((ViewStub) view.requireViewById(R.id.fixed_media_header_play_button_stub));
        this.A05 = (MediaActionsView) AbstractC166997dE.A0R(view, R.id.fixed_media_header_media_actions);
        this.A02 = new C3W4((ViewStub) view.requireViewById(R.id.fixed_media_header_audio_icon_stub));
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        AbstractC167017dG.A1N(imageUrl, interfaceC11380iw);
        this.A04.A09(interfaceC11380iw, imageUrl, z);
    }
}
