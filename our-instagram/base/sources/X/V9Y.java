package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V9Y extends AbstractC130945vi implements C5RR {
    public static final Interpolator A0g = new DecelerateInterpolator();
    public int A00;
    public long A01;
    public C68001V5t A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final Drawable A0F;
    public final GradientDrawable A0G;
    public final Wm1 A0H;
    public final C6RB A0I;
    public final String A0J;
    public final int[] A0M;
    public final int[] A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final int A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final int A0Z;
    public final Rect A0a;
    public final Rect A0b;
    public final Drawable A0c;
    public final Drawable A0d;
    public final UserSession A0e;
    public final List A0f;
    public final List A0L = new ArrayList();
    public final List A0K = new ArrayList();

    private void A00() {
        int i;
        List list = this.A0f;
        List list2 = this.A0K;
        list.removeAll(list2);
        list2.clear();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            InterfaceC43540JLa interfaceC43540JLa = (InterfaceC43540JLa) it.next();
            C6RB c6rb = new C6RB(this.A0C, (((this.A0Z - (this.A0X * 2)) - (this.A0P * 2)) - this.A0Q) - this.A0U);
            if (TextUtils.isEmpty(interfaceC43540JLa.getText())) {
                if (interfaceC43540JLa.BEE() != null) {
                    c6rb.A0M(interfaceC43540JLa.BEE());
                    i = this.A0S;
                } else {
                    c6rb.A0A(this.A0V);
                    c6rb.A0K(Layout.Alignment.ALIGN_NORMAL);
                    c6rb.setCallback(this);
                    list2.add(c6rb);
                    list.add(c6rb);
                }
            } else {
                c6rb.A0M(interfaceC43540JLa.getText());
                i = this.A0T;
            }
            c6rb.A0F(i);
            c6rb.A0A(this.A0V);
            c6rb.A0K(Layout.Alignment.ALIGN_NORMAL);
            c6rb.setCallback(this);
            list2.add(c6rb);
            list.add(c6rb);
        }
    }

    private void A01() {
        List list = this.A0f;
        List list2 = this.A0L;
        list.removeAll(list2);
        list2.clear();
        for (int i = 0; i < this.A03.size(); i++) {
            Context context = this.A0C;
            C216099hS c216099hS = new C216099hS(context, context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i]);
            c216099hS.setCallback(this);
            list2.add(c216099hS);
            list.add(c216099hS);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0f;
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A0N;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        C68001V5t c68001V5t;
        C68001V5t c68001V5t2;
        if (this.A04) {
            this.A0d.draw(canvas);
        }
        this.A0c.draw(canvas);
        this.A0G.draw(canvas);
        this.A0I.draw(canvas);
        canvas.save();
        int i2 = 0;
        while (true) {
            List list = this.A0K;
            if (i2 < list.size()) {
                if (this.A05 && i2 == (i = this.A00) && (c68001V5t = this.A02) != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C6RB c6rb = (C6RB) list.get(i);
                    long j = this.A01;
                    if (currentTimeMillis < 500 + j) {
                        this.A0E.draw(canvas);
                        Integer num = C05F.A01;
                        c68001V5t.A01 = num;
                        c68001V5t.A02 = num;
                        c68001V5t.invalidateSelf();
                        c68001V5t.A03 = true;
                        c68001V5t.A00 = System.currentTimeMillis();
                        c68001V5t.invalidateSelf();
                        c68001V5t.draw(canvas);
                        c6rb.A0F(this.A06);
                        c68001V5t2 = c6rb;
                    } else if (currentTimeMillis < 800 + j) {
                        float interpolation = A0g.getInterpolation(AbstractC13600mm.A01((float) (currentTimeMillis - j), 500.0f, 800.0f, 1.0f, 0.0f));
                        this.A0D.draw(canvas);
                        Drawable drawable2 = this.A0E;
                        drawable2.setAlpha(Math.round(255.0f * interpolation));
                        drawable2.draw(canvas);
                        c6rb.A0F(AbstractC13950nL.A02(interpolation, this.A07, this.A06));
                        c6rb.draw(canvas);
                        Integer num2 = C05F.A00;
                        Integer num3 = c68001V5t.A01;
                        if (num3 == null) {
                            c68001V5t.A01 = num2;
                            c68001V5t.A02 = num2;
                        } else {
                            if (num3 != num2) {
                                c68001V5t.A02 = num3;
                                c68001V5t.A01 = num2;
                            }
                            c68001V5t2 = c68001V5t;
                        }
                        c68001V5t.invalidateSelf();
                        c68001V5t2 = c68001V5t;
                    } else {
                        this.A0D.draw(canvas);
                        c68001V5t.A03 = false;
                        c68001V5t.invalidateSelf();
                        c68001V5t.draw(canvas);
                        c6rb.A0F(this.A07);
                        drawable = c6rb;
                    }
                    c68001V5t2.draw(canvas);
                    invalidateSelf();
                    canvas.translate(0.0f, this.A0O + this.A0W);
                    i2++;
                } else {
                    ((Drawable) this.A0L.get(i2)).draw(canvas);
                    this.A0D.draw(canvas);
                    drawable = (Drawable) list.get(i2);
                }
                drawable.draw(canvas);
                canvas.translate(0.0f, this.A0O + this.A0W);
                i2++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int size = this.A0R + (this.A0K.size() * (this.A0W + this.A0O));
        int i = this.A0B;
        C6RB c6rb = this.A0I;
        return ((i + c6rb.A06) - c6rb.A08) + this.A09 + size + this.A0X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0Z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i7 = i6 - intrinsicHeight;
        int i8 = i6 + intrinsicHeight;
        C6RB c6rb = this.A0I;
        int i9 = c6rb.A08;
        int i10 = this.A0B;
        int i11 = (i10 + c6rb.A06) - i9;
        int i12 = this.A09;
        int i13 = i11 + i12 + i7;
        int i14 = this.A0R + i13 + this.A0W;
        this.A0c.setBounds(i, i7, i3, i8);
        Drawable drawable = this.A0d;
        int i15 = this.A0Y;
        drawable.setBounds(i - i15, i7 - i15, i3 + i15, i8 + i15);
        this.A0G.setBounds(i, i7, i3, i13);
        int i16 = c6rb.A0A / 2;
        c6rb.setBounds(i5 - i16, (i7 + i10) - i9, i5 + i16, (i13 - i12) + i9);
        Rect rect = this.A0a;
        int i17 = this.A0X;
        int i18 = i + i17;
        int i19 = i3 - i17;
        int i20 = this.A0O;
        rect.set(i18, i14, i19, i20 + i14);
        this.A0D.setBounds(rect);
        this.A0E.setBounds(rect);
        Rect rect2 = this.A0b;
        int i21 = this.A0P;
        int i22 = i18 + i21;
        int i23 = (i20 / 2) + i14;
        int i24 = this.A0Q;
        int i25 = i24 / 2;
        int i26 = i22 + i24;
        rect2.set(i22, i23 - i25, i26, i25 + i23);
        C68001V5t c68001V5t = this.A02;
        if (c68001V5t != null) {
            c68001V5t.setBounds(rect2);
        }
        this.A0F.setBounds(rect2);
        for (int i27 = 0; i27 < this.A03.size(); i27++) {
            ((Drawable) this.A0L.get(i27)).setBounds(rect2);
            List list = this.A0K;
            ((Drawable) list.get(i27)).setBounds(i26 + this.A0U, i23 - (((C6RB) list.get(i27)).A06 / 2), i19 - i21, (((C6RB) list.get(i27)).A06 / 2) + i23);
        }
    }

    public V9Y(Context context, UserSession userSession, Wm1 wm1) {
        C6RB c6rb;
        ArrayList arrayList = new ArrayList();
        this.A0f = arrayList;
        this.A0a = new Rect();
        this.A0b = new Rect();
        this.A00 = -1;
        this.A0e = userSession;
        this.A0C = context;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0X = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A0Z = dimensionPixelSize2;
        this.A0Y = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0A = resources.getDimensionPixelSize(R.dimen.poll_v2_sticker_title_text_size);
        this.A0B = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A09 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0R = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0O = resources.getDimensionPixelSize(R.dimen.activation_row_icon_size);
        this.A0P = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0W = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0Q = resources.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material);
        this.A0V = resources.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A0U = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A08 = context.getColor(R.color.audio_bar_action_color_enabled);
        this.A07 = context.getColor(R.color.countdown_sticker_title_text_color);
        this.A06 = context.getColor(R.color.audio_bar_action_color_enabled);
        this.A0J = context.getString(2131971439);
        Drawable drawable = context.getDrawable(R.drawable.quiz_sticker_background);
        drawable.getClass();
        this.A0c = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.sticker_background_shadow);
        drawable2.getClass();
        this.A0d = drawable2;
        drawable2.setCallback(this);
        Drawable drawable3 = context.getDrawable(R.drawable.quiz_sticker_title_background);
        drawable3.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable3.mutate();
        this.A0G = gradientDrawable;
        Drawable drawable4 = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_unselected);
        drawable4.getClass();
        this.A0D = drawable4;
        Drawable drawable5 = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_selected_refreshed);
        drawable5.getClass();
        this.A0E = drawable5;
        Drawable drawable6 = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        drawable6.getClass();
        Drawable mutate = drawable6.mutate();
        this.A0F = mutate;
        AbstractC25231BEo.A0x(context, mutate, R.color.audio_bar_action_color_enabled);
        C6RB c6rb2 = new C6RB(context, dimensionPixelSize2 - (dimensionPixelSize * 2));
        this.A0I = c6rb2;
        int color = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        int i = 0;
        this.A0M = new int[]{color, color};
        int color2 = context.getColor(R.color.direct_dark_mode_composer_hint_text_color);
        this.A0N = new int[]{color2, color2};
        this.A0S = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        this.A0T = context.getColor(R.color.countdown_sticker_title_text_color);
        this.A03 = new ArrayList(VZ0.A00(context.getResources()));
        Collections.addAll(arrayList, drawable, gradientDrawable, c6rb2, drawable4);
        C6RB c6rb3 = this.A0I;
        c6rb3.A0M(this.A0J);
        float f = this.A0A;
        c6rb3.A0A(f);
        c6rb3.A0F(this.A08);
        Context context2 = this.A0C;
        C14360o3.A0B(context2, 0);
        c6rb3.A0I(AbstractC15960qq.A00(context2).A02(EnumC15950qp.A0V));
        c6rb3.A09();
        c6rb3.A0A(f);
        c6rb3.A0C(0.0f, 0.0f);
        c6rb3.A0K(Layout.Alignment.ALIGN_CENTER);
        c6rb3.setCallback(this);
        A01();
        A00();
        this.A0H = wm1;
        if (wm1 != null) {
            if (TextUtils.isEmpty(wm1.A01)) {
                String str = wm1.A02.A04;
                c6rb = this.A0I;
                c6rb.A0M(TextUtils.isEmpty(str) ? this.A0J : str);
            } else {
                c6rb = this.A0I;
                c6rb.A0M(wm1.A01);
            }
            URM urm = wm1.A02;
            c6rb.A0F(AbstractC13950nL.A0C(urm.A0A, -1));
            List list = urm.A0B;
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ArrayList arrayList2 = this.A03;
                    int size = arrayList2.size();
                    Object obj = list.get(i2);
                    if (i2 < size) {
                        arrayList2.set(i2, obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                A00();
                A01();
            }
            int[] iArr = {AbstractC13950nL.A0C(urm.A09, -14277082), AbstractC13950nL.A0C(urm.A05, -14277082)};
            this.A0G.setColors(iArr);
            while (true) {
                ArrayList arrayList3 = this.A03;
                if (i >= arrayList3.size()) {
                    break;
                }
                C216099hS c216099hS = (C216099hS) this.A0L.get(i);
                if (TextUtils.isEmpty(((InterfaceC43540JLa) arrayList3.get(i)).getText())) {
                    c216099hS.A08(this.A0M, this.A0N);
                } else {
                    c216099hS.A08(iArr, iArr);
                }
                i++;
            }
            int A00 = wm1.A00();
            if (A00 != -1) {
                this.A00 = A00;
                Interpolator interpolator = C68001V5t.A08;
                this.A02 = new C68001V5t((Drawable) this.A0L.get(A00), this.A0F, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
            }
        }
    }
}
