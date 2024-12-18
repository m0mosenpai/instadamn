package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.8xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202818xz {
    public static final TextPaint A00 = new TextPaint();
    public static final int[] A02 = {-759742, -726206};
    public static final Pattern A01 = Pattern.compile("@(\\w|\\.){1,30}");

    public static final SpannedString A02(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        Resources resources = context.getResources();
        String string = resources.getString(2131966302);
        C14360o3.A07(string);
        if (AbstractC172687md.A01(userSession)) {
            String lowerCase = string.toLowerCase(C1Q2.A02());
            C14360o3.A07(lowerCase);
            return AMr.A01(resources, lowerCase, new int[]{context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange))}, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        }
        if (AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36322963624045330L).booleanValue()) {
            return AMr.A02(resources, string, new int[]{context.getColor(R.color.pink_6), context.getColor(R.color.pink_6)}, context.getColor(R.color.pink_0), resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        }
        return AMr.A02(resources, string, new int[]{context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange))}, -1, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
    }

    public static final C194808jg A04(Context context, UserSession userSession, C217889kL c217889kL) {
        String lowerCase;
        String str = c217889kL.A04;
        User user = c217889kL.A03;
        int i = c217889kL.A01;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C6RQ, String> entry : new C25022B4z(userSession).entrySet()) {
            C6RQ key = entry.getKey();
            C202328xC c202328xC = new C202328xC(context, user, entry.getValue(), i);
            C14360o3.A0B(key, 4);
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            boolean A0O = AbstractC009903n.A0O(key, new C6RQ[]{C6RQ.A06, C6RQ.A0B, C6RQ.A0A});
            int i2 = R.dimen.clips_template_landing_page_template_preview_clip_index_text_size;
            if (A0O) {
                i2 = R.dimen.avatar_search_sticker_tray_text_size;
            }
            AbstractC226249yh abstractC226249yh = AbstractC226249yh.$redex_init_class;
            int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange));
            boolean z = key.A02;
            int i3 = R.dimen.abc_edit_text_inset_bottom_material;
            if (z) {
                i3 = R.dimen.abc_edit_text_inset_top_material;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i3);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            C14360o3.A0B(str, 0);
            Locale A022 = C1Q2.A02();
            if (z) {
                lowerCase = str.toUpperCase(A022);
            } else {
                lowerCase = str.toLowerCase(A022);
            }
            C14360o3.A07(lowerCase);
            c202328xC.A0L(new SpannableStringBuilder(lowerCase));
            int dimensionPixelSize3 = resources.getDimensionPixelSize(i2);
            c202328xC.A0I(AbstractC15960qq.A00(context).A02(key.A01));
            c202328xC.A09();
            c202328xC.A0A(dimensionPixelSize3);
            c202328xC.A0C(dimensionPixelSize2, dimensionPixelSize);
            Spannable spannable = c202328xC.A0F;
            C14360o3.A07(spannable);
            AbstractC226259yi.A00(context, resources, spannable, key, color, dimensionPixelSize2, dimensionPixelSize);
            arrayList.add(c202328xC);
        }
        C194808jg c194808jg = new C194808jg(context, userSession, arrayList);
        c194808jg.A03 = c217889kL;
        return c194808jg;
    }

    public static final CharSequence A05(int i, CharSequence charSequence) {
        for (int i2 = i; -1 < i2 && charSequence.charAt(i2) != ' ' && charSequence.charAt(i2) != '\n'; i2--) {
            if (charSequence.charAt(i2) == '@') {
                return charSequence.subSequence(i2 + 1, i + 1);
            }
        }
        return null;
    }

    public static final void A06(EditText editText, int i, int i2) {
        float f;
        C14360o3.A0B(editText, 0);
        Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            TextPaint textPaint = A00;
            textPaint.set(editText.getPaint());
            int i3 = 2;
            int i4 = (int) (i * 2.0f);
            int floor = ((int) Math.floor((i4 - 2) / 2.0f)) + 2;
            while (true) {
                f = floor / 2.0f;
                if (i3 >= floor) {
                    break;
                }
                String obj = editText.getText().toString();
                textPaint.setTextSize(f);
                if (i2 > textPaint.measureText(obj) && new StaticLayout(obj, textPaint, i2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true).getLineCount() == 1) {
                    i3 = floor;
                } else {
                    i4 = floor;
                }
                floor = ((int) Math.floor((i4 - i3) / 2.0f)) + i3;
            }
        } else {
            f = i;
        }
        editText.setTextSize(0, f);
    }

    public static final C194808jg A03(final Context context, UserSession userSession, C217889kL c217889kL) {
        String str = c217889kL.A04;
        float f = c217889kL.A00;
        final User user = c217889kL.A03;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        final int i = c217889kL.A01;
        ArrayList arrayList = new ArrayList();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (AbstractC166997dE.A0c(c06090Tz, userSession, 36322963624045330L).booleanValue()) {
            final String str2 = "mention_sticker_valentines";
            final Integer num = C05F.A00;
            C202328xC c202328xC = new C202328xC(context, user, num, str2, i) { // from class: X.9jx
                public int A00;
                public int A01;
                public final int A02;
                public final int A03;
                public final Drawable A04;
                public final Drawable A05;

                {
                    super(context, user, str2, i);
                    this.A03 = AbstractC167017dG.A0F(context);
                    this.A02 = AbstractC167017dG.A0C(context);
                    Resources resources = context.getResources();
                    int intValue = num.intValue();
                    Drawable A002 = AbstractC56412ia.A00(resources, intValue != 0 ? R.drawable.anti_valentines_heart_left : R.drawable.valentines_heart_left);
                    this.A04 = A002;
                    Drawable A003 = AbstractC56412ia.A00(context.getResources(), intValue != 0 ? R.drawable.anti_valentines_heart_right : R.drawable.valentines_heart_right);
                    this.A05 = A003;
                    if (A002 instanceof C3PR) {
                        ((C3PR) A002).A01(new C23697AeW(this, 0));
                    }
                    if (A003 instanceof C3PR) {
                        ((C3PR) A003).A01(new C23697AeW(this, 1));
                    }
                }

                @Override // X.C6RB, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    C14360o3.A0B(canvas, 0);
                    super.draw(canvas);
                    canvas.save();
                    int i2 = this.A02;
                    float f2 = i2;
                    float f3 = f2 * 0.55f;
                    canvas.translate((this.A00 + this.A0A) - f3, this.A01 - (0.2f * f2));
                    Drawable drawable = this.A05;
                    drawable.setBounds(0, 0, i2, i2);
                    AbstractC167007dF.A0t(canvas, drawable);
                    canvas.translate(this.A00 - (f2 * 0.45f), ((this.A01 + this.A06) - this.A03) - f3);
                    Drawable drawable2 = this.A04;
                    drawable2.setBounds(0, 0, i2, i2);
                    drawable2.draw(canvas);
                    canvas.restore();
                }

                @Override // X.C6RB, android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
                    C14360o3.A0B(rect, 0);
                    super.onBoundsChange(rect);
                    this.A00 = rect.left;
                    this.A01 = rect.top;
                }
            };
            float f2 = dimensionPixelSize;
            AbstractC167017dG.A1N(userSession, context);
            AbstractC167017dG.A0z(context, c202328xC);
            AbstractC167007dF.A1A(c202328xC, f, f2, f2);
            c202328xC.A0L(A00(context, str));
            arrayList.add(c202328xC);
        }
        C202328xC c202328xC2 = new C202328xC(context, user, "mention_sticker_gradient", i);
        float f3 = dimensionPixelSize;
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c202328xC2);
        AbstractC167007dF.A1A(c202328xC2, f, f3, f3);
        c202328xC2.A0L(A01(context, str));
        arrayList.add(c202328xC2);
        C202328xC c202328xC3 = new C202328xC(context, user, "mention_sticker_subtle", i);
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c202328xC3);
        AbstractC167007dF.A1A(c202328xC3, f, f3, f3);
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        AMr.A04(context, spannableStringBuilder, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        c202328xC3.A0L(spannableStringBuilder);
        arrayList.add(c202328xC3);
        C202328xC c202328xC4 = new C202328xC(context, user, "mention_sticker_rainbow", i);
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c202328xC4);
        AbstractC167007dF.A1A(c202328xC4, f, f3, f3);
        Resources resources2 = context.getResources();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        C14360o3.A0A(resources2);
        AMr.A0A(resources2, spannableStringBuilder2, C50R.A01, resources2.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        c202328xC4.A0L(spannableStringBuilder2);
        arrayList.add(c202328xC4);
        C202328xC c202328xC5 = new C202328xC(context, user, "mention_sticker_hero", i);
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c202328xC5);
        AbstractC167007dF.A1A(c202328xC5, f, f3, f3);
        Resources resources3 = context.getResources();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
        C14360o3.A0A(resources3);
        AMr.A03(context, resources3, spannableStringBuilder3, resources3.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        c202328xC5.A0L(spannableStringBuilder3);
        arrayList.add(c202328xC5);
        if (AbstractC166997dE.A0c(c06090Tz, userSession, 36322963624045330L).booleanValue()) {
            final Integer num2 = C05F.A01;
            final String str3 = "mention_sticker_anti_valentines";
            C202328xC c202328xC6 = new C202328xC(context, user, num2, str3, i) { // from class: X.9jx
                public int A00;
                public int A01;
                public final int A02;
                public final int A03;
                public final Drawable A04;
                public final Drawable A05;

                {
                    super(context, user, str3, i);
                    this.A03 = AbstractC167017dG.A0F(context);
                    this.A02 = AbstractC167017dG.A0C(context);
                    Resources resources4 = context.getResources();
                    int intValue = num2.intValue();
                    Drawable A002 = AbstractC56412ia.A00(resources4, intValue != 0 ? R.drawable.anti_valentines_heart_left : R.drawable.valentines_heart_left);
                    this.A04 = A002;
                    Drawable A003 = AbstractC56412ia.A00(context.getResources(), intValue != 0 ? R.drawable.anti_valentines_heart_right : R.drawable.valentines_heart_right);
                    this.A05 = A003;
                    if (A002 instanceof C3PR) {
                        ((C3PR) A002).A01(new C23697AeW(this, 0));
                    }
                    if (A003 instanceof C3PR) {
                        ((C3PR) A003).A01(new C23697AeW(this, 1));
                    }
                }

                @Override // X.C6RB, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    C14360o3.A0B(canvas, 0);
                    super.draw(canvas);
                    canvas.save();
                    int i2 = this.A02;
                    float f22 = i2;
                    float f32 = f22 * 0.55f;
                    canvas.translate((this.A00 + this.A0A) - f32, this.A01 - (0.2f * f22));
                    Drawable drawable = this.A05;
                    drawable.setBounds(0, 0, i2, i2);
                    AbstractC167007dF.A0t(canvas, drawable);
                    canvas.translate(this.A00 - (f22 * 0.45f), ((this.A01 + this.A06) - this.A03) - f32);
                    Drawable drawable2 = this.A04;
                    drawable2.setBounds(0, 0, i2, i2);
                    drawable2.draw(canvas);
                    canvas.restore();
                }

                @Override // X.C6RB, android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
                    C14360o3.A0B(rect, 0);
                    super.onBoundsChange(rect);
                    this.A00 = rect.left;
                    this.A01 = rect.top;
                }
            };
            AbstractC167017dG.A1N(userSession, context);
            AbstractC167017dG.A0z(context, c202328xC6);
            AbstractC167007dF.A1A(c202328xC6, f, f3, f3);
            Resources resources4 = context.getResources();
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(str);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            C14360o3.A0A(resources4);
            AMr.A09(resources4, spannableStringBuilder4, dimensionPixelSize2, context.getColor(R.color.igds_prism_black), context.getColor(R.color.design_dark_default_color_on_background));
            c202328xC6.A0L(spannableStringBuilder4);
            arrayList.add(c202328xC6);
        }
        C194808jg c194808jg = new C194808jg(context, userSession, arrayList);
        c194808jg.A03 = c217889kL;
        return c194808jg;
    }

    public static final SpannableStringBuilder A00(Context context, String str) {
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        C14360o3.A0A(resources);
        AMr.A09(resources, spannableStringBuilder, dimensionPixelSize, context.getColor(R.color.pink_0), context.getColor(R.color.pink_6));
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder A01(Context context, String str) {
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        C14360o3.A0A(resources);
        AMr.A09(resources, spannableStringBuilder, dimensionPixelSize, -1, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange)));
        return spannableStringBuilder;
    }
}
