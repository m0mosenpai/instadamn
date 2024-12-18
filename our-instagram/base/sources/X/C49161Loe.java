package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Loe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49161Loe implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A02;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A01;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C49161Loe(View view) {
        this.A01 = (FrameLayout) view.requireViewById(R.id.foreground_container);
        this.A02 = AbstractC31173DnH.A0I(view, R.id.doubletap_heart);
        this.A04 = AbstractC166997dE.A0T(view, R.id.title_text);
        this.A03 = AbstractC166997dE.A0T(view, R.id.subtitle_text);
    }
}
