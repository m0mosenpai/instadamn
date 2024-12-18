package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.AeY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23699AeY implements C3Se {
    public final /* synthetic */ IgImageView A00;
    public final /* synthetic */ C193328hC A01;

    public C23699AeY(IgImageView igImageView, C193328hC c193328hC) {
        this.A01 = c193328hC;
        this.A00 = igImageView;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        this.A00.setImageDrawable(new C9Rz(bitmap, null, this.A01.A0O, 3));
    }
}
