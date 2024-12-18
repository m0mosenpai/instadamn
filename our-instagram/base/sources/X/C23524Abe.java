package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Abe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23524Abe implements C2n2 {
    public final int A00;
    public final Object A01;

    public C23524Abe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2n2
    public final Object apply(Object obj) {
        Drawable drawable;
        if (this.A00 != 0) {
            Number number = (Number) obj;
            if (number != null) {
                BEd A02 = InteractiveDrawableContainer.A02(((C23728Af1) this.A01).A00, number.intValue());
                if (A02 != null) {
                    drawable = ((C9LJ) A02).A0B;
                } else {
                    drawable = null;
                }
                AbstractC23126AKl.A01(drawable);
                return null;
            }
            return null;
        }
        ((C23543Abx) this.A01).A01.set(obj);
        return obj;
    }
}
