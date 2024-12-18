package com.instagram.creation.base.ui.degreelabel;

import X.AbstractC13560mi;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC43592JPx;
import X.AbstractC53242c7;
import X.AnonymousClass001;
import X.C0f9;
import X.C48216LVq;
import X.C55942hf;
import X.C55952hg;
import X.C55982hj;
import X.HandlerC44381JjK;
import X.InterfaceC58143Pq8;
import X.LQ9;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class PillDegreeLabelManager extends View implements InterfaceC58143Pq8 {
    public float A00;
    public boolean A01;
    public boolean A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public Drawable A0C;
    public DrawableContainer A0D;
    public C55982hj A0E;
    public C55982hj A0F;
    public C55982hj A0G;
    public C55982hj A0H;
    public C55982hj A0I;
    public C55982hj A0J;
    public C55982hj A0K;
    public C55982hj A0L;
    public C55952hg A0M;
    public String A0N;
    public boolean A0O;
    public final Paint A0P;
    public final ShapeDrawable A0Q;
    public final Handler A0R;

    private C55982hj A00(C55942hf c55942hf) {
        C55982hj A02 = this.A0M.A02();
        A02.A09(c55942hf);
        A02.A08(-1000.0d, true);
        A02.A00 = 1.0d;
        A02.A02 = 60.0d;
        A02.A06 = true;
        return A02;
    }

    public static void A04(PillDegreeLabelManager pillDegreeLabelManager) {
        if (pillDegreeLabelManager.A02) {
            float A07 = AbstractC166987dD.A07(pillDegreeLabelManager) / 2.0f;
            double d = 0.0d;
            if (!pillDegreeLabelManager.A01) {
                float f = pillDegreeLabelManager.A09;
                float f2 = pillDegreeLabelManager.A06;
                A02(pillDegreeLabelManager.A0L, f2);
                float f3 = pillDegreeLabelManager.A07;
                float f4 = f + f3 + f2;
                if (pillDegreeLabelManager.A0O) {
                    f4 += f3 + pillDegreeLabelManager.A0C.getIntrinsicWidth();
                }
                float f5 = f4 + pillDegreeLabelManager.A04 + pillDegreeLabelManager.A05;
                A02(pillDegreeLabelManager.A0G, f5);
                A02(pillDegreeLabelManager.A0E, 255.0d);
                float f6 = A07 - (f5 / 2.0f);
                A02(pillDegreeLabelManager.A0F, f6);
                float f7 = f6 + pillDegreeLabelManager.A04;
                A02(pillDegreeLabelManager.A0K, f7);
                float f8 = f7 + f2 + pillDegreeLabelManager.A07;
                A02(pillDegreeLabelManager.A0J, (pillDegreeLabelManager.A09 / 2.0f) + f8);
                A02(pillDegreeLabelManager.A0I, f8 + pillDegreeLabelManager.A09 + pillDegreeLabelManager.A07);
                C55982hj c55982hj = pillDegreeLabelManager.A0H;
                if (pillDegreeLabelManager.A0O) {
                    d = 255.0d;
                }
                A02(c55982hj, d);
            } else {
                DrawableContainer drawableContainer = pillDegreeLabelManager.A0D;
                drawableContainer.getClass();
                float intrinsicWidth = drawableContainer.getIntrinsicWidth();
                double d2 = intrinsicWidth;
                A02(pillDegreeLabelManager.A0L, d2);
                double d3 = A07 - (intrinsicWidth / 2.0f);
                A02(pillDegreeLabelManager.A0K, d3);
                A02(pillDegreeLabelManager.A0J, A07);
                pillDegreeLabelManager.A0I.A08(-1000.0d, true);
                A02(pillDegreeLabelManager.A0H, 0.0d);
                A02(pillDegreeLabelManager.A0G, d2);
                A02(pillDegreeLabelManager.A0E, 0.0d);
                A02(pillDegreeLabelManager.A0F, d3);
            }
            A03(pillDegreeLabelManager);
        }
    }

    @Override // X.InterfaceC58143Pq8
    public final void hide() {
        List A1F;
        Handler handler = this.A0R;
        if (handler.hasMessages(1)) {
            this.A01 = true;
            handler.removeMessages(1);
        }
        Collection values = this.A0M.A02.values();
        if (values instanceof List) {
            A1F = (List) values;
        } else {
            A1F = AbstractC166987dD.A1F(values);
        }
        for (C55982hj c55982hj : Collections.unmodifiableList(A1F)) {
            c55982hj.A08(c55982hj.A09.A00, true);
        }
        this.A0M.A04.clear();
    }

    @Override // X.InterfaceC58143Pq8
    public void setDegree(float f) {
        if (!this.A02) {
            this.A00 = f;
            return;
        }
        if (f == 0.0f && this.A01) {
            return;
        }
        this.A0N = AnonymousClass001.A0C(String.valueOf(f), (char) 176);
        Handler handler = this.A0R;
        handler.removeMessages(1);
        float measureText = this.A0P.measureText(this.A0N);
        if (!this.A01 && AbstractC166987dD.A01(this.A09, measureText) < 2.0f) {
            invalidate();
        } else {
            this.A01 = false;
            this.A09 = measureText;
            A04(this);
        }
        if (f != 0.0f) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, 750L);
    }

    @Override // android.view.View, X.InterfaceC58143Pq8
    public void setSelected(boolean z) {
        int i;
        this.A0O = z;
        DrawableContainer drawableContainer = this.A0D;
        drawableContainer.getClass();
        drawableContainer.selectDrawable(!this.A0O ? 1 : 0);
        if (this.A0O) {
            i = this.A0A;
        } else {
            i = this.A0B;
        }
        AbstractC166997dE.A1F(this.A0C, i);
        AbstractC166997dE.A1F(this.A0D, i);
        this.A0Q.getPaint().setColor(i);
        this.A0P.setColor(i);
        A04(this);
    }

    @Override // X.InterfaceC58143Pq8
    public final void show() {
        C55952hg c55952hg = this.A0M;
        c55952hg.A04.add(new C48216LVq(this));
    }

    public PillDegreeLabelManager(Context context) {
        super(AbstractC53242c7.A0I(context, R.attr.pillLabelStyle));
        this.A0Q = new ShapeDrawable();
        this.A0P = AbstractC166987dD.A0R();
        this.A01 = true;
        this.A0N = "";
        this.A00 = Float.NaN;
        this.A0R = new HandlerC44381JjK(this);
        A01();
    }

    private void A01() {
        this.A0M = AbstractC13560mi.A00();
        C55942hf A04 = C55942hf.A04(20.0d, 4.0d);
        this.A0K = A00(A04);
        this.A0L = A00(A04);
        this.A0G = A00(A04);
        this.A0F = A00(A04);
        this.A0E = A00(A04);
        this.A0J = A00(A04);
        this.A0I = A00(A04);
        this.A0H = A00(A04);
        Resources resources = getResources();
        Context context = getContext();
        this.A0A = AbstractC53242c7.A0F(context, R.attr.pillSelectedColor);
        this.A0B = AbstractC53242c7.A0F(context, R.attr.pillUnselectedColor);
        float dimension = resources.getDimension(R.dimen.afi_indicator_arrow_margin_top);
        Drawable drawable = resources.getDrawable(R.drawable.adjust_reset_off);
        drawable.getClass();
        this.A0C = drawable;
        drawable.mutate();
        this.A03 = resources.getDimension(R.dimen.add_account_icon_circle_radius);
        this.A04 = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A05 = resources.getDimension(R.dimen.abc_button_inset_vertical_material);
        this.A07 = resources.getDimension(R.dimen.accent_edge_thickness);
        this.A06 = resources.getDimension(R.dimen.abc_select_dialog_padding_start_material);
        float f = this.A03 / 2.0f;
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = f;
            i++;
        } while (i < 8);
        ShapeDrawable shapeDrawable = this.A0Q;
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        AbstractC43592JPx.A1E(shapeDrawable.getPaint());
        shapeDrawable.getPaint().setStrokeWidth(dimension);
        Paint paint = this.A0P;
        paint.setTextSize(resources.getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        paint.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.A08 = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
        addOnLayoutChangeListener(new LQ9(this, 2));
    }

    public static void A03(PillDegreeLabelManager pillDegreeLabelManager) {
        float A08 = AbstractC166987dD.A08(pillDegreeLabelManager) / 2.0f;
        float f = (float) pillDegreeLabelManager.A0K.A09.A00;
        float f2 = (float) pillDegreeLabelManager.A0L.A09.A00;
        float f3 = (float) pillDegreeLabelManager.A0F.A09.A00;
        float f4 = (float) pillDegreeLabelManager.A0G.A09.A00;
        int max = Math.max(Math.min((int) Math.round(pillDegreeLabelManager.A0E.A09.A00), 255), 0);
        C55982hj c55982hj = pillDegreeLabelManager.A0I;
        float f5 = (float) c55982hj.A09.A00;
        int max2 = Math.max(Math.min((int) Math.round(pillDegreeLabelManager.A0H.A09.A00), 255), 0);
        if (max2 < 255 && c55982hj.A01 != -1000.0d) {
            f5 -= pillDegreeLabelManager.A0C.getIntrinsicHeight() * ((255 - max2) / 255.0f);
        }
        float f6 = A08 - (f2 / 2.0f);
        DrawableContainer drawableContainer = pillDegreeLabelManager.A0D;
        drawableContainer.getClass();
        drawableContainer.setBounds((int) f, (int) f6, Math.round(f + f2), Math.round(f6 + f2));
        float f7 = pillDegreeLabelManager.A03;
        float f8 = A08 - (f7 / 2.0f);
        ShapeDrawable shapeDrawable = pillDegreeLabelManager.A0Q;
        shapeDrawable.setBounds((int) f3, (int) f8, Math.round(f3 + f4), Math.round(f8 + f7));
        shapeDrawable.setAlpha(max);
        pillDegreeLabelManager.A0P.setAlpha(max);
        int round = Math.round(A08) - (pillDegreeLabelManager.A0C.getIntrinsicHeight() / 2);
        pillDegreeLabelManager.A0C.setBounds((int) f5, round, Math.round(f5 + r3.getIntrinsicWidth()), pillDegreeLabelManager.A0C.getIntrinsicHeight() + round);
        pillDegreeLabelManager.A0C.setAlpha(max2);
        pillDegreeLabelManager.invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(738023877);
        super.onDetachedFromWindow();
        this.A0R.removeMessages(1);
        C0f9.A0D(-1439474659, A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DrawableContainer drawableContainer = this.A0D;
        drawableContainer.getClass();
        drawableContainer.draw(canvas);
        boolean z = false;
        if (this.A0E.A09.A00 >= 1.0d) {
            z = true;
            canvas.drawText(this.A0N, (float) Math.round(this.A0J.A09.A00 - (this.A09 / 2.0f)), Math.round((AbstractC166987dD.A08(this) / 2.0f) - this.A08), this.A0P);
        }
        if (this.A0I.A01 != -1000.0d && this.A0H.A09.A00 >= 1.0d) {
            this.A0C.draw(canvas);
        }
        if (z && this.A0G.A09.A00 > 0.0d) {
            this.A0Q.draw(canvas);
        }
    }

    public void setDegreeLabelResource(int i) {
        this.A0D = (DrawableContainer) getContext().getDrawable(i);
    }

    public static void A02(C55982hj c55982hj, double d) {
        if (d != -1000.0d && c55982hj.A09.A00 != -1000.0d) {
            c55982hj.A06(d);
        } else {
            c55982hj.A08(d, true);
        }
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC53242c7.A0I(context, R.attr.pillLabelStyle), attributeSet, i);
        this.A0Q = new ShapeDrawable();
        this.A0P = AbstractC166987dD.A0R();
        this.A01 = true;
        this.A0N = "";
        this.A00 = Float.NaN;
        this.A0R = new HandlerC44381JjK(this);
        A01();
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet) {
        super(AbstractC53242c7.A0I(context, R.attr.pillLabelStyle), attributeSet);
        this.A0Q = new ShapeDrawable();
        this.A0P = AbstractC166987dD.A0R();
        this.A01 = true;
        this.A0N = "";
        this.A00 = Float.NaN;
        this.A0R = new HandlerC44381JjK(this);
        A01();
    }
}
