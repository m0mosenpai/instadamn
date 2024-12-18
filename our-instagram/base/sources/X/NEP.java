package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* loaded from: classes9.dex */
public final class NEP extends AbstractC66412zI {
    public final C64842wi A00;
    public final C64742wY A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51821MvP c51821MvP = (C51821MvP) interfaceC66482zP;
        C51240MkP c51240MkP = (C51240MkP) c3oo;
        AbstractC167017dG.A1N(c51821MvP, c51240MkP);
        IgdsListCell igdsListCell = c51240MkP.A00;
        igdsListCell.setTextCellType(EnumC53237Nga.A04);
        CharSequence text = igdsListCell.getResources().getText(c51821MvP.A00);
        C14360o3.A07(text);
        igdsListCell.A0I(text);
        igdsListCell.A0C(c51821MvP.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51821MvP.class;
    }

    public NEP(C64842wi c64842wi, C64742wY c64742wY) {
        AbstractC167017dG.A1P(c64742wY, c64842wi);
        this.A01 = c64742wY;
        this.A00 = c64842wi;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C51240MkP c51240MkP = new C51240MkP(AbstractC31174DnI.A0Z(AbstractC31176DnK.A04(viewGroup)));
        C64742wY c64742wY = this.A01;
        C64842wi c64842wi = this.A00;
        c64742wY.A00(c51240MkP.itemView, QPTooltipAnchor.A05, c64842wi);
        return c51240MkP;
    }
}
