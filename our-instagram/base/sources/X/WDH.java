package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes11.dex */
public final class WDH {
    public String A00;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final EditText A04;
    public final int[] A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final TransitionDrawable A0C;
    public final ImageView A0D;
    public final C68001V5t A0E;
    public final C216099hS A0F;
    public final String A0G;
    public final int[] A0H;
    public final int[] A0I;

    public static void A00(WDH wdh) {
        boolean z = wdh.A01;
        View view = wdh.A03;
        if (z) {
            view.setBackground(wdh.A0B);
            wdh.A0D.setBackground(wdh.A0A);
        } else {
            view.setBackground(wdh.A0C);
            wdh.A0D.setBackground(wdh.A0E);
            A01(wdh, view.isSelected());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.WDH r3, boolean r4) {
        /*
            if (r4 == 0) goto L2d
            android.view.View r0 = r3.A03
            boolean r0 = r0.isSelected()
            X.V5t r2 = r3.A0E
            if (r0 != 0) goto L58
            java.lang.Integer r1 = X.C05F.A01
        Le:
            java.lang.Integer r0 = r2.A01
            if (r0 != 0) goto L26
            r2.A01 = r1
            r2.A02 = r1
        L16:
            r2.invalidateSelf()
        L19:
            r0 = 1
            r2.A03 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
        L22:
            r2.invalidateSelf()
            return
        L26:
            if (r0 == r1) goto L19
            r2.A02 = r0
            r2.A01 = r1
            goto L16
        L2d:
            android.widget.EditText r0 = r3.A04
            java.lang.String r0 = X.AbstractC31177DnL.A0c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.9hS r2 = r3.A0F
            if (r0 == 0) goto L4f
            int[] r1 = r3.A0H
            int[] r0 = r3.A0I
            r2.A08(r1, r0)
        L42:
            android.view.View r0 = r3.A03
            boolean r0 = r0.isSelected()
            X.V5t r2 = r3.A0E
            if (r0 == 0) goto L55
            java.lang.Integer r1 = X.C05F.A00
            goto Le
        L4f:
            int[] r0 = r3.A05
            r2.A08(r0, r0)
            goto L42
        L55:
            java.lang.Integer r0 = X.C05F.A00
            goto L5a
        L58:
            java.lang.Integer r0 = X.C05F.A01
        L5a:
            r2.A01 = r0
            r2.A02 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDH.A01(X.WDH, boolean):void");
    }

    public final void A03(boolean z) {
        int i;
        int i2;
        View view = this.A03;
        if (!view.isSelected() && z) {
            this.A0C.startTransition(150);
        } else if (view.isSelected() && !z) {
            this.A0C.reverseTransition(150);
        } else if (!view.isSelected() && !z) {
            this.A0C.resetTransition();
        }
        EditText editText = this.A04;
        if (z) {
            i = this.A09;
        } else {
            i = this.A07;
        }
        editText.setTextColor(i);
        if (z) {
            i2 = this.A08;
        } else {
            i2 = this.A06;
        }
        editText.setHintTextColor(i2);
        A01(this, z);
        view.setSelected(z);
    }

    public WDH(View view, InterfaceC43540JLa interfaceC43540JLa, ViewOnFocusChangeListenerC70237WNa viewOnFocusChangeListenerC70237WNa, int i) {
        this.A05 = r2;
        Context context = view.getContext();
        this.A03 = view;
        this.A02 = i;
        this.A04 = (EditText) view.requireViewById(R.id.quiz_sticker_answer_text);
        ImageView imageView = (ImageView) view.requireViewById(R.id.quiz_sticker_answer_icon);
        this.A0D = imageView;
        this.A07 = context.getColor(R.color.countdown_sticker_title_text_color);
        int color = context.getColor(R.color.audio_bar_action_color_enabled);
        this.A09 = color;
        this.A06 = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        this.A08 = context.getColor(R.color.audio_bar_action_color_disabled);
        int color2 = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        this.A0H = new int[]{color2, color2};
        int color3 = context.getColor(R.color.direct_dark_mode_composer_hint_text_color);
        this.A0I = new int[]{color3, color3};
        int[] iArr = {-14277082, -14277082};
        C216099hS c216099hS = new C216099hS(context, context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i]);
        this.A0F = c216099hS;
        TransitionDrawable transitionDrawable = (TransitionDrawable) context.getDrawable(R.drawable.quiz_sticker_answer_row_background_refreshed);
        this.A0C = transitionDrawable;
        this.A0B = context.getDrawable(R.drawable.quiz_sticker_editor_answer_row_hint_background);
        this.A0A = context.getDrawable(R.drawable.quiz_sticker_editor_answer_icon_hint);
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        AbstractC166997dE.A1F(drawable.mutate(), color);
        C68001V5t c68001V5t = new C68001V5t(c216099hS, drawable, 150);
        this.A0E = c68001V5t;
        Integer num = C05F.A00;
        c68001V5t.A01 = num;
        c68001V5t.A02 = num;
        c68001V5t.invalidateSelf();
        imageView.setBackground(c68001V5t);
        this.A0G = context.getString(2131971433);
        transitionDrawable.resetTransition();
        this.A03.setOnTouchListener(new ViewOnTouchListenerC70251WNw(11, this, viewOnFocusChangeListenerC70237WNa));
        EditText editText = this.A04;
        editText.setOnFocusChangeListener(viewOnFocusChangeListenerC70237WNa);
        editText.setOnEditorActionListener(viewOnFocusChangeListenerC70237WNa);
        VBA vba = new VBA();
        C221549qJ c221549qJ = new C221549qJ(editText, 2);
        List list = vba.A00;
        list.add(c221549qJ);
        list.add(new VBB(2, this, viewOnFocusChangeListenerC70237WNa));
        editText.addTextChangedListener(vba);
        A02(interfaceC43540JLa);
        A03(false);
    }

    public final void A02(InterfaceC43540JLa interfaceC43540JLa) {
        boolean z;
        String str;
        if (interfaceC43540JLa.CVt() != null) {
            z = interfaceC43540JLa.CVt().booleanValue();
        } else {
            z = false;
        }
        this.A01 = z;
        EditText editText = this.A04;
        editText.setText(interfaceC43540JLa.getText());
        if (interfaceC43540JLa.BEE() != null) {
            str = interfaceC43540JLa.BEE();
        } else {
            str = "";
        }
        this.A00 = str;
        if (this.A01) {
            str = this.A0G;
        }
        editText.setHint(str);
        this.A03.setSelected(false);
        A03(false);
        A00(this);
    }
}
