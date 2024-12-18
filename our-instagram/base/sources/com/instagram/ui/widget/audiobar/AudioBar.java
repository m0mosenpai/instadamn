package com.instagram.ui.widget.audiobar;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31173DnH;
import X.AbstractC58317Pt9;
import X.BOM;
import X.C14360o3;
import X.InterfaceC57882Plm;
import X.JFY;
import X.JQ0;
import X.Ok4;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class AudioBar extends ConstraintLayout implements JFY {
    public ImageUrl A00;
    public InterfaceC57882Plm A01;
    public boolean A02;
    public final ColorStateList A03;
    public final PorterDuffColorFilter A04;
    public final PorterDuffColorFilter A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;
    public final TextView A0A;
    public final View A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Object systemService = context.getSystemService(AbstractC58317Pt9.A00(44));
        C14360o3.A0C(systemService, AbstractC111324zv.A00(479));
        ((LayoutInflater) systemService).inflate(R.layout.audio_bar, (ViewGroup) this, true);
        setVisibility(8);
        View requireViewById = requireViewById(R.id.album_color_layer);
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) requireViewById;
        this.A07 = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        imageView.setImageTintMode(mode);
        this.A03 = ColorStateList.valueOf(context.getColor(R.color.audio_bar_default_background_color));
        View requireViewById2 = requireViewById(R.id.title);
        C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.A0A = (TextView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.subtitle);
        C14360o3.A0C(requireViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.A09 = (TextView) requireViewById3;
        ImageView A0I = AbstractC31173DnH.A0I(this, R.id.album_art);
        this.A06 = A0I;
        A0I.setImageDrawable(new BOM(context, null, AbstractC167017dG.A09(context), AbstractC167017dG.A06(context), context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top), context.getColor(R.color.igds_prism_black_alpha_40), 0, -1, false));
        this.A08 = AbstractC31173DnH.A0I(this, R.id.play_pause_button);
        this.A05 = new PorterDuffColorFilter(AbstractC166997dE.A01(context), mode);
        this.A04 = new PorterDuffColorFilter(context.getColor(R.color.audio_bar_action_color_disabled), mode);
        View requireViewById4 = requireViewById(R.id.select_button_tap_target);
        this.A0B = requireViewById4;
        setOnClickListener(new Ok4(this, 3));
        requireViewById4.setOnClickListener(new Ok4(this, 4));
    }

    public final void setListener(InterfaceC57882Plm interfaceC57882Plm) {
        C14360o3.A0B(interfaceC57882Plm, 0);
        this.A01 = interfaceC57882Plm;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ AudioBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
