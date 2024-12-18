package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public abstract class W6o {
    public static View A00(Context context, C5GM c5gm) {
        int i;
        Integer num = c5gm.A06;
        int intValue = num.intValue();
        if (intValue != 1 && intValue != 2 && intValue != 3) {
            if (intValue == 5) {
                String str = ((V80) c5gm.A00).A0A;
                if ("v3".equalsIgnoreCase(str)) {
                    i = R.layout.generic_v3_megaphone;
                } else {
                    boolean equalsIgnoreCase = "v2".equalsIgnoreCase(str);
                    i = R.layout.mainfeed_generic_megaphone;
                    if (equalsIgnoreCase) {
                        i = R.layout.profile_generic_megaphone;
                    }
                }
                View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
                C69468Vnr c69468Vnr = new C69468Vnr();
                c69468Vnr.A04 = (LinearLayout) inflate.findViewById(R.id.megaphone_content);
                c69468Vnr.A0C = (IgImageView) inflate.findViewById(R.id.megaphone_icon);
                c69468Vnr.A09 = (TextView) inflate.findViewById(R.id.title);
                c69468Vnr.A08 = (TextView) inflate.findViewById(R.id.message);
                c69468Vnr.A0A = (ColorFilterAlphaImageView) inflate.findViewById(R.id.dismiss_button);
                c69468Vnr.A01 = (ViewGroup) inflate.findViewById(R.id.button_group);
                c69468Vnr.A06 = (TextView) inflate.findViewById(R.id.button1);
                c69468Vnr.A07 = (TextView) inflate.findViewById(R.id.button2);
                c69468Vnr.A03 = (ViewGroup) inflate.findViewById(R.id.button_placeholder);
                c69468Vnr.A00 = (ViewGroup) inflate.findViewById(R.id.bottom_context);
                c69468Vnr.A0B = (IgImageView) inflate.findViewById(R.id.bottom_icon);
                c69468Vnr.A05 = (TextView) inflate.findViewById(R.id.bottom_message);
                inflate.setTag(c69468Vnr);
                return inflate;
            }
            throw new UnsupportedOperationException(AnonymousClass001.A0R("no such megaphone type:", AbstractC34246F8s.A00(num)));
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.connect_megaphone, (ViewGroup) null);
        inflate2.setTag(new C69360Vm6(inflate2));
        return inflate2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [X.VJ1, java.lang.Object] */
    public static void A02(Context context, View view, InterfaceC11380iw interfaceC11380iw, InterfaceC64632wM interfaceC64632wM, C5GM c5gm) {
        View childAt;
        ImageView imageView;
        int i;
        int dimensionPixelSize;
        Resources resources;
        int i2;
        Integer num = c5gm.A06;
        LinearLayout linearLayout = (LinearLayout) view;
        VJ1 vj1 = (VJ1) linearLayout.getTag();
        if (vj1 != null && vj1.A00 != c5gm.A06) {
            childAt = A00(context, c5gm);
            Integer num2 = c5gm.A06;
            linearLayout.removeAllViews();
            linearLayout.setOrientation(1);
            ?? obj = new Object();
            obj.A00 = num2;
            linearLayout.setTag(obj);
            linearLayout.addView(childAt);
        } else {
            childAt = linearLayout.getChildAt(0);
        }
        int intValue = num.intValue();
        if (intValue != 1 && intValue != 2 && intValue != 3) {
            if (intValue == 5) {
                String str = ((V80) c5gm.A00).A0A;
                if (!"v3".equalsIgnoreCase(str) && !"v2".equalsIgnoreCase(str)) {
                    AbstractC69965Vyg.A00(context, childAt, interfaceC11380iw, interfaceC64632wM, c5gm);
                    V80 v80 = (V80) c5gm.A00;
                    C69468Vnr c69468Vnr = (C69468Vnr) AbstractC31172DnG.A0x(childAt);
                    String str2 = v80.A08;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "bottom";
                    }
                    if (!str2.equals("bottom")) {
                        if (str2.equals("right")) {
                            c69468Vnr.A04.setGravity(16);
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c69468Vnr.A09.getLayoutParams();
                            layoutParams.addRule(0, R.id.button_group);
                            c69468Vnr.A09.setLayoutParams(layoutParams);
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) c69468Vnr.A08.getLayoutParams();
                            layoutParams2.addRule(0, R.id.button_group);
                            c69468Vnr.A08.setLayoutParams(layoutParams2);
                            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) c69468Vnr.A01.getLayoutParams();
                            layoutParams3.addRule(3, 0);
                            layoutParams3.addRule(11);
                            layoutParams3.addRule(15);
                            ((ViewGroup.LayoutParams) layoutParams3).width = -2;
                            c69468Vnr.A01.setLayoutParams(layoutParams3);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c69468Vnr.A0C.getLayoutParams();
                            marginLayoutParams.topMargin = 0;
                            c69468Vnr.A0C.setLayoutParams(marginLayoutParams);
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c69468Vnr.A0A.getLayoutParams();
                            marginLayoutParams2.topMargin = 0;
                            c69468Vnr.A0A.setLayoutParams(marginLayoutParams2);
                            AbstractC13880nE.A0d(c69468Vnr.A01, 0);
                            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
                            resources = context.getResources();
                            i2 = R.dimen.abc_button_padding_horizontal_material;
                        } else {
                            return;
                        }
                    } else {
                        c69468Vnr.A04.setGravity(0);
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) c69468Vnr.A09.getLayoutParams();
                        layoutParams4.addRule(0, 0);
                        c69468Vnr.A09.setLayoutParams(layoutParams4);
                        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) c69468Vnr.A08.getLayoutParams();
                        layoutParams5.addRule(0, 0);
                        c69468Vnr.A08.setLayoutParams(layoutParams5);
                        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) c69468Vnr.A01.getLayoutParams();
                        layoutParams6.addRule(3, R.id.message);
                        layoutParams6.addRule(11, 0);
                        layoutParams6.addRule(15, 0);
                        ((ViewGroup.LayoutParams) layoutParams6).width = -1;
                        c69468Vnr.A01.setLayoutParams(layoutParams6);
                        int A0D = AbstractC167017dG.A0D(context);
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c69468Vnr.A0C.getLayoutParams();
                        marginLayoutParams3.topMargin = A0D;
                        c69468Vnr.A0C.setLayoutParams(marginLayoutParams3);
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) c69468Vnr.A0A.getLayoutParams();
                        marginLayoutParams4.topMargin = A0D;
                        c69468Vnr.A0A.setLayoutParams(marginLayoutParams4);
                        AbstractC13880nE.A0d(c69468Vnr.A01, AbstractC167017dG.A0E(context));
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
                        resources = context.getResources();
                        i2 = R.dimen.abc_button_inset_vertical_material;
                    }
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
                    if (dimensionPixelSize != -1) {
                        float f = dimensionPixelSize;
                        c69468Vnr.A06.setTextSize(0, f);
                        c69468Vnr.A07.setTextSize(0, f);
                    }
                    if (dimensionPixelSize2 != -1) {
                        c69468Vnr.A06.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                        c69468Vnr.A07.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                        return;
                    }
                    return;
                }
                AbstractC69965Vyg.A00(context, childAt, interfaceC11380iw, interfaceC64632wM, c5gm);
                return;
            }
            throw new UnsupportedOperationException(AnonymousClass001.A0R("no such megaphone type:", AbstractC34246F8s.A00(num)));
        }
        C32957Eeo c32957Eeo = (C32957Eeo) c5gm.A00;
        Integer num3 = c5gm.A06;
        C69360Vm6 c69360Vm6 = (C69360Vm6) AbstractC31172DnG.A0x(childAt);
        int intValue2 = num3.intValue();
        if (intValue2 != 1) {
            if (intValue2 == 3) {
                imageView = c69360Vm6.A02;
                i = R.drawable.people_contacts;
            }
            int color = context.getColor(R.color.blue_7);
            int color2 = context.getColor(R.color.badge_color);
            Drawable drawable = c69360Vm6.A02.getDrawable();
            drawable.getClass();
            AbstractC166997dE.A1F(drawable.mutate(), color);
            c69360Vm6.A05.setText(c32957Eeo.A02);
            c69360Vm6.A04.setText(c32957Eeo.A01);
            TextView textView = c69360Vm6.A03;
            Drawable background = textView.getBackground();
            background.getClass();
            AbstractC166997dE.A1F(background.mutate(), color2);
            textView.setTextColor(color2);
            textView.setText(c32957Eeo.A00.toUpperCase(C1Q2.A02()));
            WNP.A00(c69360Vm6.A01, 53, interfaceC64632wM, c5gm);
            WNP.A00(c69360Vm6.A00, 54, interfaceC64632wM, c5gm);
        }
        imageView = c69360Vm6.A02;
        i = R.drawable.instagram_facebook_circle_pano_filled_24;
        imageView.setImageResource(i);
        int color3 = context.getColor(R.color.blue_7);
        int color22 = context.getColor(R.color.badge_color);
        Drawable drawable2 = c69360Vm6.A02.getDrawable();
        drawable2.getClass();
        AbstractC166997dE.A1F(drawable2.mutate(), color3);
        c69360Vm6.A05.setText(c32957Eeo.A02);
        c69360Vm6.A04.setText(c32957Eeo.A01);
        TextView textView2 = c69360Vm6.A03;
        Drawable background2 = textView2.getBackground();
        background2.getClass();
        AbstractC166997dE.A1F(background2.mutate(), color22);
        textView2.setTextColor(color22);
        textView2.setText(c32957Eeo.A00.toUpperCase(C1Q2.A02()));
        WNP.A00(c69360Vm6.A01, 53, interfaceC64632wM, c5gm);
        WNP.A00(c69360Vm6.A00, 54, interfaceC64632wM, c5gm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.VJ1, java.lang.Object] */
    public static LinearLayout A01(Context context, C5GM c5gm) {
        View A00 = A00(context, c5gm);
        LinearLayout linearLayout = new LinearLayout(context);
        Integer num = c5gm.A06;
        linearLayout.removeAllViews();
        linearLayout.setOrientation(1);
        ?? obj = new Object();
        obj.A00 = num;
        linearLayout.setTag(obj);
        linearLayout.addView(A00);
        return linearLayout;
    }
}
