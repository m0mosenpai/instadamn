package X;

import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes11.dex */
public final class VC3 extends AbstractC70953Wkz {
    public final Boolean A00;
    public final CharSequence A01;
    public final CharSequence A02;

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
        V8J v8j = (V8J) abstractC117215Sg;
        C14360o3.A0B(v8j, 0);
        CharSequence charSequence = this.A02;
        if (charSequence.length() > 0) {
            v8j.A01.setText(charSequence);
        }
        CharSequence charSequence2 = this.A01;
        if (charSequence2.length() > 0) {
            TextView textView = v8j.A00;
            textView.setText(charSequence2);
            if (AbstractC166997dE.A1Z(this.A00, true)) {
                AbstractC166987dD.A1O(textView.getContext(), textView, R.color.design_dark_default_color_on_background);
                IgSimpleImageView igSimpleImageView = v8j.A02;
                if (igSimpleImageView != null) {
                    AbstractC31173DnH.A11(igSimpleImageView.getContext(), igSimpleImageView, R.color.design_dark_default_color_on_background);
                }
            }
        }
    }

    public VC3(Boolean bool, CharSequence charSequence, CharSequence charSequence2) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = bool;
    }
}
