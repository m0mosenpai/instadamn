package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Mlx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51336Mlx extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final ClipsCreationViewModel A03;
    public final C51159Mj2 A04;
    public final Integer A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51336Mlx(View view, ClipsCreationViewModel clipsCreationViewModel, C51159Mj2 c51159Mj2, Integer num) {
        super(view);
        C14360o3.A0B(num, 4);
        this.A03 = clipsCreationViewModel;
        this.A04 = c51159Mj2;
        this.A05 = num;
        View requireViewById = view.requireViewById(R.id.voice_effect_icon);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        C14360o3.A07(requireViewById);
        this.A01 = imageView;
        this.A02 = AbstractC167007dF.A0N(view, R.id.voice_effect_name);
        this.A00 = AbstractC166997dE.A0S(view, R.id.selection_ring);
    }
}
