package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJK extends AbstractC66422zJ {
    public final C47354Kw3 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        ViewOnClickListenerC48072LPx.A01(c3oo.itemView, 32, this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.direct_thread_color_picker_custom_theme_view, false);
        C14360o3.A0B(A0D, 1);
        return new C3OO(A0D);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZ9.class;
    }

    public KJK(C47354Kw3 c47354Kw3) {
        this.A00 = c47354Kw3;
    }
}
