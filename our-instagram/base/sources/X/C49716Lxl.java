package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lxl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49716Lxl implements InterfaceC42241xE {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C7E8 A01;
    public final /* synthetic */ C158797Aq A02;
    public final /* synthetic */ IgProgressImageView A03;

    public C49716Lxl(InterfaceC11380iw interfaceC11380iw, C7E8 c7e8, C158797Aq c158797Aq, IgProgressImageView igProgressImageView) {
        this.A03 = igProgressImageView;
        this.A02 = c158797Aq;
        this.A01 = c7e8;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImageUrl imageUrl = (ImageUrl) obj;
        IgProgressImageView igProgressImageView = this.A03;
        igProgressImageView.setEnableProgressBar(!this.A02.A0u);
        UserSession userSession = this.A01.A00;
        C14360o3.A0A(imageUrl);
        igProgressImageView.setUrl(userSession, imageUrl, this.A00);
    }
}
