package X;

import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lxn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49718Lxn implements InterfaceC42241xE {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C158797Aq A02;
    public final /* synthetic */ MRJ A03;
    public final /* synthetic */ IgProgressImageView A04;

    public C49718Lxn(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C158797Aq c158797Aq, MRJ mrj, IgProgressImageView igProgressImageView) {
        this.A02 = c158797Aq;
        this.A04 = igProgressImageView;
        this.A03 = mrj;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImageUrl imageUrl = (ImageUrl) obj;
        C158797Aq c158797Aq = this.A02;
        C38321qM c38321qM = c158797Aq.A0E;
        if (c38321qM != null) {
            this.A04.setExpiration(c38321qM.A18());
        }
        IgProgressImageView igProgressImageView = this.A04;
        igProgressImageView.setPostProcessor(null);
        JUO.A00(imageUrl, this.A03);
        igProgressImageView.setEnableProgressBar(!c158797Aq.A0u);
        igProgressImageView.setUrl(this.A01, imageUrl, this.A00);
        igProgressImageView.setAspectRatio(c158797Aq.A02);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
