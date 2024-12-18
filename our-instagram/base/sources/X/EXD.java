package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXD extends AbstractC66412zI {
    public final GYS A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EY1 ey1 = (EY1) interfaceC66482zP;
        E39 e39 = (E39) c3oo.itemView.getTag();
        if (e39 != null) {
            String str = ey1.A02;
            String str2 = ey1.A01;
            Drawable drawable = ey1.A00;
            boolean z = ey1.A03;
            GYS gys = this.A00;
            e39.A03.setText(str);
            e39.A02.setText(str2);
            e39.A01.setImageDrawable(drawable);
            if (z) {
                Button button = e39.A00;
                button.setVisibility(0);
                ViewOnClickListenerC35682FpH.A01(button, 16, gys);
                return;
            }
            e39.A00.setVisibility(8);
        }
    }

    public EXD(GYS gys) {
        this.A00 = gys;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.search_error_state);
        A0A.setTag(new E39(A0A));
        return new E39(A0A);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY1.class;
    }
}
