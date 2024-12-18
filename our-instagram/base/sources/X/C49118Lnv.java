package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Lnv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49118Lnv implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;
    public final C162907Rb A03;
    public final AnonymousClass988 A04;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49160Lod c49160Lod = new C49160Lod(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_static_sticker_message, false));
        this.A03.A00(c49160Lod);
        return c49160Lod;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        double d;
        C49160Lod c49160Lod = (C49160Lod) c7qd;
        C7SY c7sy = (C7SY) interfaceC129555tK;
        AbstractC167007dF.A1K(c49160Lod, c7sy);
        DirectMessageIdentifier directMessageIdentifier = c7sy.A01;
        String str = directMessageIdentifier.A00;
        if (str != null) {
            ((C7W5) this.A02).CkQ(str, c7sy.CVC());
        }
        ImageUrl imageUrl = c7sy.A00;
        String A0w = AbstractC43592JPx.A0w(imageUrl);
        C2EY Ar9 = c7sy.Ar9();
        C2EY c2ey = C2EY.A0O;
        int i = R.dimen.clips_netego_card_width;
        if (Ar9 == c2ey) {
            i = R.dimen.avatar_sticker_max_height;
        }
        IgProgressImageView igProgressImageView = c49160Lod.A03;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        View view = c49160Lod.A02;
        igImageView.setMaxHeight(AbstractC166997dE.A04(view.getContext(), i));
        if (!URLUtil.isContentUrl(A0w) && !URLUtil.isFileUrl(A0w)) {
            igProgressImageView.setUrl(this.A01, imageUrl, this.A00);
        } else {
            Object tag = igProgressImageView.getTag();
            if (str == null || !str.equals(tag)) {
                igProgressImageView.A0B(false);
                igProgressImageView.setTag(str);
                Context A0L = AbstractC166997dE.A0L(igProgressImageView);
                String str2 = ((MessageIdentifier) directMessageIdentifier).A01;
                UserSession userSession = this.A01;
                C137096In A00 = AbstractC137166Iv.A00(userSession);
                String A002 = A00.A00(A0w);
                int width = imageUrl.getWidth();
                boolean z = c7sy.A03;
                int dimensionPixelSize = A0L.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
                int A003 = C7N9.A00(A0L, false);
                if (width > A003) {
                    width = A003;
                }
                if (width < dimensionPixelSize) {
                    width = dimensionPixelSize;
                }
                if (z) {
                    d = 0.322d;
                } else {
                    d = 1.0d;
                }
                int i2 = (int) (width * d);
                if (A002 != null) {
                    igProgressImageView.setImageDrawable(AbstractC46825KnK.A00(A0L, userSession, new GifUrlImpl(A002, imageUrl.getWidth(), imageUrl.getHeight()), Integer.valueOf(i2), str2));
                } else if (!A00.A02(A0w)) {
                    A00.A01(A0w);
                    L7B l7b = c49160Lod.A00;
                    if (l7b != null) {
                        l7b.A00();
                    }
                    c49160Lod.A00 = null;
                    c49160Lod.A00 = ((C7ZZ) this.A02).ChZ(new C49068Lmu(A0L, imageUrl, this, c49160Lod, str2, i2), A0w);
                }
                String str3 = c7sy.A02;
                if (str3 != null) {
                    view.setContentDescription(AbstractC166997dE.A0r(view.getResources(), str3, 2131959243));
                }
                AbstractC010103p.A0B(view, new C50825MdI(3));
                igProgressImageView.setEnableProgressBar(false);
            }
        }
        this.A03.A02(c49160Lod, c7sy);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49160Lod c49160Lod = (C49160Lod) c7qd;
        C14360o3.A0B(c49160Lod, 0);
        c49160Lod.A03.setTag(null);
        this.A03.A01(c49160Lod);
        L7B l7b = c49160Lod.A00;
        if (l7b != null) {
            l7b.A00();
        }
        c49160Lod.A00 = null;
    }

    public C49118Lnv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A01 = userSession;
        this.A02 = interfaceC165247aD;
        this.A04 = anonymousClass988;
        this.A00 = interfaceC11380iw;
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        C49013Lm1 c49013Lm1 = new C49013Lm1(this);
        C158657Ab A00 = c7az.A00(interfaceC165247aD);
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC165247aD, z);
        this.A03 = AbstractC43594JPz.A0b(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), c49013Lm1, A00, c7q9, (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false), c7az);
    }
}
