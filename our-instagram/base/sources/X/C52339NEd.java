package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.NEd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52339NEd extends AbstractC66412zI {
    public int A00;
    public C38900HAw A01 = null;
    public final C52182N7r A02;

    public C52339NEd(C52182N7r c52182N7r, int i) {
        this.A02 = c52182N7r;
        this.A00 = i;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51317Mle(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.series_item_row_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String A0k;
        C56084Ov1 c56084Ov1 = (C56084Ov1) interfaceC66482zP;
        C51317Mle c51317Mle = (C51317Mle) c3oo;
        AbstractC167017dG.A1N(c56084Ov1, c51317Mle);
        O3L o3l = new O3L(this);
        C38900HAw c38900HAw = c56084Ov1.A00;
        TextView textView = c51317Mle.A02;
        Resources resources = textView.getResources();
        int size = c38900HAw.A0A.size();
        boolean z = false;
        if (size == 0) {
            A0k = resources.getString(2131964240);
        } else {
            A0k = AbstractC167017dG.A0k(resources, size, R.plurals.igtv_series_episode);
        }
        C14360o3.A0A(A0k);
        c51317Mle.A01.setText(c38900HAw.A08);
        c51317Mle.A00.setText(c38900HAw.A05);
        textView.setText(A0k);
        IgdsCheckBox igdsCheckBox = c51317Mle.A03;
        if (this.A00 == c51317Mle.getBindingAdapterPosition()) {
            z = true;
        }
        igdsCheckBox.setChecked(z);
        igdsCheckBox.jumpDrawablesToCurrentState();
        ViewOnClickListenerC55459OkE.A01(c51317Mle.itemView, c38900HAw, o3l, c51317Mle, 17);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56084Ov1.class;
    }
}
