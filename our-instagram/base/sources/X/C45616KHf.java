package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KHf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45616KHf extends AbstractC66412zI {
    public final InterfaceC16660sJ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.muted_word_list_item, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(2131958621);
        Context context = textView.getContext();
        textView.setCompoundDrawablePadding(AbstractC167017dG.A0E(context));
        Drawable A01 = AbstractC85953sP.A01(context, R.drawable.instagram_eye_off_pano_outline_24, AbstractC53242c7.A08(context));
        RectF rectF = AbstractC13880nE.A01;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(A01, (Drawable) null, (Drawable) null, (Drawable) null);
        return new C44643Jpn(textView, this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C49357Lrq.class;
    }

    public C45616KHf(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
