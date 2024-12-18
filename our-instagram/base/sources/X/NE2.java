package X;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsFooterCell;

/* loaded from: classes9.dex */
public final class NE2 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        CharSequence charSequence;
        C56101OvL c56101OvL = (C56101OvL) interfaceC66482zP;
        C51242MkR c51242MkR = (C51242MkR) c3oo;
        AbstractC167017dG.A1N(c56101OvL, c51242MkR);
        IgdsFooterCell igdsFooterCell = c51242MkR.A00;
        int i = c56101OvL.A01;
        if (i != -1) {
            charSequence = igdsFooterCell.getResources().getText(i);
        } else {
            charSequence = c56101OvL.A00;
        }
        C14360o3.A0A(charSequence);
        igdsFooterCell.A00(charSequence);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        C14360o3.A07(linkMovementMethod);
        igdsFooterCell.A02.setMovementMethod(linkMovementMethod);
        Integer num = c56101OvL.A02;
        if (num != null) {
            igdsFooterCell.setContentDescription(igdsFooterCell.getResources().getText(num.intValue()));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56101OvL.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C51242MkR(new IgdsFooterCell(AbstractC31176DnK.A04(viewGroup), null));
    }
}
