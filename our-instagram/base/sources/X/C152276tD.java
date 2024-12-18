package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152276tD extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final InterfaceC56392iX A04;
    public final Context A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152276tD(View view) {
        super(view);
        int dimensionPixelSize;
        C14360o3.A0B(view, 1);
        this.A00 = view;
        Context context = view.getContext();
        C14360o3.A07(context);
        this.A05 = context;
        View findViewById = view.findViewById(R.id.inner_button_view);
        C14360o3.A07(findViewById);
        ImageView imageView = (ImageView) findViewById;
        this.A01 = imageView;
        View findViewById2 = view.findViewById(R.id.button_background_view);
        C14360o3.A07(findViewById2);
        CircularImageView circularImageView = (CircularImageView) findViewById2;
        this.A03 = circularImageView;
        View findViewById3 = view.findViewById(R.id.label);
        C14360o3.A07(findViewById3);
        this.A02 = (TextView) findViewById3;
        this.A04 = AbstractC56372iV.A01(view.findViewById(R.id.notification), false, false);
        if (C14640oc.A02()) {
            int A0G = AbstractC53242c7.A0G(context, R.attr.reelsTrayAvatarInnerSize);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
            Context context2 = imageView.getContext();
            C14360o3.A07(context2);
            dimensionPixelSize = AbstractC14670of.A05(context2, A0G, dimensionPixelSize2);
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
        }
        AbstractC13880nE.A0W(circularImageView, dimensionPixelSize);
        AbstractC13880nE.A0g(circularImageView, dimensionPixelSize);
    }
}
