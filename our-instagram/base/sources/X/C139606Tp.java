package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.6Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139606Tp {
    public IgTextView A00;
    public IgTextView A01;
    public IgTextView A02;
    public RoundedCornerImageView A03;
    public RoundedCornerConstraintLayout A04;
    public final InterfaceC56392iX A05;

    public final RoundedCornerImageView A00() {
        RoundedCornerImageView roundedCornerImageView = this.A03;
        if (roundedCornerImageView != null) {
            return roundedCornerImageView;
        }
        C14360o3.A0F("image");
        throw C00O.createAndThrow();
    }

    public final RoundedCornerConstraintLayout A01() {
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A04;
        if (roundedCornerConstraintLayout != null) {
            return roundedCornerConstraintLayout;
        }
        C14360o3.A0F("container");
        throw C00O.createAndThrow();
    }

    public C139606Tp(InterfaceC56392iX interfaceC56392iX) {
        this.A05 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6Tq
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C139606Tp c139606Tp = C139606Tp.this;
                RoundedCornerConstraintLayout roundedCornerConstraintLayout = (RoundedCornerConstraintLayout) view.requireViewById(R.id.sponsored_reel_bottom_banner_container);
                C14360o3.A0B(roundedCornerConstraintLayout, 0);
                c139606Tp.A04 = roundedCornerConstraintLayout;
                RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.sponsored_reel_bottom_banner_image);
                C14360o3.A0B(roundedCornerImageView, 0);
                c139606Tp.A03 = roundedCornerImageView;
                IgTextView igTextView = (IgTextView) view.requireViewById(R.id.sponsored_reel_bottom_banner_primary_text);
                C14360o3.A0B(igTextView, 0);
                c139606Tp.A01 = igTextView;
                IgTextView igTextView2 = (IgTextView) view.requireViewById(R.id.sponsored_reel_bottom_banner_secondary_text);
                C14360o3.A0B(igTextView2, 0);
                c139606Tp.A02 = igTextView2;
                IgTextView igTextView3 = (IgTextView) view.requireViewById(R.id.sponsored_reel_bottom_banner_cta);
                C14360o3.A0B(igTextView3, 0);
                c139606Tp.A00 = igTextView3;
            }
        });
    }
}
