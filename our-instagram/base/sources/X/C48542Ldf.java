package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* renamed from: X.Ldf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48542Ldf implements C3Se {
    public final int A00;
    public final Object A01;

    public C48542Ldf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        switch (this.A00) {
            case 0:
                ((Drawable) this.A01).invalidateSelf();
                return;
            case 1:
                C48591LeT c48591LeT = (C48591LeT) this.A01;
                C14360o3.A0A(bitmap);
                c48591LeT.A00 = new C6LZ(bitmap);
                return;
            default:
                ((ReelAvatarWithBadgeView) this.A01).A01.setImageBitmap(bitmap);
                return;
        }
    }
}
