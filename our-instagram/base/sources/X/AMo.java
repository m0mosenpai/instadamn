package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes4.dex */
public abstract class AMo {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 > 0.0f) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(android.view.View r4, final int r5) {
        /*
            r3 = 0
            X.C14360o3.A0B(r4, r3)
            boolean r0 = A09()
            if (r0 == 0) goto L17
            X.9TW r0 = new X.9TW
            r0.<init>()
            r4.setOutlineProvider(r0)
        L12:
            r1 = 1
        L13:
            r4.setClipToOutline(r1)
            return
        L17:
            float r2 = (float) r5
            r0 = 1047904911(0x3e75c28f, float:0.24)
            float r2 = r2 * r0
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            X.McB r0 = new X.McB
            r0.<init>(r2, r3)
        L26:
            r4.setOutlineProvider(r0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L13
            goto L12
        L2f:
            r0 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMo.A06(android.view.View, int):void");
    }

    public static final void A07(ImageView imageView, String str) {
        C14360o3.A0B(imageView, 0);
        Resources resources = imageView.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        Spannable spannable = C6RB.A0d;
        C6RB c6rb = new C6RB(AbstractC166997dE.A0L(imageView), dimensionPixelSize2);
        if (str == null) {
            str = "";
        }
        AbstractC166997dE.A1Q(c6rb, str);
        c6rb.A09();
        c6rb.A0A(dimensionPixelSize);
        imageView.setImageDrawable(c6rb);
    }

    public static final void A08(UserSession userSession, IgImageView igImageView, int i, int i2) {
        Context A0L = AbstractC166997dE.A0L(igImageView);
        String A02 = AbstractC56412ia.A02(igImageView.getResources(), i);
        if (A02 == null) {
            A02 = "";
        }
        String valueOf = String.valueOf(i);
        igImageView.setImageDrawable(new C74P(A0L, userSession, new C74V(i2, i2, i2), C05F.A00, A02, valueOf, (String) null, 1.0f, A0L.getColor(R.color.fds_transparent), A0L.getColor(R.color.fds_transparent), false));
    }

    public static final int A00(Context context, int i) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            return resources.getDimensionPixelSize(i);
        }
        return 0;
    }

    public static final ShapeDrawable A03(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        AbstractC166987dD.A1R(paint);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }

    public static final SpannableStringBuilder A04(Context context, String str) {
        Drawable drawable;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (context != null && (drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_12)) != null) {
            BitmapDrawable A01 = C3LQ.A01(context, drawable, AbstractC167007dF.A09(context, R.attr.igds_color_primary_button_on_media));
            int A00 = A00(context, R.dimen.abc_control_corner_material);
            A01.setBounds(0, 0, A01.getIntrinsicWidth(), A01.getIntrinsicHeight());
            C4GL.A02(A01, spannableStringBuilder, spannableStringBuilder.length(), A00, 0);
        }
        return spannableStringBuilder;
    }

    public static final C17050sx A05(Fragment fragment, InterfaceC16660sJ interfaceC16660sJ, int i) {
        return AbstractC167007dF.A0q(fragment, interfaceC16660sJ, i, 24);
    }

    public static final boolean A09() {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        return true;
    }

    public static final LinearGradient A01(Context context, float f, float f2) {
        return new LinearGradient(0.0f, f2, f, 0.0f, new int[]{context.getColor(R.color.quick_snap_caption_gradient_start_color), context.getColor(R.color.quick_snap_caption_gradient_center_color), context.getColor(R.color.quick_snap_caption_gradient_end_color)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static final Path A02(int i) {
        boolean A09 = A09();
        Path A0T = AbstractC166987dD.A0T();
        if (A09) {
            A0T.moveTo(428.8f, 0.46f);
            A0T.cubicTo(261.14f, 4.97f, 138.6f, 20.73f, 91.25f, 43.86f);
            A0T.cubicTo(72.16f, 53.19f, 56.36f, 68.21f, 46.07f, 86.78f);
            A0T.cubicTo(21.97f, 130.29f, 5.95f, 248.64f, 0.7f, 421.78f);
            A0T.cubicTo(-0.61f, 465.2f, 0.02f, 596.23f, 1.73f, 632.78f);
            A0T.cubicTo(6.99f, 745.8f, 14.89f, 820.98f, 27.41f, 877.28f);
            A0T.cubicTo(39.56f, 931.88f, 56.61f, 958.11f, 91.3f, 975.53f);
            A0T.cubicTo(137.19f, 998.59f, 252.85f, 1013.76f, 421.8f, 1018.88f);
            A0T.cubicTo(465.21f, 1020.19f, 596.25f, 1019.56f, 632.8f, 1017.86f);
            A0T.cubicTo(787.2f, 1010.67f, 886.22f, 996.67f, 926.8f, 976.29f);
            A0T.cubicTo(953.18f, 963.05f, 972.33f, 940.81f, 982.71f, 911.36f);
            A0T.cubicTo(1001.67f, 857.63f, 1014.35f, 747.7f, 1018.89f, 597.78f);
            A0T.cubicTo(1020.2f, 554.37f, 1019.57f, 423.34f, 1017.87f, 386.78f);
            A0T.cubicTo(1010.64f, 231.49f, 996.64f, 132.99f, 976.02f, 92.28f);
            A0T.cubicTo(965.14f, 70.82f, 948.35f, 54.09f, 926.8f, 43.27f);
            A0T.cubicTo(882.93f, 21.25f, 765.77f, 5.93f, 601.8f, 0.78f);
            A0T.cubicTo(574.59f, -0.07f, 456.65f, -0.29f, 428.8f, 0.46f);
            A0T.close();
            Matrix A0Q = AbstractC166987dD.A0Q();
            RectF A0X = AbstractC166987dD.A0X();
            A0T.computeBounds(A0X, true);
            float f = i;
            A0Q.setScale(f / A0X.width(), f / A0X.height(), 0.0f, 0.0f);
            A0T.transform(A0Q);
            return A0T;
        }
        float f2 = i;
        float f3 = f2 * 0.24f;
        float f4 = f2 / 2.0f;
        A0T.moveTo(f4, 0.0f);
        A0T.lineTo(f3, 0.0f);
        float f5 = 2.0f * f3;
        A0T.arcTo(0.0f, 0.0f, f5, f5, -90.0f, -90.0f, false);
        float f6 = f2 - f5;
        A0T.lineTo(0.0f, f6);
        A0T.arcTo(0.0f, f6, f5, f2, 180.0f, -90.0f, false);
        A0T.lineTo(f2 - f3, f2);
        A0T.arcTo(f6, f6, f2, f2, 90.0f, -90.0f, false);
        A0T.lineTo(f2, f3);
        A0T.arcTo(f6, 0.0f, f2, f5, 0.0f, -90.0f, false);
        A0T.lineTo(f4, 0.0f);
        return A0T;
    }
}
