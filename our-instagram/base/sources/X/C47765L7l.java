package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.R;
import java.util.Arrays;

/* renamed from: X.L7l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47765L7l {
    public float[] A00;
    public final float A01;
    public final float A02;
    public final Context A03;
    public final View A04;

    public C47765L7l(Context context, View view) {
        C14360o3.A0B(view, 2);
        this.A03 = context;
        this.A04 = view;
        this.A01 = AbstractC166987dD.A04(context.getResources(), R.dimen.asset_picker_redesign_sticker_height);
        this.A02 = AbstractC167017dG.A03(context);
        this.A00 = new float[8];
    }

    public final void A00(int i) {
        float A00 = JQ0.A00(i / this.A01);
        float[] fArr = this.A00;
        Arrays.fill(fArr, 0, 4, this.A02 * A00);
        Drawable background = this.A04.getBackground();
        C14360o3.A0C(background, AbstractC111324zv.A00(27));
        ((GradientDrawable) background).setCornerRadii(fArr);
    }
}
