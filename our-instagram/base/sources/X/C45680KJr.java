package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KJr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45680KJr extends AbstractC66422zJ {
    public final boolean A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44607JpD(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.ai_sticker_error_message, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZJ lzj = (LZJ) interfaceC66482zP;
        C44607JpD c44607JpD = (C44607JpD) c3oo;
        AbstractC167017dG.A1N(lzj, c44607JpD);
        View view = c44607JpD.A00;
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.error_message);
        A0Q.setText(lzj.A00);
        if (this.A00) {
            ImageView imageView = (ImageView) AbstractC166987dD.A0c(view, R.id.icon);
            Context context = A0Q.getContext();
            AbstractC31173DnH.A11(context, imageView, AbstractC53242c7.A08(context));
            AbstractC31177DnL.A0z(A0Q, context);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZJ.class;
    }

    public C45680KJr(boolean z) {
        this.A00 = z;
    }

    public C45680KJr() {
        this(false);
    }
}
