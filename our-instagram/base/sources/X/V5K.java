package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.bottomsheet.mixed.model.CameraFormatMixedAttributionModel;

/* loaded from: classes11.dex */
public final class V5K extends AbstractC66412zI {
    public final Context A00;
    public final C189478aR A01;
    public final L5A A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        CameraFormatMixedAttributionModel cameraFormatMixedAttributionModel = (CameraFormatMixedAttributionModel) interfaceC66482zP;
        UJ6 uj6 = (UJ6) c3oo;
        uj6.A02.A00.setImageDrawable(cameraFormatMixedAttributionModel.A00);
        AbstractC68582VWj.A00(this.A00, this.A01, this.A02, uj6, cameraFormatMixedAttributionModel);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UJ6(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.mixed_attribution_list_row));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return CameraFormatMixedAttributionModel.class;
    }

    public V5K(Context context, C189478aR c189478aR, L5A l5a) {
        this.A00 = context;
        this.A01 = c189478aR;
        this.A02 = l5a;
    }
}
