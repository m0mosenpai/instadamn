package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.9V2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V2 extends C3OO implements InterfaceC55932he {
    public int A00;
    public ObjectAnimator A01;
    public C8C3 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final View A08;
    public final IgTextView A09;
    public final IgImageView A0A;
    public final C57012jc A0B;
    public final BubbleSpinner A0C;

    public final void A02(boolean z) {
        A00(this, z, false);
        this.A07.setSelected(false);
        this.A08.setVisibility(8);
        this.A0A.setColorFilter((ColorFilter) null);
        C57012jc c57012jc = this.A0B;
        if (c57012jc.A00() != 8) {
            ((TextView) c57012jc.A01()).setTextColor(-1);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public static void A00(C9V2 c9v2, boolean z, boolean z2) {
        if (!c9v2.A05) {
            c9v2.A0A.setBackgroundResource(0);
            return;
        }
        IgImageView igImageView = c9v2.A0A;
        if (igImageView.getBackground() == null) {
            boolean z3 = c9v2.A04;
            int i = R.drawable.generic_effect_picker_background_color_state_list;
            if (z3) {
                i = R.drawable.square_text_format_picker_background_list;
            }
            igImageView.setBackgroundResource(i);
        }
        ObjectAnimator objectAnimator = c9v2.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        Drawable background = igImageView.getBackground();
        background.getClass();
        if (z2) {
            c9v2.A01 = AbstractC13160m2.A00(background, background.getAlpha(), (int) (f * 255.0f), 250L);
        } else {
            background.setAlpha((int) (f * 255.0f));
        }
    }

    public final void A01(float f) {
        this.A0A.setRotation(f);
        C57012jc c57012jc = this.A0B;
        if (c57012jc.A00() != 8) {
            c57012jc.A01().setRotation(f);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C8C3 c8c3 = this.A02;
        if (c8c3 != null) {
            c8c3.Cwb((float) c55982hj.A01);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f = (float) c55982hj.A09.A00;
        View view = this.A07;
        if (f < 0.5f) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        } else {
            view.setVisibility(0);
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public C9V2(View view, boolean z, boolean z2, boolean z3) {
        super(view);
        Context context = view.getContext();
        this.A06 = context;
        this.A07 = view;
        this.A0A = (IgImageView) this.itemView.requireViewById(z3 ? R.id.new_fonts_text_format_picker_icon : R.id.generic_effect_picker_icon);
        this.A09 = (IgTextView) this.itemView.requireViewById(R.id.new_fonts_text_format_picker_icon_new_badge);
        BubbleSpinner bubbleSpinner = (BubbleSpinner) this.itemView.requireViewById(R.id.effect_loading_spinner);
        this.A0C = bubbleSpinner;
        this.A08 = this.itemView.requireViewById(R.id.selected_ring);
        this.A0B = new C57012jc((ViewStub) this.itemView.findViewById(R.id.generic_effect_picker_text_label_stub));
        this.A03 = z;
        this.A05 = z2;
        this.A04 = z3;
        bubbleSpinner.setBubbleRadius(AbstractC13880nE.A00(context, 1.2f));
        this.A00 = context.getColor(R.color.snap_picker_effect_icon_tint_color);
    }
}
