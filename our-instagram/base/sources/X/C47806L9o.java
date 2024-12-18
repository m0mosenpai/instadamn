package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.L9o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47806L9o {
    public final Context A00;
    public final ShimmerFrameLayout A01;
    public final InterfaceC09390do A02;
    public final IgSimpleImageView A03;
    public final IgTextView A04;
    public final IgView A05;

    public C47806L9o(Context context, View view, ShimmerFrameLayout shimmerFrameLayout) {
        C14360o3.A0B(view, 2);
        this.A00 = context;
        this.A01 = shimmerFrameLayout;
        this.A02 = MHQ.A00(this, 19);
        this.A05 = (IgView) view.requireViewById(R.id.dimmer_overlay);
        this.A03 = (IgSimpleImageView) view.requireViewById(R.id.loading_animation);
        this.A04 = AbstractC31172DnG.A0X(view, R.id.creating_text);
    }

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        IgSimpleImageView igSimpleImageView = this.A03;
        InterfaceC09390do interfaceC09390do = this.A02;
        igSimpleImageView.setImageDrawable(AbstractC166987dD.A0a(interfaceC09390do));
        this.A05.setVisibility(0);
        IgTextView igTextView = this.A04;
        igTextView.setVisibility(0);
        igTextView.setText(str);
        AnonymousClass693 anonymousClass693 = (AnonymousClass693) interfaceC09390do.getValue();
        if (!anonymousClass693.isPlaying()) {
            igSimpleImageView.setVisibility(0);
            anonymousClass693.EMk(0.0f);
            anonymousClass693.EH1();
            anonymousClass693.E4S();
        }
    }

    public final void A00() {
        ShimmerFrameLayout shimmerFrameLayout = this.A01;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.A05();
            shimmerFrameLayout.setVisibility(8);
        }
    }

    public final void A01() {
        AnonymousClass693 anonymousClass693 = (AnonymousClass693) this.A02.getValue();
        anonymousClass693.pause();
        anonymousClass693.EMk(0.0f);
        IgSimpleImageView igSimpleImageView = this.A03;
        igSimpleImageView.setVisibility(8);
        this.A04.setVisibility(8);
        this.A05.setVisibility(8);
        igSimpleImageView.setImageDrawable(null);
    }
}
