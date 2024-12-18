package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202548xY extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C6RL A03;
    public final C216229hf A04;
    public final AlA A05;
    public final C6RB A06;
    public final C6RB A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final List A0C;

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "i_take_care_dynamic_sticker_default";
    }

    public C202548xY(Context context, AlA alA) {
        ArrayList arrayList = new ArrayList();
        this.A0C = arrayList;
        Resources resources = context.getResources();
        this.A02 = context;
        this.A05 = alA;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0A = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A00 = resources.getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A09 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A01 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_facepile_text_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A0B = dimensionPixelSize3;
        C216229hf c216229hf = new C216229hf(context);
        this.A04 = c216229hf;
        c216229hf.setCallback(this);
        C6RB c6rb = new C6RB(context, dimensionPixelSize3 - (dimensionPixelSize * 2));
        this.A06 = c6rb;
        C6RB c6rb2 = new C6RB(context, dimensionPixelSize3 - (dimensionPixelSize2 * 2));
        this.A07 = c6rb2;
        C6RK c6rk = new C6RK(context, this, dimensionPixelSize3);
        c6rk.A07 = alA.A00;
        c6rk.A02(R.dimen.challenge_sticker_subtitle_text_size);
        this.A03 = c6rk.A00();
        C6RB c6rb3 = this.A06;
        c6rb3.A0M(this.A05.A02);
        float f = this.A00;
        c6rb3.A0A(f);
        Context context2 = this.A02;
        AMr.A06(context2, c6rb3, f, 0.0f);
        int color = context2.getColor(R.color.i_take_care_sticker_gradient_start);
        int color2 = context2.getColor(R.color.i_take_care_sticker_gradient_end);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c6rb3.A0K(alignment);
        c6rb3.setCallback(this);
        TextPaint textPaint = c6rb3.A0b;
        float f2 = c6rb3.A0A / 2;
        textPaint.setShader(new LinearGradient(f2, 0.0f, f2, c6rb3.A06, new int[]{color, color2}, (float[]) null, Shader.TileMode.CLAMP));
        C6RB c6rb4 = this.A07;
        c6rb4.A0A(this.A01);
        Context context3 = this.A02;
        c6rb4.A0F(context3.getColor(AbstractC53242c7.A0H(context3, R.attr.igds_color_text_on_white)));
        c6rb4.A0K(alignment);
        c6rb4.setCallback(this);
        c6rb4.A0M(this.A05.A03);
        Context context4 = this.A02;
        int color3 = context4.getColor(R.color.audio_bar_action_color_enabled);
        C216229hf c216229hf2 = this.A04;
        c216229hf2.A09(color3);
        c216229hf2.A0A(context4.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        c216229hf2.A0B(color3);
        c216229hf2.A08();
        c216229hf2.A0C(context4.getDrawable(R.drawable.instagram_icons_exceptions_circle_heart_purple_filled_88));
        Collections.addAll(arrayList, c216229hf, c6rb, c6rb2);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0C;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A04.draw(canvas);
        this.A06.draw(canvas);
        this.A07.draw(canvas);
        this.A03.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04.A00 + this.A09 + this.A06.A06 + this.A08 + this.A07.A06 + this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i7 = i6 - intrinsicHeight;
        int i8 = i6 + intrinsicHeight;
        C216229hf c216229hf = this.A04;
        int i9 = c216229hf.A00;
        int i10 = this.A09;
        C6RB c6rb = this.A06;
        int i11 = i10 + c6rb.A06;
        C6RB c6rb2 = this.A07;
        int i12 = c6rb2.A06;
        c216229hf.setBounds(i, i7, i3, i8);
        int i13 = c6rb.A0A / 2;
        int i14 = i7 + i9;
        c6rb.setBounds(i5 - i13, i10 + i14, i13 + i5, i14 + i11);
        int i15 = c6rb2.A0A / 2;
        int i16 = i8 - this.A0A;
        c6rb2.setBounds(i5 - i15, i16 - i12, i5 + i15, i16);
    }
}
