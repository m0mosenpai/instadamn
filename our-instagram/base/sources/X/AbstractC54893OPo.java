package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;

/* renamed from: X.OPo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54893OPo {
    public static final void A00(UserSession userSession, C72943Ou c72943Ou, InterfaceC16820sZ interfaceC16820sZ) {
        C72973Oy c72973Oy = c72943Ou.A02;
        c72973Oy.A02.A01 = "";
        AbstractC166987dD.A1P(AbstractC31172DnG.A05(c72943Ou), c72973Oy.A05.A04(), 2131963604);
        C3PF A00 = c72973Oy.A00(userSession, false);
        A00.A02();
        View[] viewArr = {c72943Ou.AeT()};
        List list = A00.A09;
        list.clear();
        list.add(new C3PA(viewArr[0]));
        c72973Oy.A00 = new C56527P7z(interfaceC16820sZ);
    }

    public static final void A01(AbstractC53522Nlo abstractC53522Nlo, C72933Ot c72933Ot) {
        Drawable drawable;
        AbstractC167017dG.A0V(c72933Ot.A09).setVisibility(8);
        InterfaceC09390do interfaceC09390do = c72933Ot.A03;
        CircularImageView circularImageView = ((C3P2) interfaceC09390do.getValue()).A0L;
        if (!(abstractC53522Nlo instanceof C68078V9i) && !C14360o3.A0K(abstractC53522Nlo, NSF.A00)) {
            if (abstractC53522Nlo instanceof NSG) {
                drawable = new C50741Mav(AbstractC166997dE.A0L(circularImageView), 0.0f, true, true);
            } else {
                throw B4Z.A00();
            }
        } else {
            Context A0L = AbstractC166997dE.A0L(circularImageView);
            boolean A1a = AbstractC25225BEi.A1a(abstractC53522Nlo, NSF.A00);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            AbstractC166987dD.A1N(A0L, paint, R.color.direct_widget_primary_background);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            Paint paint2 = shapeDrawable2.getPaint();
            AbstractC166987dD.A1N(A0L, paint2, R.color.direct_widget_primary_background);
            paint2.setStyle(style);
            paint2.setAntiAlias(true);
            int i = R.drawable.instagram_eye_off_pano_outline_24;
            if (A1a) {
                i = R.drawable.instagram_my_week_story_pano_outline_24;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, C3LQ.A05(A0L, i, A0L.getColor(R.color.igds_primary_icon))});
            int A01 = C1H4.A01(AbstractC13880nE.A04(A0L, 20));
            layerDrawable.setLayerInset(0, 0, 0, 0, 0);
            layerDrawable.setLayerInset(1, A01, A01, A01, A01);
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable, layerDrawable});
            int A012 = C1H4.A01(AbstractC13880nE.A04(A0L, 0));
            layerDrawable2.setLayerInset(0, 0, 0, 0, 0);
            layerDrawable2.setLayerInset(1, A012, A012, A012, A012);
            drawable = layerDrawable2;
        }
        circularImageView.setBackground(drawable);
        ((C3P2) interfaceC09390do.getValue()).A0O.setVisibility(4);
    }
}
