package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Oyo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56279Oyo implements InterfaceC25187BCk {
    public final int A00;
    public final Object A01;

    public C56279Oyo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25187BCk
    public final void DIS(Bitmap bitmap) {
        switch (this.A00) {
            case 0:
                C8JT.A0G(bitmap, (C8JT) this.A01);
                return;
            case 1:
                C50643MXf c50643MXf = (C50643MXf) this.A01;
                IgImageView igImageView = c50643MXf.A0R;
                if (igImageView.getVisibility() != 0) {
                    return;
                }
                igImageView.setImageDrawable(AbstractC43593JPy.A0A(c50643MXf.A0L, bitmap));
                return;
            default:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                C57171PZp.A03(bitmap, abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 11);
                return;
        }
    }

    @Override // X.InterfaceC25187BCk
    public final void DIT() {
        switch (this.A00) {
            case 0:
                AKk.A02(((C8JT) this.A01).A11, C05F.A0N, "Frame retrieving failed", 2131974293);
                return;
            case 1:
                ((C50643MXf) this.A01).A0R.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
