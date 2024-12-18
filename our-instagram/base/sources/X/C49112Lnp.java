package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lnp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49112Lnp implements C7QC {
    public final InterfaceC11380iw A00;
    public final InterfaceC165247aD A01;
    public final C162907Rb A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49150LoT c49150LoT = new C49150LoT(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_reply_to_author_message, false));
        this.A02.A00(c49150LoT);
        return c49150LoT;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A02.A01(c7qd);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49150LoT c49150LoT = (C49150LoT) c7qd;
        KTA kta = (KTA) interfaceC129555tK;
        AbstractC167017dG.A1N(c49150LoT, kta);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        IgProgressImageView igProgressImageView = c49150LoT.A01;
        igProgressImageView.setAspectRatio(kta.A00);
        igProgressImageView.setExpiration(kta.A01);
        ImageUrl imageUrl = kta.A02;
        if (imageUrl != null) {
            igProgressImageView.setUrl(imageUrl, interfaceC11380iw);
        } else {
            igProgressImageView.A0B(false);
        }
        C7QL c7ql = kta.A03;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        igImageView.setImageRendererAndReset(AbstractC1580577p.A05(igImageView, c7ql));
        this.A02.A02(c49150LoT, kta);
    }

    public C49112Lnp(InterfaceC11380iw interfaceC11380iw, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A01 = interfaceC165247aD;
        this.A00 = interfaceC11380iw;
        this.A02 = new C162907Rb(AbstractC166987dD.A1J(AbstractC1575875s.A01(new C49012Lm0(this), interfaceC165247aD, anonymousClass988)));
    }
}
