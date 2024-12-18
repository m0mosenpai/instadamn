package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.facebook.R;
import java.util.Arrays;

/* renamed from: X.3ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80603ip {
    public static void A04(View view, InterfaceC125355lh interfaceC125355lh) {
        AbstractC125325le A0C = AbstractC125325le.A01(view, 1).A0D(new C104694nZ()).A0C(250L);
        A0C.A0U(1.0f, 0.0f, view.getPivotX());
        A0C.A0V(1.0f, 0.0f, view.getPivotY());
        A0C.A05 = interfaceC125355lh;
        A0C.A0H();
    }

    public static ShapeDrawable A00(Context context, int i) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, (i + (context.getResources().getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2)) / 2.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_on_media_panavision_updated)), PorterDuff.Mode.DST_IN);
        return shapeDrawable;
    }

    public static void A01(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            AbstractC125325le A0C = AbstractC125325le.A01(view, 1).A0D(new C104694nZ()).A0C(250L);
            A0C.A0M(0.0f, 1.0f);
            A0C.A0H();
        }
    }

    public static void A02(View view) {
        if (view.getVisibility() != 8) {
            AbstractC125325le A0C = AbstractC125325le.A01(view, 1).A0D(new C104694nZ()).A0C(250L);
            A0C.A0M(1.0f, 0.0f);
            A0C.A05 = new C24085AmW(view);
            A0C.A0H();
        }
    }

    public static void A03(View view, int i) {
        int measuredWidth = view.getMeasuredWidth();
        AbstractC125325le A0C = AbstractC125325le.A01(view, 1).A0D(new C104694nZ()).A0C(250L);
        A0C.A06 = new C49612Lw5(view, measuredWidth, i);
        A0C.A05 = new C24086AmX(view);
        A0C.A0H();
    }

    public static void A05(AbstractC50789Mc6 abstractC50789Mc6, InterfaceC125355lh interfaceC125355lh) {
        PointF relativeTagPosition = abstractC50789Mc6.getRelativeTagPosition();
        AbstractC125325le A0C = AbstractC125325le.A01(abstractC50789Mc6, 1).A0D(new C104694nZ()).A0C(250L);
        A0C.A0U(1.0f, 0.0f, relativeTagPosition.x);
        A0C.A0V(1.0f, 0.0f, relativeTagPosition.y);
        A0C.A05 = interfaceC125355lh;
        A0C.A0H();
    }
}
