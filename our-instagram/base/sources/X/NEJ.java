package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NEJ extends AbstractC66412zI {
    public final N4Z A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56104OvO c56104OvO = (C56104OvO) interfaceC66482zP;
        C51282Ml5 c51282Ml5 = (C51282Ml5) c3oo;
        AbstractC167017dG.A1N(c56104OvO, c51282Ml5);
        InterfaceC09390do interfaceC09390do = c51282Ml5.A01;
        Context context = AbstractC166987dD.A0d(interfaceC09390do).getContext();
        TextView A0D = MSW.A0D(interfaceC09390do);
        int i = c56104OvO.A01;
        C14360o3.A0A(context);
        A0D.setText(AbstractC166997dE.A0q(context.getResources(), i));
        AbstractC166987dD.A1O(context, MSW.A0D(interfaceC09390do), c56104OvO.A00);
        ViewOnClickListenerC55465OkK.A01(AbstractC166987dD.A0d(interfaceC09390do), 63, c56104OvO, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56104OvO.class;
    }

    public NEJ(N4Z n4z) {
        this.A00 = n4z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51282Ml5(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_section_action_item, false));
    }
}
