package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class PCI implements InterfaceC57985PnV {
    public C5SW A00;
    public OHM A01;
    public final Drawable A02;
    public final Drawable A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final ConstraintLayout A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final CircularImageView A0C;
    public final IgImageView A0D;
    public final C105154oV A0E;
    public final O50 A0F;
    public final String A0G;
    public final String A0H;
    public final InterfaceC09390do A0I;

    @Override // X.InterfaceC57985PnV
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADV(C51906Mwo c51906Mwo) {
        String str;
        int i;
        int i2;
        String str2;
        C14360o3.A0B(c51906Mwo, 0);
        boolean z = c51906Mwo.A0S;
        ((C54768OIf) this.A0I.getValue()).A00(z);
        if (z) {
            View view = this.A04;
            C14360o3.A06(view);
            view.setVisibility(AbstractC167007dF.A05(c51906Mwo.A0U ? 1 : 0));
            TextView textView = this.A07;
            C14360o3.A06(textView);
            textView.setVisibility(AbstractC167007dF.A05(c51906Mwo.A0Y ? 1 : 0));
            IgImageView igImageView = this.A0D;
            C14360o3.A06(igImageView);
            igImageView.setVisibility(AbstractC167007dF.A05(c51906Mwo.A0P ? 1 : 0));
            if (c51906Mwo.A0Q) {
                igImageView.setImageDrawable(this.A03);
                str = this.A0G;
            } else {
                igImageView.setImageDrawable(this.A02);
                str = this.A0H;
            }
            igImageView.setContentDescription(str);
            String str3 = c51906Mwo.A0F;
            TextView textView2 = this.A06;
            if (str3 != null) {
                textView2.setText(str3);
                i = 0;
            } else {
                C14360o3.A06(textView2);
                i = 8;
            }
            textView2.setVisibility(i);
            ImageUrl imageUrl = c51906Mwo.A06;
            String str4 = c51906Mwo.A0I;
            if (!AbstractC81033jX.A03(imageUrl) && imageUrl != null) {
                CircularImageView circularImageView = this.A0C;
                circularImageView.setUrl(imageUrl, this.A0A);
                circularImageView.setVisibility(0);
                circularImageView.setContentDescription(str4);
            } else {
                CircularImageView circularImageView2 = this.A0C;
                C14360o3.A06(circularImageView2);
                circularImageView2.setVisibility(8);
            }
            TextView textView3 = this.A08;
            if (str4 != null) {
                textView3.setText(str4);
                i2 = 0;
            } else {
                C14360o3.A06(textView3);
                i2 = 8;
            }
            textView3.setVisibility(i2);
            String str5 = c51906Mwo.A0B;
            if (str5 != null && (str2 = c51906Mwo.A0C) != null) {
                UserSession userSession = this.A0B;
                C105154oV c105154oV = this.A0E;
                C92594Ct.A05(userSession, null, c105154oV, new C92584Cs(null, null, str5, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, false, false, true, true, true, false, false, false));
                TextView textView4 = c105154oV.A03;
                if (textView4 != null) {
                    textView4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    textView4.setSelected(true);
                    textView4.setHorizontallyScrolling(true);
                    textView4.setHorizontalFadingEdgeEnabled(true);
                    textView4.setMarqueeRepeatLimit(-1);
                }
                TextView textView5 = c105154oV.A03;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                    return;
                }
                return;
            }
            AbstractC167007dF.A0x(this.A0E.A03);
        }
    }

    public PCI(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, O50 o50) {
        this.A05 = view;
        this.A0A = interfaceC11380iw;
        this.A0B = userSession;
        this.A0F = o50;
        this.A09 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.player_controls_top);
        this.A07 = AbstractC166987dD.A0e(view, R.id.cowatch_remove_button);
        this.A08 = AbstractC166987dD.A0e(view, R.id.cowatch_attribution_username);
        this.A0C = (CircularImageView) view.findViewById(R.id.cowatch_attribution_avatar);
        this.A0E = new C105154oV(AbstractC25230BEn.A0Q(view, R.id.music_attribution_label), false);
        this.A06 = AbstractC166987dD.A0e(view, R.id.cowatch_content_source);
        this.A04 = view.findViewById(R.id.cowatch_options_button);
        this.A0D = AbstractC31172DnG.A0a(view, R.id.cowatch_audio_button);
        Context context = view.getContext();
        this.A03 = context.getDrawable(R.drawable.instagram_volume_outline_44);
        this.A02 = context.getDrawable(R.drawable.instagram_volume_off_outline_44);
        this.A0G = AbstractC166997dE.A0p(context, 2131956902);
        this.A0H = AbstractC166997dE.A0p(context, 2131956903);
        this.A0I = C57520Pfu.A00(this, 12);
    }
}
