package X;

import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.LoT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49150LoT implements C7QD, C7QE {
    public C7QH A00;
    public final IgProgressImageView A01;

    @Override // X.C7QD
    public final /* bridge */ /* synthetic */ View BKF() {
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

    public C49150LoT(View view) {
        this.A01 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.direct_reply_to_author_image_view);
    }
}
