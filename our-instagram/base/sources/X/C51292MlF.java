package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;

/* renamed from: X.MlF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51292MlF extends C3OO {
    public final TextView A00;
    public final CircularProgressImageView A01;
    public final /* synthetic */ C51135Mie A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51292MlF(View view, C51135Mie c51135Mie) {
        super(view);
        this.A02 = c51135Mie;
        this.A00 = AbstractC167007dF.A0N(view, R.id.text_sfx_name);
        CircularProgressImageView circularProgressImageView = (CircularProgressImageView) AbstractC166997dE.A0R(view, R.id.sfx_icon);
        this.A01 = circularProgressImageView;
        circularProgressImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
