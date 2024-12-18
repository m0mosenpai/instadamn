package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.Js9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44788Js9 extends C3OO implements C7QD, C7QE, InterfaceC1581778c, InterfaceC162937Re {
    public C7QH A00;
    public final View A01;
    public final IgProgressImageView A02;
    public final RoundedCornerMediaFrameLayout A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44788Js9(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A03 = (RoundedCornerMediaFrameLayout) AbstractC166997dE.A0R(view, R.id.magic_media_remix_media_container);
        this.A02 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.magic_media_remix_media_image);
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return null;
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
