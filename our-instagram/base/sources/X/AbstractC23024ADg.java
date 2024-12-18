package X;

import android.graphics.drawable.Drawable;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.ADg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23024ADg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final MusicOverlayStickerModel A00(Drawable drawable) {
        boolean z = drawable instanceof C194808jg;
        ?? r1 = drawable;
        if (z) {
            r1 = ((C194808jg) drawable).A04();
        }
        boolean z2 = r1 instanceof BEc;
        Drawable drawable2 = r1;
        if (!z2) {
            if (r1 instanceof C5RO) {
                Drawable Afg = ((C5RO) r1).Afg();
                boolean z3 = Afg instanceof BEc;
                drawable2 = Afg;
                if (!z3) {
                    return null;
                }
            } else {
                return null;
            }
        }
        return AbstractC101614hW.A02(drawable2);
    }

    public static final void A01(Drawable drawable) {
        if (drawable instanceof C194808jg) {
            C194808jg c194808jg = (C194808jg) drawable;
            if (c194808jg.A0E(C220979pL.class)) {
                ((C220979pL) AbstractC166997dE.A0k(c194808jg.A06(C220979pL.class))).A03.A00();
            }
        }
    }
}
