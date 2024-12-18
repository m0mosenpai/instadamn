package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: X.9kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218079kf extends ACt {
    public C148276lx A00;
    public final Context A03;
    public final Bitmap A04;
    public final UserSession A05;
    public final C89F A06;
    public final TargetViewSizeProvider A07;
    public final C88Y A08;
    public final C36275FzS A09;
    public boolean A02 = false;
    public List A01 = AbstractC166987dD.A1E();

    public static C183978Ee A00(Context context, Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider) {
        if (bitmap == null) {
            return null;
        }
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        Bitmap createBitmap = Bitmap.createBitmap(interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        BackgroundGradientColors A01 = AbstractC14570oV.A01(bitmap, C05F.A00);
        int[] iArr = {A01.A01, A01.A00};
        C18160v1 A012 = AbstractC14620oa.A01(A01, 0);
        Paint A0S = AbstractC166987dD.A0S(4);
        A0S.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, createBitmap.getHeight(), iArr, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawPaint(A0S);
        File A04 = AbstractC13530mf.A04(context);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(A04.getPath());
            try {
                AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, createBitmap, fileOutputStream);
                long currentTimeMillis = System.currentTimeMillis();
                C183978Ee c183978Ee = new C183978Ee(A04, createBitmap.getWidth(), createBitmap.getHeight(), currentTimeMillis, currentTimeMillis, false);
                c183978Ee.A0I = A012;
                fileOutputStream.close();
                return c183978Ee;
            } finally {
            }
        } catch (IOException unused) {
            C9GR.A0A(context, "output_stream_failed");
            return null;
        }
    }

    public static void A01(C218079kf c218079kf) {
        C148276lx c148276lx = c218079kf.A00;
        if (c148276lx != null) {
            C194808jg A01 = C194808jg.A01(c218079kf.A03, c218079kf.A05, c148276lx);
            c218079kf.A08.A0B(A01, C5GJ.STORY_ATTRIBUTION, c148276lx, new C8FC((C8D0) new C183748Cz(0.5f, 0.5f), (C8FD) null, (C89G) null, C05F.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 7, false, false, true, true, false, false, true, true, true, true, true, true, false, false), false, false);
            return;
        }
        final Context context = c218079kf.A03;
        Drawable drawable = new Drawable(context) { // from class: X.9Rv
            public final C6RB A00;
            public final Context A01;

            {
                C14360o3.A0B(context, 1);
                this.A01 = context;
                Resources resources = context.getResources();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(2131953841));
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
                Paint paint = C3LQ.A00;
                Drawable A05 = C3LQ.A05(context, R.drawable.instagram_cake_pano_outline_24, context.getColor(R.color.audio_bar_action_color_enabled));
                C4GL.A01(resources, A05, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                C4GL.A02(A05, spannableStringBuilder, 0, 0, dimensionPixelSize);
                Spannable spannable = C6RB.A0d;
                C6RB A0Y = AbstractC167007dF.A0Y(context, resources, R.dimen.canvas_text_view_input_background_width);
                A0Y.A0L(spannableStringBuilder);
                float A04 = AbstractC166987dD.A04(resources, R.dimen.audition_flow_footer_button_horizontal_padding);
                float A042 = AbstractC166987dD.A04(resources, R.dimen.accent_edge_thickness);
                float A043 = AbstractC166987dD.A04(resources, R.dimen.accent_edge_thickness);
                AbstractC167017dG.A1N(context, A0Y);
                AbstractC167017dG.A0z(context, A0Y);
                AbstractC167007dF.A1A(A0Y, A04, A042, A043);
                this.A00 = A0Y;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                this.A00.draw(canvas);
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicHeight() {
                return this.A00.A06;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicWidth() {
                return this.A00.A0A;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.A00.setAlpha(i);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.A00.setColorFilter(colorFilter);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setBounds(int i, int i2, int i3, int i4) {
                super.setBounds(i, i2, i3, i4);
                float f = (i + i3) / 2.0f;
                float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
                float f2 = r4.A0A / 2.0f;
                float f3 = r4.A06 / 2.0f;
                AbstractC166997dE.A1E(this.A00, f - f2, A03 - f3, f + f2, A03 + f3);
            }
        };
        c218079kf.A08.A0C(drawable, new C8FC((C8D0) new C183748Cz(0.22f, 0.88f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 7, false, false, true, true, false, false, true, true, true, true, true, true, false, false), false);
    }

    public static void A02(C218079kf c218079kf, C38321qM c38321qM) {
        if (c218079kf.A00 != null) {
            C148276lx c148276lx = C148276lx.A18;
            c218079kf.A08.A0C(C202288x8.A0F.A01(c218079kf.A03, c218079kf.A05, c148276lx, null, null, c38321qM.A1B() * 1000), AMV.A00(), false);
        }
    }

    public C218079kf(Context context, UserSession userSession, C89F c89f, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y) {
        this.A03 = context;
        this.A06 = c89f;
        this.A08 = c88y;
        this.A05 = userSession;
        this.A07 = targetViewSizeProvider;
        this.A09 = (C36275FzS) userSession.A01(C36275FzS.class, new C31651DvH(userSession, 2));
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        this.A04 = Bitmap.createBitmap(interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), Bitmap.Config.RGB_565);
    }

    public static void A03(C218079kf c218079kf, List list, int i) {
        if (i == list.size()) {
            C88Y c88y = c218079kf.A08;
            List list2 = c218079kf.A01;
            C88E c88e = c88y.A00;
            c88e.A01.A00();
            A01(c218079kf);
            c88y.A0G(c88e.A01.A01.A08(), list2);
            return;
        }
        C38321qM c38321qM = (C38321qM) list.get(i);
        Context context = c218079kf.A03;
        C121275eQ c121275eQ = new C121275eQ(new PUR(context, c218079kf.A05, AbstractC50633MWu.A05(context, c38321qM, "CanvasBirthdayHighlightsController", false, false), c38321qM.A0z(), c38321qM.A0y(), -1L, false), 483);
        c121275eQ.A00 = new C215919h7(i, 1, c218079kf, list, c38321qM);
        C1GJ.A03(c121275eQ);
    }
}
