package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJC extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44624JpU(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.direct_thread_color_picker_header_view, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZ3 lz3 = (LZ3) interfaceC66482zP;
        C44624JpU c44624JpU = (C44624JpU) c3oo;
        AbstractC167017dG.A1N(lz3, c44624JpU);
        c44624JpU.A00.setText(lz3.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZ3.class;
    }
}
