package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Lnr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49114Lnr implements C7QC {
    public final UserSession A00;
    public final InterfaceC165247aD A01;
    public final C162907Rb A02;
    public final InterfaceC11380iw A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49156LoZ c49156LoZ = (C49156LoZ) c7qd;
        KT7 kt7 = (KT7) interfaceC129555tK;
        AbstractC167007dF.A1K(c49156LoZ, kt7);
        String A00 = kt7.BSy().A00();
        if (A00 != null) {
            ((C7W5) this.A01).CkQ(A00, kt7.CVC());
        }
        IgImageView igImageView = c49156LoZ.A03;
        Object tag = igImageView.getTag();
        String A002 = kt7.BSy().A00();
        if (A002 == null || !A002.equals(tag)) {
            igImageView.setTag(kt7.BSy().A00());
            Context context = igImageView.getContext();
            GifUrlImpl gifUrlImpl = kt7.A00;
            String str = kt7.BSy().A01;
            C14360o3.A0A(context);
            int floatValue = (int) gifUrlImpl.A03.floatValue();
            C14360o3.A0B(context, 0);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
            int A003 = C7N9.A00(context, false);
            if (floatValue > A003) {
                floatValue = A003;
            }
            if (floatValue < dimensionPixelSize) {
                floatValue = dimensionPixelSize;
            }
            int i = (int) (floatValue * 1.0d);
            String str2 = null;
            if (AbstractC002300n.A0h(gifUrlImpl.A09, "msys://ae-media", false)) {
                InterfaceC09390do interfaceC09390do = LKn.A05;
                AbstractC46712KlV.A00(this.A00).A04(new C48275LXy(context, this, c49156LoZ, gifUrlImpl, str, i), gifUrlImpl.A09);
            } else {
                igImageView.setImageDrawable(AbstractC46825KnK.A00(context, this.A00, gifUrlImpl, Integer.valueOf(i), str));
            }
            String str3 = kt7.A01;
            if (str3 != null && str3.length() != 0) {
                str2 = AbstractC167007dF.A0f(context, str3, 2131959243);
            }
            igImageView.setContentDescription(str2);
        }
        this.A02.A02(c49156LoZ, kt7);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49156LoZ c49156LoZ = new C49156LoZ(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_animated_sticker_message_with_big_heart, false));
        this.A02.A00(c49156LoZ);
        return c49156LoZ;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49156LoZ c49156LoZ = (C49156LoZ) c7qd;
        C14360o3.A0B(c49156LoZ, 0);
        c49156LoZ.A03.setTag(null);
        this.A02.A01(c49156LoZ);
    }

    public C49114Lnr(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, C162907Rb c162907Rb) {
        this.A00 = userSession;
        this.A02 = c162907Rb;
        this.A03 = interfaceC11380iw;
        this.A01 = interfaceC165247aD;
    }
}
