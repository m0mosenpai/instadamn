package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.bottomsheet.mixed.model.EffectsMixedAttributionModel;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;

/* loaded from: classes11.dex */
public final class V5O extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final C189478aR A02;
    public final L5A A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        MixedAttributionModel mixedAttributionModel = (MixedAttributionModel) interfaceC66482zP;
        UJ6 uj6 = (UJ6) c3oo;
        ImageUrl imageUrl = mixedAttributionModel.A02;
        if (imageUrl != null) {
            uj6.A02.A00.setUrl(imageUrl, this.A01);
        }
        WNS.A00(uj6.A02.A00, 19, this);
        AbstractC68582VWj.A00(this.A00, this.A02, this.A03, uj6, mixedAttributionModel);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UJ6(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.mixed_attribution_list_row));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EffectsMixedAttributionModel.class;
    }

    public V5O(Context context, InterfaceC11380iw interfaceC11380iw, C189478aR c189478aR, L5A l5a) {
        this.A00 = context;
        this.A02 = c189478aR;
        this.A03 = l5a;
        this.A01 = interfaceC11380iw;
    }
}
