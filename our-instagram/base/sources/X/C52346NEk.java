package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.NEk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52346NEk extends AbstractC66412zI {
    public int A00;
    public int A01;
    public final UserSession A02;
    public final C57112jm A03;
    public final C54602OAd A04;
    public final InterfaceC57970PnG A05;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C0YR[] c0yrArr = C51366MmR.A06;
        return new C51366MmR(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_highlight_in_grid_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EnumC153476vH enumC153476vH;
        C1NB c1nb;
        User CDj;
        C56113OvY c56113OvY = (C56113OvY) interfaceC66482zP;
        C51366MmR c51366MmR = (C51366MmR) c3oo;
        AbstractC167017dG.A1N(c56113OvY, c51366MmR);
        AbstractC13880nE.A0g(AbstractC31171DnF.A06(c51366MmR), this.A01);
        AbstractC13880nE.A0W(AbstractC31171DnF.A06(c51366MmR), this.A00);
        C54602OAd c54602OAd = this.A04;
        UserSession userSession = this.A02;
        C57112jm c57112jm = this.A03;
        AbstractC167017dG.A1R(userSession, c57112jm);
        c51366MmR.A00.setVisibility(AbstractC167007dF.A05(c56113OvY.A03 ? 1 : 0));
        IgImageButton igImageButton = c51366MmR.A02;
        if (c56113OvY.A03) {
            enumC153476vH = EnumC153476vH.A04;
        } else {
            enumC153476vH = null;
        }
        igImageButton.setMediaOverlay(enumC153476vH);
        boolean z = c56113OvY.A06;
        if (z) {
            igImageButton.setIcon(EnumC153466vG.A0E);
        }
        if (c56113OvY.A05 && C18U.A06(C06090Tz.A05, userSession, 36327151217162561L)) {
            igImageButton.setMediaOverlay(EnumC153476vH.A03);
            igImageButton.setIcon(EnumC153466vG.A0A);
        }
        ((TextView) c51366MmR.A04.CES(c51366MmR, C51366MmR.A06[0])).setText(c56113OvY.A02);
        ImageUrl imageUrl = c56113OvY.A00;
        if (imageUrl != null || ((c1nb = c56113OvY.A01.A0W) != null && (CDj = c1nb.CDj()) != null && (imageUrl = CDj.A0D()) != null && z)) {
            igImageButton.setUrl(imageUrl, c54602OAd.A00);
        }
        igImageButton.setOnLongClickListener(new ViewOnLongClickListenerC55479OkY(4, c54602OAd, c56113OvY, c51366MmR));
        ViewOnClickListenerC55459OkE.A01(igImageButton, c56113OvY, c51366MmR, c54602OAd, 24);
        View view = c51366MmR.itemView;
        Reel reel = c56113OvY.A01;
        C59072n8 A00 = C59062n7.A00(reel, Integer.valueOf(c51366MmR.getAbsoluteAdapterPosition()), reel.getId());
        A00.A00(new C56200Ox8(new OC4(userSession, c54602OAd, c56113OvY, c51366MmR)));
        c57112jm.A05(view, A00.A01());
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56113OvY.class;
    }

    public C52346NEk(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, InterfaceC57970PnG interfaceC57970PnG, InterfaceC64002vL interfaceC64002vL, int i, int i2) {
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = interfaceC57970PnG;
        this.A03 = c57112jm;
        this.A04 = new C54602OAd(interfaceC11380iw, interfaceC57970PnG, interfaceC64002vL);
    }
}
