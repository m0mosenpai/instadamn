package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WiK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70854WiK implements AnonymousClass851 {
    public final int A00;
    public final List A01;

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        float f3 = 0.0f;
        if (f > 0.0f) {
            float f4 = this.A00;
            if (f2 > f4) {
                f2 = f4;
            }
            f3 = f2;
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(f3);
        }
    }

    public C70854WiK(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }
}
