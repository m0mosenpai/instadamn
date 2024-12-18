package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UHC extends AbstractC70653Fc implements C7LD {
    public int A00;
    public RectF A01;
    public java.util.Set A02;
    public RecyclerView A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final LinearGradient A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Drawable A0E;
    public final Drawable A0F;
    public final Drawable A0G;
    public final Drawable A0H;
    public final TextPaint A0I;
    public final UserSession A0J;
    public final C66103Tze A0K;
    public final List A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final GestureDetector A0O;
    public final InterfaceC71927XAl A0P;

    public UHC(Context context, UserSession userSession, C66103Tze c66103Tze, InterfaceC71927XAl interfaceC71927XAl, java.util.Set set, boolean z, boolean z2) {
        C14360o3.A0B(c66103Tze, 3);
        this.A0J = userSession;
        this.A0K = c66103Tze;
        this.A0P = interfaceC71927XAl;
        this.A0N = z;
        this.A0M = z2;
        this.A02 = set;
        this.A0O = new GestureDetector(context, new C44907JuL(this, 1));
        Paint paint = new Paint();
        this.A0D = paint;
        TextPaint textPaint = new TextPaint();
        this.A0I = textPaint;
        Paint paint2 = new Paint();
        this.A0C = paint2;
        this.A0L = new ArrayList();
        this.A07 = context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A08 = context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A04 = context.getResources().getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
        this.A05 = context.getResources().getDimensionPixelOffset(R.dimen.accent_edge_thickness);
        this.A06 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        RectF rectF = AbstractC13880nE.A01;
        float f = (24.0f * AbstractC167007dF.A0K(context).scaledDensity) + 0.5f;
        this.A09 = context.getResources().getDimensionPixelOffset(R.dimen.action_bar_immersive_gradient_height);
        int A04 = (int) AbstractC13880nE.A04(context, 14);
        int A042 = (int) AbstractC13880nE.A04(context, 16);
        Drawable drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_12);
        C14360o3.A0A(drawable);
        Drawable mutate = drawable.mutate();
        mutate.setTint(-1);
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        this.A0E = mutate;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_star_pano_filled_24);
        C14360o3.A0A(drawable2);
        Drawable mutate2 = drawable2.mutate();
        mutate2.setTint(-1);
        mutate2.setBounds(0, 0, A042, A042);
        this.A0G = mutate2;
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_star_pano_outline_24);
        C14360o3.A0A(drawable3);
        Drawable mutate3 = drawable3.mutate();
        mutate3.setTint(-1);
        mutate3.setBounds(0, 0, A042, A042);
        this.A0H = mutate3;
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_x_pano_outline_16);
        C14360o3.A0A(drawable4);
        Drawable mutate4 = drawable4.mutate();
        mutate4.setTint(-1);
        mutate4.setBounds(0, 0, A04, A04);
        this.A0F = mutate4;
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.defaultFromStyle(1));
        textPaint.setTextSize(f);
        AbstractC166987dD.A1N(context, paint2, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_on_media));
        int color = context.getColor(R.color.black_60_transparent);
        this.A0A = color;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.A09, color, 0, Shader.TileMode.CLAMP);
        this.A0B = linearGradient;
        paint.setShader(linearGradient);
    }

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean z;
        UPV upv = null;
        Integer num = null;
        boolean A1R = AbstractC167007dF.A1R(0, recyclerView, motionEvent);
        if (motionEvent.getActionMasked() != 3) {
            List list = this.A0L;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((UPV) obj).A0A.A01 != null) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    UPV upv2 = (UPV) it.next();
                    if (upv2.A09.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        RectF rectF = upv2.A08;
                        float x = motionEvent.getX();
                        if (rectF != null && x <= rectF.right + (this.A07 * 3.0f)) {
                            num = C05F.A00;
                            z = true;
                            upv = upv2;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
            }
            C12500ku c12500ku = new C12500ku(recyclerView);
            while (c12500ku.hasNext()) {
                View view = (View) c12500ku.next();
                if (view instanceof IgImageButton) {
                    ((IgImageButton) view).setEnableTouchOverlay(!z);
                }
            }
            if (z && this.A0O.onTouchEvent(motionEvent) && num == C05F.A00) {
                InterfaceC71927XAl interfaceC71927XAl = this.A0P;
                if (interfaceC71927XAl != null) {
                    interfaceC71927XAl.DKI(upv.A0A);
                }
                return A1R;
            }
            if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == A1R) {
                A00(null, this);
            }
        }
        return false;
    }

    @Override // X.C7LD
    public final void Dfm(boolean z) {
    }

    @Override // X.C7LD
    public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC70653Fc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawOver(android.graphics.Canvas r35, androidx.recyclerview.widget.RecyclerView r36, X.C3F5 r37) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHC.onDrawOver(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, X.3F5):void");
    }

    public static final void A00(RectF rectF, UHC uhc) {
        if (!C14360o3.A0K(rectF, uhc.A01)) {
            uhc.A01 = rectF;
            RecyclerView recyclerView = uhc.A03;
            if (recyclerView != null) {
                recyclerView.A0h();
            }
        }
    }
}
