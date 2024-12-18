package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEK extends AbstractC66412zI {
    public final InterfaceC16820sZ A00;

    public NEK(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        C14360o3.A0B(interfaceC16820sZ, 1);
        ViewOnClickListenerC55461OkG.A00(c3oo.itemView, 70, interfaceC16820sZ);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52605NPa.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0A = AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.media_kit_grid_camera_item);
        C3OO c3oo = new C3OO(A0A);
        AbstractC166997dE.A18(A0A.getContext(), A0A, 2131952043);
        AbstractC56952jT.A01(A0A);
        return c3oo;
    }
}
