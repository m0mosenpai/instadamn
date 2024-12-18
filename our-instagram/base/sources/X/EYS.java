package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EYS extends AbstractC66422zJ {
    public final InterfaceC37123GXi A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E1W(new IgdsPeopleCell(AbstractC31176DnK.A04(viewGroup), null, 0, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36205FyJ c36205FyJ = (C36205FyJ) interfaceC66482zP;
        E1W e1w = (E1W) c3oo;
        AbstractC167017dG.A1N(c36205FyJ, e1w);
        FanClubCategoryType fanClubCategoryType = c36205FyJ.A00;
        String str = c36205FyJ.A04;
        String str2 = c36205FyJ.A03;
        User user = c36205FyJ.A02;
        User user2 = c36205FyJ.A01;
        InterfaceC37123GXi interfaceC37123GXi = this.A00;
        C14360o3.A0B(interfaceC37123GXi, 5);
        IgdsPeopleCell igdsPeopleCell = e1w.A00;
        igdsPeopleCell.A08(str, false);
        igdsPeopleCell.A07(str2);
        ImageUrl Bhu = user.Bhu();
        ImageUrl Bhu2 = user2.Bhu();
        StackedAvatarView stackedAvatarView = igdsPeopleCell.A0B;
        stackedAvatarView.setVisibility(0);
        stackedAvatarView.setUrls(Bhu, Bhu2, igdsPeopleCell);
        stackedAvatarView.setOnClickListener(null);
        igdsPeopleCell.A0A.setVisibility(8);
        C0fQ.A00(new ViewOnClickListenerC35585Fnc(fanClubCategoryType, interfaceC37123GXi, str, 3), igdsPeopleCell);
    }

    public EYS(InterfaceC37123GXi interfaceC37123GXi) {
        this.A00 = interfaceC37123GXi;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36205FyJ.class;
    }
}
