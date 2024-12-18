package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes6.dex */
public final class EYI extends AbstractC66422zJ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, java.lang.Object, X.E17] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.auto_follow_back_system_setting_item_row, false);
        C14360o3.A0B(A0D, 1);
        ?? c3oo = new C3OO(A0D);
        c3oo.A00 = AbstractC31176DnK.A0D(A0D, R.id.icon);
        c3oo.A02 = AbstractC31178DnM.A0C(A0D);
        c3oo.A01 = AbstractC167007dF.A0N(A0D, R.id.body);
        c3oo.A03 = (IgdsSwitch) AbstractC166997dE.A0R(A0D, R.id.switch_button);
        A0D.setTag(c3oo);
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32086E8k c32086E8k = (C32086E8k) interfaceC66482zP;
        E17 e17 = (E17) c3oo;
        AbstractC167017dG.A1N(c32086E8k, e17);
        ImageView imageView = e17.A00;
        AbstractC166997dE.A19(imageView.getContext(), imageView, c32086E8k.A00);
        e17.A02.setText(c32086E8k.A03);
        e17.A01.setText(c32086E8k.A02);
        IgdsSwitch igdsSwitch = e17.A03;
        igdsSwitch.setChecked(false);
        C35745Fqd.A01(igdsSwitch, c32086E8k, 28);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32086E8k.class;
    }
}
