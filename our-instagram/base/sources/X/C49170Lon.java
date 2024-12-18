package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lon, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49170Lon implements C7QD, C7QE, InterfaceC162937Re, C7BG {
    public C7Q8 A00;
    public C7QH A01;
    public final Drawable A02;
    public final View A03;
    public final FrameLayout A04;
    public final TightTextView A05;
    public final TightTextView A06;
    public final TightTextView A07;
    public final IgProgressImageView A08;

    @Override // X.C7BG
    public final void EZ4(C7Q8 c7q8) {
        C14360o3.A0B(c7q8, 0);
        this.A00 = c7q8;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A04;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C7MU.A00(this.A04.getBackground(), i);
    }

    public C49170Lon(View view) {
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(view, R.id.link_preview_container);
        this.A04 = frameLayout;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0R(frameLayout, R.id.link_preview_image);
        this.A08 = igProgressImageView;
        this.A03 = AbstractC166997dE.A0S(frameLayout, R.id.separator);
        TightTextView tightTextView = (TightTextView) AbstractC166997dE.A0R(frameLayout, R.id.link_preview_title);
        Context A0L = AbstractC166997dE.A0L(frameLayout);
        tightTextView.setMaxWidth(C7N9.A00(A0L, false));
        this.A06 = tightTextView;
        TightTextView tightTextView2 = (TightTextView) AbstractC166997dE.A0R(frameLayout, R.id.link_preview_summary);
        C14360o3.A07(A0L);
        tightTextView2.setMaxWidth(C7N9.A00(A0L, false));
        this.A05 = tightTextView2;
        TightTextView tightTextView3 = (TightTextView) AbstractC166997dE.A0R(frameLayout, R.id.message_text);
        tightTextView3.setMaxWidth(C7N9.A00(A0L, false));
        this.A07 = tightTextView3;
        this.A02 = AbstractC162807Qr.A00();
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
