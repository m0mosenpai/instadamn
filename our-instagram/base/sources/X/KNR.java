package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KNR extends JnX {
    public final InterfaceC193828i3 A00;
    public final ArrayList A01 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44712Jqv(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.filter_type_icon_layout, false), this);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44712Jqv c44712Jqv = (C44712Jqv) c3oo;
        C14360o3.A0B(c44712Jqv, 0);
        L8Z l8z = (L8Z) AbstractC31173DnH.A0i(this.A01, i);
        C14360o3.A0B(l8z, 0);
        c44712Jqv.A00 = l8z;
        Integer num = l8z.A00;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = c44712Jqv.A01;
            imageView.setImageResource(intValue);
            imageView.getDrawable().setColorFilter(null);
        }
        c44712Jqv.A02.setText(l8z.A01());
        View A06 = AbstractC31171DnF.A06(c44712Jqv);
        KNR knr = c44712Jqv.A03;
        C3P9 A0U = AbstractC43592JPx.A0U(A06);
        A0U.A04 = new C43890Jax(1, l8z, knr, c44712Jqv);
        A0U.A00();
    }

    public KNR(InterfaceC193828i3 interfaceC193828i3) {
        this.A00 = interfaceC193828i3;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-857932649);
        int size = this.A01.size();
        C0f9.A0A(-1527564606, A03);
        return size;
    }
}
