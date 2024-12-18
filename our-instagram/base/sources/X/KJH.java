package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJH extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.row_center_text_with_drawable, false);
        C44654Jpy c44654Jpy = new C44654Jpy(A0D);
        A0D.setTag(c44654Jpy);
        C14360o3.A0C(c44654Jpy, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleCenterTextRowWithDrawableViewBinder.Holder");
        return c44654Jpy;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45206Jzm c45206Jzm = (C45206Jzm) interfaceC66482zP;
        C44654Jpy c44654Jpy = (C44654Jpy) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c45206Jzm, c44654Jpy);
        Context context = c45206Jzm.A00;
        C35246Fgf c35246Fgf = c45206Jzm.A02;
        Drawable drawable = c45206Jzm.A01;
        AbstractC167007dF.A1D(context, A1a ? 1 : 0, c35246Fgf);
        if (drawable != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.auth_edit_field_text_size);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            TextView textView = c44654Jpy.A00;
            textView.setCompoundDrawablePadding(AbstractC167017dG.A06(context));
            drawable.setTint(AbstractC31174DnI.A03(context));
            textView.setCompoundDrawables(drawable, null, null, null);
        }
        TextView textView2 = c44654Jpy.A00;
        AbstractC25227BEk.A11(textView2);
        c35246Fgf.A03(textView2);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45206Jzm.class;
    }
}
