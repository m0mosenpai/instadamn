package com.instagram.igds.components.dialog.promo;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31177DnL;
import X.AbstractC54027Nud;
import X.C05F;
import X.C14360o3;
import X.C56302iJ;
import X.InterfaceC58118Pph;
import X.OkD;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* loaded from: classes9.dex */
public final class IgdsPrismPromoDialog {
    public final Dialog A00;
    public final DialogInterface.OnClickListener A01;
    public final DialogInterface.OnClickListener A02;
    public final InterfaceC58118Pph A03;
    public final IgdsHeadline A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final Context A0D;
    public final DialogInterface.OnDismissListener A0E;

    public IgdsPrismPromoDialog(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener, InterfaceC58118Pph interfaceC58118Pph, CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        this.A0D = context;
        this.A08 = str;
        this.A0C = z;
        this.A06 = charSequence;
        this.A0B = list;
        this.A05 = charSequence2;
        this.A09 = str2;
        this.A01 = onClickListener;
        this.A0A = str3;
        this.A02 = onClickListener2;
        this.A03 = interfaceC58118Pph;
        this.A07 = num;
        this.A0E = onDismissListener;
        Resources resources = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.igds_promo_dialog_layout, (ViewGroup) null, false);
        Dialog dialog = new Dialog(context, R.style.IgdsPrismPromoDialog);
        this.A00 = dialog;
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(z2);
        dialog.setCancelable(z3);
        dialog.setOnDismissListener(onDismissListener);
        int min = Math.min(resources.getDimensionPixelSize(R.dimen.emoji_reaction_creation_tray_max_width), resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2));
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.igds_prism_dialog_bg);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(min, -2);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            WindowManager.LayoutParams attributes = window3.getAttributes();
            if (attributes != null) {
                attributes.gravity = 80;
            }
            WindowManager.LayoutParams attributes2 = window3.getAttributes();
            if (attributes2 != null) {
                attributes2.y = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            }
        }
        C14360o3.A0A(inflate);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.igds_promo_dialog_headline);
        igdsHeadline.setHeadline(this.A08);
        igdsHeadline.setBody(this.A06);
        igdsHeadline.setBulletList(this.A0B);
        igdsHeadline.setDetailText(this.A05);
        Integer num2 = this.A07;
        TextView A0e = AbstractC166987dD.A0e(igdsHeadline, R.id.igds_headline_headline);
        String A00 = AbstractC111324zv.A00(0);
        if (A0e != null) {
            A0e.setTextAppearance(R.style.igds_headline_1_bold);
            ViewGroup.LayoutParams layoutParams = A0e.getLayoutParams();
            C14360o3.A0C(layoutParams, A00);
            ((C56302iJ) layoutParams).A03 = 0.0f;
            A0e.setGravity(8388611);
            if (this.A0C) {
                A0e.setGravity(1);
            }
        }
        TextView A0e2 = AbstractC166987dD.A0e(igdsHeadline, R.id.igds_headline_body);
        if (A0e2 != null) {
            A0e2.setTextAppearance(R.style.igds_body_1);
            AbstractC54027Nud.A00(A0e2);
            ViewGroup.LayoutParams layoutParams2 = A0e2.getLayoutParams();
            C14360o3.A0C(layoutParams2, A00);
            ((C56302iJ) layoutParams2).A03 = 0.0f;
            A0e2.setGravity(8388611);
        }
        TextView A0e3 = AbstractC166987dD.A0e(igdsHeadline, R.id.igds_headline_detail_text);
        C14360o3.A0A(A0e3);
        C14360o3.A0B(A0e3, 0);
        A0e3.setTextAppearance(R.style.PrivacyTextStyle);
        AbstractC31177DnL.A0q(A0e3.getContext(), A0e3, R.attr.igdsSecondaryText);
        ViewGroup.LayoutParams layoutParams3 = A0e3.getLayoutParams();
        C14360o3.A0C(layoutParams3, A00);
        ((C56302iJ) layoutParams3).A03 = 0.0f;
        A0e3.setGravity(8388611);
        Context context2 = igdsHeadline.getContext();
        int A09 = AbstractC167017dG.A09(context2);
        int A08 = AbstractC167017dG.A08(context2);
        if (num2 == C05F.A00) {
            igdsHeadline.setPadding(0, 0, 0, A09);
            A00(igdsHeadline, R.id.igds_headline_body, A09);
            A00(igdsHeadline, igdsHeadline.getHeadlineId(), A09);
            A00(igdsHeadline, R.id.igds_headline_bullet_list_container, A09);
            A00(igdsHeadline, R.id.igds_headline_detail_text, A09);
        } else {
            igdsHeadline.setPadding(igdsHeadline.getPaddingLeft(), A08, igdsHeadline.getPaddingRight(), A08);
        }
        igdsHeadline.A0E(0, 0, 0, A09);
        this.A04 = igdsHeadline;
        int intValue = this.A07.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                InterfaceC58118Pph interfaceC58118Pph2 = this.A03;
                if (interfaceC58118Pph2 != null) {
                    interfaceC58118Pph2.E5c(igdsHeadline);
                }
            } else {
                InterfaceC58118Pph interfaceC58118Pph3 = this.A03;
                if (interfaceC58118Pph3 != null) {
                    interfaceC58118Pph3.E5d(igdsHeadline);
                }
            }
        } else {
            InterfaceC58118Pph interfaceC58118Pph4 = this.A03;
            if (interfaceC58118Pph4 != null) {
                interfaceC58118Pph4.E5k(igdsHeadline, min);
            }
        }
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(inflate, R.id.igds_promo_dialog_action_button);
        igdsButton.setVisibility(0);
        igdsButton.setText(this.A09);
        OkD.A00(igdsButton, this.A01, this, -1, 6);
        if (str3 != null) {
            TextView A0N = AbstractC167007dF.A0N(inflate, R.id.igds_promo_dialog_secondary_button);
            A0N.setVisibility(0);
            A0N.setText(this.A0A);
            A0N.setTextAppearance(R.style.igds_emphasized_body_1);
            AbstractC54027Nud.A00(A0N);
            OkD.A00(A0N, this.A02, this, -3, 6);
        }
    }

    public static void A00(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setPadding(i2, findViewById.getPaddingTop(), i2, findViewById.getPaddingBottom());
        }
    }
}
