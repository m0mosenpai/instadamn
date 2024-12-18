package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.AeS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23693AeS implements InterfaceC73023Pd {
    public final /* synthetic */ C193328hC A00;

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        C14360o3.A0B(c73083Pj, 0);
        ImageView A0D = AbstractC31176DnK.A0D(this.A00.A0Z, R.id.igds_headline_url_image);
        int i = c73083Pj.A01;
        int i2 = c73083Pj.A00;
        if (i > 0 && 0.0f - 0.0f > 0.0f) {
            AbstractC44215JgK.A00(A0D, 0.0f, 0.0f, 0.0f, i, i2);
        }
        ViewGroup.LayoutParams layoutParams = A0D.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            A0D.setLayoutParams(layoutParams);
        }
    }

    public C23693AeS(C193328hC c193328hC) {
        this.A00 = c193328hC;
    }
}
