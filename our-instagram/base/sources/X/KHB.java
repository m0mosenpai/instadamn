package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHB extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44650Jpu(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.friend_map_updates_title, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45190JzW c45190JzW = (C45190JzW) interfaceC66482zP;
        C44650Jpu c44650Jpu = (C44650Jpu) c3oo;
        AbstractC167017dG.A1N(c45190JzW, c44650Jpu);
        c44650Jpu.A00.setText(c45190JzW.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45190JzW.class;
    }
}
