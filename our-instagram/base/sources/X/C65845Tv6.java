package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* renamed from: X.Tv6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65845Tv6 extends AbstractC65852TvD {
    public InterfaceC71882X8p A00;
    public final LinearLayoutManager A01;

    @Override // X.AbstractC65852TvD
    public final void A02(int i, float f, int i2) {
        if (this.A00 != null) {
            float f2 = -f;
            int i3 = 0;
            while (true) {
                LinearLayoutManager linearLayoutManager = this.A01;
                if (i3 < linearLayoutManager.A0T()) {
                    View A0e = linearLayoutManager.A0e(i3);
                    if (A0e != null) {
                        this.A00.F8Q(A0e, (AbstractC70663Fe.A0C(A0e) - i) + f2);
                        i3++;
                    } else {
                        throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(linearLayoutManager.A0T())));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C65845Tv6(LinearLayoutManager linearLayoutManager) {
        this.A01 = linearLayoutManager;
    }
}
