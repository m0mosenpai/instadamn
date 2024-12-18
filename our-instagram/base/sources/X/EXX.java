package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class EXX extends AbstractC66412zI {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final C32233EHr A02;
    public final InterfaceC16610sE A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.edit_channels_channel_item, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(14));
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        constraintLayout.setBackgroundColor(this.A00);
        E3T e3t = new E3T(constraintLayout);
        AbstractC13880nE.A0o(e3t.A00, e3t.A03, R.dimen.account_discovery_bottom_gap);
        return e3t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        CheckBox checkBox;
        Integer num;
        Integer num2;
        C26172Bhx c26172Bhx = (C26172Bhx) interfaceC66482zP;
        E3T e3t = (E3T) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c26172Bhx, e3t);
        ImageUrl imageUrl = c26172Bhx.A01;
        C35744Fqc c35744Fqc = null;
        boolean z = true;
        if (imageUrl != null) {
            ImageUrl imageUrl2 = c26172Bhx.A02;
            if (imageUrl2 != null || ((num2 = c26172Bhx.A04) != null && C4GR.A01(num2.intValue()) == A1R)) {
                e3t.A05.A0G(null, this.A01, imageUrl, imageUrl2);
            } else {
                e3t.A05.A0F(null, this.A01, imageUrl);
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView = e3t.A05;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        ConstraintLayout constraintLayout = e3t.A03;
        Context context = constraintLayout.getContext();
        boolean z2 = c26172Bhx.A09;
        Resources resources = context.getResources();
        if (z2) {
            AbstractC13880nE.A0e(gradientSpinnerAvatarView, resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
            checkBox = e3t.A00;
            checkBox.setVisibility(0);
            boolean z3 = c26172Bhx.A0B;
            IgSimpleImageView igSimpleImageView = e3t.A04;
            if (z3) {
                igSimpleImageView.setVisibility(0);
            } else {
                igSimpleImageView.setVisibility(8);
            }
            checkBox.setOnCheckedChangeListener(null);
            checkBox.setChecked(z3);
            c35744Fqc = new C35744Fqc(A1R ? 1 : 0, e3t, this, c26172Bhx);
        } else {
            AbstractC13880nE.A0e(gradientSpinnerAvatarView, AbstractC166997dE.A05(resources));
            checkBox = e3t.A00;
            checkBox.setVisibility(8);
            e3t.A04.setVisibility(8);
        }
        checkBox.setOnCheckedChangeListener(c35744Fqc);
        C44O c44o = c26172Bhx.A00;
        if ((c44o == null || c44o.AdZ() != 2) && ((num = c26172Bhx.A04) == null || C4GR.A02(num.intValue()) != A1R)) {
            z = false;
        }
        TextView textView = e3t.A01;
        String str = c26172Bhx.A06;
        String str2 = str;
        if (z) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
            FVH.A01(AbstractC166997dE.A0L(textView), A0H, false, A1R, false);
            str2 = A0H;
        }
        AbstractC31171DnF.A15(textView, str2);
        e3t.A02.setText(c26172Bhx.A07);
        if (this.A02 != null) {
            ViewOnClickListenerC35683FpI.A00(constraintLayout, 46, c26172Bhx, this);
        }
    }

    public EXX(InterfaceC11380iw interfaceC11380iw, C32233EHr c32233EHr, InterfaceC16610sE interfaceC16610sE, int i) {
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC16610sE;
        this.A02 = c32233EHr;
        this.A00 = i;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C26172Bhx.class;
    }
}
