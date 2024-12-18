package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.NFb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52363NFb extends IgLinearLayout {
    public View.OnClickListener A00;
    public boolean A01;
    public boolean A02;
    public final TextView A03;
    public final TextView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final UserSession A07;
    public final C3PF A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52363NFb(Context context, UserSession userSession, Integer num, int i) {
        super(context, null, 0);
        TextView textView;
        int i2;
        C14360o3.A0B(num, 5);
        this.A07 = userSession;
        setOrientation(1);
        Context context2 = getContext();
        View.inflate(context2, R.layout.music_tray_item_layout, this);
        this.A04 = AbstractC166997dE.A0T(this, R.id.audio_title);
        this.A03 = AbstractC166997dE.A0T(this, R.id.audio_subtitle);
        ImageView A0I = AbstractC31173DnH.A0I(this, R.id.audio_image);
        this.A05 = A0I;
        this.A06 = AbstractC31173DnH.A0I(this, R.id.audio_selected_icon);
        boolean z = num == C05F.A01;
        this.A09 = z;
        if (z) {
            TextView textView2 = this.A04;
            textView2.setTextAppearance(R.style.igds_emphasized_body_2);
            AbstractC31177DnL.A0z(textView2, context2);
            textView = this.A03;
            i2 = R.style.PrivacyTextStyle;
        } else {
            TextView textView3 = this.A04;
            textView3.setTextAppearance(R.style.PrivacyTextStyle);
            AbstractC166987dD.A1O(context2, textView3, R.color.audio_bar_action_color_enabled);
            textView = this.A03;
            i2 = R.style.igds_emphasized_body_2;
        }
        textView.setTextAppearance(i2);
        AbstractC13880nE.A0W(A0I, i);
        AbstractC13880nE.A0g(A0I, i);
        C3P9 A0s = AbstractC166987dD.A0s(A0I);
        A0s.A04 = new C52374NFq(this, 20);
        A0s.A02 = 0.92f;
        A0s.A07 = false;
        this.A08 = A0s.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (X.AbstractC43840Ja3.A00(r3.A07) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.graphics.drawable.Drawable r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            android.content.Context r2 = X.AbstractC166997dE.A0L(r3)
            boolean r0 = r3.A09
            if (r0 == 0) goto L15
            com.instagram.common.session.UserSession r0 = r3.A07
            boolean r1 = X.AbstractC43840Ja3.A00(r0)
            r0 = 1
            if (r1 == 0) goto L16
        L15:
            r0 = 0
        L16:
            X.Ma6 r1 = new X.Ma6
            r1.<init>(r2, r4, r0)
            boolean r0 = r3.A01
            r1.A00 = r0
            r1.A00 = r5
            android.widget.ImageView r0 = r3.A05
            r0.setImageDrawable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52363NFb.A00(android.graphics.drawable.Drawable, boolean):void");
    }

    public final void setSubtitle(String str) {
        C14360o3.A0B(str, 0);
        this.A03.setText(str);
    }

    public final void setTalkback(String str) {
        C14360o3.A0B(str, 0);
        this.A05.setContentDescription(str);
    }

    public final void setTitle(String str) {
        C14360o3.A0B(str, 0);
        this.A04.setText(str);
    }

    public final View.OnClickListener getItemOnClickListener() {
        return this.A00;
    }

    public final boolean getItemSelected() {
        return this.A02;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A02 = z;
        this.A05.setSelected(z);
        this.A04.setSelected(z);
        this.A03.setSelected(z);
        if (this.A09) {
            this.A06.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    public final void setItemHighlightable(boolean z) {
        this.A01 = z;
    }

    public final void setItemOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public final void setItemSelected(boolean z) {
        this.A02 = z;
    }
}
