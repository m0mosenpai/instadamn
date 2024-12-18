package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class G5D implements C7QD {
    public final Drawable A00;
    public final LayoutInflater A01;
    public final View A02;
    public final ViewGroup A03;
    public final IgLinearLayout A04;
    public final IgLinearLayout A05;
    public final IgTextView A06;
    public final IgTextView A07;

    public G5D(LayoutInflater layoutInflater, IgLinearLayout igLinearLayout) {
        C14360o3.A0B(igLinearLayout, 1);
        this.A05 = igLinearLayout;
        this.A01 = layoutInflater;
        this.A07 = AbstractC25231BEo.A0d(igLinearLayout, R.id.title_text);
        this.A06 = AbstractC25231BEo.A0d(igLinearLayout, R.id.subtitle_text);
        this.A02 = AbstractC166997dE.A0S(igLinearLayout, R.id.title_separator);
        this.A03 = AbstractC31176DnK.A0C(igLinearLayout, R.id.subitem_list_layout);
        this.A04 = (IgLinearLayout) AbstractC166997dE.A0R(igLinearLayout, R.id.cta_button_list_layout);
        this.A00 = AbstractC162807Qr.A00();
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A05;
    }
}
