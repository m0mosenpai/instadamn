package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.IbE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41624IbE {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final TransitionDrawable A04;
    public final View A05;
    public final ImageView A06;
    public final TextView A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final Drawable A0F;

    public final void A01(boolean z, boolean z2) {
        Drawable drawable;
        int i;
        if (z) {
            if (z2) {
                drawable = this.A0D;
            } else {
                drawable = this.A0E;
            }
            this.A05.setBackground(this.A0B);
            this.A07.setTextColor(this.A02);
        } else {
            if (z2) {
                drawable = this.A03;
            } else {
                drawable = this.A0F;
            }
            View view = this.A05;
            view.setBackground(this.A0C);
            this.A07.setTextColor(this.A09);
            view.setAlpha(0.5f);
        }
        Drawable drawable2 = this.A0B;
        if (z2) {
            i = this.A08;
        } else {
            i = this.A0A;
        }
        A00(drawable2, i);
        this.A06.setBackground(drawable);
        this.A00 = false;
    }

    public C41624IbE(View view, InterfaceC43540JLa interfaceC43540JLa, C97634Zy c97634Zy, int[] iArr, int i) {
        Context context = view.getContext();
        this.A05 = view;
        this.A01 = i;
        TextView A0T = AbstractC166997dE.A0T(view, R.id.quiz_sticker_answer_text);
        this.A07 = A0T;
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.quiz_sticker_answer_icon);
        this.A06 = A0I;
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        this.A0D = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_circle_x_pano_filled_24);
        this.A0E = drawable2;
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
        this.A03 = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
        this.A0F = drawable4;
        this.A04 = (TransitionDrawable) context.getDrawable(R.drawable.quiz_sticker_answer_row_background_refreshed);
        Drawable drawable5 = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_unselected);
        this.A0C = drawable5;
        this.A0B = context.getDrawable(R.drawable.quiz_sticker_answer_row_background_selected_refreshed).mutate();
        int color = context.getColor(R.color.countdown_sticker_title_text_color);
        this.A09 = color;
        int color2 = context.getColor(R.color.audio_bar_action_color_enabled);
        this.A02 = color2;
        A00(drawable, color2);
        A00(drawable2, color2);
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_green);
        this.A08 = A09;
        int A092 = AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_scarlet);
        this.A0A = A092;
        A00(drawable3, A09);
        A00(drawable4, A092);
        ViewOnClickListenerC42034Ik3.A00(this.A05, 38, this, c97634Zy);
        A0T.setText(interfaceC43540JLa.getText());
        A0T.setTextColor(color);
        view.setBackground(drawable5);
        this.A00 = true;
        view.setAlpha(1.0f);
        C216099hS c216099hS = new C216099hS(context, context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i]);
        c216099hS.A08(iArr, iArr);
        A0I.setBackground(c216099hS);
    }

    public static void A00(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(C3DY.A00(i));
    }
}
