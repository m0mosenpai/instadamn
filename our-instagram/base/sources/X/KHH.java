package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes8.dex */
public final class KHH extends AbstractC66412zI {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZP lzp = (LZP) interfaceC66482zP;
        C44599Joy c44599Joy = (C44599Joy) c3oo;
        boolean A1a = AbstractC167017dG.A1a(lzp, c44599Joy);
        View view = c44599Joy.itemView;
        Context context = view.getContext();
        LQ0.A02(view, 42, this);
        IgdsListCell igdsListCell = c44599Joy.A00;
        igdsListCell.A0I(AbstractC166997dE.A0p(context, 2131953034));
        igdsListCell.A0H(AbstractC166997dE.A0p(context, 2131953033));
        igdsListCell.A0G(lzp.A00, A1a);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZP.class;
    }

    public KHH(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44599Joy(new IgdsListCell(AbstractC31176DnK.A04(viewGroup), null));
    }
}
