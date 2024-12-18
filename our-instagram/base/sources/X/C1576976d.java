package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.76d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1576976d {
    public final CircularImageView A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final InterfaceC56392iX A03;
    public final IgProgressImageView A04;
    public final IgProgressImageView A05;
    public final RoundedCornerMediaFrameLayout A06;
    public final InterfaceC09390do A07;

    public C1576976d(View view) {
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.media_container);
        C14360o3.A07(requireViewById);
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.image);
        C14360o3.A07(requireViewById2);
        IgProgressImageView igProgressImageView = (IgProgressImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.circular_image);
        C14360o3.A07(requireViewById3);
        CircularImageView circularImageView = (CircularImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.squoval_image);
        C14360o3.A07(requireViewById4);
        IgProgressImageView igProgressImageView2 = (IgProgressImageView) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.preview_icon);
        C14360o3.A07(requireViewById5);
        IgImageView igImageView = (IgImageView) requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.header_icons);
        C14360o3.A07(requireViewById6);
        IgImageView igImageView2 = (IgImageView) requireViewById6;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.findViewById(R.id.content_attribution_stub), false, false);
        C14360o3.A0B(roundedCornerMediaFrameLayout, 1);
        C14360o3.A0B(igProgressImageView, 2);
        C14360o3.A0B(circularImageView, 3);
        C14360o3.A0B(igProgressImageView2, 4);
        C14360o3.A0B(igImageView, 5);
        C14360o3.A0B(igImageView2, 6);
        this.A06 = roundedCornerMediaFrameLayout;
        this.A04 = igProgressImageView;
        this.A00 = circularImageView;
        this.A05 = igProgressImageView2;
        this.A02 = igImageView;
        this.A01 = igImageView2;
        this.A03 = A01;
        this.A07 = AbstractC09440dt.A01(new C9E8(this, 27));
    }
}
