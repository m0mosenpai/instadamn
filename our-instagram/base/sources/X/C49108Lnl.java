package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lnl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49108Lnl implements C7QC {
    public final InterfaceC11380iw A00;
    public final InterfaceC165247aD A01;
    public final C162907Rb A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49153LoW c49153LoW = new C49153LoW(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_ar_effect_message, false));
        this.A02.A00(c49153LoW);
        return c49153LoW;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A02.A01(c7qd);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49153LoW c49153LoW = (C49153LoW) c7qd;
        KTC ktc = (KTC) interfaceC129555tK;
        AbstractC167007dF.A1K(c49153LoW, ktc);
        RoundedCornerImageView roundedCornerImageView = c49153LoW.A04;
        roundedCornerImageView.A09();
        TextView textView = c49153LoW.A02;
        textView.setVisibility(8);
        TextView textView2 = c49153LoW.A01;
        textView2.setVisibility(8);
        IgProgressImageView igProgressImageView = c49153LoW.A05;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        igImageView.setImageRendererAndReset(AbstractC1580577p.A05(igImageView, ktc.A02));
        ImageUrl imageUrl = ktc.A01;
        if (imageUrl != null && !AbstractC81033jX.A03(imageUrl)) {
            igProgressImageView.setUrl(imageUrl, this.A00);
        }
        ImageUrl imageUrl2 = ktc.A00;
        if (imageUrl2 != null && !AbstractC81033jX.A03(imageUrl2)) {
            roundedCornerImageView.setUrl(imageUrl2, this.A00);
        }
        String str = ktc.A05;
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        }
        String str2 = ktc.A03;
        if (!TextUtils.isEmpty(str2)) {
            textView2.setVisibility(0);
            textView2.setText(AbstractC166997dE.A0r(AbstractC25228BEl.A0M(c49153LoW.A03), str2, 2131958734));
        }
        this.A02.A02(c49153LoW, ktc);
    }

    public C49108Lnl(InterfaceC11380iw interfaceC11380iw, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A01 = interfaceC165247aD;
        this.A00 = interfaceC11380iw;
        this.A02 = new C162907Rb(AbstractC166987dD.A1J(new C1580177l(null, new C49002Llq(this), new C7Q7(interfaceC165247aD), new C7Q9((InterfaceC165307aJ) interfaceC165247aD, anonymousClass988.A1U), (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false)));
    }
}
