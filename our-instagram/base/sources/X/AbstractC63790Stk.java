package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Stk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63790Stk implements InterfaceC65558Tme, InterfaceC65321Ti1 {
    public final Drawable A00;

    @Override // X.InterfaceC65558Tme
    public final /* bridge */ /* synthetic */ Object get() {
        Drawable drawable = this.A00;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return drawable;
    }

    @Override // X.InterfaceC65321Ti1
    public final void initialize() {
        Bitmap bitmap;
        boolean z = this instanceof QBV;
        Drawable drawable = this.A00;
        if (!z) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                bitmap.prepareToDraw();
            } else if (!(drawable instanceof Q2P)) {
                return;
            }
        }
        bitmap = ((Q2P) drawable).A09.A00.A03;
        bitmap.prepareToDraw();
    }

    public AbstractC63790Stk(Drawable drawable) {
        this.A00 = drawable;
    }
}
