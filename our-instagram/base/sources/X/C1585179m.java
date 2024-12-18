package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.ui.widget.expandingtextview.ExpandingTextView;

/* renamed from: X.79m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1585179m implements C7QE, InterfaceC162937Re, C7BG {
    public C7Q8 A00;
    public C7QH A01;
    public final Drawable A02 = AbstractC162807Qr.A00();
    public final View A03;
    public final C57012jc A04;
    public final ExpandingTextView A05;

    @Override // X.C7QD
    public final View BKF() {
        return this.A03;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C7MU.A00(this.A05.getBackground(), i);
    }

    public C1585179m(View view, ExpandingTextView expandingTextView) {
        this.A03 = view;
        this.A05 = expandingTextView;
        this.A04 = new C57012jc((ViewStub) view.findViewById(R.id.direct_expandable_text_progress_bar_stub));
    }

    @Override // X.C7BG
    public final void EZ4(C7Q8 c7q8) {
        this.A00 = c7q8;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }
}
