package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Log, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49163Log implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final ViewGroup A01;
    public final FrameLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final C47379KwU A06;
    public final ImageView A07;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A07;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A02;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C49163Log(View view) {
        this.A02 = (FrameLayout) view.requireViewById(R.id.foreground_container);
        this.A01 = AbstractC31173DnH.A0F(view, R.id.message_content_profile_bubble_container);
        this.A05 = AbstractC31173DnH.A0T(view, R.id.avatar);
        this.A04 = AbstractC31180DnO.A06(view);
        this.A03 = AbstractC166997dE.A0T(view, R.id.subtitle);
        this.A06 = new C47379KwU(view, false, false);
        this.A07 = AbstractC31173DnH.A0I(view, R.id.doubletap_heart);
    }
}
