package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHK extends AbstractC66412zI {
    public final InterfaceC16820sZ A00;

    public KHK(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fetch_retry_view, false);
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        C14360o3.A0B(interfaceC16820sZ, 2);
        C3OO c3oo = new C3OO(A0R);
        A0R.findViewById(R.id.retry_fetch_container);
        C0fQ.A00(new Fp1(interfaceC16820sZ, 26), A0R.findViewById(R.id.retry_button));
        A0R.findViewById(R.id.error_text);
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KIZ.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
