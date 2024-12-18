package X;

import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.LoV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49152LoV implements C7QD, C7QE {
    public C7QH A00;
    public final View A01;
    public final C41761wQ A02;
    public final IgProgressImageView A03;

    public C49152LoV(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A03 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.image);
        this.A02 = AbstractC31173DnH.A0S();
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
}
