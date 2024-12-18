package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Js8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44787Js8 extends C3OO implements C7QD, C7QE, InterfaceC1581778c, InterfaceC162937Re {
    public C7QH A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44787Js8(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.direct_inbox_file_xma_title);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.direct_inbox_file_xma_subtitle);
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
