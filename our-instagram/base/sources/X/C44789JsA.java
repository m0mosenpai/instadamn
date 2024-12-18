package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.JsA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44789JsA extends C3OO implements C7QD, C7QE, InterfaceC1581778c, InterfaceC162937Re {
    public C7QH A00;
    public final View A01;
    public final NoteBubbleView A02;
    public final GradientSpinnerAvatarView A03;

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

    public C44789JsA(View view) {
        super(view);
        this.A01 = view;
        this.A02 = (NoteBubbleView) AbstractC166987dD.A0c(view, R.id.xma_content_note_bubble_view);
        this.A03 = (GradientSpinnerAvatarView) AbstractC166987dD.A0c(view, R.id.xma_content_circular_image);
    }
}
