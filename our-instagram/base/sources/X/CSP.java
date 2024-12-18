package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class CSP {
    public final Activity A00;
    public final Dialog A01;
    public final Bitmap A02;
    public final UserSession A03;
    public final String A04;

    public CSP(Activity activity, Bitmap bitmap, UserSession userSession, String str) {
        C89533yt c89533yt;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = bitmap;
        this.A04 = str;
        C193328hC c193328hC = new C193328hC(activity);
        Activity activity2 = this.A00;
        int round = Math.round(AbstractC13880nE.A04(activity2, 2));
        int round2 = Math.round(AbstractC13880nE.A04(activity2, 1));
        int round3 = Math.round(AbstractC25235BEs.A04(activity2));
        int i = round3 + ((round + round2) * 2);
        int i2 = (round2 * 2) + round3;
        Rect rect = new Rect(0, 0, i2, i2);
        Rect rect2 = new Rect(0, 0, i, i);
        int color = activity2.getColor(R.color.grey_1);
        int color2 = activity2.getColor(R.color.baseline_neutral_80);
        int[] iArr = new int[5];
        C50L.A03(activity2, null, iArr, R.style.GradientPatternStyle);
        LinearGradient A02 = C50L.A02(iArr, round3, round3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setBounds(rect2);
        AbstractC166997dE.A1F(shapeDrawable, -1);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.setBounds(rect);
        BitmapDrawable A00 = C3LQ.A00(activity2, A02, shapeDrawable2);
        Drawable drawable = activity2.getDrawable(R.drawable.archive_prompt);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, A00, drawable});
        layerDrawable.setLayerInset(1, round, round, round, round);
        int round4 = Math.round(AbstractC166987dD.A02(i - drawable.getIntrinsicWidth()));
        layerDrawable.setLayerInset(2, round4, round4, round4, round4);
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            c89533yt = new C89533yt(null, this.A04, i, round, -1, round2, color2, color, false);
            c89533yt.A01(bitmap2);
        } else {
            c89533yt = new C89533yt(AbstractC166987dD.A10(this.A03).Bhu(), this.A04, i, round, -1, round2, color2, color, false);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(c89533yt);
        A1E.add(layerDrawable);
        c193328hC.A0k(new C89553yv(activity2, C05F.A00, A1E, 0.27f, i, false));
        c193328hC.A0A(2131953173);
        c193328hC.A09(2131953171);
        c193328hC.A0s(false);
        c193328hC.A0t(false);
        c193328hC.A0F(new DialogInterfaceOnClickListenerC28537CiV(this, 5));
        c193328hC.A0I(new DialogInterfaceOnClickListenerC28539CiX(0, this, userSession), 2131953172);
        this.A01 = c193328hC.A02();
    }
}
