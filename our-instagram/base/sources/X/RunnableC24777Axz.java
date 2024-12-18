package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.Axz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24777Axz implements Runnable {
    public final /* synthetic */ C8NW A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public RunnableC24777Axz(C8NW c8nw, String str, String str2) {
        this.A00 = c8nw;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C194808jg A01;
        C8NW c8nw = this.A00;
        c8nw.A0F = null;
        C22920A8q c22920A8q = c8nw.A06;
        if (c22920A8q != null) {
            String str = this.A01;
            String str2 = this.A02;
            UserSession userSession = c22920A8q.A02;
            if (C18U.A06(C06090Tz.A05, userSession, 36327653728598786L)) {
                Context context = c22920A8q.A01;
                long A1B = c22920A8q.A03.A1B();
                A01 = new C194808jg(context, userSession, Arrays.asList(new C6RB(context, C05F.A00, A1B) { // from class: X.8x9
                    public final Drawable A00;

                    {
                        super(context, context.getResources().getDisplayMetrics().widthPixels);
                        String A05;
                        if (r14.intValue() != 0) {
                            A05 = C23831Eq.A01(A1B);
                        } else {
                            A05 = C23831Eq.A05(context, A1B, true);
                        }
                        int[] iArr = C6QG.A0H;
                        int i = iArr[0];
                        int i2 = iArr[1];
                        Paint paint = C3LQ.A00;
                        Drawable drawable = context.getDrawable(R.drawable.instagram_clock_pano_outline_24);
                        if (drawable != null) {
                            BitmapDrawable A02 = C3LQ.A02(context, drawable, i, i2);
                            this.A00 = A02;
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                            float f = dimensionPixelSize;
                            AMr.A08(context, this, r1.getDimensionPixelSize(R.dimen.contextual_sticker_tray_text_size), f, f);
                            Resources resources = context.getResources();
                            C14360o3.A0A(resources);
                            C4GL.A01(resources, A02, R.dimen.abc_dialog_padding_material);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A05);
                            AMr.A0A(resources, spannableStringBuilder, iArr, dimensionPixelSize);
                            C4GL.A03(A02, spannableStringBuilder, C05F.A00, 0, 0, resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                            A0L(spannableStringBuilder);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }, new C6RB(context, C05F.A01, A1B) { // from class: X.8x9
                    public final Drawable A00;

                    {
                        super(context, context.getResources().getDisplayMetrics().widthPixels);
                        String A05;
                        if (r14.intValue() != 0) {
                            A05 = C23831Eq.A01(A1B);
                        } else {
                            A05 = C23831Eq.A05(context, A1B, true);
                        }
                        int[] iArr = C6QG.A0H;
                        int i = iArr[0];
                        int i2 = iArr[1];
                        Paint paint = C3LQ.A00;
                        Drawable drawable = context.getDrawable(R.drawable.instagram_clock_pano_outline_24);
                        if (drawable != null) {
                            BitmapDrawable A02 = C3LQ.A02(context, drawable, i, i2);
                            this.A00 = A02;
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                            float f = dimensionPixelSize;
                            AMr.A08(context, this, r1.getDimensionPixelSize(R.dimen.contextual_sticker_tray_text_size), f, f);
                            Resources resources = context.getResources();
                            C14360o3.A0A(resources);
                            C4GL.A01(resources, A02, R.dimen.abc_dialog_padding_material);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A05);
                            AMr.A0A(resources, spannableStringBuilder, iArr, dimensionPixelSize);
                            C4GL.A03(A02, spannableStringBuilder, C05F.A00, 0, 0, resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                            A0L(spannableStringBuilder);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }));
            } else {
                A01 = C202288x8.A0F.A01(c22920A8q.A01, userSession, C148276lx.A18, str, str2, c22920A8q.A03.A1B() * 1000);
            }
            C23108AGw A00 = C23108AGw.A00();
            A00.A0F = true;
            A00.A06 = new C183748Cz(0.5f, 0.78f);
            c8nw.A1G(A01, C148276lx.A18, A00);
        }
    }
}
