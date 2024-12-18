package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* loaded from: classes6.dex */
public final class EZM extends ColorFilterAlphaImageView implements InterfaceC85983sV {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZM(Context context, View.OnClickListener onClickListener, Integer num, Integer num2, int i) {
        super(context);
        int i2;
        Bitmap A00;
        C14360o3.A0B(context, 1);
        int intValue = num.intValue();
        int i3 = 0;
        if (intValue != 2) {
            Integer num3 = C05F.A00;
            if (intValue != 0) {
                if (num2 != num3) {
                    i3 = R.drawable.instagram_more_horizontal_pano_outline_24;
                }
            } else {
                i3 = R.drawable.instagram_x_pano_outline_24;
                if (num2 == num3) {
                    i3 = R.drawable.instagram_x_pano_outline_12;
                }
            }
        } else if (num2 == C05F.A0C) {
            i3 = R.drawable.instagram_chevron_right_pano_outline_24;
        }
        Integer num4 = C05F.A01;
        AbstractC56952jT.A04(this, num4);
        Resources resources = context.getResources();
        switch (intValue) {
            case 0:
                i2 = 2131954754;
                break;
            case 1:
                i2 = 2131966337;
                break;
            default:
                i2 = 2131973191;
                break;
        }
        AbstractC31172DnG.A1E(resources, this, i2);
        if (i3 != 0) {
            setImageResource(i3);
            int color = context.getColor(i);
            A04(color, color);
        } else if (intValue == 2 && num2 == num4) {
            Context A0L = AbstractC166997dE.A0L(this);
            int A0C = AbstractC166987dD.A0C(A0L, 16);
            Drawable A01 = AbstractC85953sP.A01(A0L, R.drawable.instagram_chevron_right_pano_outline_24, i);
            if (A01 != null && (A00 = AbstractC27488CBj.A00(A01, A0C, A0C)) != null) {
                setImageDrawable(new BitmapDrawable(AbstractC166997dE.A0M(A0L), A00));
            }
        }
        int A0C2 = AbstractC166987dD.A0C(context, 10);
        AbstractC13880nE.A0j(this, A0C2, A0C2);
        setOnClickListener(onClickListener);
    }
}
