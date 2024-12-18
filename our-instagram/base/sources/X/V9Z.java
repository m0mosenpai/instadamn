package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.model.reels.Reel;

/* loaded from: classes11.dex */
public final class V9Z extends AbstractC140596Xn {
    public C3Ow A00;

    @Override // X.AbstractC140596Xn
    public final boolean A06() {
        return true;
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        Rect rect = new Rect();
        this.A00.Aek().getWindowVisibleDisplayFrame(rect);
        float f = (rect.bottom / 2) * 3;
        return C6PN.A03(new RectF(rect.left, f, rect.right, f));
    }
}
