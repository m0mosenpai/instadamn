package X;

import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.Jkk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44431Jkk extends LinearLayout {
    public ViewParent A00;
    public TextView A01;
    public C44410Jjq A02;
    public L3C A03;
    public boolean A04;

    public final void setBarSelected(Boolean bool) {
        C44410Jjq c44410Jjq = this.A02;
        if (c44410Jjq != null) {
            c44410Jjq.setBarSelected(bool);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A04 && getHeight() > 0) {
            this.A04 = true;
            post(new RunnableC49846Lzr(this));
        }
    }

    public final void setViewModel(L3C l3c, ViewParent viewParent) {
        AbstractC167017dG.A1N(l3c, viewParent);
        removeAllViews();
        this.A00 = viewParent;
        this.A03 = l3c;
    }
}
