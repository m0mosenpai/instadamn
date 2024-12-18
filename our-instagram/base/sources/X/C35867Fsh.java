package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: X.Fsh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35867Fsh implements InterfaceC155846zE, InterfaceC155836zD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C35867Fsh(View view, MaterialToolbar materialToolbar, int i) {
        this.A00 = i;
        this.A01 = materialToolbar;
        this.A02 = view;
    }

    @Override // X.InterfaceC155846zE
    public final void DWT(AppBarLayout appBarLayout, int i) {
        float abs;
        View view;
        float f;
        float f2 = i;
        if (this.A00 != 0) {
            abs = Math.abs(f2 / appBarLayout.getTotalScrollRange());
            view = (View) this.A01;
            f = 1.5f;
        } else {
            abs = Math.abs(f2 / appBarLayout.getTotalScrollRange());
            view = (View) this.A01;
            f = 7.0f;
        }
        view.setAlpha(f * abs);
        int i2 = 0;
        View view2 = (View) this.A02;
        if (abs == 0.0f) {
            i2 = 4;
        }
        view2.setVisibility(i2);
    }
}
