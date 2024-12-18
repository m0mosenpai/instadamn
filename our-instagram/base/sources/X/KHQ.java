package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHQ extends AbstractC66412zI {
    public final C47332Kvh A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_unified_ai_sticker_entrypoint_item, false);
        C44618JpO c44618JpO = new C44618JpO(A0D);
        KKp.A01(AbstractC166987dD.A0s(A0D), this, 21);
        return c44618JpO;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44618JpO c44618JpO = (C44618JpO) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC66482zP, c44618JpO);
        C7IK c7ik = this.A00.A00.A03.A0A;
        if (c7ik != null) {
            JQ1.A0W(c44618JpO.A00, c7ik);
        }
        if (!KJ1.A00) {
            KJ1.A00 = A1R;
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KJ1.class;
    }

    public KHQ(C47332Kvh c47332Kvh) {
        this.A00 = c47332Kvh;
    }
}
