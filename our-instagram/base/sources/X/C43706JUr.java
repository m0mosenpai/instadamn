package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;

/* renamed from: X.JUr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43706JUr implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final LinearLayout A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final ImageView A04;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A04;
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

    public C43706JUr(View view) {
        this.A01 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.expired_message_placeholder);
        this.A03 = AbstractC31179DnN.A0M(view, R.id.expired_placeholder_title_stub);
        this.A02 = AbstractC31179DnN.A0M(view, R.id.expired_placeholder_message_stub);
        this.A04 = AbstractC31176DnK.A0D(view, R.id.doubletap_heart);
    }
}
