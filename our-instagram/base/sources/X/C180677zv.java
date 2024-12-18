package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180677zv extends C3OO {
    public AnonymousClass808 A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final View A04;
    public final ImageView.ScaleType A05;
    public final IgSimpleImageView A06;
    public final IgSimpleImageView A07;
    public final IgTextView A08;
    public final InterfaceC56392iX A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C180677zv(View view, int i) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = i;
        View requireViewById = view.requireViewById(R.id.button_icon);
        C14360o3.A07(requireViewById);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) requireViewById;
        this.A07 = igSimpleImageView;
        View requireViewById2 = view.requireViewById(R.id.button_icon_image);
        C14360o3.A07(requireViewById2);
        this.A06 = (IgSimpleImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.button_name);
        C14360o3.A07(requireViewById3);
        IgTextView igTextView = (IgTextView) requireViewById3;
        this.A08 = igTextView;
        this.A09 = AbstractC56372iV.A01(view.findViewById(R.id.button_new_badge_stub), false, false);
        View requireViewById4 = view.requireViewById(R.id.gallery_destination_item);
        C14360o3.A07(requireViewById4);
        this.A04 = requireViewById4;
        ImageView.ScaleType scaleType = igSimpleImageView.getScaleType();
        C14360o3.A07(scaleType);
        this.A05 = scaleType;
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        this.A02 = layoutParams.width;
        this.A01 = igTextView.getTextSize();
    }
}
