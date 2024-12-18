package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Dzc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31870Dzc extends C2UU {
    public final EIx A00;
    public final List A01;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        Drawable drawable;
        C14360o3.A0B(c3oo, 0);
        C31992E3u c31992E3u = (C31992E3u) c3oo;
        FNA fna = (FNA) this.A01.get(i);
        C14360o3.A0B(fna, 0);
        IgLinearLayout igLinearLayout = c31992E3u.A03;
        C31870Dzc c31870Dzc = c31992E3u.A08;
        ViewOnClickListenerC35687FpM.A00(igLinearLayout, 56, fna, c31870Dzc);
        IgSimpleImageView igSimpleImageView = c31992E3u.A04;
        igSimpleImageView.setImageDrawable(fna.A02);
        IgTextView igTextView = c31992E3u.A07;
        AbstractC56952jT.A01(igTextView);
        igTextView.setText(fna.A04);
        IgTextView igTextView2 = c31992E3u.A06;
        igTextView2.setText(fna.A00);
        String str = fna.A00;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            i2 = 8;
        }
        igTextView2.setVisibility(i2);
        if (fna.A03 == EnumC33412Epj.A06) {
            ViewOnClickListenerC35689FpO.A01(igTextView2, 33, c31870Dzc);
        } else {
            igTextView2.setCompoundDrawables(null, null, null, null);
        }
        IgSimpleImageView igSimpleImageView2 = c31992E3u.A05;
        if (fna.A01) {
            drawable = c31992E3u.A00;
        } else {
            drawable = c31992E3u.A01;
        }
        igSimpleImageView2.setImageDrawable(drawable);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        Context context = c31992E3u.A02.getContext();
        layoutParams.width = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        igSimpleImageView.getLayoutParams().height = AbstractC166997dE.A04(context, R.dimen.abc_alert_dialog_button_dimen);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31992E3u(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.birthday_effects_audience_item, false), this);
    }

    public C31870Dzc(EIx eIx, List list) {
        this.A00 = eIx;
        this.A01 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1487673881);
        int size = this.A01.size();
        C0f9.A0A(-239255023, A03);
        return size;
    }
}
