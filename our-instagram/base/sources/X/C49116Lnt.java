package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Lnt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49116Lnt implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;
    public final C162907Rb A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49158Lob c49158Lob = new C49158Lob(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_animated_sticker_message_with_big_heart, false));
        this.A03.A00(c49158Lob);
        return c49158Lob;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49158Lob c49158Lob = (C49158Lob) c7qd;
        KT9 kt9 = (KT9) interfaceC129555tK;
        AbstractC167017dG.A1N(c49158Lob, kt9);
        String A00 = kt9.BSy().A00();
        if (A00 != null) {
            ((C7W5) this.A02).CkQ(A00, kt9.CVC());
        }
        IgImageView igImageView = c49158Lob.A03;
        Object tag = igImageView.getTag();
        String A002 = kt9.BSy().A00();
        if (A002 == null || !A002.equals(tag)) {
            igImageView.setTag(kt9.BSy().A00());
            Context context = igImageView.getContext();
            TypedImageUrl typedImageUrl = kt9.A00;
            ImageUrl imageUrl = typedImageUrl.A00;
            if (typedImageUrl.A02) {
                GifUrlImpl gifUrlImpl = new GifUrlImpl(imageUrl.getUrl(), imageUrl.getWidth(), imageUrl.getHeight());
                AbstractC167007dF.A1C(context);
                igImageView.setImageDrawable(AbstractC46825KnK.A00(context, this.A01, gifUrlImpl, Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.ad_tag_max_width)), kt9.BSy().A01));
            } else {
                igImageView.setUrl(imageUrl, this.A00);
            }
            igImageView.setContentDescription(kt9.A01);
        }
        this.A03.A02(c49158Lob, kt9);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49158Lob c49158Lob = (C49158Lob) c7qd;
        C14360o3.A0B(c49158Lob, 0);
        c49158Lob.A03.setTag(null);
        this.A03.A01(c49158Lob);
    }

    public C49116Lnt(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, C162907Rb c162907Rb) {
        this.A01 = userSession;
        this.A03 = c162907Rb;
        this.A00 = interfaceC11380iw;
        this.A02 = interfaceC165247aD;
    }
}
