package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.Lo9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49130Lo9 implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;
    public final Context A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C49148LoR(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.message_content_sticker_reaction_to_expired_reel, false));
    }

    public static final Drawable A00(C49130Lo9 c49130Lo9, String str) {
        Context context = c49130Lo9.A03;
        UserSession userSession = c49130Lo9.A01;
        return C74N.A02(context, userSession, str, context.getResources().getDimensionPixelSize(R.dimen.ar_effect_option_icon_size), AbstractC166997dE.A04(context, R.dimen.ar_effect_option_icon_size), AbstractC47041Kqy.A00(userSession));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        String url;
        Drawable A00;
        C49148LoR c49148LoR = (C49148LoR) c7qd;
        KT5 kt5 = (KT5) interfaceC129555tK;
        boolean A1R = AbstractC167007dF.A1R(0, c49148LoR, kt5);
        InterfaceC165247aD interfaceC165247aD = this.A02;
        UserSession userSession = this.A01;
        ImageUrl imageUrl = kt5.A00;
        if (imageUrl != null && (url = imageUrl.getUrl()) != null) {
            ConstrainedImageView constrainedImageView = c49148LoR.A01;
            constrainedImageView.setVisibility(0);
            if (AbstractC43592JPx.A1a("msys://ae-media", 1, url)) {
                C47349Kvy c47349Kvy = c49148LoR.A00;
                if (c47349Kvy != null) {
                    c47349Kvy.A00.set(A1R);
                }
                c49148LoR.A00 = null;
                c49148LoR.A00 = ((InterfaceC165027Zr) interfaceC165247aD).ChN(new C49054Lmg(constrainedImageView, this, c49148LoR), url);
                return;
            }
            if (!URLUtil.isContentUrl(url) && !URLUtil.isFileUrl(url)) {
                A00 = A00(this, url);
            } else {
                C137096In A002 = AbstractC137166Iv.A00(userSession);
                String A003 = A002.A00(url);
                if (A003 != null) {
                    A00 = A00(this, A003);
                } else {
                    if (A002.A02(url)) {
                        return;
                    }
                    A002.A01(url);
                    ((C7ZZ) interfaceC165247aD).ChZ(new C49062Lmo(constrainedImageView, this), url);
                    return;
                }
            }
            constrainedImageView.setImageDrawable(A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49148LoR c49148LoR = (C49148LoR) c7qd;
        C14360o3.A0B(c49148LoR, 0);
        ConstrainedImageView constrainedImageView = c49148LoR.A01;
        constrainedImageView.setVisibility(8);
        constrainedImageView.A09();
    }

    public C49130Lo9(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD) {
        this.A03 = context;
        this.A02 = interfaceC165247aD;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
